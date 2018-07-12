/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.statemachine.custom.parsers;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.papyrus.uml.diagram.statemachine.custom.parsers.messages"; //$NON-NLS-1$

	public static String DeferrableTriggerParser_DEFER_KEYWORD;

	public static String DoActivityStateBehaviorParser_DO_KEYWORD;

	public static String EntryStateBehaviorParser_ENTRY_KEYWORD;

	public static String ExitStateBehaviorParser_EXIT_KEYWORD;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
