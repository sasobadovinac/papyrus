/*****************************************************************************
 * Copyright (c) 2010-2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 * 		Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <pre>
 * 
 * Edit helper class for {@link Port}
 * 
 * Expected behavior:
 * - Initialize {@link AggregationKind} on {@link Port} creation.
 * - Forbid aggregation modification during the element life cycle.
 * 
 * </pre>
 */
public class PortEditHelper extends ElementEditHelper {

	@Override
	protected ICommand getConfigureCommand(final ConfigureRequest req) {

		return new ConfigureElementCommand(req) {

			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {

				Port element = (Port)req.getElementToConfigure();
				element.setAggregation(AggregationKind.COMPOSITE_LITERAL);

				return CommandResult.newOKCommandResult(element);
			}
		};
	}

	@Override
	protected ICommand getSetCommand(SetRequest req) {

		// Forbid any attempt to change Port aggregation
		if(UMLPackage.eINSTANCE.getProperty_Aggregation().equals(req.getFeature())) {
			return UnexecutableCommand.INSTANCE;
		}

		return super.getSetCommand(req);
	}
}
