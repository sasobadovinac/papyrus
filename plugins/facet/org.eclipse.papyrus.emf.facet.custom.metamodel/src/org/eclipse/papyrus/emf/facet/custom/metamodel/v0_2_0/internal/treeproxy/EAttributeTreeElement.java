/**
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements()
 */
package org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy;

import org.eclipse.emf.ecore.EAttribute;

/**
 * A representation of the model object '<em><b>EAttribute Tree Element</b></em>'.
 *
 * Represents an EAttribute in a tree view
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEAttributeTreeElement()
 */
public interface EAttributeTreeElement extends EStructuralFeatureTreeElement {
	/**
	 * Returns the value of the '<em><b>EAttribute</b></em>' reference.
	 * The EAttribute represented by this tree element
	 *
	 * @return the value of the '<em>EAttribute</em>' reference.
	 * @see #setEAttribute(EAttribute)
	 * @see org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEAttributeTreeElement_EAttribute()
	 */
	EAttribute getEAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement#getEAttribute <em>EAttribute</em>}' reference.
	 *
	 * @param value
	 *            the new value of the '<em>EAttribute</em>' reference.
	 * @see #getEAttribute()
	 */
	void setEAttribute(EAttribute value);

} // EAttributeTreeElement
