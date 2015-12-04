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

package org.eclipse.papyrus.infra.nattable.configuration;

import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.MouseEventMatcher;
import org.eclipse.papyrus.infra.nattable.menu.MenuConstants;
import org.eclipse.papyrus.infra.nattable.menu.TreePapyrusHeaderPopupMenuAction;
import org.eclipse.swt.SWT;

/**
 * @author VL222926
 * The configuration to use to popup menu in Tree Table
 */
public class TreeTablePopupMenuConfiguration extends TablePopupMenuConfiguration {

	/**
	 * @see org.eclipse.papyrus.infra.nattable.configuration.TablePopupMenuConfiguration#registerRowHeaderPopupMenu(org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry)
	 *
	 * @param uiBindingRegistry
	 */
	@Override
	protected void registerRowHeaderPopupMenu(UiBindingRegistry uiBindingRegistry) {
		uiBindingRegistry.registerMouseDownBinding(new MouseEventMatcher(SWT.NONE, GridRegion.ROW_HEADER, MouseEventMatcher.RIGHT_BUTTON), new TreePapyrusHeaderPopupMenuAction(MenuConstants.ROW_HEADER_POPUP_MENU_ID));
	}
}