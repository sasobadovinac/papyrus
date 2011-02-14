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
package org.eclipse.papyrus.properties.uml.modelelement;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.properties.contexts.DataContextElement;
import org.eclipse.papyrus.properties.modelelement.ModelElement;
import org.eclipse.papyrus.properties.modelelement.ModelElementFactory;
import org.eclipse.papyrus.properties.uml.Activator;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * A Factory for building {@link StereotypeModelElement}s
 * 
 * @author Camille Letavernier
 */
public class StereotypeModelElementFactory implements ModelElementFactory {

	public ModelElement createFromSource(Object source, DataContextElement context) {

		if(source instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable)source;
			Element umlElement = (Element)adaptable.getAdapter(EObject.class);

			Stereotype stereotype = umlElement.getAppliedStereotype(getQualifiedName(context));
			EObject stereotypeApplication = umlElement.getStereotypeApplication(stereotype);

			if(stereotypeApplication == null) {
				//Looking for SysML::Blocks::Block properties on SysML::Blocks::ConstraintBlock
				//Inherited properties aren't working well
				//TODO : Correct bug
				Activator.log.warn("Stereotype " + getQualifiedName(context) + " is not applied on " + umlElement); //$NON-NLS-1$ //$NON-NLS-2$
			} else {
				EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(stereotypeApplication);

				return new StereotypeModelElement(stereotypeApplication, domain);
			}
		}

		return null;
	}

	private String getQualifiedName(DataContextElement context) {
		if(context.getPackage() == null) {
			return context.getName();
		} else {
			return getQualifiedName(context.getPackage()) + "::" + context.getName(); //$NON-NLS-1$
		}
	}
}
