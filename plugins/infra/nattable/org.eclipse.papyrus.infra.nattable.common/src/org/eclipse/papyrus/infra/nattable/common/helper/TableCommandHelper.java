/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Wouters laurent.wouters@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.common.helper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.representation.PapyrusTable;
import org.eclipse.papyrus.infra.nattable.representation.RepresentationPackage;
import org.eclipse.papyrus.infra.viewpoints.policy.IViewTypeHelper;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;

/**
 * Represents the command helper for viewpoints-based generic tables
 *
 * @author Laurent Wouters
 * @since 3.0
 */
public class TableCommandHelper implements IViewTypeHelper {

	/**
	 * The cache of prototypes
	 */
	private Map<PapyrusRepresentationKind, TableViewPrototype> cache;

	@Override
	public ViewPrototype getPrototypeFor(PapyrusRepresentationKind configuration) {
		if (!(configuration instanceof PapyrusTable)) {
			return null;
		}
		if (cache == null) {
			cache = new HashMap<PapyrusRepresentationKind, TableViewPrototype>();
		}
		if (cache.containsKey(configuration)) {
			return cache.get(configuration);
		}
		TableViewPrototype proto = new TableViewPrototype((PapyrusTable) configuration);
		cache.put(configuration, proto);
		return proto;
	}

	@Override
	public boolean isSupported(EClass type) {
		return (type == RepresentationPackage.eINSTANCE.getPapyrusTable());
	}

	@Override
	public boolean isSupported(EObject view) {
		if (!(view instanceof Table)) {
			return false;
		}
		Table table = (Table) view;
		return (table.getPrototype() instanceof PapyrusTable);
	}

	@Override
	public ViewPrototype getPrototypeOf(EObject view) {
		if (!isSupported(view)) {
			return null;
		}
		PolicyChecker checker = PolicyChecker.getFor(view);
		PapyrusTable repKind = (PapyrusTable) ((Table)view).getPrototype();
		if (checker.isInViewpoint(repKind))
			return getPrototypeFor(repKind);
		return ViewPrototype.UNAVAILABLE_VIEW;
	}
}
