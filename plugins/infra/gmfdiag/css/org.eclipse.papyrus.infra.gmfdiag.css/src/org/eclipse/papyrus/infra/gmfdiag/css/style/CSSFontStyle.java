/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.style;


public interface CSSFontStyle {

	public int getCSSFontColor();


	public java.lang.String getCSSFontName();


	public int getCSSFontHeight();


	public boolean isCSSBold();


	public boolean isCSSItalic();


	public boolean isCSSUnderline();


	public boolean isCSSStrikeThrough();

}
