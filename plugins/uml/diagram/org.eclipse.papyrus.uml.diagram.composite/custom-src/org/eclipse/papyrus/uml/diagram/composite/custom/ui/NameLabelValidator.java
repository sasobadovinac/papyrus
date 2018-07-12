/*****************************************************************************
 * Copyright (c) 2009-2011 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.custom.ui;

import org.eclipse.jface.dialogs.IInputValidator;

/**
 * Used to validate a nameLabel
 *
 */
public class NameLabelValidator implements IInputValidator {

	private String error;

	public NameLabelValidator(String errorMessage) {
		super();
		error = errorMessage;
	}

	@Override
	public String isValid(String newText) {
		if ((newText != null) && (!"".equals(newText))) {
			return null;// OK
		} else {
			return error;
		}

	}
}
