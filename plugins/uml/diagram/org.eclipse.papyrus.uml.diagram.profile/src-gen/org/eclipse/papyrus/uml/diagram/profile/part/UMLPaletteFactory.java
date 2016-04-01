/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.profile.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeConnectionTool;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeCreationTool;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory extends PaletteFactory.Adapter {

	// RS: New Palette generation
	// Generates the ID for the tool elements
	// Generate the tool factory (if(ID) createtool...)
	/**
	 * @generated
	 */
	private final static String CREATECLASS6CREATIONTOOL = "createClass6CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATECOMMENT2CREATIONTOOL = "createComment2CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATECONSTRAINT3CREATIONTOOL = "createConstraint3CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEDATATYPE4CREATIONTOOL = "createDataType4CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEENUMERATION5CREATIONTOOL = "createEnumeration5CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEENUMERATIONLITERAL6CREATIONTOOL = "createEnumerationLiteral6CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEIMPORTMETACLASS7CREATIONTOOL = "createImportMetaclass7CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEOPERATION8CREATIONTOOL = "createOperation8CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEPACKAGE9CREATIONTOOL = "createPackage9CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEPROFILE10CREATIONTOOL = "createProfile10CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEPRIMITIVETYPE11CREATIONTOOL = "createPrimitiveType11CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEPROPERTY12CREATIONTOOL = "createProperty12CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATESTEREOTYPE13CREATIONTOOL = "createStereotype13CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEASSOCIATION1CREATIONTOOL = "createAssociation1CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATECONTEXTLINK6CREATIONTOOL = "createContextLink6CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEEXTENSION3CREATIONTOOL = "createExtension3CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEGENERALIZATION4CREATIONTOOL = "createGeneralization4CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELINK5CREATIONTOOL = "createLink5CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEPROFILEAPPLICATION6CREATIONTOOL = "createProfileApplication6CreationTool";//$NON-NLS-1$

	/**
	 * @generated
	 */
	public UMLPaletteFactory() {

	}

	/**
	 * @generated
	 */
	@Override
	public Tool createTool(String toolId) {
		if (toolId.equals(CREATECLASS6CREATIONTOOL)) {
			return createClass6CreationTool();
		}
		if (toolId.equals(CREATECOMMENT2CREATIONTOOL)) {
			return createComment2CreationTool();
		}
		if (toolId.equals(CREATECONSTRAINT3CREATIONTOOL)) {
			return createConstraint3CreationTool();
		}
		if (toolId.equals(CREATEDATATYPE4CREATIONTOOL)) {
			return createDataType4CreationTool();
		}
		if (toolId.equals(CREATEENUMERATION5CREATIONTOOL)) {
			return createEnumeration5CreationTool();
		}
		if (toolId.equals(CREATEENUMERATIONLITERAL6CREATIONTOOL)) {
			return createEnumerationLiteral6CreationTool();
		}
		if (toolId.equals(CREATEIMPORTMETACLASS7CREATIONTOOL)) {
			return createImportMetaclass7CreationTool();
		}
		if (toolId.equals(CREATEOPERATION8CREATIONTOOL)) {
			return createOperation8CreationTool();
		}
		if (toolId.equals(CREATEPACKAGE9CREATIONTOOL)) {
			return createPackage9CreationTool();
		}
		if (toolId.equals(CREATEPROFILE10CREATIONTOOL)) {
			return createProfile10CreationTool();
		}
		if (toolId.equals(CREATEPRIMITIVETYPE11CREATIONTOOL)) {
			return createPrimitiveType11CreationTool();
		}
		if (toolId.equals(CREATEPROPERTY12CREATIONTOOL)) {
			return createProperty12CreationTool();
		}
		if (toolId.equals(CREATESTEREOTYPE13CREATIONTOOL)) {
			return createStereotype13CreationTool();
		}
		if (toolId.equals(CREATEASSOCIATION1CREATIONTOOL)) {
			return createAssociation1CreationTool();
		}
		if (toolId.equals(CREATECONTEXTLINK6CREATIONTOOL)) {
			return createContextLink6CreationTool();
		}
		if (toolId.equals(CREATEEXTENSION3CREATIONTOOL)) {
			return createExtension3CreationTool();
		}
		if (toolId.equals(CREATEGENERALIZATION4CREATIONTOOL)) {
			return createGeneralization4CreationTool();
		}
		if (toolId.equals(CREATELINK5CREATIONTOOL)) {
			return createLink5CreationTool();
		}
		if (toolId.equals(CREATEPROFILEAPPLICATION6CREATIONTOOL)) {
			return createProfileApplication6CreationTool();
		}
		// default return: null
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	public Object getTemplate(String templateId) {

		// default return: null
		return null;
	}

	/**
	 * @generated
	 */
	private Tool createClass6CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Class_Shape_CN);
		types.add(UMLElementTypes.Class_Shape);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createComment2CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Comment_Shape);
		types.add(UMLElementTypes.Comment_Shape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createConstraint3CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Constraint_PackagedElementShape);
		types.add(UMLElementTypes.Constraint_PackagedElementShape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createDataType4CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.DataType_Shape);
		types.add(UMLElementTypes.DataType_Shape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createEnumeration5CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Enumeration_Shape);
		types.add(UMLElementTypes.Enumeration_Shape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createEnumerationLiteral6CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.EnumerationLiteral_LiteralLabel);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createImportMetaclass7CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Class_MetaclassShape);
		types.add(UMLElementTypes.Class_MetaclassShape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createOperation8CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Operation_DataTypeOperationLabel);
		types.add(UMLElementTypes.Operation_ClassOperationLabel);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createPackage9CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Package_Shape);
		types.add(UMLElementTypes.Package_Shape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createProfile10CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Profile_Shape);
		types.add(UMLElementTypes.Profile_Shape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createPrimitiveType11CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.PrimitiveType_Shape);
		types.add(UMLElementTypes.PrimitiveType_Shape_CN);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createProperty12CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Property_ClassAttributeLabel);
		types.add(UMLElementTypes.Property_DataTypeAttributeLabel);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createStereotype13CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Stereotype_Shape_CN);
		types.add(UMLElementTypes.Stereotype_Shape);
		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createAssociation1CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Association_Edge);
		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createContextLink6CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Constraint_ContextEdge);
		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createExtension3CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Extension_Edge);
		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createGeneralization4CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Generalization_Edge);
		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLink5CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Comment_AnnotatedElementEdge);
		types.add(UMLElementTypes.Constraint_ConstrainedElementEdge);
		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createProfileApplication6CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.ProfileApplication_Edge);
		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}
}