/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.moka.fuml.standardlibrary.library.integer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.IntegerValue;
import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue;
import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.Value;
import org.eclipse.papyrus.moka.fuml.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import org.eclipse.papyrus.moka.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;

public class ToUnlimitedNatural extends OpaqueBehaviorExecution {

	@Override
	public void doBody(List<ParameterValue> inputParameters, List<ParameterValue> outputParameters) {
		try {
			Integer x = ((IntegerValue)inputParameters.get(0).values.get(0)).value;
			UnlimitedNaturalValue result = new UnlimitedNaturalValue();
			result.value = x;
	    	result.type = this.locus.factory.getBuiltInType("UnlimitedNatural"); // ADDED
			List<Value> outputs = new ArrayList<Value>();
			outputs.add(result);
			outputParameters.get(0).values = outputs;
		} catch (Exception e) {
			Activator.log.error("An error occured during the execution of ToUnlimitedReal " + e.getMessage(), e);
		}
	}

	@Override
	public Value new_() {
		return new ToUnlimitedNatural();
	}
}
