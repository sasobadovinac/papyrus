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
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.connectionpointreference.editor.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class UMLConnectionPointReferenceGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ConnectionPointReferenceRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConnectionPointReferenceRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cEntryKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cEntryAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cEntryPseudostateCrossReference_0_1_0 = (CrossReference)cEntryAssignment_0_1.eContents().get(0);
		private final RuleCall cEntryPseudostateIDTerminalRuleCall_0_1_0_1 = (RuleCall)cEntryPseudostateCrossReference_0_1_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cCommaKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cEntryAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final CrossReference cEntryPseudostateCrossReference_0_2_1_0 = (CrossReference)cEntryAssignment_0_2_1.eContents().get(0);
		private final RuleCall cEntryPseudostateIDTerminalRuleCall_0_2_1_0_1 = (RuleCall)cEntryPseudostateCrossReference_0_2_1_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cExitKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExitAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cExitPseudostateCrossReference_1_1_0 = (CrossReference)cExitAssignment_1_1.eContents().get(0);
		private final RuleCall cExitPseudostateIDTerminalRuleCall_1_1_0_1 = (RuleCall)cExitPseudostateCrossReference_1_1_0.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cExitAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final CrossReference cExitPseudostateCrossReference_1_2_1_0 = (CrossReference)cExitAssignment_1_2_1.eContents().get(0);
		private final RuleCall cExitPseudostateIDTerminalRuleCall_1_2_1_0_1 = (RuleCall)cExitPseudostateCrossReference_1_2_1_0.eContents().get(1);
		
		//ConnectionPointReferenceRule:
		//	("entry" entry+=[uml::Pseudostate] ("," entry+=[uml::Pseudostate])* | "exit" exit+=[uml::Pseudostate] (","
		//	exit+=[uml::Pseudostate])*)?;
		public ParserRule getRule() { return rule; }

		//("entry" entry+=[uml::Pseudostate] ("," entry+=[uml::Pseudostate])* | "exit" exit+=[uml::Pseudostate] (","
		//exit+=[uml::Pseudostate])*)?
		public Alternatives getAlternatives() { return cAlternatives; }

		//"entry" entry+=[uml::Pseudostate] ("," entry+=[uml::Pseudostate])*
		public Group getGroup_0() { return cGroup_0; }

		//"entry"
		public Keyword getEntryKeyword_0_0() { return cEntryKeyword_0_0; }

		//entry+=[uml::Pseudostate]
		public Assignment getEntryAssignment_0_1() { return cEntryAssignment_0_1; }

		//[uml::Pseudostate]
		public CrossReference getEntryPseudostateCrossReference_0_1_0() { return cEntryPseudostateCrossReference_0_1_0; }

		//ID
		public RuleCall getEntryPseudostateIDTerminalRuleCall_0_1_0_1() { return cEntryPseudostateIDTerminalRuleCall_0_1_0_1; }

		//("," entry+=[uml::Pseudostate])*
		public Group getGroup_0_2() { return cGroup_0_2; }

		//","
		public Keyword getCommaKeyword_0_2_0() { return cCommaKeyword_0_2_0; }

		//entry+=[uml::Pseudostate]
		public Assignment getEntryAssignment_0_2_1() { return cEntryAssignment_0_2_1; }

		//[uml::Pseudostate]
		public CrossReference getEntryPseudostateCrossReference_0_2_1_0() { return cEntryPseudostateCrossReference_0_2_1_0; }

		//ID
		public RuleCall getEntryPseudostateIDTerminalRuleCall_0_2_1_0_1() { return cEntryPseudostateIDTerminalRuleCall_0_2_1_0_1; }

		//"exit" exit+=[uml::Pseudostate] ("," exit+=[uml::Pseudostate])*
		public Group getGroup_1() { return cGroup_1; }

		//"exit"
		public Keyword getExitKeyword_1_0() { return cExitKeyword_1_0; }

		//exit+=[uml::Pseudostate]
		public Assignment getExitAssignment_1_1() { return cExitAssignment_1_1; }

		//[uml::Pseudostate]
		public CrossReference getExitPseudostateCrossReference_1_1_0() { return cExitPseudostateCrossReference_1_1_0; }

		//ID
		public RuleCall getExitPseudostateIDTerminalRuleCall_1_1_0_1() { return cExitPseudostateIDTerminalRuleCall_1_1_0_1; }

		//("," exit+=[uml::Pseudostate])*
		public Group getGroup_1_2() { return cGroup_1_2; }

		//","
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }

		//exit+=[uml::Pseudostate]
		public Assignment getExitAssignment_1_2_1() { return cExitAssignment_1_2_1; }

		//[uml::Pseudostate]
		public CrossReference getExitPseudostateCrossReference_1_2_1_0() { return cExitPseudostateCrossReference_1_2_1_0; }

		//ID
		public RuleCall getExitPseudostateIDTerminalRuleCall_1_2_1_0_1() { return cExitPseudostateIDTerminalRuleCall_1_2_1_0_1; }
	}
	
	
	private ConnectionPointReferenceRuleElements pConnectionPointReferenceRule;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public UMLConnectionPointReferenceGrammarAccess(GrammarProvider grammarProvider,
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

	
	//ConnectionPointReferenceRule:
	//	("entry" entry+=[uml::Pseudostate] ("," entry+=[uml::Pseudostate])* | "exit" exit+=[uml::Pseudostate] (","
	//	exit+=[uml::Pseudostate])*)?;
	public ConnectionPointReferenceRuleElements getConnectionPointReferenceRuleAccess() {
		return (pConnectionPointReferenceRule != null) ? pConnectionPointReferenceRule : (pConnectionPointReferenceRule = new ConnectionPointReferenceRuleElements());
	}
	
	public ParserRule getConnectionPointReferenceRuleRule() {
		return getConnectionPointReferenceRuleAccess().getRule();
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
