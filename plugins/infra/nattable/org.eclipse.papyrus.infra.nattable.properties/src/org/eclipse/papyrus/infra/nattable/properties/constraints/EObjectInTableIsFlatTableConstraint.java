/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
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

package org.eclipse.papyrus.infra.nattable.properties.constraints;

import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;

/**
 * The java constraint to check if the table from the active nattable editor is a flat table.
 * 
 * @since 2.2
 */
public class EObjectInTableIsFlatTableConstraint extends EObjectInTableJavaConstraint {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.properties.constraints.EObjectInTableJavaConstraint#checkMoreConstraints(org.eclipse.papyrus.infra.nattable.model.nattable.Table)
	 */
	@Override
	protected boolean checkMoreConstraints(final Table table) {
		return !TableHelper.isTreeTable(table);
	}
}
