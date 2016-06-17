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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Benoit Maggi (CEA LIST) - Bug 468026
 *  Fanch Bonnabesse (ALL4TEC) fanch.bonnabesse@alltec.net - Bug 493430
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editparts.UMLConnectionNodeEditPart;
import org.eclipse.papyrus.uml.diagram.common.figure.edge.AssociationFigure;
import org.eclipse.papyrus.uml.diagram.common.util.AssociationUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * this abstract editpart is used to add listeners
 */
public abstract class AbstractAssociationEditPart extends UMLConnectionNodeEditPart {

	protected static final String ASSOCIATION_END_LISTENERS_SOURCE = "AssociationEndListenersSource"; //$NON-NLS-1$

	protected static final String ASSOCIATION_END_LISTENERS_TARGET = "AssociationEndListenersTarget"; //$NON-NLS-1$

	public AbstractAssociationEditPart(View view) {
		super(view);
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void activate() {
		super.activate();
		addAssociationEndListeners();
	}

	/**
	 * this methods add listeners on targets and sources
	 */
	protected void addAssociationEndListeners() {
		EObject semanticElement = resolveSemanticElement();
		if (semanticElement instanceof Association) {
			Association association = (Association) semanticElement;
			if (association.getMemberEnds().size() >= 2) {
				EObject sourceEnd = getSourceProperty(association);
				EObject targetEnd = getTargetProperty(association);
				addListenerFilter(ASSOCIATION_END_LISTENERS_SOURCE, this, sourceEnd);
				addListenerFilter(ASSOCIATION_END_LISTENERS_TARGET, this, targetEnd);
			}
		}
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void deactivate() {
		removeAssociationEndListeners();
		super.deactivate();
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		// set the good ends for the association figure
		if (resolveSemanticElement() != null) {
			refreshVisuals();
		}
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	protected void refreshVisuals() {
		if (resolveSemanticElement() != null) {
			if (getSource() == null || getTarget() == null) {
				return;
			}
			if (!(getSource() instanceof GraphicalEditPart && getTarget() instanceof GraphicalEditPart)) {
				return;
			}
			// FIXME: This is a quick fix to avoid model corruption when an associationClass is drawn between an association and a Class.
			// A better solution would probably be to forbid this behavior. Currently, it is not possible to draw directly an Association Class between
			// an association and a class, but it is possible to retarget an AssociationClass' end to an Association (Which would lead to a diagram corruption)
			if (((GraphicalEditPart) getSource()).resolveSemanticElement() == null || ((GraphicalEditPart) getTarget()).resolveSemanticElement() == null) {
				return;
			}

			if (getUMLElement() instanceof Association) {
				Association association = (Association) getUMLElement();
				if (null != association.getMemberEnds() && 2 <= association.getMemberEnds().size()) {
					Property source = getSourceProperty(association);
					Property target = getTargetProperty(association);

					if (null == source || null == target) {
						return;
					}

					if (!source.getType().equals(target.getType())) {
						Property propertyGet0 = association.getMemberEnds().get(0);
						Property propertyGet1 = association.getMemberEnds().get(1);
						Type propertyTypeGet0 = propertyGet0.getType();
						if (null != propertyTypeGet0 && propertyTypeGet0.equals(((GraphicalEditPart) getSource()).resolveSemanticElement())) {
							source = propertyGet0;
							target = propertyGet1;
						} else {
							source = propertyGet1;
							target = propertyGet0;
						}
					}

					int sourceType = 0;
					int targetType = 0;
					// to display the dot.
					// owned?
					if (!source.getOwner().equals(resolveSemanticElement())) {
						sourceType += AssociationFigure.owned;
						sourceType += AssociationFigure.navigable;
					}
					if (!target.getOwner().equals(resolveSemanticElement())) {
						targetType += AssociationFigure.owned;
						targetType += AssociationFigure.navigable;
					}
					// aggregation? for it the opposite is changed
					if (source.getAggregation() == AggregationKind.SHARED_LITERAL) {
						targetType += AssociationFigure.aggregation;
					}
					if (target.getAggregation() == AggregationKind.SHARED_LITERAL) {
						sourceType += AssociationFigure.aggregation;
					}
					// composite? for it the opposite is changed
					if (source.getAggregation() == AggregationKind.COMPOSITE_LITERAL) {
						targetType += AssociationFigure.composition;
					}
					if (target.getAggregation() == AggregationKind.COMPOSITE_LITERAL) {
						sourceType += AssociationFigure.composition;
					}
					// navigable?
					if (association.getNavigableOwnedEnds().contains(source)) {
						sourceType += AssociationFigure.navigable;
					}
					if (association.getNavigableOwnedEnds().contains(target)) {
						targetType += AssociationFigure.navigable;
					}
					if (getPrimaryShape() instanceof AssociationFigure) {
						((AssociationFigure) getPrimaryShape()).setEnd(sourceType, targetType);
					}
				}
			}
		}
		super.refreshVisuals();
	}

	/**
	 * Get the source member end of the Association.
	 *
	 * @param association
	 *            The Association.
	 * @return The source member end.
	 */
	protected Property getSourceProperty(final Association association) {
		return AssociationUtil.getTargetSecondEnd(association);
	}

	/**
	 * Get the target member end of the Association.
	 *
	 * @param association
	 *            The Association.
	 * @return The target member end.
	 */
	protected Property getTargetProperty(final Association association) {
		return AssociationUtil.getSourceFirstEnd(association);
	}

	/**
	 * this method is used to remove listener on ends
	 */
	protected void removeAssociationEndListeners() {
		removeListenerFilter(ASSOCIATION_END_LISTENERS_SOURCE);
		removeListenerFilter(ASSOCIATION_END_LISTENERS_TARGET);
	}
}
