/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.internalblock.provider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.papyrus.sysml.diagram.internalblock.Activator;
import org.eclipse.papyrus.sysml.diagram.internalblock.factory.InternalBlockDiagramViewFactory;

public class InternalBlockDiagramViewProvider extends AbstractViewProvider {

	@Override
	protected boolean provides(CreateDiagramViewOperation operation) {

		if(ElementTypes.DIAGRAM_ID.equals(operation.getSemanticHint())) {
			return true;
		}

		return false;
	}

	@Override
	protected Class<?> getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		if(ElementTypes.DIAGRAM_ID.equals(diagramKind)) {
			return InternalBlockDiagramViewFactory.class;
		}

		Activator.log.error(new Exception("Could not create View."));
		return null;
	}
}
