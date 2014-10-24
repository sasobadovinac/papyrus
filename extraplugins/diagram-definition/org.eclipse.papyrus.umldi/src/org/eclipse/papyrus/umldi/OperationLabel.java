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
 * A representation of the model object '<em><b>Operation Label</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.OperationLabel#getOperationCompartment <em>Operation Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getOperationLabel()
 * @model
 * @generated
 */
public interface OperationLabel extends NameLabel {

	/**
	 * Returns the value of the '<em><b>Operation Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.OperationCompartment#getOperationLabel <em>Operation Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Compartment</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operation Compartment</em>' container reference.
	 * @see #setOperationCompartment(OperationCompartment)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getOperationLabel_OperationCompartment()
	 * @see org.eclipse.papyrus.umldi.OperationCompartment#getOperationLabel
	 * @model opposite="operationLabel" transient="false" ordered="false"
	 * @generated
	 */
	OperationCompartment getOperationCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.OperationLabel#getOperationCompartment <em>Operation Compartment</em>}' container
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Operation Compartment</em>' container reference.
	 * @see #getOperationCompartment()
	 * @generated
	 */
	void setOperationCompartment(OperationCompartment value);
} // OperationLabel
