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

import java.util.Map;

import org.eclipse.papyrus.infra.nattable.handler.InsertInTableHandler;
import org.eclipse.papyrus.infra.nattable.utils.UserActionConstants;

/**
 * Test pastes overwrite all of selection with hidden categories.
 */
public class PasteEmptyOverwriteReplaceAll_Test extends AbstractPasteEmptyOverwriteTest {

	/**
	 * Constructor.
	 */
	public PasteEmptyOverwriteReplaceAll_Test() {
		super();
	}
	
	/**
	 * @see org.eclipse.papyrus.uml.nattable.generic.tests.paste.overwrite.AbstractPasteEmptyOverwriteTest#manageParameters(java.util.Map)
	 *
	 * @param parameters
	 */
	@Override
	public void manageParameters(Map<Object, Object> parameters) {
		super.manageParameters(parameters);
		parameters.put(InsertInTableHandler.USER_ACTION__PREFERRED_USER_ACTION, UserActionConstants.REPLACE_USER_ACTION);
	}
}
