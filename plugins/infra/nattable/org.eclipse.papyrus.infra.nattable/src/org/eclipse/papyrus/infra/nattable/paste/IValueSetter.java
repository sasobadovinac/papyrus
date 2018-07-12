/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.paste;

import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * Common interface used by the paste framework when we are not in the service edit.
 *
 *
 *
 * @author Vincent Lorenzo
 *
 */
public interface IValueSetter {

	/**
	 *
	 * This method will be used to set references, without using the service edit
	 *
	 * @param domain
	 *            the editing domain
	 */
	public void doSetValue(final EditingDomain domain);
}
