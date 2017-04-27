/**
 * Copyright (c) 2013 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablewrapper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablewrapper.NattablewrapperPackage
 * @generated
 */
public interface NattablewrapperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NattablewrapperFactory eINSTANCE = org.eclipse.papyrus.infra.nattable.model.nattable.nattablewrapper.impl.NattablewrapperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EObject Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Wrapper</em>'.
	 * @generated
	 */
	EObjectWrapper createEObjectWrapper();

	/**
	 * Returns a new object of class '<em>Id Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Wrapper</em>'.
	 * @generated
	 */
	IdWrapper createIdWrapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NattablewrapperPackage getNattablewrapperPackage();

} //NattablewrapperFactory
