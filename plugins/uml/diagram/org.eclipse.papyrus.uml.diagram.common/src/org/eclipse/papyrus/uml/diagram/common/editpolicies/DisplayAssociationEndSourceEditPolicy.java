/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.editpolicies;

import org.eclipse.papyrus.uml.diagram.common.helper.AssociationEndSourceLabelHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.PropertyLabelHelper;

/**
 * Mask Managed label edit policy for association ends (source role)
 */
public class DisplayAssociationEndSourceEditPolicy extends DisplayAssociationEndEditPolicy {

	@Override
	public void addAdditionalListeners() {
		super.addAdditionalListeners();
		// adds a listener to the element itself, and to linked elements, like Type
		if (getView().eContainer() != null) {
			getDiagramEventBroker().addNotificationListener(getView().eContainer(), this);
		}
	}

	/**
	 * Instantiates a new display association end source edit policy.
	 */
	public DisplayAssociationEndSourceEditPolicy() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.DisplayAssociationEndEditPolicy#createPropertyLabelHelper()
	 *
	 * @return
	 */
	@Override
	protected PropertyLabelHelper createPropertyLabelHelper() {
		return AssociationEndSourceLabelHelper.getInstance();
	}
}
