/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Vincent Lorenzo - bug 492522
 *****************************************************************************/

package org.eclipse.papyrus.uml.service.types.helper.advice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.edit.internal.context.TypeContext;
import org.eclipse.papyrus.infra.types.core.utils.ElementTypeRegistryUtils;
import org.eclipse.papyrus.uml.service.types.utils.RequestParameterConstants;
import org.eclipse.uml2.common.util.CacheAdapter;

/**
 * Abstract class used to remove referenced element when a link with no direct semantic element linked to it is destroyed
 *
 */
public abstract class AbstractReferenceDeleteRelationshipEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#configureRequest(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
	 *
	 * @param request
	 */
	@Override
	public void configureRequest(IEditCommandRequest request) {
		super.configureRequest(request);
		if (request instanceof DestroyReferenceRequest && ((DestroyReferenceRequest) request).getContainingFeature() == null) {
			String visualId = (String) request.getParameter(RequestParameterConstants.VIEW_VISUAL_ID);
			((DestroyReferenceRequest) request).setContainingFeature(getFeature(visualId));
		}
	}

	/**
	 * 
	 * @param visualId
	 *            the visual id
	 * @return
	 * 		the EReference represented by the view with this visual id
	 */
	protected EReference getFeature(String visualId) {

		try {
			IClientContext context = TypeContext.getContext();
			List<IElementType> elementTypes = ElementTypeRegistryUtils.getElementTypesBySemanticHint(visualId, context.getId());

			for (IElementType iElementType : elementTypes) {
				Map<String, EReference> featureElementTypeToEReferenceMap = getFeatureElementTypeToEReferenceMap();
				for (String featureElementType : featureElementTypeToEReferenceMap.keySet()) {
					List<ISpecializationType> subs = Arrays.asList(ElementTypeRegistry.getInstance().getSpecializationsOf(featureElementType));
					if (subs.contains(iElementType)) {
						return featureElementTypeToEReferenceMap.get(featureElementType);
					}
				}
			}
		} catch (ServiceException e) {
			org.eclipse.papyrus.uml.service.types.Activator.log.error(e);
		}

		return null;
	}

	/**
	 * 
	 * @return
	 * 		the map linking an element type to a EReference
	 */
	abstract protected Map<String, EReference> getFeatureElementTypeToEReferenceMap();

	/**
	 * 
	 * @param eobject
	 *            an eobject
	 * @return
	 * 		all the views for the given element, the returned value is never <code>null</code>
	 */
	private List<View> getAllViewsFor(final EObject eobject) {
		final List<View> elementViews = new ArrayList<View>();
		if (null != eobject) {

			final Collection<Setting> settings = CacheAdapter.getInstance().getNonNavigableInverseReferences(eobject);
			// get all views representing the feature owner
			for (Setting ref : settings) {
				if (NotationPackage.eINSTANCE.getView_Element().equals(ref.getEStructuralFeature())) {
					View view = (View) ref.getEObject();
					if (view != null) {
						elementViews.add(view);
					}
				}
			}
		}
		return elementViews;
	}

	/**
	 * 
	 * @param request
	 *            the destroy reference request
	 * @return
	 * 		the list of connector to destroy for the request
	 */
	private List<Connector> findConnectorsToDestroy(final DestroyReferenceRequest request) {
		List<Connector> connectorsToDestroy = new ArrayList<Connector>();
		EObject featureOwner = request.getContainer();
		if (null != featureOwner) {
			final List<View> featureOwnerViews = getAllViewsFor(featureOwner);
			if (checkSourceEdgeToFindConnectorToDestroy()) {
				connectorsToDestroy.addAll(findSourceConnectorsToDestroy(request, featureOwnerViews));
			}
			if (checkTargetEdgeToFindConnectorToDestroy()) {
				connectorsToDestroy.addAll(findTargetConnectorsToDestroy(request, featureOwnerViews));
			}
		}
		return connectorsToDestroy;
	}

	/**
	 * 
	 * @param request
	 *            the destroy reference request
	 * @param featureOwnerViews
	 *            the views representing the feature owner
	 * @return
	 * 		the list of connectors linked as source to the views of the feature owner to destroy
	 */
	private List<Connector> findSourceConnectorsToDestroy(final DestroyReferenceRequest request, final List<View> featureOwnerViews) {
		final List<Connector> viewsToDestroy = new ArrayList<Connector>();
		final EObject removedReference = request.getReferencedObject();
		final String visualId = (String) request.getParameter(RequestParameterConstants.VIEW_VISUAL_ID);
		if (visualId != null && !visualId.isEmpty() && removedReference != null)
			for (View currentView : featureOwnerViews) {
				List<?> sourceEdges = currentView.getSourceEdges();
				for (Object current : sourceEdges) {
					if (current instanceof Connector) {
						Connector conn = (Connector) current;
						if (visualId.equals(conn.getType())) {
							View target = conn.getTarget();
							EObject model = target.getElement();
							if (removedReference == model) {
								viewsToDestroy.add(conn);
							}
						}
					}
				}
			}
		return viewsToDestroy;
	}

	/**
	 * 
	 * @param request
	 *            the destroy reference request
	 * @param featureOwnerViews
	 *            the views representing the feature owner
	 * @return
	 * 		the list of connectors linked as target to the views of the feature owner to destroy
	 */
	private List<Connector> findTargetConnectorsToDestroy(final DestroyReferenceRequest request, final List<View> featureOwnerViews) {
		final List<Connector> viewsToDestroy = new ArrayList<Connector>();
		final EObject removedReference = request.getReferencedObject();
		final String visualId = (String) request.getParameter(RequestParameterConstants.VIEW_VISUAL_ID);
		if (visualId != null && !visualId.isEmpty() && removedReference != null)
			for (View currentView : featureOwnerViews) {
				final List<?> targetEdgets = currentView.getTargetEdges();
				for (Object current : targetEdgets) {
					if (current instanceof Connector) {
						Connector conn = (Connector) current;
						if (visualId.equals(conn.getType())) {
							final View target = conn.getTarget();
							EObject model = target.getElement();
							if (removedReference == model) {
								viewsToDestroy.add(conn);
							}
						}
					}
				}
			}
		return viewsToDestroy;
	}

	/**
	 * 
	 * @return
	 * 		<code>true</code> if we cross the connector whose the source is connected to the element
	 */
	abstract protected boolean checkSourceEdgeToFindConnectorToDestroy();

	/**
	 * 
	 * @return
	 * 		<code>true</code> if we cross the connector whose the target is connected to the element
	 */
	abstract protected boolean checkTargetEdgeToFindConnectorToDestroy();

	/**
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getBeforeDestroyReferenceCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest)
	 *
	 * @param request
	 * @return
	 */
	@Override
	protected ICommand getBeforeDestroyReferenceCommand(final DestroyReferenceRequest request) {
		final CompositeCommand command = new CompositeCommand("Clear Connectors"); // $NON-NLS-0$

		// 1. get all connectors to destroy
		final Collection<Connector> connectorsToDestroy = findConnectorsToDestroy(request);

		if (!connectorsToDestroy.isEmpty()) {
			final TransactionalEditingDomain domain = request.getEditingDomain();
			for (View edge : connectorsToDestroy) {
				final DestroyElementRequest destroy = new DestroyElementRequest(domain, edge, false);
				final Object eHelperContext = destroy.getEditHelperContext();
				final IElementType context = ElementTypeRegistry.getInstance().getElementType(eHelperContext);
				if (context != null) {
					final ICommand result = context.getEditCommand(destroy);
					if (result != null) {
						command.add(result);
					}
				}
			}
		}

		if (command.isEmpty() || !command.canExecute()) {
			return null;
		}
		return command;
	}

}