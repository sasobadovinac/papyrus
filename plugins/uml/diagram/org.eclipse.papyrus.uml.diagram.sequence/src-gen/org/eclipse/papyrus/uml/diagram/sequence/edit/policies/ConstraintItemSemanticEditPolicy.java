/*****************************************************************************
 * Copyright (c) 2009 CEA
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
package org.eclipse.papyrus.uml.diagram.sequence.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.gmf.command.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.CommentAnnotatedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.CommentAnnotatedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.ConstraintConstrainedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.ContextLinkCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.ContextLinkReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message2CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message2ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message3CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message3ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message4CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message4ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message5CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message5ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message6CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message6ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message7CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message7ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.MessageCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.MessageReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ContextLinkEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message2EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message3EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message4EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message5EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message6EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message7EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes;

/**
 * @generated
 */
public class ConstraintItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConstraintItemSemanticEditPolicy() {
		super(UMLElementTypes.Constraint_Shape);
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(true);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			List<EObject> todestroy = new ArrayList<EObject>();
			todestroy.add(req.getElementToDestroy());
			// cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(req));
			cmd.add(new EMFtoGMFCommandWrapper(new org.eclipse.emf.edit.command.DeleteCommand(getEditingDomain(), todestroy)));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;

		if (UMLElementTypes.Message_SynchEdge == baseElementType) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_AsynchEdge == baseElementType) {
			return getGEFWrapper(new Message2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_ReplyEdge == baseElementType) {
			return getGEFWrapper(new Message3CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_CreateEdge == baseElementType) {
			return getGEFWrapper(new Message4CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_DeleteEdge == baseElementType) {
			return getGEFWrapper(new Message5CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_LostEdge == baseElementType) {
			return getGEFWrapper(new Message6CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_FoundEdge == baseElementType) {
			return getGEFWrapper(new Message7CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Comment_AnnotatedElementEdge == baseElementType) {
			return null;
		}
		if (UMLElementTypes.Constraint_ConstrainedElementEdge == baseElementType) {
			return getGEFWrapper(new ConstraintConstrainedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Constraint_ContextEdge == baseElementType) {
			return getGEFWrapper(new ContextLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;

		if (UMLElementTypes.Message_SynchEdge == baseElementType) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_AsynchEdge == baseElementType) {
			return getGEFWrapper(new Message2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_ReplyEdge == baseElementType) {
			return getGEFWrapper(new Message3CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_CreateEdge == baseElementType) {
			return getGEFWrapper(new Message4CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_DeleteEdge == baseElementType) {
			return getGEFWrapper(new Message5CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_LostEdge == baseElementType) {
			return getGEFWrapper(new Message6CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_FoundEdge == baseElementType) {
			return getGEFWrapper(new Message7CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Comment_AnnotatedElementEdge == baseElementType) {
			return getGEFWrapper(new CommentAnnotatedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Constraint_ConstrainedElementEdge == baseElementType) {
			return getGEFWrapper(new ConstraintConstrainedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Constraint_ContextEdge == baseElementType) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 *
	 * @generated
	 */
	@Override
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MessageEditPart.VISUAL_ID:
			return getGEFWrapper(new MessageReorientCommand(req));
		case Message2EditPart.VISUAL_ID:
			return getGEFWrapper(new Message2ReorientCommand(req));
		case Message3EditPart.VISUAL_ID:
			return getGEFWrapper(new Message3ReorientCommand(req));
		case Message4EditPart.VISUAL_ID:
			return getGEFWrapper(new Message4ReorientCommand(req));
		case Message5EditPart.VISUAL_ID:
			return getGEFWrapper(new Message5ReorientCommand(req));
		case Message6EditPart.VISUAL_ID:
			return getGEFWrapper(new Message6ReorientCommand(req));
		case Message7EditPart.VISUAL_ID:
			return getGEFWrapper(new Message7ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 *
	 * @generated
	 */
	@Override
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CommentAnnotatedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentAnnotatedElementReorientCommand(req));
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ConstraintConstrainedElementReorientCommand(req));
		case ContextLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextLinkReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
