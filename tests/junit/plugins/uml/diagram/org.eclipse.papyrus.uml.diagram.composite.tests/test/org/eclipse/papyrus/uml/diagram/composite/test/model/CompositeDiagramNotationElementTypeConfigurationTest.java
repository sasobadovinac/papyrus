/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *   
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.test.model;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test the compositediagram-notation model :
 *  - validate the model
 * 
 * @author Benoit Maggi
 */
public class CompositeDiagramNotationElementTypeConfigurationTest {
	
	// path to the model
	public static final String ELEMENT_TYPE_NOTATION_CONFIGURATION_MODEL_PATH = org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramEditorPlugin.ID+"/model/compositediagram-notation.elementtypesconfigurations"; //$NON-NLS-0$
	
	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void validateCompositeDiagramNotationElementTypeConfigurationModel() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(ELEMENT_TYPE_NOTATION_CONFIGURATION_MODEL_PATH, true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The composite notation element type model is not valid ", Diagnostic.OK, diagnostic.getSeverity());
	}
}