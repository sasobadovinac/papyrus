/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Tatiana Fesenko (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.compare.diff;


import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.compare.diff.engine.GenericDiffEngine;
import org.eclipse.emf.compare.diff.engine.check.ReferencesCheck;
import org.eclipse.emf.compare.diff.metamodel.AbstractDiffExtension;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.util.DiffSwitch;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.compare.UMLCompareUtils;
import org.eclipse.papyrus.compare.diff.extension.DiffElementExtensionBuilder;
import org.eclipse.papyrus.compare.diff.metamodel.uml_diff_extension.UMLDiffFactory;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;


public class PapyrusDiffEngine extends GenericDiffEngine {

	private DiffSwitch<AbstractDiffExtension> myDiffElementBuilder = new DiffElementExtensionBuilder();
	private DiffSwitch<Collection<EObject>> myGetModelElementSwitch = new ModelElementSwitch();

	@Override
	protected ReferencesCheck getReferencesChecker() {
		return new UMLReferenceCheck(matchCrossReferencer);
	}
	
	@Override
	public DiffModel doDiff(MatchModel match, boolean threeWay) {
		DiffModel result = super.doDiff(match, threeWay);
		postProcess(result);
		return result;
	}


	protected void postProcess(DiffModel diffModel) {
		final Iterator<EObject> it = diffModel.eAllContents();
		while(it.hasNext()) {
			DiffElement diffElement = (DiffElement)it.next();
			visitElement(diffModel, diffElement);
		}
	}
	
	protected void visitElement(DiffModel root, DiffElement diffElement) {

		Collection<EObject> elements = getModelElementsFor(diffElement);
		for (EObject stereotypeApplication: elements) {
			if(UMLCompareUtils.isStereotypeApplication(stereotypeApplication)) {
				
				Element newVisualParent = UMLUtil.getBaseElement(stereotypeApplication);
				DiffElement newDiffParent = findOrCreateDiffElementFor(root, newVisualParent);
				AbstractDiffExtension taggedValueDiff = myDiffElementBuilder.doSwitch(diffElement);
				
				newDiffParent.getSubDiffElements().add((DiffElement)taggedValueDiff);
				hideElement(diffElement, taggedValueDiff);
			} 
		}
	}
	
	protected void hideElement(DiffElement diffElement, AbstractDiffExtension diffExtension) {
		if (diffExtension == null) {
			diffExtension = UMLDiffFactory.eINSTANCE.createAddStereotypeApplication();
		}
		diffExtension.getHideElements().add(diffElement);
	}
	
	private DiffElement findOrCreateDiffElementFor(DiffModel root, EObject object) {
		if(object == null) {
			if(!root.getOwnedElements().isEmpty()) {
				return root.getOwnedElements().get(0);
			}
			DiffGroup diffRoot = DiffFactory.eINSTANCE.createDiffGroup();
			root.getOwnedElements().add(diffRoot);
			return diffRoot;
		}
		DiffElement element = findDiffElementFor(root, object);
		if(element != null) {
			return element;
		}

		DiffElement diffParent = findOrCreateDiffElementFor(root, getParent(object));
		DiffGroup diffElementForObject = DiffFactory.eINSTANCE.createDiffGroup();
		diffElementForObject.setRightParent(object);

		diffParent.getSubDiffElements().add(diffElementForObject);
		return diffElementForObject;
	}

	private EObject getParent(EObject modelElement) {
		return modelElement.eContainer();
	}

	protected final DiffElement findDiffElementFor(DiffModel root, EObject modelElement) {
		if(modelElement == null) {
			return null;
		}
		final Iterator<EObject> it = root.eAllContents();
		while(it.hasNext()) {
			final DiffElement element = (DiffElement)it.next();
			if(isPertinentDiff(element, modelElement)) {
				return element;
			}
		}
		return null;
	}

	private boolean isPertinentDiff(DiffElement diff, EObject modelElement) {
		Collection<EObject> domainElements = getModelElementsFor(diff);
		for (EObject curr: domainElements) {
			if (modelElement.equals(curr) || modelElement.equals(getMatchedEObject(curr))) {
				return true;
			}
		}
		return false;
	}
	
	protected Collection<EObject> getModelElementsFor(DiffElement diff) {
		return myGetModelElementSwitch.doSwitch(diff);
	}
	
}
