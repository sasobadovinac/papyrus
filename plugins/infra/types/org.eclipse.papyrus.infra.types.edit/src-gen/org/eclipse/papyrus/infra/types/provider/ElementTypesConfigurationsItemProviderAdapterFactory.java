/**
 * Copyright (c) 2014 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.infra.types.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.papyrus.infra.types.ElementTypesConfigurationsPackage;

import org.eclipse.papyrus.infra.types.util.ElementTypesConfigurationsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementTypesConfigurationsItemProviderAdapterFactory extends ElementTypesConfigurationsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(TypesConfigurationsEditPlugin.INSTANCE, ElementTypesConfigurationsPackage.eNS_URI);

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
	public ElementTypesConfigurationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTypeSetConfigurationItemProvider elementTypeSetConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementTypeSetConfigurationAdapter() {
		if (elementTypeSetConfigurationItemProvider == null) {
			elementTypeSetConfigurationItemProvider = new ElementTypeSetConfigurationItemProvider(this);
		}

		return elementTypeSetConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.IconEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconEntryItemProvider iconEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.IconEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIconEntryAdapter() {
		if (iconEntryItemProvider == null) {
			iconEntryItemProvider = new IconEntryItemProvider(this);
		}

		return iconEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationTypeConfigurationItemProvider specializationTypeConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecializationTypeConfigurationAdapter() {
		if (specializationTypeConfigurationItemProvider == null) {
			specializationTypeConfigurationItemProvider = new SpecializationTypeConfigurationItemProvider(this);
		}

		return specializationTypeConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.ContainerConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerConfigurationItemProvider containerConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.ContainerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerConfigurationAdapter() {
		if (containerConfigurationItemProvider == null) {
			containerConfigurationItemProvider = new ContainerConfigurationItemProvider(this);
		}

		return containerConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.MetamodelTypeConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelTypeConfigurationItemProvider metamodelTypeConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.MetamodelTypeConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetamodelTypeConfigurationAdapter() {
		if (metamodelTypeConfigurationItemProvider == null) {
			metamodelTypeConfigurationItemProvider = new MetamodelTypeConfigurationItemProvider(this);
		}

		return metamodelTypeConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.EditHelperAdviceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditHelperAdviceConfigurationItemProvider editHelperAdviceConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.EditHelperAdviceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditHelperAdviceConfigurationAdapter() {
		if (editHelperAdviceConfigurationItemProvider == null) {
			editHelperAdviceConfigurationItemProvider = new EditHelperAdviceConfigurationItemProvider(this);
		}

		return editHelperAdviceConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.AdviceBindingConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceBindingConfigurationItemProvider adviceBindingConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.AdviceBindingConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdviceBindingConfigurationAdapter() {
		if (adviceBindingConfigurationItemProvider == null) {
			adviceBindingConfigurationItemProvider = new AdviceBindingConfigurationItemProvider(this);
		}

		return adviceBindingConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.MatcherConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatcherConfigurationItemProvider matcherConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.MatcherConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatcherConfigurationAdapter() {
		if (matcherConfigurationItemProvider == null) {
			matcherConfigurationItemProvider = new MatcherConfigurationItemProvider(this);
		}

		return matcherConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.ExternallyRegisteredType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternallyRegisteredTypeItemProvider externallyRegisteredTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.ExternallyRegisteredType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternallyRegisteredTypeAdapter() {
		if (externallyRegisteredTypeItemProvider == null) {
			externallyRegisteredTypeItemProvider = new ExternallyRegisteredTypeItemProvider(this);
		}

		return externallyRegisteredTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.types.ExternallyRegisteredAdvice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternallyRegisteredAdviceItemProvider externallyRegisteredAdviceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.types.ExternallyRegisteredAdvice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternallyRegisteredAdviceAdapter() {
		if (externallyRegisteredAdviceItemProvider == null) {
			externallyRegisteredAdviceItemProvider = new ExternallyRegisteredAdviceItemProvider(this);
		}

		return externallyRegisteredAdviceItemProvider;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
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
		if (elementTypeSetConfigurationItemProvider != null) elementTypeSetConfigurationItemProvider.dispose();
		if (iconEntryItemProvider != null) iconEntryItemProvider.dispose();
		if (specializationTypeConfigurationItemProvider != null) specializationTypeConfigurationItemProvider.dispose();
		if (containerConfigurationItemProvider != null) containerConfigurationItemProvider.dispose();
		if (metamodelTypeConfigurationItemProvider != null) metamodelTypeConfigurationItemProvider.dispose();
		if (editHelperAdviceConfigurationItemProvider != null) editHelperAdviceConfigurationItemProvider.dispose();
		if (adviceBindingConfigurationItemProvider != null) adviceBindingConfigurationItemProvider.dispose();
		if (matcherConfigurationItemProvider != null) matcherConfigurationItemProvider.dispose();
		if (externallyRegisteredTypeItemProvider != null) externallyRegisteredTypeItemProvider.dispose();
		if (externallyRegisteredAdviceItemProvider != null) externallyRegisteredAdviceItemProvider.dispose();
	}

}
