/*****************************************************************************
 * Copyright (c) 2017 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.activity.edit.advices;

import java.util.List;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.util.PinUpdateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.utils.updater.IPinUpdater;
import org.eclipse.papyrus.uml.diagram.activity.edit.utils.updater.PinUpdaterFactory;
import org.eclipse.papyrus.uml.diagram.activity.edit.utils.updater.preferences.AutomatedModelCompletionPreferencesInitializer;
import org.eclipse.papyrus.uml.diagram.activity.edit.utils.updater.preferences.IAutomatedModelCompletionPreferencesConstants;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.tools.utils.ElementUtil;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
 * 
 * Pin of ValueSpecificationAction should be create and update automatically
 * @since 3.0
 *
 */
public class InstanceValueEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterEditCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	public ICommand getAfterSetCommand(SetRequest request) {
		// 1] check if the setFeature is instance
		if (request.getFeature().equals(UMLPackage.eINSTANCE.getInstanceValue_Instance())) {
			final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
			boolean synchronizePin = false;
			// 2] get the preference for ValueSpecificationAction
			synchronizePin = (prefStore.getString(IAutomatedModelCompletionPreferencesConstants.VALUE_SPECIFICATION_ACTION).equals(AutomatedModelCompletionPreferencesInitializer.PIN_SYNCHRONIZATION));
			// 3] check preference
			if (synchronizePin) {
				InstanceValue instanceValue = (InstanceValue) request.getElementToEdit();
				Package root = PackageUtil.getRootPackage(instanceValue);
				if (root != null) {
					// 4] get all ValueSpecificationAction
					List<ValueSpecificationAction> allValueSpecificationAction = ElementUtil.getInstancesFilteredByType(root, ValueSpecificationAction.class, null);
					// 5] loop into the list of ValueSpecificationAction
					for (ValueSpecificationAction valueSpecificationAction : allValueSpecificationAction) {
						if (valueSpecificationAction.getValue() instanceof InstanceValue) {
							if (valueSpecificationAction.getValue() == instanceValue) {
								// 6] call the command for the ValueSpecificationAction whose value is the instanceValue
								IPinUpdater<ValueSpecificationAction> updater = PinUpdaterFactory.getInstance().instantiate(valueSpecificationAction);
								return new PinUpdateCommand<ValueSpecificationAction>("Update value specification action pins", updater, valueSpecificationAction); //$NON-NLS-1$
							}
						}
					}
				}
			}
		}
		return super.getAfterSetCommand(request);
	}
}
