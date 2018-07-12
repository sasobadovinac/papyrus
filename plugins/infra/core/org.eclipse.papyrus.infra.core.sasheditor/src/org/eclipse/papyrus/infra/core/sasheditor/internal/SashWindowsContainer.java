/*****************************************************************************
 * Copyright (c) 2009, 2016 LIFL, CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 437217
 *  Christian W. Damus - bug 488791
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.sasheditor.internal;

import static org.eclipse.papyrus.infra.core.sasheditor.Activator.log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.Geometry;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IComponentModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IEditorModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IEditorPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IFolder;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageVisitor;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ITabMouseEventsListener;
import org.eclipse.papyrus.infra.core.sasheditor.utils.IObservableList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.DragCursors;
import org.eclipse.ui.internal.dnd.DragUtil;
import org.eclipse.ui.internal.dnd.IDragOverListener;
import org.eclipse.ui.internal.dnd.IDropTarget;


/**
 * Main entry class of the SashWindows system.
 * This class allows to have a multitab window with sashes.
 * The class require a ContentProvider describing the content to be shown.
 *
 * @author dumoulin
 */
@SuppressWarnings("restriction")
public class SashWindowsContainer implements ISashWindowsContainer {

	/**
	 * The content provider describing the sashes, folders and tabs.
	 */
	private ISashWindowsContentProvider contentProvider;

	/**
	 * The manager used to get Main editor properties like Site, ActionBars, ...
	 */
	private IMultiEditorManager multiEditorManager;

	/**
	 * Tracker tracking the current active page. The tracker also disconnect last active page and connect
	 * the new one.
	 */
	private ActivePageTracker activePageTracker;

	/**
	 * Tracker maintaining the history of the active pages.
	 * @since 2.0.0
	 */
	private ActivePageHistoryTracker activePageHistoryTracker;
	
	/**
	 * Event provider firing Pages life cycle events to registered listeners. Inner parts call the fireXxxEvents
	 * when appropriate.
	 */
	private SashContainerEventsProvider lifeCycleEventProvider;

	/**
	 * Event provider firing Folder life cycle events to registered listeners. Inner parts call the fireXxxEvents
	 * when appropriate.
	 */
	private SashContainerFolderEventsProvider folderLifeCycleEventProvider;

	/**
	 * Event provider firing mouse events from tabs.
	 *
	 */
	private TabMouseEventsProvider tabMouseEventsProvider;

	/**
	 * A manager used to maintain a view list of available {@link TabFolderPart}. This list should
	 * only be used in a READ way. It should not be modified by something else than its manager.
	 *
	 */
	private TabFolderListManager folderListManager;

	/**
	 * The part used as root. We use an extra class as root in order to separate the code dedicated to
	 * ITilePart.
	 */
	private RootPart rootPart;

	/**
	 * The SWT container associated to this part. This is generally the container of the
	 * parent.
	 */
	private Composite container;

	/**
	 * The drop target.
	 */
	protected DropTarget dropTarget;

	/** A flag that indicates that the model is being synchronized. */
	private AtomicBoolean isRefreshing = new AtomicBoolean(false);

	/**
	 * The cached value of the menu manager, if any.
	 */
	private MenuManager folderTabMenuManager;

	/**
	 * Listener on widget diposed event.
	 */
	private DisposeListener widgetDisposedListener = new DisposeListener() {

		/**
		 * Called when the widget is disposed.
		 *
		 * @see org.eclipse.swt.events.DisposeListener#widgetDisposed(org.eclipse.swt.events.DisposeEvent)
		 *
		 * @param e
		 */
		@Override
		public void widgetDisposed(DisposeEvent e) {
			// We dispose the container.
			dispose();
		}
	};

	/**
	 * Constructor.
	 * Build a Container without IEditor management. Trying to add a EditorPart will result in an Exception.
	 * The ContentProvider should not contain IEditorModel.
	 */
	public SashWindowsContainer() {
		this(null);
	}

	/**
	 * Constructor.
	 * Build a container with EditorPart management. The container will allow to add EditorPart
	 * (and thus IEditorModel to the ContentProvider).
	 *
	 * @param multiEditorManager
	 *            The manager allowing to use {@link IEditorModel} in the model.
	 *            If null, the sash will not render IEditorModel.
	 *
	 */
	public SashWindowsContainer(IMultiEditorManager multiEditorManager) {
		this.multiEditorManager = multiEditorManager;
		activePageTracker = new ActivePageTracker();

		if (multiEditorManager != null) {
			// Add listener on activePageChange.
			// This listener will take in charge editor services switching.
			activePageTracker.addActiveEditorChangedListener(new ActiveEditorServicesSwitcher(multiEditorManager.getEditorSite()));
		}

		// Life cycle event provider
		lifeCycleEventProvider = new SashContainerEventsProvider();

		// Tab mouve event provider
		tabMouseEventsProvider = new TabMouseEventsProvider();

		// Folder list view
		initTabFolderListManager();
		// Start the active page history tracker
		activePageHistoryTracker = new ActivePageHistoryTracker();
		lifeCycleEventProvider.addListener(activePageHistoryTracker);

	}

	/**
	 * @return the contentProvider
	 */
	protected ISashWindowsContentProvider getContentProvider() {
		// Content provider should have been set.
		assert (contentProvider != null);
		// Double check for development
		if (contentProvider == null) {
			throw new IllegalStateException("ContentProvider should be set before calling any method requiring it.");
		}

		return contentProvider;
	}

	/**
	 * Set the content provider describing the sashes, folders and tabs.
	 *
	 * @param contentProvider
	 *            the contentProvider to set
	 */
	public void setContentProvider(ISashWindowsContentProvider contentProvider) {
		// Use a delegate
		// The delegate is used as a central point performing calls to the
		// external implementation.
		this.contentProvider = new DelegateContentProvider(contentProvider);
	}

	/**
	 * Creates control associated to this Container.
	 * This method should be called when the parent is build.
	 *
	 * @param parent
	 *            The parent in which the editor should be created; must not be <code>null</code>.
	 */
	public void createPartControl(Composite parent) {
		this.container = parent;

		rootPart = createRootPart();
		// Create the tree of tile part.
		rootPart.createPartControl(container);
		// TODO 20130205
		// Read lastActivePart from ContentProvider, and set it
		// before refresh. Like this, sash will select the last save page

		// Create children
		refreshTabs();
		// Set selection
		// TODO 20130205 remove next, because refresh already do it
		selectPage(lookupFirstValidPage());

		// postCreatePartControl();
		// TODO reactivate next
		initDrag(container);
		// activate();

		// Listen for disposale
		container.addDisposeListener(widgetDisposedListener);
	}

	/**
	 * Create the root part for the model.
	 */
	private RootPart createRootPart() {
		RootPart part = new RootPart(this);
		return part;
	}

	/**
	 * Dispose the Container. All referenced resources will be disposed.
	 * The container should not be used anymore once disposed.
	 * The result of calling a method after a dispose() is unpredictable. <br>
	 * This method can be called several times. <br>
	 * <br>
	 * How the method works:
	 * <ul>
	 * <li>The {@link SashWindowsContainer} has two trees, the SWT tree and a Part tree ({@link #rootPart}).</li>
	 * <li>The SWT tree is disposed first.</li>
	 * <ul>
	 * <li>This prevent events fired from user interaction or from Widget modifiaction</li>
	 * <li>The SWT disposal stop before nested editors SWT (thanks to the DISPOSE event in {@link EditorPart}). At this point, the nested editor dispose() method is called.</li>
	 * <li>This allow to let the nested editor receive one single dispose call.</li>
	 * <li></li>
	 * </ul>
	 * <li>The Part tree is disposed second (by calling rootPart.disposeThisAndChildren() )</li>
	 * <ul>
	 * <li>properties are cleaned in order to help the GC</li>
	 * <li>swt controls are not disposed again</li>
	 * </ul>
	 *
	 */
	public void dispose() {
		// Check if already disposed
		if (isDisposed()) {
			return;
		}

		// End disposing children's SWT controls.
		// It is possible to recall the dispose() method on a Widget, even if we are called by the dispose event.
		// Recalling the dispose method will continue disposing SWT children's.

		// DO NOT dispose the container composite, as we did not create it!
		if (container != null) {
			for (Control next : container.getChildren()) {
				next.dispose();
			}
		}

		// dispose part children
		if (rootPart != null) {
			// rootPart can be null if createPartControl has not been called.
			// This can happen in tests.
			rootPart.disposeThisAndChildren();
		}

		// clean up properties to help GC
		activePageTracker = null;
		activePageHistoryTracker = null;
		container = null;
		contentProvider = null;
		dragOverListener = null;
		folderTabMenuManager = null;
		lifeCycleEventProvider = null;
		multiEditorManager = null;
		rootPart = null;
	}

	/**
	 * Return true if the container is disposed, false otherwise.
	 *
	 * @return
	 */
	@Override
	public boolean isDisposed() {
		// Use the activePageTracker as a flag.
		return activePageTracker == null;
	}

	/**
	 * Notifies this page container that the specified page has been activated. This method
	 * is called after the current tabs has been changed, either by refreshing the tabs, or by a user
	 * UI action.
	 * This method just set correctly the active page value in the Container, and fire pageChanged events if needed.
	 * It does not change the selected page in the Part.
	 *
	 * Propagate the event to activePageTracker.
	 * Removed since 0.10
	 *
	 * @param childPart
	 */
	// protected void pageChanged(PagePart childPart) {
	// activePageTracker.setActiveEditor(childPart);
	// lifeCycleEventProvider.firePageActivatedEvent(childPart);
	// }

	/**
	 * Notifies this page container that a pageChanged event has been fired by one swt Control.
	 * This method is usually called after the user selects a different tab.
	 *
	 * The method notify the ContentProvider, and calls {@link #pageChanged(PagePart)}.
	 * Removed since 0.10
	 *
	 * @param childPart
	 */
	// protected void pageChangedEvent(PagePart childPart) {
	//
	// // Check if it is really a change before changing the model (which can throw change event)
	// // The folder model change is done before the tracker fires the listeners, like this
	// // listeners can check the model.
	// if(getActivePage() == childPart)
	// return;
	//
	// pageChanged(childPart);
	// }

	/**
	 * Method to request to change the currently active page. 
	 * The currently active page is changed only if we are not currently synchronizing the tabs 
	 * (currently in a call to {@link #refreshTabsInternal()}.
	 * 
	 * This method is called by {@link TabFolderPart#pageChange(int)} when a UI change is detected.
	 * Such UI change can happen:
	 * <ul>
	 *   <li>when a tab is removed. This usually happen inside the call of {@link #refreshTabsInternal()}</li>
	 *   <li>when user select another tab in sashwindows</li>
	 * </ul>
	 * 
	 * If we are currently refreshing the tabs, we do nothing. The cactive page will be set at the end of {@link #refreshTabsInternal()}.
	 * 
	 * Otherwise, the page is changed by calling {@link #setActivePage(PagePart)}
	 * 
	 * @param childPart The new page to set
	 * @since 2.0.0
	 */
	protected void setActivePageRequest(PagePart newChildPart) {

		if( isRefreshing.get() ) {
			// The page change comes from a PagePart removing. 
			// skip 
			return;
		} 

		setActivePage(newChildPart);
	}
	
	/**
	 * Set the active page. The current active page will be the specified page. Throw events indicating that
	 * the current ActivePage has changed. <br>
	 * Do not set the activeSelection.
	 *
	 *
	 * @param childPart
	 */
	protected void setActivePage(PagePart childPart) {

		// Do nothing if the activePage has not changed
		if (childPart == null || getActivePage() == childPart) {
			return;
		}

		// TODO 20130205 remove next
		contentProvider.setCurrentFolder(childPart.getParent().getRawModel());

		activePageTracker.setActiveEditor(childPart);
		lifeCycleEventProvider.firePageActivatedEvent(childPart);
	}

	/**
	 * This method allow to change current activePage. It set the activePage, and select it in
	 * the folder. <br>
	 * This method fires notifications (activePageChanged).
	 *
	 * @param newActivePage
	 *            The page that should become the active one.
	 */
	protected void setActivePageAndSelection(PagePart newActivePage) {

		PagePart oldSelection = getActivePage();
		// First, set the selection, like this the observers will see the correct selection.
		synchronizeActiveSelection(newActivePage);
		try {
			// Set the active page
			setActivePage(newActivePage);

		} catch (RuntimeException e) {
			// Restore selection in case of exception
			synchronizeActiveSelection(oldSelection);
			// lets propagate
			throw e;
		}
	}

	/**
	 * Synchronize the active selection to be the page of the activePage.
	 * This should be called when the activePage is set, but the selection is not
	 * yet set. <br>
	 * This should not throw events (neither selctionChanged or pageChanged event).
	 *
	 */
	protected void synchronizeActiveSelection() {
		PagePart activePage = getActivePage();

		synchronizeActiveSelection(activePage);
	}

	/**
	 * Synchronize the active selection to be the specified page. Do not synchronize with the activePage. <br>
	 * This should not throw events (neither selctionChanged or pageChanged event).
	 *
	 * @param page
	 */
	private void synchronizeActiveSelection(PagePart page) {
		if (page == null) {
			return;
		}
		TabFolderPart folder = page.getParent();

		// Folder can be null in case of tests
		if (folder != null) {
			folder.setSelection(page);
		}

	}

	/**
	 * A change has happen in one of the inner parts. Relay the event.
	 * This method is called by inner parts whenever the event happen in one of the part.
	 * It collects and relay the firePropertyChange(int propertyId) calls from the inner IEditor.
	 *
	 * @param propertyId
	 */
	protected void firePropertyChange(int propertyId) {
		// For now, we do nothing with this event.
	}

	/**
	 * Create the part for the specified newModel.
	 *
	 * @param parent
	 *            The parent of the created part.
	 * @param partModel
	 *            The model for which a part should be created.
	 * @return
	 */
	protected PagePart createPagePart(TabFolderPart parent, IPageModel partModel, Object rawModel) {


		if (partModel instanceof IEditorModel) {
			// Check if we can use IEditorModel
			if (multiEditorManager == null) {
				throw new IllegalArgumentException("Container can't accept IEditorModel as no IMultiEditorManager is set. Please set a IMultiEditorManager.");
			}

			return new EditorPart(parent, (IEditorModel) partModel, rawModel, multiEditorManager);
		} else if (partModel instanceof IComponentModel) {
			return new ComponentPart(parent, (IComponentModel) partModel, rawModel);
		} else {
			// Return a default part
		}

		// TODO return a default part showing an error instead.
		throw new IllegalArgumentException("No Part found for the model '" + rawModel + "'");
	}

	/**
	 * Get the {@link ITabFolderModel} of the currently selected folder.
	 *
	 * @return
	 */
	@Override
	public ITabFolderModel getSelectedTabFolderModel() {

		// Get the activePage. The seleted folder is its parent.
		PagePart activePage = activePageTracker.getActiveEditor();
		if (activePage != null && activePage.getParent() != null) {
			return activePage.getParent().getPartModel();
		}
		// No active page exist, but their should be a folder
		TabFolderPart folder = lookupFirstValidFolder();
		return folder.getPartModel();
	}

	/**
	 * Lookup the first valid folder in this sash system.
	 * There is always a valid folder.
	 *
	 * @return The first valid folder.
	 */
	private TabFolderPart lookupFirstValidFolder() {

		LookupFirstFolderVisitor visitor = new LookupFirstFolderVisitor();
		rootPart.visit(visitor);
		return visitor.result();
	}

	/**
	 * Get the active page.
	 *
	 * @return
	 */
	private PagePart getActivePage() {
		return activePageTracker.getActiveEditor();
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#getActiveEditor()
	 * @return
	 *
	 */
	@Override
	public IEditorPart getActiveEditor() {
		PagePart pagePart = getActivePage();
		if (pagePart instanceof EditorPart) {
			return ((EditorPart) pagePart).getIEditorPart();
		} else {
			return null;
		}
	}

	/**
	 * Get the active page public API.
	 *
	 * @return
	 */
	@Override
	public IPage getActiveSashWindowsPage() {
		return getActivePage();
	}

	/**
	 * Get the list of visible IPages. The visible IPages are the one that have there diagram area
	 * visible.
	 *
	 * @return
	 */
	@Override
	public List<IPage> getVisiblePages() {
		CollectVisiblePageVisitor visitor = new CollectVisiblePageVisitor();

		rootPart.visit(visitor);

		return visitor.getVisiblePages();
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#getNextPage()
	 *
	 * @return
	 */
	@Override
	public IPage getNextPage() {
		CollectNextPageVisitor visitor = new CollectNextPageVisitor(false);
		return getPage(visitor);
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#getNextPage()
	 *
	 * @return
	 */
	@Override
	public IPage getPreviousPage() {
		CollectNextPageVisitor visitor = new CollectNextPageVisitor(true);
		return getPage(visitor);
	}

	/**
	 * Use the provided visitor to get the next page and return it.
	 */
	private IPage getPage(CollectNextPageVisitor visitor) {
		if (visitor != null) {
			rootPart.visit(visitor);
			if (!visitor.getNextPages().isEmpty()) {
				return visitor.getNextPages().get(0);
			}
		}
		return null;
	}

	/**
	 * Get the list of visible IPages. The visible IPages are the one that have there diagram area
	 * visible.
	 *
	 * @return
	 */
	// public List<IEditorPage> getVisibleIEditorPages() {
	// CollectVisiblePageVisitor visitor = new CollectVisiblePageVisitor( IEditorPage.class);
	//
	// rootPart.visit(visitor);
	//
	// return visitor.getVisiblePages();
	// }

	/**
	 * Get the list of visible IPages. The visible IPages are the one that have there diagram area
	 * visible.
	 *
	 * @return
	 */
	@Override
	public List<IEditorPart> getVisibleIEditorParts() {
		CollectVisibleIEditorPart visitor = new CollectVisibleIEditorPart();
		rootPart.visit(visitor);

		return visitor.getVisiblePages();
	}


	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#setFocus()
	 *
	 */
	@Override
	public void setFocus() {
		setFocus(getActivePage());
	}

	/**
	 * Sets focus to the control for the given page. If the page has an editor,
	 * this calls its <code>setFocus()</code> method. Otherwise, this calls <code>setFocus</code> on the control for the page.
	 *
	 * @param pageIndex
	 *            the index of the page
	 */
	private void setFocus(PagePart part) {
		if (part != null) {
			part.setFocus();
		}
	}


	/**
	 * Refresh the tabs.
	 * Is we are already currently refreshing, simply return.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#refreshTabs()
	 *
	 */
	@Override
	public void refreshTabs() {

		// Check if we arent already refreshing
		if (isRefreshing.compareAndSet(false, true)) {
			try {
				refreshTabsInternal();
			} finally {
				isRefreshing.set(false);
			}
		} else {
			log.warn("refresh inside refresh !");
		}

	}

	/**
	 * Refresh the tab of the page, (i.e the name and icon in the page's tab).
	 *
	 * @param page
	 *            The page for which the name and icon should be refreshed.
	 */
	public void refreshPageTab(IPage page) {
		if (page instanceof PagePart) {
			((PagePart) page).refreshTab();
		} else {
			// TODO : lookup for the corresponding PagePart, and call refresh.

		}
	}

	/**
	 * Real implementation of refreshTab.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#refreshTabs()
	 *
	 */
	private void refreshTabsInternal() {
		// System.out.println("start synchronize2() ------------------------");
		// showTilesStatus();

		// Get the currently selected page and folder
		PagePart oldActivePage = getActivePage();
		TabFolderPart oldActiveFolder = (oldActivePage!=null?oldActivePage.getParent():null);

		// Do refresh
		container.setRedraw(false);
		// Create map of parts
		// PartMap<T> partMap = new PartMap<T>();
		PartLists garbageMaps = new PartLists();
		rootPart.fillPartMap(garbageMaps);

		// Synchronize parts
		rootPart.synchronize2(garbageMaps);


		// Remove orphaned parts (no more used)
		garbageMaps.garbage();

		// set active page if needed
		PagePart nextActivePage = checkAndGetActivePage(oldActivePage, oldActiveFolder, garbageMaps);
		setActivePageAndSelection(nextActivePage);

		// Reenable SWT and force layout
		container.setRedraw(true);
		container.layout(true, true);
		
		// Check focus
		PagePart activePage = getActivePage();
		if( activePage != null && oldActiveFolder != activePage.getParent() ) {
			getActivePage().setFocus();
		}
		// System.out.println("end synchronize2() ------------------------");
		// showTilesStatus();
	}

	/**
	 * Select the specified page in the Parts. The specified page will becomes the active one.
	 * Appropriate events are fired.
	 * This is the programatic counterpart of selecting a page in the UI.
	 * If the provided page is null, do nothing.
	 * Removed since 0.10
	 *
	 * @param page
	 *            The page to select or null.
	 */
	// protected void selectPage(PagePart page) {
	// if(page == null)
	// return;
	// TabFolderPart folder = page.getParent();
	// folder.setActiveEditor(page);
	// }

	/**
	 * Select the specified page in the Parts. The specified page will becomes the active one.
	 * Appropriate events are fired if needed.
	 * This is the programmatic counterpart of selecting a page in the UI.
	 * If the provided page is null, do nothing.
	 *
	 * @param page
	 *            The page to select or null. The IPage should
	 *            be an instance previously returned by the SashContainer.
	 *
	 */
	@Override
	public void selectPage(IPage page) {
		if (page == null) {
			return;
		}

		// check if we are a correct instance.
		if (!(page instanceof PagePart)) {
			return;
		}

		setActivePageAndSelection((PagePart) page);
	}

	/**
	 * Lookup the {@link IPage} used to render the specified rawModel.
	 *
	 * @param rawModel
	 *            The model for which the IPage is requested.
	 *            If the model is not rendered, return null;
	 *
	 * @return The corresponding IPage or null if not found.
	 */
	@Override
	public IPage lookupModelPage(Object rawModel) {
		// Use a visitor to lookup the first IPage
		LookupModelPageVisitor visitor = new LookupModelPageVisitor(rawModel);
		rootPart.visit(visitor);
		return visitor.result();
	}

	/**
	 * Lookup the {@link IPage} used to render the specified IEditorPart.
	 *
	 * @param editor
	 *            The IEditorPart for which the IPage is requested.
	 *            If the IEditorPart is not rendered, return null;
	 *
	 * @return The corresponding IPage or null if not found.
	 */
	@Override
	public IPage lookupIPageByIEditorPart(IEditorPart editor) {
		// Use a visitor to lookup the first IPage
		LookupIPageByIEditorPartVisitor visitor = new LookupIPageByIEditorPartVisitor(editor);
		rootPart.visit(visitor);
		return visitor.result();
	}

	/**
	 * Try to find the page that should now be set as active.
	 * 
	 * The next active page is:
	 * <ul>
	 *   <li>if a page has been created, set it as active</li>
	 *   <li>otherwise, if the old active page still alive, set it as active</li>
	 *   <li>otherwise, check if the last active tabfolder still alive, if yes, ask it for the currently selected tab, and set the corresponding page as active. </li>
	 *   <li>If all of the previous fail, get a tabfolder, and set its active tabs as active page</li>
	 * </ul>
	 *
	 * @param oldActivePage The last active page (before refreshing)
	 * @param oldActiveFolder The last active tabFolder (before refreshing)
	 * @param partLists Lists of modified Parts
	 * @return A valid active page or null if none exists.
	 * 
	 * @since 2.0.0
	 */
	private PagePart checkAndGetActivePage(PagePart oldActivePage, TabFolderPart oldActiveFolder, PartLists partLists) {

		// Check if there is a created page
		PagePart activePage = partLists.getFirstCreatedPage();
		if (activePage != null) {
			// There is a created page. Set it as the selected and active one
			return activePage;
		}

		// Check oldActivePage validity (in case it has been deleted)
		if (oldActivePage != null && !(oldActivePage.isOrphaned() || oldActivePage.isUnchecked())) {
			return oldActivePage;
		}

		// Old active page nor more exists, and none is created.
		// Lookup in history
		activePage = (PagePart)activePageHistoryTracker.lastActivePage();
		if (activePage != null) {
			// There is a previous active page, use it
			return activePage;
		}		
		
		// No previous active page were found, try from tabfolder
		if(oldActiveFolder==null || oldActiveFolder.isOrphaned() || oldActiveFolder.isUnchecked() ) {
			// Last active folder is disabled. Search for a new  active folder
			oldActiveFolder = lookupFirstValidFolder();
		}
		
		// Get an active page if any
		return oldActiveFolder.getVisiblePagePart();
	}

	/**
	 * Lookup for a valid active Page. Return null if none is found.
	 * TODO Use a visitor to implements this method.
	 *
	 * @return
	 */
	private PagePart lookupFirstValidPage() {
		// First get a list of active editors
		PartLists garbageMaps = new PartLists();
		rootPart.fillPartMap(garbageMaps);
		return garbageMaps.getFirstValidPage();
	}

	/**
	 * Set a {@link MenuManager} used to manage a contextual menu that is shown on the tabs area of the folders.
	 *
	 * @param menuManager
	 *            The {@link MenuManager} used to create the menu on the tab area.
	 */
	@Override
	public void setFolderTabMenuManager(MenuManager menuManager) {
		this.folderTabMenuManager = menuManager;
		// Set the MenuManager in each existing folder.
		// Use a visitor.
		SetFolderTabMenuVisitor visitor = new SetFolderTabMenuVisitor(menuManager);
		rootPart.visit(visitor);
	}

	/**
	 * @return the menuManager
	 */
	protected MenuManager getFolderTabMenuManager() {
		return folderTabMenuManager;
	}

	/**
	 * Show the status of the different Tiles composing the sash system.
	 * Used for debug purpose.
	 */
	public void showTilesStatus() {
		ShowPartStatusVisitor visitor = new ShowPartStatusVisitor();
		rootPart.visit(visitor);
	}


	/**
	 * Visit all the Pages (IEditorPage and IComponentPage), allowing to access to the public interface.
	 */
	@Override
	public void visit(IPageVisitor pageVisitor) {
		PageVisitorWrapper visitor = new PageVisitorWrapper(pageVisitor);
		rootPart.visit(visitor);
	}

	/**
	 * Visit the Part associated to the container. This method visibility is protected in order to be able to access it
	 * from junit tests.
	 * It is not intended to be used by public API or from outside.
	 * 
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void visit(IPartVisitor visitor) {
		rootPart.visit(visitor);
	}

	/* ***************************************************** */
	/* Drag and Drop methods */
	/* ***************************************************** */

	/**
	 *
	 */
	private void initDrag(Composite container) {
		DragUtil.addDragTarget(container, dragOverListener);

	}

	IDragOverListener dragOverListener = new IDragOverListener() {

		/**
		 *
		 * @see org.eclipse.ui.internal.dnd.IDragOverListener#drag(org.eclipse.swt.widgets.Control, java.lang.Object, org.eclipse.swt.graphics.Point, org.eclipse.swt.graphics.Rectangle)
		 */
		@Override
		public IDropTarget drag(Control currentControl, Object draggedObject, Point position, Rectangle dragRectangle) {
			if (rootPart != null) {
				// TODO remove the cast by changing the method. Only folder can be source and target
				final TabFolderPart sourcePart = (TabFolderPart) rootPart.findPart(draggedObject); // (ITilePart) draggedObject;
				// Compute src tab index
				// TODO move that and previous in the sender of drag event. Use a class containing both as draggedObject.
				final int srcTabIndex = PTabFolder.getDraggedObjectTabIndex(draggedObject);

				// System.out.println("drag to position=" + position);
				Rectangle containerDisplayBounds = DragUtil.getDisplayBounds(container);
				AbstractPanelPart targetPart = null;

				// Check if the cursor is inside the container
				if (containerDisplayBounds.contains(position)) {

					targetPart = (AbstractPanelPart) rootPart.findPart(position);
					// System.out.println("targetPart=" + targetPart
					// + ", position=" + position
					// + "container.toControl(position)=" + container.toControl(position));

					if (targetPart != null) {
						final Control targetControl = targetPart.getControl();

						final Rectangle targetBounds = DragUtil.getDisplayBounds(targetControl);

						int side = Geometry.getClosestSide(targetBounds, position);
						int distance = Geometry.getDistanceFromEdge(targetBounds, position, side);

						// Reserve the 5 pixels around the edge of the part for the drop-on-edge cursor
						// Check if the target can handle the drop.
						if (distance >= 5) {
							// Otherwise, ask the part if it has any special meaning for this drop location
							// TODO remove cast; change return type of findPart()
							IDropTarget target = targetPart.getDropTarget(draggedObject, sourcePart, position);
							if (target != null) {
								return target;
							}
						} else {
							// We are on the boarder, try to drop on the parent
							// Warning : the parent could be the rootPart
							// System.out.println("DropTarget near the border");
						}
						//
						if (distance > 30) {
							side = SWT.CENTER;
						}
						//
						// // If the part doesn't want to override this drop location then drop on the edge
						//
						// // A "pointless drop" would be one that will put the dragged object back where it started.
						// // Note that it should be perfectly valid to drag an object back to where it came from -- however,
						// // the drop should be ignored.
						//
						@SuppressWarnings("unused")
						boolean pointlessDrop = false;

						if (sourcePart == targetPart) {
							pointlessDrop = true;
						}

						return createDropTarget(sourcePart, srcTabIndex, side, side, targetPart);
					}
				} else {
					// Cursor is outside the container
					// System.out.println("Outside container bounds");
					// This will be used to create a new Window.
					// We only allow dropping into a stack, not creating one
					// if (differentWindows)
					// return null;

					int side = Geometry.getClosestSide(containerDisplayBounds, position);

					boolean pointlessDrop = false;
					int cursor = Geometry.getOppositeSide(side);

					if (pointlessDrop) {
						side = SWT.NONE;
					}

					return createDropTarget(sourcePart, srcTabIndex, side, cursor, null);
				}
			}
			return null;

		}
	};


	/**
	 * Create the drop target
	 */
	private DropTarget createDropTarget(final TabFolderPart sourcePart, int srcTabIndex, int side, int cursor, AbstractPart targetPart) {
		if (dropTarget == null) {
			dropTarget = new DropTarget(sourcePart, srcTabIndex, side, cursor, targetPart);
		} else {
			dropTarget.setTarget(sourcePart, srcTabIndex, side, cursor, targetPart);
		}
		return dropTarget;
	}

	/**
	 * Class implementing methods required by drop targets.
	 */
	protected class DropTarget implements IDropTarget {

		int count = 0;

		int cursor = SWT.TOP;

		private int side;

		private AbstractPanelPart targetPart;

		private int srcTabIndex;

		private TabFolderPart sourcePart;

		/**
		 * Constructor.
		 */
		public DropTarget(TabFolderPart sourcePart, int srcTabIndex, int cursor, int side, AbstractPart targetPart) {
			this.cursor = cursor;
			this.side = side;
			this.sourcePart = sourcePart;
			this.srcTabIndex = srcTabIndex;
			this.targetPart = (AbstractPanelPart) targetPart;
		}

		public void setTarget(TabFolderPart sourcePart, int srcTabIndex, int cursor, int side, AbstractPart targetPart) {
			this.cursor = cursor;
			this.side = side;
			this.sourcePart = sourcePart;
			this.srcTabIndex = srcTabIndex;
			this.targetPart = (AbstractPanelPart) targetPart;
		}

		/**
		 * A folder is dropped.
		 *
		 * @see org.eclipse.ui.internal.dnd.IDropTarget#drop()
		 */
		@Override
		public void drop() {
			// @TODO remove next cast
			if (side == SWT.CENTER) { // Add to target folder
				contentProvider.movePage(sourcePart.getPartModel(), srcTabIndex, ((TabFolderPart) targetPart).getPartModel(), -1);
			} else { // Create a new folder
				contentProvider.createFolder(sourcePart.getPartModel(), srcTabIndex, ((TabFolderPart) targetPart).getPartModel(), side);
			}
		}

		/**
		 * Return the cursor used during drag.
		 *
		 * @see org.eclipse.ui.internal.dnd.IDropTarget#getCursor()
		 */
		@Override
		public Cursor getCursor() {
			// System.out.println(SashWindowsContainer.this.getClass().getSimpleName() + ".getCursor()-" + count++);
			return DragCursors.getCursor(DragCursors.positionToDragCursor(cursor));

		}

		@Override
		public Rectangle getSnapRectangle() {
			// System.out.println(SashWindowsContainer.this.getClass().getSimpleName() + ".getSnapRectangle(" + "sourcePart=" + sourcePart + ", targetPart=" + targetPart + ", side=" + side);
			Rectangle targetDisplayBounds;

			if (targetPart != null) {
				targetDisplayBounds = DragUtil.getDisplayBounds(targetPart.getControl());
			} else {
				// targetBounds = DragUtil.getDisplayBounds(getParent());
				targetDisplayBounds = DragUtil.getDisplayBounds(container);
			}

			if (side == SWT.CENTER || side == SWT.NONE) {
				return targetDisplayBounds;
			}

			int distance = Geometry.getDimension(targetDisplayBounds, !Geometry.isHorizontal(side));

			return Geometry.getExtrudedEdge(targetDisplayBounds, (int) (distance * getDockingRatio(sourcePart, targetPart)), side);
		}

		protected float getDockingRatio(AbstractPart dragged, AbstractPart target) {
			return 0.5f;
		}

	}


	/**
	 * @return the lifeCycleEventProvider
	 */
	protected SashContainerEventsProvider getLifeCycleEventProvider() {
		return lifeCycleEventProvider;
	}

	/**
	 * @return the folderLifeCycleEventProvider
	 */
	protected SashContainerFolderEventsProvider getFolderLifeCycleEventProvider() {
		return folderLifeCycleEventProvider;
	}

	/**
	 * Get the event provider used to throw TabMouseEvents.
	 *
	 * @return the TabMouseEventsProvider
	 */
	public TabMouseEventsProvider getFolderTabMouseEventProvider() {
		return tabMouseEventsProvider;
	}

	/**
	 * Return a list of all folders opened in this SashContainer. The list should only
	 * be used as a 'view' list. It should not be modified or written. The list
	 * is observable. <br>
	 * Actually, the folders are never removed from the list. This is because
	 * TabFolderPart.dispose() is never called.
	 * TODO Let TabFolderPart.dispose() be called.
	 *
	 * @return a read only and observable list of {@link IFolder}.
	 */
	@Override
	public IObservableList<IFolder> getIFolderList() {
		return folderListManager.getFolderList();
	}

	/**
	 * Init the folderListManager and let it listen to folder events.
	 */
	private void initTabFolderListManager() {
		folderLifeCycleEventProvider = new SashContainerFolderEventsProvider();
		folderListManager = new TabFolderListManager();
		// Listen to folder events.
		folderLifeCycleEventProvider.addListener(folderListManager);
	}

	/**
	 * Add a listener on pageChanged event.
	 * This implementation delegates to the internal PageTracker.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#addPageChangedListener(org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener)
	 * @param pageChangedListener
	 *
	 */
	@Override
	public void addPageChangedListener(IPageChangedListener pageChangedListener) {
		activePageTracker.addPageChangedListener(pageChangedListener);
	}

	/**
	 * Remove a listener on pageChanged event.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#removePageChangedListener(org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener)
	 * @param pageChangedListener
	 *
	 */
	@Override
	public void removePageChangedListener(IPageChangedListener pageChangedListener) {
		activePageTracker.removePageChangedListener(pageChangedListener);
	}

	/**
	 * Add a listener on Page LifeCycle events.
	 * This implementation delegates to the internal PageTracker.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#addPageChangedListener(org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener)
	 * @param listener
	 *
	 */
	@Override
	public void addPageLifeCycleListener(IPageLifeCycleEventsListener listener) {
		lifeCycleEventProvider.addListener(listener);
	}


	/**
	 * Remove a listener on Page LifeCycle events.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer#removePageChangedListener(org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener)
	 * @param listener
	 *
	 */
	@Override
	public void removePageLifeCycleListener(IPageLifeCycleEventsListener listener) {
		lifeCycleEventProvider.removeListener(listener);
	}

	/**
	 * Add a listener {@link ITabMouseEventsListener} on folder's tabs events.
	 *
	 * @param listener
	 */
	@Override
	public void addFolderTabMouseEventListener(ITabMouseEventsListener listener) {
		tabMouseEventsProvider.addListener(listener);
	}

	/**
	 * Add a listener {@link ITabMouseEventsListener} on folder's tabs events.
	 *
	 * @param listener
	 */
	@Override
	public void removeFolderTabMouseEventListener(ITabMouseEventsListener listener) {
		tabMouseEventsProvider.removeListener(listener);
	}

	/* ***************************************************** */
	/* Internal Visitors */
	/* ***************************************************** */


	/**
	 * Inner class.
	 * A visitor setting the {@link MenuManager} on each folder.
	 */
	private class SetFolderTabMenuVisitor extends PartVisitor {


		private MenuManager menuManager;

		/**
		 * Constructor.
		 *
		 * @param menuManager
		 */
		public SetFolderTabMenuVisitor(MenuManager menuManager) {
			this.menuManager = menuManager;
		}

		/**
		 * Set the menu if the visited node is a folder.
		 */
		@Override
		public boolean accept(TabFolderPart part) {
			part.setFolderTabMenuManager(menuManager);
			return true;
		}

	}

	/**
	 * Inner class.
	 * A visitor used to collect all visible page in the sashcontainer.
	 * A visible page is a page whose the diagram area is visible.
	 */
	private class CollectVisiblePageVisitor extends PartVisitor {

		private List<IPage> visiblePages = new ArrayList<IPage>();

		private Class<? extends IPage> expectedClass;

		/**
		 * Constructor.
		 *
		 * @param menuManager
		 */
		public CollectVisiblePageVisitor() {

		}

		/**
		 * Constructor.
		 *
		 * @param menuManager
		 */
		@SuppressWarnings("unused")
		public CollectVisiblePageVisitor(Class<? extends IPage> expectedClass) {
			this.expectedClass = expectedClass;
		}

		/**
		 * Get the result list.
		 *
		 * @param <T>
		 * @return
		 */
		@SuppressWarnings("unchecked")
		public <T> List<T> getVisiblePages() {
			return (List<T>) visiblePages;
		}

		/**
		 * Set the menu if the visited node is a folder.
		 */
		@Override
		public boolean accept(TabFolderPart part) {
			if (part != null) {
				IPage page = part.getVisiblePagePart();

				if (expectedClass != null && expectedClass.isInstance(page)) {
					visiblePages.add(page);
				} else {
					visiblePages.add(page);
				}

			}

			return true;
		}

	}

	/**
	 * Inner class.
	 * A visitor used to collect the next page of the next opened tab (right or left).
	 * A tab is opened if it is visible in the editor.
	 */
	private class CollectNextPageVisitor extends PartVisitor {

		private List<IPage> nextPages = new ArrayList<IPage>();

		private final boolean isPrevious;

		/**
		 * Constructor
		 */
		public CollectNextPageVisitor(boolean isPrevious) {
			this.isPrevious = isPrevious;
		}

		/**
		 * Get the results list.
		 */
		public List<IPage> getNextPages() {
			return nextPages;
		}

		/**
		 * Get the index of the currently active tab and then increments/decrements the index by 1
		 * to select the next/previous tab. The page of the tab is returned.
		 */
		@Override
		public boolean accept(TabFolderPart part) {
			PagePart activePage = activePageTracker.getActiveEditor();
			PagePart visiblePage = part.getVisiblePagePart();

			if (activePage == visiblePage) {
				CTabFolder tabFolder = part.getTabFolder();
				int itemCount = tabFolder.getItemCount();

				if (itemCount > 1) {
					int selectionIndex = tabFolder.getSelectionIndex();

					if (isPrevious) {
						selectionIndex--;
						if (selectionIndex < 0) {
							selectionIndex = itemCount - 1;
						}
					} else {
						selectionIndex++;
						if (selectionIndex >= itemCount) {
							selectionIndex = 0;
						}
					}

					IPage nextPage = part.getPagePart(selectionIndex);
					if (nextPage != null) {
						nextPages.add(nextPage);
					}
				}
			}

			return true;
		}
	}

	/**
	 * Inner class.
	 * A visitor used to collect all visible page in the sashcontainer.
	 * A visible page is a page whose the diagram area is visible.
	 */
	private class AbstractCollectIEditorPart extends PartVisitor {

		protected List<IEditorPart> editorParts = new ArrayList<IEditorPart>();

		/**
		 * Constructor.
		 *
		 * @param menuManager
		 */
		public AbstractCollectIEditorPart() {

		}

		/**
		 * Get the result list.
		 *
		 * @param <T>
		 * @return
		 */
		public List<IEditorPart> getVisiblePages() {
			return editorParts;
		}

	}

	/**
	 * Inner class.
	 * A visitor used to collect all visible page in the sashcontainer.
	 * A visible page is a page whose the diagram area is visible.
	 */
	private class CollectVisibleIEditorPart extends AbstractCollectIEditorPart {

		/**
		 * Set the menu if the visited node is a folder.
		 */
		@Override
		public boolean accept(TabFolderPart part) {

			IPage page = part.getVisiblePagePart();
			if (page != null && page instanceof IEditorPage) {
				IEditorPage editorPage = (IEditorPage) page;
				editorParts.add(editorPage.getIEditorPart());

			}
			// continue searching
			return true;
		}

	}

	/**
	 * Inner class.
	 * A visitor used to collect all parts in the sashcontainer.
	 * A visible page is a page whose the diagram area is visible.
	 */
	@SuppressWarnings("unused")
	private class CollectIEditorParts extends AbstractCollectIEditorPart {

		/**
		 * Add the part to thecollection.
		 */
		@Override
		public boolean accept(EditorPart part) {

			IEditorPart editorPart = part.getIEditorPart();
			if (editorPart != null) {
				editorParts.add(editorPart);
			}

			// continue searching
			return true;
		}

	}



}
