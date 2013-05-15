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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.nattable.manager.axis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.papyrus.infra.nattable.manager.axis.AbstractSynchronizedOnFeatureAxisManager;
import org.eclipse.papyrus.sysml.service.types.element.SysMLElementTypes;
import org.eclipse.papyrus.sysml.service.types.matcher.AllocateMatcher;
import org.eclipse.uml2.uml.UMLPackage;

public class AllocateAxisManager extends AbstractSynchronizedOnFeatureAxisManager {

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractSynchronizedOnFeatureAxisManager#addContextFeatureValueListener()
	 * 
	 */
	@Override
	protected void addContextFeatureValueListener() {
		this.featureListener = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if(msg.getFeature() == AllocateAxisManager.this.currentListenFeature || msg.getFeature() == UMLPackage.eINSTANCE.getPackage_PackagedElement()) {
					getTableManager().updateAxisContents(getRepresentedContentProvider());
				}
			}
		};
		getTableContext().eAdapters().add(this.featureListener);
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractSynchronizedOnFeatureAxisManager#dispose()
	 * 
	 */
	@Override
	public void dispose() {
		getTableContext().eAdapters().remove(this.featureListener);
		super.dispose();
	}


	@Override
	public boolean canCreateAxisElement(String elementId) {
		//FIXME : use the same tricks in others AxisManager
		return ((ISpecializationType)SysMLElementTypes.ALLOCATE).getId().equals(elementId);
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractSynchronizedOnFeatureAxisManager#filterObject(java.util.List)
	 * 
	 * @param objects
	 * @return
	 */
	@Override
	protected List<Object> filterObject(final List<?> objects) {
		final List<Object> interestingObjects = new ArrayList<Object>();
		final AllocateMatcher matcher = new AllocateMatcher();
		for(Object object : objects) {
			if(object instanceof EObject) {
				if(matcher.matches((EObject)object)) {
					interestingObjects.add(object);
				}
			}
		}
		return interestingObjects;
	}

}
