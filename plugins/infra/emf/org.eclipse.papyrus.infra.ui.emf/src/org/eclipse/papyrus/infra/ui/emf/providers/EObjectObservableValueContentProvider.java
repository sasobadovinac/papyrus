/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Fanch BONNABESSE (ALL4TEC) fanch.bonnabesse@all4tec.net - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.ui.emf.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.databinding.EObjectObservableValue;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.papyrus.infra.ui.emf.databinding.EObjectStructuredObservableValue;

/**
 * ContentProvider of the EObjectObservaleValue.
 */
public class EObjectObservableValueContentProvider implements ITreeContentProvider {

	/**
	 * Value root of the tree.
	 */
	private List<EObjectStructuredObservableValue> valueRoot = null;

	/**
	 * Constructor.
	 *
	 * @param value
	 *            The value to manage.
	 */
	public EObjectObservableValueContentProvider(final List<EObjectStructuredObservableValue> value) {
		super();
		valueRoot = value;
	}

	/**
	 * This allows to set the root value.
	 * 
	 * @param value
	 *            the root value
	 */
	public void setValueRoot(final List<EObjectStructuredObservableValue> value) {
		this.valueRoot = value;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(final Object inputElement) {
		if (null != valueRoot) {
			return valueRoot.toArray();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(final Object parentElement) {
		final List<EObjectObservableValue> children = new ArrayList<>();

		if (parentElement instanceof EObjectStructuredObservableValue) {
			List<EObjectObservableValue> observables = ((EObjectStructuredObservableValue) parentElement).getObservables();
			children.addAll(observables);
		}

		return children.toArray();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object element) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(final Object element) {
		return 0 < getChildren(element).length;
	}

}
