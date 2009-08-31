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
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.composite.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.papyrus.diagram.common.figure.node.NodeNamedElementFigure;

/**
 * Figure for Part (in Composite) representation of Property.
 */
public class PropertyPartFigure extends NodeNamedElementFigure {

	/**
	 * Creates a new PropertyPartFigure.
	 */
	public PropertyPartFigure() {
		super();

		setLineStyle(Graphics.LINE_DASH);

		// Set layout (Vertical ToolbarLayout)
		ToolbarLayout layout = new ToolbarLayout();
		layout.setVertical(true);
		setLayoutManager(layout);
	}

}
