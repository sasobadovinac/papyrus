/*****************************************************************************
 * Copyright (c) 2014, 2016 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Wouters laurent.wouters@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 485220
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.viewpoints.policy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.infra.viewpoints.configuration.Category;
import org.eclipse.papyrus.infra.viewpoints.configuration.ModelRule;
import org.eclipse.papyrus.infra.viewpoints.configuration.OwningRule;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusViewpoint;
import org.eclipse.swt.graphics.Image;

/**
 * Content provider of ViewPrototypes
 *
 * @author Laurent Wouters
 *
 */
public class ViewPrototypeContentProvider implements ITreeContentProvider {

	private static ImageDescriptor loadImage(String uri) {
		URL url = null;
		try {
			url = new URL(uri);
		} catch (MalformedURLException e) {
		}
		return ImageDescriptor.createFromURL(url);
	}

	public static class LP extends LabelProvider {
		private static final String IMG_CATEGORY = "imageCategory"; //$NON-NLS-1$
		private static final String IMG_VIEWPOINT = "imageViewpoint"; //$NON-NLS-1$
		private static final String IMG_PROFILE = "imageProfile"; //$NON-NLS-1$
		private static final String IMG_MODEL = "imageModel"; //$NON-NLS-1$
		private static final String IMG_OWNER = "imageOwner"; //$NON-NLS-1$

		private ImageRegistry images = new ImageRegistry(JFaceResources.getResources());

		{
			images.put(IMG_CATEGORY, loadImage("platform:/plugin/org.eclipse.papyrus.infra.viewpoints.configuration.edit/icons/full/obj16/PapyrusView.png"));
			images.put(IMG_VIEWPOINT, loadImage("platform:/plugin/org.eclipse.papyrus.infra.viewpoints.configuration.edit/icons/full/obj16/PapyrusViewpoint.png"));
			images.put(IMG_PROFILE, loadImage("platform:/plugin/org.eclipse.papyrus.infra.viewpoints.policy/icons/Profile.gif"));
			images.put(IMG_MODEL, loadImage("platform:/plugin/org.eclipse.papyrus.infra.viewpoints.configuration.edit/icons/full/obj16/ModelRule.png"));
			images.put(IMG_OWNER, loadImage("platform:/plugin/org.eclipse.papyrus.infra.viewpoints.configuration.edit/icons/full/obj16/OwningRule.png"));
		}

		@Override
		public void dispose() {
			super.dispose();

			images.dispose();
		}

		@Override
		public String getText(Object element) {
			if (element instanceof Category) {
				return "Category " + ((Category) element).getName();
			}
			if (element instanceof ViewPrototype) {
				return ((ViewPrototype) element).getLabel();
			}
			if (element instanceof PapyrusViewpoint) {
				return "Available in viewpoint: " + ((PapyrusViewpoint) element).getName();
			}
			if (element instanceof EPackage) {
				return "Required profile: " + ((EPackage) element).getNsURI();
			}
			if (element instanceof ModelRule) {
				return getText((ModelRule) element);
			}
			if (element instanceof OwningRule) {
				return getText((OwningRule) element);
			}
			return element.toString();
		}

		private String getText(ModelRule rule) {
			StringBuilder builder = new StringBuilder("Possible root: ");
			boolean first = true;
			for (EClass ste : rule.getStereotypes()) {
				if (!first) {
					builder.append(", ");
				}
				builder.append("<<");
				builder.append(ste.getEPackage().getNsPrefix());
				builder.append("::");
				builder.append(ste.getName());
				builder.append(">>");
				first = false;
			}
			if (rule.getElement() != null) {
				if (!first) {
					builder.append(" ");
				}
				builder.append(rule.getElement().getEPackage().getNsPrefix());
				builder.append("::");
				builder.append(rule.getElement().getName());
			}
			return builder.toString();
		}

		private String getText(OwningRule rule) {
			StringBuilder builder = new StringBuilder("Possible owner: ");
			boolean first = true;
			for (EClass ste : rule.getStereotypes()) {
				if (!first) {
					builder.append(", ");
				}
				builder.append("<<");
				builder.append(ste.getEPackage().getNsPrefix());
				builder.append("::");
				builder.append(ste.getName());
				builder.append(">>");
				first = false;
			}
			if (rule.getElement() != null) {
				if (!first) {
					builder.append(" ");
				}
				builder.append(rule.getElement().getEPackage().getNsPrefix());
				builder.append("::");
				builder.append(rule.getElement().getName());
			}
			return builder.toString();
		}

		@Override
		public Image getImage(Object element) {
			if (element instanceof Category) {
				return images.get(IMG_CATEGORY);
			}
			if (element instanceof ViewPrototype) {
				return ((ViewPrototype) element).getIcon();
			}
			if (element instanceof PapyrusViewpoint) {
				return images.get(IMG_VIEWPOINT);
			}
			if (element instanceof EPackage) {
				return images.get(IMG_PROFILE);
			}
			if (element instanceof ModelRule) {
				return images.get(IMG_MODEL);
			}
			if (element instanceof OwningRule) {
				return images.get(IMG_OWNER);
			}
			return null;
		}
	}

	/**
	 * The root of all views
	 */
	public static final Object treeRoot = new Object();

	/**
	 * The views
	 */
	private Map<Category, List<ViewPrototype>> views;

	/**
	 * The categories
	 */
	private List<Category> categories;

	/**
	 * Creates the provider
	 *
	 * @param views
	 *            The views to provide
	 */
	public ViewPrototypeContentProvider() {
		this.views = new HashMap<Category, List<ViewPrototype>>();
		this.categories = new ArrayList<Category>();
		for (ViewPrototype view : PolicyChecker.getCurrent().getAllPrototypes()) {
			for (Category category : view.getCategories()) {
				if (!categories.contains(category)) {
					categories.add(category);
					views.put(category, new ArrayList<ViewPrototype>());
				}
				views.get(category).add(view);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return categories.toArray();
	}


	private Object[] getChildren(ViewPrototype view) {
		if (view.getConfiguration() == null) {
			return new String[0];
		}
		List<Object> data = new ArrayList<Object>();
		data.add(view.getConfiguration().eContainer());
		data.addAll(view.getConfiguration().getProfiles());
		data.addAll(view.getConfiguration().getModelRules());
		data.addAll(view.getConfiguration().getOwningRules());
		return data.toArray();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object element) {
		if (element == treeRoot) {
			return categories.toArray();
		}
		if (element instanceof Category) {
			List<ViewPrototype> protos = new ArrayList<ViewPrototype>(views.get(element));
			Collections.sort(protos, new ViewPrototype.Comp());
			return protos.toArray();
		}
		if (element instanceof ViewPrototype) {
			return getChildren((ViewPrototype) element);
		}
		return new Object[0];
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		if (element == treeRoot) {
			return null;
		}
		if (element instanceof Category) {
			return treeRoot;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		if (element == treeRoot) {
			return true;
		}
		if (element instanceof Category) {
			return true;
		}
		if (element instanceof ViewPrototype) {
			return true;
		}
		return false;
	}
}
