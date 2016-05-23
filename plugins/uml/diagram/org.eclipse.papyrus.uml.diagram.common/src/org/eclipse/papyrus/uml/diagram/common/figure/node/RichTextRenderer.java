/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.figure.node;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.AnimatableScrollPane;
import org.eclipse.nebula.widgets.richtext.RichTextPainter;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;

/**
 * @since 2.0
 */
public class RichTextRenderer implements HTMLRenderer {

	/** HTML painter */
	protected RichTextPainter painter;

	/** Figure to paint on */
	protected ImageFigure renderFigure;

	/** Image representing HTML content */
	protected Image htmlImage;
	
	private boolean validated;
	
	/**
	 * Scroll pane to wrap the renderFigure
	 */
	protected AnimatableScrollPane contentPane;
	//protected ScrollPane contentPane;

	@Override
	public IFigure getFigure() {
		renderFigure = new ImageFigure();
		renderFigure.setOpaque(false);
		
		contentPane = new AnimatableScrollPane();
		//contentPane = new ScrollPane();
		contentPane.setOpaque(false);
		contentPane.setScrollBarVisibility(ScrollPane.AUTOMATIC);
		contentPane.setContents(renderFigure);

		painter = new RichTextPainter(true);

		validated = false;
		
		return contentPane;
	}

	@Override
	public void paintHTML(String text, int width, int height, int x, int y) {
		if (renderFigure == null || painter == null || contentPane == null) {
			return;
		}
		
		// Validate first time, otherwise infinite layout loop
		if (!validated) {
			contentPane.setPreferredSize(width, height);
			contentPane.validate();
		}
		
		if (htmlImage != null) {
			htmlImage.dispose();
		}

		// Create a transparent background
		htmlImage = getTransparentBackground(Display.getDefault(), width, height);
		if (htmlImage == null) {
			htmlImage = new Image(Display.getDefault(), width, height);
		}
		
		if (htmlImage != null) {
			// Compute the preferred size of the image to display all of the HTML content
			GC gc = new GC(htmlImage);
			Rectangle bounds = new Rectangle(x, y, width, height);
			painter.preCalculate(text != null ? text : "", gc, bounds, true);
			boolean changeBounds = false;
			if (width < getPreferredSize().x) {
				width = getPreferredSize().x;
				changeBounds = true;
			}
			if (height < getPreferredSize().y) {
				height = getPreferredSize().y;
				changeBounds = true;
			}

			// Changing bounds means creating a new image with new width and height, its gc, and the new bounds for the painter
			if (changeBounds) {
				gc.dispose();
				htmlImage.dispose();

				htmlImage = getTransparentBackground(Display.getDefault(), width, height);
				if (htmlImage == null) {
					htmlImage = new Image(Display.getDefault(), width, height);
				}
				gc = new GC(htmlImage);

				bounds = new Rectangle(x, y, width, height);
			}
			
			// Paint and clean up
			painter.paintHTML(text != null ? text : "", gc, bounds); //$NON-NLS-1$
			if (gc != null) {
				gc.dispose();
			}
			
			renderFigure.setImage(htmlImage);
		}
	}

	@Override
	public Point getPreferredSize() {
		return painter.getPreferredSize();
	}

	private Image getTransparentBackground(Display device, int width, int height) {
		try {
			Image src = new Image(device, width, height);
			ImageData imageData = src.getImageData();
			imageData.alpha = 0;
			src.dispose();
			return new Image(device, imageData); 
		} catch (Exception e) {
			Activator.log.error(e);
		}

		return null;
	}
}
