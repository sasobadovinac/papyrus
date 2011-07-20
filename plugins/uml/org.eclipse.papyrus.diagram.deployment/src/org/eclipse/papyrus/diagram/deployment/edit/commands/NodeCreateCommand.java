/*
 * 
 */

package org.eclipse.papyrus.diagram.deployment.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.deployment.providers.ElementInitializers;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class NodeCreateCommand.
 *
 * @generated
 */
public class NodeCreateCommand extends EditElementCommand {

	/** The e class. @generated */
	private EClass eClass = null;

	/** The e object. @generated */
	private EObject eObject = null;

	/**
	 * Instantiates a new node create command.
	 *
	 * @param req the req
	 * @param eObject the e object
	 * @generated
	 */
	public NodeCreateCommand(CreateElementRequest req, EObject eObject) {
		super(req.getLabel(), null, req);
		this.eObject = eObject;
		this.eClass = eObject != null ? eObject.eClass() : null;
	}

	/**
	 * Creates the.
	 *
	 * @param req the req
	 * @param eObject the e object
	 * @return the node create command
	 * @generated
	 */
	public static NodeCreateCommand create(CreateElementRequest req, EObject eObject) {
		return new NodeCreateCommand(req, eObject);
	}

	/**
	 * Instantiates a new node create command.
	 *
	 * @param req the req
	 * @generated
	 */
	public NodeCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit().
	 *
	 * @return the element to edit
	 * @generated
	 */
	protected EObject getElementToEdit() {


		EObject container = ((CreateElementRequest)getRequest()).getContainer();
		if(container instanceof View) {
			container = ((View)container).getElement();
		}
		if(container != null) {
			return container;
		}
		return eObject;
	}

	/**
	 * Can execute.
	 *
	 * @return true, if successful
	 * @generated
	 */
	public boolean canExecute() {

		// Creation constraint for TopLevelNodes
		if(!(getElementToEdit() instanceof Package)) {
			return false;
		}

		return true;

	}

	/**
	 * Do execute with result.
	 *
	 * @param monitor the monitor
	 * @param info the info
	 * @return the command result
	 * @throws ExecutionException the execution exception
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {



		Node newElement = UMLFactory.eINSTANCE.createNode();

		Package owner = (Package)getElementToEdit();
		owner.getPackagedElements().add(newElement);


		ElementInitializers.getInstance().init_Node_2008(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest)getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}




	/**
	 * Do configure.
	 *
	 * @param newElement the new element
	 * @param monitor the monitor
	 * @param info the info
	 * @throws ExecutionException the execution exception
	 * @generated
	 */
	protected void doConfigure(Node newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest)getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest)getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if(configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
