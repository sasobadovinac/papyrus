/**
 * Copyright (c) 2012 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.papyrus.emf.facet.efacet.sdk.ui.internal.handler.edition;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.papyrus.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetAttribute;
import org.eclipse.papyrus.emf.facet.efacet.sdk.ui.dialog.IFacetDialogFactory;
import org.eclipse.papyrus.emf.facet.util.ui.internal.exported.util.handler.AbstractSelectionExpectedTypeHandler;

/**
 * Handler for the edition of a {@link FacetAttribute}
 */
public class EditFacetAttributeHandler extends AbstractSelectionExpectedTypeHandler {

	@Override
	protected Class<?> getSelectionExpectedType() {
		return FacetAttribute.class;
	}

	public Object execute(final ExecutionEvent event) {
		return IFacetDialogFactory.INSTANCE.openEditFacetAttributeDialog();
	}
}
