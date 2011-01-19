/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.multidiagram.actionbarcontributor;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.core.extension.commands.CreationCommandDescriptor;
import org.eclipse.papyrus.core.navigation.NavigableElement;
import org.eclipse.papyrus.core.navigation.NavigationHelper;
import org.eclipse.papyrus.core.utils.DiResourceSet;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.papyrus.core.utils.GMFtoEMFCommandWrapper;
import org.eclipse.ui.IEditorPart;

/**
 * This action will try to create a diagram on the currently selected element,
 * using navigation if necessary.
 * The action is always available and the check is done in the run
 * to avoid heavy navigation computation on each selection change.
 * 
 * @author mvelten
 * 
 */
public class ActionBarCreateDiagramAction extends Action {

	private CreationCommandDescriptor desc;

	private IEditorPart activeEditor = null;

	public ActionBarCreateDiagramAction(CreationCommandDescriptor desc) {
		super(desc.getLabel());
		this.desc = desc;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return desc.getIcon();
	}

	@Override
	public String getText() {
		return desc.getLabel();
	}

	@Override
	public String getToolTipText() {
		return getText();
	}

	public void setActiveEditor(IEditorPart editor) {
		activeEditor = editor;
	}

	@Override
	public void run() {
		EObject selectedElement = getSelectedElement();

		if(selectedElement != null) {
			// This is not necessary but it avoids to compute the whole navigation graph
			// if the selected element is ok
			if(desc.getCondition().create(selectedElement)) {
				createDiagram(selectedElement);
			} else {
				List<NavigableElement> navElements = NavigationHelper.getInstance().getAllNavigableElements(selectedElement);
				// this will sort by depth so existing elements come first
				Collections.sort(navElements);

				for(NavigableElement navElement : navElements) {
					if(desc.getCondition().create(navElement.getElement())) {
						createDiagram(navElement);
						break;
					}
				}
			}
		}
	}

	private void createDiagram(NavigableElement navElement) {
		DiResourceSet diResourceSet = EditorUtils.getDiResourceSet();

		if(navElement != null && diResourceSet != null) {
			try {
				CompositeCommand command = NavigationHelper.getLinkCreateAndOpenNavigableDiagramCommand(navElement, desc.getCommand(), null, diResourceSet);
				diResourceSet.getTransactionalEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
			} catch (Exception e) {
			}
		}
	}

	private void createDiagram(EObject element) {
		DiResourceSet diResourceSet = EditorUtils.getDiResourceSet();

		if(element != null && diResourceSet != null) {
			try {
				desc.getCommand().createDiagram(diResourceSet, element, null);
			} catch (Exception e) {
			}
		}
	}

	private EObject getSelectedElement() {
		if(activeEditor != null) {
			ISelection selection = activeEditor.getEditorSite().getSelectionProvider().getSelection();
			if(selection instanceof IStructuredSelection) {
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				return resolveSemanticObject(obj);

			}
		}
		return null;
	}

	/**
	 * Resolve semantic element
	 * 
	 * @param object
	 *        the object to resolve
	 * @return <code>null</code> or the semantic element associated to the
	 *         specified object
	 */
	protected EObject resolveSemanticObject(Object object) {
		if(object instanceof EObject) {
			return (EObject)object;
		} else if(object instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable)object;
			if(adaptable.getAdapter(EObject.class) != null) {
				return (EObject)adaptable.getAdapter(EObject.class);
			}
		}
		return null;
	}

}
