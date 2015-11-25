/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Shuai Li (CEA LIST) <shuai.li@cea.fr> - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.navigation.menuContributor;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.gmfdiag.navigation.menu.button.NavigationSubMenuButton;
import org.eclipse.papyrus.infra.services.navigation.service.NavigableElement;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationMenuButton;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationMenuContributor;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationService;
import org.eclipse.papyrus.uml.navigation.Activator;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Relationship;

public class ChildrenButton implements NavigationMenuContributor {

	/**
	 * @see org.eclipse.papyrus.infra.services.navigation.service.NavigationMenuContributor#getButtons(java.lang.Object)
	 *
	 * @param fromElement
	 * @return
	 */
	public List<NavigationMenuButton> getButtons(Object fromElement) {
		List<NavigationMenuButton> buttons = new LinkedList<NavigationMenuButton>();

		if (fromElement instanceof Classifier) {
			try {
				NavigationService navigationService = ServiceUtilsForEObject.getInstance().getService(NavigationService.class, (Classifier) fromElement);

				List<NavigableElement> navigableElements = new LinkedList<NavigableElement>();
				for (Relationship relationship : ((Element) fromElement).getRelationships()) {
					if (relationship instanceof Generalization) {
						Generalization generalization = (Generalization) relationship;
						if (generalization.getGeneral() == fromElement) {
							Classifier specific = generalization.getSpecific();
							if (specific != null) {
								navigableElements.addAll(navigationService.getNavigableElements(specific));
							}
						}
					}
				}

				if (!navigableElements.isEmpty()) {
					buttons.add(new NavigationSubMenuButton("Children...", null, "Show children classes", navigableElements));
				}
			} catch (ServiceException e) {
				Activator.log.error(e);
			}
		}

		return buttons;
	}
}
