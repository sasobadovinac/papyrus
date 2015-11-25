/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.utils;

/**
 * This allows to define the constants for the user action.
 */
public interface UserActionConstants {

	/**
	 * The integer representing the undefined user action.
	 */
	public final static int UNDEFINED_USER_ACTION = -1;

	/**
	 * The integer representing the replace user action.
	 */
	public final static int REPLACE_USER_ACTION = 0;

	/**
	 * The integer representing the add user action.
	 */
	public final static int ADD_USER_ACTION = 1;

	/**
	 * The integer representing the skip user action.
	 */
	public final static int SKIP_USER_ACTION = 2;
	
	/**
	 * The integer representing the cancel user action.
	 */
	public final static int CANCEL_USER_ACTION = 3;
	
}
