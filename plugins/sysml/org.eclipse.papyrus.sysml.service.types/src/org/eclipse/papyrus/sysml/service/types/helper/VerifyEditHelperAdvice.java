/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.service.types.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.papyrus.sysml.requirements.RequirementsPackage;
import org.eclipse.papyrus.sysml.requirements.Verify;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.papyrus.uml.service.types.helper.advice.AbstractStereotypedElementEditHelperAdvice;
import org.eclipse.papyrus.uml.service.types.utils.NamedElementHelper;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/** SysML {@link Verify} edit helper advice */
public class VerifyEditHelperAdvice extends AbstractStereotypedElementEditHelperAdvice {

	/** Default constructor */
	public VerifyEditHelperAdvice() {
		requiredProfileIDs.add(SysmlResource.REQUIREMENTS_ID);
	}

	/** Complete creation process by applying the expected stereotype */
	@Override
	protected ICommand getBeforeConfigureCommand(final ConfigureRequest request) {

		return new ConfigureElementCommand(request) {

			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				NamedElement element = (NamedElement)request.getElementToConfigure();
				if(element != null) {
					Stereotype stereotypeToApply = element.getApplicableStereotype(SysmlResource.VERIFY_ID);
					if(stereotypeToApply != null) {
						element.applyStereotype(stereotypeToApply);
					}

					// Set default name
					// Initialize the element name based on the created IElementType
					String initializedName = NamedElementHelper.getDefaultNameWithIncrementFromBase(RequirementsPackage.eINSTANCE.getVerify().getName(), element.eContainer().eContents());
					element.setName(initializedName);
				}
				return CommandResult.newOKCommandResult(element);
			}
		};
	}
}
