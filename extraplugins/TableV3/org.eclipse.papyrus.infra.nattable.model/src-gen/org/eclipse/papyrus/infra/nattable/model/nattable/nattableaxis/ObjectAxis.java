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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.ObjectLabelProviderConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectAxis#getLocalLabelConfiguration <em>Local Label Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage#getObjectAxis()
 * @model abstract="true"
 * @generated
 */
public interface ObjectAxis extends IAxis {
	/**
	 * Returns the value of the '<em><b>Local Label Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Label Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Label Configuration</em>' reference.
	 * @see #setLocalLabelConfiguration(ObjectLabelProviderConfiguration)
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage#getObjectAxis_LocalLabelConfiguration()
	 * @model
	 * @generated
	 */
	ObjectLabelProviderConfiguration getLocalLabelConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectAxis#getLocalLabelConfiguration <em>Local Label Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Label Configuration</em>' reference.
	 * @see #getLocalLabelConfiguration()
	 * @generated
	 */
	void setLocalLabelConfiguration(ObjectLabelProviderConfiguration value);

} // ObjectAxis
