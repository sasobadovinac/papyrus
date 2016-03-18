/*****************************************************************************
 * Copyright (c) 2016 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Christian W. Damus - Initial API and implementation
 *  
 *****************************************************************************/
package org.eclipse.papyrus.eclipse.project.editors.tests;

import org.eclipse.papyrus.junit.framework.classification.ClassificationSuite;
import org.eclipse.papyrus.junit.framework.runner.Headless;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Project Editors plug-in test suite.
 */
@Headless
@RunWith(ClassificationSuite.class)
@SuiteClasses({
		ProjectEditorTest.class,
		PluginProjectEditorTest.class,
		JavaProjectEditorTest.class,
		ManifestEditorTest.class,
		PluginEditorTest.class,
		FeatureProjectEditorTest.class,
})
public class AllTests {
	// Nothing more
}