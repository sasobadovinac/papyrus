/**
 * Copyright (c) 2012 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.toolsmiths.model.customizationplugin.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.toolsmiths.model.customizationplugin.CustomizationPluginPackage;
import org.eclipse.papyrus.toolsmiths.model.customizationplugin.PropertyView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property View</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropertyViewImpl extends FileBasedCustomizableElementImpl implements PropertyView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomizationPluginPackage.Literals.PROPERTY_VIEW;
	}

} //PropertyViewImpl
