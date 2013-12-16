/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Amine EL KOUHEN (CEA LIST/LIFL) & Nizar GUEDIDI (CEA LIST) - Initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.GradientPreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.common.preferences.PreferencesConstantsHelper;
import org.eclipse.papyrus.uml.diagram.common.editparts.AbstractConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.figure.node.ConstraintFigure;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.papyrus.uml.diagram.component.custom.edit.policies.CustomDiagramDragDropEditPolicy;
import org.eclipse.papyrus.uml.diagram.component.custom.edit.policies.CustomGraphicalNodeEditPolicy;
import org.eclipse.papyrus.uml.diagram.component.edit.policies.ConstraintItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.component.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ConstraintEditPart extends AbstractConstraintEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3199;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ConstraintEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ConstraintItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeNodeLabelDisplayEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new CustomDiagramDragDropEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new CustomGraphicalNodeEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * Papyrus codeGen
	 * 
	 * @generated
	 **/
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if(result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ConstraintFigure();
	}

	/**
	 * @generated
	 */
	public ConstraintFigure getPrimaryShape() {
		return (ConstraintFigure)primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof ConstraintNameEditPart) {
			((ConstraintNameEditPart)childEditPart).setLabel(getPrimaryShape().getNameLabel());
			return true;
		}
		if(childEditPart instanceof ConstraintSpecificationEditPart) {
			((ConstraintSpecificationEditPart)childEditPart).setLabel(getPrimaryShape().getConstraintFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof ConstraintNameEditPart) {
			return true;
		}
		if(childEditPart instanceof ConstraintSpecificationEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if(removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		String prefElementId = "Constraint";
		IPreferenceStore store = UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
		String preferenceConstantWitdh = PreferenceInitializerForElementHelper.getpreferenceKey(getNotationView(), prefElementId, PreferencesConstantsHelper.WIDTH);
		String preferenceConstantHeight = PreferenceInitializerForElementHelper.getpreferenceKey(getNotationView(), prefElementId, PreferencesConstantsHelper.HEIGHT);
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(store.getInt(preferenceConstantWitdh), store.getInt(preferenceConstantHeight));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *        instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if(nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if(contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if(primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if(primaryShape instanceof Shape) {
			((Shape)primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if(primaryShape instanceof Shape) {
			((Shape)primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ConstraintNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(UMLElementTypes.Usage_4001);
		types.add(UMLElementTypes.InterfaceRealization_4006);
		types.add(UMLElementTypes.Substitution_4012);
		types.add(UMLElementTypes.Manifestation_4014);
		types.add(UMLElementTypes.ComponentRealization_4007);
		types.add(UMLElementTypes.Abstraction_4013);
		types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		types.add(UMLElementTypes.Dependency_4010);
		types.add(UMLElementTypes.Dependency_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.Usage_4001);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.InterfaceRealization_4006);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.InterfaceRealization_4006);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.InterfaceRealization_4006);
		}
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.Substitution_4012);
		}
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.Manifestation_4014);
		}
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.ComponentRealization_4007);
		}
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.Abstraction_4013);
		}
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof CommentEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof CommentEditPartPCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		}
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.Dependency_4010);
		}
		if(targetEditPart instanceof DependencyNodeEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof ModelEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof PackageEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof ModelEditPartCN) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof RectangleInterfaceEditPartCN) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof ComponentEditPartCN) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof ComponentEditPartPCN) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof ConstraintEditPartPCN) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if(targetEditPart instanceof InterfaceEditPartPCN) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(relationshipType == UMLElementTypes.Usage_4001) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.InterfaceRealization_4006) {
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Substitution_4012) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Manifestation_4014) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.ComponentRealization_4007) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Abstraction_4013) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.ConstraintConstrainedElement_4009) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Comment_3201);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Comment_3074);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Dependency_4010) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Dependency_4017) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(UMLElementTypes.Usage_4001);
		types.add(UMLElementTypes.Substitution_4012);
		types.add(UMLElementTypes.Manifestation_4014);
		types.add(UMLElementTypes.ComponentRealization_4007);
		types.add(UMLElementTypes.Abstraction_4013);
		types.add(UMLElementTypes.CommentAnnotatedElement_4015);
		types.add(UMLElementTypes.ConstraintConstrainedElement_4009);
		types.add(UMLElementTypes.Dependency_4010);
		types.add(UMLElementTypes.Dependency_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(relationshipType == UMLElementTypes.Usage_4001) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Substitution_4012) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Manifestation_4014) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.ComponentRealization_4007) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Abstraction_4013) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.CommentAnnotatedElement_4015) {
			types.add(UMLElementTypes.Comment_3201);
			types.add(UMLElementTypes.Comment_3074);
		} else if(relationshipType == UMLElementTypes.ConstraintConstrainedElement_4009) {
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.Constraint_3075);
		} else if(relationshipType == UMLElementTypes.Dependency_4010) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		} else if(relationshipType == UMLElementTypes.Dependency_4017) {
			types.add(UMLElementTypes.Dependency_3203);
			types.add(UMLElementTypes.Component_2002);
			types.add(UMLElementTypes.Model_3202);
			types.add(UMLElementTypes.Package_3200);
			types.add(UMLElementTypes.Interface_3205);
			types.add(UMLElementTypes.Constraint_3199);
			types.add(UMLElementTypes.NamedElement_3204);
			types.add(UMLElementTypes.NamedElement_2003);
			types.add(UMLElementTypes.Port_3069);
			types.add(UMLElementTypes.Model_3077);
			types.add(UMLElementTypes.Package_3076);
			types.add(UMLElementTypes.Interface_3078);
			types.add(UMLElementTypes.Component_3070);
			types.add(UMLElementTypes.Component_3071);
			types.add(UMLElementTypes.Constraint_3075);
			types.add(UMLElementTypes.Interface_3072);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public Object getPreferredValue(EStructuralFeature feature) {
		IPreferenceStore preferenceStore = (IPreferenceStore)getDiagramPreferencesHint().getPreferenceStore();
		Object result = null;
		if(feature == NotationPackage.eINSTANCE.getLineStyle_LineColor() || feature == NotationPackage.eINSTANCE.getFontStyle_FontColor() || feature == NotationPackage.eINSTANCE.getFillStyle_FillColor()) {
			String prefColor = null;
			if(feature == NotationPackage.eINSTANCE.getLineStyle_LineColor()) {
				prefColor = PreferencesConstantsHelper.getElementConstant("Constraint", PreferencesConstantsHelper.COLOR_LINE);
			} else if(feature == NotationPackage.eINSTANCE.getFontStyle_FontColor()) {
				prefColor = PreferencesConstantsHelper.getElementConstant("Constraint", PreferencesConstantsHelper.COLOR_FONT);
			} else if(feature == NotationPackage.eINSTANCE.getFillStyle_FillColor()) {
				prefColor = PreferencesConstantsHelper.getElementConstant("Constraint", PreferencesConstantsHelper.COLOR_FILL);
			}
			result = FigureUtilities.RGBToInteger(PreferenceConverter.getColor((IPreferenceStore)preferenceStore, prefColor));
		} else if(feature == NotationPackage.eINSTANCE.getFillStyle_Transparency() || feature == NotationPackage.eINSTANCE.getFillStyle_Gradient()) {
			String prefGradient = PreferencesConstantsHelper.getElementConstant("Constraint", PreferencesConstantsHelper.COLOR_GRADIENT);
			GradientPreferenceConverter gradientPreferenceConverter = new GradientPreferenceConverter(preferenceStore.getString(prefGradient));
			if(feature == NotationPackage.eINSTANCE.getFillStyle_Transparency()) {
				result = new Integer(gradientPreferenceConverter.getTransparency());
			} else if(feature == NotationPackage.eINSTANCE.getFillStyle_Gradient()) {
				result = gradientPreferenceConverter.getGradientData();
			}
		}
		if(result == null) {
			result = getStructuralFeatureValue(feature);
		}
		return result;
	}
}
