/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.edit.policy;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.gmf.diagram.common.commands.CreateViewCommand;
import org.eclipse.papyrus.gmf.diagram.common.edit.policy.DefaultCreationEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.snap.NodeSnapHelper;
import org.eclipse.papyrus.uml.diagram.common.locator.PortPositionLocator;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeCreationTool;

/**
 * Replaces the {@link DefaultCreationEditPolicy} in order to manage Affixed Port position on creation or on drop.
 */
public class StructuredClassifierCreationEditPolicy extends CreationEditPolicy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getReparentCommand(ChangeBoundsRequest request) {
		// Forbid re-parent in this edit policy (to be used by compartment)
		// in order to avoid node to be moved in compartments.
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * <pre>
	 * {@inheritDoc}
	 * 
	 * The goal here is to create the view and to move it at the mouse location,
	 * respecting a given locator. It is assumed that only affixed Port can be created on
	 * edit part that have this edit policy, and the locator is a {@link PortPositionLocator}.
	 * 
	 * @see DefaultCreationEditPolicy#getCreateCommand().
	 * </pre>
	 */
	@Override
	protected Command getCreateCommand(CreateViewRequest request) {

		// This overrides getCreateCommand in order to use a specific CreateViewCommand (instead of
		// org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand.

		// The original CreateCommand#canExecute() implementation rely on ViewProvider#provides(CreateViewForKindOperation op)
		// method to know if a view can be created. The problem is that this method is incorrectly generated by GMF Tooling and should be avoided.

		// CreateViewCommand replace the semantic adapter in its call to ViewService to know if a provider exists.

		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);

		Iterator<? extends ViewDescriptor> descriptors = request.getViewDescriptors().iterator();
		while(descriptors.hasNext()) {

			CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor)descriptors.next();
			ICommand createCommand = new CreateViewCommand(editingDomain, descriptor, (View)(getHost().getModel()));

			// Add SetBounds
			createCommand = CompositeCommand.compose(createCommand, getSetBoundsCommand(request, descriptor));
			//

			cc.compose(createCommand);

		}

		return new ICommandProxy(cc.reduce());

	}

	/**
	 * Get a SetBoundsCommand to move a new view at current mouse position.
	 * 
	 * @param request
	 *        The creation request.
	 * @param descriptor
	 *        The descriptor of the new element.
	 * @return The set bounds command.
	 */
	private ICommand getSetBoundsCommand(CreateViewRequest request, CreateViewRequest.ViewDescriptor descriptor) {
		ICommand setBoundsCommand = null;
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();

		// Retrieve parent location
		Point parentLoc = getHostFigure().getBounds().getLocation().getCopy();

		
		final Point realWantedLocation;
		Map<?, ?> params = request.getExtendedData();
		Point realLocation = (Point)params.get(AspectUnspecifiedTypeCreationTool.INITIAL_MOUSE_LOCATION_FOR_CREATION);
		if(realLocation != null) {
			realWantedLocation = realLocation.getCopy();
		} else {
			//we use this location to be able to create Port in the corners of the figure
			realWantedLocation = request.getLocation().getCopy();
		}

		// Compute relative creation location
		Point requestedLocation = realWantedLocation.getCopy();



		getHostFigure().translateToRelative(requestedLocation);

		// Create proposed creation bounds and use the locator to find the expected position
		PortPositionLocator locator = new PortPositionLocator(getHostFigure(), PositionConstants.NONE);
		final Rectangle preferredBounds = locator.getPreferredLocation(new Rectangle(requestedLocation, new Dimension(20, 20)));
		Rectangle retainedBounds = preferredBounds.getCopy();
		Rectangle parentBounds = getHostFigure().getBounds().getCopy();
		getHostFigure().translateToAbsolute(parentBounds);

		//find the current side of the wanted position
		while(parentBounds.contains(realWantedLocation)) {
			parentBounds.shrink(1, 1);
		}
		int currentSide = parentBounds.getPosition(realWantedLocation);

		if(request.isSnapToEnabled() && currentSide != PositionConstants.NORTH_EAST && currentSide != PositionConstants.NORTH_WEST && currentSide != PositionConstants.SOUTH_EAST && currentSide != PositionConstants.SOUTH_WEST) { //request for snap port at the creation
			//we find the best location with snap
			Point wantedPoint = preferredBounds.getLocation();
			getHostFigure().translateToAbsolute(wantedPoint);
			Rectangle portBounds = new Rectangle(wantedPoint, new Dimension(20, 20));
			NodeSnapHelper helper = new NodeSnapHelper((SnapToHelper)getHost().getAdapter(SnapToHelper.class), portBounds, false, false, true);
			final ChangeBoundsRequest tmpRequest = new ChangeBoundsRequest("move"); //$NON-NLS-1$
			tmpRequest.setEditParts(Collections.emptyList());
			tmpRequest.setSnapToEnabled(true);
			tmpRequest.setLocation(portBounds.getLocation());
			helper.snapPoint(tmpRequest);
			preferredBounds.translate(tmpRequest.getMoveDelta());

			switch(currentSide) {
			case PositionConstants.NORTH:
			case PositionConstants.SOUTH:
				preferredBounds.y = retainedBounds.y;
				break;
			case PositionConstants.EAST:
			case PositionConstants.WEST:
				preferredBounds.x = retainedBounds.x;
				break;
			default:
				break;
			}
		}
		// Convert the calculated preferred bounds as relative to parent location
		Rectangle creationBounds = preferredBounds.getTranslated(parentLoc.getNegated());
		setBoundsCommand = new SetBoundsCommand(editingDomain, DiagramUIMessages.SetLocationCommand_Label_Resize, descriptor, creationBounds);
		return setBoundsCommand;
	}

	/**
	 * Convenience method to return the host's Figure.
	 * 
	 * @return The host GraphicalEditPart's Figure
	 */
	private IFigure getHostFigure() {
		return ((GraphicalEditPart)getHost()).getFigure();
	}
}
