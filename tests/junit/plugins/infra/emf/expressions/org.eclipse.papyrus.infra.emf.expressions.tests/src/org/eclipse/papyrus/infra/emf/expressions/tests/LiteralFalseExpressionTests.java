/**
 * Copyright (c) 2017 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.emf.expressions.tests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.EObjectBooleanExpressionsFactory;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.LiteralFalseExpression;
import org.junit.Assert;
import org.junit.Test;

public class LiteralFalseExpressionTests {

	private EObject dummyObject = EcoreFactory.eINSTANCE.createEClass();

	/**
	 * {@link LiteralFalseExpression} must return <code>false</code> when object to evaluate is not <code>null</code>
	 */
	@Test
	public void LiteralFalseExpression_Test1() {
		final LiteralFalseExpression falseExp = EObjectBooleanExpressionsFactory.eINSTANCE.createLiteralFalseExpression();
		Assert.assertFalse(falseExp.evaluate(this.dummyObject));
	}

	/**
	 * {@link LiteralFalseExpression} must return <code>false</code> when object to evaluate is <code>null</code>
	 */
	@Test
	public void LiteralFalseExpression_Test2() {
		final LiteralFalseExpression falseExp = EObjectBooleanExpressionsFactory.eINSTANCE.createLiteralFalseExpression();
		Assert.assertFalse(falseExp.evaluate(null));
	}

}
