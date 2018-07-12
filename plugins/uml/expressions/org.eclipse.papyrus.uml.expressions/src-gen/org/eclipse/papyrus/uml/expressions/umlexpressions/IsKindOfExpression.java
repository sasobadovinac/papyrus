/**
 * Copyright (c) 2017 CEA LIST.
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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.uml.expressions.umlexpressions;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.IBooleanEObjectExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Kind Of Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>The evaluate methods returns True if the arguments is an instance of the expected metaclass.</p>
 * 
 * <p>If the metaclass is not defined, the evaluate method returns False.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.uml.expressions.umlexpressions.IsKindOfExpression#getUmlEClass <em>Uml EClass</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.uml.expressions.umlexpressions.UMLExpressionsPackage#getIsKindOfExpression()
 * @model
 * @generated
 */
public interface IsKindOfExpression extends IBooleanEObjectExpression {
	/**
	 * Returns the value of the '<em><b>Uml EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml EClass</em>' reference.
	 * @see #setUmlEClass(EClass)
	 * @see org.eclipse.papyrus.uml.expressions.umlexpressions.UMLExpressionsPackage#getIsKindOfExpression_UmlEClass()
	 * @model ordered="false"
	 * @generated
	 */
	EClass getUmlEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.uml.expressions.umlexpressions.IsKindOfExpression#getUmlEClass <em>Uml EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml EClass</em>' reference.
	 * @see #getUmlEClass()
	 * @generated
	 */
	void setUmlEClass(EClass value);

} // IsKindOfExpression
