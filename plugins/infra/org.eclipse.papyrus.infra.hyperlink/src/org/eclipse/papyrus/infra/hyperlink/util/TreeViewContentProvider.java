/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
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

package org.eclipse.papyrus.infra.hyperlink.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.infra.emf.providers.strategy.SemanticEMFContentProvider;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;

/**
 * Specific content provider for the tree view of the "views" dialog to choose a diagram for a hyperlink
 */
public class TreeViewContentProvider extends SemanticEMFContentProvider {
	public TreeViewContentProvider(EObject[] roots) {
		super(null, null, roots);
	}
	
	@Override
	public boolean hasChildren(Object element) {
		return super.getChildren(element).length > 0;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.emf.providers.MoDiscoContentProvider#getChildren(java.lang.Object)
	 *
	 * @param parentElement
	 * @return
	 */
	// in some case we return diagram twice!
	// TODO the best correction we be able to manage applied facet, because if we get diagram twice it is probably because there are 2 facets with the same behavior applied
	@Override
	public Object[] getChildren(Object parentElement) {
		Set<Object> alreadyVisited = new HashSet<Object>();
		List<Object> returnedChildren = new ArrayList<Object>();
		Object[] children = super.getChildren(parentElement);
		for (Object current : children) {
			EObject el = EMFHelper.getEObject(current);
			if (el != null) {
				if (!alreadyVisited.contains(el)) {
					returnedChildren.add(current);
					alreadyVisited.add(el);
				}
			}
		}
		return returnedChildren.toArray();
	}
}