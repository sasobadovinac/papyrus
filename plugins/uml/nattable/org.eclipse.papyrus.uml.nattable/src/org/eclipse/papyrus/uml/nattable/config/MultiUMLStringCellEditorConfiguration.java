/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.nattable.config;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.uml2.types.TypesPackage;

/**
 * The cell editor configuration for the multi UML string value.
 */
public class MultiUMLStringCellEditorConfiguration extends MultiStringCellEditorConfiguration {

	/**
	 * The id of this editor.
	 */
	public static final String ID = "org.eclipse.papyrus.uml.nattable.celleditor.configuration.MultiUMLStringCellEditorConfiguration.MultiEditor";//$NON-NLS-1$


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.config.MultiStringCellEditorConfiguration#getConfigurationId()
	 */
	@Override
	public String getConfigurationId() {
		return ID;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.nattable.config.MultiStringCellEditorConfiguration#handles(org.eclipse.papyrus.infra.nattable.model.nattable.Table, java.lang.Object)
	 */
	@Override
	public boolean handles(final Table table, final Object axisElement) {
		boolean result = false;
		Object object = AxisUtils.getRepresentedElement(axisElement);
		if (object instanceof EStructuralFeature) {
			EStructuralFeature feature = (EStructuralFeature) object;
			if (feature.isMany()) {
				result = feature.getEType() == TypesPackage.eINSTANCE.getString();
			}
		}
		return result;
	}
}
