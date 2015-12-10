/*****************************************************************************
 * Copyright (c) 2010, 2015 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.custom.migration;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.InsertFloatingLabelFromMapCommand;
import org.eclipse.papyrus.infra.gmfdiag.common.reconciler.DiagramReconciler;

/**
 * Component Diagram Reconciler from 1.0.0 to 1.1.0
 */
public class ComponentReconciler extends DiagramReconciler {

	private final static String ComponentEditPart_VISUAL_ID = "2002";
	private final static String ComponentFloatingLabelEditPart_VISUAL_ID = "6030";
	private final static String ComponentEditPartCN_VISUAL_ID = "3070";
	private final static String ComponentFloatingLabelEditPartCN_VISUAL_ID = "6026";
	private final static String ComponentEditPartPCN_VISUAL_ID = "3071";
	private final static String ComponentFloatingLabelEditPartPCN_VISUAL_ID = "6027";
	private final static String DependencyNodeEditPart_VISUAL_ID = "3203";
	private final static String DependencyNodeFloatingLabelEditPart_VISUAL_ID = "6029";
	private final static String InterfaceEditPart_VISUAL_ID = "2003";
	private final static String InterfaceFloatingLabelEditPart_VISUAL_ID = "6032";
	private final static String InterfaceEditPartPCN_VISUAL_ID = "3072";
	private final static String InterfaceFloatingLabelEditPartPCN_VISUAL_ID = "6028";
	private final static String RectangleInterfaceEditPart_VISUAL_ID = "3205";
	private final static String RectangleInterfaceFloatingLabelEditPart_VISUAL_ID = "6031";
	private final static String RectangleInterfaceEditPartCN_VISUAL_ID = "3078";
	private final static String RectangleInterfaceFloatingLabelEditPartCN_VISUAL_ID = "6033";

	/**
	 * Gets the reconcile command.
	 *
	 * @param diagram
	 *            the diagram
	 * @return the reconcile command
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.reconciler.DiagramReconciler#getReconcileCommand(org.eclipse.gmf.runtime.notation.Diagram)
	 */
	@Override
	public ICommand getReconcileCommand(Diagram diagram) {
		return new InsertFloatingLabelFromMapCommand(diagram, getFloatingLabelMap());
	}

	/**
	 * Gets the floating label map to add.
	 *
	 * @return the floating label map
	 */
	private Map<String, String> getFloatingLabelMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(ComponentEditPart_VISUAL_ID, ComponentFloatingLabelEditPart_VISUAL_ID);
		map.put(ComponentEditPartCN_VISUAL_ID, ComponentFloatingLabelEditPartCN_VISUAL_ID);
		map.put(ComponentEditPartPCN_VISUAL_ID, ComponentFloatingLabelEditPartPCN_VISUAL_ID);
		map.put(DependencyNodeEditPart_VISUAL_ID, DependencyNodeFloatingLabelEditPart_VISUAL_ID);
		map.put(InterfaceEditPart_VISUAL_ID, InterfaceFloatingLabelEditPart_VISUAL_ID);
		map.put(InterfaceEditPartPCN_VISUAL_ID, InterfaceFloatingLabelEditPartPCN_VISUAL_ID);
		map.put(RectangleInterfaceEditPart_VISUAL_ID, RectangleInterfaceFloatingLabelEditPart_VISUAL_ID);
		map.put(RectangleInterfaceEditPartCN_VISUAL_ID, RectangleInterfaceFloatingLabelEditPartCN_VISUAL_ID);

		return map;
	}
}