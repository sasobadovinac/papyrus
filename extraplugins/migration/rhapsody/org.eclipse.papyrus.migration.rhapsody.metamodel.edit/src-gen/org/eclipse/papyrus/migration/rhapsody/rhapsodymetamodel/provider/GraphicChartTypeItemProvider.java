/**
 *   Copyright (c) 2016 CEA LIST and others.
 *   
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *     CEA LIST - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.GraphicChartType;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyFactory;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.GraphicChartType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicChartTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicChartTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addM_accessPropertyDescriptor(object);
			addElementListPropertyDescriptor(object);
			addM_nModifyDatePropertyDescriptor(object);
			addM_currentLeftTopPropertyDescriptor(object);
			addM_modifiedPropertyDescriptor(object);
			addM_nCreateDatePropertyDescriptor(object);
			addM_pParentPropertyDescriptor(object);
			addM_arrowStylePropertyDescriptor(object);
			addM_drawBehaviorPropertyDescriptor(object);
			addM_currentRightBottomPropertyDescriptor(object);
			addM_creatorPropertyDescriptor(object);
			addM_bScaleWithZoomPropertyDescriptor(object);
			addM_typePropertyDescriptor(object);
			addM_fileVersionPropertyDescriptor(object);
			addM_bIsPreferencesInitializedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_id_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maccess feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_accessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_access_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_access_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_elementList_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_elementList_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_ElementList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the MnModify Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_nModifyDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_nModifyDate_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_nModifyDate_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_nModifyDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mcurrent Left Top feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_currentLeftTopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_currentLeftTop_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_currentLeftTop_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_currentLeftTop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mmodified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_modifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_modified_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_modified_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_modified(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the MnCreate Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_nCreateDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_nCreateDate_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_nCreateDate_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_nCreateDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the MpParent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_pParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_pParent_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_pParent_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_pParent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Marrow Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_arrowStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_arrowStyle_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_arrowStyle_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_arrowStyle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mdraw Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_drawBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_drawBehavior_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_drawBehavior_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_drawBehavior(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mcurrent Right Bottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_currentRightBottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_currentRightBottom_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_currentRightBottom_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_currentRightBottom(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mcreator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_creatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_creator_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_creator_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_creator(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the MbScale With Zoom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_bScaleWithZoomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_bScaleWithZoom_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_bScaleWithZoom_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_bScaleWithZoom(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mtype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_type_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mfile Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_fileVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_fileVersion_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_fileVersion_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_fileVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the MbIs Preferences Initialized feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_bIsPreferencesInitializedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicChartType_m_bIsPreferencesInitialized_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicChartType_m_bIsPreferencesInitialized_feature", "_UI_GraphicChartType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_bIsPreferencesInitialized(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_name());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphicChartType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicChartType_type") : //$NON-NLS-1$
			getString("_UI_GraphicChartType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GraphicChartType.class)) {
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__ID:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MACCESS:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__ELEMENT_LIST:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MNMODIFY_DATE:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MCURRENT_LEFT_TOP:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MMODIFIED:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MNCREATE_DATE:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MPPARENT:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MARROW_STYLE:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MDRAW_BEHAVIOR:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MCURRENT_RIGHT_BOTTOM:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MCREATOR:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MBSCALE_WITH_ZOOM:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MTYPE:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MFILE_VERSION:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MBIS_PREFERENCES_INITIALIZED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__GRAPH_ELEMENTS:
			case UMLRhapsodyPackage.GRAPHIC_CHART_TYPE__MNAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIActionState()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIActiveX()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIAnchor()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIArrow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIAssociationRole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIBasicClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIBlockState()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIBox()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIButtonArray()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIClassifierRole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGICompositeClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIConnector()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIContainArrow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIDiagramFrame()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIFreeShape()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIFreeText()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIGenericElement()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIImage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIImageData()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMFCCtrl()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMessageLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMscColumnCR()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMscConditionMark()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMscExecutionOccurrence()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMscInteractionOccurrence()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMscInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMscInteractionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIMscMessage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIObjectInstance()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIObjectLink()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIPartition()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIPortConnector()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIState()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGISwimlaneFrame()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGITextBox()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_GraphElements(),
				 UMLRhapsodyFactory.eINSTANCE.createCGITrans()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getGraphicChartType_M_name(),
				 UMLRhapsodyFactory.eINSTANCE.createCGIText()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return rhapsodymetamodelEditPlugin.INSTANCE;
	}

}
