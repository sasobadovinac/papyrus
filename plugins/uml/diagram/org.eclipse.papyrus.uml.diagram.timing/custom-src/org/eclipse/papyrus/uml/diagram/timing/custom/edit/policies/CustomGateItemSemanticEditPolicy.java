/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.papyrus.uml.diagram.timing.custom.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.papyrus.uml.diagram.timing.custom.edit.commands.CustomMessageCreateCommand;
import org.eclipse.papyrus.uml.diagram.timing.custom.edit.commands.CustomMessageReorientCommand;
import org.eclipse.papyrus.uml.diagram.timing.custom.utils.MessageUtils;
import org.eclipse.papyrus.uml.diagram.timing.edit.policies.GateItemSemanticEditPolicy;
import org.eclipse.uml2.uml.Gate;

/** Semantic edit policy for {@link Gate}s */
public class CustomGateItemSemanticEditPolicy extends GateItemSemanticEditPolicy {

	/** Handles the "Hide Element" (remove only the view, and keep the semantic element) */
	@Override
	public Command getCommand(final Request request) {
		if (request.getType() == REQ_DELETE) {
			// TODO: delete elements linked to Gate
			// final Command baseCommand = super.getCommand(request);
			// return GateUtils.getHideGateCommand(getHost(), baseCommand);
		}
		return super.getCommand(request);
	}

	@Override
	protected Command getCreateRelationshipCommand(final CreateRelationshipRequest req) {
		final IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return null;
		}
		if (MessageUtils.isMessage(requestElementType)) {
			return getGEFWrapper(new CustomMessageCreateCommand(req));
		}
		return super.getCreateRelationshipCommand(req);
	}

	@Override
	protected Command getReorientRelationshipCommand(final ReorientRelationshipRequest req) {
		return new ICommandProxy(new CustomMessageReorientCommand(req, getHost().getViewer()));
	}
}
