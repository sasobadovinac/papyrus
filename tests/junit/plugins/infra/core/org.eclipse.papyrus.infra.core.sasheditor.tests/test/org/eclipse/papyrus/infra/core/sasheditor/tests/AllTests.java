/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.sasheditor.tests;

import org.junit.runner.RunWith;
import org.eclipse.papyrus.junit.framework.classification.ClassificationSuite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * All tests for this plugin
 */
@RunWith(ClassificationSuite.class)
@SuiteClasses({
// testModel1
org.eclipse.papyrus.infra.core.sasheditor.contentprovider.simple.AllTests.class, 
org.eclipse.papyrus.infra.core.sasheditor.editor.AllTests.class, 
org.eclipse.papyrus.infra.core.sasheditor.internal.AllTests.class,
org.eclipse.papyrus.infra.core.sasheditor.tests.texteditor.AllTests.class
})
public class AllTests {
	//Testsuite
}
