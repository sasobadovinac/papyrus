/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.service.types.helper.advice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.papyrus.uml.diagram.common.helper.DurationConstraintHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.DurationObservationHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.TimeConstraintHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.TimeObservationHelper;
import org.eclipse.papyrus.uml.service.types.utils.SequenceRequestConstant;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.Package;

/**
 * Helper advice for all {@link OccurrenceSpecification} elements.
 */
public class OccurrenceSpecificationHelperAdvice extends AbstractEditHelperAdvice {


	/**
	 * <pre>
	 * {@inheritDoc}
	 * 
	 * Complete the creation by adding the covered lifeline.
	 * </pre>
	 */
	@Override
	protected ICommand getBeforeConfigureCommand(final ConfigureRequest request) {

		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				Object coveredParam = request.getParameters().get(SequenceRequestConstant.COVERED);

				Lifeline coveredLifeline = null;
				if (coveredParam instanceof Lifeline) {
					coveredLifeline = (Lifeline) coveredParam;
				}

				final OccurrenceSpecification occurrenceSpecification = (OccurrenceSpecification) request.getElementToConfigure();
				if( coveredLifeline!=null){
					occurrenceSpecification.setCovered(coveredLifeline);
				}

				return CommandResult.newOKCommandResult(occurrenceSpecification);
			}

		};
	}


	/**
	 * <pre>
	 * Add a command to destroy :
	 * - related time elements
	 * - linked general ordering
	 * </pre>
	 * 
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getBeforeDestroyDependentsCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest)
	 * 
	 * @param request
	 *        the request
	 * @return the command to execute before the edit helper work is done
	 */
	@Override
	protected ICommand getBeforeDestroyDependentsCommand(DestroyDependentsRequest request) {
		List<EObject> dependentsToDestroy = new ArrayList<EObject>();

		OccurrenceSpecification os = (OccurrenceSpecification)request.getElementToDestroy();

		//look for all Execution that references this Occurrence specification
		InteractionFragment containerPackage= (InteractionFragment)os.getOwner();
		if( containerPackage!=null) {
			Iterator<EObject> contentIterator=containerPackage.eAllContents();
			while (contentIterator.hasNext()) {
				EObject currentEObject= contentIterator.next();
				if( currentEObject instanceof Message) {
					Message m=(Message)currentEObject;
					if( os.equals(m.getSendEvent())) {
						dependentsToDestroy.add(m);
						if(m.getReceiveEvent()!=null) {
							dependentsToDestroy.add(m.getReceiveEvent());
						}
					}
					if( os.equals(m.getReceiveEvent())) {
						dependentsToDestroy.add(m);
						if(m.getSendEvent()!=null) {
							dependentsToDestroy.add(m.getSendEvent());
						}
					}
				}
				if( currentEObject instanceof ExecutionSpecification) {
					ExecutionSpecification exec=(ExecutionSpecification)currentEObject;
					if( os.equals(exec.getStart())) {
						dependentsToDestroy.add(exec);
						if( exec.getFinish()!= null&&!(exec.getFinish() instanceof MessageEnd)) {
							dependentsToDestroy.add(exec.getFinish());
						}
					}
					if( os.equals(exec.getFinish())) {
						dependentsToDestroy.add(exec);
						if( exec.getStart()!= null&& !(exec.getStart() instanceof MessageEnd)) {
							dependentsToDestroy.add(exec.getStart());
						}
					}
				}
			}
		}
		// delete linked time elements
		dependentsToDestroy.addAll(TimeObservationHelper.getTimeObservations(os));
		dependentsToDestroy.addAll(TimeConstraintHelper.getTimeConstraintsOn(os));
		dependentsToDestroy.addAll(DurationObservationHelper.getDurationObservationsOn(os));
		dependentsToDestroy.addAll(DurationConstraintHelper.getDurationConstraintsOn(os));

		// delete linked general ordering
		/**
		 * Note: GeneralOrdering should be necessarily removed because the opposite
		 * references 'GeneralOrdering::before[1]' and 'GeneralOrdering::after[1]' which designate 
		 * this OccurrenceSpecification are mandatory 
		 */
		dependentsToDestroy.addAll(os.getToBefores());
		dependentsToDestroy.addAll(os.getToAfters());

		if(!dependentsToDestroy.isEmpty()) {
			return request.getDestroyDependentsCommand(dependentsToDestroy);
		} 

		return null;
	}
}
