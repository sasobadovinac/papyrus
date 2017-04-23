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
package org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.EObjectBooleanExpressionsPackage
 * @generated
 */
public interface EObjectBooleanExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EObjectBooleanExpressionsFactory eINSTANCE = org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.impl.EObjectBooleanExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Expression</em>'.
	 * @generated
	 */
	OrExpression createOrExpression();

	/**
	 * Returns a new object of class '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expression</em>'.
	 * @generated
	 */
	AndExpression createAndExpression();

	/**
	 * Returns a new object of class '<em>Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Expression</em>'.
	 * @generated
	 */
	NotExpression createNotExpression();

	/**
	 * Returns a new object of class '<em>Literal True Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal True Expression</em>'.
	 * @generated
	 */
	LiteralTrueExpression createLiteralTrueExpression();

	/**
	 * Returns a new object of class '<em>Literal False Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal False Expression</em>'.
	 * @generated
	 */
	LiteralFalseExpression createLiteralFalseExpression();

	/**
	 * Returns a new object of class '<em>Reference Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Boolean Expression</em>'.
	 * @generated
	 */
	ReferenceBooleanExpression createReferenceBooleanExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EObjectBooleanExpressionsPackage getEObjectBooleanExpressionsPackage();

} //EObjectBooleanExpressionsFactory
