/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.blocks;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.resource.ResourceEObject;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Nested Connector End</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml.blocks.NestedConnectorEnd#getPropertyPath <em>Property Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml.blocks.NestedConnectorEnd#getBase_ConnectorEnd <em>Base Connector End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.sysml.blocks.BlocksPackage#getNestedConnectorEnd()
 * @model
 * @generated
 */
public interface NestedConnectorEnd extends ResourceEObject {

	/**
	 * Returns the value of the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Base Connector End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Connector End</em>' reference.
	 * @see #setBase_ConnectorEnd(ConnectorEnd)
	 * @see org.eclipse.papyrus.sysml.blocks.BlocksPackage#getNestedConnectorEnd_Base_ConnectorEnd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectorEnd getBase_ConnectorEnd();

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Path</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Path</em>' reference list.
	 * @see org.eclipse.papyrus.sysml.blocks.BlocksPackage#getNestedConnectorEnd_PropertyPath()
	 * @model required="true"
	 * @generated
	 */
	EList<Property> getPropertyPath();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml.blocks.NestedConnectorEnd#getBase_ConnectorEnd <em>Base Connector End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Base Connector End</em>' reference.
	 * @see #getBase_ConnectorEnd()
	 * @generated
	 */
	void setBase_ConnectorEnd(ConnectorEnd value);

} // NestedConnectorEnd
