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
package org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.infra.elementtypesconfigurations.ElementtypesconfigurationsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.SetValuesAdviceConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface SetValuesAdviceConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "setvaluesadviceconfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/infra/elementtypesconfigurations/emf/setvaluesadviceconfiguration/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "setvaluesadviceconfiguration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetValuesAdviceConfigurationPackage eINSTANCE = org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationImpl <em>Set Values Advice Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationImpl
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getSetValuesAdviceConfiguration()
	 * @generated
	 */
	int SET_VALUES_ADVICE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__DESCRIPTION = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__BEFORE = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__BEFORE;

	/**
	 * The feature id for the '<em><b>After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__AFTER = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__AFTER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__IDENTIFIER = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__TARGET = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__TARGET;

	/**
	 * The feature id for the '<em><b>Container Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__CONTAINER_CONFIGURATION = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__CONTAINER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Matcher Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__MATCHER_CONFIGURATION = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__MATCHER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__INHERITANCE = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Features To Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION__FEATURES_TO_SET = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Values Advice Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUES_ADVICE_CONFIGURATION_FEATURE_COUNT = ElementtypesconfigurationsPackage.ABSTRACT_ADVICE_BINDING_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureToSetImpl <em>Feature To Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureToSetImpl
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getFeatureToSet()
	 * @generated
	 */
	int FEATURE_TO_SET = 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_SET__FEATURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_SET__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Feature To Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_SET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureValueImpl <em>Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureValueImpl
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getFeatureValue()
	 * @generated
	 */
	int FEATURE_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.DynamicValueImpl <em>Dynamic Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.DynamicValueImpl
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getDynamicValue()
	 * @generated
	 */
	int DYNAMIC_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Dynamic Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_FEATURE_COUNT = FEATURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ConstantValueImpl <em>Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ConstantValueImpl
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getConstantValue()
	 * @generated
	 */
	int CONSTANT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__VALUE_INSTANCE = FEATURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_FEATURE_COUNT = FEATURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ListValueImpl <em>List Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ListValueImpl
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getListValue()
	 * @generated
	 */
	int LIST_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__VALUES = FEATURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_FEATURE_COUNT = FEATURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.QueryExecutionValueImpl <em>Query Execution Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.QueryExecutionValueImpl
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getQueryExecutionValue()
	 * @generated
	 */
	int QUERY_EXECUTION_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Query Execution Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXECUTION_VALUE_FEATURE_COUNT = DYNAMIC_VALUE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.SetValuesAdviceConfiguration <em>Set Values Advice Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Values Advice Configuration</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.SetValuesAdviceConfiguration
	 * @generated
	 */
	EClass getSetValuesAdviceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.SetValuesAdviceConfiguration#getFeaturesToSet <em>Features To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features To Set</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.SetValuesAdviceConfiguration#getFeaturesToSet()
	 * @see #getSetValuesAdviceConfiguration()
	 * @generated
	 */
	EReference getSetValuesAdviceConfiguration_FeaturesToSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureToSet <em>Feature To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature To Set</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureToSet
	 * @generated
	 */
	EClass getFeatureToSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureToSet#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureToSet#getFeatureName()
	 * @see #getFeatureToSet()
	 * @generated
	 */
	EAttribute getFeatureToSet_FeatureName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureToSet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureToSet#getValue()
	 * @see #getFeatureToSet()
	 * @generated
	 */
	EReference getFeatureToSet_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.FeatureValue
	 * @generated
	 */
	EClass getFeatureValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.DynamicValue <em>Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Value</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.DynamicValue
	 * @generated
	 */
	EClass getDynamicValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Value</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ConstantValue
	 * @generated
	 */
	EClass getConstantValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ConstantValue#getValueInstance <em>Value Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Instance</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ConstantValue#getValueInstance()
	 * @see #getConstantValue()
	 * @generated
	 */
	EReference getConstantValue_ValueInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ListValue <em>List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ListValue
	 * @generated
	 */
	EClass getListValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ListValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.ListValue#getValues()
	 * @see #getListValue()
	 * @generated
	 */
	EReference getListValue_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.QueryExecutionValue <em>Query Execution Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Execution Value</em>'.
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.QueryExecutionValue
	 * @generated
	 */
	EClass getQueryExecutionValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SetValuesAdviceConfigurationFactory getSetValuesAdviceConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationImpl <em>Set Values Advice Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationImpl
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getSetValuesAdviceConfiguration()
		 * @generated
		 */
		EClass SET_VALUES_ADVICE_CONFIGURATION = eINSTANCE.getSetValuesAdviceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Features To Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUES_ADVICE_CONFIGURATION__FEATURES_TO_SET = eINSTANCE.getSetValuesAdviceConfiguration_FeaturesToSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureToSetImpl <em>Feature To Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureToSetImpl
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getFeatureToSet()
		 * @generated
		 */
		EClass FEATURE_TO_SET = eINSTANCE.getFeatureToSet();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TO_SET__FEATURE_NAME = eINSTANCE.getFeatureToSet_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TO_SET__VALUE = eINSTANCE.getFeatureToSet_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureValueImpl <em>Feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.FeatureValueImpl
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getFeatureValue()
		 * @generated
		 */
		EClass FEATURE_VALUE = eINSTANCE.getFeatureValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.DynamicValueImpl <em>Dynamic Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.DynamicValueImpl
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getDynamicValue()
		 * @generated
		 */
		EClass DYNAMIC_VALUE = eINSTANCE.getDynamicValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ConstantValueImpl <em>Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ConstantValueImpl
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getConstantValue()
		 * @generated
		 */
		EClass CONSTANT_VALUE = eINSTANCE.getConstantValue();

		/**
		 * The meta object literal for the '<em><b>Value Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_VALUE__VALUE_INSTANCE = eINSTANCE.getConstantValue_ValueInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ListValueImpl <em>List Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.ListValueImpl
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getListValue()
		 * @generated
		 */
		EClass LIST_VALUE = eINSTANCE.getListValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VALUE__VALUES = eINSTANCE.getListValue_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.QueryExecutionValueImpl <em>Query Execution Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.QueryExecutionValueImpl
		 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration.impl.SetValuesAdviceConfigurationPackageImpl#getQueryExecutionValue()
		 * @generated
		 */
		EClass QUERY_EXECUTION_VALUE = eINSTANCE.getQueryExecutionValue();

	}

} //SetValuesAdviceConfigurationPackage
