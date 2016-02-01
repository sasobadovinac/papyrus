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
package org.eclipse.papyrus.infra.elementtypesconfigurations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Helper Advice Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.infra.elementtypesconfigurations.EditHelperAdviceConfiguration#getEditHelperAdviceClassName <em>Edit Helper Advice Class Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.ElementtypesconfigurationsPackage#getEditHelperAdviceConfiguration()
 * @model
 * @generated
 */
public interface EditHelperAdviceConfiguration extends AbstractEditHelperAdviceConfiguration {
	/**
	 * Returns the value of the '<em><b>Edit Helper Advice Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Helper Advice Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Helper Advice Class Name</em>' attribute.
	 * @see #setEditHelperAdviceClassName(String)
	 * @see org.eclipse.papyrus.infra.elementtypesconfigurations.ElementtypesconfigurationsPackage#getEditHelperAdviceConfiguration_EditHelperAdviceClassName()
	 * @model required="true"
	 * @generated
	 */
	String getEditHelperAdviceClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.elementtypesconfigurations.EditHelperAdviceConfiguration#getEditHelperAdviceClassName <em>Edit Helper Advice Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Helper Advice Class Name</em>' attribute.
	 * @see #getEditHelperAdviceClassName()
	 * @generated
	 */
	void setEditHelperAdviceClassName(String value);

} // EditHelperAdviceConfiguration
