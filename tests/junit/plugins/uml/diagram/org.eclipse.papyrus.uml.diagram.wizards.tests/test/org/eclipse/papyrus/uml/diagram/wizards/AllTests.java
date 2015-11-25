/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.wizards;

import org.junit.runner.RunWith;
import org.eclipse.papyrus.junit.framework.classification.ClassificationSuite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(ClassificationSuite.class)
@SuiteClasses({
		// {oep}.uml.diagram.wizards
		TestCreateModelWizard.class, TestCreateSysMLModelWizard.class, TestInitModelWizard.class, TestNewProjectWizard.class, TestNewSysMLProjectWizard.class, TestCreateModelFromExistingModelWizard.class })
/**
 * Suite Class for all tests in the plugin
 */
public class AllTests {

}
