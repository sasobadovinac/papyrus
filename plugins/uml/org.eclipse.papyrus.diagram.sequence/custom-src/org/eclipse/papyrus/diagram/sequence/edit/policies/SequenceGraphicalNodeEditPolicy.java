/*****************************************************************************
 * Copyright (c) 2010 CEA
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
package org.eclipse.papyrus.diagram.sequence.edit.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetConnectionBendpointsCommand;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.diagram.sequence.edit.parts.CombinedFragment2EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.Message2EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.Message3EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.Message4EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.Message5EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.Message6EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.Message7EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.papyrus.diagram.sequence.part.Messages;
import org.eclipse.papyrus.diagram.sequence.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.diagram.sequence.util.SequenceRequestConstant;
import org.eclipse.papyrus.diagram.sequence.util.SequenceUtil;
import org.eclipse.uml2.uml.Message;


/**
 * A specific policy to handle the message :
 * - Message cannot be uphill.
 * - Message Occurrence Specification which are created along the message may have a different container than the message.
 * - Message feedback on creation is always drawn in black (to avoid invisible feedback)
 * 
 */
@SuppressWarnings({ "restriction", "unchecked", "rawtypes" })
public class SequenceGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	/** A static margin to allow drawing of straight message */
	private static final int MARGIN = 2;

	/**
	 * Overrides to disable uphill message
	 */
	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		Command command = super.getConnectionCompleteCommand(request);
		if(command == null) {
			return UnexecutableCommand.INSTANCE;
		}
		ICommandProxy proxy = (ICommandProxy)request.getStartCommand();
		CompositeCommand cc = (CompositeCommand)proxy.getICommand();
		Iterator<?> commandItr = cc.iterator();
		while(commandItr.hasNext()) {
			Object obj = commandItr.next();
			if(obj instanceof SetConnectionBendpointsCommand) {
				SetConnectionBendpointsCommand sbbCommand = (SetConnectionBendpointsCommand)obj;
				final PointList pointList = sbbCommand.getNewPointList();
				if(pointList.getFirstPoint().y >= pointList.getLastPoint().y + MARGIN) {
					return UnexecutableCommand.INSTANCE;
				}
				request.getExtendedData().put(SequenceRequestConstant.SOURCE_MODEL_CONTAINER, SequenceUtil.findInteractionFragmentContainerAt(pointList.getFirstPoint(), getHost()));
				request.getExtendedData().put(SequenceRequestConstant.TARGET_MODEL_CONTAINER, SequenceUtil.findInteractionFragmentContainerAt(pointList.getLastPoint(), getHost()));
				// In case we are creating a connection to/from a CoRegion, we will need the lifeline element where is drawn the CoRegion later in the process.
				EditPart targetEditPart = getTargetEditPart(request);
				if(targetEditPart instanceof CombinedFragment2EditPart) {
					request.getExtendedData().put(SequenceRequestConstant.LIFELINE_GRAPHICAL_CONTAINER, ((CombinedFragment2EditPart)targetEditPart).getAttachedLifeline());
				}
			}
		}

		return command;
	}

	/**
	 * Override to disable uphill message
	 */
	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		if(isUphillMessage(request)) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getReconnectSourceCommand(request);
	}

	/**
	 * Override to disable uphill message
	 */
	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		if(isUphillMessage(request)) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getReconnectTargetCommand(request);
	}

	/**
	 * Check that a message doesn't have its target point above its source point
	 * 
	 * @param request
	 *        the ReconnectRequest
	 * @return true if the target point is above the source point
	 */
	protected boolean isUphillMessage(ReconnectRequest request) {
		ConnectionEditPart connectionEditPart = request.getConnectionEditPart();
		if(connectionEditPart.getModel() instanceof Edge) {
			Edge edge = (Edge)connectionEditPart.getModel();
			if(edge.getElement() instanceof Message) {
				if(connectionEditPart.getFigure() instanceof Polyline) {
					// get connection end points translated to absolute
					Polyline polyline = (Polyline)connectionEditPart.getFigure();
					Point end = polyline.getEnd().getCopy();
					Point start = polyline.getStart().getCopy();
					polyline.getParent().translateToAbsolute(end);
					polyline.getParent().translateToAbsolute(start);

					// look at the request rather than at both polyline ends which may not be up to date
					if(REQ_RECONNECT_SOURCE.equals(request.getType())) {
						return request.getLocation().y >= end.y + MARGIN;
					} else if(REQ_RECONNECT_TARGET.equals(request.getType())) {
						return start.y >= request.getLocation().y + MARGIN;
					} else {
						return start.y >= end.y + MARGIN;
					}
				}
			}
		}
		return false;
	}


	/**
	 * Overrides to set the color of the dummyConnection to color black.
	 * This allow to see the feedback of the connection when it is created.
	 * By default, the color was the foreground color of the lifeline, which is always blank leading to an invisible feedback.
	 * 
	 */
	@Override
	protected Connection createDummyConnection(Request req) {
		Connection conn = super.createDummyConnection(req);
		conn.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
		return conn;
	}

	/**
	 * Gets a command that pops up a menu which allows the user to select which
	 * type of connection to be created and then creates the connection.
	 * 
	 * @param content
	 *        The list of items making up the content of the popup menu.
	 * @param request
	 *        The relevant create connection request.
	 * @return the command to popup up the menu and create the connection
	 */
	protected ICommand getPromptAndCreateConnectionCommand(List content, CreateConnectionRequest request) {
		return new SequencePromptAndCreateConnectionCommand(content, request);
	}


	/**
	 * Extends {@link PromptAndCreateConnectionCommand} to specify the type of message that can be selected.
	 */
	protected class SequencePromptAndCreateConnectionCommand extends PromptAndCreateConnectionCommand {

		/**
		 * @see {@link PromptAndCreateConnectionCommand#PromptAndCreateConnectionCommand(List, CreateConnectionRequest)}
		 */
		public SequencePromptAndCreateConnectionCommand(List content, CreateConnectionRequest request) {
			super(content, request);
		}


		/**
		 * Defines a specific label provider to handle message.
		 */
		@Override
		protected ILabelProvider getLabelProvider() {
			return new LabelProvider() {

				@Override
				public String getText(Object object) {
					if(object instanceof IHintedType) {
						IHintedType elementType = (IHintedType)object;
						switch(UMLVisualIDRegistry.getVisualID(elementType.getSemanticHint())) {
						case MessageEditPart.VISUAL_ID:
							return Messages.createMessageSync1CreationTool_title;
						case Message2EditPart.VISUAL_ID:
							return Messages.createMessageAsync2CreationTool_title;
						case Message3EditPart.VISUAL_ID:
							return Messages.createMessageReply3CreationTool_title;
						case Message4EditPart.VISUAL_ID:
							return Messages.createMessageCreate4CreationTool_title;
						case Message5EditPart.VISUAL_ID:
							return Messages.createMessageDelete5CreationTool_title;
						case Message6EditPart.VISUAL_ID:
							return Messages.createMessageLost6CreationTool_title;
						case Message7EditPart.VISUAL_ID:
							return Messages.createMessageFound7CreationTool_title;
						}
					}
					return super.getText(object);
				}
			};

		}
	}



}
