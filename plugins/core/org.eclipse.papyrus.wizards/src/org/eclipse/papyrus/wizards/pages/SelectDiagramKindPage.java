/*******************************************************************************
 * Copyright (c) 2008 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *     Tatiana Fesenko(CEA) - improved look&feel
 *******************************************************************************/
package org.eclipse.papyrus.wizards.pages;

import static org.eclipse.papyrus.wizards.Activator.log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.core.extension.commands.CreationCommandDescriptor;
import org.eclipse.papyrus.core.extension.commands.CreationCommandRegistry;
import org.eclipse.papyrus.core.extension.commands.ICreationCommand;
import org.eclipse.papyrus.core.extension.commands.ICreationCommandRegistry;
import org.eclipse.papyrus.wizards.SettingsHelper;
import org.eclipse.papyrus.wizards.kind.DiagramKindContentProvider;
import org.eclipse.papyrus.wizards.kind.DiagramKindLabelProvider;
import org.eclipse.papyrus.wizards.template.ModelTemplateDescription;
import org.eclipse.papyrus.wizards.template.SelectModelTemplateComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

/**
 * This WizardPage to select the kind of Papyrus Diagram. List all kind of diagrams registered with
 * creationCommand attribute in PapyrusDiagram Eclipse extension.
 * 
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 * @author Tatiana Fesenko
 */
public class SelectDiagramKindPage extends WizardPage {

	/** The Constant PAGE_ID. */
	public static final String PAGE_ID = "SelectDiagramKind"; //$NON-NLS-1$

	/**
	 * The diagram name text field
	 */
	private Text nameText;

	private CheckboxTableViewer diagramKindTableViewer;

	private SettingsHelper mySettingsHelper;

	/** The select template composite. */
	private SelectModelTemplateComposite selectTemplateComposite;

	private Button rememberCurrentSelection;

	private final CategoryProvider myCategoryProvider;

	private final boolean allowTemplates;

	private final ICreationCommandRegistry myCreationCommandRegistry;

	public static final ICreationCommandRegistry DEFAULT_CREATION_COMMAND_REGISTRY = CreationCommandRegistry.getInstance(org.eclipse.papyrus.core.Activator.PLUGIN_ID);

	/**
	 * Instantiates a new select diagram kind page.
	 * 
	 */
	public SelectDiagramKindPage(CategoryProvider categoryProvider) {
		this(true, categoryProvider, DEFAULT_CREATION_COMMAND_REGISTRY);
	}

	/**
	 * Instantiates a new select diagram kind page.
	 * 
	 */
	public SelectDiagramKindPage(boolean allowTemplates, CategoryProvider categoryProvider, ICreationCommandRegistry creationCommandRegistry) {
		super(PAGE_ID);
		setTitle(Messages.SelectDiagramKindPage_page_title);
		setDescription(Messages.SelectDiagramKindPage_page_desc);
		this.allowTemplates = allowTemplates;
		myCategoryProvider = categoryProvider;
		myCreationCommandRegistry = creationCommandRegistry;
	}

	/**
	 * Creates the control.
	 * 
	 * @param parent
	 *        the parent {@inheritDoc}
	 */
	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 10;
		plate.setLayout(gridLayout);
		setControl(plate);

		String[] categories = getDiagramCategories();

		createNameForm(plate);

		createDiagramKindForm(plate);
		diagramKindTableViewer.setInput(categories);

		createModelTemplateComposite(plate);

		createRememberCurrentSelectionForm(plate);

		fillInTables(categories);

	}

	@Override
	public void setWizard(IWizard newWizard) {
		super.setWizard(newWizard);
		setSettingsHelper(new SettingsHelper(getDialogSettings()));
	}

	/**
	 * Sets the settings helper.
	 * 
	 * @param helper
	 *        the new settings helper
	 */
	protected void setSettingsHelper(SettingsHelper helper) {
		mySettingsHelper = helper;
	}

	/**
	 * @see org.eclipse.jface.dialogs.DialogPage#setVisible(boolean)
	 * 
	 * @param visible
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			fillInTables(getDiagramCategories());
			validatePage();
			if(!allowTemplates) {
				selectTemplateComposite.disable();
			}
		}
	}

	private void fillInTables(String[] categories) {
		if(categories == null || categories.length == 0) {
			return;
		}
		diagramKindTableViewer.setInput(categories);
		selectTemplateComposite.setInput(categories);
		selectDefaultDiagramKinds(categories);
		selectDefaultDiagramTemplates(categories);
	}


	public String getTemplatePath() {
		return selectTemplateComposite.getTemplatePath();
	}

	public String getTemplatePluginId() {
		return selectTemplateComposite.getTemplatePluginId();
	}

	/**
	 * Gets the diagram category.
	 * 
	 * @return the diagram category
	 */
	private String[] getDiagramCategories() {
		return myCategoryProvider.getCurrentCategories();
	}


	/**
	 * @return the new diagram name
	 */
	public String getDiagramName() {
		return nameText.getText();
	}

	public boolean templatesEnabled() {
		return allowTemplates;
	}

	/**
	 * @return the creation command
	 */
	public List<ICreationCommand> getCreationCommands() {
		CreationCommandDescriptor[] selected = getSelectedDiagramKindDescriptors();
		List<ICreationCommand> commands = new ArrayList<ICreationCommand>();
		for(int i = 0; i < selected.length; i++) {

			ICreationCommand command;
			try {
				command = (selected[i]).getCommand();
				commands.add(command);
			} catch (Exception e) {
				log.error(e);
			}
		}
		return commands;
	}

	public List<ICreationCommand> getCreationCommands(String categoryId) {
		List<CreationCommandDescriptor> selected = getSelectedCommandDescriptors(categoryId);
		List<ICreationCommand> commands = new ArrayList<ICreationCommand>();
		for(CreationCommandDescriptor next : selected) {
			ICreationCommand command;
			try {
				command = next.getCommand();
				commands.add(command);
			} catch (Exception e) {
				log.error(e);
			}
		}
		return commands;
	}

	protected List<CreationCommandDescriptor> getSelectedCommandDescriptors(String categoryId) {
		CreationCommandDescriptor[] selected = getSelectedDiagramKindDescriptors();
		List<CreationCommandDescriptor> commands = new ArrayList<CreationCommandDescriptor>();
		for(int i = 0; i < selected.length; i++) {
			if(selected[i].getLanguage().equals(categoryId)) {
				commands.add(selected[i]);
			}
		}
		return commands;
	}

	private void createModelTemplateComposite(Composite composite) {
		Group group = createGroup(composite, Messages.SelectDiagramKindPage_load_template_group);
		selectTemplateComposite = new SelectModelTemplateComposite(group);
	}

	/**
	 * Creates the diagram kind form.
	 * 
	 * @param composite
	 *        the composite
	 */
	private void createDiagramKindForm(Composite composite) {
		Group group = createGroup(composite, Messages.SelectDiagramKindPage_select_kind_group);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		group.setData(data);

		final Table diagramKindTable = new Table(group, SWT.NO_BACKGROUND | SWT.CHECK);
		diagramKindTable.setFont(group.getFont());
		diagramKindTable.setBackground(group.getBackground());

		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		diagramKindTable.setLayout(layout);

		GridData data2 = new GridData(SWT.FILL, SWT.FILL, true, true);
		diagramKindTable.setLayoutData(data2);

		diagramKindTable.addSelectionListener(new SelectionListener() {

			/**
			 * {@inheritDoc}
			 */
			public void widgetSelected(SelectionEvent e) {
				if(e.detail == SWT.CHECK) {
					validatePage();
				}
			}

			/**
			 * {@inheritDoc}
			 */
			public void widgetDefaultSelected(SelectionEvent e) {
				// does nothing
			}
		});
		diagramKindTableViewer = new CheckboxTableViewer(diagramKindTable);
		diagramKindTableViewer.setContentProvider(new DiagramKindContentProvider(getCreationCommandRegistry()));
		diagramKindTableViewer.setLabelProvider(createDiagramKindLabelProvider());
	}

	protected IBaseLabelProvider createDiagramKindLabelProvider() {
		return new DiagramKindLabelProvider();
	}


	/**
	 * Creates the group.
	 * 
	 * @param parent
	 *        the parent
	 * @param name
	 *        the name
	 * @return the group
	 */
	private static Group createGroup(Composite parent, String name) {
		Group group = new Group(parent, SWT.NONE);
		group.setText(name);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		group.setLayout(layout);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		group.setLayoutData(data);
		return group;
	}

	/**
	 * Creates the name form.
	 * 
	 * @param composite
	 *        the composite
	 */
	private void createNameForm(Composite composite) {
		Group group = createGroup(composite, Messages.SelectDiagramKindPage_diagram_name_group);

		nameText = new Text(group, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		nameText.setLayoutData(data);
		nameText.setText(Messages.SelectDiagramKindPage_default_diagram_name);
		nameText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				validatePage();
			}
		});
	}

	private void createRememberCurrentSelectionForm(Composite composite) {
		Composite plate = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		plate.setLayout(layout);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		plate.setLayoutData(data);

		rememberCurrentSelection = new Button(plate, SWT.CHECK);
		rememberCurrentSelection.setText(Messages.SelectDiagramKindPage_remember_current_selection_text);
		rememberCurrentSelection.setToolTipText(Messages.SelectDiagramKindPage_remember_current_selection_tooltip);

		rememberCurrentSelection.setSelection(mySettingsHelper.rememberCurrentSelection(getDialogSettings()));
	}

	/**
	 * Validate page.
	 * 
	 * @return true, if successful
	 */
	private boolean validatePage() {
		if(getDiagramName() == null || getDiagramName().length() == 0) {
			updateStatus(Messages.SelectDiagramKindPage_diagram_name_is_empty);
			return false;
		}
		//		if(getCreationCommands().isEmpty()) {
		//			updateStatus("At least one diagram kind should be selected.");
		//			return false;
		//		}
		updateStatus(null);
		return true;
	}

	/**
	 * Update page status.
	 * 
	 * @param message
	 *        is the error message.
	 */
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public boolean isRememberCurrentSelection() {
		return rememberCurrentSelection.getSelection();
	}

	/**
	 * Gets the selected diagram kinds.
	 * 
	 * @return the selected diagram kinds
	 */
	public String[] getSelectedDiagramKinds(String categoryId) {
		List<CreationCommandDescriptor> descriptors = getSelectedCommandDescriptors(categoryId);
		String[] result = new String[descriptors.size()];
		for(int i = 0; i < descriptors.size(); i++) {
			result[i] = descriptors.get(i).getCommandId();
		}
		return result;
	}

	protected CreationCommandDescriptor[] getSelectedDiagramKindDescriptors() {
		Object[] checked = diagramKindTableViewer.getCheckedElements();
		// as Object is not a subclass of String we cannot cast Object[] to String[] 
		CreationCommandDescriptor[] result = Arrays.asList(checked).toArray(new CreationCommandDescriptor[checked.length]);
		return result;
	}

	private void selectDefaultDiagramKinds(String[] categories) {
		Set<String> kinds = new HashSet<String>();
		for(String category : categories) {
			kinds.addAll(mySettingsHelper.getDefaultDiagramKinds(category));
		}
		CreationCommandDescriptor[] elementsToCheck = findCreationCommandDescriptorsFor(kinds);
		diagramKindTableViewer.setCheckedElements(elementsToCheck);
	}

	protected CreationCommandDescriptor[] findCreationCommandDescriptorsFor(Collection<String> kinds) {
		List<CreationCommandDescriptor> result = new ArrayList<CreationCommandDescriptor>();
		Collection<CreationCommandDescriptor> availableDescriptors = getCreationCommandRegistry().getCommandDescriptors();
		for(CreationCommandDescriptor desc : availableDescriptors) {
			if(kinds.contains(desc.getCommandId())) {
				result.add(desc);
			}
		}
		return result.toArray(new CreationCommandDescriptor[result.size()]);
	}

	private void selectDefaultDiagramTemplates(String[] categories) {
		List<String> defaultTemplates = new ArrayList<String>();
		List<Object> availableTemplates = new ArrayList<Object>();
		for(String category : categories) {
			defaultTemplates.addAll(mySettingsHelper.getDefaultTemplates(category));
			availableTemplates.addAll(Arrays.asList(selectTemplateComposite.getContentProvider().getElements(category)));
		}
		for(Object next : availableTemplates) {
			ModelTemplateDescription desc = (ModelTemplateDescription)next;
			if(defaultTemplates.contains(desc.getPath())) {
				selectTemplateComposite.selectElement(desc);
				return;
			}
		}
	}

	protected final ICreationCommandRegistry getCreationCommandRegistry() {
		return myCreationCommandRegistry;
	}

	public static interface CategoryProvider {

		String[] getCurrentCategories();
	}

}
