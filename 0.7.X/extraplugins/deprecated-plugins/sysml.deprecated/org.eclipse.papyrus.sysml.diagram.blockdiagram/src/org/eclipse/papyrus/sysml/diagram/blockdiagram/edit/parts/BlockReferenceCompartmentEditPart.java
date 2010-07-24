/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdiagram.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml.diagram.blockdiagram.part.Messages;


public class BlockReferenceCompartmentEditPart extends BlockAttributeCompartmentEditPart {

	public static final int VISUAL_ID = 7005;

	public BlockReferenceCompartmentEditPart(View view) {
		super(view);
	}

	public String getCompartmentName() {
		return Messages.BlockReferencesCompartmentEditPart_title;
	}


	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CANONICAL_ROLE, new org.eclipse.papyrus.sysml.diagram.blockdiagram.edit.policies.BlockReferenceCompartmentCanonicalEditPolicy());
	}

}
