package org.eclipse.papyrus.widgets.databinding;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.widgets.providers.ComboLabelProvider;
import org.eclipse.papyrus.widgets.providers.UnchangedObject;
import org.eclipse.papyrus.widgets.providers.UnsetObject;


public class ComboObservableValue extends AbstractObservableValue implements ISelectionChangedListener {

	protected ComboViewer viewer;

	protected Object currentValue;

	protected AggregatedObservable modelProperty;

	public ComboObservableValue(ComboViewer viewer, IObservableValue modelProperty) {
		this.viewer = viewer;
		viewer.setLabelProvider(new ComboLabelProvider(viewer.getLabelProvider()));
		if(modelProperty instanceof AggregatedObservable) {
			this.modelProperty = (AggregatedObservable)modelProperty;
		}
		viewer.addSelectionChangedListener(this);
	}

	public Object getValueType() {
		return Object.class;
	}

	@Override
	protected Object doGetValue() {
		ISelection selection = viewer.getSelection();
		if(!selection.isEmpty() && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object firstElement = structuredSelection.getFirstElement();
			if(firstElement == UnsetObject.instance) {
				return null;
			}
			if(firstElement == UnchangedObject.instance) {
				return null;
			}
			return firstElement;
		}

		return null;
	}

	@Override
	protected void doSetValue(Object value) {
		currentValue = value;

		if(modelProperty != null && modelProperty.hasDifferentValues()) {
			viewer.setSelection(new StructuredSelection(UnchangedObject.instance));
		} else if(value == null) {
			viewer.setSelection(new StructuredSelection(UnsetObject.instance));
		} else {
			viewer.setSelection(new StructuredSelection(value));
		}
	}

	@Override
	public void dispose() {
		viewer.removeSelectionChangedListener(this);
		super.dispose();
	}

	public void selectionChanged(SelectionChangedEvent event) {
		if(((IStructuredSelection)event.getSelection()).getFirstElement() != UnchangedObject.instance) {

			final Object oldValue = currentValue;
			final Object newValue = doGetValue();
			currentValue = newValue;

			fireValueChange(new ValueDiff() {

				@Override
				public Object getOldValue() {
					return oldValue;
				}

				@Override
				public Object getNewValue() {
					return newValue;
				}

			});
		}
	}

}
