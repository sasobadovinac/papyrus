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
 *  Francois Le Fevre (CEA LIST) francois.le-fevre@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.modelexplorer.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableNamedElement;
import org.eclipse.papyrus.infra.ui.menu.NameNormalizationCommand;

/**
 * @author flefevre
 * 
 */
public class NattableNameNormalizationCommand extends NameNormalizationCommand{
	

	public NattableNameNormalizationCommand(TransactionalEditingDomain domain, EObject source, String parameter){ 
		super(domain,source,parameter);
	}


	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	@Override
	protected void doExecute() {
		if(source instanceof TableNamedElement){
			String name = ((TableNamedElement)source).getName();
			
			switch (parameter) {
			case UPPERCASE_ACTION:
				((TableNamedElement)source).setName(name.toUpperCase());
				break;
			case LOWERCASE_ACTION:
				((TableNamedElement)source).setName(name.toLowerCase());
				break;

			default:
				((TableNamedElement)source).setName(name.toUpperCase());
				break;
			}
			
		}
	}

}