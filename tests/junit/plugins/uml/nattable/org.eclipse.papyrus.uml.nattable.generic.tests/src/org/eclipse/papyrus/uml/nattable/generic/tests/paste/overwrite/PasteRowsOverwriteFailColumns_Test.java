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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectRowsCommand;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.junit.Assert;

/**
 * Test pastes overwrite when the number of columns to paste is not equals to the number of columns selected.
 */
public class PasteRowsOverwriteFailColumns_Test extends AbstractPasteRowsOverwriteTest {

	/**
	 * Constructor.
	 */
	public PasteRowsOverwriteFailColumns_Test() {
		super();
	}

	/**
	 * Manage the selection with the shift key.
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.overwrite.AbstractPasteOverwriteTest#manageSelection(org.eclipse.papyrus.infra.nattable.manager.table.TreeNattableModelManager)
	 */
	@Override
	public void manageSelection(final NattableModelManager manager) throws Exception {
		super.manageSelection(manager);
		manager.getBodyLayerStack().getSelectionLayer().doCommand(new SelectRowsCommand(manager.getBodyLayerStack().getSelectionLayer(), 0, 2, true, false));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.overwrite.AbstractPasteOverwriteTest#checkReturned_Status(org.eclipse.core.runtime.IStatus)
	 */
	@Override
	protected void checkReturned_Status(final IStatus status) {
		Assert.assertEquals("Error must be caught", IStatus.ERROR, status.getSeverity()); //$NON-NLS-1$
		Assert.assertEquals("Error message is not the expected message", Messages.AbstractPasteInSelectionNattableCommandProvider_readcolumnsexceedsexistingcolumns, status.getMessage()); //$NON-NLS-1$
	}
}
