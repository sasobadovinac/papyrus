/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Shuai Li (CEA LIST) <shuai.li@cea.fr> - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.hyperlink.preferences;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.hyperlink.Activator;
import org.eclipse.papyrus.infra.hyperlink.service.impl.HyperlinkServiceImpl;
import org.eclipse.papyrus.infra.hyperlink.service.impl.HyperlinkServiceImpl.ContributorDescriptor;
import org.eclipse.papyrus.infra.hyperlink.service.impl.HyperlinkServiceImpl.HyperlinkContributorDescriptor;
import org.eclipse.papyrus.infra.widgets.providers.CollectionContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.BackingStoreException;

public class HyperlinkServicePreferencesPage extends PreferencePage implements IWorkbenchPreferencePage {

	public static final int ACTIVATION_COLUMN = 0;

	private Map<HyperlinkContributorDescriptor, Button> hyperlinkCheckboxes;

	private HyperlinkServiceImpl hyperlinkService = new HyperlinkServiceImpl();

	/**
	 *
	 * Constructor.
	 *
	 */
	public HyperlinkServicePreferencesPage() {
		super("Hyperlink Services", org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImageDescriptor("/icons/papyrus.png"));
	}

	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Papyrus hyperlink services configuration.\nSelect the strategies you wish to activate.");
	}

	@Override
	protected Control createContents(Composite parent) {

		Composite self = new Composite(parent, SWT.NONE);
		self.setLayout(new GridLayout(1, true));
		self.setLayoutData(new GridData(GridData.FILL_BOTH));

		final TableViewer tableViewer = new TableViewer(self, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		tableViewer.getTable().setLayoutData(gridData);

		ColumnViewerToolTipSupport.enableFor(tableViewer, ToolTip.NO_RECREATE);

		tableViewer.setContentProvider(CollectionContentProvider.instance);

		try {
			hyperlinkService.startService();
		} catch (ServiceException ex) {
			return self;
		}

		tableViewer.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public void update(ViewerCell cell) {
				if (cell.getColumnIndex() == 1) {
					super.update(cell);
				} else {
					return;
				}
			}

			@Override
			public String getToolTipText(Object element) {
				if (element instanceof ContributorDescriptor) {
					return ((ContributorDescriptor) element).getDescription();
				}
				return super.getToolTipText(element);
			}

			@Override
			public Image getImage(Object element) {
				if (element instanceof ContributorDescriptor) {
					return null;
				}
				return super.getImage(element);
			}

			@Override
			public String getText(Object element) {
				if (element instanceof ContributorDescriptor) {
					return ((ContributorDescriptor) element).getLabel();
				}
				return super.getText(element);
			}
		});

		TableLayout layout = new TableLayout();

		new TableColumn(tableViewer.getTable(), SWT.LEFT);
		layout.addColumnData(new ColumnWeightData(10, 25, false));

		new TableColumn(tableViewer.getTable(), SWT.LEFT);
		layout.addColumnData(new ColumnWeightData(100, 250, true));

		tableViewer.getTable().setLayout(layout);
		tableViewer.getTable().setHeaderVisible(false);

		List<ContributorDescriptor> contributorDescriptors = new LinkedList<ContributorDescriptor>();
		contributorDescriptors.addAll(hyperlinkService.getHyperlinkContributors());
		
		tableViewer.setInput(contributorDescriptors);

		hyperlinkCheckboxes = new HashMap<HyperlinkContributorDescriptor, Button>();

		for (TableItem item : tableViewer.getTable().getItems()) {
			if (item.getData() instanceof ContributorDescriptor) {
				TableEditor editor = new TableEditor(tableViewer.getTable());

				final Button button = new Button(tableViewer.getTable(), SWT.CHECK);
				final TableItem currentItem = item;

				final ContributorDescriptor strategy = (ContributorDescriptor) currentItem.getData();

				if (strategy instanceof HyperlinkContributorDescriptor) {
					hyperlinkCheckboxes.put((HyperlinkContributorDescriptor) strategy, button);
				}
				
				button.setSelection(strategy.isActive());

				editor.setEditor(button, item, ACTIVATION_COLUMN);
				editor.horizontalAlignment = SWT.CENTER;
				editor.grabHorizontal = true;

			}
		}

		return self;
	}

	@Override
	protected void performDefaults() {
		restoreDefaults();
		super.performDefaults();
	}

	@Override
	protected void performApply() {
		IPreferenceStore preferences = Activator.getDefault().getPreferenceStore();
		
		for (Map.Entry<HyperlinkContributorDescriptor, Button> entry : hyperlinkCheckboxes.entrySet()) {
			boolean checked = entry.getValue().getSelection();
			String isActiveKey = HyperlinkContributorDescriptor.getIsActiveKey(entry.getKey());
			preferences.setValue(isActiveKey, checked);
		}

		try {
			IEclipsePreferences preferenceStore = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
			preferenceStore.flush();
		} catch (BackingStoreException ex) {
			Activator.log.error(ex);
		}
	}

	@Override
	public boolean performOk() {
		performApply();
		return super.performOk();
	}

	/**
	 * Restores the default preferences
	 */

	public void restoreDefaults() {
		IPreferenceStore preferences = Activator.getDefault().getPreferenceStore();
		
		for (Map.Entry<HyperlinkContributorDescriptor, Button> entry : hyperlinkCheckboxes.entrySet()) {
			String isActiveKey = HyperlinkContributorDescriptor.getIsActiveKey(entry.getKey());
			boolean selected = preferences.getDefaultBoolean(isActiveKey);

			entry.getValue().setSelection(selected);
		}
	}
}
