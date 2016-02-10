/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.ui.editor.reload;

/**
 * Protocol implemented by {@link EditorReloadEvent} context objects that must be disposed when they are no longer needed.
 *
 * @see EditorReloadEvent#dispose()
 */
public interface IDisposableReloadContext {

	void dispose();
}