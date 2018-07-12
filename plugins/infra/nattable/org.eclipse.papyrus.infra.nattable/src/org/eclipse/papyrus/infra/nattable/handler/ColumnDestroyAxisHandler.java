/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
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
package org.eclipse.papyrus.infra.nattable.handler;

import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.nebula.widgets.nattable.ui.NatEventData;
import org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager;

/**
 * The handler used to destroy the selected columns
 *
 * @author Vincent Lorenzo
 *
 */
public class ColumnDestroyAxisHandler extends AbstractTableHandler {

	/**
	 * @Override
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IAxisManager axisManager = getColumnAxisManager();
		NatEventData eventData = getNatEventData();
		if (axisManager != null && eventData!=null) {
			axisManager.destroyAxis(getFullSelectedColumnsIndex(eventData));
		}
		return null;
	}

	/**
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setEnabled(evaluationContext);
		NatEventData eventData = getNatEventData();
		boolean enabled = false;
		final IAxisManager axisManager = getColumnAxisManager();
		if (isEnabled() && axisManager != null && eventData!=null) {
			final List<Integer> col = getFullSelectedColumnsIndex(eventData);
			enabled = axisManager.canDestroyAxis(col);
		}
		setBaseEnabled(enabled);
	}
}
