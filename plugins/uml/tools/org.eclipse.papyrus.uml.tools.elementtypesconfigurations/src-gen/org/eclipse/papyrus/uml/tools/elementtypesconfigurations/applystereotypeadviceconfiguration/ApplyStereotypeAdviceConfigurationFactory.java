/**
 * Copyright (c) 2014 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.tools.elementtypesconfigurations.applystereotypeadviceconfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.uml.tools.elementtypesconfigurations.applystereotypeadviceconfiguration.ApplyStereotypeAdviceConfigurationPackage
 * @generated
 */
public interface ApplyStereotypeAdviceConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplyStereotypeAdviceConfigurationFactory eINSTANCE = org.eclipse.papyrus.uml.tools.elementtypesconfigurations.applystereotypeadviceconfiguration.impl.ApplyStereotypeAdviceConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apply Stereotype Advice Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Stereotype Advice Configuration</em>'.
	 * @generated
	 */
	ApplyStereotypeAdviceConfiguration createApplyStereotypeAdviceConfiguration();

	/**
	 * Returns a new object of class '<em>Stereotype To Apply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stereotype To Apply</em>'.
	 * @generated
	 */
	StereotypeToApply createStereotypeToApply();

	/**
	 * Returns a new object of class '<em>Feature To Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature To Set</em>'.
	 * @generated
	 */
	FeatureToSet createFeatureToSet();

	/**
	 * Returns a new object of class '<em>List Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Value</em>'.
	 * @generated
	 */
	ListValue createListValue();

	/**
	 * Returns a new object of class '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Value</em>'.
	 * @generated
	 */
	ConstantValue createConstantValue();

	/**
	 * Returns a new object of class '<em>Query Execution Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Execution Value</em>'.
	 * @generated
	 */
	QueryExecutionValue createQueryExecutionValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplyStereotypeAdviceConfigurationPackage getApplyStereotypeAdviceConfigurationPackage();

} //ApplyStereotypeAdviceConfigurationFactory
