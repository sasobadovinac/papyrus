/*****************************************************************************
 * Copyright (c) 2017 CEA LIST and others.
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

package org.eclipse.papyrus.uml.diagram.sequence.figures;

import java.util.ArrayList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.papyrus.uml.diagram.sequence.CustomMessages;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLDiagramEditorPlugin;

/**
 * use to display a grid
 * @since 3.0
 *
 */
public class ReferencialGrid extends RectangleFigure {
	
	ArrayList<Integer> lines= new ArrayList<Integer>();
	/**
	 * Constructor.
	 *
	 */
	public ReferencialGrid() {
		setOpaque(false);
	}
	/**
	 * @see org.eclipse.draw2d.Figure#paint(org.eclipse.draw2d.Graphics)
	 *
	 * @param graphics
	 */
	@Override
	public void paint(Graphics graphics) {
		int postionofGrid=28;
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.green);
		graphics.setLineWidth(2);
		graphics.drawLine(100,100, 200, 200);
		for (int i = 0; i < lines.size(); i++) {
			graphics.drawLine(0,lines.get(i)+postionofGrid, 50, lines.get(i)+postionofGrid);
		}
		graphics.popState();
	}
	/**
	 * @param y
	 */
	public void displayLine(int y) {
		lines.add(new Integer(y));
		
	}
	public void cleanAllLines() {
		lines.clear();
	}

}
