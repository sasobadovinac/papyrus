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

package org.eclipse.papyrus.uml.nattable.generic.tests.paste.overwrite;

import org.eclipse.nebula.widgets.nattable.selection.command.SelectColumnCommand;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;

/**
 * Test pastes overwrite all of selection with hidden categories.
 */
public class PasteColumnsOverwriteAll_Test extends AbstractPasteColumnsOverwriteTest {

	/**
	 * Constructor.
	 */
	public PasteColumnsOverwriteAll_Test() {
		super();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.generic.tests.paste.overwrite.AbstractPasteColumnsOverwriteTest#manageSelection(org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager)
	 */
	@Override
	public void manageSelection(final NattableModelManager manager) throws Exception {
		super.manageSelection(manager);
		manager.getBodyLayerStack().getSelectionLayer().doCommand(new SelectColumnCommand(manager.getBodyLayerStack().getSelectionLayer(), 2, 0, true, false));
	}
}
