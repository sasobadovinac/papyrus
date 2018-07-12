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

import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.IBooleanEObjectExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Type Of Stereotype Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This expression is used to ckech if a UML object is stereotyped with the expected stereotype or with a stereotype instance of the expected stereotype.
 * The evaluate method returns TRUE when the object is stereotyped by the stereotype identified by its qualified name or by a stereotype instanceof the identified stereotype
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.uml.expressions.umlexpressions.IsTypeOfStereotypeExpression#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.uml.expressions.umlexpressions.IsTypeOfStereotypeExpression#getProfileURI <em>Profile URI</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.uml.expressions.umlexpressions.UMLExpressionsPackage#getIsTypeOfStereotypeExpression()
 * @model
 * @generated
 */
public interface IsTypeOfStereotypeExpression extends IBooleanEObjectExpression {
	/**
	 * Returns the value of the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype Qualified Name</em>' attribute.
	 * @see #setStereotypeQualifiedName(String)
	 * @see org.eclipse.papyrus.uml.expressions.umlexpressions.UMLExpressionsPackage#getIsTypeOfStereotypeExpression_StereotypeQualifiedName()
	 * @model ordered="false"
	 * @generated
	 */
	String getStereotypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.uml.expressions.umlexpressions.IsTypeOfStereotypeExpression#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype Qualified Name</em>' attribute.
	 * @see #getStereotypeQualifiedName()
	 * @generated
	 */
	void setStereotypeQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Profile URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile URI</em>' attribute.
	 * @see #setProfileURI(String)
	 * @see org.eclipse.papyrus.uml.expressions.umlexpressions.UMLExpressionsPackage#getIsTypeOfStereotypeExpression_ProfileURI()
	 * @model ordered="false"
	 * @generated
	 */
	String getProfileURI();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.uml.expressions.umlexpressions.IsTypeOfStereotypeExpression#getProfileURI <em>Profile URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile URI</em>' attribute.
	 * @see #getProfileURI()
	 * @generated
	 */
	void setProfileURI(String value);

} // IsTypeOfStereotypeExpression
