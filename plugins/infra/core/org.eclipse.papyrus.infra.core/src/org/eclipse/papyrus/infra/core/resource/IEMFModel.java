/*****************************************************************************
 * Copyright (c) 2013, 2016 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 485220
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A IModel which handles EMF Resources
 *
 * @author Camille Letavernier
 *
 */
public interface IEMFModel extends IModel {

	/**
	 * Returns the main resource associated to this model
	 *
	 * @return
	 */
	public Resource getResource();

	/**
	 * Obtains the top-level model elements in the main resource associated with this model.
	 * 
	 * @return the model roots, or an empty iterable if either there definitively are none
	 *         or they cannot be determined (for example, because the main resource is a controlled
	 *         unit and the parent unit is not available)
	 */
	public Iterable<? extends EObject> getRootElements();

	/**
	 * Called when a resource is loaded. Implement this method to configure
	 * the resource or load related resources
	 *
	 * @param resource
	 */
	public void handle(Resource resource);

	/**
	 * Returns true if the resource is a controlled resource
	 *
	 * @param resource
	 * @return
	 */
	public boolean isControlled(Resource resource);

}
