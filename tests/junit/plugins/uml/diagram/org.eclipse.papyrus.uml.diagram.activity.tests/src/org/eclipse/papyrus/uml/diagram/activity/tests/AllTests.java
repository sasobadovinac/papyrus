/*****************************************************************************
 * Copyright (c) 2009, 2015 CEA LIST, Christian W. Damus, and others.
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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 464647
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.tests;

import org.eclipse.papyrus.junit.framework.classification.ClassificationSuite;
import org.eclipse.papyrus.junit.framework.classification.ClassificationSuite.DynamicClasses;
import org.eclipse.papyrus.uml.diagram.activity.tests.canonical.AllCanonicalTests;
import org.eclipse.papyrus.uml.diagram.activity.tests.derivation.pins.AllPinDerivationTests;
import org.eclipse.papyrus.uml.diagram.activity.tests.edit.helper.ExpansionRegionHelperTest;
import org.eclipse.papyrus.uml.diagram.activity.tests.edit.part.ExpansionRegionCompartmentEPTest;
import org.eclipse.papyrus.uml.diagram.activity.tests.edit.part.RoundedCompartmentTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All tests together.
 */
@RunWith(ClassificationSuite.class)
@SuiteClasses({
		// canonical
		AllCanonicalTests.class,
		AllPinDerivationTests.class,
		ExpansionRegionHelperTest.class,
		ExpansionRegionCompartmentEPTest.class,
		RoundedCompartmentTest.class,

})
@DynamicClasses("org.eclipse.papyrus.uml.diagram.activity.test.AllGenTests")
public class AllTests {

}
