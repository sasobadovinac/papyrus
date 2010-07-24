/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.modelelements.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.papyrus.sysml.modelelements.ModelelementsFactory;
import org.eclipse.papyrus.sysml.modelelements.Problem;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Problem</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ProblemTest extends TestCase {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProblemTest.class);
	}

	/**
	 * The fixture for this Problem test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Problem fixture = null;

	/**
	 * Constructs a new Problem test case with the given name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ProblemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Problem test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Problem getFixture() {
		return fixture;
	}

	/**
	 * Sets the fixture for this Problem test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(Problem fixture) {
		this.fixture = fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelelementsFactory.eINSTANCE.createProblem());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} // ProblemTest
