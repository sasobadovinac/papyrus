/*****************************************************************************
 * Copyright (c) 2009, 2014 LIFL, CEA LIST, and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Cedric Dumoulin cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - Adapted from composite structure diagram
 *  Christian W. Damus (CEA) - bug 392301
 *  Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Bug 496905
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.communication;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.papyrus.infra.core.editor.BackboneException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.internationalization.utils.utils.LabelInternationalization;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLDiagramEditor;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

/**
 * <pre>
 * An editor to be used in multitabs editor.
 * This editor extends the original UMLDiagramEditor generated by GMF.
 * </pre>
 */
public class UmlCommunicationDiagramForMultiEditor extends UMLDiagramEditor {

	/**
	 * The location of diagram icon in the plug-in
	 */
	private static final String DIAG_IMG_PATH = "icons/obj16/Diagram_Communication.gif"; //$NON-NLS-1$

	/**
	 * The EditingDomain ID for this diagram
	 */
	private static final String COMMUNICATION_DIAGRAM_EDITING_DOMAIN_ID = "org.eclipse.papyrus.uml.diagram.communication.EditingDomain"; //$NON-NLS-1$

	/**
	 * The image descriptor of the diagram icon
	 */
	private static final ImageDescriptor DIAG_IMG_DESC = UMLDiagramEditorPlugin.getBundledImageDescriptor(DIAG_IMG_PATH);

	/** The editor splitter. */
	private Composite splitter;

	private Image titleImage;

	/**
	 *
	 * Constructor. Context and required objects are retrieved from the
	 * ServiceRegistry.
	 *
	 * @param servicesRegistry
	 * @param diagram
	 * @throws BackboneException
	 * @throws ServiceException
	 */

	public UmlCommunicationDiagramForMultiEditor(ServicesRegistry servicesRegistry, Diagram diagram) throws BackboneException, ServiceException {
		super(servicesRegistry, diagram);

	}

	/**
	 * Returns an editing domain id used to retrive an editing domain from the
	 * editing domain registry. Clients should override this if they wish to use
	 * a shared editing domain for this editor. If null is returned then a new
	 * editing domain will be created per editor instance.
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor#getEditingDomainID()
	 *
	 */
	@Override
	public String getEditingDomainID() {
		return COMMUNICATION_DIAGRAM_EDITING_DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createGraphicalViewer(Composite parent) {
		splitter = parent;
		super.createGraphicalViewer(parent);
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		// Set name after calling super.init()
		setPartName(LabelInternationalization.getInstance().getDiagramLabel(getDiagram()));
		titleImage = DIAG_IMG_DESC.createImage();
		setTitleImage(titleImage);
	}

	@Override
	public void dispose() {
		if (titleImage != null) {
			titleImage.dispose();
			titleImage = null;
		}

		super.dispose();
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void setInput(IEditorInput input) {
		try {
			// We are in a nested editor.
			// Provide an URI with fragment in order to reuse the same Resource
			// and to set the diagram to the fragment.
			// First, compute the URI
			URIEditorInput uriInput = new URIEditorInput(EcoreUtil.getURI(getDiagram()));
			//System.err.println(this.getClass().getSimpleName() + ".setInput(" + uriInput.toString() + ")"); //$NON-NLS-1$
			doSetInput(uriInput, true);
		} catch (CoreException x) {
			String title = "Problem opening"; //$NON-NLS-1$
			String msg = "Cannot open input element:"; //$NON-NLS-1$
			Shell shell = getSite().getShell();
			ErrorDialog.openError(shell, title, msg, x.getStatus());
		}

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFocus() {
		splitter.setFocus();
		super.setFocus();
	}

}
