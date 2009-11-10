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
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.EditingDomainUndoContext;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.core.utils.DiResourceSet;
import org.eclipse.papyrus.core.utils.NotationUtils;
import org.eclipse.papyrus.navigator.internal.utils.NavigatorUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

/**
 * @author eperico
 */
public class UncontrolCommand extends AbstractTransactionalCommand {

	private EObject eObject;

	private DiResourceSet diResourceSet;

	private Resource controlledModel;

	private Resource controlledNotation;

	private Resource controlledDI;

	/**
	 * Instantiates a new uncontrol command.
	 * 
	 * @param domain
	 * @param label
	 * @param affectedFiles
	 * @param selectedObject
	 */
	@SuppressWarnings("unchecked")
	public UncontrolCommand(TransactionalEditingDomain domain, EObject selectedObject, String label, List affectedFiles) {
		super(domain, label, affectedFiles);
		this.eObject = selectedObject;
		// Add an undo context to allow the editor to react to that change
		addContext(new EditingDomainUndoContext(domain));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		doRedo(monitor, info);
		return CommandResult.newOKCommandResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IStatus doUndo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		// execute control command
		try {
			ControlCommand transactionalCommand = new ControlCommand(diResourceSet.getTransactionalEditingDomain(),
					controlledModel, eObject, "Control", null);
			OperationHistoryFactory.getOperationHistory()
					.execute(transactionalCommand, new NullProgressMonitor(), null);
			return Status.OK_STATUS;
		} catch (ExecutionException e) {
			EMFEditUIPlugin.INSTANCE.log(e);
			return Status.CANCEL_STATUS;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IStatus doRedo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (eObject != null) {
			controlledModel = eObject.eResource();
			final URI newNotationURI = URI.createURI(controlledModel.getURI().trimFileExtension().appendFileExtension(
					DiResourceSet.NOTATION_FILE_EXTENSION).toString());
			this.controlledNotation = getEditingDomain().getResourceSet().getResource(newNotationURI, false);

			final URI newDiURI = URI.createURI(controlledModel.getURI().trimFileExtension().appendFileExtension(
					DiResourceSet.DI_FILE_EXTENSION).toString());
			this.controlledDI = getEditingDomain().getResourceSet().getResource(newDiURI, true);
		}
		CompoundCommand compoundCommand = new CompoundCommand();
		this.diResourceSet = NavigatorUtils.getDiResourceSet();

		// First retrieve the Diagrams that match with the model object to Uncontrol
		final List<Diagram> controlledDiagrams = NotationUtils.getDiagrams(controlledNotation, eObject);

		if (!controlledDiagrams.isEmpty()) {
			final Resource notationResource = diResourceSet.getNotationResource();
			compoundCommand.append(new AddCommand(getEditingDomain(), notationResource.getContents(),
					controlledDiagrams));
		}

		// Create the Command to Uncontrol the model object
		compoundCommand.append(new RemoveCommand(getEditingDomain(), eObject.eResource().getContents(), eObject));

		// Ensure that all proxies are resolved so that references to the controlled object will be
		// updated to reference the new resource.
		EcoreUtil.resolveAll(getEditingDomain().getResourceSet());

		compoundCommand.execute();
		// TODO save resources, check if it is useful
		// try {
		// diResourceSet.save(new NullProgressMonitor());
		// } catch (IOException e) {
		// EMFEditUIPlugin.INSTANCE.log(e);
		// return Status.CANCEL_STATUS;
		// }
		deleteControlledResources();
		return Status.OK_STATUS;
	}

	/**
	 * Delete the controlled resources.
	 */
	private void deleteControlledResources() {
		// Remove the controlled resources from the resource set.
		EList<Resource> resources = getEditingDomain().getResourceSet().getResources();
		resources.remove(controlledModel);
		resources.remove(controlledNotation);
		resources.remove(controlledDI);

		Collection<IResource> todelete = new ArrayList<IResource>();
		addFileResource(controlledModel, todelete);
		addFileResource(controlledNotation, todelete);
		addFileResource(controlledDI, todelete);

		boolean confirmDelete = MessageDialog.openQuestion(Display.getDefault().getActiveShell(),
				"Delete controlled resources?", "Delete the original controlled files ?");
		// if confirmed delete is false, uncontrol is done and old controlled resource is a single
		// resource
		if (confirmDelete) {
			for (IResource file : todelete) {
				try {
					file.delete(true, new NullProgressMonitor());
				} catch (CoreException exception) {
					MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Unable to delete", "An error occurred when trying to delete " + file.toString()
									+ ". See error logs for more details.");
					EMFEditUIPlugin.INSTANCE.log(exception);
				}
			}
		}
	}

	/**
	 * private method that comes from org.topcased.modeler.internal.actions.ModelerUncontrolAction
	 */
	private void addFileResource(Resource emfRes, Collection<IResource> fileResources) {
		URI uri = (emfRes != null) ? emfRes.getURI() : null;
		if (uri != null && uri.isPlatformResource()) {
			IPath path = new Path(uri.toPlatformString(false));
			IResource r = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
			if (r != null) {
				fileResources.add(r);
			}
		}
	}

}
