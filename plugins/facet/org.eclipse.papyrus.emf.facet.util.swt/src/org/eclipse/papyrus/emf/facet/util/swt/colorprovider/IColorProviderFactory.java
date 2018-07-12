/*******************************************************************************
 * Copyright (c) 2013 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Grégoire Dupé (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 ******************************************************************************/
package org.eclipse.papyrus.emf.facet.util.swt.colorprovider;

import org.eclipse.papyrus.emf.facet.util.swt.internal.colorprovider.ColorProviderFactory;
import org.eclipse.swt.graphics.Device;

public interface IColorProviderFactory {

	IColorProviderFactory DEFAULT = new ColorProviderFactory();

	IColorProvider getOrCreateIColorProvider(Device device);
}
