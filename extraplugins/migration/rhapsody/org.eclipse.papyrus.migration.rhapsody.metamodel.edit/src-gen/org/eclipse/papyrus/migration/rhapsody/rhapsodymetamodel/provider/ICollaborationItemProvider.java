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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.ICollaboration;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyFactory;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.ICollaboration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ICollaborationItemProvider extends IModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICollaborationItemProvider(AdapterFactory adapterFactory) {
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
			addModifiedTimeWeakPropertyDescriptor(object);
			addObjectCreationPropertyDescriptor(object);
			addUmlDependencyIDPropertyDescriptor(object);
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
				 getString("_UI_ICollaboration_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ICollaboration_id_feature", "_UI_ICollaboration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getICollaboration_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified Time Weak feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedTimeWeakPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ICollaboration_modifiedTimeWeak_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ICollaboration_modifiedTimeWeak_feature", "_UI_ICollaboration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getICollaboration_ModifiedTimeWeak(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Creation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectCreationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ICollaboration_objectCreation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ICollaboration_objectCreation_feature", "_UI_ICollaboration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getICollaboration_ObjectCreation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uml Dependency ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUmlDependencyIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ICollaboration_umlDependencyID_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ICollaboration_umlDependencyID_feature", "_UI_ICollaboration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getICollaboration_UmlDependencyID(),
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
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_ClassifierRoles());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_Messages());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_Annotations());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_AssociationRoles());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_CombinedFragments());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_P_MessageHandler());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_InteractionOccurrences());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getICollaboration_ExecutionOccurrences());
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
	 * This returns ICollaboration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ICollaboration")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ICollaboration)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ICollaboration_type") : //$NON-NLS-1$
			getString("_UI_ICollaboration_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ICollaboration.class)) {
			case UMLRhapsodyPackage.ICOLLABORATION__ID:
			case UMLRhapsodyPackage.ICOLLABORATION__MODIFIED_TIME_WEAK:
			case UMLRhapsodyPackage.ICOLLABORATION__OBJECT_CREATION:
			case UMLRhapsodyPackage.ICOLLABORATION__UML_DEPENDENCY_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLRhapsodyPackage.ICOLLABORATION__CLASSIFIER_ROLES:
			case UMLRhapsodyPackage.ICOLLABORATION__MESSAGES:
			case UMLRhapsodyPackage.ICOLLABORATION__ANNOTATIONS:
			case UMLRhapsodyPackage.ICOLLABORATION__ASSOCIATION_ROLES:
			case UMLRhapsodyPackage.ICOLLABORATION__COMBINED_FRAGMENTS:
			case UMLRhapsodyPackage.ICOLLABORATION__PMESSAGE_HANDLER:
			case UMLRhapsodyPackage.ICOLLABORATION__INTERACTION_OCCURRENCES:
			case UMLRhapsodyPackage.ICOLLABORATION__EXECUTION_OCCURRENCES:
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
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_ClassifierRoles(),
				 UMLRhapsodyFactory.eINSTANCE.createIClassifierRole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_Messages(),
				 UMLRhapsodyFactory.eINSTANCE.createIMessage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_Annotations(),
				 UMLRhapsodyFactory.eINSTANCE.createIConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_AssociationRoles(),
				 UMLRhapsodyFactory.eINSTANCE.createIAssociationRole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_CombinedFragments(),
				 UMLRhapsodyFactory.eINSTANCE.createICombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_P_MessageHandler(),
				 UMLRhapsodyFactory.eINSTANCE.createCollEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_InteractionOccurrences(),
				 UMLRhapsodyFactory.eINSTANCE.createIInteractionOccurrence()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getICollaboration_ExecutionOccurrences(),
				 UMLRhapsodyFactory.eINSTANCE.createIExecutionOccurrence()));
	}

}
