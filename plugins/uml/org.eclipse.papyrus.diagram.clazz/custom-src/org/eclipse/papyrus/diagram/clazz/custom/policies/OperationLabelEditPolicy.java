/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.clazz.custom.policies;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.diagram.clazz.custom.helper.OperationLabelHelper;
import org.eclipse.papyrus.diagram.clazz.custom.preferences.IPapyrusOperationPreferencesConstant;
import org.eclipse.papyrus.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.diagram.common.editpolicies.AbstractMaskManagedEditPolicy;
import org.eclipse.papyrus.umlutils.ICustomAppearence;
import org.eclipse.papyrus.umlutils.ui.VisualInformationPapyrusConstant;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Specific edit policy for label displaying stereotypes and their properties for edges representing
 * UML elements.
 */
public class OperationLabelEditPolicy extends AbstractMaskManagedEditPolicy {

	/**
	 * Creates a new PropertyLabelEditPolicy
	 */
	public OperationLabelEditPolicy() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public void addAdditionalListeners() {
		// adds a listener to the element itself, and to linked elements, like Type
		for (Parameter parameter : getUMLElement().getOwnedParameters()) {
			getDiagramEventBroker().addNotificationListener(parameter, this);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public int getCurrentDisplayValue() {
		EAnnotation customeDisplayAnnotation = ((View) getHost().getModel())
				.getEAnnotation(VisualInformationPapyrusConstant.CUSTOM_APPEARENCE_ANNOTATION);
		int displayValue = getDefaultDisplayValue();
		if (customeDisplayAnnotation != null) {
			displayValue = Integer.parseInt(customeDisplayAnnotation.getDetails().get(
					VisualInformationPapyrusConstant.CUSTOM_APPEARANCE_MASK_VALUE));
		} else {
			// no specific information => look in preferences
			IPreferenceStore store = UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
			int displayValueTemp = store
					.getInt(IPapyrusOperationPreferencesConstant.OPERATION_LABEL_DISPLAY_PREFERENCE);
			if (displayValueTemp != 0) {
				displayValue = displayValueTemp;
			}
		}
		return displayValue;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getDefaultDisplayValue() {
		return ICustomAppearence.DEFAULT_UML_OPERATION;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getMaskLabel(int value) {
		return OperationLabelHelper.getInstance().getMaskLabel(value);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<String> getMaskLabels() {
		return OperationLabelHelper.getInstance().getMaskLabels();
	}

	/**
	 * {@inheritDoc}
	 */
	public Map<Integer, String> getMasks() {
		return OperationLabelHelper.getInstance().getMasks();
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Integer> getMaskValues() {
		return OperationLabelHelper.getInstance().getMaskValues();
	}

	/**
	 * {@inheritDoc}
	 */
	public String getPreferencePageID() {
		return "org.eclipse.papyrus.diagram.clazz.custom.preferences.OperationPreferencePage";
	}

	/**
	 * Returns the {@link Operation} managed by this edit part.
	 * 
	 * @return the {@link Operation} managed by this edit part.
	 */
	public Operation getUMLElement() {
		return (Operation) getView().getElement();
	}

	/**
	 * 
	 * {@inheritedDoc}
	 */
	public void notifyChanged(Notification notification) {
		// change the label of the figure managed by the host edit part (managed by the parent edit
		// part in general...)
		// it must be changed only if:
		// - the annotation corresponding to the display of the stereotype changes
		// - the stereotype application list has changed
		Object object = notification.getNotifier();
		Operation operation = getUMLElement();

		if (object == null) {
			return;
		}

		if (object.equals(operation)) {
			notifyOperationChanged(operation, notification);
		}

		if (isMaskManagedAnnotation(object)) {
			refreshDisplay();
		}

		if (isRemovedMaskManagedLabelAnnotation(object, notification)) {
			refreshDisplay();
		}

	}

	/**
	 * notifies that the the property has changed.
	 * 
	 * @param property
	 *            the property that has changed
	 * @param notification
	 *            the notification send when the element has been changed
	 */
	protected void notifyOperationChanged(Operation operation, Notification notification) {
		switch (notification.getFeatureID(Operation.class)) {
		case UMLPackage.OPERATION__NAME:
		case UMLPackage.OPERATION__VISIBILITY:
		case UMLPackage.OPERATION__IS_UNIQUE:
		case UMLPackage.OPERATION__REDEFINED_OPERATION:
		case UMLPackage.OPERATION__IS_ORDERED:
		case UMLPackage.OPERATION__LOWER:
		case UMLPackage.OPERATION__UPPER:
		case UMLPackage.OPERATION__IS_STATIC:
			refreshDisplay();
			break;
		case UMLPackage.OPERATION__OWNED_PARAMETER:

			switch (notification.getEventType()) {
			// if it is added => adds listener to the type element
			case Notification.ADD:
			case Notification.ADD_MANY: // should never happen
				getDiagramEventBroker().addNotificationListener((EObject) notification.getNewValue(), this);
				refreshDisplay();
				// if it is removed => removes listener from the type element
				break;

			case Notification.REMOVE:
			case Notification.REMOVE_MANY: // should never happen
				getDiagramEventBroker().removeNotificationListener((EObject) notification.getOldValue(), this);
				refreshDisplay();
				break;
			// if it is set, remove the old one and adds the new one. this is the method use when
			// the type is set or removed...
			case Notification.SET:
				if (notification.getNewValue() != null) {
					getDiagramEventBroker().addNotificationListener((EObject) notification.getNewValue(), this);
				}
				if (notification.getOldValue() != null) {
					getDiagramEventBroker().removeNotificationListener((EObject) notification.getOldValue(), this);
				}
				refreshDisplay();

			default:
				break;

			}

			break;
		default:
			// does nothing in other cases
			break;
		}
	}

	/**
	 * Refreshes the display of the edit part
	 */
	public void refreshDisplay() {
		// calls the helper for this edit Part
		OperationLabelHelper.getInstance().refreshEditPartDisplay((GraphicalEditPart) getHost());
	}

	/**
	 * 
	 */
	protected void removeAdditionalListeners() {
		for (Parameter parameter : getUMLElement().getOwnedParameters()) {
			getDiagramEventBroker().removeNotificationListener(parameter, this);
		}
	}

}
