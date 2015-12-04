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

package org.eclipse.papyrus.uml.nattable.clazz.config.tests.importfile;

import org.eclipse.papyrus.infra.nattable.manager.table.TreeNattableModelManager;

/**
 * Test import all of selection with hidden categories.
 */
public class ImportCellsAll_H1_H1_H1_MultiColumns_Test extends AbstractImportCellsTest {

	/**
	 * Constructor.
	 */
	public ImportCellsAll_H1_H1_H1_MultiColumns_Test() {
		super();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.overwrite.AbstractPasteInsertTest#removeClassName(java.lang.String)
	 */
	@Override
	public String removeClassName(final String className) throws Exception {
		return className.replaceFirst("ImportCellsAll_", ""); //$NON-NLS-1$ //$NON-NLS-2$ k
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.overwrite.AbstractPasteInsertTest#testUndo_Redo(org.eclipse.papyrus.infra.nattable.manager.table.TreeNattableModelManager)
	 */
	@Override
	protected void testUndo_Redo(final TreeNattableModelManager treeManager) throws Exception {
		// Do nothing : The undo/redo is not implemented for the old basic paste
	}

}