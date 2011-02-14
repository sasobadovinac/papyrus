/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.properties.modelelement;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.properties.databinding.MultipleObservableValue;
import org.eclipse.papyrus.widgets.providers.EmptyContentProvider;
import org.eclipse.papyrus.widgets.providers.IStaticContentProvider;

/**
 * A ModelElement to handle MultiSelection property views.
 * It is composed of standard ModelElement. The result of method
 * calls are an aggregation of the results of the same method calls
 * on each sub-element, when this makes sense (i.e. for booleans)
 * When an aggregation is not possible, the result of the same method
 * call on the first element is returned (e.g. for Content and Label providers)
 * 
 * @author Camille Letavernier
 */
public class CompositeModelElement implements ModelElement {

	public IObservableValue getObservable(String propertyPath) {
		MultipleObservableValue observableValue = new MultipleObservableValue();
		for(ModelElement element : elements) {
			observableValue.addObservable((IObservableValue)element.getObservable(propertyPath));
		}
		return observableValue;
	}

	/**
	 * Adds a sub-model element to this CompositeModelElement
	 * 
	 * @param element
	 *        The sub-model element to be added
	 */
	public void addModelElement(ModelElement element) {
		elements.add(element);
	}

	public IStaticContentProvider getContentProvider(String propertyPath) {
		if(elements.isEmpty())
			return EmptyContentProvider.instance;

		return elements.get(0).getContentProvider(propertyPath);
	}

	public ILabelProvider getLabelProvider(String propertyPath) {
		if(elements.isEmpty())
			return null;

		return elements.get(0).getLabelProvider(propertyPath);
	}

	public boolean isOrdered(String propertyPath) {
		if(elements.isEmpty())
			return false;

		for(ModelElement element : elements) {
			if(element.isOrdered(propertyPath))
				return true;
		}

		return false;
	}

	public boolean isUnique(String propertyPath) {
		if(elements.isEmpty())
			return false;

		for(ModelElement element : elements) {
			if(!element.isUnique(propertyPath))
				return false;
		}

		return true;
	}

	public boolean isMandatory(String propertyPath) {
		if(elements.isEmpty())
			return false;

		for(ModelElement element : elements) {
			if(!element.isMandatory(propertyPath))
				return false;
		}

		return true;
	}

	public boolean isEditable(String propertyPath) {
		if(elements.isEmpty())
			return false;

		for(ModelElement element : elements) {
			if(!element.isEditable(propertyPath))
				return false;
		}

		return true;
	}

	private List<ModelElement> elements = new LinkedList<ModelElement>();
}
