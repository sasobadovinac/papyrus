/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.properties.observable;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;

/**
 * Observable value for the containment feature for the EObject Paste on Row.
 *
 * @author Vincent Lorenzo
 *
 */
public class RowPasteEObjectContainmentFeatureObservableValue extends AbstractRowPasteEObjectConfigurationObservableValue {

	/**
	 *
	 * Constructor.
	 *
	 * @param table
	 */
	public RowPasteEObjectContainmentFeatureObservableValue(final Table table) {
		super(table, NattableaxisconfigurationPackage.eINSTANCE.getPasteEObjectConfiguration_PasteElementContainementFeature());
	}

	/**
	 *
	 * @see org.eclipse.core.databinding.observable.value.IObservableValue#getValueType()
	 *
	 * @return
	 */
	@Override
	public Object getValueType() {
		return EcorePackage.eINSTANCE.getEReference();
	}

}
