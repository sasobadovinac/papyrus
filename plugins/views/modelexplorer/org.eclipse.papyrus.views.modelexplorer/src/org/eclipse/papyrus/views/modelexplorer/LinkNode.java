/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Philippe ROLAND (Atos) - initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer;

/**
 * Empty Interface. Used by ModelExplorer to refer to any object referencing TreeItems
 *
 * @author proland
 */
public interface LinkNode {

	static class LinkNodeImpl implements LinkNode {
	}

	public static LinkNode LinkNodeInstance = new LinkNodeImpl();
}
