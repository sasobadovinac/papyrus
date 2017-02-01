/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Jeremie Tatibouet (CEA) - Apply Fix fUML12-35 Initial execution of an activity is not run to completion
 *   
 *****************************************************************************/

package org.eclipse.papyrus.moka.fuml.Semantics.CommonBehaviors.Communications;

import java.util.List;

import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.Reference;
import org.eclipse.papyrus.moka.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.eclipse.uml2.uml.Trigger;

/**
 * An event occurrence represents a single occurrence of a specific kind of event.
 */
public abstract class EventOccurrence {
	
	public Reference target;	
	
	public abstract boolean match(Trigger trigger);
		
	public boolean matchAny(List<Trigger> triggers){
		// Check that at least one of the given triggers is matched by this 
		// event occurrence.
		boolean matches = false;
		int i = 1;
		while(!matches && i <= triggers.size()){
			if(this.match(triggers.get(i-1))){
				matches = true;
			}
			i++;
		}
		return matches;
	}
		
	public abstract List<ParameterValue> getParameterValues();
	
	
	public void sendTo(Reference target){
		// Set the target reference and start the SendingBehavior, which 
		// will send this event occurrence to the target.
		this.target = target;
		this._startObjectBehavior();
	}
	
	public void doSend(){
		// Send this event occurrence to the target reference.
		this.target.send(this);
	}
	
	public void _startObjectBehavior() {
		// When the sending behavior starts, the current event
		// occurrence is is forwarded to the target object.
		if(this.target != null){
			this.doSend();
		}
	}
	
}
