/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.tabbedproperties.uml.parts.forms;

// Start of user code for imports

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;

import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.papyrus.tabbedproperties.uml.providers.UMLMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.api.parts.EEFMessageManager;
import org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import java.util.Map;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.Property;

import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.jface.viewers.StructuredSelection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFModelViewerDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Port;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class PortPropertiesEditionPartForm extends CompositePropertiesEditionPart implements
		IFormPropertiesEditionPart, PortPropertiesEditionPart {

	protected EMFListEditUtil ownedCommentEditUtil;

	protected ReferencesTable<?> ownedComment;

	protected List<ViewerFilter> ownedCommentBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> ownedCommentFilters = new ArrayList<ViewerFilter>();

	protected Text name;

	protected EMFComboViewer visibility;

	private EMFListEditUtil clientDependencyEditUtil;

	protected ReferencesTable<?> clientDependency;

	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();

	protected Button isLeaf;

	protected Button isStatic;

	protected Button isOrdered;

	protected Button isUnique;

	protected Button isReadOnly;

	protected EMFListEditUtil deploymentEditUtil;

	protected ReferencesTable<?> deployment;

	protected List<ViewerFilter> deploymentBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> deploymentFilters = new ArrayList<ViewerFilter>();

	protected Button isDerived;

	protected Button isDerivedUnion;

	protected EMFComboViewer aggregation;

	private EMFListEditUtil redefinedPropertyEditUtil;

	protected ReferencesTable<?> redefinedProperty;

	protected List<ViewerFilter> redefinedPropertyBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> redefinedPropertyFilters = new ArrayList<ViewerFilter>();

	private EMFListEditUtil subsettedPropertyEditUtil;

	protected ReferencesTable<?> subsettedProperty;

	protected List<ViewerFilter> subsettedPropertyBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> subsettedPropertyFilters = new ArrayList<ViewerFilter>();

	protected EMFListEditUtil qualifierEditUtil;

	protected ReferencesTable<?> qualifier;

	protected List<ViewerFilter> qualifierBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> qualifierFilters = new ArrayList<ViewerFilter>();

	protected Button isBehavior;

	protected Button isService;

	private EMFListEditUtil redefinedPortEditUtil;

	protected ReferencesTable<?> redefinedPort;

	protected List<ViewerFilter> redefinedPortBusinessFilters = new ArrayList<ViewerFilter>();

	protected List<ViewerFilter> redefinedPortFilters = new ArrayList<ViewerFilter>();

	public PortPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view, new EEFMessageManager(scrolledForm, widgetFactory));
		return scrolledForm;
	}

	public void createControls(final FormToolkit widgetFactory, Composite view, IMessageManager messageManager) {
		this.messageManager = messageManager;
		createPropertiesGroup(widgetFactory, view);
		// Start of user code for additional ui definition

		// End of user code

	}

	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE
				| Section.EXPANDED);
		propertiesSection.setText(UMLMessages.PortPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createOwnedCommentTableComposition(widgetFactory, propertiesGroup);
		createNameText(widgetFactory, propertiesGroup);
		createVisibilityEMFComboViewer(widgetFactory, propertiesGroup);
		createClientDependencyReferencesTable(widgetFactory, propertiesGroup);
		createIsLeafCheckbox(widgetFactory, propertiesGroup);
		createIsStaticCheckbox(widgetFactory, propertiesGroup);
		createIsOrderedCheckbox(widgetFactory, propertiesGroup);
		createIsUniqueCheckbox(widgetFactory, propertiesGroup);
		createIsReadOnlyCheckbox(widgetFactory, propertiesGroup);
		createDeploymentTableComposition(widgetFactory, propertiesGroup);
		createIsDerivedCheckbox(widgetFactory, propertiesGroup);
		createIsDerivedUnionCheckbox(widgetFactory, propertiesGroup);
		createAggregationEMFComboViewer(widgetFactory, propertiesGroup);
		createRedefinedPropertyReferencesTable(widgetFactory, propertiesGroup);
		createSubsettedPropertyReferencesTable(widgetFactory, propertiesGroup);
		createQualifierTableComposition(widgetFactory, propertiesGroup);
		createIsBehaviorCheckbox(widgetFactory, propertiesGroup);
		createIsServiceCheckbox(widgetFactory, propertiesGroup);
		createRedefinedPortReferencesTable(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	/**
	 * @param container
	 */
	protected void createOwnedCommentTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedComment = new ReferencesTable<Comment>(UMLMessages.PortPropertiesEditionPart_OwnedCommentLabel,
				new ReferencesTableListener<Comment>() {

					public void handleAdd() {
						addToOwnedComment();
					}

					public void handleEdit(Comment element) {
						editOwnedComment(element);
					}

					public void handleMove(Comment element, int oldIndex, int newIndex) {
						moveOwnedComment(element, oldIndex, newIndex);
					}

					public void handleRemove(Comment element) {
						removeFromOwnedComment(element);
					}

					public void navigateTo(Comment element) {
					}
				});
		this.ownedComment.setHelpText(propertiesEditionComponent.getHelpContent(UMLViewsRepository.Port.ownedComment,
				UMLViewsRepository.FORM_KIND));
		this.ownedComment.createControls(parent, widgetFactory);
		GridData ownedCommentData = new GridData(GridData.FILL_HORIZONTAL);
		ownedCommentData.horizontalSpan = 3;
		this.ownedComment.setLayoutData(ownedCommentData);
	}

	/**
	 * 
	 */
	protected void moveOwnedComment(Comment element, int oldIndex, int newIndex) {
		EObject editedElement = ownedCommentEditUtil.foundCorrespondingEObject(element);
		ownedCommentEditUtil.moveElement(element, oldIndex, newIndex);
		ownedComment.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.ownedComment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE,
				editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToOwnedComment() {

		// Start of user code addToOwnedComment() method body

		Comment eObject = UMLFactory.eINSTANCE.createComment();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				ownedCommentEditUtil.addElement(propertiesEditionObject);
				ownedComment.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.ownedComment,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromOwnedComment(Comment element) {

		// Start of user code for the removeFromOwnedComment() method body

		EObject editedElement = ownedCommentEditUtil.foundCorrespondingEObject(element);
		ownedCommentEditUtil.removeElement(element);
		ownedComment.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.ownedComment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE,
				null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	protected void editOwnedComment(Comment element) {

		// Start of user code editOwnedComment() method body

		EObject editedElement = ownedCommentEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				ownedCommentEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				ownedComment.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.ownedComment,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement,
						propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UMLMessages.PortPropertiesEditionPart_NameLabel,
				propertiesEditionComponent.isRequired(UMLViewsRepository.Port.name, UMLViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addModifyListener(new ModifyListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.name,
							PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 */
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.name,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.name, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$

	}

	protected void createVisibilityEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils
				.createPartLabel(widgetFactory, parent, UMLMessages.PortPropertiesEditionPart_VisibilityLabel,
						propertiesEditionComponent.isRequired(UMLViewsRepository.Port.visibility,
								UMLViewsRepository.FORM_KIND));
		visibility = new EMFComboViewer(parent);
		visibility.setContentProvider(new ArrayContentProvider());
		visibility.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
		visibility.getCombo().setLayoutData(visibilityData);
		visibility.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.visibility,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.visibility, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createClientDependencyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.clientDependency = new ReferencesTable<Dependency>(
				UMLMessages.PortPropertiesEditionPart_ClientDependencyLabel, new ReferencesTableListener<Dependency>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<Dependency> dialog = new TabElementTreeSelectionDialog<Dependency>(
								resourceSet, clientDependencyFilters, clientDependencyBusinessFilters, "Dependency",
								UMLPackage.eINSTANCE.getDependency()) {

							@Override
							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!clientDependencyEditUtil.getVirtualList().contains(elem))
										clientDependencyEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											PortPropertiesEditionPartForm.this,
											UMLViewsRepository.Port.clientDependency, PropertiesEditionEvent.COMMIT,
											PropertiesEditionEvent.ADD, null, elem));
								}
								clientDependency.refresh();
							}
						};
						dialog.open();
					}

					public void handleEdit(Dependency element) {
						editClientDependency(element);
					}

					public void handleMove(Dependency element, int oldIndex, int newIndex) {
						moveClientDependency(element, oldIndex, newIndex);
					}

					public void handleRemove(Dependency element) {
						removeFromClientDependency(element);
					}

					public void navigateTo(Dependency element) {
					}
				});
		this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.clientDependency, UMLViewsRepository.FORM_KIND));
		this.clientDependency.createControls(parent, widgetFactory);
		GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
		clientDependencyData.horizontalSpan = 3;
		this.clientDependency.setLayoutData(clientDependencyData);
		this.clientDependency.disableMove();
	}

	/**
	 * 
	 */
	protected void moveClientDependency(Dependency element, int oldIndex, int newIndex) {
		EObject editedElement = clientDependencyEditUtil.foundCorrespondingEObject(element);
		clientDependencyEditUtil.moveElement(element, oldIndex, newIndex);
		clientDependency.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE,
				editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromClientDependency(Dependency element) {

		// Start of user code for the removeFromClientDependency() method body

		EObject editedElement = clientDependencyEditUtil.foundCorrespondingEObject(element);
		clientDependencyEditUtil.removeElement(element);
		clientDependency.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE,
				null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	protected void editClientDependency(Dependency element) {

		// Start of user code editClientDependency() method body

		EObject editedElement = clientDependencyEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				clientDependencyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				clientDependency.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.clientDependency,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement,
						propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createIsLeafCheckbox(FormToolkit widgetFactory, Composite parent) {
		isLeaf = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsLeafLabel, SWT.CHECK);
		isLeaf.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isLeaf,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isLeaf
									.getSelection())));
			}

		});
		GridData isLeafData = new GridData(GridData.FILL_HORIZONTAL);
		isLeafData.horizontalSpan = 2;
		isLeaf.setLayoutData(isLeafData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isLeaf, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createIsStaticCheckbox(FormToolkit widgetFactory, Composite parent) {
		isStatic = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsStaticLabel, SWT.CHECK);
		isStatic.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isStatic,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isStatic
									.getSelection())));
			}

		});
		GridData isStaticData = new GridData(GridData.FILL_HORIZONTAL);
		isStaticData.horizontalSpan = 2;
		isStatic.setLayoutData(isStaticData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isStatic, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createIsOrderedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isOrdered = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsOrderedLabel, SWT.CHECK);
		isOrdered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isOrdered,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOrdered
									.getSelection())));
			}

		});
		GridData isOrderedData = new GridData(GridData.FILL_HORIZONTAL);
		isOrderedData.horizontalSpan = 2;
		isOrdered.setLayoutData(isOrderedData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isOrdered, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createIsUniqueCheckbox(FormToolkit widgetFactory, Composite parent) {
		isUnique = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsUniqueLabel, SWT.CHECK);
		isUnique.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isUnique,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isUnique
									.getSelection())));
			}

		});
		GridData isUniqueData = new GridData(GridData.FILL_HORIZONTAL);
		isUniqueData.horizontalSpan = 2;
		isUnique.setLayoutData(isUniqueData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isUnique, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createIsReadOnlyCheckbox(FormToolkit widgetFactory, Composite parent) {
		isReadOnly = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsReadOnlyLabel,
				SWT.CHECK);
		isReadOnly.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isReadOnly,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isReadOnly
									.getSelection())));
			}

		});
		GridData isReadOnlyData = new GridData(GridData.FILL_HORIZONTAL);
		isReadOnlyData.horizontalSpan = 2;
		isReadOnly.setLayoutData(isReadOnlyData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isReadOnly, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 */
	protected void createDeploymentTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.deployment = new ReferencesTable<Deployment>(UMLMessages.PortPropertiesEditionPart_DeploymentLabel,
				new ReferencesTableListener<Deployment>() {

					public void handleAdd() {
						addToDeployment();
					}

					public void handleEdit(Deployment element) {
						editDeployment(element);
					}

					public void handleMove(Deployment element, int oldIndex, int newIndex) {
						moveDeployment(element, oldIndex, newIndex);
					}

					public void handleRemove(Deployment element) {
						removeFromDeployment(element);
					}

					public void navigateTo(Deployment element) {
					}
				});
		this.deployment.setHelpText(propertiesEditionComponent.getHelpContent(UMLViewsRepository.Port.deployment,
				UMLViewsRepository.FORM_KIND));
		this.deployment.createControls(parent, widgetFactory);
		GridData deploymentData = new GridData(GridData.FILL_HORIZONTAL);
		deploymentData.horizontalSpan = 3;
		this.deployment.setLayoutData(deploymentData);
	}

	/**
	 * 
	 */
	protected void moveDeployment(Deployment element, int oldIndex, int newIndex) {
		EObject editedElement = deploymentEditUtil.foundCorrespondingEObject(element);
		deploymentEditUtil.moveElement(element, oldIndex, newIndex);
		deployment.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.deployment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE,
				editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToDeployment() {

		// Start of user code addToDeployment() method body

		Deployment eObject = UMLFactory.eINSTANCE.createDeployment();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				deploymentEditUtil.addElement(propertiesEditionObject);
				deployment.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.deployment,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromDeployment(Deployment element) {

		// Start of user code for the removeFromDeployment() method body

		EObject editedElement = deploymentEditUtil.foundCorrespondingEObject(element);
		deploymentEditUtil.removeElement(element);
		deployment.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.deployment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null,
				editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	protected void editDeployment(Deployment element) {

		// Start of user code editDeployment() method body

		EObject editedElement = deploymentEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				deploymentEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				deployment.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.deployment,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement,
						propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createIsDerivedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isDerived = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsDerivedLabel, SWT.CHECK);
		isDerived.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isDerived,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isDerived
									.getSelection())));
			}

		});
		GridData isDerivedData = new GridData(GridData.FILL_HORIZONTAL);
		isDerivedData.horizontalSpan = 2;
		isDerived.setLayoutData(isDerivedData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isDerived, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createIsDerivedUnionCheckbox(FormToolkit widgetFactory, Composite parent) {
		isDerivedUnion = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsDerivedUnionLabel,
				SWT.CHECK);
		isDerivedUnion.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isDerivedUnion,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isDerivedUnion
									.getSelection())));
			}

		});
		GridData isDerivedUnionData = new GridData(GridData.FILL_HORIZONTAL);
		isDerivedUnionData.horizontalSpan = 2;
		isDerivedUnion.setLayoutData(isDerivedUnionData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isDerivedUnion, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createAggregationEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, UMLMessages.PortPropertiesEditionPart_AggregationLabel,
				propertiesEditionComponent
						.isRequired(UMLViewsRepository.Port.aggregation, UMLViewsRepository.FORM_KIND));
		aggregation = new EMFComboViewer(parent);
		aggregation.setContentProvider(new ArrayContentProvider());
		aggregation.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData aggregationData = new GridData(GridData.FILL_HORIZONTAL);
		aggregation.getCombo().setLayoutData(aggregationData);
		aggregation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.aggregation,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAggregation()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.aggregation, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createRedefinedPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.redefinedProperty = new ReferencesTable<Property>(
				UMLMessages.PortPropertiesEditionPart_RedefinedPropertyLabel, new ReferencesTableListener<Property>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<Property> dialog = new TabElementTreeSelectionDialog<Property>(
								resourceSet, redefinedPropertyFilters, redefinedPropertyBusinessFilters, "Property",
								UMLPackage.eINSTANCE.getProperty()) {

							@Override
							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!redefinedPropertyEditUtil.getVirtualList().contains(elem))
										redefinedPropertyEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											PortPropertiesEditionPartForm.this,
											UMLViewsRepository.Port.redefinedProperty, PropertiesEditionEvent.COMMIT,
											PropertiesEditionEvent.ADD, null, elem));
								}
								redefinedProperty.refresh();
							}
						};
						dialog.open();
					}

					public void handleEdit(Property element) {
						editRedefinedProperty(element);
					}

					public void handleMove(Property element, int oldIndex, int newIndex) {
						moveRedefinedProperty(element, oldIndex, newIndex);
					}

					public void handleRemove(Property element) {
						removeFromRedefinedProperty(element);
					}

					public void navigateTo(Property element) {
					}
				});
		this.redefinedProperty.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.redefinedProperty, UMLViewsRepository.FORM_KIND));
		this.redefinedProperty.createControls(parent, widgetFactory);
		GridData redefinedPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		redefinedPropertyData.horizontalSpan = 3;
		this.redefinedProperty.setLayoutData(redefinedPropertyData);
		this.redefinedProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveRedefinedProperty(Property element, int oldIndex, int newIndex) {
		EObject editedElement = redefinedPropertyEditUtil.foundCorrespondingEObject(element);
		redefinedPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		redefinedProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.redefinedProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE,
				editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromRedefinedProperty(Property element) {

		// Start of user code for the removeFromRedefinedProperty() method body

		EObject editedElement = redefinedPropertyEditUtil.foundCorrespondingEObject(element);
		redefinedPropertyEditUtil.removeElement(element);
		redefinedProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.redefinedProperty, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	protected void editRedefinedProperty(Property element) {

		// Start of user code editRedefinedProperty() method body

		EObject editedElement = redefinedPropertyEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				redefinedPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				redefinedProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.redefinedProperty,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement,
						propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createSubsettedPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.subsettedProperty = new ReferencesTable<Property>(
				UMLMessages.PortPropertiesEditionPart_SubsettedPropertyLabel, new ReferencesTableListener<Property>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<Property> dialog = new TabElementTreeSelectionDialog<Property>(
								resourceSet, subsettedPropertyFilters, subsettedPropertyBusinessFilters, "Property",
								UMLPackage.eINSTANCE.getProperty()) {

							@Override
							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!subsettedPropertyEditUtil.getVirtualList().contains(elem))
										subsettedPropertyEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											PortPropertiesEditionPartForm.this,
											UMLViewsRepository.Port.subsettedProperty, PropertiesEditionEvent.COMMIT,
											PropertiesEditionEvent.ADD, null, elem));
								}
								subsettedProperty.refresh();
							}
						};
						dialog.open();
					}

					public void handleEdit(Property element) {
						editSubsettedProperty(element);
					}

					public void handleMove(Property element, int oldIndex, int newIndex) {
						moveSubsettedProperty(element, oldIndex, newIndex);
					}

					public void handleRemove(Property element) {
						removeFromSubsettedProperty(element);
					}

					public void navigateTo(Property element) {
					}
				});
		this.subsettedProperty.setHelpText(propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.subsettedProperty, UMLViewsRepository.FORM_KIND));
		this.subsettedProperty.createControls(parent, widgetFactory);
		GridData subsettedPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		subsettedPropertyData.horizontalSpan = 3;
		this.subsettedProperty.setLayoutData(subsettedPropertyData);
		this.subsettedProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveSubsettedProperty(Property element, int oldIndex, int newIndex) {
		EObject editedElement = subsettedPropertyEditUtil.foundCorrespondingEObject(element);
		subsettedPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		subsettedProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.subsettedProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE,
				editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromSubsettedProperty(Property element) {

		// Start of user code for the removeFromSubsettedProperty() method body

		EObject editedElement = subsettedPropertyEditUtil.foundCorrespondingEObject(element);
		subsettedPropertyEditUtil.removeElement(element);
		subsettedProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.subsettedProperty, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	protected void editSubsettedProperty(Property element) {

		// Start of user code editSubsettedProperty() method body

		EObject editedElement = subsettedPropertyEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				subsettedPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				subsettedProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.subsettedProperty,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement,
						propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * @param container
	 */
	protected void createQualifierTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.qualifier = new ReferencesTable<Property>(UMLMessages.PortPropertiesEditionPart_QualifierLabel,
				new ReferencesTableListener<Property>() {

					public void handleAdd() {
						addToQualifier();
					}

					public void handleEdit(Property element) {
						editQualifier(element);
					}

					public void handleMove(Property element, int oldIndex, int newIndex) {
						moveQualifier(element, oldIndex, newIndex);
					}

					public void handleRemove(Property element) {
						removeFromQualifier(element);
					}

					public void navigateTo(Property element) {
					}
				});
		this.qualifier.setHelpText(propertiesEditionComponent.getHelpContent(UMLViewsRepository.Port.qualifier,
				UMLViewsRepository.FORM_KIND));
		this.qualifier.createControls(parent, widgetFactory);
		GridData qualifierData = new GridData(GridData.FILL_HORIZONTAL);
		qualifierData.horizontalSpan = 3;
		this.qualifier.setLayoutData(qualifierData);
	}

	/**
	 * 
	 */
	protected void moveQualifier(Property element, int oldIndex, int newIndex) {
		EObject editedElement = qualifierEditUtil.foundCorrespondingEObject(element);
		qualifierEditUtil.moveElement(element, oldIndex, newIndex);
		qualifier.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.qualifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE,
				editedElement, newIndex));

	}

	/**
	 * 
	 */
	protected void addToQualifier() {

		// Start of user code addToQualifier() method body

		Property eObject = UMLFactory.eINSTANCE.createProperty();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent,
							eObject, resourceSet));
			if (propertiesEditionObject != null) {
				qualifierEditUtil.addElement(propertiesEditionObject);
				qualifier.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.qualifier,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}

		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromQualifier(Property element) {

		// Start of user code for the removeFromQualifier() method body

		EObject editedElement = qualifierEditUtil.foundCorrespondingEObject(element);
		qualifierEditUtil.removeElement(element);
		qualifier.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.qualifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null,
				editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	protected void editQualifier(Property element) {

		// Start of user code editQualifier() method body

		EObject editedElement = qualifierEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				qualifierEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				qualifier.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.qualifier,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement,
						propertiesEditionObject));
			}
		}

		// End of user code

	}

	protected void createIsBehaviorCheckbox(FormToolkit widgetFactory, Composite parent) {
		isBehavior = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsBehaviorLabel,
				SWT.CHECK);
		isBehavior.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isBehavior,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isBehavior
									.getSelection())));
			}

		});
		GridData isBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		isBehaviorData.horizontalSpan = 2;
		isBehavior.setLayoutData(isBehaviorData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isBehavior, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createIsServiceCheckbox(FormToolkit widgetFactory, Composite parent) {
		isService = widgetFactory.createButton(parent, UMLMessages.PortPropertiesEditionPart_IsServiceLabel, SWT.CHECK);
		isService.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.isService,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isService
									.getSelection())));
			}

		});
		GridData isServiceData = new GridData(GridData.FILL_HORIZONTAL);
		isServiceData.horizontalSpan = 2;
		isService.setLayoutData(isServiceData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				UMLViewsRepository.Port.isService, UMLViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	protected void createRedefinedPortReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.redefinedPort = new ReferencesTable<Port>(UMLMessages.PortPropertiesEditionPart_RedefinedPortLabel,
				new ReferencesTableListener<Port>() {

					public void handleAdd() {
						TabElementTreeSelectionDialog<Port> dialog = new TabElementTreeSelectionDialog<Port>(
								resourceSet, redefinedPortFilters, redefinedPortBusinessFilters, "Port",
								UMLPackage.eINSTANCE.getPort()) {

							@Override
							public void process(IStructuredSelection selection) {
								for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
									EObject elem = (EObject) iter.next();
									if (!redefinedPortEditUtil.getVirtualList().contains(elem))
										redefinedPortEditUtil.addElement(elem);
									propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
											PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.redefinedPort,
											PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
								}
								redefinedPort.refresh();
							}
						};
						dialog.open();
					}

					public void handleEdit(Port element) {
						editRedefinedPort(element);
					}

					public void handleMove(Port element, int oldIndex, int newIndex) {
						moveRedefinedPort(element, oldIndex, newIndex);
					}

					public void handleRemove(Port element) {
						removeFromRedefinedPort(element);
					}

					public void navigateTo(Port element) {
					}
				});
		this.redefinedPort.setHelpText(propertiesEditionComponent.getHelpContent(UMLViewsRepository.Port.redefinedPort,
				UMLViewsRepository.FORM_KIND));
		this.redefinedPort.createControls(parent, widgetFactory);
		GridData redefinedPortData = new GridData(GridData.FILL_HORIZONTAL);
		redefinedPortData.horizontalSpan = 3;
		this.redefinedPort.setLayoutData(redefinedPortData);
		this.redefinedPort.disableMove();
	}

	/**
	 * 
	 */
	protected void moveRedefinedPort(Port element, int oldIndex, int newIndex) {
		EObject editedElement = redefinedPortEditUtil.foundCorrespondingEObject(element);
		redefinedPortEditUtil.moveElement(element, oldIndex, newIndex);
		redefinedPort.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.redefinedPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE,
				editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromRedefinedPort(Port element) {

		// Start of user code for the removeFromRedefinedPort() method body

		EObject editedElement = redefinedPortEditUtil.foundCorrespondingEObject(element);
		redefinedPortEditUtil.removeElement(element);
		redefinedPort.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartForm.this,
				UMLViewsRepository.Port.redefinedPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE,
				null, editedElement));

		// End of user code

	}

	/**
	 * 
	 */
	protected void editRedefinedPort(Port element) {

		// Start of user code editRedefinedPort() method body

		EObject editedElement = redefinedPortEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance()
				.getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy
					.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element, resourceSet));
			if (propertiesEditionObject != null) {
				redefinedPortEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				redefinedPort.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						PortPropertiesEditionPartForm.this, UMLViewsRepository.Port.redefinedPort,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement,
						propertiesEditionObject));
			}
		}

		// End of user code

	}

	public void firePropertiesChanged(PropertiesEditionEvent event) {
		// Start of user code for tab synchronization

		// End of user code

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getOwnedCommentToAdd()
	 */
	public List getOwnedCommentToAdd() {
		return ownedCommentEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getOwnedCommentToRemove()
	 */
	public List getOwnedCommentToRemove() {
		return ownedCommentEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getOwnedCommentToEdit()
	 */
	public Map getOwnedCommentToEdit() {
		return ownedCommentEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getOwnedCommentToMove()
	 */
	public List getOwnedCommentToMove() {
		return ownedCommentEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getOwnedCommentTable()
	 */
	public List getOwnedCommentTable() {
		return ownedCommentEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initOwnedComment(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedComment(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			ownedCommentEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			ownedCommentEditUtil = new EMFListEditUtil(current, feature);
		this.ownedComment.setInput(ownedCommentEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#updateOwnedComment(EObject
	 *      newValue)
	 */
	public void updateOwnedComment(EObject newValue) {
		if (ownedCommentEditUtil != null) {
			ownedCommentEditUtil.reinit(newValue);
			ownedComment.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addFilterOwnedComment(ViewerFilter
	 *      filter)
	 */
	public void addFilterToOwnedComment(ViewerFilter filter) {
		ownedCommentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addBusinessFilterOwnedComment(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToOwnedComment(ViewerFilter filter) {
		ownedCommentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getName()
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setName(String
	 *      newValue)
	 */
	public void setName(String newValue) {
		name.setText(newValue);
	}

	public void setMessageForName(String msg, int msgLevel) {
		messageManager.addMessage("Name_key", msg, null, msgLevel, name);
	}

	public void unsetMessageForName() {
		messageManager.removeMessage("Name_key", name);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getVisibility()
	 */
	public Enumerator getVisibility() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initVisibility(EEnum
	 *      eenum, Enumerator current)
	 */
	public void initVisibility(EEnum eenum, Enumerator current) {
		visibility.setInput(eenum.getELiterals());
		visibility.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setVisibility(Enumerator
	 *      newValue)
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getClientDependencyToAdd()
	 */
	public List getClientDependencyToAdd() {
		return clientDependencyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getClientDependencyToRemove()
	 */
	public List getClientDependencyToRemove() {
		return clientDependencyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getClientDependencyTable()
	 */
	public List getClientDependencyTable() {
		return clientDependencyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initClientDependency(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initClientDependency(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			clientDependencyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			clientDependencyEditUtil = new EMFListEditUtil(current, feature);
		this.clientDependency.setInput(clientDependencyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#updateClientDependency(EObject
	 *      newValue)
	 */
	public void updateClientDependency(EObject newValue) {
		if (clientDependencyEditUtil != null) {
			clientDependencyEditUtil.reinit(newValue);
			clientDependency.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addFilterClientDependency(ViewerFilter
	 *      filter)
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
		clientDependencyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
		clientDependencyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsLeaf()
	 */
	public Boolean getIsLeaf() {
		return Boolean.valueOf(isLeaf.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsLeaf(Boolean
	 *      newValue)
	 */
	public void setIsLeaf(Boolean newValue) {
		if (newValue != null) {
			isLeaf.setSelection(newValue.booleanValue());
		} else {
			isLeaf.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsStatic()
	 */
	public Boolean getIsStatic() {
		return Boolean.valueOf(isStatic.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsStatic(Boolean
	 *      newValue)
	 */
	public void setIsStatic(Boolean newValue) {
		if (newValue != null) {
			isStatic.setSelection(newValue.booleanValue());
		} else {
			isStatic.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsOrdered()
	 */
	public Boolean getIsOrdered() {
		return Boolean.valueOf(isOrdered.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsOrdered(Boolean
	 *      newValue)
	 */
	public void setIsOrdered(Boolean newValue) {
		if (newValue != null) {
			isOrdered.setSelection(newValue.booleanValue());
		} else {
			isOrdered.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsUnique()
	 */
	public Boolean getIsUnique() {
		return Boolean.valueOf(isUnique.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsUnique(Boolean
	 *      newValue)
	 */
	public void setIsUnique(Boolean newValue) {
		if (newValue != null) {
			isUnique.setSelection(newValue.booleanValue());
		} else {
			isUnique.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsReadOnly()
	 */
	public Boolean getIsReadOnly() {
		return Boolean.valueOf(isReadOnly.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsReadOnly(Boolean
	 *      newValue)
	 */
	public void setIsReadOnly(Boolean newValue) {
		if (newValue != null) {
			isReadOnly.setSelection(newValue.booleanValue());
		} else {
			isReadOnly.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getDeploymentToAdd()
	 */
	public List getDeploymentToAdd() {
		return deploymentEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getDeploymentToRemove()
	 */
	public List getDeploymentToRemove() {
		return deploymentEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getDeploymentToEdit()
	 */
	public Map getDeploymentToEdit() {
		return deploymentEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getDeploymentToMove()
	 */
	public List getDeploymentToMove() {
		return deploymentEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getDeploymentTable()
	 */
	public List getDeploymentTable() {
		return deploymentEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initDeployment(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initDeployment(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			deploymentEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			deploymentEditUtil = new EMFListEditUtil(current, feature);
		this.deployment.setInput(deploymentEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#updateDeployment(EObject
	 *      newValue)
	 */
	public void updateDeployment(EObject newValue) {
		if (deploymentEditUtil != null) {
			deploymentEditUtil.reinit(newValue);
			deployment.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addFilterDeployment(ViewerFilter
	 *      filter)
	 */
	public void addFilterToDeployment(ViewerFilter filter) {
		deploymentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addBusinessFilterDeployment(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToDeployment(ViewerFilter filter) {
		deploymentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsDerived()
	 */
	public Boolean getIsDerived() {
		return Boolean.valueOf(isDerived.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsDerived(Boolean
	 *      newValue)
	 */
	public void setIsDerived(Boolean newValue) {
		if (newValue != null) {
			isDerived.setSelection(newValue.booleanValue());
		} else {
			isDerived.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsDerivedUnion()
	 */
	public Boolean getIsDerivedUnion() {
		return Boolean.valueOf(isDerivedUnion.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsDerivedUnion(Boolean
	 *      newValue)
	 */
	public void setIsDerivedUnion(Boolean newValue) {
		if (newValue != null) {
			isDerivedUnion.setSelection(newValue.booleanValue());
		} else {
			isDerivedUnion.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getAggregation()
	 */
	public Enumerator getAggregation() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) aggregation.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initAggregation(EEnum
	 *      eenum, Enumerator current)
	 */
	public void initAggregation(EEnum eenum, Enumerator current) {
		aggregation.setInput(eenum.getELiterals());
		aggregation.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setAggregation(Enumerator
	 *      newValue)
	 */
	public void setAggregation(Enumerator newValue) {
		aggregation.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getRedefinedPropertyToAdd()
	 */
	public List getRedefinedPropertyToAdd() {
		return redefinedPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getRedefinedPropertyToRemove()
	 */
	public List getRedefinedPropertyToRemove() {
		return redefinedPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getRedefinedPropertyTable()
	 */
	public List getRedefinedPropertyTable() {
		return redefinedPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initRedefinedProperty(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initRedefinedProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			redefinedPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			redefinedPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.redefinedProperty.setInput(redefinedPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#updateRedefinedProperty(EObject
	 *      newValue)
	 */
	public void updateRedefinedProperty(EObject newValue) {
		if (redefinedPropertyEditUtil != null) {
			redefinedPropertyEditUtil.reinit(newValue);
			redefinedProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addFilterRedefinedProperty(ViewerFilter
	 *      filter)
	 */
	public void addFilterToRedefinedProperty(ViewerFilter filter) {
		redefinedPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addBusinessFilterRedefinedProperty(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToRedefinedProperty(ViewerFilter filter) {
		redefinedPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getSubsettedPropertyToAdd()
	 */
	public List getSubsettedPropertyToAdd() {
		return subsettedPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getSubsettedPropertyToRemove()
	 */
	public List getSubsettedPropertyToRemove() {
		return subsettedPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getSubsettedPropertyTable()
	 */
	public List getSubsettedPropertyTable() {
		return subsettedPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initSubsettedProperty(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initSubsettedProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			subsettedPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			subsettedPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.subsettedProperty.setInput(subsettedPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#updateSubsettedProperty(EObject
	 *      newValue)
	 */
	public void updateSubsettedProperty(EObject newValue) {
		if (subsettedPropertyEditUtil != null) {
			subsettedPropertyEditUtil.reinit(newValue);
			subsettedProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addFilterSubsettedProperty(ViewerFilter
	 *      filter)
	 */
	public void addFilterToSubsettedProperty(ViewerFilter filter) {
		subsettedPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addBusinessFilterSubsettedProperty(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToSubsettedProperty(ViewerFilter filter) {
		subsettedPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getQualifierToAdd()
	 */
	public List getQualifierToAdd() {
		return qualifierEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getQualifierToRemove()
	 */
	public List getQualifierToRemove() {
		return qualifierEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getQualifierToEdit()
	 */
	public Map getQualifierToEdit() {
		return qualifierEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getQualifierToMove()
	 */
	public List getQualifierToMove() {
		return qualifierEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getQualifierTable()
	 */
	public List getQualifierTable() {
		return qualifierEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initQualifier(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initQualifier(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			qualifierEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			qualifierEditUtil = new EMFListEditUtil(current, feature);
		this.qualifier.setInput(qualifierEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#updateQualifier(EObject
	 *      newValue)
	 */
	public void updateQualifier(EObject newValue) {
		if (qualifierEditUtil != null) {
			qualifierEditUtil.reinit(newValue);
			qualifier.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addFilterQualifier(ViewerFilter
	 *      filter)
	 */
	public void addFilterToQualifier(ViewerFilter filter) {
		qualifierFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addBusinessFilterQualifier(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToQualifier(ViewerFilter filter) {
		qualifierBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsBehavior()
	 */
	public Boolean getIsBehavior() {
		return Boolean.valueOf(isBehavior.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsBehavior(Boolean
	 *      newValue)
	 */
	public void setIsBehavior(Boolean newValue) {
		if (newValue != null) {
			isBehavior.setSelection(newValue.booleanValue());
		} else {
			isBehavior.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getIsService()
	 */
	public Boolean getIsService() {
		return Boolean.valueOf(isService.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#setIsService(Boolean
	 *      newValue)
	 */
	public void setIsService(Boolean newValue) {
		if (newValue != null) {
			isService.setSelection(newValue.booleanValue());
		} else {
			isService.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getRedefinedPortToAdd()
	 */
	public List getRedefinedPortToAdd() {
		return redefinedPortEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getRedefinedPortToRemove()
	 */
	public List getRedefinedPortToRemove() {
		return redefinedPortEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#getRedefinedPortTable()
	 */
	public List getRedefinedPortTable() {
		return redefinedPortEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#initRedefinedPort(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initRedefinedPort(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			redefinedPortEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			redefinedPortEditUtil = new EMFListEditUtil(current, feature);
		this.redefinedPort.setInput(redefinedPortEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#updateRedefinedPort(EObject
	 *      newValue)
	 */
	public void updateRedefinedPort(EObject newValue) {
		if (redefinedPortEditUtil != null) {
			redefinedPortEditUtil.reinit(newValue);
			redefinedPort.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addFilterRedefinedPort(ViewerFilter
	 *      filter)
	 */
	public void addFilterToRedefinedPort(ViewerFilter filter) {
		redefinedPortFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.tabbedproperties.uml.parts.PortPropertiesEditionPart#addBusinessFilterRedefinedPort(ViewerFilter
	 *      filter)
	 */
	public void addBusinessFilterToRedefinedPort(ViewerFilter filter) {
		redefinedPortBusinessFilters.add(filter);
	}

	// Start of user code additional methods

	// End of user code

}
