/*****************************************************************************
 * Copyright (c) 2009, 2016 CEA LIST, LIFL, Christian W. Damus, and others.
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
 *  Christian W. Damus - bug 485220
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal;

import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IAbstractPanelModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IContentChangedListener.ContentEvent;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.IPageModelFactory;
import org.eclipse.papyrus.infra.core.sashwindows.di.DiFactory;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashModel;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashPanel;
import org.eclipse.papyrus.infra.core.sashwindows.di.TabFolder;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;


/**
 * EMF implementation of the {@link ISashWindowsContentProvider}.
 *
 * @author dumoulin
 */
public class DiContentProvider implements ISashWindowsContentProvider {

	/** Internal EMF model */
	private SashModel diSashModel;

	/** Factory used to create SWT Editor or Component from Page Identifiers. */
	private IPageModelFactory pageModelFactory;

	/** Object delivering event to listeners. Used to control how the events are triggered */
	private ContentChangedEventProvider contentChangedEventProvider;


	/**
	 * Create a ContentProvider
	 *
	 * Constructor only used in tests.
	 *
	 * @param diSashModel
	 * @param pageModelFactory
	 *            The factory that will be used when a page will be created.
	 * @throws IllegalArgumentException
	 *             If the factory is null.
	 */
	public DiContentProvider(SashModel diSashModel, IPageModelFactory pageModelFactory) throws IllegalArgumentException {

		this(diSashModel, pageModelFactory, new ContentChangedEventProvider(diSashModel));
	}

	/**
	 * Create a ContentProvider
	 *
	 * @param diSashModel
	 * @param pageModelFactory
	 *            The factory that will be used when a page will be created.
	 * @throws IllegalArgumentException
	 *             If the factory is null.
	 */
	public DiContentProvider(SashModel diSashModel, IPageModelFactory pageModelFactory, ContentChangedEventProvider contentChangedEventProvider) throws IllegalArgumentException {

		if (pageModelFactory == null) {
			throw new IllegalArgumentException("A IPageModelFactory should be provided."); //$NON-NLS-1$
		}

		this.diSashModel = diSashModel;
		this.pageModelFactory = pageModelFactory;
		this.contentChangedEventProvider = contentChangedEventProvider;
	}

	/**
	 * Access to internal structure for tests.
	 * This method is not intended to be used for other purpose.
	 *
	 * @return the diSashModel
	 */
	protected SashModel getDiSashModel() {
		return diSashModel;
	}


	/**
	 * @return the contentChangedEventProvider
	 */
	protected ContentChangedEventProvider getContentChangedEventProvider() {
		return contentChangedEventProvider;
	}

	/**
	 * Add a page identifier to the SashModel. This page identifier will be added as "child" of the
	 * specified TabFolder.
	 *
	 * Not use by SashContainer. Used by the tests.
	 *
	 * @param pageIdentifier
	 */
	public void addPage(ITabFolderModel tabFolderModel, Object pageIdentifier) {
		TabFolder folderModel = ((TabFolderModel) tabFolderModel).getTabFolder();

		folderModel.addPage(pageIdentifier);
	}

	/**
	 * Add a page identifier to the SashModel. This page identifier will be added as "child" of the
	 * specified TabFolder.
	 *
	 * Not use by SashContainer. Used by the tests.
	 *
	 * @param pageIdentifier
	 */
	public void addPage(ITabFolderModel tabFolderModel, int index, Object pageIdentifier) {
		TabFolder folderModel = ((TabFolderModel) tabFolderModel).getTabFolder();

		folderModel.addPage(index, pageIdentifier);
	}

	/**
	 * Add a page identifier to the SashModel. This page identifier will be added as "child" of the current
	 * TabFolder.
	 *
	 * @param pageIdentifier
	 * @deprecated Not used by SashContainer. Use {@link IPageManager#openPage(Object)} instead
	 */
	@Deprecated
	@Override
	public void addPage(Object pageIdentifier) {
		diSashModel.addPage(pageIdentifier);
	}

	/**
	 * Add a page to the current folder.
	 * Create the Page (Editor or Component) with the help of the factory.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#addPage(int, org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageModel)
	 *
	 * @param index
	 * @param tabItem
	 */
	@Override
	public void addPage(Object page, int index) {

		throw new UnsupportedOperationException("Not yet implemented."); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#createFolder(org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel, int,
	 *      org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel, int)
	 *
	 * @param tabFolder
	 * @param tabIndex
	 * @param targetFolder
	 * @param side
	 * @return
	 */
	@Override
	public void createFolder(ITabFolderModel tabFolder, int tabIndex, ITabFolderModel targetFolder, int side) {

		// disable fired events
		contentChangedEventProvider.setDeliver(false);
		// Create new folder. Parent will be set when inserted.
		TabFolder newFolder = DiFactory.eINSTANCE.createTabFolder();

		TabFolder refFolder = ((TabFolderModel) targetFolder).getTabFolder();
		TabFolder pageSrcFolder = ((TabFolderModel) tabFolder).getTabFolder();

		// Insert folder
		diSashModel.insertFolder(newFolder, refFolder, side);
		// Move tab from folder to folder
		diSashModel.movePage(pageSrcFolder, tabIndex, newFolder);
		// Remove unused folder if necessary
		diSashModel.removeEmptyFolder(pageSrcFolder);
		diSashModel.setCurrentSelectionSilently(newFolder);

		// Reenable events, and fire the last one
		contentChangedEventProvider.setDeliver(true);

	}

	/**
	 * Set the current folder.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#setCurrentFolder(java.lang.Object)
	 *
	 * @deprecated Current folder is now managed by the sashContainer only.
	 *
	 * @param rawModel
	 *            The object identifying the folder.
	 *
	 */
	@Deprecated
	@Override
	public void setCurrentFolder(Object rawModel) {

		// if(!(rawModel instanceof TabFolder)) {
		// return;
		// }
		// diSashModel.setCurrentSelectionSilently((TabFolder)rawModel);
	}

	/**
	 * Get the node used as root of the SashWindows.
	 * For now, this is the first window.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#getRootModel()
	 *
	 * @return
	 */
	@Override
	public Object getRootModel() {
		// Get the first window.
		return diSashModel.getWindows().get(0).getPanel();
	}

	/**
	 * Create the IPanelModel for the rootModel returned by {@link DiContentProvider#getRootModel()}.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#createChildSashModel(java.lang.Object)
	 *
	 * @param root
	 * @return
	 */
	@Override
	public IAbstractPanelModel createChildSashModel(Object root) {


		if (root instanceof SashPanel) {
			return new SashPanelModel((SashPanel) root, pageModelFactory);
		} else if (root instanceof TabFolder) {
			return new TabFolderModel((TabFolder) root, pageModelFactory);
		} else {
			throw new IllegalArgumentException("Can't create IPanelModel from raw model '" + root + "'."); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#movePage(org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel, int, int)
	 *
	 * @param folderModel
	 * @param oldIndex
	 * @param newIndex
	 */
	@Override
	public void movePage(ITabFolderModel folderModel, int oldIndex, int newIndex) {
		TabFolder folder = ((TabFolderModel) folderModel).getTabFolder();

		contentChangedEventProvider.setDeliver(false);
		folder.movePage(oldIndex, newIndex);
		diSashModel.setCurrentSelectionSilently(folder);
		contentChangedEventProvider.setDeliver(true);
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#movePage(org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel, int,
	 *      org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel, int)
	 *
	 * @param srcFolderModel
	 * @param sourceIndex
	 * @param targetFolderModel
	 * @param targetIndex
	 */
	@Override
	public void movePage(ITabFolderModel srcFolderModel, int sourceIndex, ITabFolderModel targetFolderModel, int targetIndex) {

		TabFolder srcFolder = ((TabFolderModel) srcFolderModel).getTabFolder();
		TabFolder targetFolder = ((TabFolderModel) targetFolderModel).getTabFolder();

		contentChangedEventProvider.setDeliver(false);
		diSashModel.movePage(srcFolder, sourceIndex, targetFolder, targetIndex);
		diSashModel.removeEmptyFolder(srcFolder);
		diSashModel.setCurrentSelectionSilently(targetFolder);
		contentChangedEventProvider.setDeliver(true);

	}

	/**
	 * Remove specified page from the current folder.
	 *
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#removePage(int)
	 *
	 * @param index
	 */
	@Override
	public void removePage(int index) {
		diSashModel.removePage(index);

	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#removePage(org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageModel)
	 *
	 * @param tabItem
	 */
	@Override
	public void removePage(Object page) {
		throw new UnsupportedOperationException("Not yet implemented."); //$NON-NLS-1$

	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider#removePage(org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ITabFolderModel, int)
	 *
	 * @param parentFolder
	 * @param tabIndex
	 */
	@Override
	public void removePage(ITabFolderModel parentFolder, int tabIndex) {
		TabFolder folder = ((TabFolderModel) parentFolder).getTabFolder();

		contentChangedEventProvider.setDeliver(false);
		folder.removePage(tabIndex);
		diSashModel.removeEmptyFolder(folder);
		contentChangedEventProvider.setDeliver(true);
	}

	/**
	 * Add a listener listening on content changed. This listener will be
	 * notified each time the content change.
	 *
	 * @param listener
	 */
	protected void firePropertyChanged(ContentEvent event) {
		contentChangedEventProvider.fireContentChanged(event);
	}

}
