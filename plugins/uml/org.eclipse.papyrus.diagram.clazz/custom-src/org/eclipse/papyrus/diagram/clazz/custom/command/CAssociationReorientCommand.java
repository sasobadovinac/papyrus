package org.eclipse.papyrus.diagram.clazz.custom.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.papyrus.diagram.clazz.edit.commands.AssociationReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.papyrus.diagram.common.helper.AssociationHelper;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;

public class CAssociationReorientCommand extends AssociationReorientCommand {

	protected EObject newEnd;

	protected EObject oldEnd;

	protected int reorientDirection;

	public CAssociationReorientCommand(ReorientRelationshipRequest request) {
		super(request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Type && newEnd instanceof Type)) {
			return false;
		}
		// if (getLink().getEndTypes().size() != 1) {
		if (getLink().getEndTypes().size() == 1) {
			return false;
		}
		Type target = (Type) getLink().getEndTypes().get(0);
		if (!(getLink().eContainer() instanceof Package)) {
			return false;
		}
		Package container = (Package) getLink().eContainer();
		return UMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistAssociation_4001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Type && newEnd instanceof Type)) {
			return false;
		}

		// if (getLink().getEndTypes().size() != 1) {
		if (getLink().getEndTypes().size() == 1) {
			return false;
		}
		Type source = (Type) getLink().getEndTypes().get(0);
		if (!(getLink().eContainer() instanceof Package)) {
			return false;
		}
		Package container = (Package) getLink().eContainer();
		return UMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistAssociation_4001(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		return AssociationHelper.reconnect(AssociationHelper.source, getLink(), getNewSource());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		return AssociationHelper.reconnect(AssociationHelper.target, getLink(), getNewTarget());

	}

}
