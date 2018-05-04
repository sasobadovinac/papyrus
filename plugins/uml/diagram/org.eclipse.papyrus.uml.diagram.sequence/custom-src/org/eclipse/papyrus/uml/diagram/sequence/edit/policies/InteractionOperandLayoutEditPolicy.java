/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.edit.policies;

import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.papyrus.infra.services.edit.utils.RequestParameterConstants;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionOperandGuardEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes;

/**
 * The custom LayoutEditPolicy for InteractionOperandEditPart.
 * this class has been customized to prevent the strange feedback of lifeline during the move
 *
 */
public class InteractionOperandLayoutEditPolicy extends XYLayoutEditPolicy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		EditPolicy result = super.createChildEditPolicy(child);
		if (result == null) {
			return new ResizableShapeEditPolicy();
		}
		return result;
	}

	/**
	 * Handle create InteractionOperand hover InteractionOperand {@inheritDoc}
	 */
	@Override
	public Command getCommand(Request request) {
		EditPart combinedFragmentCompartment = getHost().getParent();
		if (combinedFragmentCompartment == null) {
			return null;
		}
		EditPart combinedFragment = combinedFragmentCompartment.getParent();
		EditPart interactionCompartment = combinedFragment.getParent();
		if (REQ_CREATE.equals(request.getType()) && request instanceof CreateUnspecifiedTypeRequest) {
			if (UMLElementTypes.InteractionOperand_Shape.equals(((CreateUnspecifiedTypeRequest) request).getElementTypes().get(0))) {
				Map<? super String, Object> extendedData = request.getExtendedData();
				int hostIndex = combinedFragmentCompartment.getChildren().indexOf(getHost());
				extendedData.put(RequestParameterConstants.INSERT_AT, hostIndex + 1); // Insert after the target
				return combinedFragmentCompartment.getCommand(request);
			} else if (UMLElementTypes.CombinedFragment_Shape.equals(((CreateUnspecifiedTypeRequest) request).getElementTypes().get(0))) {
				// Fixed bug about creating on InteractionOperand. (executed Twice).
				// return interactionCompartment.getCommand(request);
			} else if (UMLElementTypes.Lifeline_Shape.equals(((CreateUnspecifiedTypeRequest) request).getElementTypes().get(0))) {
				return interactionCompartment.getCommand(request);
			}
		} else if (request instanceof CreateConnectionViewAndElementRequest) {
			CreateConnectionRequest createConnectionRequest = (CreateConnectionRequest) request;
			if (getHost().equals(createConnectionRequest.getSourceEditPart())) {
				createConnectionRequest.setSourceEditPart(combinedFragment);
			}
			if (getHost().equals(createConnectionRequest.getTargetEditPart())) {
				createConnectionRequest.setTargetEditPart(combinedFragment);
			}
			return combinedFragment.getCommand(request);
		} else if (request instanceof CreateViewAndElementRequest) {
			// FIXME If necessary
			// Update Bounds and Guides.
			return getCreateCommand((CreateViewAndElementRequest) request);
		} else if (REQ_RESIZE_CHILDREN.equals(request.getType())) {
			return interactionCompartment.getCommand(request);
		}
		return super.getCommand(request);
	}

	// /**
	// * Handle combined fragment resize
	// */
	// @Override
	// protected Command getResizeChildrenCommand(ChangeBoundsRequest request) {
	// CompoundCommand compoundCmd = new CompoundCommand();
	// compoundCmd.setLabel("Move or Resize");
	//
	// for(Object o : request.getEditParts()) {
	// GraphicalEditPart child = (GraphicalEditPart)o;
	// Object constraintFor = getConstraintFor(request, child);
	// if(constraintFor != null) {
	// if(child instanceof CombinedFragmentEditPart) {
	// Command resizeChildrenCommand = InteractionCompartmentXYLayoutEditPolicy.getCombinedFragmentResizeChildrenCommand(request, (CombinedFragmentEditPart)child);
	// if(resizeChildrenCommand != null && resizeChildrenCommand.canExecute()) {
	// compoundCmd.add(resizeChildrenCommand);
	// }
	// }
	//
	// Command changeConstraintCommand = createChangeConstraintCommand(request, child, translateToModelConstraint(constraintFor));
	// compoundCmd.add(changeConstraintCommand);
	// }
	// }
	// if(compoundCmd.isEmpty()) {
	// return null;
	// }
	// return compoundCmd.unwrap();
	// }

	@Override
	protected Command getOrphanChildrenCommand(Request request) {
		// Do NOT allow orphan Guard.
		if (request instanceof GroupRequest) {
			List editParts = ((GroupRequest) request).getEditParts();
			for (Object object : editParts) {
				if (object instanceof InteractionOperandGuardEditPart) {
					return UnexecutableCommand.INSTANCE;
				}
			}
		}
		return super.getOrphanChildrenCommand(request);
	}

	/**
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createAddCommand(org.eclipse.gef.requests.ChangeBoundsRequest, org.eclipse.gef.EditPart, java.lang.Object)
	 *
	 * @param request
	 * @param child
	 * @param constraint
	 * @return
	 */
	@Override
	protected Command createAddCommand(ChangeBoundsRequest request, EditPart child, Object constraint) {
		if (child instanceof LifelineEditPart) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.createAddCommand(request, child, constraint);
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#showTargetFeedback(org.eclipse.gef.Request)
	 *
	 * @param request
	 */
	@Override
	public void showTargetFeedback(Request request) {
		if (request instanceof ChangeBoundsRequest) {
			ChangeBoundsRequest changeBoundsRequest = (ChangeBoundsRequest) request;

			if (changeBoundsRequest.getEditParts().get(0) instanceof LifelineEditPart) {
				changeBoundsRequest.setMoveDelta(new Point(changeBoundsRequest.getMoveDelta().x, 0));
			}
		}
		super.showTargetFeedback(request);
	}
}
