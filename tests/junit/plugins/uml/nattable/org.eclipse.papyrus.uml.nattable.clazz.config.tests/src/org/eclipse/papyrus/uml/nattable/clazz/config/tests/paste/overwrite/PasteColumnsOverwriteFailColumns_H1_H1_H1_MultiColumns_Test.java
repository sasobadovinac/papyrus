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

package org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.overwrite;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectColumnCommand;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.junit.Assert;

/**
 * Test pastes overwrite when the number of columns to paste is not equals to the number of columns selected.
 */
public class PasteColumnsOverwriteFailColumns_H1_H1_H1_MultiColumns_Test extends AbstractPasteColumnsOverwriteTest {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.overwrite.AbstractPasteOverwriteTest#removeClassName(java.lang.String)
	 */
	@Override
	public String removeClassName(final String className) throws Exception {
		return className.replaceFirst("PasteColumnsOverwriteFailColumns_", ""); //$NON-NLS-1$ //$NON-NLS-2$
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
		manager.getBodyLayerStack().getSelectionLayer().doCommand(new SelectColumnCommand(manager.getBodyLayerStack().getSelectionLayer(), 1, 0, true, false));
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
