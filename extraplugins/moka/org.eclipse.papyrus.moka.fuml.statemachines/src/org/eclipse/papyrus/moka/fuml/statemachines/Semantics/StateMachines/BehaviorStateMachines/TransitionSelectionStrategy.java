/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Jeremie Tatibouet (CEA LIST)
 *
 *****************************************************************************/
package org.eclipse.papyrus.moka.fuml.statemachines.Semantics.StateMachines.BehaviorStateMachines;

import java.util.List;

import org.eclipse.papyrus.moka.fuml.Semantics.CommonBehaviors.Communications.EventOccurrence;

public abstract class TransitionSelectionStrategy{
	
	// The state-machine execution for which the configuration
	// will be used to determine transition which can be fired
	protected StateMachineExecution execution;
	
	public TransitionSelectionStrategy(StateMachineExecution execution){
		this.execution = execution;
	}
	
	/*
	 * Returns true if the given event occurrence can be deferred; false otherwise.
	 */
	public abstract boolean isDeferred(EventOccurrence eventOccurrence);
	
	/*
	 * Defer the given event occurrence
	 */
	public abstract void defer(EventOccurrence eventOccurrence);
	
	/*
	 * Returns true if at least one outgoing transition of a state which is currently
	 * part of the active state configuration.
	 */
	public abstract boolean isTriggering(EventOccurrence eventOccurrence);
	
	/*
	 *  Describe  the process of selecting transition that can be fired using the given event
	 *  occurrence. Note that the selection only assesses outgoing transition that are in the
	 *  state-machine configuration. Priority rules introduced by hierarchy are taken into account
	 */
	public abstract List<TransitionActivation> select(EventOccurrence eventOccurrence);
	
}
