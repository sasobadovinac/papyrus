/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Tatiana Fesenko (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.ui.extension.commands;

import org.eclipse.papyrus.infra.core.resource.ModelSet;

/**
 * The Interface IModelCreationCommand.
 * 
 * @since 1.2
 */
public interface IModelCreationCommand {

	/**
	 * Creates the model.
	 *
	 * @param modelSet
	 *            the modelSet set
	 */
	void createModel(final ModelSet modelSet);

}
