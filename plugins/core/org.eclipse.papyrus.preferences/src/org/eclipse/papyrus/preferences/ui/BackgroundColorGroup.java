/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.preferences.ui;

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.preferences.Messages;
import org.eclipse.papyrus.preferences.jface.preference.GradientFieldEditor;
import org.eclipse.papyrus.preferences.utils.PreferenceConstantHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

/**
 * The Class BackgroundColorGroup.
 */
public class BackgroundColorGroup extends AbstractGroupComposite {

	/**
	 * @return the useGradientFillEditor
	 */
	public BooleanFieldEditor getUseGradientFillEditor() {
		return useGradientFillEditor;
	}

	/**
	 * @param useGradientFillEditor
	 *            the useGradientFillEditor to set
	 */
	protected void setUseGradientFillEditor(BooleanFieldEditor useGradientFillEditor) {
		this.useGradientFillEditor = useGradientFillEditor;
	}

	/**
	 * @return the gradientFillEditor
	 */
	public GradientFieldEditor getGradientFillEditor() {
		return gradientFillEditor;
	}

	/**
	 * @param gradientFillEditor
	 *            the gradientFillEditor to set
	 */
	protected void setGradientFillEditor(GradientFieldEditor gradientFillEditor) {
		this.gradientFillEditor = gradientFillEditor;
	}

	/**
	 * Instantiates a new background color group.
	 * 
	 * @param parent
	 *            the parent
	 */
	public BackgroundColorGroup(Composite parent, String title, DialogPage dialogPage) {
		super(parent, title, dialogPage);
		createContent(parent);
	}

	/** The use gradient fill editor. */
	private BooleanFieldEditor useGradientFillEditor;

	/** The gradient fill editor. */
	private GradientFieldEditor gradientFillEditor;

	/** The title. */

	/**
	 * Creates the content.
	 * 
	 * @param parent
	 *            the parent
	 */
	public void createContent(Composite parent) {

		Group fillColorGroup = new Group(parent, SWT.SHADOW_NONE);
		fillColorGroup.setLayout(new GridLayout(1, false));
		fillColorGroup.setText(Messages.AbstractPapyrusNodePreferencePage_Gradient);

		Composite useGradientCompo = new Composite(fillColorGroup, SWT.NULL);
		GridLayout gl = new GridLayout(2, false);
		gl.marginHeight = 0;
		useGradientCompo.setLayout(gl);

		Label useGradientLabel = new Label(useGradientCompo, SWT.NULL);
		useGradientLabel.setText(Messages.AbstractPapyrusNodePreferencePage_Activate);
		Composite useGradientFillEditorCompo = getEncapsulatedCompo(useGradientCompo);
		useGradientFillEditor = new BooleanFieldEditor(getPreferenceConstant(PreferenceConstantHelper.GRADIENT_POLICY),
				"", useGradientFillEditorCompo); //$NON-NLS-1$
		useGradientFillEditor.setPage(dialogPage);

		Composite gradientFillEditorCompo = getEncapsulatedCompo(fillColorGroup);
		gradientFillEditor = new GradientFieldEditor(getPreferenceConstant(PreferenceConstantHelper.COLOR_GRADIENT),
				gradientFillEditorCompo);
		gradientFillEditor.setPage(dialogPage);
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	public void setPreferenceStore(IPreferenceStore preferenceStore) {
		super.setPreferenceStore(preferenceStore);
		gradientFillEditor.setPreferenceStore(preferenceStore);
		useGradientFillEditor.setPreferenceStore(preferenceStore);
	}

	/**
	 * Gets the encapsulated compo.
	 * 
	 * @param parent
	 *            the parent
	 * 
	 * @return the encapsulated compo
	 */
	protected Composite getEncapsulatedCompo(Composite parent) {
		Composite compo = new Composite(parent, SWT.NONE);
		compo.setLayout(new GridLayout());
		return compo;
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	public void load() {
		useGradientFillEditor.load();
		gradientFillEditor.load();
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	public void storePreferences() {
		useGradientFillEditor.store();
		gradientFillEditor.store();
	}

	@Override
	public void loadDefault() {
		useGradientFillEditor.loadDefault();
		gradientFillEditor.loadDefault();

	}
}
