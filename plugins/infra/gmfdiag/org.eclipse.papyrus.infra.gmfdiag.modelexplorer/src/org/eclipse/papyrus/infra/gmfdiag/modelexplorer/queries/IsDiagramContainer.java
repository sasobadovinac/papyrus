/**
 *  Copyright (c) 2011 Atos.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Atos - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.gmfdiag.modelexplorer.queries;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.views.modelexplorer.NavigatorUtils;
import org.eclipse.papyrus.views.modelexplorer.queries.AbstractEditorContainerQuery;

public class IsDiagramContainer extends AbstractEditorContainerQuery implements IJavaQuery2<EObject, Boolean> {

	/**
	 * Return true if the element is a Diagram Container
	 */
	public Boolean evaluate(EObject source, IParameterValueList2 parameterValues, IFacetManager facetManager) throws DerivedTypedElementException {
		Iterator<EObject> roots = NavigatorUtils.getNotationRoots(source);

		if(roots != null) {
			while(roots.hasNext()) {
				EObject root = roots.next();
				if(root instanceof Diagram) {
					return DiagramUtils.getOwner((Diagram)root) == source;
				}
			}
		}

		return false; //Return super...
	}

}
