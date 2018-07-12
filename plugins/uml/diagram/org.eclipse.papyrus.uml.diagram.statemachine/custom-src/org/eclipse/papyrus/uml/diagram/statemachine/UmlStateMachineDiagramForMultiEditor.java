/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *  Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Bug 496905
 */
package org.eclipse.papyrus.uml.diagram.statemachine;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.papyrus.infra.core.editor.BackboneException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.internationalization.utils.utils.LabelInternationalization;
import org.eclipse.papyrus.uml.diagram.common.listeners.DropTargetListener;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.util.FixNestedStateAndRegionOnOpening;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramEditor;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

/**
 * Editor used in multitabs editor.
 *
 * @author Emilien Perico
 *
 */
public class UmlStateMachineDiagramForMultiEditor extends UMLDiagramEditor {
	/**
	 * The location of diagram icon in the plug-in
	 */
	private static final String DIAG_IMG_PATH = "icons/obj16/Diagram_StateMachine.gif";
	/**
	 * The image descriptor of the diagram icon
	 */
	private static final ImageDescriptor DIAG_IMG_DESC = UMLDiagramEditorPlugin.getBundledImageDescriptor(UmlStateMachineDiagramForMultiEditor.DIAG_IMG_PATH);
	/** The editor splitter. */
	private Composite splitter;
	private Image titleImage;

	/**
	 * Constructor for SashSystem v2. Context and required objects are retrieved
	 * from the ServiceRegistry.
	 *
	 * @throws BackboneException
	 * @throws ServiceException
	 *
	 */
	public UmlStateMachineDiagramForMultiEditor(ServicesRegistry servicesRegistry, Diagram diagram) throws BackboneException, ServiceException {
		super(servicesRegistry, diagram);
		// see bug 401059: remove obsolete compartments from states
		new FixNestedStateAndRegionOnOpening().fix(diagram);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createGraphicalViewer(Composite parent) {
		splitter = parent;
		super.createGraphicalViewer(parent);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getEditingDomainID() {
		return "org.eclipse.papyrus.uml.diagram.statemachine.EditingDomain";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setPartName(LabelInternationalization.getInstance().getDiagramLabel(getDiagram()));
		titleImage = DIAG_IMG_DESC.createImage();
		setTitleImage(titleImage);
	}

	@Override
	public void dispose() {
		if (titleImage != null) {
			titleImage.dispose();
			titleImage = null;
		}
		super.dispose();
	}

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		// Enable Drop
		getDiagramGraphicalViewer().addDropTargetListener(new DropTargetListener(getDiagramGraphicalViewer(), LocalSelectionTransfer.getTransfer()) {
			@Override
			protected Object getJavaObject(TransferData data) {
				return LocalSelectionTransfer.getTransfer().nativeToJava(data);
			}

			@Override
			protected TransactionalEditingDomain getTransactionalEditingDomain() {
				return getEditingDomain();
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFocus() {
		splitter.setFocus();
		super.setFocus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setInput(IEditorInput input) {
		try {
			// Provide an URI with fragment in order to reuse the same Resource
			// and set the diagram to the fragment.
			URIEditorInput uriInput = new URIEditorInput(EcoreUtil.getURI(getDiagram()));
			doSetInput(uriInput, true);
		} catch (CoreException x) {
			String title = "Problem opening";
			String msg = "Cannot open input element:";
			Shell shell = getSite().getShell();
			ErrorDialog.openError(shell, title, msg, x.getStatus());
		}
	}
}
