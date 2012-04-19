package org.eclipse.papyrus.uml.diagram.usecase.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.GradientPreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.PreferenceConstantHelper;
import org.eclipse.papyrus.uml.diagram.common.editparts.AbstractShapeEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ChangeStereotypedShapeEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.HyperLinkPopupBarEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.QualifiedNameDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideLabelEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.figure.node.ShapeNamedElementFigure;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.papyrus.uml.diagram.usecase.edit.policies.CustomDefaultNamedElementItemSemanticEditPolicyTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.policies.ShapeNamedElementItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.usecase.edit.policies.UseCaseChangeStereotypedShapeEditpolicy;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ShapeNamedElementEditPart extends AbstractShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2023;

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
	public ShapeNamedElementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ShapeNamedElementItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.POPUPBAR_ROLE, new HyperLinkPopupBarEditPolicy());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeNodeLabelDisplayEditPolicy());
		installEditPolicy(QualifiedNameDisplayEditPolicy.QUALIFIED_NAME_POLICY, new QualifiedNameDisplayEditPolicy());
		installEditPolicy(ChangeStereotypedShapeEditPolicy.CHANGE_SHAPE_POLICY, new UseCaseChangeStereotypedShapeEditpolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CustomDefaultNamedElementItemSemanticEditPolicyTN());
		installEditPolicy(ShowHideLabelEditPolicy.SHOW_HIDE_LABEL_ROLE, new ShowHideLabelEditPolicy());
		installEditPolicy(ChangeStereotypedShapeEditPolicy.CHANGE_SHAPE_POLICY, new UseCaseChangeStereotypedShapeEditpolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * Papyrus codeGen
	 * 
	 * @generated
	 **/
	protected void handleNotificationEvent(Notification event) {
		/*
		 * when a node have external node labels, the methods refreshChildren() remove the EditPart corresponding to the Label from the EditPart
		 * Registry. After that, we can't reset the visibility to true (using the Show/Hide Label Action)!
		 */
		if(NotationPackage.eINSTANCE.getView_Visible().equals(event.getFeature())) {
			Object notifier = event.getNotifier();
			List<?> modelChildren = ((View)getModel()).getChildren();
			if(!(notifier instanceof Edge)) {
				if(modelChildren.contains(event.getNotifier())) {
					return;
				}
			}
		}
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View)child.getModel();
				switch(UMLVisualIDRegistry.getVisualID(childView)) {
				case ShapeNamedElementNameEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle((GraphicalEditPart)getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				}
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
		return primaryShape = new ShapeNamedElementFigure();
	}

	/**
	 * @generated
	 */
	public ShapeNamedElementFigure getPrimaryShape() {
		return (ShapeNamedElementFigure)primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if(borderItemEditPart instanceof ShapeNamedElementNameEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		String prefElementId = "NamedElement";
		IPreferenceStore store = UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
		String preferenceConstantWitdh = PreferenceInitializerForElementHelper.getpreferenceKey(getNotationView(), prefElementId, PreferenceConstantHelper.WIDTH);
		String preferenceConstantHeight = PreferenceInitializerForElementHelper.getpreferenceKey(getNotationView(), prefElementId, PreferenceConstantHelper.HEIGHT);
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(store.getInt(preferenceConstantWitdh), store.getInt(preferenceConstantHeight));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *        instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ShapeNamedElementNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(UMLElementTypes.Dependency_4013);
		types.add(UMLElementTypes.Abstraction_4015);
		types.add(UMLElementTypes.Usage_4016);
		types.add(UMLElementTypes.Realization_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(targetEditPart instanceof ActorEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ActorAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof UseCaseEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof UseCaseAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof SubjectClassifierEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof PackageEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ConstraintEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPartTN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ShapeNamedElementEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof UseCaseInComponentEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ComponentInComponentEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ConstraintInComponentEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ActorInComponentEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ConstraintInPackageEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ActorInPackageEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof UseCaseInPackageEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ComponentInPackageEditPart) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Dependency_4013);
		}
		if(targetEditPart instanceof ActorEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ActorAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof UseCaseEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof UseCaseAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof SubjectClassifierEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof PackageEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ConstraintEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPartTN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ShapeNamedElementEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof UseCaseInComponentEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ComponentInComponentEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ConstraintInComponentEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ActorInComponentEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ConstraintInPackageEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ActorInPackageEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof UseCaseInPackageEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ComponentInPackageEditPart) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Abstraction_4015);
		}
		if(targetEditPart instanceof ActorEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ActorAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof UseCaseEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof UseCaseAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof SubjectClassifierEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof PackageEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ConstraintEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPartTN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ShapeNamedElementEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof UseCaseInComponentEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ComponentInComponentEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ConstraintInComponentEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ActorInComponentEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ConstraintInPackageEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ActorInPackageEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof UseCaseInPackageEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ComponentInPackageEditPart) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Usage_4016);
		}
		if(targetEditPart instanceof ActorEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ActorAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof UseCaseEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof UseCaseAsRectangleEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof SubjectClassifierEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof PackageEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ConstraintEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof DefaultNamedElementEditPartTN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ShapeNamedElementEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof UseCaseInComponentEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ComponentInComponentEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ConstraintInComponentEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ActorInComponentEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ConstraintInPackageEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ActorInPackageEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof UseCaseInPackageEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof ComponentInPackageEditPart) {
			types.add(UMLElementTypes.Realization_4017);
		}
		if(targetEditPart instanceof PackageEditPartCN) {
			types.add(UMLElementTypes.Realization_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(relationshipType == UMLElementTypes.Dependency_4013) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
		} else if(relationshipType == UMLElementTypes.Abstraction_4015) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
		} else if(relationshipType == UMLElementTypes.Usage_4016) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
		} else if(relationshipType == UMLElementTypes.Realization_4017) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(UMLElementTypes.ConstraintConstrainedElement_4012);
		types.add(UMLElementTypes.Dependency_4013);
		types.add(UMLElementTypes.CommentAnnotatedElement_4014);
		types.add(UMLElementTypes.Abstraction_4015);
		types.add(UMLElementTypes.Usage_4016);
		types.add(UMLElementTypes.Realization_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(relationshipType == UMLElementTypes.ConstraintConstrainedElement_4012) {
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Constraint_3010);
		} else if(relationshipType == UMLElementTypes.Dependency_4013) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
		} else if(relationshipType == UMLElementTypes.CommentAnnotatedElement_4014) {
			types.add(UMLElementTypes.Comment_2018);
			types.add(UMLElementTypes.Comment_3015);
		} else if(relationshipType == UMLElementTypes.Abstraction_4015) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
		} else if(relationshipType == UMLElementTypes.Usage_4016) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
		} else if(relationshipType == UMLElementTypes.Realization_4017) {
			types.add(UMLElementTypes.Actor_2011);
			types.add(UMLElementTypes.Actor_2012);
			types.add(UMLElementTypes.UseCase_2013);
			types.add(UMLElementTypes.UseCase_2014);
			types.add(UMLElementTypes.Classifier_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Constraint_2017);
			types.add(UMLElementTypes.NamedElement_2022);
			types.add(UMLElementTypes.NamedElement_2023);
			types.add(UMLElementTypes.UseCase_3009);
			types.add(UMLElementTypes.Component_3016);
			types.add(UMLElementTypes.Constraint_3017);
			types.add(UMLElementTypes.Actor_3018);
			types.add(UMLElementTypes.Constraint_3010);
			types.add(UMLElementTypes.Actor_3011);
			types.add(UMLElementTypes.UseCase_3012);
			types.add(UMLElementTypes.Component_3013);
			types.add(UMLElementTypes.Package_3014);
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
				prefColor = PreferenceConstantHelper.getElementConstant("NamedElement", PreferenceConstantHelper.COLOR_LINE);
			} else if(feature == NotationPackage.eINSTANCE.getFontStyle_FontColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("NamedElement", PreferenceConstantHelper.COLOR_FONT);
			} else if(feature == NotationPackage.eINSTANCE.getFillStyle_FillColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("NamedElement", PreferenceConstantHelper.COLOR_FILL);
			}
			result = FigureUtilities.RGBToInteger(PreferenceConverter.getColor((IPreferenceStore)preferenceStore, prefColor));
		} else if(feature == NotationPackage.eINSTANCE.getFillStyle_Transparency() || feature == NotationPackage.eINSTANCE.getFillStyle_Gradient()) {
			String prefGradient = PreferenceConstantHelper.getElementConstant("NamedElement", PreferenceConstantHelper.COLOR_GRADIENT);
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
