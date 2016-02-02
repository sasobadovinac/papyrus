/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
 *
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.refactoring.tests.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.refactoring.tests.messages.messages"; //$NON-NLS-1$

	public static String AbstractPapyrusRefactoringTestCase_0;
	public static String AbstractPapyrusRefactoringTestCase_1;
	public static String AbstractPapyrusRefactoringTestCase_2;
	public static String AbstractPapyrusRefactoringTestCase_3;
	public static String AbstractPapyrusRefactoringTestCase_4;
	public static String AbstractPapyrusRefactoringTestCase_5;

	public static String TestPapyrusChange_0;
	public static String TestPapyrusChange_1;

	public static String TestPapyrusRefactoring_0;

	public static String TestPapyrusRefactoringOperation_0;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
