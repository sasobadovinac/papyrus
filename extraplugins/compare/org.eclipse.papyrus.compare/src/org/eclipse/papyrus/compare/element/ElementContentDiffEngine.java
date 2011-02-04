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
package org.eclipse.papyrus.compare.element;

import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.MoveModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.compare.diff.PapyrusDiffEngine;


public class ElementContentDiffEngine extends PapyrusDiffEngine {

	private final EObject myLeft;

	private final EObject myRight;

	public ElementContentDiffEngine(EObject left, EObject right) {
		this.myLeft = left;
		this.myRight = right;
	}

	@Override
	protected void addInContainerPackage(DiffGroup root, DiffElement operation, EObject targetParent) {
//		if(targetParent == myLeft || targetParent == myRight) {
//			root.getSubDiffElements().add(operation);
//			return;
//		}
		super.addInContainerPackage(root, operation, targetParent);
	}
	
	@Override
	protected void postProcess(DiffModel diffModel) {
		super.postProcess(diffModel);
		//#336361 - [UML Compare] Compare two elements: show right element as root
		DiffElement newRoot = findDiffElementFor(diffModel, myRight);
		diffModel.getOwnedElements().clear();
		diffModel.getOwnedElements().add(newRoot);
	}
	
	@Override
	protected void visitElement(DiffModel root, DiffElement diffElement) {
		super.visitElement(root, diffElement);
		if (diffElement instanceof MoveModelElement) {
			// don't show 'element moved for the root elements'
			//HACK
			hideElement(diffElement, null);
		}
	}

}
