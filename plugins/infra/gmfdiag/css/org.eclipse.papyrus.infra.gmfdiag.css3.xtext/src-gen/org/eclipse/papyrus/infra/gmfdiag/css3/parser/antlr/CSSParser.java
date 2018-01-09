/*
 * generated by Xtext
 */
package org.eclipse.papyrus.infra.gmfdiag.css3.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.papyrus.infra.gmfdiag.css3.services.CSSGrammarAccess;

public class CSSParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {

	@Inject
	private CSSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
	}

	@Override
	protected org.eclipse.papyrus.infra.gmfdiag.css3.parser.antlr.internal.InternalCSSParser createParser(XtextTokenStream stream) {
		return new org.eclipse.papyrus.infra.gmfdiag.css3.parser.antlr.internal.InternalCSSParser(stream, getGrammarAccess());
	}

	@Override
	protected String getDefaultRuleName() {
		return "stylesheet";
	}

	public CSSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CSSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

}
