/*
* generated by Xtext
*/
grammar InternalUmlState;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipse.papyrus.uml.textedit.state.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.papyrus.uml.textedit.state.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.papyrus.uml.textedit.state.xtext.services.UmlStateGrammarAccess;

}

@parser::members {
 
 	private UmlStateGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(UmlStateGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleStateRule
entryRuleStateRule 
:
{ before(grammarAccess.getStateRuleRule()); }
	 ruleStateRule
{ after(grammarAccess.getStateRuleRule()); } 
	 EOF 
;

// Rule StateRule
ruleStateRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStateRuleAccess().getGroup()); }
(rule__StateRule__Group__0)
{ after(grammarAccess.getStateRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSubmachineRule
entryRuleSubmachineRule 
:
{ before(grammarAccess.getSubmachineRuleRule()); }
	 ruleSubmachineRule
{ after(grammarAccess.getSubmachineRuleRule()); } 
	 EOF 
;

// Rule SubmachineRule
ruleSubmachineRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSubmachineRuleAccess().getGroup()); }
(rule__SubmachineRule__Group__0)
{ after(grammarAccess.getSubmachineRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntryRule
entryRuleEntryRule 
:
{ before(grammarAccess.getEntryRuleRule()); }
	 ruleEntryRule
{ after(grammarAccess.getEntryRuleRule()); } 
	 EOF 
;

// Rule EntryRule
ruleEntryRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntryRuleAccess().getGroup()); }
(rule__EntryRule__Group__0)
{ after(grammarAccess.getEntryRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDoRule
entryRuleDoRule 
:
{ before(grammarAccess.getDoRuleRule()); }
	 ruleDoRule
{ after(grammarAccess.getDoRuleRule()); } 
	 EOF 
;

// Rule DoRule
ruleDoRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDoRuleAccess().getGroup()); }
(rule__DoRule__Group__0)
{ after(grammarAccess.getDoRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExitRule
entryRuleExitRule 
:
{ before(grammarAccess.getExitRuleRule()); }
	 ruleExitRule
{ after(grammarAccess.getExitRuleRule()); } 
	 EOF 
;

// Rule ExitRule
ruleExitRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExitRuleAccess().getGroup()); }
(rule__ExitRule__Group__0)
{ after(grammarAccess.getExitRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule BehaviorKind
ruleBehaviorKind
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviorKindAccess().getAlternatives()); }
(rule__BehaviorKind__Alternatives)
{ after(grammarAccess.getBehaviorKindAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__BehaviorKind__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBehaviorKindAccess().getACTIVITYEnumLiteralDeclaration_0()); }
(	'Activity' 
)
{ after(grammarAccess.getBehaviorKindAccess().getACTIVITYEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getBehaviorKindAccess().getSTATE_MACHINEEnumLiteralDeclaration_1()); }
(	'StateMachine' 
)
{ after(grammarAccess.getBehaviorKindAccess().getSTATE_MACHINEEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getBehaviorKindAccess().getOPAQUE_BEHAVIOREnumLiteralDeclaration_2()); }
(	'OpaqueBehavior' 
)
{ after(grammarAccess.getBehaviorKindAccess().getOPAQUE_BEHAVIOREnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__StateRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__Group__0__Impl
	rule__StateRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getNameAssignment_0()); }
(rule__StateRule__NameAssignment_0)
{ after(grammarAccess.getStateRuleAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StateRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__Group__1__Impl
	rule__StateRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getGroup_1()); }
(rule__StateRule__Group_1__0)?
{ after(grammarAccess.getStateRuleAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StateRule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getUnorderedGroup_2()); }
(rule__StateRule__UnorderedGroup_2)
{ after(grammarAccess.getStateRuleAccess().getUnorderedGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__StateRule__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__Group_1__0__Impl
	rule__StateRule__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getColonKeyword_1_0()); }

	':' 

{ after(grammarAccess.getStateRuleAccess().getColonKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StateRule__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getSubmachineAssignment_1_1()); }
(rule__StateRule__SubmachineAssignment_1_1)
{ after(grammarAccess.getStateRuleAccess().getSubmachineAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SubmachineRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SubmachineRule__Group__0__Impl
	rule__SubmachineRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubmachineRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubmachineRuleAccess().getPathAssignment_0()); }
(rule__SubmachineRule__PathAssignment_0)?
{ after(grammarAccess.getSubmachineRuleAccess().getPathAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SubmachineRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SubmachineRule__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubmachineRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubmachineRuleAccess().getSubmachineAssignment_1()); }
(rule__SubmachineRule__SubmachineAssignment_1)
{ after(grammarAccess.getSubmachineRuleAccess().getSubmachineAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getPathAssignment_0()); }
(rule__QualifiedName__PathAssignment_0)
{ after(grammarAccess.getQualifiedNameAccess().getPathAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
	rule__QualifiedName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1()); }

	'::' 

{ after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2()); }
(rule__QualifiedName__RemainingAssignment_2)?
{ after(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__EntryRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntryRule__Group__0__Impl
	rule__EntryRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntryRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntryRuleAccess().getEntryKeyword_0()); }

	'entry' 

{ after(grammarAccess.getEntryRuleAccess().getEntryKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntryRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntryRule__Group__1__Impl
	rule__EntryRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntryRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntryRuleAccess().getKindAssignment_1()); }
(rule__EntryRule__KindAssignment_1)
{ after(grammarAccess.getEntryRuleAccess().getKindAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntryRule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntryRule__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntryRule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntryRuleAccess().getBehaviorNameAssignment_2()); }
(rule__EntryRule__BehaviorNameAssignment_2)
{ after(grammarAccess.getEntryRuleAccess().getBehaviorNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DoRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DoRule__Group__0__Impl
	rule__DoRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DoRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDoRuleAccess().getDoKeyword_0()); }

	'do' 

{ after(grammarAccess.getDoRuleAccess().getDoKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DoRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DoRule__Group__1__Impl
	rule__DoRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DoRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDoRuleAccess().getKindAssignment_1()); }
(rule__DoRule__KindAssignment_1)
{ after(grammarAccess.getDoRuleAccess().getKindAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DoRule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DoRule__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DoRule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDoRuleAccess().getBehaviorNameAssignment_2()); }
(rule__DoRule__BehaviorNameAssignment_2)
{ after(grammarAccess.getDoRuleAccess().getBehaviorNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ExitRule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExitRule__Group__0__Impl
	rule__ExitRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExitRule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExitRuleAccess().getExitKeyword_0()); }

	'exit' 

{ after(grammarAccess.getExitRuleAccess().getExitKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExitRule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExitRule__Group__1__Impl
	rule__ExitRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExitRule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExitRuleAccess().getKindAssignment_1()); }
(rule__ExitRule__KindAssignment_1)
{ after(grammarAccess.getExitRuleAccess().getKindAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ExitRule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ExitRule__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExitRule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExitRuleAccess().getBehaviorNameAssignment_2()); }
(rule__ExitRule__BehaviorNameAssignment_2)
{ after(grammarAccess.getExitRuleAccess().getBehaviorNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__StateRule__UnorderedGroup_2
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getStateRuleAccess().getUnorderedGroup_2());
    }
:
	rule__StateRule__UnorderedGroup_2__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getStateRuleAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}


rule__StateRule__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateRuleAccess().getUnorderedGroup_2(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStateRuleAccess().getUnorderedGroup_2(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStateRuleAccess().getEntryAssignment_2_0()); }
						(rule__StateRule__EntryAssignment_2_0)
						{ after(grammarAccess.getStateRuleAccess().getEntryAssignment_2_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateRuleAccess().getUnorderedGroup_2(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStateRuleAccess().getUnorderedGroup_2(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStateRuleAccess().getDoAssignment_2_1()); }
						(rule__StateRule__DoAssignment_2_1)
						{ after(grammarAccess.getStateRuleAccess().getDoAssignment_2_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateRuleAccess().getUnorderedGroup_2(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStateRuleAccess().getUnorderedGroup_2(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStateRuleAccess().getExitAssignment_2_2()); }
						(rule__StateRule__ExitAssignment_2_2)
						{ after(grammarAccess.getStateRuleAccess().getExitAssignment_2_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateRuleAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}


rule__StateRule__UnorderedGroup_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__UnorderedGroup_2__Impl
	rule__StateRule__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__StateRule__UnorderedGroup_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__UnorderedGroup_2__Impl
	rule__StateRule__UnorderedGroup_2__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__StateRule__UnorderedGroup_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StateRule__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__StateRule__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getStateRuleAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__SubmachineAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getSubmachineSubmachineRuleParserRuleCall_1_1_0()); }
	ruleSubmachineRule{ after(grammarAccess.getStateRuleAccess().getSubmachineSubmachineRuleParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__EntryAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getEntryEntryRuleParserRuleCall_2_0_0()); }
	ruleEntryRule{ after(grammarAccess.getStateRuleAccess().getEntryEntryRuleParserRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__DoAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getDoDoRuleParserRuleCall_2_1_0()); }
	ruleDoRule{ after(grammarAccess.getStateRuleAccess().getDoDoRuleParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StateRule__ExitAssignment_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateRuleAccess().getExitExitRuleParserRuleCall_2_2_0()); }
	ruleExitRule{ after(grammarAccess.getStateRuleAccess().getExitExitRuleParserRuleCall_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SubmachineRule__PathAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubmachineRuleAccess().getPathQualifiedNameParserRuleCall_0_0()); }
	ruleQualifiedName{ after(grammarAccess.getSubmachineRuleAccess().getPathQualifiedNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SubmachineRule__SubmachineAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubmachineRuleAccess().getSubmachineStateMachineCrossReference_1_0()); }
(
{ before(grammarAccess.getSubmachineRuleAccess().getSubmachineStateMachineIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getSubmachineRuleAccess().getSubmachineStateMachineIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getSubmachineRuleAccess().getSubmachineStateMachineCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__PathAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0()); }
(
{ before(grammarAccess.getQualifiedNameAccess().getPathNamespaceIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getQualifiedNameAccess().getPathNamespaceIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__RemainingAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0()); }
	ruleQualifiedName{ after(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntryRule__KindAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntryRuleAccess().getKindBehaviorKindEnumRuleCall_1_0()); }
	ruleBehaviorKind{ after(grammarAccess.getEntryRuleAccess().getKindBehaviorKindEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntryRule__BehaviorNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntryRuleAccess().getBehaviorNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getEntryRuleAccess().getBehaviorNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DoRule__KindAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDoRuleAccess().getKindBehaviorKindEnumRuleCall_1_0()); }
	ruleBehaviorKind{ after(grammarAccess.getDoRuleAccess().getKindBehaviorKindEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DoRule__BehaviorNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDoRuleAccess().getBehaviorNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getDoRuleAccess().getBehaviorNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExitRule__KindAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExitRuleAccess().getKindBehaviorKindEnumRuleCall_1_0()); }
	ruleBehaviorKind{ after(grammarAccess.getExitRuleAccess().getKindBehaviorKindEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ExitRule__BehaviorNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExitRuleAccess().getBehaviorNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getExitRuleAccess().getBehaviorNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


