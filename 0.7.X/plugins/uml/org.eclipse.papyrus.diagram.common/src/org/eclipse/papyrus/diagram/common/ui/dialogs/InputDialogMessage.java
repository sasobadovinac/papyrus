/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.ui.dialogs;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.papyrus.diagram.common.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


/**
 * This class provides a text area, with a validator to edit a text
 */
public class InputDialogMessage extends InputDialog {

	/** the warning icon */
	private static final String ICON_WARNING = "/icons/warning.gif"; //$NON-NLS-1$

	/** Input text widget. */

	private Text text;


	/** Error message label widget. */
	private CLabel warningMessageText;

	/** Error message string. */

	private String warningMessage;


	/** Input Validator, can be null */
	private final IInputValidator validator;

	/**
	 * Constructor.
	 * 
	 * @param parentShell
	 */
	protected InputDialogMessage(Shell parentShell, String dialogTitle, String errorMessage, String initialValue, IInputValidator validator) {
		super(parentShell, dialogTitle, errorMessage, initialValue);
		this.validator = validator;
	}


	/**
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 * 
	 */
	@Override
	protected void okPressed() {
		setValue(text.getText());
		super.okPressed();
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		text.setFocus();
		if(getValue() != null) {
			text.setText(getValue());
			text.selectAll();
		}
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.diagram.common.ui.dialogs.InputDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 * 
	 * @param parent
	 * @return
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		// create composite
		Composite composite = (Composite)super.createDialogArea(parent);

		text = new Text(composite, getInputTextStyle());
		text.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});
		warningMessageText = new CLabel(composite, SWT.READ_ONLY | SWT.WRAP);
		warningMessageText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		warningMessageText.setBackground(warningMessageText.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
		// Set the error message text
		// See https://bugs.eclipse.org/bugs/show_bug.cgi?id=66292
		setWarningMessage(warningMessage);

		applyDialogFont(composite);
		return composite;
	}

	/**
	 * Returns the text area.
	 * 
	 * @return the text area
	 */
	protected Text getText() {
		return text;
	}

	/**
	 * Returns the validator.
	 * 
	 * @return the validator
	 */
	protected IInputValidator getValidator() {
		return validator;
	}

	/**
	 * Validates the input.
	 * <p>
	 * The default implementation of this framework method delegates the request to the supplied input validator object; if it finds the input
	 * invalid, the error message is displayed in the dialog's message line. This hook method is called whenever the text changes in the input field.
	 * </p>
	 */
	protected void validateInput() {
		String errorMessage = null;
		if(validator != null) {
			errorMessage = validator.isValid(text.getText());
		}
		// Bug 16256: important not to treat "" (blank error) the same as null
		// (no error)
		setWarningMessage(errorMessage);
	}

	/**
	 * Set the warning message
	 * 
	 * @param errorMessage
	 */
	public void setWarningMessage(String errorMessage) {
		this.warningMessage = errorMessage;
		if((warningMessageText != null) && !warningMessageText.isDisposed()) {
			Image errorImage = Activator.getPluginIconImage(Activator.ID, ICON_WARNING);
			warningMessageText.setImage(errorMessage == null ? null : errorImage);
			warningMessageText.setText(errorMessage == null ? "" : errorMessage); //$NON-NLS-1$
			warningMessageText.getParent().update();
			// Access the ok button by id, in case clients have overridden
			// button creation.
			// See https://bugs.eclipse.org/bugs/show_bug.cgi?id=113643


			//			Control button = getButton(IDialogConstants.OK_ID);
			//			if(button != null) {
			//				button.setEnabled(errorMessage == null);
			//			}
		}
	}


	/**
	 * Returns the style bits that should be used for the input text field.
	 * Defaults to a single line entry. Subclasses may override.
	 * 
	 * @return the integer style bits that should be used when creating the
	 *         input text
	 * 
	 * @since 3.4
	 */
	protected int getInputTextStyle() {
		return SWT.SINGLE | SWT.BORDER;
	}

}
