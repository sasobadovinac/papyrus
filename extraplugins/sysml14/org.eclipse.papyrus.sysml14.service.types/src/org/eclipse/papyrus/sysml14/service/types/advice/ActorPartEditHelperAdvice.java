/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.sysml14.service.types.advice;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

/**
 * The EditHelperAdvice class used for Actor Part
 *
 */
public class ActorPartEditHelperAdvice extends AbstractEditHelperAdvice {


	/**
	 * Parameter id used to pass the command for setting the type of the property
	 */
	public static final String SET_ACTOR_ICOMMAND = "SET_ACTOR_ICOMMAND"; //$NON-NLS-1$
	

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		Object parameter = request.getParameter(SET_ACTOR_ICOMMAND);

		if (parameter instanceof ICommand) {
			return (ICommand) parameter;
		}
		return super.getAfterConfigureCommand(request);
	}
}
