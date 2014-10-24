/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Label</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.BodyLabel#getConstraintShape <em>Constraint Shape</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getBodyLabel()
 * @model
 * @generated
 */
public interface BodyLabel extends UmlLabel {

	/**
	 * Returns the value of the '<em><b>Constraint Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.BodyShape#getBodyLabel <em>Body Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Shape</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constraint Shape</em>' container reference.
	 * @see #setConstraintShape(BodyShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getBodyLabel_ConstraintShape()
	 * @see org.eclipse.papyrus.umldi.BodyShape#getBodyLabel
	 * @model opposite="bodyLabel" transient="false" ordered="false"
	 * @generated
	 */
	BodyShape getConstraintShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.BodyLabel#getConstraintShape <em>Constraint Shape</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Constraint Shape</em>' container reference.
	 * @see #getConstraintShape()
	 * @generated
	 */
	void setConstraintShape(BodyShape value);
} // BodyLabel
