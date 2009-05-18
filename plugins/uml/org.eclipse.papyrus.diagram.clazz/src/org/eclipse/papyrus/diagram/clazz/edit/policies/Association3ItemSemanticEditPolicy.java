package org.eclipse.papyrus.diagram.clazz.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.papyrus.diagram.clazz.edit.commands.AbstractionCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.AbstractionReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.Association2ReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.Association3CreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.AssociationClass2CreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.AssociationClassReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.AssociationCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.AssociationReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.CommentAnnotatedElementCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.CommentAnnotatedElementReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.ConstraintConstrainedElementCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.Dependency2ReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.Dependency3CreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.DependencyCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.DependencyReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.ElementImportCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.ElementImportReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.GeneralizationCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.GeneralizationReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.PackageImportCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.PackageImportReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.RealizationCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.RealizationReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.SubstitutionCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.SubstitutionReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.TemplateBindingCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.TemplateBindingReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.UsageCreateCommand;
import org.eclipse.papyrus.diagram.clazz.edit.commands.UsageReorientCommand;
import org.eclipse.papyrus.diagram.clazz.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.Association3EditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.DependencyBranchEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ElementImportEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.PackageImportEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.RealizationEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.SubstitutionEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.TemplateBindingEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.papyrus.diagram.clazz.providers.UMLElementTypes;

/**
 * @generated
 */
public class Association3ItemSemanticEditPolicy extends
		UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Association3ItemSemanticEditPolicy() {
		super(UMLElementTypes.Association_4019);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (UMLElementTypes.AssociationClass_4017 == req.getElementType()) {
			return getGEFWrapper(new AssociationClass2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Association_4001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Association_4019 == req.getElementType()) {
			return getGEFWrapper(new Association3CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Generalization_4002 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Substitution_4004 == req.getElementType()) {
			return getGEFWrapper(new SubstitutionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Realization_4005 == req.getElementType()) {
			return getGEFWrapper(new RealizationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Abstraction_4006 == req.getElementType()) {
			return getGEFWrapper(new AbstractionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Usage_4007 == req.getElementType()) {
			return getGEFWrapper(new UsageCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (UMLElementTypes.Dependency_4008 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Dependency_4018 == req.getElementType()) {
			return getGEFWrapper(new Dependency3CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ElementImport_4009 == req.getElementType()) {
			return getGEFWrapper(new ElementImportCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.PackageImport_4010 == req.getElementType()) {
			return getGEFWrapper(new PackageImportCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.CommentAnnotatedElement_4013 == req
				.getElementType()) {
			return null;
		}
		if (UMLElementTypes.ConstraintConstrainedElement_4014 == req
				.getElementType()) {
			return null;
		}
		if (UMLElementTypes.TemplateBinding_4015 == req.getElementType()) {
			return getGEFWrapper(new TemplateBindingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (UMLElementTypes.AssociationClass_4017 == req.getElementType()) {
			return getGEFWrapper(new AssociationClass2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Association_4001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Association_4019 == req.getElementType()) {
			return getGEFWrapper(new Association3CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Generalization_4002 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Substitution_4004 == req.getElementType()) {
			return getGEFWrapper(new SubstitutionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Realization_4005 == req.getElementType()) {
			return getGEFWrapper(new RealizationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Abstraction_4006 == req.getElementType()) {
			return getGEFWrapper(new AbstractionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Usage_4007 == req.getElementType()) {
			return getGEFWrapper(new UsageCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (UMLElementTypes.Dependency_4008 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Dependency_4018 == req.getElementType()) {
			return getGEFWrapper(new Dependency3CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ElementImport_4009 == req.getElementType()) {
			return getGEFWrapper(new ElementImportCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.PackageImport_4010 == req.getElementType()) {
			return null;
		}
		if (UMLElementTypes.CommentAnnotatedElement_4013 == req
				.getElementType()) {
			return getGEFWrapper(new CommentAnnotatedElementCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ConstraintConstrainedElement_4014 == req
				.getElementType()) {
			return getGEFWrapper(new ConstraintConstrainedElementCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.TemplateBinding_4015 == req.getElementType()) {
			return getGEFWrapper(new TemplateBindingCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AssociationClass2EditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationClassReorientCommand(req));
		case AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationReorientCommand(req));
		case Association3EditPart.VISUAL_ID:
			return getGEFWrapper(new Association2ReorientCommand(req));
		case GeneralizationEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationReorientCommand(req));
		case SubstitutionEditPart.VISUAL_ID:
			return getGEFWrapper(new SubstitutionReorientCommand(req));
		case RealizationEditPart.VISUAL_ID:
			return getGEFWrapper(new RealizationReorientCommand(req));
		case AbstractionEditPart.VISUAL_ID:
			return getGEFWrapper(new AbstractionReorientCommand(req));
		case UsageEditPart.VISUAL_ID:
			return getGEFWrapper(new UsageReorientCommand(req));
		case DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyReorientCommand(req));
		case DependencyBranchEditPart.VISUAL_ID:
			return getGEFWrapper(new Dependency2ReorientCommand(req));
		case ElementImportEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementImportReorientCommand(req));
		case PackageImportEditPart.VISUAL_ID:
			return getGEFWrapper(new PackageImportReorientCommand(req));
		case TemplateBindingEditPart.VISUAL_ID:
			return getGEFWrapper(new TemplateBindingReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CommentAnnotatedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentAnnotatedElementReorientCommand(req));
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ConstraintConstrainedElementReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
