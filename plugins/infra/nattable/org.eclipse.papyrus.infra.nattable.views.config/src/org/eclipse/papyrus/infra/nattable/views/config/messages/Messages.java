/*****************************************************************************
 * Copyright (c) 2013, 2016 CEA LIST, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus - bug 485220
 *   
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.views.config.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.papyrus.infra.nattable.views.config.messages.messages"; //$NON-NLS-1$

	public static String TableViewCreationTester_TheTableViewCanBeCreated;

	public static String TableViewCreationTester_TheTableViewCantBeCreated;

	public static String TableViewCreationTester_ServicesUnavailable;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
