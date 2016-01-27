/*****************************************************************************
 * Copyright (c) 2012, 2016 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 485220
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.ui.emf.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.papyrus.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.papyrus.infra.emf.utils.HistoryUtil;
import org.eclipse.papyrus.infra.ui.emf.providers.EMFGraphicalContentProvider;
import org.eclipse.papyrus.infra.ui.emf.providers.strategy.ContainmentBrowseStrategy;
import org.eclipse.papyrus.infra.ui.internal.emf.Activator;
import org.eclipse.papyrus.infra.widgets.strategy.ProviderBasedBrowseStrategy;
import org.eclipse.papyrus.infra.widgets.strategy.StrategyBasedContentProvider;
import org.eclipse.papyrus.infra.widgets.strategy.TreeBrowseStrategy;


public class ProviderHelper {

	/**
	 * Obtains the customization manager used by Papyrus's EMFFacet-based content providers.
	 * 
	 * @return the customization manager
	 */
	public static ICustomizationManager getCustomizationManager() {
		return Activator.getDefault().getCustomizationManager();
	}

	/**
	 * Encapsulates the given content provider in a higher-level content provider
	 * The returned provider uses two different strategies to display and search
	 * elements, and adds a pattern filter and an History
	 *
	 * @param provider
	 *            The ContentProvider to encapsulate
	 * @return
	 */
	public static EMFGraphicalContentProvider encapsulateProvider(ITreeContentProvider provider, ResourceSet resourceSet, String historyId) {
		TreeBrowseStrategy browseStrategy = new ProviderBasedBrowseStrategy(provider);
		TreeBrowseStrategy revealStrategy = new ContainmentBrowseStrategy(provider);
		IStructuredContentProvider strategyProvider = new StrategyBasedContentProvider(browseStrategy, revealStrategy);
		EMFGraphicalContentProvider graphicalProvider = new EMFGraphicalContentProvider(strategyProvider, resourceSet, historyId);

		return graphicalProvider;
	}

	/**
	 * Encapsulates the given content provider in a higher-level content provider
	 * The returned provider uses two different strategies to display and search
	 * elements, and adds a pattern filter and an History
	 *
	 * @param provider
	 *            The ContentProvider to encapsulate
	 * @return
	 */
	public static EMFGraphicalContentProvider encapsulateProvider(ITreeContentProvider provider, EObject editedEObject, EStructuralFeature feature) {
		ResourceSet rs = editedEObject == null ? null : editedEObject.eResource() == null ? null : editedEObject.eResource().getResourceSet();
		return encapsulateProvider(provider, rs, HistoryUtil.getHistoryID(editedEObject, feature));
	}
}