/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.uml.modelrepair.internal.stereotypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.IModelSetSnippet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.labelprovider.service.impl.LabelProviderServiceImpl;
import org.eclipse.papyrus.uml.modelrepair.Activator;
import org.eclipse.papyrus.uml.modelrepair.ui.ZombieStereotypeDialogPresenter;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;


/**
 * A snippet on the UML Model for detecting and initiating repair of zombie stereotype applications.
 */
public class StereotypeApplicationRepairSnippet implements IModelSetSnippet {

	private final UMLResourceLoadAdapter adapter = new UMLResourceLoadAdapter();

	private final Function<? super EPackage, Profile> dynamicProfileSupplier;

	private ZombieStereotypeDialogPresenter presenter;

	private LabelProviderService labelProviderService;

	private boolean localLabelProvider;

	public StereotypeApplicationRepairSnippet() {
		this(null);
	}

	protected StereotypeApplicationRepairSnippet(Function<? super EPackage, Profile> dynamicProfileSupplier) {
		super();

		this.dynamicProfileSupplier = dynamicProfileSupplier;
	}

	public static StereotypeApplicationRepairSnippet getInstance(ModelSet modelSet) {
		UMLResourceLoadAdapter adapter = (UMLResourceLoadAdapter)EcoreUtil.getExistingAdapter(modelSet, StereotypeApplicationRepairSnippet.class);
		return (adapter == null) ? null : adapter.getSnippet();
	}

	public IStatus repair(ModelSet modelSet) {
		IStatus result = Status.OK_STATUS;

		if(presenter != null) {
			for(Resource next : ImmutableList.copyOf(modelSet.getResources())) {
				if(next.isLoaded()) {
					handleResourceLoaded(next);
				}
			}

			// Wait for the presenter to have shown its dialog and finished
			try {
				presenter.awaitPending(false);

				// Did we fix all of the zombies?
				for(Resource next : ImmutableList.copyOf(modelSet.getResources())) {
					if(next.isLoaded() && (getZombieStereotypes(next) != null)) {
						result = new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Stereotype repair did not successfully repair all stereotype application problems.");
						break;
					}
				}
			} catch (InterruptedException e) {
				result = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Stereotype repair was interrupted while waiting for user input.", e);
			}
		}

		return result;
	}

	protected void handleResourceLoaded(Resource resource) {
		final ModelSet modelSet = (ModelSet)resource.getResourceSet();

		StereotypeRepairService.startedRepairing(modelSet);
		boolean presented = false;

		try {
			ZombieStereotypesDescriptor zombies = getZombieStereotypes(resource);

			if((zombies != null) && (presenter != null)) {
				presenter.addZombies(zombies);
				presenter.onPendingDone(new Runnable() {

					public void run() {
						StereotypeRepairService.finishedRepairing(modelSet);
					}
				});
			}

			presented = (presenter != null) && presenter.isPending();
		} finally {
			if(!presented) {
				StereotypeRepairService.finishedRepairing(modelSet);
			}
		}
	}

	protected ZombieStereotypesDescriptor getZombieStereotypes(Resource resource) {
		ZombieStereotypesDescriptor result = null;
		Element root = getRootUMLElement(resource);

		// Only check for zombies in resources that we can modify (those being the resources in the user model opened in the editor)
		if((root instanceof Package) && !EMFHelper.isReadOnly(resource, EMFHelper.resolveEditingDomain(root))) {
			result = getZombieStereotypes(resource, (Package)root);
		}

		return result;
	}

	protected Element getRootUMLElement(Resource resource) {
		return (Element)EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.ELEMENT);
	}

	protected ZombieStereotypesDescriptor getZombieStereotypes(Resource resource, Package root) {
		ZombieStereotypesDescriptor result = null;

		Collection<ProfileApplication> profileApplications = Lists.newArrayList();
		for(TreeIterator<EObject> iter = EcoreUtil.getAllProperContents(Collections.singleton(root), false); iter.hasNext();) {
			EObject next = iter.next();
			if(next instanceof ProfileApplication) {
				profileApplications.add((ProfileApplication)next);
				iter.prune();
			} else if(!(next instanceof Package) && !(next instanceof Component)) {
				// No sense looking for packages except in the things that can contain packages
				iter.prune();
			}
		}

		Set<EPackage> appliedDefinitions = getAppliedDefinitions(profileApplications);

		Function<? super EPackage, Profile> profileSupplier = dynamicProfileSupplier;
		if(profileSupplier == null) {
			profileSupplier = presenter.getDynamicProfileSupplier();
		}

		ZombieStereotypesDescriptor zombies = new ZombieStereotypesDescriptor(resource, root, appliedDefinitions, profileSupplier, getLabelProvider());

		for(EObject next : resource.getContents()) {
			if(!(next instanceof Element)) {
				zombies.analyze(next);
			}
		}

		if(zombies.hasZombies()) {
			result = zombies;
		}

		return result;
	}

	protected Set<EPackage> getAppliedDefinitions(Iterable<? extends ProfileApplication> profileApplications) {
		Set<EPackage> result = Sets.newHashSet();

		for(ProfileApplication next : profileApplications) {
			EPackage definition = next.getAppliedDefinition();
			if((definition != null) && !definition.eIsProxy()) {
				result.add(definition);
			}
		}

		return result;
	}

	private LabelProviderService getLabelProvider() {
		if(labelProviderService == null) {
			try {
				labelProviderService = ServiceUtilsForResourceSet.getInstance().getService(LabelProviderService.class, adapter.getResourceSet());
			} catch (Exception e) {
				// Fine.  Create a local instance
				labelProviderService = new LabelProviderServiceImpl();
				localLabelProvider = true;
			}
		}

		return labelProviderService;
	}

	//
	// Snippet lifecycle
	//

	public void start(ModelSet modelsManager) {
		try {
			IEditorPart editor = ServiceUtilsForResourceSet.getInstance().getService(IMultiDiagramEditor.class, modelsManager);

			if(editor != null) {
				// this model is opened in an editor. That is the context in which we want to provide our services
				presenter = new ZombieStereotypeDialogPresenter(editor.getSite().getShell(), modelsManager);
				adapter.adapt(modelsManager);
			}
		} catch (ServiceException e) {
			// OK, there is no editor, so we aren't needed
		}
	}

	public void dispose(ModelSet modelsManager) {
		if(presenter != null) {
			presenter.dispose();
			presenter = null;
		}

		if(localLabelProvider) {
			try {
				labelProviderService.disposeService();
			} catch (ServiceException e) {
				Activator.log.error(e);
			} finally {
				labelProviderService = null;
				localLabelProvider = false;
			}
		}

		adapter.unadapt(modelsManager);
	}

	//
	// Nested types
	//

	private class UMLResourceLoadAdapter extends AdapterImpl {

		public StereotypeApplicationRepairSnippet getSnippet() {
			return StereotypeApplicationRepairSnippet.this;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type == StereotypeApplicationRepairSnippet.class;
		}

		@Override
		public void notifyChanged(Notification msg) {
			Object notifier = msg.getNotifier();

			if(notifier instanceof ResourceSet) {
				handleNotification((ResourceSet)notifier, msg);
			} else if(notifier instanceof Resource) {
				handleNotification((Resource)notifier, msg);
			}
		}

		ResourceSet getResourceSet() {
			return (ResourceSet)getTarget();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			if((newTarget == null) || (newTarget instanceof ResourceSet)) {
				super.setTarget(newTarget);
			}

			if(newTarget instanceof ResourceSet) {
				// Iterate a defensive copy because other adapters cause concurrent additions by loading additional resources
				for(Resource next : ImmutableList.copyOf(((ResourceSet)newTarget).getResources())) {
					adapt(next);
				}
			} else if(newTarget instanceof Resource) {
				Resource resource = (Resource)newTarget;
				if(resource.isLoaded()) {
					// already loaded? Handled it
					handleResourceLoaded(resource);
				}
			}
		}

		@Override
		public void unsetTarget(Notifier oldTarget) {
			if(oldTarget == getResourceSet()) {
				for(Resource next : getResourceSet().getResources()) {
					unadapt(next);
				}
			}

			super.unsetTarget(oldTarget);
		}

		protected void adapt(Notifier notifier) {
			if(!notifier.eAdapters().contains(this)) {
				notifier.eAdapters().add(this);
			}
		}

		protected void unadapt(Notifier notifier) {
			notifier.eAdapters().remove(this);
		}

		protected void handleNotification(ResourceSet rset, Notification msg) {
			switch(msg.getFeatureID(ResourceSet.class)) {
			case ResourceSet.RESOURCE_SET__RESOURCES:
				switch(msg.getEventType()) {
				case Notification.ADD:
					adapt((Resource)msg.getNewValue());
					break;
				case Notification.ADD_MANY:
					for(Object next : (Collection<?>)msg.getNewValue()) {
						adapt((Resource)next);
					}
					break;
				}
				break;
			}
		}

		protected void handleNotification(Resource resource, Notification msg) {
			switch(msg.getFeatureID(Resource.class)) {
			case Resource.RESOURCE__IS_LOADED:
				if(msg.getNewBooleanValue()) {
					handleResourceLoaded(resource);
				}
				break;
			}
		}
	}
}
