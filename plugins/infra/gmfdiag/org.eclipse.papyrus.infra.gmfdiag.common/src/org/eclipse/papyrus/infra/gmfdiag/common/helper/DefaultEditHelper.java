/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 440108
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.helper;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.commands.DestroyElementPapyrusCommand;
import org.eclipse.papyrus.infra.emf.commands.UnsetValueCommand;
import org.eclipse.papyrus.infra.emf.requests.UnsetRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.CreateEditBasedElementCommand;

/**
 * <pre>
 * This is a default Helper for UML element.
 * 
 * The only reason to override getDestroyElementWithDependentsCommand and getDestroyElementCommand
 * method here is to propagate the shared IClientContext used by Papyrus during the request creation.
 * Without this changes, the command to destroy dependent element won't be correctly created,
 * in EditHelper(s) the getDestroyDependentsCommand will only be called with default element type
 * (null command) and in AdviceHelper the getBeforeDestroyDependentsCommand will work but will
 * not retrieve command to destroy elements that themselves depend on dependent element to destroy.
 * 
 * The changes are replacing:
 * ElementTypeRegistry.getInstance().getElementType(req.getElementToDestroy());
 * by
 * ElementTypeRegistry.getInstance().getElementType(req.getElementToDestroy(), req.getClientContext()); 
 * 
 * See:
 * - Bug328232 (https://bugs.eclipse.org/bugs/show_bug.cgi?id=328232)
 * - Bug328506 (https://bugs.eclipse.org/bugs/show_bug.cgi?id=328506)
 * 
 * </pre>
 */
public class DefaultEditHelper extends AbstractEditHelper {

	/** Defined in org.eclipse.gmf.runtime.emf.type.core.internal.requests.RequestCacheEntries (internal) */
	public static final String Cache_Maps = "Cache_Maps";//$NON-NLS-1$

	/** Defined in org.eclipse.gmf.runtime.emf.type.core.internal.requests.RequestCacheEntries (internal) */
	public static final String Element_Type = "Element_Type";//$NON-NLS-1$	

	/** Defined in org.eclipse.gmf.runtime.emf.type.core.internal.requests.RequestCacheEntries (internal) */
	public static final String Checked_Elements = "Checked_Elements";//$NON-NLS-1$	

	/** Defined in org.eclipse.gmf.runtime.emf.type.core.internal.requests.RequestCacheEntries (internal) */
	public static final String EditHelper_Advice = "EditHelper_Advice";//$NON-NLS-1$


	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		return new CreateEditBasedElementCommand(req);
	}

	/**
	 * Gets the command to destroy a single child of an element of my kind along
	 * with its dependents (not related by containment). By default, returns a
	 * composite that destroys the elements and zero or more dependents.
	 * 
	 * @param req
	 *            the destroy request
	 * @return a command that destroys the element specified as the request's {@linkplain DestroyElementRequest#getElementToDestroy() element to
	 *         destroy} and its non-containment dependents
	 */
	protected ICommand getDestroyElementWithDependentsCommand(DestroyElementRequest req) {
		ICommand result = getBasicDestroyElementCommand(req);

		EObject initial = (EObject) req.getParameter(DestroyElementRequest.INITIAL_ELEMENT_TO_DESTROY_PARAMETER);

		if (initial == null) {
			// set the parameter to keep track of the initial element to destroy
			req.setParameter(DestroyElementRequest.INITIAL_ELEMENT_TO_DESTROY_PARAMETER, req.getElementToDestroy());
		}

		// get elements dependent on the element we are destroying, that
		// must also be destroyed
		DestroyDependentsRequest ddr = (DestroyDependentsRequest) req.getParameter(DestroyElementRequest.DESTROY_DEPENDENTS_REQUEST_PARAMETER);
		if (ddr == null) {
			// create the destroy-dependents request that will be propagated to
			// destroy requests for all elements destroyed in this operation
			ddr = new DestroyDependentsRequest(req.getEditingDomain(), req.getElementToDestroy(), req.isConfirmationRequired());
			// propagate the parameters, including the initial element to
			// destroy parameter
			ddr.addParameters(req.getParameters());
			ddr.setClientContext(req.getClientContext());
			req.setParameter(DestroyElementRequest.DESTROY_DEPENDENTS_REQUEST_PARAMETER, ddr);
		} else {
			ddr.setElementToDestroy(req.getElementToDestroy());
		}

		IElementType typeToDestroy = null;
		Map cacheMaps = (Map) req.getParameter(Cache_Maps);
		if (cacheMaps != null) {
			Map map = (Map) cacheMaps.get(req.getElementToDestroy());
			if (map != null) {
				typeToDestroy = (IElementType) map.get(Element_Type);
			}
		}

		if (typeToDestroy == null) {
			typeToDestroy = ElementTypeRegistry.getInstance().getElementType(req.getElementToDestroy(), req.getClientContext());
		}

		if (typeToDestroy != null) {
			ICommand command = typeToDestroy.getEditCommand(ddr);

			if (command != null) {
				result = result.compose(command);
			}
		}

		return result;
	}


	/**
	 * Gets the command to destroy a child of an element of my kind. By
	 * default, returns a composite command that destroys the element specified
	 * by the request and all of its contents.
	 * 
	 * @param req
	 *            the destroy request
	 * @return a command that destroys the element specified as the request's {@link DestroyElementRequest#getElementToDestroy() element to destroy} along with its contents and other dependents
	 */
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		ICommand result = null;

		EObject parent = req.getElementToDestroy();

		if (req.getParameter(DestroyElementRequest.INITIAL_ELEMENT_TO_DESTROY_PARAMETER) == null) {
			req.setParameter(DestroyElementRequest.INITIAL_ELEMENT_TO_DESTROY_PARAMETER, parent);
		}

		IElementType parentType = null;

		Map cacheMaps = (Map) req.getParameter(Cache_Maps);
		Set checkedElement = null;
		if (cacheMaps != null) {
			checkedElement = (Set) cacheMaps.get(Checked_Elements);
			checkedElement.add(parent);
			Map parentMap = (Map) cacheMaps.get(parent);
			if (parentMap != null) {
				parentType = (IElementType) parentMap.get(Element_Type);
			} else {
				parentType = ElementTypeRegistry.getInstance().getElementType(parent, req.getClientContext());
			}
		} else {
			parentType = ElementTypeRegistry.getInstance().getElementType(parent, req.getClientContext());
		}

		if (parentType != null) {
			for (Iterator iter = parent.eContents().iterator(); iter.hasNext();) {
				EObject next = (EObject) iter.next();

				DestroyDependentsRequest ddr = (DestroyDependentsRequest) req.getParameter(DestroyElementRequest.DESTROY_DEPENDENTS_REQUEST_PARAMETER);

				// if another object is already destroying this one because it
				// is (transitively) a dependent, then don't destroy it again .
				if ((ddr == null) || ((checkedElement != null) && checkedElement.add(next)) || (!ddr.getDependentElementsToDestroy().contains(next))) {
					// set the element to be destroyed
					req.setElementToDestroy(next);

					ICommand command = parentType.getEditCommand(req);

					if (command != null) {
						if (result == null) {
							result = command;
						} else {
							result = result.compose(command);
						}

						// Under normal circumstances the command is executable.
						// Checking canExecute here slows down large scenarios and it is therefore
						// better to skip this check.
						// if (!command.canExecute()) {
						// // no point in continuing if we're abandoning the works
						// break;
						// }
					}
				}
			}
		}

		// restore the elementToDestroy in the original request
		req.setElementToDestroy(parent);

		ICommand destroyParent = getDestroyElementWithDependentsCommand(req);

		// bottom-up destruction: destroy children before parent
		if (result == null) {
			result = destroyParent;
		} else {
			result = result.compose(destroyParent);
		}

		return result;
	}

	/**
	 * Gets the array of edit helper advice for this request.
	 * 
	 * @param req
	 *            the edit request
	 * @return the edit helper advice, or <code>null</code> if there is none
	 */
	protected IEditHelperAdvice[] getEditHelperAdvice(IEditCommandRequest req) {
		IEditHelperAdvice[] advices = null;
		Object editHelperContext = req.getEditHelperContext();
		Map cacheMaps = (Map) req.getParameter(Cache_Maps);
		if (cacheMaps != null) {
			Map contextMap = (Map) cacheMaps.get(editHelperContext);
			if (contextMap != null) {
				advices = (IEditHelperAdvice[]) contextMap.get(EditHelper_Advice);
			}
		}

		if (advices == null) {

			if (editHelperContext instanceof EObject) {
				advices = ElementTypeRegistry.getInstance().getEditHelperAdvice((EObject) editHelperContext, req.getClientContext());

			} else if (editHelperContext instanceof IElementType) {
				advices = ElementTypeRegistry.getInstance().getEditHelperAdvice((IElementType) editHelperContext, req.getClientContext());

			} else {
				advices = ElementTypeRegistry.getInstance().getEditHelperAdvice(editHelperContext);
			}
		}

		return advices;
	}

	@Override
	protected ICommand getBasicDestroyElementCommand(DestroyElementRequest req) {
		ICommand result = req.getBasicDestroyCommand();

		if (result == null) {
			result = new DestroyElementPapyrusCommand(req);
		} else {
			// ensure that re-use of this request will not accidentally
			// propagate this command, which would destroy the wrong object
			req.setBasicDestroyCommand(null);
		}

		return result;
	}

	@Override
	protected ICommand getInsteadCommand(IEditCommandRequest req) {
		ICommand result = null;

		if (req instanceof UnsetRequest) {
			result = new UnsetValueCommand((UnsetRequest) req);
		} else {
			result = super.getInsteadCommand(req);
		}

		return result;
	}


	protected boolean initializeWithThisSpecializationType(ISpecializationType specializationType, CreateElementRequest req) {
		if (specializationType != null) {
			IContainerDescriptor containerDescriptor = specializationType.getEContainerDescriptor();

			if (containerDescriptor != null) {
				EReference[] features = containerDescriptor.getContainmentFeatures();

				if (features != null) {

					for (int i = 0; i < features.length; i++) {

						Object editHelperContext = req.getEditHelperContext();
						EClass eClass = null;

						if (editHelperContext instanceof EClass) {
							eClass = (EClass) editHelperContext;

						} else if (editHelperContext instanceof EObject) {
							eClass = ((EObject) editHelperContext).eClass();

						} else if (editHelperContext instanceof IElementType) {
							eClass = ((IElementType) editHelperContext).getEClass();
						}

						if (eClass != null && eClass.getEAllReferences().contains(features[i])) {
							// Use the first feature
							req.initializeContainmentFeature((features[i]));
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	protected boolean isKindOf(EClass a, EClassifier b) {
		if (a.getEAllSuperTypes().contains(b)) {
			return true;
		} else {
			return a.equals(b);
		}
	}

	protected EReference findDefaultContainmentFeature(EClass ownerType, EClass ownedType) {
		for (EReference eReference : ownerType.getEAllContainments()) {
			if (isKindOf(ownedType, eReference.getEReferenceType())) {
				return eReference;
			}
		}
		return null;
	}

	// Override to initialize containment also on the basis of superElementTypes
	@Override
	public void initializeDefaultFeature(CreateElementRequest req) {

		if (req.getContainmentFeature() == null) {

			// First, try to find the feature from the element type
			ISpecializationType specializationType = (ISpecializationType) req.getElementType().getAdapter(ISpecializationType.class);

			if (specializationType != null) {

				boolean initialized = initializeWithThisSpecializationType(specializationType, req);
				IElementType[] superTypes = specializationType.getAllSuperTypes();

				// Try to initialize with the superTypes if not already initialized
				for (int i = 0; i < superTypes.length && !initialized; i++) {
					IElementType superElementType = superTypes[i];

					if (superElementType instanceof ISpecializationType) {
						initialized = initializeWithThisSpecializationType((ISpecializationType) superElementType, req);

						if (initialized) {
							return;
						}
					}
				}
			}

			EClass eClass = req.getElementType().getEClass();

			if (eClass != null) {
				// Next, try to get a default feature
				EReference defaultFeature = getDefaultContainmentFeature(eClass);
				if (defaultFeature != null) {
					req.initializeContainmentFeature(defaultFeature);
					return;
				}

				// Compute default container (the first feature of container that can contain the new element's type)
				EReference defaultEReference = findDefaultContainmentFeature(req.getContainer().eClass(), eClass);
				if (defaultEReference != null) {
					req.initializeContainmentFeature(defaultEReference);
				}
			}
		}
	}
}
