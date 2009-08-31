/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
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
package org.eclipse.papyrus.umlutils.ui.helper;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.umlutils.ui.VisualInformationPapyrusConstant;
import org.eclipse.papyrus.umlutils.ui.command.SetNameLabelIconCommand;

public class NameLabelIconHelper {

	/**
	 * get the display name label icon indication true or false
	 * 
	 * @param modelElement
	 *            the view where is attach the element
	 */
	public static boolean getNameLabelIconValue(EModelElement modelElement) {
		EAnnotation stereotypeDisplayKind = modelElement
				.getEAnnotation(VisualInformationPapyrusConstant.DISPLAY_NAMELABELICON);
		if (stereotypeDisplayKind != null) {
			EMap<String, String> entries = stereotypeDisplayKind.getDetails();

			if (entries != null) {
				String gradientvalueString = entries.get(VisualInformationPapyrusConstant.DISPLAY_NAMELABELICON_VALUE);
				if (gradientvalueString != null) {
					Boolean b = new Boolean(gradientvalueString);
					return b;
				}
			}
		}
		return false;
	}

	/**
	 * Gets the command to set the gradient to true are false.
	 * 
	 * @param domain
	 *            the domain
	 * @param view
	 *            the view
	 * @param nameLabelIconValue
	 *            true to display the icon of the element in labelName
	 * 
	 * @return the command to set the gradient to true are false.
	 */
	public static RecordingCommand getNameLabelIconCommand(TransactionalEditingDomain domain, EModelElement view,
			boolean nameLabelIconValue) {
		return new SetNameLabelIconCommand(domain, view, nameLabelIconValue);
	}

}
