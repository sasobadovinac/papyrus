/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.parametric.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.core.adaptor.gmf.Activator;
import org.eclipse.papyrus.diagram.common.helper.NotificationHelper;
import org.eclipse.papyrus.diagram.common.providers.UIAdapterImpl;
import org.eclipse.papyrus.sysml.constraints.ConstraintProperty;
import org.eclipse.papyrus.sysml.diagram.parametric.edit.parts.ConstraintPropertyEditPart;
import org.eclipse.papyrus.sysml.diagram.parametric.edit.parts.Property2EditPart;
import org.eclipse.papyrus.sysml.diagram.parametric.part.SysmlVisualIDRegistry;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * SelfCompartmentNotificationHelper is a particular NotificationHelper which manages the editparts
 * drawn in a particular compartment for a particular feature. It automatically add or remove
 * appropriate parts when model is modified, so that all contained elements are represented once.
 */
public class SelfCompartmentNotificationHelper extends NotificationHelper {

	/** The UI adapter that listens model update */
	private UIAdapter adapter = new UIAdapter();

	/** The compartment part. */
	private final ConstraintPropertyEditPart compartmentPart;

	/** The child feature. */
	private final EStructuralFeature childFeature;

	/** The child type. */
	private final IHintedType childType;

	/**
	 * Instantiates a new self compartment notification helper.
	 * 
	 * @param compartmentPart
	 *            the compartment part
	 * @param childFeature
	 *            the child feature
	 * @param childType
	 *            the child type
	 */
	public SelfCompartmentNotificationHelper(final ConstraintPropertyEditPart compartmentPart,
			final EStructuralFeature childFeature, final IHintedType childType) {
		this.compartmentPart = compartmentPart;
		this.childFeature = childFeature;
		this.childType = childType;
		this.setModelListener(adapter);
	}

	/**
	 * private class UIAdapter.
	 */
	private class UIAdapter extends UIAdapterImpl {

		@Override
		protected void safeNotifyChanged(Notification msg) {
			if (UMLPackage.eINSTANCE.getTypedElement_Type().equals(msg.getFeature())) {
				// listen type once it's set
				listenObject((Notifier) msg.getNewValue());
				updateChildrenParts(compartmentPart, childFeature, childType);
			} else if (UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute().equals(msg.getFeature())) {
				updateChildrenParts(compartmentPart, childFeature, childType);
			}
		}
	}

	/**
	 * Update children edit parts so that each child is represented once
	 * 
	 * @param compartmentPart
	 *            the compartment part containing children
	 * @param childFeature
	 *            the feature containing children
	 * @param childType
	 *            the children's IHintedType represented as Node
	 */
	public static void updateChildrenParts(ConstraintPropertyEditPart compartmentPart, EStructuralFeature childFeature,
			IHintedType childType) {
		if (compartmentPart == null || childFeature == null || childType == null) {
			return;
		}
		if (compartmentPart.getModel() instanceof View) {
			View compartmentView = (View) compartmentPart.getModel();
			EObject containerObject = compartmentView.getElement();
			if (containerObject instanceof ConstraintProperty) {
				Type propertyType = ((ConstraintProperty) containerObject).getBase_Property().getType();
				if (propertyType != null) {
					Object untypedOwnedObjects = propertyType.eGet(childFeature);
					if (untypedOwnedObjects instanceof List<?>) {
						List<?> ownedEObjectChildren = (List<?>) untypedOwnedObjects;
						List<EObject> drawnEObjectChildren = new ArrayList<EObject>(ownedEObjectChildren.size());
						// list children already drawn and remove old children
						for (Iterator<?> iterator = compartmentView.getPersistedChildren().iterator(); iterator
								.hasNext();) {
							EObject childView = (EObject) iterator.next();
							if (childView instanceof View) {
								EObject child = ((View) childView).getElement();
								if(SysmlVisualIDRegistry.getVisualID((View) childView) == Property2EditPart.VISUAL_ID) {
									// property already drawn
									if (ownedEObjectChildren.contains(child) && !drawnEObjectChildren.contains(child)) {
										drawnEObjectChildren.add(child);
									} else if (!ownedEObjectChildren.contains(child)) {
										// remove remaining property if any
										iterator.remove();
									}
								} else if (SysmlVisualIDRegistry.getVisualID((View) childView) == ConstraintPropertyEditPart.VISUAL_ID) {
									// property doesn't exist in the model, remove the view
									iterator.remove();
								}
							}
						}
						// draw remaining children
						List<Object> childrenToDraw = new ArrayList<Object>(ownedEObjectChildren);
						childrenToDraw.removeAll(drawnEObjectChildren);
						CompositeCommand drawChildrenCommand = new CompositeCommand("draw children nodes");
						for (Object child : childrenToDraw) {
							if (child instanceof EObject) {
								IAdaptable adapter = new EObjectAdapter((EObject) child);
								ViewDescriptor descriptor = new ViewDescriptor(adapter, Node.class, childType
										.getSemanticHint(), ViewUtil.APPEND, false, compartmentPart
										.getDiagramPreferencesHint());
								CreateCommand nodeCreationCommand = new CreateCommand(compartmentPart
										.getEditingDomain(), descriptor, compartmentView);
								drawChildrenCommand.add(nodeCreationCommand);
							}
						}
						// execute command
						if (!drawChildrenCommand.isEmpty()) {
							try {
								OperationHistoryFactory.getOperationHistory().execute(drawChildrenCommand,
										new NullProgressMonitor(), null);
							} catch (ExecutionException e) {
								e.printStackTrace();
								Activator.getInstance().logError("Unable to create diagram elements", e); //$NON-NLS-1$
							}
						}
					}
				} else {
					// constraint property type is set to null, remove old children
					for (Iterator<?> iterator = compartmentView.getPersistedChildren().iterator(); iterator.hasNext();) {
						EObject childView = (EObject) iterator.next();
						if (childView instanceof View) {
							EObject child = ((View) childView).getElement();
							if (child instanceof Property) {
								iterator.remove();
							}
						}
					}
				}
			}
		}
	}
}
