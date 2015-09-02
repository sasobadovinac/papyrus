/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests;

/**
 * This allows to manage the paste with categories for the single column.
 */
public class AbstractPasteWithCategoriesSingleColumnDetachedModeTests extends AbstractPasteWithCategoriesTests {

	/**
	 * The paste folder paste for the single column and for the detached mode.
	 */
	public static final String DETACHED_MODE_SINGLE_COLUMN = "detachedMode/single_column/"; //$NON-NLS-1$
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.AbstractPasteWithCategoriesTests#getSourcePath()
	 */
	@Override
	protected String getSourcePath() {
		return new StringBuilder(super.getSourcePath()).append(DETACHED_MODE_SINGLE_COLUMN).toString();
	}
	
}
