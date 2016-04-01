/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 323802
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.fr - Bug 393532
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.stereotype.edition.editpolicies;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.GMFUnsafe;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.stereotype.display.command.CreateAppliedStereotypeCommentViewCommand;
import org.eclipse.papyrus.uml.diagram.common.stereotype.display.command.CreateAppliedStereotypeCompartmentCommand;
import org.eclipse.papyrus.uml.diagram.common.stereotype.display.command.CreateAppliedStereotypePropertyViewCommand;
import org.eclipse.papyrus.uml.diagram.common.stereotype.display.helper.StereotypeDisplayConstant;
import org.eclipse.papyrus.uml.diagram.common.stereotype.display.helper.StereotypeDisplayUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This editpolicy has in charge to :
 * - create or destroy the appliedStereotypesCommentEditpart
 * - create notation view associated to this CommentEditPart
 * - refresh the Comment content based on the UML information
 * by using NamedStyle mechanism into Notation model
 *
 * As soon as one stereotype is applied a shape that represent the comment of the applied stereotype is created. it will also
 * create the edge between the shape and the comment of the shape.
 * 
 * This shape is serialized in the notation file, and its not associated to 1 applied stereotype.
 */
public class AppliedStereotypeCommentEditPolicy extends AppliedStereotypeNodeLabelDisplayEditPolicy {


	/** constant for this edit policy role */
	public final static String APPLIED_STEREOTYPE_COMMENT = "AppliedStereotypeComment";// $NON-NLS-1$

	/** the comment node associated to the Host EditPart */
	private Node comment;


	@Override
	public void activate() {
		super.activate();
		getDiagramEventBroker().addNotificationListener(hostView.eContainer(), this);

	};

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractAppliedStereotypeDisplayEditPolicy#deactivate()
	 *
	 */
	@Override
	public void deactivate() {
		getDiagramEventBroker().removeNotificationListener(hostView.eContainer(), this);
		super.deactivate();
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy#refreshNotationStructure()
	 *
	 */
	@Override
	public void refreshNotationStructure() {

		if (hostView != null) {

			removeUnappliedStereotypes(comment);


			if (!stereotypeList.isEmpty()) {
				refreshStereotypeCommentStructure();
			}
		}


	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractAppliedStereotypeDisplayEditPolicy#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 *
	 * @param notification
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (comment != null) {

			int eventType = notification.getEventType();
			EObject object = StereotypeDisplayUtil.getInstance().getCommentSemanticElement(comment);
			// If the reference object of the comment is removed, delete the Comment node itself.
			if (eventType == Notification.REMOVE && notification.getOldValue().equals(hostView) && object == null) {
				executeAppliedStereotypeCommentDeletion(hostEditPart.getEditingDomain(), comment);
			}

			if (comment.getTargetEdges() != null) {

				// If the Target View is null then remove the Comment View
				if (eventType == Notification.REMOVE && notification.getOldValue().equals(hostView) && comment.getTargetEdges().size() == 0) {
					executeAppliedStereotypeCommentDeletion(hostEditPart.getEditingDomain(), comment);
				}
			}
		}


	}


	/**
	 * Refresh the structure for the Stereotype List
	 *
	 * @param stereotypeList
	 *            The list of Stereotype applied on the Element.
	 */
	public void refreshStereotypeCommentStructure() {

		if (comment != null) {
			removeUnappliedStereotypes(comment);
		}
		// rebuild the structure from the Stereotype List
		if (!stereotypeList.isEmpty()) {
			comment = createCommentNode();
			if (comment != null) {

				for (Stereotype stereotype : stereotypeList) {
					refreshStereotypeCompartmentStructure(stereotype);
					getDiagramEventBroker().addNotificationListener(helper.getStereotypeCompartment(comment, stereotype), this);

					refreshStereotypeBraceStructure(stereotype);
					getDiagramEventBroker().addNotificationListener(helper.getStereotypeBraceCompartment(comment, stereotype), this);


				}
			}
		}

	}


	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractAppliedStereotypeDisplayEditPolicy#removeListener()
	 *
	 */
	@Override
	public void removeListener() {

		if (!stereotypeList.isEmpty()) {
			if (null != comment) {
				for (Stereotype stereotype : stereotypeList) {
					getDiagramEventBroker().removeNotificationListener(helper.getStereotypeCompartment(comment, stereotype), this);
					getDiagramEventBroker().removeNotificationListener(helper.getStereotypeBraceCompartment(comment, stereotype), this);
				}
			}
		}

	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy#refreshStereotypeDisplay()
	 *
	 */
	@Override
	protected void refreshStereotypeDisplay() {

		super.refreshStereotypeDisplay();
		// If no more Compartment, delete the Comment
		if (comment != null && getAppliedStereotypeCompartmentNumber(comment) == 0) {
			executeAppliedStereotypeCommentDeletion(hostEditPart.getEditingDomain(), comment);
		}
	}


	/**
	 * Get the number of Visible Compartments
	 *
	 * @param view
	 *            The View where the number of visible Compartment are evaluated
	 *
	 * @return the number of Visible Stereotype Compartment
	 */
	protected int getAppliedStereotypeCompartmentNumber(View view) {

		int nbVisibleCompartment = 0;
		Iterator<View> iteratorView = view.getChildren().iterator();
		while (iteratorView.hasNext()) {
			View subview = iteratorView.next();
			if (helper.isStereotypeBrace(subview) || helper.isStereotypeCompartment(subview)) {
				nbVisibleCompartment++;
			}
		}
		return nbVisibleCompartment;
	}


	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy#refreshStereotypeCompartmentStructure(org.eclipse.uml2.uml.Stereotype)
	 *
	 * @param stereotype
	 */
	@Override
	public void refreshStereotypeBraceStructure(Stereotype stereotype) {

		BasicCompartment compartment = helper.getStereotypeCompartment(hostView, stereotype);
		if (compartment == null) { // No Label Exist for this Stereotype
			createAppliedStereotypeBraceCompartment(stereotype);
			createAppliedStereotypeBraceProperties(stereotype);

		}
	}

	/**
	 * Refresh The StereotypeCompartment notation structure.
	 *
	 * @param stereotype
	 *            Stereotype related to the Compartment to created
	 */
	public void refreshStereotypeCompartmentStructure(Stereotype stereotype) {

		BasicCompartment compartment = helper.getStereotypeCompartment(comment, stereotype);
		if (compartment == null) { // No Compartment Exist for this Stereotype
			createAppliedStereotypeCompartment(stereotype);
		}
		createAppliedStereotypeProperties(stereotype);
	}


	/**
	 * This method creates a node for the compartment of stereotype if it does not exist.
	 *
	 * @param stereotypeApplication
	 *            the stereotype application
	 */
	protected void createAppliedStereotypeCompartment(final Stereotype stereotype) {
		final View node = hostEditPart.getNotationView();
		// doesn't exist already
		if (!helper.isCompartmentExist(node, stereotype)) {
			// Create Compartment
			executeAppliedStereotypeCompartmentCreation(hostEditPart, stereotype, StereotypeDisplayConstant.STEREOTYPE_COMPARTMENT_TYPE);
		}
	}


	/**
	 * In charge of properties view creation
	 *
	 * @param eObject
	 *            The Edit Part of which the Properties should be created
	 */

	protected void createAppliedStereotypeProperties(final Stereotype stereotype) {

		Node compartment = helper.getStereotypeCompartment(comment, stereotype);
		if (compartment != null && stereotype != null) {

			EList<Property> properties = stereotype.allAttributes();
			for (Property property : properties) {
				createAppliedStereotypeProperty(compartment, property);
			}
		}
	}

	/**
	 * In Charge of PropertyView Creation
	 *
	 * @param propertyType
	 *            Type of Property {@link StereotypeDisplayConstant#STEREOTYPE_PROPERTY_TYPE} or {@link StereotypeDisplayConstant#STEREOTYPE_PROPERTY_BRACE_TYPE}
	 * @param compartment
	 *            The Compartment owner of the Property that will be created
	 * @param property
	 *            The UML Property of the View to create
	 */

	protected void createAppliedStereotypeProperty(Node compartment, Property property) {
		// if stereotype is null all property of stereotype has to be removed!
		if (property != null && !property.getName().startsWith(Extension.METACLASS_ROLE_PREFIX)) {
			if (!helper.isPropertyExist(compartment, property)) {
				// go through each stereotype property
				executeAppliedStereotypePropertyViewCreation(hostEditPart, compartment, property);

			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractAppliedStereotypeDisplayEditPolicy#createAppliedStereotypeBraceCompartment(org.eclipse.uml2.uml.Stereotype)
	 *
	 * @param stereotype
	 *            Stereotype related to the Brace Compartment to created
	 */
	@Override
	protected void createAppliedStereotypeBraceCompartment(Stereotype stereotype) {
		final View node = hostEditPart.getNotationView();
		// doesn't exist already
		if (!helper.isCompartmentExist(node, stereotype)) {
			// Create Compartment
			executeAppliedStereotypeCompartmentCreation(hostEditPart, stereotype, StereotypeDisplayConstant.STEREOTYPE_BRACE_TYPE);

		}
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractAppliedStereotypeDisplayEditPolicy#createAppliedStereotypeBraceProperties(org.eclipse.uml2.uml.Stereotype)
	 *
	 * @param stereotype
	 *            Stereotype related to the Brace Properties to created
	 */
	@Override
	protected void createAppliedStereotypeBraceProperties(Stereotype stereotype) {
		Node compartment = helper.getStereotypeBraceCompartment(comment, stereotype);
		if (compartment != null && stereotype != null) {

			EList<Property> properties = stereotype.allAttributes();
			for (Property property : properties) {
				createAppliedStereotypeBraceProperty(compartment, property);
			}
		}
	}

	/**
	 * In charge of Comment Node creation.
	 *
	 * @return The Comment Node newly created
	 */
	private Node createCommentNode() {
		if (helper.getStereotypeComment(hostView) == null) {
			// if Comment doesn't exist => Create it and copy the structure from the host

			if (getHost() instanceof ConnectionEditPart) {
				executeAppliedStereotypeCommentCreation(((ConnectionEditPart) getHost()).resolveSemanticElement());
			}
			if (getHost() instanceof GraphicalEditPart) {
				executeAppliedStereotypeCommentCreation(((GraphicalEditPart) getHost()).resolveSemanticElement());
			}

		}
		return helper.getStereotypeComment(hostView);

	}


	/**
	 * The goal of this method is to execute the a command to create a notation node for a compartment of stereotype
	 *
	 * @param editPart
	 *            the editPart owner of the new compartment
	 * @param appliedstereotype
	 *            the stereotype application
	 */

	protected void executeAppliedStereotypeCompartmentCreation(final IGraphicalEditPart editPart, final Stereotype stereotype, final String type) {
		try {
			editPart.getEditingDomain().runExclusive(new Runnable() {

				public void run() {
					Display.getCurrent().syncExec(new Runnable() {


						public void run() {
							CreateAppliedStereotypeCompartmentCommand command = new CreateAppliedStereotypeCompartmentCommand(editPart.getEditingDomain(), comment, stereotype, type);

							// use to avoid to put it in the command stack
							try {
								GMFUnsafe.write(editPart.getEditingDomain(), command);
							} catch (Exception e) {
								Activator.log.error(e);
							}
						}
					});

				}
			});
		} catch (Exception e) {
			Activator.log.error(e);
		}
	}


	/**
	 * This method is used to create a notation node for the property of the stereotype
	 *
	 * @param editPart
	 *            the editPart container
	 * @param compartment
	 * @param stereotypeApplication
	 * @param stereotype
	 *            the stereotype associated to compartment node
	 */

	protected void executeAppliedStereotypePropertyViewCreation(final IGraphicalEditPart editPart, final Node compartment, final Property stereotypeProperty) {
		try {
			editPart.getEditingDomain().runExclusive(new Runnable() {

				public void run() {
					Display.getCurrent().syncExec(new Runnable() {

						public void run() {

							// use to avoid to put it in the command stack
							CreateAppliedStereotypePropertyViewCommand command = new CreateAppliedStereotypePropertyViewCommand(editPart.getEditingDomain(), compartment, stereotypeProperty, StereotypeDisplayConstant.STEREOTYPE_PROPERTY_TYPE);
							try {
								GMFUnsafe.write(editPart.getEditingDomain(), command);
							} catch (Exception e) {
								Activator.log.error(e);
							}
						}
					});
				}
			});

		} catch (Exception e) {
			Activator.log.error(e);
		}
	}





	/**
	 * The goal of this method is to execute the a command to create a notation node for applied stereotype
	 * as "Comment" shape.
	 *
	 * @param appliedstereotype
	 *            the stereotype application
	 */
	protected void executeAppliedStereotypeCommentCreation(final EObject node) {

		final TransactionalEditingDomain domain = hostEditPart.getEditingDomain();
		Display.getCurrent().syncExec(new Runnable() {

			public void run() {
				int x = 200;
				int y = 100;
				if (hostEditPart.getModel() instanceof Node) {
					LayoutConstraint constraint = ((Node) hostEditPart.getModel()).getLayoutConstraint();
					if (constraint instanceof Bounds) {
						x = x + ((Bounds) constraint).getX();
						y = ((Bounds) constraint).getY();
					}

				}
				if (hostEditPart.getModel() instanceof Edge && ((((Edge) hostEditPart.getModel()).getSource()) instanceof Node)) {

					LayoutConstraint constraint = ((Node) ((Edge) hostEditPart.getModel()).getSource()).getLayoutConstraint();
					if (constraint instanceof Bounds) {
						x = x + ((Bounds) constraint).getX();
						y = ((Bounds) constraint).getY() - 100;
					}

				}
				boolean isBorderElement = false;
				if (hostEditPart instanceof BorderedBorderItemEditPart) {
					isBorderElement = true;
				}
				if (helper.getStereotypeComment((View) getHost().getModel()) == null) {
					CreateAppliedStereotypeCommentViewCommand command = new CreateAppliedStereotypeCommentViewCommand(domain, (View) hostEditPart.getModel(), x, y, node, isBorderElement);
					// use to avoid to put it in the command stack
					try {
						GMFUnsafe.write(domain, command);
					} catch (Exception e) {
						Activator.log.error(e);
					}
				}
			}

		});
	}

	/**
	 * In Charge to delete the Comment Node.
	 *
	 * @param domain
	 *            the transactional editing domain
	 * @param commentNode
	 *            the view that represent the comment of stereotype
	 */

	protected void executeAppliedStereotypeCommentDeletion(final TransactionalEditingDomain domain, final View commentNode) {
		Display.getCurrent().syncExec(new Runnable() {

			public void run() {
				// because it is asynchrony the comment node maybe become s null
				if (commentNode != null && TransactionUtil.getEditingDomain(commentNode) != null) {
					DeleteCommand command = new DeleteCommand(commentNode);
					// use to avoid to put it in the command stack
					try {
						GMFUnsafe.write(domain, command);
					} catch (Exception e) {
						Activator.log.error(e);
					}
				}
			}
		});
	}

	/**
	 * Get the Node (notation) corresponding to the Host editpart
	 */
	protected Node getNotationNode() {
		Node node = null;

		if (hostEditPart != null) {
			View view = hostEditPart.getNotationView();
			if (view instanceof Node) {
				node = (Node) view;
			}
		}
		return node;
	}


}
