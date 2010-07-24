package org.eclipse.papyrus.diagram.profile.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.diagram.profile.edit.commands.DataTypePropertyCreateCommand;
import org.eclipse.papyrus.diagram.profile.providers.UMLElementTypes;

/**
 * @generated
 */
public class DataTypeAttributeCompartmentItemSemanticEditPolicyCN extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataTypeAttributeCompartmentItemSemanticEditPolicyCN() {
		super(UMLElementTypes.DataType_3027);
	}


	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if(UMLElementTypes.Property_3018 == req.getElementType()) {
			return getGEFWrapper(new DataTypePropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
