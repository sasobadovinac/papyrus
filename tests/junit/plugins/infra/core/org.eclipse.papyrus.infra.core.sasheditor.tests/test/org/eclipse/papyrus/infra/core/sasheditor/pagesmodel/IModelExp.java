/*****************************************************************************
 * Copyright (c) 2013 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.pagesmodel;

/**
 * A Model Expression represent an expression used to describe a PagesModel.
 * Term implementing this interface can be used as starting point of expression.
 * <br>
 * Following classses are expressions: {@link PanelTerm}, {@link WindowTerm}, {@link PagesModel}.
 * 
 * @author cedric dumoulin
 * TODO Rename to IModelExp
 */
public interface IModelExp extends IModelObject {

}
