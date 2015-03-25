/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.activities.tests;

import junit.textui.TestRunner;

import org.eclipse.papyrus.sysml14.activities.ActivitiesFactory;
import org.eclipse.papyrus.sysml14.activities.Discrete;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteTest extends RateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscreteTest.class);
	}

	/**
	 * Constructs a new Discrete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discrete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Discrete getFixture() {
		return (Discrete)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivitiesFactory.eINSTANCE.createDiscrete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DiscreteTest
