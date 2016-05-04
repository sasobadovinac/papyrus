/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
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

package org.eclipse.papyrus.uml.ui.editors;

import org.eclipse.papyrus.infra.widgets.editors.richtext.CheckSpellDialog;
import org.eclipse.papyrus.infra.widgets.editors.richtext.SpellCheckToolbarButton;
import org.eclipse.swt.widgets.Display;

/**
 * @author VL222926
 * 
 *         This button provides a customized dialog to remove UML references before checking the text
 */
public class UMLSpellCheckToolbarButton extends SpellCheckToolbarButton {

	/**
	 * 
	 * Constructor.
	 *
	 */
	public UMLSpellCheckToolbarButton() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.editors.richtext.SpellCheckToolbarButton#createCheckSpellDialog()
	 *
	 * @return
	 */
	@Override
	protected CheckSpellDialog createCheckSpellDialog() {
		return new UMLSpellCheckDialog(Display.getDefault().getActiveShell(), this.richTextEditor);
	}

}