/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.emf.expressions.properties.utils;

/**
 * Constants used for custom expressions elements
 *
 */
public class ExpressionsConstants {

	private ExpressionsConstants() {
		// no prevent instanciation
	}

	public static final String OWNED_EXPRESSIONS = "ownedExpressions"; //$NON-NLS-1$

	public static final String OWNED_EXPRESSION = "ownedExpression"; //$NON-NLS-1$

	public static final String REFERENCED_EXPRESSIONS = "referencedExpressions"; //$NON-NLS-1$

	public static final String REFERENCED_EXPRESSION = "referencedExpression"; //$NON-NLS-1$
}
