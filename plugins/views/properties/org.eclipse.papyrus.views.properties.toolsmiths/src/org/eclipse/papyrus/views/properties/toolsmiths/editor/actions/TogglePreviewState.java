/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
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
package org.eclipse.papyrus.views.properties.toolsmiths.editor.actions;

import org.eclipse.core.commands.State;
import org.eclipse.papyrus.views.properties.toolsmiths.editor.preview.Preview;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;

/**
 * A State to determine if the Preview view is opened in the current perspective
 * The State should listen on the workbench an update itself when the perspective
 * changes, or when the preview is opened or closed
 *
 * @FIXME : the state is not correctly retrieved
 * @author Camille Letavernier
 */
public class TogglePreviewState extends State implements IWindowListener, IPartListener {

	private boolean isPreviewOpen;

	public TogglePreviewState() {
		// System.out.println("Building ToggleState");
		//
		// IWorkbench workbench = PlatformUI.getWorkbench();
		//
		// workbench.addWindowListener(this);
		// for(IWorkbenchWindow window : workbench.getWorkbenchWindows()) {
		// System.out.println("Listening on " + window);
		// window.getPartService().addPartListener(this);
		// }
		// refreshState();
	}

	private void refreshState() {
		// isPreviewOpen = false;
		// System.out.println("Refresh state");
		//
		// IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		// if(window != null) {
		// IWorkbenchPage page = window.getActivePage();
		//
		// if(page != null) {
		// for(IViewReference reference : page.getViewReferences()) {
		// if(reference.getId().equals(Activator.PREVIEW_ID)) {
		// isPreviewOpen = true;
		// break;
		// }
		// }
		// }
		// }
		//
		// System.out.println("IsOpen : " + isPreviewOpen);
		//
		// setValue(isPreviewOpen);
	}

	@Override
	public Object getValue() {
		return isPreviewOpen;
	}

	// IWindowListener

	@Override
	public void windowOpened(IWorkbenchWindow window) {
		// System.out.println("Listening on " + window);
		window.getPartService().addPartListener(this);
		refreshState();
	}

	@Override
	public void windowClosed(IWorkbenchWindow window) {
		// window.removePageListener(this);
		window.getPartService().removePartListener(this);
	}

	// IPageListener
	//
	// public void pageOpened(IWorkbenchPage page) {
	// page.addPartListener(this);
	// }
	//
	// public void pageClosed(IWorkbenchPage page) {
	// page.removePartListener(this);
	// }

	// IPartListener

	@Override
	public void partOpened(IWorkbenchPart part) {
		if (part instanceof Preview) {
			// System.out.println("Closing preview");
			refreshState();
		}
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		if (part instanceof Preview) {
			// System.out.println("Closing preview");
			refreshState();
		}
	}

	// Ignored methods

	@Override
	public void partActivated(IWorkbenchPart part) {
		// System.out.println("Part activated");
		// refreshState();
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		// Nothing
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		// System.out.println("Part activated");
		// refreshState();
	}

	@Override
	public void windowActivated(IWorkbenchWindow window) {
		// Nothing
	}

	@Override
	public void windowDeactivated(IWorkbenchWindow window) {
		// Nothing
	}

	public void pageActivated(IWorkbenchPage page) {
		// Nothing
	}

}
