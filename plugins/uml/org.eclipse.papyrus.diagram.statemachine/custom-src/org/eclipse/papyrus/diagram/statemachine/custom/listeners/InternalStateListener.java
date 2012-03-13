/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 * 
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.statemachine.custom.listeners;

import java.util.Collections;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.papyrus.diagram.common.listeners.AbstractPapyrusModifcationTriggerListener;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.InternalTransitionEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Listen the feature TRANSITION__KIND in order to change the apparence of an internal transition
 * @author adaussy
 *
 */
public class InternalStateListener extends AbstractPapyrusModifcationTriggerListener {

	protected NotificationFilter filter;
	
	@Override
	public NotificationFilter getFilter() {
		if (filter == null){
			filter = NotificationFilter.createFeatureFilter(UMLPackage.Literals.TRANSITION__KIND);
		}
		return filter;
	}

	@Override
	protected CompositeCommand getModificationCommand(Notification notif) {
		Object newValue = notif.getNewValue();
		Object notifier = notif.getNotifier();
		if(newValue instanceof TransitionKind && notifier instanceof EObject) {
			CompositeCommand cc = new CompositeCommand("Modification command triggered by modedication of the kind of the current selected transition");//$NON-NLS-0$
			EObject eNotifier = (EObject)notifier;
			//Handle deletion of the old EditPart
			boolean becomingInternal = isBecomingInternal(notif);
			IGraphicalEditPart availableEditPart = getChildByEObject(eNotifier, getDiagramEditPart(), becomingInternal);
			//If there no current representation nothing has to be done
			if(availableEditPart == null) {
				return null;
			}
			Command deleteCommant = getDeleteCommand(becomingInternal, availableEditPart);
			if(deleteCommant != null && deleteCommant.canExecute()) {
				cc.compose(new CommandProxy(deleteCommant));
			}
			//handle addition of the new EditPart
			 ICommand creationCommaned = getCreationCommand(becomingInternal, eNotifier);
			if(creationCommaned != null && creationCommaned.canExecute()) {
				cc.compose(creationCommaned);
			}
			
			return cc;
		}

		return null;
	}

	/**
	 * Return true if the the current feature indicate that the new value of the feature is {@link TransitionKind#INTERNAL}
	 * 
	 * @param notif
	 * @return
	 */
	protected boolean isBecomingInternal(Notification notif) {
		Object newValue = notif.getNewValue();
		if(newValue instanceof TransitionKind) {
			TransitionKind newKind = (TransitionKind)newValue;
			return TransitionKind.INTERNAL_LITERAL.equals(newKind);
		}
		return false;

	}

	/**
	 * Get the command to delete the old EditPart
	 * 
	 * @param isBecomingInternal
	 *        Boolean true if transition is going to kind X -> Internal
	 * @param availableEditPart
	 *        Existing editpart of the transition
	 * @return
	 */
	private Command getDeleteCommand(boolean isBecomingInternal, IGraphicalEditPart availableEditPart) {
		if(isBecomingInternal) {
			//Get the old transition editpart
			if(!(availableEditPart instanceof TransitionEditPart)) {
				return null;
			}
		} else {
			if(!(availableEditPart instanceof InternalTransitionEditPart)) {
				return null;
			}
		}
		Request request = new GroupRequest(RequestConstants.REQ_DELETE);
		((GroupRequest)request).setEditParts(availableEditPart);
		return availableEditPart.getCommand(request);
	}

	private ICommand getCreationCommand(boolean isBecomingInternal, EObject eNotifier) {
		//		IGraphicalEditPart
		if(eNotifier instanceof Transition) {
			Transition transition = (Transition)eNotifier;
			IGraphicalEditPart dropTarget = null;
			dropTarget = getChildByEObject(transition.getSource(), getDiagramEditPart(), isBecomingInternal);
			if(isBecomingInternal) {
				dropTarget = getChildByEObject(transition.getSource(), getDiagramEditPart(), false);
			} else {
				//get the region
				dropTarget = getChildByEObject(transition.getContainer(), getDiagramEditPart(), false);
				//get the compartment
				dropTarget = dropTarget.getChildBySemanticHint(String.valueOf(RegionCompartmentEditPart.VISUAL_ID));
			}
			if(dropTarget != null) {
				CompositeCommand cc = new CompositeCommand("Add transition drop request command");
				
				Request request = new DropObjectsRequest();
				((DropObjectsRequest)request).setLocation(new Point(1, 1));
				((DropObjectsRequest)request).setObjects(Collections.singletonList(transition));
				Command command = dropTarget.getCommand(request);
				if (command != null){
					cc.compose(new CommandProxy(command));
				}
				/**
				 * Refresh layout
				 */
				ChangeBoundsRequest chReq = new ChangeBoundsRequest(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_REFRESH);
				chReq.setEditParts(dropTarget);
				chReq.setMoveDelta(new Point(0, 0));
				Command cmd3 = dropTarget.getCommand(chReq);
				if(cmd3 != null && cmd3.canExecute()) {
					cc.compose(new CommandProxy(cmd3));
				}
				return cc;
			}
		}
		return null;
	}
}
