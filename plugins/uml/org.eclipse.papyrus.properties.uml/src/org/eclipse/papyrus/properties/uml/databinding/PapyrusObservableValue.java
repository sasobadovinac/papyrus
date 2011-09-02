/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.properties.uml.databinding;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.core.utils.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.properties.Activator;
import org.eclipse.papyrus.properties.databinding.EMFObservableValue;
import org.eclipse.papyrus.properties.util.EMFHelper;
import org.eclipse.papyrus.service.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.service.edit.service.IElementEditService;

/**
 * An ObservableValue used to edit EObject properties through
 * Papyrus commands
 * 
 * @author Camille Letavernier
 * 
 */
public class PapyrusObservableValue extends EMFObservableValue {

	public static final String UML_BOOLEAN_DATATYPE = "Boolean"; //$NON-NLS-1$

	/**
	 * 
	 * Constructor.
	 * 
	 * @param eObject
	 *        The EObject to edit
	 * @param eStructuralFeature
	 *        The structural feature to edit
	 * @param domain
	 *        The editing domain on which the commands will be executed
	 */
	public PapyrusObservableValue(EObject eObject, EStructuralFeature eStructuralFeature, EditingDomain domain) {
		this(Realm.getDefault(), eObject, eStructuralFeature, domain);
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param realm
	 * @param eObject
	 *        The EObject to edit
	 * @param eStructuralFeature
	 *        The structural feature to edit
	 * @param domain
	 *        The editing domain on which the commands will be executed
	 */
	public PapyrusObservableValue(Realm realm, EObject eObject, EStructuralFeature eStructuralFeature, EditingDomain domain) {
		super(eObject, eStructuralFeature, domain);
	}

	@Override
	protected void doSetValue(Object value) {
		Command emfCommand = getCommand(value);
		domain.getCommandStack().execute(emfCommand);
	}

	/**
	 * Returns the EMF Command for modifying this Observable's value
	 * 
	 * @param value
	 * @return
	 */
	public Command getCommand(Object value) {
		EObject eObjectValue = EMFHelper.getEObject(value);
		if(eObjectValue != null) {
			value = eObjectValue;
		}

		try {
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(getObserved());

			if(provider != null) {
				SetRequest request = new SetRequest((TransactionalEditingDomain)domain, eObject, eStructuralFeature, value);
				ICommand createGMFCommand = provider.getEditCommand(request);

				Command emfCommand = new GMFtoEMFCommandWrapper(createGMFCommand);

				return emfCommand;
			}
		} catch (Exception ex) {
			Activator.log.error(ex);
		}

		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * 
	 * @return the {@link EStructuralFeature} observed by this object
	 */
	public EStructuralFeature getEStructuralFeature() {
		return eStructuralFeature;
	}

	/**
	 * 
	 * @return the {@link EObject} observed by this object
	 */
	public EObject getEObject() {
		return eObject;
	}
}
