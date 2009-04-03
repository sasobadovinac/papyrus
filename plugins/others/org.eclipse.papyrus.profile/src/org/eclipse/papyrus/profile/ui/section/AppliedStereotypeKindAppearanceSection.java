/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chokri Mraidha (CEA LIST) Chokri.Mraidha@cea.fr - Initial API and implementation
 *  Patrick Tessier (CEA LIST) Patrick.Tessier@cea.fr - modification
 *
 *****************************************************************************/
package org.eclipse.papyrus.profile.ui.section;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.core.editor.BackboneContext;
import org.eclipse.papyrus.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.umlutils.ElementUtil;
import org.eclipse.papyrus.umlutils.ui.VisualInformationPapyrusConstant;
import org.eclipse.papyrus.umlutils.ui.helper.AppliedStereotypeHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IContributedContentsView;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;

public class AppliedStereotypeKindAppearanceSection extends AbstractPropertySection {

	private EModelElement diagramElement;

	/**
	 * The stereotype appearance.
	 */
	private CLabel stereotypeAppearance;

	/**
	 * The stereotype text alignment.
	 */
	private CLabel stereotypeTextAlignement;

	/**
	 * The combo stereotype appearance.
	 */
	private CCombo comboStereotypeAppearance;

	/**
	 * The combo stereotype alignment.
	 */
	private CCombo comboStereotypeAlignement;

	/**
	 * The combo stereotype appearance listener.
	 */
	private SelectionListener comboStereotypeAppearanceListener;

	/**
	 * The combo stereotype alignment listener.
	 */
	private SelectionListener comboStereotypeAlignementListener;

	private TransactionalEditingDomain domain;

	/**
	 * Creates the controls.
	 * 
	 * @param tabbedPropertySheetPage
	 *            the tabbed property sheet page
	 * @param parent
	 *            the parent
	 */
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data;

		comboStereotypeAppearance = getWidgetFactory().createCCombo(composite, SWT.BORDER);
		comboStereotypeAppearance.add("Text");
		comboStereotypeAppearance.add("Icon");
		comboStereotypeAppearance.add("Text and Icon");
		comboStereotypeAppearance.add("Shape");
		data = new FormData();
		data.left = new FormAttachment(0, 135);
		data.top = new FormAttachment(0, 0);
		comboStereotypeAppearance.setLayoutData(data);

		comboStereotypeAppearanceListener = new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				if (diagramElement != null) {
					if (((View) (diagramElement)).getElement() != null) {

						org.eclipse.uml2.uml.Element elt = (Element) ((View) (diagramElement)).getElement();
						boolean hasIcons = ElementUtil.hasIcons(elt);
						boolean hasShapes = ElementUtil.hasShapes(elt);
						String appliedStereotypeKind = VisualInformationPapyrusConstant.STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION;
						if (comboStereotypeAppearance.getText().equals("Text")) {
							appliedStereotypeKind = VisualInformationPapyrusConstant.STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION;
						} else if (comboStereotypeAppearance.getText().equals("Icon") && hasIcons) {
							appliedStereotypeKind = VisualInformationPapyrusConstant.ICON_STEREOTYPE_PRESENTATION;
						} else if (comboStereotypeAppearance.getText().equals("Text and Icon") && hasIcons) {
							appliedStereotypeKind = VisualInformationPapyrusConstant.TEXT_ICON_STEREOTYPE_PRESENTATION;
						} else if (comboStereotypeAppearance.getText().equals("Shape") && hasShapes) {
							appliedStereotypeKind = VisualInformationPapyrusConstant.IMAGE_STEREOTYPE_PRESENTATION;
						}
						String stereotypetoDisplay = AppliedStereotypeHelper.getStereotypesToDisplay(diagramElement);
						RecordingCommand command = AppliedStereotypeHelper.getAppliedStereotypeToDisplayCommand(domain, diagramElement, stereotypetoDisplay, appliedStereotypeKind);
						domain.getCommandStack().execute(command);
						refresh();
						refresh();
					}
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		};
		comboStereotypeAppearance.addSelectionListener(comboStereotypeAppearanceListener);

		stereotypeTextAlignement = getWidgetFactory().createCLabel(composite, "Text Alignement:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(comboStereotypeAppearance, 40);
		data.top = new FormAttachment(comboStereotypeAppearance, 1, SWT.CENTER);
		stereotypeTextAlignement.setLayoutData(data);

		comboStereotypeAlignement = getWidgetFactory().createCCombo(composite, SWT.BORDER);
		comboStereotypeAlignement.add("Horizontal");
		comboStereotypeAlignement.add("Vertical");
		data = new FormData();
		data.left = new FormAttachment(stereotypeTextAlignement, 0);
		data.top = new FormAttachment(0, 0);
		comboStereotypeAlignement.setLayoutData(data);

		comboStereotypeAlignementListener = new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				if (diagramElement != null) {
					if (((View) (diagramElement)).getElement() != null) {

						String appliedStereotypeKind = VisualInformationPapyrusConstant.STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION;
						if (comboStereotypeAlignement.getText().equals("Horizontal")) {
							appliedStereotypeKind = VisualInformationPapyrusConstant.STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION;
						} else if (comboStereotypeAlignement.getText().equals("Vertical")) {
							appliedStereotypeKind = VisualInformationPapyrusConstant.STEREOTYPE_TEXT_VERTICAL_PRESENTATION;
						}
						String stereotypetoDisplay = AppliedStereotypeHelper.getStereotypesToDisplay(diagramElement);
						RecordingCommand command = AppliedStereotypeHelper.getAppliedStereotypeToDisplayCommand(domain, diagramElement, stereotypetoDisplay, appliedStereotypeKind);
						domain.getCommandStack().execute(command);
						refresh();
					}
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		};
		comboStereotypeAlignement.addSelectionListener(comboStereotypeAlignementListener);

		stereotypeAppearance = getWidgetFactory().createCLabel(composite, "Stereotype Appearance:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(comboStereotypeAppearance, 0);
		data.top = new FormAttachment(comboStereotypeAppearance, 1, SWT.CENTER);
		stereotypeAppearance.setLayoutData(data);
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Assert.isTrue(selection instanceof IStructuredSelection);
		Object input = ((IStructuredSelection) selection).getFirstElement();

		if (input instanceof GraphicalEditPart && ((GraphicalEditPart) input).getModel() instanceof View) {
			diagramElement = (EModelElement) ((GraphicalEditPart) input).getModel();
		} else {
			// re-init the diagram element. Else, could cause a bug,
			// when the user selects a diagram element, then a non diagram element.
			// If display button is pressed, the "Toggle Display" button does not work correctly
			diagramElement = null;
		}
		// When the selection is computed from the outline, get the associated editor
		if (part instanceof ContentOutline) {
			IContributedContentsView contributedView = ((IContributedContentsView) ((ContentOutline) part).getAdapter(IContributedContentsView.class));
			if (contributedView != null) {
				part = (IWorkbenchPart) contributedView.getContributingPart();
			}
		}
		if (part instanceof IMultiDiagramEditor) {
			IMultiDiagramEditor editor = (IMultiDiagramEditor) part;
			BackboneContext backbone = editor.getDefaultContext();
			domain = editor.getDefaultContext().getTransactionalEditingDomain();
		} else
			domain = null;
	}

	/**
	 * Refresh.
	 */
	@Override
	public void refresh() {
		if ((!comboStereotypeAppearance.isDisposed()) && (!comboStereotypeAlignement.isDisposed())) {

			comboStereotypeAppearance.removeSelectionListener(comboStereotypeAppearanceListener);
			comboStereotypeAlignement.removeSelectionListener(comboStereotypeAlignementListener);

			if (diagramElement != null) {
				if (((View) (diagramElement)).getElement() != null && ((Element) ((View) (diagramElement)).getElement()).getAppliedStereotypes().size() != 0) {
					comboStereotypeAppearance.setEnabled(true);
					comboStereotypeAlignement.setEnabled(true);

					final String stereotypePresentation = AppliedStereotypeHelper.getAppliedSterotypePresentationKind(diagramElement);

					if (stereotypePresentation != null) {

						org.eclipse.uml2.uml.Element elt = (Element) ((View) (diagramElement)).getElement();
						boolean hasIcons = ElementUtil.hasIcons(elt);
						boolean hasShapes = ElementUtil.hasShapes(elt);

						if (stereotypePresentation.equals(VisualInformationPapyrusConstant.ICON_STEREOTYPE_PRESENTATION) && hasIcons) {
							comboStereotypeAlignement.setEnabled(false);
							comboStereotypeAppearance.setText("Icon");
						} else if (stereotypePresentation.equals(VisualInformationPapyrusConstant.TEXT_ICON_STEREOTYPE_PRESENTATION) && hasIcons) {
							comboStereotypeAlignement.setEnabled(true);
							comboStereotypeAppearance.setText("Text and Icon");
						} else if (stereotypePresentation.equals(VisualInformationPapyrusConstant.IMAGE_STEREOTYPE_PRESENTATION) && hasShapes) {
							comboStereotypeAlignement.setEnabled(false);
							comboStereotypeAppearance.setText("Shape");
						} else {
							comboStereotypeAlignement.setEnabled(true);
							comboStereotypeAppearance.setText("Text");
						}

						if (stereotypePresentation.equals(VisualInformationPapyrusConstant.STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION)) {
							comboStereotypeAlignement.setText("Horizontal");
						} else if (stereotypePresentation.equals(VisualInformationPapyrusConstant.STEREOTYPE_TEXT_VERTICAL_PRESENTATION)) {
							comboStereotypeAlignement.setText("Vertical");
						} else {
							comboStereotypeAlignement.setText("Horizontal");
						}

					} else {
						comboStereotypeAppearance.setText("Text");
						comboStereotypeAlignement.setText("Horizontal");
					}

				} else {
					comboStereotypeAppearance.setText("");
					comboStereotypeAppearance.setEnabled(false);
					comboStereotypeAlignement.setText("");
					comboStereotypeAlignement.setEnabled(false);
				}
			}

			comboStereotypeAppearance.addSelectionListener(comboStereotypeAppearanceListener);
			comboStereotypeAlignement.addSelectionListener(comboStereotypeAlignementListener);

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cea.papyrus.core.ui.properties.tabbed.PropertyViewSection#dispose()
	 */
	/**
	 * 
	 */
	public void dispose() {
		super.dispose();
		if (comboStereotypeAppearance != null && !comboStereotypeAppearance.isDisposed())
			comboStereotypeAppearance.removeSelectionListener(comboStereotypeAppearanceListener);
		if (comboStereotypeAlignement != null && !comboStereotypeAlignement.isDisposed())
			comboStereotypeAlignement.removeSelectionListener(comboStereotypeAlignementListener);
	}
}
