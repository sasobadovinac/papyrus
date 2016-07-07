/*****************************************************************************
 * Copyright (c) 2010, 2016 CEA LIST, Esterel technologies SAS and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Alain Le Guennec (Esterel technologies SAS) - Bug 497455
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.service.types.matcher;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.papyrus.sysml.constraints.ConstraintProperty;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Test if current {@link Property} is a {@link ConstraintProperty}
 */
public class ConstraintPropertyMatcher implements IElementMatcher {

	public boolean matches(EObject eObject) {

		boolean isMatch = false;
		if (eObject instanceof Property) {

			Property element = (Property) eObject;
			Type type = element.getType();
			// A ConstraintProperty is necessarily typed by a ConstraintBlock which must be a Class.
			if (type instanceof Class && UMLUtil.getStereotypeApplication(element, ConstraintProperty.class) != null) {
				isMatch = true;
			}
		}
		return isMatch;
	}

}
