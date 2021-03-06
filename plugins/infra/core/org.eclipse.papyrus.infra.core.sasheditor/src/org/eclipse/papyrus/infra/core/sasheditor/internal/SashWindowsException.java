/*****************************************************************************
 * Copyright (c) 2009 CEA LIST & LIFL
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
package org.eclipse.papyrus.infra.core.sasheditor.internal;


/**
 * Main Exception from the SashWindowsSystem.
 *
 * @author dumoulin
 */
public class SashWindowsException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public SashWindowsException() {
	}

	/**
	 * @param message
	 */
	public SashWindowsException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public SashWindowsException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SashWindowsException(String message, Throwable cause) {
		super(message, cause);
	}

}
