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
package org.eclipse.papyrus.sysml.activities.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.papyrus.sysml.activities.Discrete;
import org.eclipse.papyrus.sysml.edit.provider.IComposableAdapterFactory;
import org.eclipse.papyrus.sysml.edit.provider.IVisibilityOverlayImage;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.sysml.activities.Discrete} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DiscreteItemProvider extends RateItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IVisibilityOverlayImage

{

	/**
	 * This is used to store all the property descriptors for aclass stereotyped with a block.
	 * Derived classes should add descriptors to this vector.
	 */

	protected List<IItemPropertyDescriptor> itemPropertyDescriptorsForparameter;

	/**
	 * This is used to store all the property descriptors for aclass stereotyped with a block.
	 * Derived classes should add descriptors to this vector.
	 */

	protected List<IItemPropertyDescriptor> itemPropertyDescriptorsForactivityEdge;

	/**
	 * Pattern prefix of discrete
	 * 
	 * @generated
	 */
	private static Pattern DISCRETE_PREFIX_PATTERN = Pattern.compile("(discrete, |<<discrete>>|, discrete)");

	/**
	 * Get the prefix pattern of PARAMETER_PREFIX_PATTERN
	 * 
	 * @generated
	 */

	private static Pattern PARAMETER_PREFIX_PATTERN = Pattern.compile("Parameter");

	/**
	 * Get the prefix pattern of ACTIVITY_EDGE_PREFIX_PATTERN
	 * 
	 * @generated
	 */

	private static Pattern ACTIVITY_EDGE_PREFIX_PATTERN = Pattern.compile("ActivityEdge");

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiscreteItemProvider(AdapterFactory adapterFactory) {
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
		if(object instanceof Discrete) {
			if(itemPropertyDescriptors == null) {
				super.getPropertyDescriptors(object);

			}
		}

		/**
		 * Handle Parameter stereotyped by Discrete
		 */
		if(object instanceof org.eclipse.uml2.uml.Parameter) {
			org.eclipse.uml2.uml.Parameter element = (org.eclipse.uml2.uml.Parameter)object;
			if(itemPropertyDescriptorsForparameter == null) {
				ItemProviderAdapter ite = ((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.PARAMETER);
				final List<IItemPropertyDescriptor> propertyDescriptors = ite.getPropertyDescriptors(this);
				itemPropertyDescriptorsForparameter = new ArrayList<IItemPropertyDescriptor>();
				itemPropertyDescriptorsForparameter.addAll(propertyDescriptors);
				Stereotype ste = (element).getAppliedStereotype(SysmlResource.DISCRETE_ID);
				if(ste != null) {
					EObject steApplication = (element).getStereotypeApplication(ste);

				}
			}
			return itemPropertyDescriptorsForparameter;

		}

		/**
		 * Handle ActivityEdge stereotyped by Discrete
		 */
		if(object instanceof org.eclipse.uml2.uml.ActivityEdge) {
			org.eclipse.uml2.uml.ActivityEdge element = (org.eclipse.uml2.uml.ActivityEdge)object;
			if(itemPropertyDescriptorsForactivityEdge == null) {
				ItemProviderAdapter ite = ((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.ACTIVITY_EDGE);
				final List<IItemPropertyDescriptor> propertyDescriptors = ite.getPropertyDescriptors(this);
				itemPropertyDescriptorsForactivityEdge = new ArrayList<IItemPropertyDescriptor>();
				itemPropertyDescriptorsForactivityEdge.addAll(propertyDescriptors);
				Stereotype ste = (element).getAppliedStereotype(SysmlResource.DISCRETE_ID);
				if(ste != null) {
					EObject steApplication = (element).getStereotypeApplication(ste);

				}
			}
			return itemPropertyDescriptorsForactivityEdge;

		}

		return itemPropertyDescriptors;
	}

	/**
	 * This returns Discrete.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		Object composedImage = overlayImage(object, getResourceLocator().getImage("full/obj16/Discrete"));
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
		Discrete discrete_ = null;

		if(object instanceof org.eclipse.uml2.uml.Parameter) {
			Stereotype ste = ((org.eclipse.uml2.uml.Parameter)object).getAppliedStereotype(SysmlResource.DISCRETE_ID);
			if(ste != null) {
				IItemLabelProvider ite = (IItemLabelProvider)((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.PARAMETER);
				String result = ite.getText(object);
				result = DISCRETE_PREFIX_PATTERN.matcher(result).replaceFirst("");
				return PARAMETER_PREFIX_PATTERN.matcher(result).replaceFirst("Discrete");
			}

		}

		if(object instanceof org.eclipse.uml2.uml.ActivityEdge) {
			Stereotype ste = ((org.eclipse.uml2.uml.ActivityEdge)object).getAppliedStereotype(SysmlResource.DISCRETE_ID);
			if(ste != null) {
				IItemLabelProvider ite = (IItemLabelProvider)((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.ACTIVITY_EDGE);
				String result = ite.getText(object);
				result = DISCRETE_PREFIX_PATTERN.matcher(result).replaceFirst("");
				return ACTIVITY_EDGE_PREFIX_PATTERN.matcher(result).replaceFirst("Discrete");
			}

		}

		if(discrete_ == null) {
			discrete_ = (Discrete)object;
		}

		return getString("_UI_Discrete_type");
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

		/**
		 * Handle Parameter stereotyped by Discrete
		 */

		if(notification.getFeatureID(org.eclipse.uml2.uml.Parameter.class) != Notification.NO_FEATURE_ID) {
			ItemProviderAdapter ite = ((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.PARAMETER);
			ite.notifyChanged(notification);
			return;

		}

		/**
		 * Handle ActivityEdge stereotyped by Discrete
		 */

		if(notification.getFeatureID(org.eclipse.uml2.uml.ActivityEdge.class) != Notification.NO_FEATURE_ID) {
			ItemProviderAdapter ite = ((IComposableAdapterFactory)adapterFactory).getIRootAdapterFactory().getItemProvider(UMLPackage.Literals.ACTIVITY_EDGE);
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
	 * Compose the image with specific visibility logo
	 * Copied from UML implementation
	 * 
	 * @param object
	 * @param composedImage
	 * @return {@link ComposedImage}
	 */
	public ComposedImage composeVisibilityImage(Object object, ComposedImage composedImage) {
		NamedElement namedElement = (NamedElement)object;

		if(namedElement.isSetVisibility()) {
			composedImage.getImages().add(UMLEditPlugin.INSTANCE.getImage("full/ovr16/VisibilityKind_" //$NON-NLS-1$
				+ namedElement.getVisibility().getName()));
		}

		return composedImage;
	}

}
