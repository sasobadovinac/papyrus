/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Amine EL KOUHEN (CEA LIST) Amine.Elkouhen@cea.fr
 *****************************************************************************/
package org.eclipse.papyrus.diagram.deployment.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.deployment.edit.policies.ConstraintConstrainedElementItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConstraintConstrainedElementEditPart extends ConnectionNodeEditPart

implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * @generated
	 */
	public ConstraintConstrainedElementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ConstraintConstrainedElementItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new LinkDescriptor();
	}

	/**
	 * @generated
	 */
	public LinkDescriptor getPrimaryShape() {
		return (LinkDescriptor)getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkDescriptor extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public LinkDescriptor() {
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_DASH);

		}

	}

}
