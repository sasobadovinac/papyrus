/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.deprecatedelements;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FlowSpecification specifies inputs and outputs as a set of flow properties. A flow specification is used by flow ports to specify what items can flow via the port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification#getBase_Interface <em>Base Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getFlowSpecification()
 * @model
 * @generated
 */
public interface FlowSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interface</em>' reference.
	 * @see #setBase_Interface(Interface)
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getFlowSpecification_Base_Interface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getBase_Interface();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification#getBase_Interface <em>Base Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interface</em>' reference.
	 * @see #getBase_Interface()
	 * @generated
	 */
	void setBase_Interface(Interface value);

} // FlowSpecification