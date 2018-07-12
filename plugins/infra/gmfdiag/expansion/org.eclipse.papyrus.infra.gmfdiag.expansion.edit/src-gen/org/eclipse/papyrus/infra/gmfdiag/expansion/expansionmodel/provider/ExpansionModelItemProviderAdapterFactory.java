/**
 * Copyright (c) 2015 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 * 	CEA LIST - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.util.ExpansionModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpansionModelItemProviderAdapterFactory extends ExpansionModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.Representation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationItemProvider representationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.Representation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepresentationAdapter() {
		if (representationItemProvider == null) {
			representationItemProvider = new RepresentationItemProvider(this);
		}

		return representationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.RepresentationKind} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationKindItemProvider representationKindItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.RepresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepresentationKindAdapter() {
		if (representationKindItemProvider == null) {
			representationKindItemProvider = new RepresentationKindItemProvider(this);
		}

		return representationKindItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.InducedRepresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InducedRepresentationItemProvider inducedRepresentationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.InducedRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInducedRepresentationAdapter() {
		if (inducedRepresentationItemProvider == null) {
			inducedRepresentationItemProvider = new InducedRepresentationItemProvider(this);
		}

		return inducedRepresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.GraphicalElementLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalElementLibraryItemProvider graphicalElementLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.GraphicalElementLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicalElementLibraryAdapter() {
		if (graphicalElementLibraryItemProvider == null) {
			graphicalElementLibraryItemProvider = new GraphicalElementLibraryItemProvider(this);
		}

		return graphicalElementLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.UseContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseContextItemProvider useContextItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.UseContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseContextAdapter() {
		if (useContextItemProvider == null) {
			useContextItemProvider = new UseContextItemProvider(this);
		}

		return useContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.GMFT_BasedRepresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMFT_BasedRepresentationItemProvider gmfT_BasedRepresentationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.GMFT_BasedRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGMFT_BasedRepresentationAdapter() {
		if (gmfT_BasedRepresentationItemProvider == null) {
			gmfT_BasedRepresentationItemProvider = new GMFT_BasedRepresentationItemProvider(this);
		}

		return gmfT_BasedRepresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.DiagramExpansion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramExpansionItemProvider diagramExpansionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.gmfdiag.expansion.expansionmodel.DiagramExpansion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramExpansionAdapter() {
		if (diagramExpansionItemProvider == null) {
			diagramExpansionItemProvider = new DiagramExpansionItemProvider(this);
		}

		return diagramExpansionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (representationItemProvider != null) representationItemProvider.dispose();
		if (representationKindItemProvider != null) representationKindItemProvider.dispose();
		if (inducedRepresentationItemProvider != null) inducedRepresentationItemProvider.dispose();
		if (graphicalElementLibraryItemProvider != null) graphicalElementLibraryItemProvider.dispose();
		if (useContextItemProvider != null) useContextItemProvider.dispose();
		if (gmfT_BasedRepresentationItemProvider != null) gmfT_BasedRepresentationItemProvider.dispose();
		if (diagramExpansionItemProvider != null) diagramExpansionItemProvider.dispose();
	}

}
