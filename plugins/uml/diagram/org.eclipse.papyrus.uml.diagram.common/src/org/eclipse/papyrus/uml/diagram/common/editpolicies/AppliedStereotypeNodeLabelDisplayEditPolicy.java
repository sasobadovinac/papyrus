/*****************************************************************************
 * Copyright (c) 2009, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 429275
 *  Celine Janssens (ALL4TEC) celine.janssens@all4tec.net - Bug 455311 : Refactor Stereotype Display
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.editpolicies;

import org.eclipse.draw2d.IFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IPapyrusEditPart;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeUMLElementFigure;

/**
 * this edit policy can be apply only on {@link IPapyrusEditPart} in order to
 * access to primary figure. the primary figure has to be a {@link IPapyrusNodeUMLElementFigure}
 */
public class AppliedStereotypeNodeLabelDisplayEditPolicy extends AppliedStereotypeLabelDisplayEditPolicy {

	private String EMPTY_STRING = "";

	public AppliedStereotypeNodeLabelDisplayEditPolicy() {
		super();
	}

	public AppliedStereotypeNodeLabelDisplayEditPolicy(String tag) {
		super(tag);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy#refreshStereotypeDisplay()
	 *
	 */
	@Override
	protected void refreshStereotypeDisplay() {
		IFigure figure = ((IPapyrusEditPart) hostEditPart).getPrimaryShape();
		if (figure instanceof IPapyrusNodeUMLElementFigure) {

			refreshAppliedStereotypesPropertiesInBrace((IPapyrusNodeUMLElementFigure) figure);
		}
	}


	/**
	 * Refreshes the stereotypes properties displayed in Braces above name of the element
	 * in this edit part.
	 * 
	 * @param stereotypesPropertiesToDisplay
	 */
	protected void refreshAppliedStereotypesPropertiesInBrace(IPapyrusNodeUMLElementFigure figure) {
		String toDisplayInBrace = helper.getStereotypePropertiesInBrace(hostView);

		if (!EMPTY_STRING.equals(toDisplayInBrace)) {
			figure.setStereotypePropertiesInBrace(toDisplayInBrace);
		} else {
			figure.setStereotypePropertiesInBrace(null);
		}
	}


}
