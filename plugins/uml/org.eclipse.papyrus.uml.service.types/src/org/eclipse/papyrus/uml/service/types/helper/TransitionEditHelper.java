/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.IdentityCommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;

public class TransitionEditHelper extends ElementEditHelper {

	protected boolean canCreate(EObject source, EObject target) {
		if (false == source instanceof Vertex) {
			return false;
		}
		if (target == null) {
			return true;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ICommand getCreateRelationshipCommand(CreateRelationshipRequest req) {
		EObject source = req.getSource();
		EObject target = req.getTarget();
		if (false == source instanceof Vertex) {
			return UnexecutableCommand.INSTANCE;
		}
		if (target == null) {
			return IdentityCommand.INSTANCE;
		}
		if (false == target instanceof Vertex) {
			return UnexecutableCommand.INSTANCE;
		}

		setContainerAndFeature(req, (Vertex) source);
		return super.getCreateRelationshipCommand(req);
	}

	private void setContainerAndFeature(CreateRelationshipRequest req, Vertex vertex) {
		req.setContainer(vertex.getContainer());
		req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Transition());
	}


	@Override
	protected ICommand getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return new ReorientTransitionCommand(req);
	}

	private static class ReorientTransitionCommand extends EditElementCommand {

		private final EObject myNewEnd;

		private final int myReorientDirection;

		protected ReorientTransitionCommand(ReorientRelationshipRequest req) {
			super("Reorient Transition Command", (EObject) req.getRelationship(), req); ////$NON-NLS-1$
			myNewEnd = req.getNewRelationshipEnd();
			myReorientDirection = req.getDirection();
		}

		@Override
		public boolean canExecute() {
			if (false == myNewEnd instanceof Vertex) {
				return false;
			}
			if (false == getElementToEdit() instanceof Transition) {
				return false;
			}
			if (myReorientDirection != ReorientRelationshipRequest.REORIENT_SOURCE && myReorientDirection != ReorientRelationshipRequest.REORIENT_TARGET) {
				return false;
			}
			return super.canExecute();
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			Transition link = (Transition) getElementToEdit();
			Vertex newLinkEnd = (Vertex) myNewEnd;
			if (myReorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
				link.setSource(newLinkEnd);
			} else if (myReorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
				link.setTarget(newLinkEnd);
			} else {
				return CommandResult.newErrorCommandResult("Wrong direction");
			}
			return CommandResult.newOKCommandResult();
		}
	}
}
