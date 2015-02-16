/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.handler;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;

/**
 * Handler to display the filter row in the column header
 *
 */
public class ColumnDisplayFilterHandler extends AbstractColumnChangeHeaderConfigurationHandler {

	/**
	 * @see org.eclipse.papyrus.infra.nattable.handler.AbstractChangeHeaderConfigurationHandler#getEditedFeature()
	 *
	 * @return
	 */
	@Override
	protected EStructuralFeature getEditedFeature() {
		return NattableaxisconfigurationPackage.eINSTANCE.getAbstractHeaderAxisConfiguration_DisplayFilter();
	}

}
