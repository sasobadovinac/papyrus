/**
 * 
 */
package org.eclipse.papyrus.sasheditor.contentprovider.di.internal;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.sasheditor.contentprovider.IAbstractPanelModel;
import org.eclipse.papyrus.sasheditor.contentprovider.IContentChangedListener;
import org.eclipse.papyrus.sasheditor.contentprovider.IContentChangedProvider;
import org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider;
import org.eclipse.papyrus.sasheditor.contentprovider.ITabFolderModel;


/**
 * @author dumoulin
 *
 */
public class TransactionalDiContentProvider implements ISashWindowsContentProvider, IContentChangedProvider {

	/**
	 * wrapped ContentProvider. All commands will use this provider.
	 */
	private DiContentProvider diContentProvider;
	
	private TransactionalEditingDomain editingDomain;
	/**
	 * 
	 * Constructor.
	 * @param diContentProvider
	 */
	public TransactionalDiContentProvider(DiContentProvider diContentProvider, TransactionalEditingDomain editingDomain) {
		this.diContentProvider = diContentProvider;
		this.editingDomain = editingDomain;
	}
	
	/**
	 * Get the editing domain used to perform transactions.
	 * @return
	 */
	private TransactionalEditingDomain getTransactionalEditingDomain() {
		return editingDomain;
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#addPage(java.lang.Object)
	 * @param page
	 * 
	 */
	public void addPage(final Object page) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.addPage(page);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#addPage(java.lang.Object, int)
	 * @param page
	 * @param index
	 * 
	 */
	public void addPage(final Object page, final int index) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.addPage(page, index);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#createChildSashModel(java.lang.Object)
	 * @param root
	 * @return
	 * 
	 */
	public IAbstractPanelModel createChildSashModel(final Object root) {
		return diContentProvider.createChildSashModel(root);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#createFolder(org.eclipse.papyrus.sasheditor.contentprovider.ITabFolderModel, int, org.eclipse.papyrus.sasheditor.contentprovider.ITabFolderModel, int)
	 * @param tabFolder
	 * @param tabIndex
	 * @param targetFolder
	 * @param side
	 * 
	 */
	public void createFolder(final ITabFolderModel tabFolder, final int tabIndex, final ITabFolderModel targetFolder, final int side) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.createFolder(tabFolder, tabIndex, targetFolder, side);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#getRootModel()
	 * @return
	 * 
	 */
	public Object getRootModel() {
		return diContentProvider.getRootModel();
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#movePage(org.eclipse.papyrus.sasheditor.contentprovider.ITabFolderModel, int, int)
	 * @param folderModel
	 * @param oldIndex
	 * @param newIndex
	 * 
	 */
	public void movePage(final ITabFolderModel folderModel, final int oldIndex, final int newIndex) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.movePage(folderModel, oldIndex, newIndex);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#movePage(org.eclipse.papyrus.sasheditor.contentprovider.ITabFolderModel, int, org.eclipse.papyrus.sasheditor.contentprovider.ITabFolderModel, int)
	 * @param srcFolderModel
	 * @param sourceIndex
	 * @param targetFolderModel
	 * @param targetIndex
	 * 
	 */
	public void movePage(final ITabFolderModel srcFolderModel, final int sourceIndex, final ITabFolderModel targetFolderModel, final int targetIndex) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.movePage(srcFolderModel, sourceIndex, targetFolderModel, targetIndex);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#removePage(int)
	 * @param index
	 * 
	 */
	public void removePage(final int index) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.removePage(index);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#removePage(java.lang.Object)
	 * @param page
	 * 
	 */
	public void removePage(final Object page) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.removePage(page);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider#removePage(org.eclipse.papyrus.sasheditor.contentprovider.ITabFolderModel, int)
	 * @param parentFolder
	 * @param tabIndex
	 * 
	 */
	public void removePage(final ITabFolderModel parentFolder, final int tabIndex) {
		TransactionalEditingDomain editingDomain = getTransactionalEditingDomain();
		
		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				diContentProvider.removePage(parentFolder, tabIndex);
				
			}
		};

		editingDomain.getCommandStack().execute(command);
	}

	public void addContentChangedListener(IContentChangedListener listener) {
		diContentProvider.addContentChangedListener(listener);
		
	}

	public void removeContentChangedListener(IContentChangedListener listener) {
		diContentProvider.removeContentChangedListener(listener);
		
	}

}
