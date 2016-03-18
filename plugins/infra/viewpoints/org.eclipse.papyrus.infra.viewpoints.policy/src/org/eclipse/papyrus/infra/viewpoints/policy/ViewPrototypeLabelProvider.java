/*****************************************************************************
 * Copyright (c) 2012, 2016 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 474467
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.viewpoints.policy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.ui.emf.providers.DependentEMFLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * A Label Provider for viewpoint-based notations.
 * 
 * @since 1.2
 */
public class ViewPrototypeLabelProvider extends DependentEMFLabelProvider {

	@Override
	protected Image getImage(EObject element) {
		Image result;

		ViewPrototype proto = ViewPrototype.get(element);
		if (proto != null) {
			// This is shared by the Widgets plug-in activator, so don't
			// dispose it
			result = proto.getIcon();
		} else {
			result = super.getImage(element);
		}

		return result;
	}

	@Override
	protected String getText(EObject element) {
		// Hit the delegate to ensure that the item provider adapter is attached
		// for notifications
		String result = super.getText(element);

		ViewPrototype proto = ViewPrototype.get(element);
		if (!proto.isUnavailable()) {
			EObject context = proto.getRootOf(element);
			result = getName(element);

			if ((result != null) && !result.isEmpty()) {
				if (context != null) {
					// In case we were deriving a label from it
					unsubscribe(context, element);
				}
			} else {
				if (context != null) {
					String contextLabel = getText(context);
					result = NLS.bind("({0} of {1})", proto.getLabel(), contextLabel);

					// Update when the context's label changes
					subscribe(context, element);
				} else {
					result = NLS.bind("({1})", proto.getLabel());
				}

				if ((result == null) || result.isEmpty()) {
					result = "(unnamed)";
				}
			}
		} // else just keep the super result

		return result;
	}

	/**
	 * Attempts to infer the name of an {@code object} by looking for a string-valued
	 * attribute named "name".
	 * 
	 * @param object
	 *            an object
	 * 
	 * @return a best-effort name for the {@code object}
	 * 
	 * @see EMFCoreUtil#getName(EObject)
	 */
	protected String getName(EObject object) {
		return EMFCoreUtil.getName(object);
	}
}