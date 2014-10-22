/*
 * generated by Xtext
 */
package org.eclipse.papyrus.uml.textedit.parameter.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.services.UmlParameterGrammarAccess;

public class UmlParameterParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {

	@Inject
	private UmlParameterGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}

	@Override
	protected org.eclipse.papyrus.uml.textedit.parameter.xtext.parser.antlr.internal.InternalUmlParameterParser createParser(XtextTokenStream stream) {
		return new org.eclipse.papyrus.uml.textedit.parameter.xtext.parser.antlr.internal.InternalUmlParameterParser(stream, getGrammarAccess());
	}

	@Override
	protected String getDefaultRuleName() {
		return "ParameterRule";
	}

	public UmlParameterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UmlParameterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

}
