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

package org.eclipse.papyrus.sysml.nattable.requirement.tests.importfile;

import org.eclipse.nebula.widgets.nattable.selection.command.SelectCellCommand;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;

/**
 * Test import all of selection with hidden categories.
 */
public class ImportCellsAll_Test extends AbstractImportCellsTest {

	/**
	 * Constructor.
	 */
	public ImportCellsAll_Test() {
		super();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.generic.tests.importfile.AbstractImportEmptyTest#manageSelection(org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager)
	 */
	@Override
	public void manageSelection(final NattableModelManager manager) throws Exception {
		super.manageSelection(manager);
		manager.getBodyLayerStack().getSelectionLayer().doCommand(new SelectCellCommand(manager.getBodyLayerStack().getSelectionLayer(), 2, 2, true, false));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.generic.tests.paste.overwrite.AbstractPasteInsertTest#testUndo_Redo(org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager)
	 */
	@Override
	protected void testUndo_Redo(NattableModelManager treeManager) throws Exception {
		// Do nothing : The undo/redo is not implemented for the old basic paste
	}
}