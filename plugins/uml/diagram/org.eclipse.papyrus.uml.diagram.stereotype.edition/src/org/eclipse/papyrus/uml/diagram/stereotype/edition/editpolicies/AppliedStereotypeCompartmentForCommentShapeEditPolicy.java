/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Celine Janssens (ALL4TEC) celine.janssens@all4tec.net - Bug 460356 : Refactor Stereotype Display
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.stereotype.edition.editpolicies;

import org.eclipse.gmf.runtime.notation.EObjectValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.papyrus.uml.diagram.common.stereotype.StereotypeDisplayUtils;
import org.eclipse.uml2.uml.Element;


/**
 * • AppliedStereotypeCompartmentForCommentShapeEditPolicy is another editpolicy attached
 * to StereotypeCommentEdipart. It does the same work as AppliedStereotypeCompartmentEditPolicy.
 * Because the StereotypeCommentEdipart is not attached to a semantic element by the attribute element of the notation view. It specializes the method
 * getUMLElement to find the semantic element
 *
 */
public class AppliedStereotypeCompartmentForCommentShapeEditPolicy extends AppliedStereotypeCompartmentEditPolicy {

	/**
	 * Returns the uml element controlled by the host edit part
	 *
	 * @return the uml element controlled by the host edit part
	 */
	@Override
	protected Element getUMLElement() {
		if ((Element) getView().getElement() != null) {
			return (Element) getView().getElement();
		}
		if (getView().getNamedStyle(NotationPackage.eINSTANCE.getEObjectValueStyle(), StereotypeDisplayUtils.STEREOTYPE_COMMENT_RELATION_NAME) != null) {
			EObjectValueStyle eObjectValueStyle = (EObjectValueStyle) getView().getNamedStyle(NotationPackage.eINSTANCE.getEObjectValueStyle(), StereotypeDisplayUtils.STEREOTYPE_COMMENT_RELATION_NAME);
			return (Element) eObjectValueStyle.getEObjectValue();
		}
		return null;
	}


	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy#refreshNotationStructure()
	 *
	 */
	@Override
	public void refreshNotationStructure() {
		// NothingToDo

	}

}
