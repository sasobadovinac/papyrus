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
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.message.editor.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.papyrus.message.editor.xtext.services.UmlMessageGrammarAccess;

public class UmlMessageParser extends AbstractContentAssistParser {
	
	@Inject
	private UmlMessageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.papyrus.message.editor.xtext.ui.contentassist.antlr.internal.InternalUmlMessageParser createParser() {
		org.eclipse.papyrus.message.editor.xtext.ui.contentassist.antlr.internal.InternalUmlMessageParser result = new org.eclipse.papyrus.message.editor.xtext.ui.contentassist.antlr.internal.InternalUmlMessageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRecurrenceRuleAccess().getAlternatives(), "rule__RecurrenceRule__Alternatives");
					put(grammarAccess.getMessageRuleAccess().getGroup(), "rule__MessageRule__Group__0");
					put(grammarAccess.getMessageRuleAccess().getGroup_1(), "rule__MessageRule__Group_1__0");
					put(grammarAccess.getSequenceTermRuleAccess().getGroup(), "rule__SequenceTermRule__Group__0");
					put(grammarAccess.getRecurrenceRuleAccess().getGroup_0(), "rule__RecurrenceRule__Group_0__0");
					put(grammarAccess.getRecurrenceRuleAccess().getGroup_1(), "rule__RecurrenceRule__Group_1__0");
					put(grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_0(), "rule__MessageRule__SequenceTermAssignment_0");
					put(grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_1_1(), "rule__MessageRule__SequenceTermAssignment_1_1");
					put(grammarAccess.getMessageRuleAccess().getNameAssignment_3(), "rule__MessageRule__NameAssignment_3");
					put(grammarAccess.getSequenceTermRuleAccess().getSequencialOrderAssignment_0(), "rule__SequenceTermRule__SequencialOrderAssignment_0");
					put(grammarAccess.getSequenceTermRuleAccess().getSequenceNameAssignment_1(), "rule__SequenceTermRule__SequenceNameAssignment_1");
					put(grammarAccess.getSequenceTermRuleAccess().getRecurrenceAssignment_2(), "rule__SequenceTermRule__RecurrenceAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.papyrus.message.editor.xtext.ui.contentassist.antlr.internal.InternalUmlMessageParser typedParser = (org.eclipse.papyrus.message.editor.xtext.ui.contentassist.antlr.internal.InternalUmlMessageParser) parser;
			typedParser.entryRuleMessageRule();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public UmlMessageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(UmlMessageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
