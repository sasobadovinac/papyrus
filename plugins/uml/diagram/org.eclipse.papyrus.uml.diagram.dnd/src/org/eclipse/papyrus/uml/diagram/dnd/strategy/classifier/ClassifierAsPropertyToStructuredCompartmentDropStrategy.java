/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.dnd.strategy.classifier;

import java.util.Map;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.papyrus.infra.gmfdiag.dnd.strategy.TransactionalDropStrategy;
import org.eclipse.papyrus.uml.diagram.composite.custom.helper.TypeHelper;
import org.eclipse.papyrus.uml.diagram.dnd.Activator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;

/**
 * 
 * Class provide ability of drop a {@link Classifier} on a {@link Classifier} as a {@link Property}
 * 
 * In a parent {@link Classifier} will be created a {@link Property} and shown in it 
 * when user drop a child {@link Classifier} on the parent {@link Classifier}.
 * The child {@link Classifier} not will be shown in the parent container in this case.
 */
public class ClassifierAsPropertyToStructuredCompartmentDropStrategy extends TransactionalDropStrategy {

	protected Point getLocation(DropObjectsRequest request, GraphicalEditPart targetEP) {
		Point location = request.getLocation().getCopy();
		targetEP.getContentPane().translateToRelative(location);
		targetEP.getContentPane().translateFromParent(location);
		location.translate(targetEP.getContentPane().getClientArea().getLocation().getNegated());
		return location;
	}

	protected boolean understandRequest(Request request) {
		if (!(request instanceof DropObjectsRequest)) {
			return false;
		}
		DropObjectsRequest dropRequest = (DropObjectsRequest) request;
		if (dropRequest.getLocation() == null) {
			return false;
		}
		return true;
	}

	protected boolean isStructuredClassifierEP(EditPart ep) {
		if (false == ep instanceof GraphicalEditPart) {
			return false;
		}
		EObject targetSemantic = getTargetSemanticElement(ep);
		if (false == targetSemantic instanceof StructuredClassifier) {
			return false;
		}
		return true;
	}

	@Override
	public Command doGetCommand(Request request, EditPart targetEditPart) {
		if (understandRequest(request) && isStructuredClassifierEP(targetEditPart)) {
			
			GraphicalEditPart gtEditPart = (GraphicalEditPart) targetEditPart;
			TypeHelper helper = new TypeHelper((TransactionalEditingDomain) getEditingDomain(targetEditPart));
			Point location = getLocation((DropObjectsRequest) request, gtEditPart);
			
			CompoundCommand cc = new CompoundCommand();
			
			for (EObject dropElement : getSourceEObjects(request)) {
				if (dropElement instanceof Collaboration) {
					continue;
				}
				if (dropElement instanceof Classifier && (false == dropElement instanceof Association)) {
					Classifier classifier = (Classifier) dropElement;
					// check whether element is a nested classifier of the targetSemanticElement
					if (classifier.allNamespaces().contains(getTargetSemanticElement(gtEditPart))) {
						cc.add(helper.dropTypeAsTypedProperty((GraphicalEditPart)gtEditPart, classifier, location));
					}
				}
			}
			return cc.canExecute() ? cc : null;
		}
		return null;
	}

	public String getLabel() {
		return "Drop type as typed property"; //$NON-NLS-1$
	}

	public String getID() {
		return Activator.PLUGIN_ID + ".ClassifierToStructureCompAsPropertyDrop"; //$NON-NLS-1$
	}

	public String getDescription() {
		return "Drops a classifier into the structure compartment of a structured classifier as a property."; //$NON-NLS-1$
	}

	public String getCategoryID() {
		return "org.eclipse.papyrus.dnd.ClassifierToStructureCompAsPropertyDrop"; //$NON-NLS-1$
	}

	public String getCategoryLabel() {
		return "Drop a classifier into the structure compartment of a structured classifier as property"; //$NON-NLS-1$
	}

	public Image getImage() {
		return null;
	}

	public int getPriority() {
		return 0;
	}

	public void setOptions(Map<String, Object> options) {
		// Nothing
	}
}