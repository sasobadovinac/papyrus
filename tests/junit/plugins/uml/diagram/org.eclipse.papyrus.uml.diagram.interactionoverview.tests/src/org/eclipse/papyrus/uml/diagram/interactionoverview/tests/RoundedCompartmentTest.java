/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *   
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.interactionoverview.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.papyrus.uml.diagram.interactionoverview.edit.part.CallBehaviorActionAsInteractionEditPart;
import org.eclipse.papyrus.uml.diagram.interactionoverview.edit.part.CustomActivityEditPartTN;
import org.eclipse.papyrus.uml.diagram.interactionoverview.edit.part.CustomInteractionUseEditPartCN;
import org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractGenericShapeTest;

/**
 * The Class RoundedCompartmentTest use to test if edit part which need it, extends RoundCompartmentEditPart and RoundBorderNameElementEditPart.
 */
public class RoundedCompartmentTest extends AbstractGenericShapeTest {

	/**
	 * Gets the rounded compartment edit parts.
	 *
	 * @return the rounded compartment edit parts
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractGenericShapeTest#getRoundedCompartmentEditParts()
	 */
	public List<Class<?>> getRoundedCompartmentEditParts() {
		List<Class<?>> classes = new ArrayList<Class<?>>();

		classes.add(CustomActivityEditPartTN.class);
		classes.add(CallBehaviorActionAsInteractionEditPart.class);
		classes.add(CustomInteractionUseEditPartCN.class);

		return classes;
	}

	/**
	 * Gets the rounded border named element edit parts.
	 *
	 * @return the rounded border named element edit parts
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractGenericShapeTest#getRoundedBorderNamedElementEditParts()
	 */
	public List<Class<?>> getRoundedBorderNamedElementEditParts() {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		return classes;
	}
}
