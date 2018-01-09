/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.service.types.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Namespace;

public class ConstraintContextCreateCommand extends EditElementCommand {

	protected final EObject source;

	protected final EObject target;

	public ConstraintContextCreateCommand(CreateRelationshipRequest request) {
		super(request.getLabel(), null, request);
		this.source = request.getSource();
		this.target = request.getTarget();
	}

	@Override
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && !(source instanceof Constraint)) {
			return false;
		}
		if (target != null && !(target instanceof Namespace)) {
			return false;
		}
		if (getSource() == null) {
			return true;
		}
		return true;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		if (getSource() != null && getTarget() != null) {
			getSource().setContext(getTarget());
		}
		return CommandResult.newOKCommandResult();
	}

	@Override
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	protected Constraint getSource() {
		return (Constraint) source;
	}

	protected Namespace getTarget() {
		return (Namespace) target;
	}
}
