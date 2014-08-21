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
 *  Remi Schnekenburger (CEA LIST) Remi.Schnekenburger@cea.fr - Initial API and implementation
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - customization for Parameter
 *
 *****************************************************************************/
package org.eclipse.papyrus.parsers.modelgenerator;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.papyrus.parsers.PapyrusParsersPlugin;
import org.eclipse.papyrus.parsers.antlr.ParameterLabelLexer;
import org.eclipse.papyrus.parsers.antlr.ParameterLabelParser;
import org.eclipse.papyrus.parsers.util.SimpleStringErrorReporter;
import org.eclipse.papyrus.parsers.util.TypeRecognitionException;
import org.eclipse.uml2.uml.Parameter;

public class ParameterGenerator {

	/** The Parameter to modify */
	private Parameter parameter;

	/** Error reporter for lexer and parser generated by antlr */
	private SimpleStringErrorReporter reporter;

	/**
	 * Default Constructor.
	 *
	 * @param parameter
	 *            the Parameter to modify
	 */
	public ParameterGenerator(Parameter parameter) {
		this.parameter = parameter;
		this.reporter = new SimpleStringErrorReporter();
	}

	/**
	 * Parse the label of the Parameter and modify Parameter attributes.
	 *
	 * @param label
	 *            the label that defines the Parameter
	 */
	public void parseAndModifyParameter(String label) {
		try {
			ParameterLabelLexer lexer = new ParameterLabelLexer(new ANTLRStringStream(label));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ParameterLabelParser parser = new ParameterLabelParser(tokens, parameter, new SimpleStringErrorReporter());
			parser.label();
		} catch (RecognitionException e) {
			PapyrusParsersPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, PapyrusParsersPlugin.PLUGIN_ID, IStatus.OK, "could not parse the parameter label: " + label, e));
		} catch (RuntimeException e) {
			PapyrusParsersPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, PapyrusParsersPlugin.PLUGIN_ID, IStatus.OK, "could not parse the parameter label: " + label, e));
		}
	}

	/**
	 * Parse the label of the Parameter and validate it.
	 *
	 * @param label
	 *            the label that defines the Parameter
	 *
	 * @return null if label is valid, else return the message that describes the error.
	 */
	public String parseAndValidateParameter(String label) {

		// To validate the message : parse it.
		// If no errors are detected, it is ok. If exceptions : not ok.
		// Returns the exception message
		ParameterLabelLexer lexer = new ParameterLabelLexer(new ANTLRStringStream(label));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ParameterLabelParser parser = new ParameterLabelParser(tokens, parameter, reporter);
		parser.setValidation(true);
		try {
			parser.label();
		} catch (MismatchedTokenException e) {
			PapyrusParsersPlugin.logError("context:" + parser.getContext());
		} catch (RecognitionException e) {
			reporter.setMessage(e.getLocalizedMessage());
		} catch (RuntimeException e) {
			reporter.setMessage(e.getLocalizedMessage());
		}
		return reporter.getMessage();
	}

	/**
	 * Parse the label of the Parameter, and generates an exception if does not validate.
	 *
	 * @param label
	 *            the label that defines the Parameter
	 *
	 * @return null if label is valid, else return the message that describes the error.
	 */
	public String parseUndefinedParameterType(String label) {

		// To validate the message : parse it.
		// If no errors are detected, it is ok. If exceptions are detected : not ok.
		// Returns the exception message
		ParameterLabelLexer lexer = new ParameterLabelLexer(new ANTLRStringStream(label));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ParameterLabelParser parser = new ParameterLabelParser(tokens, parameter, new SimpleStringErrorReporter());
		parser.setValidation(true);
		try {
			parser.label();
		} catch (RecognitionException re) {

		} catch (RuntimeException tse) {
			if (tse instanceof TypeRecognitionException) {
				return ((TypeRecognitionException) tse).getTypeName();
			}
		}
		return null;
	}
}
