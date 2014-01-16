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
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.infra.extendedtypes.aspectsemantictypeconfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.infra.extendedtypes.SemanticActionConfiguration;
import org.eclipse.papyrus.infra.extendedtypes.SemanticTypeAdviceConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Semantic Type Advice Configuration</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.extendedtypes.aspectsemantictypeconfiguration.AspectSemanticTypeAdviceConfiguration#getPreActionConfiguration
 * <em>Pre Action Configuration</em>}</li>
 * <li>
 * {@link org.eclipse.papyrus.infra.extendedtypes.aspectsemantictypeconfiguration.AspectSemanticTypeAdviceConfiguration#getPostActionConfiguration
 * <em>Post Action Configuration</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.infra.extendedtypes.aspectsemantictypeconfiguration.AspectSemanticTypeConfigurationPackage#getAspectSemanticTypeAdviceConfiguration()
 * @model
 * @generated
 */
public interface AspectSemanticTypeAdviceConfiguration extends SemanticTypeAdviceConfiguration {

	/**
	 * Returns the value of the '<em><b>Pre Action Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.infra.extendedtypes.SemanticActionConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Action Configuration</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pre Action Configuration</em>' containment reference list.
	 * @see org.eclipse.papyrus.infra.extendedtypes.aspectsemantictypeconfiguration.AspectSemanticTypeConfigurationPackage#getAspectSemanticTypeAdviceConfiguration_PreActionConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticActionConfiguration> getPreActionConfiguration();

	/**
	 * Returns the value of the '<em><b>Post Action Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.infra.extendedtypes.SemanticActionConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Action Configuration</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Post Action Configuration</em>' containment reference list.
	 * @see org.eclipse.papyrus.infra.extendedtypes.aspectsemantictypeconfiguration.AspectSemanticTypeConfigurationPackage#getAspectSemanticTypeAdviceConfiguration_PostActionConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticActionConfiguration> getPostActionConfiguration();
} // AspectSemanticTypeAdviceConfiguration
