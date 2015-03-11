/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Francois Le Fevre (CEA LIST) francois.le-fevre@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.menu.actions;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.papyrus.infra.ui.menu.AbstractParametricOnSelectedElementsAction;


public abstract class AbstractGraphicalParametricOnSelectedElementsAction extends AbstractParametricOnSelectedElementsAction {

	/**
	 *
	 * Constructor.
	 *
	 * @param parameter
	 *            parameter for the action
	 * @param selectedEditPart
	 *            the selectedEditPart for the action
	 */
	public AbstractGraphicalParametricOnSelectedElementsAction(String parameter, List<EObject> selectedEditPart) {
		super(parameter, selectedEditPart);
	}

	/**
	 * Returns the command for this action
	 *
	 * @return
	 *         the command for this action
	 */
	public Command getCommand() {
		if (isEnabled()) {
			Command cmd = getBuildedCommand();
			if (cmd != null && cmd.canExecute()) {
				return cmd;
			}
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 *
	 * @return
	 *         the command for this action
	 */
	protected abstract Command getBuildedCommand();
}
