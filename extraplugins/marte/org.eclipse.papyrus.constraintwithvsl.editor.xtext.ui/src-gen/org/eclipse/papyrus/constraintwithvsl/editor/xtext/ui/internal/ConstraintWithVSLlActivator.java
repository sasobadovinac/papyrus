
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
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class ConstraintWithVSLlActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static ConstraintWithVSLlActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("org.eclipse.papyrus.constraintwithvsl.editor.xtext.ConstraintWithVSLl", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("org.eclipse.papyrus.constraintwithvsl.editor.xtext.ConstraintWithVSLl")).with(getUiModule("org.eclipse.papyrus.constraintwithvsl.editor.xtext.ConstraintWithVSLl"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static ConstraintWithVSLlActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("org.eclipse.papyrus.constraintwithvsl.editor.xtext.ConstraintWithVSLl".equals(grammar)) {
		  return new org.eclipse.papyrus.constraintwithvsl.editor.xtext.ConstraintWithVSLlRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("org.eclipse.papyrus.constraintwithvsl.editor.xtext.ConstraintWithVSLl".equals(grammar)) {
		  return new org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.ConstraintWithVSLlUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}
