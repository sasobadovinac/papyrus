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

import java.util.Map;

import org.eclipse.papyrus.infra.nattable.handler.ImportTableHandler;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.UserActionConstants;

/**
 * Test import all of selection with hidden categories.
 */
public class ImportEmptyReplaceAll_V1_V3_V1_MultiColumns_Test extends AbstractImportEmptyTest {

	/**
	 * Constructor.
	 */
	public ImportEmptyReplaceAll_V1_V3_V1_MultiColumns_Test() {
		super();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.overwrite.AbstractPasteInsertTest#removeClassName(java.lang.String)
	 */
	@Override
	public String removeClassName(final String className) throws Exception {
		return className.replaceFirst("ImportEmptyReplaceAll_", ""); //$NON-NLS-1$ //$NON-NLS-2$ k
	}

	/**
	 * @see org.eclipse.papyrus.uml.nattable.generic.tests.insert.AbstractInsertTest#manageParameters(java.util.Map)
	 *
	 * @param parameters
	 */
	@Override
	public void manageParameters(final Map<Object, Object> parameters, final INattableModelManager manager) {
		super.manageParameters(parameters, manager);
		parameters.put(ImportTableHandler.USER_ACTION__PREFERRED_USER_ACTION, UserActionConstants.REPLACE_USER_ACTION);
	}
}