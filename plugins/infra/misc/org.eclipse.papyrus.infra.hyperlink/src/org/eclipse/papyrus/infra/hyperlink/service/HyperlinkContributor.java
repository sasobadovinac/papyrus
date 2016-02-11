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

package org.eclipse.papyrus.infra.hyperlink.service;

import java.util.List;

import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkObject;

/**
 * A HyperlinkContributor is used to create hyperlinks for
 * a specific element
 * 
 * @author Shuai Li
 * @since 2.0
 *
 */
public interface HyperlinkContributor {
	public List<HyperLinkObject> getHyperlinks(Object fromElement);
}
