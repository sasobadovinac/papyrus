/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.nattable.stereotyped.elements.tests.paste.overwrite;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectRowsCommand;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.junit.Assert;

/**
 * Test pastes overwrite all of selection with hidden categories.
 */
public class PasteEmptyOverwriteAxisIdentifierNotExisting_Test extends AbstractPasteEmptyOverwriteTest {

	/**
	 * Constructor.
	 */
	public PasteEmptyOverwriteAxisIdentifierNotExisting_Test() {
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
		Assert.assertEquals("Error message is not the expected message", Messages.AbstractPasteInSelectionNattableCommandProvider_ThePasteHasNotBeenDoneBecauseOfSomeProblems, status.getMessage()); //$NON-NLS-1$
		Assert.assertTrue("Status must be a multi-status", status instanceof MultiStatus); //$NON-NLS-1$
		Assert.assertEquals("Error message is not the expected message", Messages.AbstractPasteInSelectionNattableCommandProvider_TheAxisUsedAsIdentifierNotAvailable, ((MultiStatus)status).getChildren()[0].getMessage()); //$NON-NLS-1$
	}
}
