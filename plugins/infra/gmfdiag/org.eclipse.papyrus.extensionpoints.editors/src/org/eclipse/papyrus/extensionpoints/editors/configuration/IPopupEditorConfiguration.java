/*****************************************************************************
 * Copyright (c) 2010, 2018 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  CEA LIST - initial API and implementation
 *  Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Bug 533667
 *
 *****************************************************************************/

package org.eclipse.papyrus.extensionpoints.editors.configuration;

/**
 * This interface can be used to create an IPopupEditorHelper, that can then be used to show the editor
 *
 * @deprecated since 3.1. Use {@link org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IPopupEditorConfiguration} instead.
 */
@Deprecated
public interface IPopupEditorConfiguration extends org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IPopupEditorConfiguration {

}
