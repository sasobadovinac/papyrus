/*****************************************************************************
 * Copyright (c) 2014, 2015 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 433206
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.canonical.strategy;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

/**
 * Registration of an {@link ISemanticChildrenStrategy} on the extension point.
 */
class SemanticChildrenStrategyRegistration extends EditPartBasedRegistration<ISemanticChildrenStrategy, SemanticChildrenStrategyRegistration> {

	public SemanticChildrenStrategyRegistration(IConfigurationElement config) throws CoreException {
		super(config, ISemanticChildrenStrategy.class);
	}
}
