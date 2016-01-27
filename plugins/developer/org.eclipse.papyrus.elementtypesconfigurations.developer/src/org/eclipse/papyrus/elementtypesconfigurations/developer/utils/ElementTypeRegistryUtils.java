/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.elementtypesconfigurations.developer.utils;

import java.lang.reflect.Field;

import org.eclipse.gmf.runtime.emf.type.core.MetamodelType;
import org.eclipse.papyrus.infra.elementtypesconfigurations.Activator;


public class ElementTypeRegistryUtils {


	static public synchronized Field getNullElementTypeEditHelper() {

		Field declaredField = null;
		try {
			declaredField = MetamodelType.class.getDeclaredField("editHelper");
		} catch (SecurityException e1) {
			Activator.log.error(e1);
			return null;
		} catch (NoSuchFieldException e1) {
			Activator.log.error(e1);
			return null;
		}
		if (declaredField == null) {
			Activator.log.error("impossible to find editHelper", null);
			return null;
		}
		declaredField.setAccessible(true);

		return declaredField;
	}

}