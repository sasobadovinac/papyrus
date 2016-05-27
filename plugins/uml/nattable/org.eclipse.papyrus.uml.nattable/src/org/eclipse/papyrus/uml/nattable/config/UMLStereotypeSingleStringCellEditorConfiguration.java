/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent LORENZO (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.nattable.config;

import org.eclipse.papyrus.infra.emf.nattable.celleditor.config.SingleStringCellEditorConfiguration;
import org.eclipse.papyrus.infra.emf.utils.EMFContants;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.tools.util.TypesConstants;
import org.eclipse.papyrus.uml.nattable.utils.UMLTableUtils;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * The cell editor configuration for the UML Stereotype single string value.
 */
public class UMLStereotypeSingleStringCellEditorConfiguration extends SingleStringCellEditorConfiguration {

	/**
	 * The id of this editor.
	 */
	public static final String ID = "org.eclipse.papyrus.uml.nattable.celleditor.configuration.UMLStereotypeSingleStringCellEditorConfiguration.MultiLineText";//$NON-NLS-1$


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.emf.nattable.celleditor.config.SingleStringCellEditorConfiguration#getConfigurationId()
	 */
	@Override
	public String getConfigurationId() {
		return ID;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.emf.nattable.celleditor.config.SingleStringCellEditorConfiguration#handles(org.eclipse.papyrus.infra.nattable.model.nattable.Table, java.lang.Object)
	 */
	@Override
	public boolean handles(final Table table, final Object axisElement) {
		boolean result = false;
		final String id = AxisUtils.getPropertyId(axisElement);
		if (id != null && id.startsWith(UMLTableUtils.PROPERTY_OF_STEREOTYPE_PREFIX)) {
			Property prop = UMLTableUtils.getRealStereotypeProperty(table.getContext(), id);
			if (prop != null && !prop.isMultivalued()) {
				Type type = prop.getType();
				if (type instanceof DataType) {
					final String name = type.getName();
					result = TypesConstants.STRING.equals(name) || EMFContants.ESTRING.equals(name);
				}
			}
		}
		return result;
	}
}
