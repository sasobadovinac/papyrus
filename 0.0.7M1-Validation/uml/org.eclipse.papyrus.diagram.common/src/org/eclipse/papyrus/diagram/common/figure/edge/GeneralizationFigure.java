/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
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
package org.eclipse.papyrus.diagram.common.figure.edge;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * future code of the CGeneralizationFigure
 **/
public class GeneralizationFigure extends UMLEdgeFigure {

	/**
	 * 
	 */
	public GeneralizationFigure() {
		super();
		PolygonDecoration dec = new PolygonDecoration();
		dec.setScale(15, 5);
		dec.setBackgroundColor(ColorConstants.white);
		dec.setLineWidth(1);
		setTargetDecoration(dec); // arrow at target endpoint
		setLineStyle(Graphics.LINE_SOLID); // line drawing style
		setLineWidth(2);
		setForegroundColor(ColorConstants.black);

	}
}