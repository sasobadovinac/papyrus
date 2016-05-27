/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.nattable.config;

/**
 * The cell editor configuration for the UML Stereotype single UML integer value.
 * 
 * @deprecated since 2.0, the super class works fine for Integer DataType and UML Primitives Types, called Integer
 */
@Deprecated
public class UMLStereotypeSingleUMLIntegerCellEditorConfiguration extends UMLStereotypeSingleIntegerCellEditorConfiguration {

	// /**
	// * The id of this editor.
	// */
	// private static final String ID = "org.eclipse.papyrus.uml.nattable.celleditor.configuration.UMLStereotypeSingleUMLIntegerCellEditorConfiguration.Text";//$NON-NLS-1$
	//
	//
	// /**
	// * {@inheritDoc}
	// *
	// * @see org.eclipse.papyrus.infra.emf.nattable.celleditor.config.SingleIntegerCellEditorConfiguration#getConfigurationId()
	// */
	// @Override
	// public String getConfigurationId() {
	// return ID;
	// }
	//
	// /**
	// * {@inheritDoc}
	// *
	// * @see org.eclipse.papyrus.infra.emf.nattable.celleditor.config.SingleIntegerCellEditorConfiguration#handles(org.eclipse.papyrus.infra.nattable.model.nattable.Table, java.lang.Object)
	// */
	// @Override
	// public boolean handles(final Table table, final Object axisElement) {
	// boolean result = false;
	// final String id = AxisUtils.getPropertyId(axisElement);
	// if (id != null && id.startsWith(UMLTableUtils.PROPERTY_OF_STEREOTYPE_PREFIX)) {
	// Property prop = UMLTableUtils.getRealStereotypeProperty(table.getContext(), id);
	// if (prop != null && !prop.isMultivalued()) {
	// Type type = prop.getType();
	// if (type instanceof DataType) {
	// result = type instanceof PrimitiveType && PrimitivesTypesUtils.UML_INTEGER.equals(type.getName());
	// }
	// }
	// }
	// return result;
	// }
}
