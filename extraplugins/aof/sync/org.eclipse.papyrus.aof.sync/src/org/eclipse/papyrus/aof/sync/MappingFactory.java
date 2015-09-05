/*****************************************************************************
 * Copyright (c) 2015 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.aof.sync;

import java.lang.reflect.Type;

import org.eclipse.papyrus.aof.sync.internal.CustomInjectionModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.util.Modules;

/**
 * A factory of {@linkplain IMapping mappings} for some domain. It uses Google Guice
 * to configure the {@linkplain IMapping mapping rules}, {@linkplain ICorrespondenceResolver correspondences},
 * and other parameters.
 */
public class MappingFactory {
	private final Injector guice;

	public MappingFactory() {
		this(new MappingModule());
	}

	public MappingFactory(Module... module) {
		super();

		guice = Guice.createInjector(Modules.override(new CustomInjectionModule()).with(module));
	}

	/**
	 * Obtains a mapping relation between objects of the specified {@code type}.
	 * 
	 * @param type
	 *            the mapping type
	 * 
	 * @return the mapping
	 */
	public final <T> IMapping<T> getMapping(Class<T> type) {
		return getInstance(IMapping.class, type);
	}

	/**
	 * Obtains the Guice-supplied binding for the specified {@code key}.
	 * 
	 * @param key
	 *            a binding key
	 * 
	 * @return the bound object
	 */
	public final <T> T getInstance(Key<T> key) {
		return guice.getInstance(key);
	}

	/**
	 * Obtains a Guice-supplied binding for a {@link Key} specified by the given type signature.
	 * 
	 * @param baseType
	 *            the base type of the injected type signature
	 * @param arguments
	 *            optional sequence of types substituted for the generic type parameters of the {@code baseType}
	 * 
	 * @return the bound object
	 */
	public final <T> T getInstance(Class<?> baseType, Type... arguments) {
		return getInstance(MappingModule.key(baseType, arguments));
	}
}