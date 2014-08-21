/*******************************************************************************
 * Copyright (c) 2006 - 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     CEA LIST - initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.cpp.codegen.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.cpp.codegen.Activator;


public class CppCodeGenPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(CppCodeGenConstants.P_HEADER_SUFFIX, "h"); //$NON-NLS-1$
		store.setDefault(CppCodeGenConstants.P_IMPLEM_SUFFIX, "cpp"); //$NON-NLS-1$
		store.setDefault(CppCodeGenConstants.P_OUT_INOUT_OP, "*"); //$NON-NLS-1$
		store.setDefault(CppCodeGenConstants.P_PROJECT_PREFIX, "org.eclipse.papyrus.cppgen."); //$NON-NLS-1$

		// Default value for P_COMMENT_HEADER
		String NL = System.getProperties().getProperty("line.separator"); //$NON-NLS-1$
		String defaultValue =
				"// --------------------------------------------------------" + NL + //$NON-NLS-1$
						"// Code generated by Papyrus C++" + NL + //$NON-NLS-1$
						"// --------------------------------------------------------" + NL + NL; //$NON-NLS-1$
		store.setDefault(CppCodeGenConstants.P_COMMENT_HEADER, defaultValue);
	}
}
