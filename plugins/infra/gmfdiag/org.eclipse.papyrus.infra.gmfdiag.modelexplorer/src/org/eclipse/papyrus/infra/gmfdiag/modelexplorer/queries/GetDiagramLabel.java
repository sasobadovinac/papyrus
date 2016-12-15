/**
 *  Copyright (c) 2016 CEA LIST, and others.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.gmfdiag.modelexplorer.queries;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationEditPlugin;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.infra.internationalization.utils.utils.LabelInternationalization;
import org.eclipse.papyrus.infra.ui.editorsfactory.AbstractGetEditorIconQuery;

/**
 * Return the label of the corresponding diagram.
 */
public class GetDiagramLabel extends AbstractGetEditorIconQuery implements IJavaQuery2<Diagram, String> {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2#evaluate(org.eclipse.emf.ecore.EObject, org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2, org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager)
	 */
	public String evaluate(final Diagram source, final IParameterValueList2 parameterValues, final IFacetManager facetManager) throws DerivedTypedElementException {
		final String label = LabelInternationalization.getInstance().getDiagramLabel(source);
		return label == null || label.length() == 0 ? NotationEditPlugin.INSTANCE.getString("_UI_Diagram_type", true) : //$NON-NLS-1$
				NotationEditPlugin.INSTANCE.getString("_UI_Diagram_type", true) + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
}
