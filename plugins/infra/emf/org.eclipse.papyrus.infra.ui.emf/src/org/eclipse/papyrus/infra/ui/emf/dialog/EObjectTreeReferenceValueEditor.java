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

package org.eclipse.papyrus.infra.ui.emf.dialog;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.papyrus.infra.ui.emf.databinding.EObjectObservableValueEditingSupport;
import org.eclipse.papyrus.infra.ui.emf.databinding.EObjectStructuredObservableValue;
import org.eclipse.papyrus.infra.ui.emf.providers.EObjectObservableValueContentProvider;
import org.eclipse.papyrus.infra.ui.emf.providers.EObjectObservableValueLabelProvider;
import org.eclipse.papyrus.infra.widgets.editors.TreeReferenceValueEditor;
import org.eclipse.papyrus.infra.widgets.providers.DelegatingStyledLabelProvider;
import org.eclipse.swt.widgets.Composite;

/**
 * This class extends TreeReferenceDialog and allow the display of EObjectObservableValue.
 */
public class EObjectTreeReferenceValueEditor extends TreeReferenceValueEditor {

	/**
	 * ObservableValues contained on the ValueEditor.
	 */
	private List<EObjectStructuredObservableValue> observableValues = new ArrayList<EObjectStructuredObservableValue>();

	/**
	 * Constructor.
	 *
	 * @param parent
	 *            the parent composite.
	 * @param style
	 *            The style of the composite to create.
	 */
	public EObjectTreeReferenceValueEditor(final Composite parent, final int style) {
		super(parent, style);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();

				if (null == selection || selection.isEmpty()) {
					unsetButton.setEnabled(false);
				} else {
					unsetButton.setEnabled(true);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setValueRootContentProvider() {
		if (null != treeViewer) {
			if (treeViewer.getContentProvider() instanceof EObjectObservableValueContentProvider) {
				((EObjectObservableValueContentProvider) treeViewer.getContentProvider()).setValueRoot(observableValues);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setProvidersTreeViewer() {
		treeViewer.setContentProvider(new EObjectObservableValueContentProvider(observableValues));
		if (labelProvider instanceof IStyledLabelProvider) {
			treeViewer.setLabelProvider(new EObjectObservableValueLabelProvider((IStyledLabelProvider) labelProvider));
		} else {
			treeViewer.setLabelProvider(new EObjectObservableValueLabelProvider(new DelegatingStyledLabelProvider(labelProvider)));
		}

		treeViewer.setInput(""); //$NON-NLS-1$
		if (null != tree && null != tree.getTopItem()) {
			treeViewer.expandToLevel(tree.getTopItem().getData(), 10);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public IObservableValue createWidgetObservable(final IObservableValue modelProperty) {
		EObjectStructuredObservableValue eObjectObser = null;
		observableValues.clear();
		if (modelProperty.getValue() instanceof EObject) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain((EObject) modelProperty.getValue());
			eObjectObser = new EObjectStructuredObservableValue((EObject) modelProperty.getValue(), null, editingDomain, true, null);
			observableValues.add(eObjectObser);
		} else if (modelProperty.getValue() instanceof EList<?>) {
			for (Object object : (EList<Object>) modelProperty.getValue()) {
				if (object instanceof EObject) {
					TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(object);
					eObjectObser = new EObjectStructuredObservableValue((EObject) object, null, editingDomain, true, null);
					observableValues.add(eObjectObser);
				}
			}
		}
		return eObjectObser;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EditingSupport createEditingSupport() {
		return new EObjectObservableValueEditingSupport(treeViewer, valueFactory);
	}

	/**
	 * {@inheritDoc}
	 */
	public void unsetAction() {
		Object valueModelProperty = modelProperty.getValue();
		if (valueModelProperty instanceof EObject) {
			setValue(null);
		} else if (valueModelProperty instanceof EList<?>) {
			ITreeSelection structuredSelection = treeViewer.getStructuredSelection();
			EList<?> eList = new BasicEList<Object>((EList<?>) valueModelProperty);
			for (Object selection : structuredSelection.toList()) {
				if (selection instanceof EObjectStructuredObservableValue) {
					EObjectStructuredObservableValue rootObservableValue = getRootObservableValue((EObjectStructuredObservableValue) selection);
					if (eList.contains(rootObservableValue.getObserved())) {
						eList.remove(rootObservableValue.getObserved());
					}
				}
			}
			setValue(eList);
		}
		checkCreateInstanceButton();
	}

	/**
	 * Returns the root parent of an EObjectStructuredObservableValue.
	 * 
	 * @param observableValue
	 *            The child ObservableValue.
	 * @return The root parent
	 */
	private EObjectStructuredObservableValue getRootObservableValue(final EObjectStructuredObservableValue observableValue) {
		EObjectStructuredObservableValue parentRoot = observableValue;

		if (null != observableValue.getParent()) {
			parentRoot = getRootObservableValue(observableValue.getParent());
		}
		return parentRoot;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void checkCreateInstanceButton() {
		if (null != modelProperty && null != modelProperty.getValueType()) {
			Object valueType = modelProperty.getValueType();
			if (valueType instanceof EReference) {
				int upperBound = ((EReference) valueType).getUpperBound();
				int size = observableValues.size();
				if (-1 != upperBound && size >= upperBound) {
					createInstanceButton.setEnabled(false);
				} else {
					createInstanceButton.setEnabled(true);
				}
			}
		}
	}
}
