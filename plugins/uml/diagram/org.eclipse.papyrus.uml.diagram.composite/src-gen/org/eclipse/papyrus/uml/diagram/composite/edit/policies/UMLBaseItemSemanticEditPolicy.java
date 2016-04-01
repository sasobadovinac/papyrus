/**
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.composite.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.MoveElementsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.InformationItem;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UseCase;

/**
 * @generated
 */
public class UMLBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * Extended request data key to hold the edge view during a reconnect request.
	 * 
	 * @generated
	 */
	public static final String GRAPHICAL_RECONNECTED_EDGE = "graphical_edge"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected UMLBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * Add the reoriented view to the request extended data so that the view
	 * currently edited can be distinguished from other views of the same element
	 * and these latter possibly removed if they become inconsistent after reconnect
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				String id = UMLVisualIDRegistry.getVisualID((View) view);
				request.getExtendedData().put(VISUAL_ID_KEY, id);
				request.getExtendedData().put(GRAPHICAL_RECONNECTED_EDGE, view);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected String getVisualID(IEditCommandRequest request) {
		return (String) request.getParameter(VISUAL_ID_KEY);
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	protected IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = UMLElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType instanceof IElementType) {
			IElementEditService commandProvider = ElementEditServiceUtils.getCommandProvider(req.getContainer());
			if (commandProvider != null) {
				ICommand command = commandProvider.getEditCommand(req);
				if (command != null && command.canExecute()) {
					return new ICommandProxy(command);
				}
			}
		}
		return null;
	}

	// RS: add code for extended types
	/**
	 * @generated
	 */
	protected Command getExtendedTypeCreationCommand(CreateElementRequest request, IElementType requestElementType) {
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(request.getContainer());
		if (provider == null) {
			return UnexecutableCommand.INSTANCE;
		}
		// Retrieve create command from the Element Edit service
		ICommand createGMFCommand = provider.getEditCommand(request);
		return getGEFWrapper(createGMFCommand);
	}

	/**
	 * @generated
	 */
	protected Command getExtendedStartCreateRelationshipCommand(CreateElementRequest request,
			IElementType requestElementType) {
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(requestElementType);
		if (provider == null) {
			return UnexecutableCommand.INSTANCE;
		}
		// Retrieve create command from the Element Edit service
		ICommand createGMFCommand = provider.getEditCommand(request);
		return getGEFWrapper(createGMFCommand);
	}

	/**
	 * @generated
	 */
	protected Command getExtendedCompleteCreateRelationshipCommand(CreateElementRequest request,
			IElementType requestElementType) {
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(requestElementType);
		if (provider == null) {
			return UnexecutableCommand.INSTANCE;
		}
		// Retrieve create command from the Element Edit service
		ICommand createGMFCommand = provider.getEditCommand(request);
		return getGEFWrapper(createGMFCommand);
	}

	// RS: End of add code for extended types
	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		EObject targetCEObject = req.getTargetContainer();
		if (targetCEObject != null) {
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(targetCEObject);
			if (provider != null) {
				ICommand moveCommand = provider.getEditCommand(req);
				if (moveCommand != null) {
					return new ICommandProxy(moveCommand);
				}
			}
			return UnexecutableCommand.INSTANCE;
		} else {
			return getGEFWrapper(new MoveElementsCommand(req));
		}

	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return (cmd == null) ? UnexecutableCommand.INSTANCE : new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * 
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator<?> it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = UMLDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			UMLDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		public LinkConstraints() { // use static method #getLinkConstraints() to access instance
		}

		/**
		* @generated
		*/
		public boolean canCreatePort_BehaviorEdge() {
			return canExistPort_BehaviorEdge();
		}

		/**
		* @generated
		*/
		public boolean canCreateLink_DescriptorEdge() {
			return canExistLink_DescriptorEdge();
		}

		/**
		* @generated
		*/
		public boolean canCreateComment_AnnotatedElementEdge(Comment source, Element target) {
			if (source != null) {
				if (source.getAnnotatedElements().contains(target)) {
					return false;
				}
			}

			return canExistComment_AnnotatedElementEdge(source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateConstraint_ConstrainedElementEdge(Constraint source, Element target) {
			if (source != null) {
				if (source.getConstrainedElements().contains(target)) {
					return false;
				}
			}

			return canExistConstraint_ConstrainedElementEdge(source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateComponentRealization_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistComponentRealization_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateInterfaceRealization_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistInterfaceRealization_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateSubstitution_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistSubstitution_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateRealization_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistRealization_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateManifestation_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistManifestation_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateAbstraction_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistAbstraction_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateUsage_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistUsage_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateDeployment_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistDeployment_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateDependency_RoleBindingEdge(Package container, NamedElement source,
				NamedElement target) {
			return canExistDependency_RoleBindingEdge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateDependency_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistDependency_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateConnector_Edge(StructuredClassifier container, ConnectorEnd source,
				ConnectorEnd target) {
			return canExistConnector_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateGeneralization_Edge(Classifier container, Classifier source, Classifier target) {
			return canExistGeneralization_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateTimeObservation_EventEdge(TimeObservation source, NamedElement target) {
			if (source != null) {
				if (source.getEvent() != null) {
					return false;
				}
			}

			return canExistTimeObservation_EventEdge(source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateDurationObservation_EventEdge(DurationObservation source, NamedElement target) {
			if (source != null) {
				if (source.getEvents().size() >= 2 || source.getEvents().contains(target)) {
					return false;
				}
			}

			return canExistDurationObservation_EventEdge(source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateRepresentation_Edge(InformationItem source, Classifier target) {
			if (source != null) {
				if (source.getRepresenteds().contains(target)) {
					return false;
				}
			}

			return canExistRepresentation_Edge(source, target);
		}

		/**
		* @generated
		*/
		public boolean canCreateInformationFlow_Edge(Package container, NamedElement source, NamedElement target) {
			return canExistInformationFlow_Edge(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistPort_BehaviorEdge() {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLink_DescriptorEdge() {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistComment_AnnotatedElementEdge(Comment source, Element target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistConstraint_ConstrainedElementEdge(Constraint source, Element target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistComponentRealization_Edge(Package container, ComponentRealization linkInstance,
				NamedElement source, NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistInterfaceRealization_Edge(Package container, InterfaceRealization linkInstance,
				NamedElement source, NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistSubstitution_Edge(Package container, Substitution linkInstance, NamedElement source,
				NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRealization_Edge(Package container, Realization linkInstance, NamedElement source,
				NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistManifestation_Edge(Package container, Manifestation linkInstance, NamedElement source,
				NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistAbstraction_Edge(Package container, Abstraction linkInstance, NamedElement source,
				NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistUsage_Edge(Package container, Usage linkInstance, NamedElement source,
				NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistDeployment_Edge(Package container, Deployment linkInstance, NamedElement source,
				NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistDependency_RoleBindingEdge(Package container, Dependency linkInstance,
				NamedElement source, NamedElement target) {
			try {
				// RoleBinding source constraint
				if ((source != null) && !(source instanceof CollaborationUse)) {
					return false;
				}
				// RoleBinding source has a type
				if ((source != null) && (((CollaborationUse) source).getType() == null)) {
					return false;
				}
				// RoleBinding target constraint
				if ((target != null) && !(target instanceof ConnectableElement)) {
					return false;
				}
				// RoleBinding source and target have the same semantic parent
				if ((source != null) && (target != null) && (source.getOwner() != target.getOwner())) {
					return false;
				}
				return true;
			} catch (Exception e) {
				UMLDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistDependency_Edge(Package container, Dependency linkInstance, NamedElement source,
				NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistConnector_Edge(StructuredClassifier container, Connector linkInstance,
				ConnectorEnd source, ConnectorEnd target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistGeneralization_Edge(Classifier container, Generalization linkInstance, Classifier source,
				Classifier target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistTimeObservation_EventEdge(TimeObservation source, NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistDurationObservation_EventEdge(DurationObservation source, NamedElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRepresentation_Edge(InformationItem source, Classifier target) {
			try {
				// Represented InformationItem Target
				if (target != null) {
					if (!((target instanceof Class) || (target instanceof Interface)
							|| (target instanceof InformationItem) || (target instanceof Signal)
							|| (target instanceof Component))) {
						return false;
					}
				}
				return true;
			} catch (Exception e) {
				UMLDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistInformationFlow_Edge(Package container, InformationFlow linkInstance,
				NamedElement source, NamedElement target) {
			try {
				//Information Flow source constraint
				if (source != null) {
					if (!((source instanceof Actor) || (source instanceof Node) || (source instanceof UseCase)
							|| (source instanceof Artifact) || (source instanceof Class)
							|| (source instanceof Component) || (source instanceof Port) || (source instanceof Property)
							|| (source instanceof Interface) || (source instanceof Package)
							|| (source instanceof ActivityNode) || (source instanceof ActivityPartition)
							|| (source instanceof InstanceSpecification))) {

						return false;

					}
					if (source instanceof InstanceSpecification) {
						EList<Classifier> classes = ((InstanceSpecification) source).getClassifiers();
						for (int i = 0; i < classes.size(); i++) {
							if (classes.get(i) instanceof Relationship) {
								return false;
							}
						}
					}
				}
				//Information Flow target constraint
				if (target != null) {
					if (!((target instanceof Actor) || (target instanceof Node) || (target instanceof UseCase)
							|| (target instanceof Artifact) || (target instanceof Class)
							|| (target instanceof Component) || (target instanceof Port) || (target instanceof Property)
							|| (target instanceof Interface) || (target instanceof Package)
							|| (target instanceof ActivityNode) || (target instanceof ActivityPartition)
							|| (target instanceof InstanceSpecification))) {

						return false;

					}
					if (target instanceof InstanceSpecification) {
						EList<Classifier> classes = ((InstanceSpecification) target).getClassifiers();
						for (int i = 0; i < classes.size(); i++) {
							if (classes.get(i) instanceof Relationship) {
								return false;
							}
						}
					}
				}
				return true;
			} catch (Exception e) {
				UMLDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}
}