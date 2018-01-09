/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.service.types.helper.advice;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.IdentityCommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.GetEditContextCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.papyrus.uml.service.types.command.CommentAnnotatedElementsCreateCommand;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

public class CommentAnnotatedElementsEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getBeforeEditContextCommand(final GetEditContextRequest request) {

		GetEditContextCommand command = new GetEditContextCommand(request);
		command.setEditContext(request.getEditHelperContext());
		return command;
	}

	protected boolean canCreate(EObject source, EObject target) {
		if ((source != null) && !(source instanceof Comment)) {
			return false;
		}

		if ((target != null) && !(target instanceof Element)) {
			return false;
		}

		return true;
	}

	@Override
	protected ICommand getBeforeCreateRelationshipCommand(CreateRelationshipRequest request) {

		EObject source = request.getSource();
		EObject target = request.getTarget();
			
		boolean noSourceOrTarget = (source == null || target == null);
		boolean noSourceAndTarget = (source == null && target == null);

		if (!noSourceAndTarget && !canCreate(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}

		if (noSourceOrTarget && !noSourceAndTarget) {
			// The request isn't complete yet. Return the identity command so
			// that the create relationship gesture is enabled.
			return IdentityCommand.INSTANCE;
		}
		return new CommentAnnotatedElementsCreateCommand(request);
	}
}
