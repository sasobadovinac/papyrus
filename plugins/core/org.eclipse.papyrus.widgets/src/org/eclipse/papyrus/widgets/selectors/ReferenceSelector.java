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
package org.eclipse.papyrus.widgets.selectors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.papyrus.widgets.editors.IElementSelector;
import org.eclipse.papyrus.widgets.providers.EncapsulatedContentProvider;
import org.eclipse.papyrus.widgets.providers.IStaticContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;


/**
 * A Selector for Multiple Reference values, with a filter
 * 
 * @author Camille Letavernier
 * 
 */
public class ReferenceSelector implements IElementSelector {

	//	/**
	//	 * A Widget to enter a filter as a String, accepting wildcards
	//	 */
	//	protected Filter filter;

	/**
	 * The display tree
	 */
	protected FilteredTree fTree;

	/**
	 * The content provider, returning the available reference values
	 */
	protected EncapsulatedContentProvider contentProvider;

	/**
	 * The content provider, returning the available reference labels
	 */
	protected ILabelProvider labelProvider;

	/**
	 * Indicates if the reference values should be unique
	 */
	protected boolean unique;

	/**
	 * Indicates if this selector should be able to return more than one value
	 * at a time.
	 */
	protected boolean multiSelection;

	/**
	 * The set of selected elements. If the selector is marked as "unique",
	 * these elements will be filtered in the Tree.
	 */
	protected Set<Object> selectedElements = new HashSet<Object>();

	/**
	 * 
	 * Constructor.
	 * 
	 * @param unique
	 *        Indicates if the values are unique. If true, they are removed
	 *        from the list when they are chosen
	 */
	public ReferenceSelector(boolean unique) {
		this.unique = unique;
		this.multiSelection = true;
	}

	/**
	 * 
	 * Constructor.
	 * Builds a new ReferenceSelector for a single element
	 * 
	 */
	public ReferenceSelector() {
		this.unique = false;
		this.multiSelection = false;
	}

	/**
	 * {@inheritDoc}
	 */
	public Object[] getSelectedElements() {
		ISelection selection = fTree.getViewer().getSelection();
		if(selection instanceof IStructuredSelection) {
			Object[] selectedElements = ((IStructuredSelection)selection).toArray();
			addSelectedElements(selectedElements);
			return selectedElements;
		}
		return new Object[0];
	}

	/**
	 * Adds elements to the list of selected elements. If the values are
	 * unique, the specified elements won't be displayed
	 * 
	 * @param elements
	 */
	private void addSelectedElements(Object[] elements) {
		if(elements.length > 0) {
			selectedElements.addAll(Arrays.asList(elements));
			fTree.getViewer().refresh();
		}
	}

	/**
	 * Returns all the elements that are currently displayed, i.e. matching
	 * the filter
	 * 
	 * {@link IElementSelector#getAllElements()}
	 * 
	 * @return all elements matching the filter
	 */
	public Object[] getAllElements() {
		//There is no way to retrieve the filteredElements on a FList
		//We can only retrieve the selected ones
		//Fix : we select everything, then we return the selection
		if(contentProvider == null) {
			return new Object[0];
		}

		fTree.getViewer().refresh();
		fTree.getViewer().setSelection(new StructuredSelection(contentProvider.getElements()));
		Object[] allElements = ((IStructuredSelection)fTree.getViewer().getSelection()).toArray();
		addSelectedElements(allElements);
		return allElements;
	}

	/**
	 * Sets the list of selected elements. If the values are
	 * unique, the specified elements won't be displayed
	 * 
	 * @param elements
	 */
	public void setSelectedElements(Object[] elements) {
		selectedElements.clear();
		selectedElements.addAll(Arrays.asList(elements));
		fTree.getViewer().refresh();
	}

	public void newObjectCreated(Object newObject) {
		contentProvider.addTemporaryElement(newObject);
		refresh();
	}

	public void clearTemporaryElements() {
		contentProvider.clearTemporaryElements();
	}

	/**
	 * Refreshes this selector's {@link org.eclipse.swt.widgets.List}
	 */
	public void refresh() {
		fTree.getViewer().refresh();
	}

	/**
	 * Sets this selector's label provider. The label provider is used
	 * to display the reference values
	 * 
	 * @param labelProvider
	 */
	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
		if(fTree != null) {
			fTree.getViewer().setLabelProvider(labelProvider);
		}
	}

	/**
	 * Sets this selector's content provider. The content provider
	 * is used to select the available values for this property
	 * 
	 * @param staticContentProvider
	 */
	public void setContentProvider(IStaticContentProvider staticContentProvider) {
		this.contentProvider = new EncapsulatedContentProvider(staticContentProvider);
		if(fTree != null) {
			fTree.getViewer().setContentProvider(contentProvider);
			fTree.getViewer().setInput("");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void createControls(Composite parent) {
		Composite content = new Composite(parent, SWT.BORDER);
		content.setLayout(new GridLayout(1, true));

		//		filter = new Filter(content, SWT.BORDER);
		//		filter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		final PatternFilter filter = new PatternFilter();
		filter.setPattern("*");

		fTree = new FilteredTree(content, SWT.MULTI | SWT.BORDER, new PatternFilter(), true);

		//fList = new FilteredList(content, SWT.MULTI | SWT.BORDER, labelProvider, true, true, true);
		fTree.getViewer().getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		if(contentProvider != null) {
			fTree.getViewer().setContentProvider(contentProvider);
			fTree.getViewer().setInput("");
		}
		if(labelProvider != null) {
			fTree.getViewer().setLabelProvider(labelProvider);
		}
		//
		//		this.filter.addChangeListener(new Listener() {
		//
		//			public void handleEvent(Event event) {
		//				filter.setPattern(ReferenceSelector.this.filter.getFilter());
		//			}
		//		});

		fTree.getViewer().addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if(unique) {
					return !selectedElements.contains(element);
				} else {
					return true;
				}
			}
		});
	}

	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	//	/**
	//	 * A Text field to let the user type its own filter
	//	 * 
	//	 * @author Camille Letavernier
	//	 * 
	//	 */
	//	private class Filter extends Composite implements KeyListener {
	//
	//		/**
	//		 * The text box used to edit the filter
	//		 */
	//		private Text text;
	//
	//		/**
	//		 * @param parent
	//		 *        The composite in which the filter should be created
	//		 * @param style
	//		 *        The style applied to this filter's text box
	//		 */
	//		public Filter(Composite parent, int style) {
	//			super(parent, SWT.NONE);
	//			setLayout(new FillLayout());
	//			text = new Text(this, style);
	//			text.addKeyListener(this);
	//			listeners = new LinkedList<Listener>();
	//		}
	//
	//		/**
	//		 * @return this filter as a String
	//		 */
	//		public String getFilter() {
	//			return text.getText();
	//		}
	//
	//		/**
	//		 * Adds a listener on this filter. The listener is notified
	//		 * each time the filter changes
	//		 * 
	//		 * @param listener
	//		 */
	//		public void addChangeListener(Listener listener) {
	//			listeners.add(listener);
	//		}
	//
	//		/**
	//		 * Ignored
	//		 */
	//		public void keyPressed(KeyEvent e) {
	//			//Nothing
	//		}
	//
	//		/**
	//		 * Handles the filter change event
	//		 */
	//		public void keyReleased(KeyEvent e) {
	//			for(Listener listener : listeners) {
	//				listener.handleEvent(null);
	//			}
	//		}
	//
	//		@Override
	//		public void dispose() {
	//			listeners.clear();
	//			super.dispose();
	//		}
	//
	//		/**
	//		 * All registered listeners
	//		 */
	//		private Collection<Listener> listeners;
	//	}

}
