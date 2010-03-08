/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
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
package org.eclipse.papyrus.diagram.activity.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.diagram.common.service.AspectUnspecifiedTypeConnectionTool;
import org.eclipse.papyrus.diagram.common.service.AspectUnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class UMLPaletteFactory extends PaletteFactory.Adapter {

	/**
	 * @generated
	 */
	private final static String CREATEINITIALNODE1CREATIONTOOL = "createInitialnode1CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEACTIVITYFINAL2CREATIONTOOL = "createActivityfinal2CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEFLOWFINAL3CREATIONTOOL = "createFlowfinal3CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEDECISIONNODE4CREATIONTOOL = "createDecisionnode4CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEMERGENODE5CREATIONTOOL = "createMergenode5CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEJOINNODE6CREATIONTOOL = "createJoinnode6CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEFORKNODE7CREATIONTOOL = "createForknode7CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEOPAQUEACTION1CREATIONTOOL = "createOpaqueAction1CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATECALLBEHAVIORACTION2CREATIONTOOL = "createCallBehaviorAction2CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATECALLOPERATIONACTION3CREATIONTOOL = "createCallOperationAction3CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEOUTPUTPIN1CREATIONTOOL = "createOutputPin1CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEINPUTPIN2CREATIONTOOL = "createInputPin2CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEACTIONINPUTPIN3CREATIONTOOL = "createActionInputPin3CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEVALUEPIN4CREATIONTOOL = "createValuePin4CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATECONTROLFLOW1CREATIONTOOL = "createControlFlow1CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEOBJECTFLOW2CREATIONTOOL = "createObjectFlow2CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPRECONDITIONCONSTRAINT1CREATIONTOOL = "createLocalPreconditionConstraint1CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPRECONDITIONINTERACTIONCONSTRAINT2CREATIONTOOL = "createLocalPreconditionInteractionConstraint2CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPRECONDITIONINTERVALCONSTRAINT3CREATIONTOOL = "createLocalPreconditionIntervalConstraint3CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPRECONDITIONDURATIONCONSTRAINT4CREATIONTOOL = "createLocalPreconditionDurationConstraint4CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPRECONDITIONTIMECONSTRAINT5CREATIONTOOL = "createLocalPreconditionTimeConstraint5CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPOSTCONDITIONCONSTRAINT6CREATIONTOOL = "createLocalPostconditionConstraint6CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPOSTCONDITIONINTERACTIONCONSTRAINT7CREATIONTOOL = "createLocalPostconditionInteractionConstraint7CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPOSTCONDITIONINTERVALCONSTRAINT8CREATIONTOOL = "createLocalPostconditionIntervalConstraint8CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPOSTCONDITIONDURATIONCONSTRAINT9CREATIONTOOL = "createLocalPostconditionDurationConstraint9CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATELOCALPOSTCONDITIONTIMECONSTRAINT10CREATIONTOOL = "createLocalPostconditionTimeConstraint10CreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public UMLPaletteFactory() {

	}

	/**
	 * @generated
	 */
	public Tool createTool(String toolId) {
		if(toolId.equals(CREATEINITIALNODE1CREATIONTOOL)) {
			return createInitialnode1CreationTool();
		}
		if(toolId.equals(CREATEACTIVITYFINAL2CREATIONTOOL)) {
			return createActivityfinal2CreationTool();
		}
		if(toolId.equals(CREATEFLOWFINAL3CREATIONTOOL)) {
			return createFlowfinal3CreationTool();
		}
		if(toolId.equals(CREATEDECISIONNODE4CREATIONTOOL)) {
			return createDecisionnode4CreationTool();
		}
		if(toolId.equals(CREATEMERGENODE5CREATIONTOOL)) {
			return createMergenode5CreationTool();
		}
		if(toolId.equals(CREATEJOINNODE6CREATIONTOOL)) {
			return createJoinnode6CreationTool();
		}
		if(toolId.equals(CREATEFORKNODE7CREATIONTOOL)) {
			return createForknode7CreationTool();
		}
		if(toolId.equals(CREATEOPAQUEACTION1CREATIONTOOL)) {
			return createOpaqueAction1CreationTool();
		}
		if(toolId.equals(CREATECALLBEHAVIORACTION2CREATIONTOOL)) {
			return createCallBehaviorAction2CreationTool();
		}
		if(toolId.equals(CREATECALLOPERATIONACTION3CREATIONTOOL)) {
			return createCallOperationAction3CreationTool();
		}
		if(toolId.equals(CREATEOUTPUTPIN1CREATIONTOOL)) {
			return createOutputPin1CreationTool();
		}
		if(toolId.equals(CREATEINPUTPIN2CREATIONTOOL)) {
			return createInputPin2CreationTool();
		}
		if(toolId.equals(CREATEACTIONINPUTPIN3CREATIONTOOL)) {
			return createActionInputPin3CreationTool();
		}
		if(toolId.equals(CREATEVALUEPIN4CREATIONTOOL)) {
			return createValuePin4CreationTool();
		}
		if(toolId.equals(CREATECONTROLFLOW1CREATIONTOOL)) {
			return createControlFlow1CreationTool();
		}
		if(toolId.equals(CREATEOBJECTFLOW2CREATIONTOOL)) {
			return createObjectFlow2CreationTool();
		}
		if(toolId.equals(CREATELOCALPRECONDITIONCONSTRAINT1CREATIONTOOL)) {
			return createLocalPreconditionConstraint1CreationTool();
		}
		if(toolId.equals(CREATELOCALPRECONDITIONINTERACTIONCONSTRAINT2CREATIONTOOL)) {
			return createLocalPreconditionInteractionConstraint2CreationTool();
		}
		if(toolId.equals(CREATELOCALPRECONDITIONINTERVALCONSTRAINT3CREATIONTOOL)) {
			return createLocalPreconditionIntervalConstraint3CreationTool();
		}
		if(toolId.equals(CREATELOCALPRECONDITIONDURATIONCONSTRAINT4CREATIONTOOL)) {
			return createLocalPreconditionDurationConstraint4CreationTool();
		}
		if(toolId.equals(CREATELOCALPRECONDITIONTIMECONSTRAINT5CREATIONTOOL)) {
			return createLocalPreconditionTimeConstraint5CreationTool();
		}
		if(toolId.equals(CREATELOCALPOSTCONDITIONCONSTRAINT6CREATIONTOOL)) {
			return createLocalPostconditionConstraint6CreationTool();
		}
		if(toolId.equals(CREATELOCALPOSTCONDITIONINTERACTIONCONSTRAINT7CREATIONTOOL)) {
			return createLocalPostconditionInteractionConstraint7CreationTool();
		}
		if(toolId.equals(CREATELOCALPOSTCONDITIONINTERVALCONSTRAINT8CREATIONTOOL)) {
			return createLocalPostconditionIntervalConstraint8CreationTool();
		}
		if(toolId.equals(CREATELOCALPOSTCONDITIONDURATIONCONSTRAINT9CREATIONTOOL)) {
			return createLocalPostconditionDurationConstraint9CreationTool();
		}
		if(toolId.equals(CREATELOCALPOSTCONDITIONTIMECONSTRAINT10CREATIONTOOL)) {
			return createLocalPostconditionTimeConstraint10CreationTool();
		}

		// default return: null
		return null;
	}

	public Object getTemplate(String templateId) {

		// default return: null
		return null;
	}

	/**
	 * @generated
	 */
	private Tool createInitialnode1CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.InitialNode_3004);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createActivityfinal2CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.ActivityFinalNode_3005);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createFlowfinal3CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.FlowFinalNode_3006);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createDecisionnode4CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.DecisionNode_3038);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createMergenode5CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.MergeNode_3039);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createJoinnode6CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.JoinNode_3041);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createForknode7CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.ForkNode_3040);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createOpaqueAction1CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.OpaqueAction_3007);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createCallBehaviorAction2CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.CallBehaviorAction_3008);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createCallOperationAction3CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.CallOperationAction_3010);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createOutputPin1CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UMLElementTypes.OutputPin_3014);
		types.add(UMLElementTypes.OutputPin_3020);
		types.add(UMLElementTypes.OutputPin_3024);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createInputPin2CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UMLElementTypes.InputPin_3013);
		types.add(UMLElementTypes.InputPin_3019);
		types.add(UMLElementTypes.InputPin_3023);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createActionInputPin3CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UMLElementTypes.ActionInputPin_3016);
		types.add(UMLElementTypes.ActionInputPin_3018);
		types.add(UMLElementTypes.ActionInputPin_3021);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createValuePin4CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UMLElementTypes.ValuePin_3015);
		types.add(UMLElementTypes.ValuePin_3017);
		types.add(UMLElementTypes.ValuePin_3022);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createControlFlow1CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.ControlFlow_4004);

		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createObjectFlow2CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.ObjectFlow_4003);

		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPreconditionConstraint1CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Constraint_3011);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPreconditionInteractionConstraint2CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.InteractionConstraint_3030);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPreconditionIntervalConstraint3CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.IntervalConstraint_3032);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPreconditionDurationConstraint4CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.DurationConstraint_3034);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPreconditionTimeConstraint5CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.TimeConstraint_3036);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPostconditionConstraint6CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Constraint_3012);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPostconditionInteractionConstraint7CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.InteractionConstraint_3031);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPostconditionIntervalConstraint8CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.IntervalConstraint_3033);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPostconditionDurationConstraint9CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.DurationConstraint_3035);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createLocalPostconditionTimeConstraint10CreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.TimeConstraint_3037);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

}
