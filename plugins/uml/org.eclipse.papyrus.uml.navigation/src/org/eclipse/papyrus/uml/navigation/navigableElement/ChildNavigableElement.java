/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Shuai Li (CEA LIST) shuai.li@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.navigation.navigableElement;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;

/**
 * Navigable element representing the target of a directed relationship
 *
 */
public class ChildNavigableElement extends GenericNavigableElement {

	public ChildNavigableElement(Generalization generalization) {
		super(generalization.getSpecific());
	}
	
	public ChildNavigableElement(Element child) {
		super(child);
	}

	@Override
	public String getLabel() {
		return "Go to child" + getElementLabel() + "...";
	}

	@Override
	public String getDescription() {
		return "Go to the child:" + getElementLabel();
	}
}