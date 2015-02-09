/**
 * Copyright (c) 2014 Christian W. Damus and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 */
package org.eclipse.papyrus.infra.gmfdiag.assistant;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.infra.filters.Filter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Popup Assistant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.gmfdiag.assistant.PopupAssistant#getFilter <em>Filter</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.gmfdiag.assistant.PopupAssistant#getOwnedFilter <em>Owned Filter</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.gmfdiag.assistant.PopupAssistant#getOwningProvider <em>Owning Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.gmfdiag.assistant.AssistantPackage#getPopupAssistant()
 * @model
 * @generated
 */
public interface PopupAssistant extends Assistant
{
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see org.eclipse.papyrus.infra.gmfdiag.assistant.AssistantPackage#getPopupAssistant_Filter()
	 * @model ordered="false"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.gmfdiag.assistant.PopupAssistant#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Owned Filter</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.infra.gmfdiag.assistant.PopupAssistant#getFilter() <em>Filter</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Filter</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Owned Filter</em>' containment reference.
	 * @see #setOwnedFilter(Filter)
	 * @see org.eclipse.papyrus.infra.gmfdiag.assistant.AssistantPackage#getPopupAssistant_OwnedFilter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Filter getOwnedFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.gmfdiag.assistant.PopupAssistant#getOwnedFilter <em>Owned Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Owned Filter</em>' containment reference.
	 * @see #getOwnedFilter()
	 * @generated
	 */
	void setOwnedFilter(Filter value);

	/**
	 * Creates a new {@link org.eclipse.papyrus.infra.filters.Filter}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Owned Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param name
	 *            The '<em><b>Name</b></em>' for the new {@link org.eclipse.papyrus.infra.filters.Filter}, or <code>null</code>.
	 * @param eClass
	 *            The Ecore class of the {@link org.eclipse.papyrus.infra.filters.Filter} to create.
	 * @return The new {@link org.eclipse.papyrus.infra.filters.Filter}.
	 * @see #getOwnedFilter()
	 * @generated
	 */
	Filter createOwnedFilter(String name, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owning Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.infra.gmfdiag.assistant.ModelingAssistantProvider#getPopupAssistants <em>Popup Assistant</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.infra.gmfdiag.assistant.Assistant#getProvider() <em>Provider</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Provider</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Owning Provider</em>' container reference.
	 * @see #setOwningProvider(ModelingAssistantProvider)
	 * @see org.eclipse.papyrus.infra.gmfdiag.assistant.AssistantPackage#getPopupAssistant_OwningProvider()
	 * @see org.eclipse.papyrus.infra.gmfdiag.assistant.ModelingAssistantProvider#getPopupAssistants
	 * @model opposite="popupAssistant" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ModelingAssistantProvider getOwningProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.gmfdiag.assistant.PopupAssistant#getOwningProvider <em>Owning Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Owning Provider</em>' container reference.
	 * @see #getOwningProvider()
	 * @generated
	 */
	void setOwningProvider(ModelingAssistantProvider value);

} // PopupAssistant
