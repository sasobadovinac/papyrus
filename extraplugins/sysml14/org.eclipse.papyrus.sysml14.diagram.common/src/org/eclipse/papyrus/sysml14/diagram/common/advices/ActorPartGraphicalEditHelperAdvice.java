/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.sysml14.diagram.common.advices;



import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.sysml14.diagram.common.command.ConfigurePartCommand;
import org.eclipse.papyrus.sysml14.diagram.common.dialog.CreateOrSelectActorPartTypeDialog;
import org.eclipse.papyrus.sysml14.service.types.advice.ActorPartEditHelperAdvice;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;


/**
 * The helperadvice class used for ActorPart
 *
 */
public class ActorPartGraphicalEditHelperAdvice extends AbstractEditHelperAdvice {
	
	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getBeforeConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getBeforeConfigureCommand(ConfigureRequest request) {
		configureRequest(request);
		return super.getBeforeConfigureCommand(request);		
	}
	
	/**
	 * @param request
	 */
	private void configureRequest(ConfigureRequest request) {
		Map<String, Object> newParameters = new HashMap<String, Object>();
		
		ICommand configureCommand = null;

		Shell shell = Display.getDefault().getActiveShell();
		// Start dialog to identify the new part type
		Property part = (Property) request.getElementToConfigure();
		Package partPkg = part.getNearestPackage();

		
		CreateOrSelectActorPartTypeDialog dialog = new CreateOrSelectActorPartTypeDialog(shell, partPkg);
		dialog.open();
		if (dialog.getReturnCode() == Window.OK) {

			final ICommand typeCreationCommand = dialog.getNewTypeCreateCommand();
			final Type partType = (Type) dialog.getExistingType();

			// Abort if type creation command exists but is not executable
			if ((typeCreationCommand != null) && (!typeCreationCommand.canExecute())) {
				configureCommand = UnexecutableCommand.INSTANCE;
			} else {
				configureCommand = CompositeCommand.compose(configureCommand, typeCreationCommand);
			}

			// Create the configure command that will set the constraint property type
			ICommand setTypeCommand = new ConfigurePartCommand(request,partType,typeCreationCommand) ;
			configureCommand = CompositeCommand.compose(configureCommand, setTypeCommand);
		} else {
			throw new OperationCanceledException("Actor part creation cancelled by user"); //$NON-NLS-1$
		}
		
		newParameters.put(ActorPartEditHelperAdvice.SET_ACTOR_ICOMMAND, configureCommand);
		request.addParameters(newParameters);
	}
}
