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
package org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature To Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration.FeatureToSet#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration.FeatureToSet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration.ApplyStereotypeAdviceConfigurationPackage#getFeatureToSet()
 * @model
 * @generated
 */
public interface FeatureToSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration.ApplyStereotypeAdviceConfigurationPackage#getFeatureToSet_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration.FeatureToSet#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(FeatureValue)
	 * @see org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration.ApplyStereotypeAdviceConfigurationPackage#getFeatureToSet_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureValue getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.uml.elementtypesconfigurations.applystereotypeadviceconfiguration.FeatureToSet#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(FeatureValue value);

} // FeatureToSet