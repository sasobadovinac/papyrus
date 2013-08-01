/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.engine;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.gmfdiag.css.Activator;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StyleSheet;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StyleSheetReference;

/**
 * A CSS Engine for the current Eclipse Project
 * 
 * Note: Some models are not necessarily stored in a Project (e.g. CDO Models)
 * 
 * @author Camille Letavernier
 * 
 */
public class ProjectCSSEngine extends ExtendedCSSEngineImpl {

	/**
	 * The name of the EMF Model containing the {@link StyleSheet}s, relative to the Engine's Project
	 */
	public static String PROJECT_STYLESHEETS = "stylesheets.xmi"; //$NON-NLS-1$

	/**
	 * The Engine's project. May be null or closed, or may not exist
	 */
	protected IProject project;

	public ProjectCSSEngine(Resource modelResource) {
		super(WorkspaceCSSEngine.instance);

		URI resourceURI = modelResource.getURI();
		if(resourceURI.isPlatformResource()) {
			String platformString = resourceURI.toPlatformString(true);
			try {
				IPath workspacePath = new Path(platformString);
				this.project = ResourcesPlugin.getWorkspace().getRoot().getFile(workspacePath).getProject();
			} catch (Exception ex) {
				Activator.log.error(ex);
			}
		}

	}

	@Override
	protected void reloadStyleSheets() {
		styleSheets.clear();
		if(project == null || !project.exists() || !project.isOpen()) {
			return;
		}

		IFile styleSheetModel = project.getFile(PROJECT_STYLESHEETS);
		if(!styleSheetModel.exists()) {
			return;
		}

		IPath workspacePath = styleSheetModel.getFullPath();

		URI workspaceURI = URI.createPlatformResourceURI(workspacePath.toString(), true);

		ResourceSet resourceSet = new ResourceSetImpl();
		try {
			Resource stylesheetsResource = resourceSet.getResource(workspaceURI, true);
			for(EObject rootElement : stylesheetsResource.getContents()) {
				if(rootElement instanceof StyleSheet) {
					//Do not call super#addStyleSheet(styleSheet) to avoid a StackOverFlow
					styleSheets.add((StyleSheet)rootElement);
				}
			}
		} catch (Exception ex) {
			Activator.log.error(ex);
		}
	}

	@SuppressWarnings("restriction")
	@Override
	protected void parseStyleSheet(StyleSheetReference styleSheet) throws IOException {
		String path = styleSheet.getPath();
		if(path.startsWith("/")) { //$NON-NLS-1$
			super.parseStyleSheet(styleSheet);
		} else {
			//Parse relative paths from the Project
			if(project != null && project.exists() && project.isOpen()) {
				IFile file = project.getFile(path);

				if(file.exists()) {
					try {
						parseStyleSheet(file.getContents());
					} catch (CoreException ex) {
						Activator.log.error(ex);
					}
				}
			}
		}
	}
}
