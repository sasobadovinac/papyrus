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

package org.eclipse.papyrus.message.editor.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class UmlMessageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MessageRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MessageRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSequenceTermAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSequenceTermSequenceTermRuleParserRuleCall_0_0 = (RuleCall)cSequenceTermAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSequenceTermAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSequenceTermSequenceTermRuleParserRuleCall_1_1_0 = (RuleCall)cSequenceTermAssignment_1_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameNameRuleTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//MessageRule:
		//	sequenceTerm+=SequenceTermRule ("." sequenceTerm+=SequenceTermRule)* ":" name=nameRule;
		public ParserRule getRule() { return rule; }

		//sequenceTerm+=SequenceTermRule ("." sequenceTerm+=SequenceTermRule)* ":" name=nameRule
		public Group getGroup() { return cGroup; }

		//sequenceTerm+=SequenceTermRule
		public Assignment getSequenceTermAssignment_0() { return cSequenceTermAssignment_0; }

		//SequenceTermRule
		public RuleCall getSequenceTermSequenceTermRuleParserRuleCall_0_0() { return cSequenceTermSequenceTermRuleParserRuleCall_0_0; }

		//("." sequenceTerm+=SequenceTermRule)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//sequenceTerm+=SequenceTermRule
		public Assignment getSequenceTermAssignment_1_1() { return cSequenceTermAssignment_1_1; }

		//SequenceTermRule
		public RuleCall getSequenceTermSequenceTermRuleParserRuleCall_1_1_0() { return cSequenceTermSequenceTermRuleParserRuleCall_1_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//name=nameRule
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//nameRule
		public RuleCall getNameNameRuleTerminalRuleCall_3_0() { return cNameNameRuleTerminalRuleCall_3_0; }
	}

	public class SequenceTermRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceTermRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSequencialOrderAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSequencialOrderINTTerminalRuleCall_0_0 = (RuleCall)cSequencialOrderAssignment_0.eContents().get(0);
		private final Assignment cSequenceNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSequenceNameIDTerminalRuleCall_1_0 = (RuleCall)cSequenceNameAssignment_1.eContents().get(0);
		private final Assignment cRecurrenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRecurrenceRecurrenceRuleParserRuleCall_2_0 = (RuleCall)cRecurrenceAssignment_2.eContents().get(0);
		
		////('.' leftTerms += LeftSequenceTermRule)*
		//SequenceTermRule:
		//	sequencialOrder= //represents the sequential order of the Message within the next higher level of procedural calling
		//	INT sequenceName=ID? // represents a concurrent thread of control. Messages that differ in the final name are concurrent at that level of nesting
		//	recurrence=RecurrenceRule? // The recurrence represents conditional or iterative execution.
		//;
		public ParserRule getRule() { return rule; }

		//sequencialOrder= //represents the sequential order of the Message within the next higher level of procedural calling
		//INT sequenceName=ID? // represents a concurrent thread of control. Messages that differ in the final name are concurrent at that level of nesting
		//recurrence=RecurrenceRule? // The recurrence represents conditional or iterative execution.
		public Group getGroup() { return cGroup; }

		//sequencialOrder= //represents the sequential order of the Message within the next higher level of procedural calling
		//INT
		public Assignment getSequencialOrderAssignment_0() { return cSequencialOrderAssignment_0; }

		////represents the sequential order of the Message within the next higher level of procedural calling
		//INT
		public RuleCall getSequencialOrderINTTerminalRuleCall_0_0() { return cSequencialOrderINTTerminalRuleCall_0_0; }

		//sequenceName=ID?
		public Assignment getSequenceNameAssignment_1() { return cSequenceNameAssignment_1; }

		//ID
		public RuleCall getSequenceNameIDTerminalRuleCall_1_0() { return cSequenceNameIDTerminalRuleCall_1_0; }

		//recurrence=RecurrenceRule?
		public Assignment getRecurrenceAssignment_2() { return cRecurrenceAssignment_2; }

		//RecurrenceRule
		public RuleCall getRecurrenceRecurrenceRuleParserRuleCall_2_0() { return cRecurrenceRecurrenceRuleParserRuleCall_2_0; }
	}

	public class RecurrenceRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RecurrenceRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cAsteriskKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		////terminal STRING :
		////( '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\') | !('\\'|'"') )* ;
		/// * messagename= sequenceterm ('.' sequenceterm)* (':' name);
		//terminal name:
		//('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
		//terminal sequenceterm:
		//(INT)(name)?(recurrence)?;
		//terminal recurrence:
		//('*''[' STRING ']')|('[' STRING ']'); 
		//
		//sequenceTerm1 = SequenceTermRule
		//('.' sequenceTerm2 = SequenceTermRule )* 
		//
		// * /RecurrenceRule returns ecore::EString:
		//	"*" "[" STRING "]" | "[" STRING "]";
		public ParserRule getRule() { return rule; }

		//"*" "[" STRING "]" | "[" STRING "]"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"*" "[" STRING "]"
		public Group getGroup_0() { return cGroup_0; }

		//"*"
		public Keyword getAsteriskKeyword_0_0() { return cAsteriskKeyword_0_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0_1() { return cLeftSquareBracketKeyword_0_1; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0_2() { return cSTRINGTerminalRuleCall_0_2; }

		//"]"
		public Keyword getRightSquareBracketKeyword_0_3() { return cRightSquareBracketKeyword_0_3; }

		//"[" STRING "]"
		public Group getGroup_1() { return cGroup_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1_1() { return cSTRINGTerminalRuleCall_1_1; }

		//"]"
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
	}
	
	
	private MessageRuleElements pMessageRule;
	private SequenceTermRuleElements pSequenceTermRule;
	private TerminalRule tNameRule;
	private RecurrenceRuleElements pRecurrenceRule;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public UmlMessageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MessageRule:
	//	sequenceTerm+=SequenceTermRule ("." sequenceTerm+=SequenceTermRule)* ":" name=nameRule;
	public MessageRuleElements getMessageRuleAccess() {
		return (pMessageRule != null) ? pMessageRule : (pMessageRule = new MessageRuleElements());
	}
	
	public ParserRule getMessageRuleRule() {
		return getMessageRuleAccess().getRule();
	}

	////('.' leftTerms += LeftSequenceTermRule)*
	//SequenceTermRule:
	//	sequencialOrder= //represents the sequential order of the Message within the next higher level of procedural calling
	//	INT sequenceName=ID? // represents a concurrent thread of control. Messages that differ in the final name are concurrent at that level of nesting
	//	recurrence=RecurrenceRule? // The recurrence represents conditional or iterative execution.
	//;
	public SequenceTermRuleElements getSequenceTermRuleAccess() {
		return (pSequenceTermRule != null) ? pSequenceTermRule : (pSequenceTermRule = new SequenceTermRuleElements());
	}
	
	public ParserRule getSequenceTermRuleRule() {
		return getSequenceTermRuleAccess().getRule();
	}

	//terminal nameRule:
	//	("a".."z" | "A".."Z") ("a".."z" | "A".."Z" | "_" | "-" | "0".."9")*;
	public TerminalRule getNameRuleRule() {
		return (tNameRule != null) ? tNameRule : (tNameRule = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "nameRule"));
	} 

	////terminal STRING :
	////( '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\') | !('\\'|'"') )* ;
	/// * messagename= sequenceterm ('.' sequenceterm)* (':' name);
	//terminal name:
	//('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	//terminal sequenceterm:
	//(INT)(name)?(recurrence)?;
	//terminal recurrence:
	//('*''[' STRING ']')|('[' STRING ']'); 
	//
	//sequenceTerm1 = SequenceTermRule
	//('.' sequenceTerm2 = SequenceTermRule )* 
	//
	// * /RecurrenceRule returns ecore::EString:
	//	"*" "[" STRING "]" | "[" STRING "]";
	public RecurrenceRuleElements getRecurrenceRuleAccess() {
		return (pRecurrenceRule != null) ? pRecurrenceRule : (pRecurrenceRule = new RecurrenceRuleElements());
	}
	
	public ParserRule getRecurrenceRuleRule() {
		return getRecurrenceRuleAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
