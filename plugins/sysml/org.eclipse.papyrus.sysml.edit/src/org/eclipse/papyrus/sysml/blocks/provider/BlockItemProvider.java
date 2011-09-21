/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.blocks.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.papyrus.sysml.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml.edit.provider.IComposableAdapterFactory;
import org.eclipse.papyrus.sysml.edit.provider.SysMLItemProviderAdapter;
import org.eclipse.papyrus.sysml.provider.SysmlEditPlugin;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.sysml.blocks.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BlockItemProvider extends SysMLItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource

{

	/**
	 * This is used to store all the property descriptors for aclass stereotyped with a block.
	 * Derived classes should add descriptors to this vector.
	 */

	protected List<IItemPropertyDescriptor> itemPropertyDescriptorsForclass;

	/**
	 * Pattern prefix of block
	 * 
	 * @generated
	 */
	private static Pattern BLOCK_PREFIX_PATTERN = Pattern.compile("(block, |<<block>>|, block)");

	/**
	 * Get the prefix pattern of CLASS_PREFIX_PATTERN
	 * 
	 * @generated
	 */

	private static Pattern CLASS_PREFIX_PATTERN = Pattern.compile("Class");

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BlockItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if(object instanceof Block) {
			if(itemPropertyDescriptors == null) {
				super.getPropertyDescriptors(object);

				addIsEncapsulatedPropertyDescriptor(object);
				addBase_ClassPropertyDescriptor(object);
			}
		}

		/**
		 * Handle Class stereotyped by Block
		 */
		if(object instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class element = (org.eclipse.uml2.uml.Class)object;
			if(itemPropertyDescriptorsForclass == null) {
				ItemProviderAdapter ite = ((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.CLASS);
				final List<IItemPropertyDescriptor> propertyDescriptors = ite.getPropertyDescriptors(this);
				itemPropertyDescriptorsForclass = new ArrayList<IItemPropertyDescriptor>();
				itemPropertyDescriptorsForclass.addAll(propertyDescriptors);
				Stereotype ste = (element).getAppliedStereotype(SysmlResource.BLOCK_ID);
				if(ste != null) {
					EObject steApplication = (element).getStereotypeApplication(ste);

					addIsEncapsulatedPropertyDescriptorForClass(steApplication);

					addBase_ClassPropertyDescriptorForClass(steApplication);

				}
			}
			return itemPropertyDescriptorsForclass;

		}

		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Encapsulated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIsEncapsulatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Block_isEncapsulated_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Block_isEncapsulated_feature", "_UI_Block_type"), BlocksPackage.Literals.BLOCK__IS_ENCAPSULATED, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Encapsulated feature for the UML element Class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIsEncapsulatedPropertyDescriptorForClass(Object object) {

		itemPropertyDescriptorsForclass.add(new ItemPropertyDescriptorDecorator(object, createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Block_isEncapsulated_feature"),

		getString("_UI_PropertyDescriptor_description", "_UI_Block_isEncapsulated_feature", "_UI_Block_type"),

		BlocksPackage.Literals.BLOCK__IS_ENCAPSULATED, true, false, false,

		ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,

		null,

		null)));

	}

	/**
	 * This adds a property descriptor for the Base Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addBase_ClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Block_base_Class_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Block_base_Class_feature", "_UI_Block_type"), BlocksPackage.Literals.BLOCK__BASE_CLASS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Base Class feature for the UML element Class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addBase_ClassPropertyDescriptorForClass(Object object) {

		itemPropertyDescriptorsForclass.add(new ItemPropertyDescriptorDecorator(object, createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Block_base_Class_feature"),

		getString("_UI_PropertyDescriptor_description", "_UI_Block_base_Class_feature", "_UI_Block_type"),

		BlocksPackage.Literals.BLOCK__BASE_CLASS, true, false, true,

		null,

		null,

		null)));

	}

	/**
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		Object composedImage = overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
		if(object instanceof NamedElement) {
			ComposedImage aux = new ComposedImage(Collections.singletonList(composedImage));
			return (Object)composeVisibilityImage(object, aux);
		}
		return composedImage;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		/**
		 * Handle Stereotype item and stereoted element
		 */
		Block block_ = null;

		if(object instanceof org.eclipse.uml2.uml.Class) {
			Stereotype ste = ((org.eclipse.uml2.uml.Class)object).getAppliedStereotype(SysmlResource.BLOCK_ID);
			if(ste != null) {
				IItemLabelProvider ite = (IItemLabelProvider)((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.CLASS);
				String result = ite.getText(object);
				result = BLOCK_PREFIX_PATTERN.matcher(result).replaceFirst("");
				return CLASS_PREFIX_PATTERN.matcher(result).replaceFirst("Block");
			}

		}

		if(block_ == null) {
			block_ = (Block)object;
		}

		Block block = (Block)block_;
		return getString("_UI_Block_type") + " " + block.isIsEncapsulated();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch(notification.getFeatureID(Block.class)) {
		case BlocksPackage.BLOCK__IS_ENCAPSULATED:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}

		/**
		 * Handle Class stereotyped by Block
		 */

		if(notification.getFeatureID(org.eclipse.uml2.uml.Class.class) != Notification.NO_FEATURE_ID) {
			ItemProviderAdapter ite = ((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.CLASS);
			ite.notifyChanged(notification);
			return;

		}

		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SysmlEditPlugin.INSTANCE;
	}

}
