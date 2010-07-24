/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.diagram.profile.custom.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.core.listenerservice.IPapyrusListener;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.papyrus.diagram.common.Activator;
import org.eclipse.papyrus.diagram.profile.custom.helper.ExtensionHelper;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This EditPolicy change the Extension's name and ExtensionEnd's name when the extended stereotype's name is changed.
 * 
 * 
 */


public class ExtensionCustomNameEditPolicy extends AbstractEditPolicy implements NotificationListener, IPapyrusListener {

	/** constant for this edit policy role */
	public final static String SPECIFIC_EXTENSION_NAME_POLICY = "SpecificExtensionNameEditPolicy"; //$NON-NLS-1$

	public final static int CHANGE_NAME_OF_A_STEREOTYPE = Notification.SET;

	/** stores the host associated semantic element */
	protected EObject hostSemanticElement;

	public ExtensionCustomNameEditPolicy() {
		super();
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void activate() {
		View view = (View)getHost().getModel();
		hostSemanticElement = view.getElement();
		//	getDiagramEventBroker().addNotificationListener(view, this);
		//	getDiagramEventBroker().addNotificationListener(hostSemanticElement, this);
		if(hostSemanticElement instanceof Extension) {
			Stereotype stereotype = ((Extension)hostSemanticElement).getStereotype();
			getDiagramEventBroker().addNotificationListener(stereotype, this);
		}
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void deactivate() {
		if(hostSemanticElement instanceof Extension) {
			Stereotype stereotype = ((Extension)hostSemanticElement).getStereotype();
			getDiagramEventBroker().removeNotificationListener(stereotype, this);
			hostSemanticElement = null;
		}
	}

	/**
	 * Gets the diagram event broker from the editing domain.
	 * 
	 * @return the diagram event broker
	 */
	private DiagramEventBroker getDiagramEventBroker() {
		TransactionalEditingDomain theEditingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
		if(theEditingDomain != null) {
			return DiagramEventBroker.getInstance(theEditingDomain);
		}
		return null;
	}

	/**
	 * 
	 * {@inheritedDoc}
	 */
	//@Override
	public void notifyChanged(Notification notification) {
		// change the label of the figure managed by the host edit part (managed by the parent edit
		// part in general...)
		// it must be changed only if:
		// - a stereotype's name have changed
		final int eventType = notification.getEventType();
		if(eventType == CHANGE_NAME_OF_A_STEREOTYPE) {
			if(hostSemanticElement instanceof Extension) {
				if(((Extension)hostSemanticElement).getStereotype() instanceof Stereotype) {

					//	final TransactionalEditingDomain domain = ((GraphicalEditPart)getHost()).getEditingDomain();
					final TransactionalEditingDomain domain = EditorUtils.getTransactionalEditingDomain();//((GraphicalEditPart)getHost()).getEditingDomain();
					try {

						((IGraphicalEditPart)getHost()).getEditingDomain().runExclusive(new Runnable() {

							public void run() {

								Display.getCurrent().asyncExec(new Runnable() {

									public void run() {
										String oldName = ((Extension)hostSemanticElement).getName();
										String deducedName = ExtensionHelper.deduceExtensionNameFromProperties(((Extension)hostSemanticElement));

										CompositeCommand cc = new CompositeCommand("Change Extension Name"); //$NON-NLS-1$
										Extension ext = ((Extension)hostSemanticElement);
										Stereotype ste = ((Extension)hostSemanticElement).getStereotype();
										String newName = ExtensionHelper.EXTENSION + ste.getName();

										//Command to change the Extension's name
										//only if the used doesn't have modify its name
										if(oldName.equals(deducedName)) {
											SetRequest setRequestExt = new SetRequest(domain, ext, UMLPackage.eINSTANCE.getNamedElement_Name(), newName);
											SetValueCommand setValueCommandExt = new SetValueCommand(setRequestExt);
											cc.add(setValueCommandExt);
										}
										//command to change the ExtensionEnd's name 

										//There is only ONE ExtensionEnd
										ExtensionEnd extEnd = (ExtensionEnd)((Extension)hostSemanticElement).getOwnedEnds().get(0);
										SetRequest setRequestExtEnd = new SetRequest(domain, extEnd, UMLPackage.eINSTANCE.getNamedElement_Name(), newName.replaceFirst("E", "e")); //$NON-NLS-1$ //$NON-NLS-2$
										SetValueCommand setValueCommandExtEnd = new SetValueCommand(setRequestExtEnd);
										cc.add(setValueCommandExtEnd);
										((IGraphicalEditPart)getHost()).getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
									}
								});
							}
						});

					} catch (Exception e) {
						Activator.log.error(e);
					}

				}

			}
		}


	}
}
