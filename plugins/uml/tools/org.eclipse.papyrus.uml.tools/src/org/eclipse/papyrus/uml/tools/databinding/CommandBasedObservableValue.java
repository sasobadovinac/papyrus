/*****************************************************************************
 * Copyright (c) 2011, 2016 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 485220
 *  
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.databinding;

/**
 * @deprecated Use the {@link org.eclipse.papyrus.infra.tools.databinding.CommandBasedObservableValue} API, instead.
 */
@Deprecated
public interface CommandBasedObservableValue extends CommandBasedObservable, org.eclipse.papyrus.infra.tools.databinding.CommandBasedObservableValue {
	// Nothing additional
}
