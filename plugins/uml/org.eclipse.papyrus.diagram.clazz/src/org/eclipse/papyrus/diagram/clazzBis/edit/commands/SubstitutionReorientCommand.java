package org.eclipse.papyrus.diagram.clazzBis.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Substitution;

/**
 * @generated
 */
public class SubstitutionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public SubstitutionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Substitution) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Classifier && newEnd instanceof Classifier)) {
			return false;
		}
		Classifier target = getLink().getContract();
		if (!(getLink().eContainer() instanceof Classifier)) {
			return false;
		}
		Classifier container = (Classifier) getLink().eContainer();
		return org.eclipse.papyrus.diagram.clazzBis.edit.policies.UMLBaseItemSemanticEditPolicy.LinkConstraints.canExistSubstitution_3007(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Classifier && newEnd instanceof Classifier)) {
			return false;
		}
		Classifier source = getLink().getSubstitutingClassifier();
		if (!(getLink().eContainer() instanceof Classifier)) {
			return false;
		}
		Classifier container = (Classifier) getLink().eContainer();
		return org.eclipse.papyrus.diagram.clazzBis.edit.policies.UMLBaseItemSemanticEditPolicy.LinkConstraints.canExistSubstitution_3007(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSubstitutingClassifier(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setContract(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Substitution getLink() {
		return (Substitution) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Classifier getOldSource() {
		return (Classifier) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Classifier getNewSource() {
		return (Classifier) newEnd;
	}

	/**
	 * @generated
	 */
	protected Classifier getOldTarget() {
		return (Classifier) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Classifier getNewTarget() {
		return (Classifier) newEnd;
	}
}
