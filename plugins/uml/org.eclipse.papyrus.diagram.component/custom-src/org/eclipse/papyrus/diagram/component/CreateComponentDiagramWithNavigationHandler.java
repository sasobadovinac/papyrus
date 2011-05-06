/*****************************************************************************
 * Copyright (c) 2011 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.component;

import org.eclipse.papyrus.diagram.common.actions.handlers.CreateDiagramWithNavigationHandler;


public class CreateComponentDiagramWithNavigationHandler extends CreateDiagramWithNavigationHandler {

	public CreateComponentDiagramWithNavigationHandler() {
		super(new CreateComponentDiagramCommand(), new ComponentDiagramCreationCondition());
	}

}
