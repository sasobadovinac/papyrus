/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
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

package org.eclipse.papyrus.alf.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AlfGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class UnitDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnitDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0 = (RuleCall)cNamespaceDeclarationAssignment_0.eContents().get(0);
		private final Assignment cImportDeclarationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportDeclarationsImportDeclarationParserRuleCall_1_0 = (RuleCall)cImportDeclarationsAssignment_1.eContents().get(0);
		private final Assignment cCommentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_2_0 = (RuleCall)cCommentAssignment_2.eContents().get(0);
		private final Assignment cStereotypeAnnotationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_3_0 = (RuleCall)cStereotypeAnnotationsAssignment_3.eContents().get(0);
		private final Assignment cNamesapceDefinitionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNamesapceDefinitionNamespaceDefinitionParserRuleCall_4_0 = (RuleCall)cNamesapceDefinitionAssignment_4.eContents().get(0);
		
		//UnitDefinition:
		//
		//	namespaceDeclaration=NamespaceDeclaration? importDeclarations+=ImportDeclaration* comment=ML_COMMENT?
		//
		//	/ *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations namesapceDefinition=NamespaceDefinition;
		public ParserRule getRule() { return rule; }

		//namespaceDeclaration=NamespaceDeclaration? importDeclarations+=ImportDeclaration* comment=ML_COMMENT?
		//
		/// *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations namesapceDefinition=NamespaceDefinition
		public Group getGroup() { return cGroup; }

		//namespaceDeclaration=NamespaceDeclaration?
		public Assignment getNamespaceDeclarationAssignment_0() { return cNamespaceDeclarationAssignment_0; }

		//NamespaceDeclaration
		public RuleCall getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0() { return cNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0; }

		//importDeclarations+=ImportDeclaration*
		public Assignment getImportDeclarationsAssignment_1() { return cImportDeclarationsAssignment_1; }

		//ImportDeclaration
		public RuleCall getImportDeclarationsImportDeclarationParserRuleCall_1_0() { return cImportDeclarationsImportDeclarationParserRuleCall_1_0; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_2() { return cCommentAssignment_2; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_2_0() { return cCommentML_COMMENTTerminalRuleCall_2_0; }

		//stereotypeAnnotations=StereotypeAnnotations
		public Assignment getStereotypeAnnotationsAssignment_3() { return cStereotypeAnnotationsAssignment_3; }

		//StereotypeAnnotations
		public RuleCall getStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_3_0() { return cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_3_0; }

		//namesapceDefinition=NamespaceDefinition
		public Assignment getNamesapceDefinitionAssignment_4() { return cNamesapceDefinitionAssignment_4; }

		//NamespaceDefinition
		public RuleCall getNamesapceDefinitionNamespaceDefinitionParserRuleCall_4_0() { return cNamesapceDefinitionNamespaceDefinitionParserRuleCall_4_0; }
	}

	public class BOOLEAN_LITERALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BOOLEAN_LITERAL");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueBOOLEAN_VALUETerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		/// *********************************
		//
		// * PrimitiveLiterals
		//
		// ********************************** / BOOLEAN_LITERAL:
		//
		//	value=BOOLEAN_VALUE;
		public ParserRule getRule() { return rule; }

		//value=BOOLEAN_VALUE
		public Assignment getValueAssignment() { return cValueAssignment; }

		//BOOLEAN_VALUE
		public RuleCall getValueBOOLEAN_VALUETerminalRuleCall_0() { return cValueBOOLEAN_VALUETerminalRuleCall_0; }
	}

	public class NUMBER_LITERALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NUMBER_LITERAL");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTEGER_LITERALParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUNLIMITED_NATURALParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NUMBER_LITERAL:
		//
		//	INTEGER_LITERAL | UNLIMITED_NATURAL;
		public ParserRule getRule() { return rule; }

		//INTEGER_LITERAL | UNLIMITED_NATURAL
		public Alternatives getAlternatives() { return cAlternatives; }

		//INTEGER_LITERAL
		public RuleCall getINTEGER_LITERALParserRuleCall_0() { return cINTEGER_LITERALParserRuleCall_0; }

		//UNLIMITED_NATURAL
		public RuleCall getUNLIMITED_NATURALParserRuleCall_1() { return cUNLIMITED_NATURALParserRuleCall_1; }
	}

	public class INTEGER_LITERALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER_LITERAL");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTEGER_VALUETerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//INTEGER_LITERAL:
		//
		//	value=INTEGER_VALUE;
		public ParserRule getRule() { return rule; }

		//value=INTEGER_VALUE
		public Assignment getValueAssignment() { return cValueAssignment; }

		//INTEGER_VALUE
		public RuleCall getValueINTEGER_VALUETerminalRuleCall_0() { return cValueINTEGER_VALUETerminalRuleCall_0; }
	}

	public class UNLIMITED_NATURALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UNLIMITED_NATURAL");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueAsteriskKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//UNLIMITED_NATURAL:
		//
		//	value="*";
		public ParserRule getRule() { return rule; }

		//value="*"
		public Assignment getValueAssignment() { return cValueAssignment; }

		//"*"
		public Keyword getValueAsteriskKeyword_0() { return cValueAsteriskKeyword_0; }
	}

	public class STRING_LITERALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "STRING_LITERAL");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//STRING_LITERAL:
		//
		//	value=STRING;
		public ParserRule getRule() { return rule; }

		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}

	public class StereotypeAnnotationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StereotypeAnnotations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStereotypeAnnotationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAnnotationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnnotationStereotypeAnnotationParserRuleCall_1_0 = (RuleCall)cAnnotationAssignment_1.eContents().get(0);
		
		/// *********
		//
		// * UNITS *
		//
		// ********* / StereotypeAnnotations:
		//
		//	{StereotypeAnnotations} annotation+=StereotypeAnnotation*;
		public ParserRule getRule() { return rule; }

		//{StereotypeAnnotations} annotation+=StereotypeAnnotation*
		public Group getGroup() { return cGroup; }

		//{StereotypeAnnotations}
		public Action getStereotypeAnnotationsAction_0() { return cStereotypeAnnotationsAction_0; }

		//annotation+=StereotypeAnnotation*
		public Assignment getAnnotationAssignment_1() { return cAnnotationAssignment_1; }

		//StereotypeAnnotation
		public RuleCall getAnnotationStereotypeAnnotationParserRuleCall_1_0() { return cAnnotationStereotypeAnnotationParserRuleCall_1_0; }
	}

	public class StereotypeAnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StereotypeAnnotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStereotypeNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStereotypeNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cStereotypeNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTaggedValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTaggedValuesTaggedValuesParserRuleCall_2_1_0 = (RuleCall)cTaggedValuesAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//StereotypeAnnotation:
		//
		//	"@" stereotypeName=QualifiedName ("(" taggedValues=TaggedValues ")")?;
		public ParserRule getRule() { return rule; }

		//"@" stereotypeName=QualifiedName ("(" taggedValues=TaggedValues ")")?
		public Group getGroup() { return cGroup; }

		//"@"
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }

		//stereotypeName=QualifiedName
		public Assignment getStereotypeNameAssignment_1() { return cStereotypeNameAssignment_1; }

		//QualifiedName
		public RuleCall getStereotypeNameQualifiedNameParserRuleCall_1_0() { return cStereotypeNameQualifiedNameParserRuleCall_1_0; }

		//("(" taggedValues=TaggedValues ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//taggedValues=TaggedValues
		public Assignment getTaggedValuesAssignment_2_1() { return cTaggedValuesAssignment_2_1; }

		//TaggedValues
		public RuleCall getTaggedValuesTaggedValuesParserRuleCall_2_1_0() { return cTaggedValuesTaggedValuesParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}

	public class TaggedValuesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TaggedValues");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cQualifiedNameListParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTaggedValueListParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TaggedValues:
		//
		//	QualifiedNameList | TaggedValueList;
		public ParserRule getRule() { return rule; }

		//QualifiedNameList | TaggedValueList
		public Alternatives getAlternatives() { return cAlternatives; }

		//QualifiedNameList
		public RuleCall getQualifiedNameListParserRuleCall_0() { return cQualifiedNameListParserRuleCall_0; }

		//TaggedValueList
		public RuleCall getTaggedValueListParserRuleCall_1() { return cTaggedValueListParserRuleCall_1; }
	}

	public class TaggedValueListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TaggedValueList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTaggedValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTaggedValueTaggedValueParserRuleCall_0_0 = (RuleCall)cTaggedValueAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTaggedValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTaggedValueTaggedValueParserRuleCall_1_1_0 = (RuleCall)cTaggedValueAssignment_1_1.eContents().get(0);
		
		//TaggedValueList:
		//
		//	taggedValue+=TaggedValue ("," taggedValue+=TaggedValue)*;
		public ParserRule getRule() { return rule; }

		//taggedValue+=TaggedValue ("," taggedValue+=TaggedValue)*
		public Group getGroup() { return cGroup; }

		//taggedValue+=TaggedValue
		public Assignment getTaggedValueAssignment_0() { return cTaggedValueAssignment_0; }

		//TaggedValue
		public RuleCall getTaggedValueTaggedValueParserRuleCall_0_0() { return cTaggedValueTaggedValueParserRuleCall_0_0; }

		//("," taggedValue+=TaggedValue)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//taggedValue+=TaggedValue
		public Assignment getTaggedValueAssignment_1_1() { return cTaggedValueAssignment_1_1; }

		//TaggedValue
		public RuleCall getTaggedValueTaggedValueParserRuleCall_1_1_0() { return cTaggedValueTaggedValueParserRuleCall_1_1_0; }
	}

	public class PRIMITIVE_LITERALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PRIMITIVE_LITERAL");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBOOLEAN_LITERALParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNUMBER_LITERALParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSTRING_LITERALParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//PRIMITIVE_LITERAL:
		//
		//	BOOLEAN_LITERAL | NUMBER_LITERAL | STRING_LITERAL;
		public ParserRule getRule() { return rule; }

		//BOOLEAN_LITERAL | NUMBER_LITERAL | STRING_LITERAL
		public Alternatives getAlternatives() { return cAlternatives; }

		//BOOLEAN_LITERAL
		public RuleCall getBOOLEAN_LITERALParserRuleCall_0() { return cBOOLEAN_LITERALParserRuleCall_0; }

		//NUMBER_LITERAL
		public RuleCall getNUMBER_LITERALParserRuleCall_1() { return cNUMBER_LITERALParserRuleCall_1; }

		//STRING_LITERAL
		public RuleCall getSTRING_LITERALParserRuleCall_2() { return cSTRING_LITERALParserRuleCall_2; }
	}

	public class TaggedValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TaggedValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValuePRIMITIVE_LITERALParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//TaggedValue:
		//
		//	name=Name "=>" value=PRIMITIVE_LITERAL;
		public ParserRule getRule() { return rule; }

		//name=Name "=>" value=PRIMITIVE_LITERAL
		public Group getGroup() { return cGroup; }

		//name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }

		//value=PRIMITIVE_LITERAL
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//PRIMITIVE_LITERAL
		public RuleCall getValuePRIMITIVE_LITERALParserRuleCall_2_0() { return cValuePRIMITIVE_LITERALParserRuleCall_2_0; }
	}

	public class NamespaceDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamespaceDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cQualifiedNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//NamespaceDeclaration:
		//
		//	"namespace" qualifiedName=QualifiedName ";";
		public ParserRule getRule() { return rule; }

		//"namespace" qualifiedName=QualifiedName ";"
		public Group getGroup() { return cGroup; }

		//"namespace"
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }

		//qualifiedName=QualifiedName
		public Assignment getQualifiedNameAssignment_1() { return cQualifiedNameAssignment_1; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_1_0() { return cQualifiedNameQualifiedNameParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class ImportDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ImportDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVisibilityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVisibilityImportVisibilityIndicatorEnumRuleCall_0_0 = (RuleCall)cVisibilityAssignment_0.eContents().get(0);
		private final Keyword cImportKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImportReferenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportReferenceImportReferenceParserRuleCall_2_0 = (RuleCall)cImportReferenceAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ImportDeclaration:
		//
		//	visibility=ImportVisibilityIndicator "import" importReference=ImportReference ";";
		public ParserRule getRule() { return rule; }

		//visibility=ImportVisibilityIndicator "import" importReference=ImportReference ";"
		public Group getGroup() { return cGroup; }

		//visibility=ImportVisibilityIndicator
		public Assignment getVisibilityAssignment_0() { return cVisibilityAssignment_0; }

		//ImportVisibilityIndicator
		public RuleCall getVisibilityImportVisibilityIndicatorEnumRuleCall_0_0() { return cVisibilityImportVisibilityIndicatorEnumRuleCall_0_0; }

		//"import"
		public Keyword getImportKeyword_1() { return cImportKeyword_1; }

		//importReference=ImportReference
		public Assignment getImportReferenceAssignment_2() { return cImportReferenceAssignment_2; }

		//ImportReference
		public RuleCall getImportReferenceImportReferenceParserRuleCall_2_0() { return cImportReferenceImportReferenceParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ImportReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ImportReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cCompletionAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cCompletionImportReferenceQualifiedNameCompletionParserRuleCall_1_0_0 = (RuleCall)cCompletionAssignment_1_0.eContents().get(0);
		private final Assignment cAliasAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cAliasAliasDefinitionParserRuleCall_1_1_0 = (RuleCall)cAliasAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cColonColonKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cStarAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final Keyword cStarAsteriskKeyword_1_2_1_0 = (Keyword)cStarAssignment_1_2_1.eContents().get(0);
		
		////ImportReference : 
		//
		////  ( colonQualifiedName = ColonQualifiedName ( '::' '*' | alias = AliasDefinition )?) 
		//
		////| ( dotQualifiedName = DotQualifiedName ( '.' '*' | alias = AliasDefinition )?) 
		//
		////| ( name = Name ( ( '::' | '.' ) '*' | alias = AliasDefinition )?)
		//
		////;
		//
		//ImportReference:
		//
		//	name=Name (completion=ImportReferenceQualifiedNameCompletion | alias=AliasDefinition | "::" star?="*")?;
		public ParserRule getRule() { return rule; }

		//name=Name (completion=ImportReferenceQualifiedNameCompletion | alias=AliasDefinition | "::" star?="*")?
		public Group getGroup() { return cGroup; }

		//name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//(completion=ImportReferenceQualifiedNameCompletion | alias=AliasDefinition | "::" star?="*")?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//completion=ImportReferenceQualifiedNameCompletion
		public Assignment getCompletionAssignment_1_0() { return cCompletionAssignment_1_0; }

		//ImportReferenceQualifiedNameCompletion
		public RuleCall getCompletionImportReferenceQualifiedNameCompletionParserRuleCall_1_0_0() { return cCompletionImportReferenceQualifiedNameCompletionParserRuleCall_1_0_0; }

		//alias=AliasDefinition
		public Assignment getAliasAssignment_1_1() { return cAliasAssignment_1_1; }

		//AliasDefinition
		public RuleCall getAliasAliasDefinitionParserRuleCall_1_1_0() { return cAliasAliasDefinitionParserRuleCall_1_1_0; }

		//"::" star?="*"
		public Group getGroup_1_2() { return cGroup_1_2; }

		//"::"
		public Keyword getColonColonKeyword_1_2_0() { return cColonColonKeyword_1_2_0; }

		//star?="*"
		public Assignment getStarAssignment_1_2_1() { return cStarAssignment_1_2_1; }

		//"*"
		public Keyword getStarAsteriskKeyword_1_2_1_0() { return cStarAsteriskKeyword_1_2_1_0; }
	}

	public class ImportReferenceQualifiedNameCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ImportReferenceQualifiedNameCompletion");
		private final RuleCall cColonQualifiedNameCompletionOfImportReferenceParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ImportReferenceQualifiedNameCompletion: //| DotQualifiedNameCompletionOfImportReference
		//
		//	ColonQualifiedNameCompletionOfImportReference;
		public ParserRule getRule() { return rule; }

		////| DotQualifiedNameCompletionOfImportReference
		//
		//ColonQualifiedNameCompletionOfImportReference
		public RuleCall getColonQualifiedNameCompletionOfImportReferenceParserRuleCall() { return cColonQualifiedNameCompletionOfImportReferenceParserRuleCall; }
	}

	public class ColonQualifiedNameCompletionOfImportReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ColonQualifiedNameCompletionOfImportReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColonColonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_2_1_0 = (RuleCall)cNameAssignment_2_1.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cColonColonKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cStarAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final Keyword cStarAsteriskKeyword_3_0_1_0 = (Keyword)cStarAssignment_3_0_1.eContents().get(0);
		private final Assignment cAliasAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cAliasAliasDefinitionParserRuleCall_3_1_0 = (RuleCall)cAliasAssignment_3_1.eContents().get(0);
		
		//ColonQualifiedNameCompletionOfImportReference:
		//
		//	"::" name+=Name ("::" name+=Name)* ("::" star?="*" | alias=AliasDefinition)?;
		public ParserRule getRule() { return rule; }

		//"::" name+=Name ("::" name+=Name)* ("::" star?="*" | alias=AliasDefinition)?
		public Group getGroup() { return cGroup; }

		//"::"
		public Keyword getColonColonKeyword_0() { return cColonColonKeyword_0; }

		//name+=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }

		//("::" name+=Name)*
		public Group getGroup_2() { return cGroup_2; }

		//"::"
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }

		//name+=Name
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_2_1_0() { return cNameNameParserRuleCall_2_1_0; }

		//("::" star?="*" | alias=AliasDefinition)?
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//"::" star?="*"
		public Group getGroup_3_0() { return cGroup_3_0; }

		//"::"
		public Keyword getColonColonKeyword_3_0_0() { return cColonColonKeyword_3_0_0; }

		//star?="*"
		public Assignment getStarAssignment_3_0_1() { return cStarAssignment_3_0_1; }

		//"*"
		public Keyword getStarAsteriskKeyword_3_0_1_0() { return cStarAsteriskKeyword_3_0_1_0; }

		//alias=AliasDefinition
		public Assignment getAliasAssignment_3_1() { return cAliasAssignment_3_1; }

		//AliasDefinition
		public RuleCall getAliasAliasDefinitionParserRuleCall_3_1_0() { return cAliasAliasDefinitionParserRuleCall_3_1_0; }
	}

	public class AliasDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AliasDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAliasAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAliasNameParserRuleCall_1_0 = (RuleCall)cAliasAssignment_1.eContents().get(0);
		
		////DotQualifiedNameCompletionOfImportReference :
		//
		////	'.' name+=Name (('.' name+=Name)* ('.' star ?='*' | alias = AliasDefinition)) ?
		//
		////;
		//
		//AliasDefinition:
		//
		//	"as" alias=Name;
		public ParserRule getRule() { return rule; }

		//"as" alias=Name
		public Group getGroup() { return cGroup; }

		//"as"
		public Keyword getAsKeyword_0() { return cAsKeyword_0; }

		//alias=Name
		public Assignment getAliasAssignment_1() { return cAliasAssignment_1; }

		//Name
		public RuleCall getAliasNameParserRuleCall_1_0() { return cAliasNameParserRuleCall_1_0; }
	}

	public class NamespaceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamespaceDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClassifierDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		/// * NAMESPACES * / NamespaceDefinition:
		//
		//	PackageDefinition | ClassifierDefinition;
		public ParserRule getRule() { return rule; }

		//PackageDefinition | ClassifierDefinition
		public Alternatives getAlternatives() { return cAlternatives; }

		//PackageDefinition
		public RuleCall getPackageDefinitionParserRuleCall_0() { return cPackageDefinitionParserRuleCall_0; }

		//ClassifierDefinition
		public RuleCall getClassifierDefinitionParserRuleCall_1() { return cClassifierDefinitionParserRuleCall_1; }
	}

	public class VisibilityIndicatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VisibilityIndicator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPUBLICAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cPUBLICPublicKeyword_0_0 = (Keyword)cPUBLICAssignment_0.eContents().get(0);
		private final Assignment cPRIVATEAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cPRIVATEPrivateKeyword_1_0 = (Keyword)cPRIVATEAssignment_1.eContents().get(0);
		private final Assignment cPROTECTEDAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cPROTECTEDProtectedKeyword_2_0 = (Keyword)cPROTECTEDAssignment_2.eContents().get(0);
		
		//VisibilityIndicator:
		//
		//	PUBLIC="public" | PRIVATE="private" | PROTECTED="protected";
		public ParserRule getRule() { return rule; }

		//PUBLIC="public" | PRIVATE="private" | PROTECTED="protected"
		public Alternatives getAlternatives() { return cAlternatives; }

		//PUBLIC="public"
		public Assignment getPUBLICAssignment_0() { return cPUBLICAssignment_0; }

		//"public"
		public Keyword getPUBLICPublicKeyword_0_0() { return cPUBLICPublicKeyword_0_0; }

		//PRIVATE="private"
		public Assignment getPRIVATEAssignment_1() { return cPRIVATEAssignment_1; }

		//"private"
		public Keyword getPRIVATEPrivateKeyword_1_0() { return cPRIVATEPrivateKeyword_1_0; }

		//PROTECTED="protected"
		public Assignment getPROTECTEDAssignment_2() { return cPROTECTEDAssignment_2; }

		//"protected"
		public Keyword getPROTECTEDProtectedKeyword_2_0() { return cPROTECTEDProtectedKeyword_2_0; }
	}

	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// * PACKAGES * / PackageDeclaration:
		//
		//	"package" name=Name;
		public ParserRule getRule() { return rule; }

		//"package" name=Name
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }
	}

	public class PackageDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDeclarationPackageDeclarationParserRuleCall_0_0 = (RuleCall)cDeclarationAssignment_0.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyPackageBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		
		//PackageDefinition:
		//
		//	declaration=PackageDeclaration body=PackageBody;
		public ParserRule getRule() { return rule; }

		//declaration=PackageDeclaration body=PackageBody
		public Group getGroup() { return cGroup; }

		//declaration=PackageDeclaration
		public Assignment getDeclarationAssignment_0() { return cDeclarationAssignment_0; }

		//PackageDeclaration
		public RuleCall getDeclarationPackageDeclarationParserRuleCall_0_0() { return cDeclarationPackageDeclarationParserRuleCall_0_0; }

		//body=PackageBody
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }

		//PackageBody
		public RuleCall getBodyPackageBodyParserRuleCall_1_0() { return cBodyPackageBodyParserRuleCall_1_0; }
	}

	public class PackageDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDeclarationPackageDeclarationParserRuleCall_0_0 = (RuleCall)cDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cBodyPackageBodyParserRuleCall_1_1_0 = (RuleCall)cBodyAssignment_1_1.eContents().get(0);
		
		//PackageDefinitionOrStub:
		//
		//	declaration=PackageDeclaration (";" | body=PackageBody);
		public ParserRule getRule() { return rule; }

		//declaration=PackageDeclaration (";" | body=PackageBody)
		public Group getGroup() { return cGroup; }

		//declaration=PackageDeclaration
		public Assignment getDeclarationAssignment_0() { return cDeclarationAssignment_0; }

		//PackageDeclaration
		public RuleCall getDeclarationPackageDeclarationParserRuleCall_0_0() { return cDeclarationPackageDeclarationParserRuleCall_0_0; }

		//";" | body=PackageBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//body=PackageBody
		public Assignment getBodyAssignment_1_1() { return cBodyAssignment_1_1; }

		//PackageBody
		public RuleCall getBodyPackageBodyParserRuleCall_1_1_0() { return cBodyPackageBodyParserRuleCall_1_1_0; }
	}

	public class PackageBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPackageBodyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPackagedElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPackagedElementPackagedElementParserRuleCall_2_0 = (RuleCall)cPackagedElementAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//PackageBody:
		//
		//	{PackageBody} "{" packagedElement+=PackagedElement* "}";
		public ParserRule getRule() { return rule; }

		//{PackageBody} "{" packagedElement+=PackagedElement* "}"
		public Group getGroup() { return cGroup; }

		//{PackageBody}
		public Action getPackageBodyAction_0() { return cPackageBodyAction_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//packagedElement+=PackagedElement*
		public Assignment getPackagedElementAssignment_2() { return cPackagedElementAssignment_2; }

		//PackagedElement
		public RuleCall getPackagedElementPackagedElementParserRuleCall_2_0() { return cPackagedElementPackagedElementParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class PackagedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackagedElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cStereotypeAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0 = (RuleCall)cStereotypeAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cImportVisibilityIndicatorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportVisibilityIndicatorImportVisibilityIndicatorEnumRuleCall_2_0 = (RuleCall)cImportVisibilityIndicatorAssignment_2.eContents().get(0);
		private final Assignment cPackagedElementDefinitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPackagedElementDefinitionPackagedElementDefinitionParserRuleCall_3_0 = (RuleCall)cPackagedElementDefinitionAssignment_3.eContents().get(0);
		
		//PackagedElement:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//	importVisibilityIndicator=ImportVisibilityIndicator packagedElementDefinition=PackagedElementDefinition;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//importVisibilityIndicator=ImportVisibilityIndicator packagedElementDefinition=PackagedElementDefinition
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//stereotypeAnnotations=StereotypeAnnotations
		public Assignment getStereotypeAnnotationsAssignment_1() { return cStereotypeAnnotationsAssignment_1; }

		//StereotypeAnnotations
		public RuleCall getStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0() { return cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0; }

		//importVisibilityIndicator=ImportVisibilityIndicator
		public Assignment getImportVisibilityIndicatorAssignment_2() { return cImportVisibilityIndicatorAssignment_2; }

		//ImportVisibilityIndicator
		public RuleCall getImportVisibilityIndicatorImportVisibilityIndicatorEnumRuleCall_2_0() { return cImportVisibilityIndicatorImportVisibilityIndicatorEnumRuleCall_2_0; }

		//packagedElementDefinition=PackagedElementDefinition
		public Assignment getPackagedElementDefinitionAssignment_3() { return cPackagedElementDefinitionAssignment_3; }

		//PackagedElementDefinition
		public RuleCall getPackagedElementDefinitionPackagedElementDefinitionParserRuleCall_3_0() { return cPackagedElementDefinitionPackagedElementDefinitionParserRuleCall_3_0; }
	}

	public class PackagedElementDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackagedElementDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDefinitionOrStubParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClassifierDefinitionOrStubParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PackagedElementDefinition:
		//
		//	PackageDefinitionOrStub | ClassifierDefinitionOrStub;
		public ParserRule getRule() { return rule; }

		//PackageDefinitionOrStub | ClassifierDefinitionOrStub
		public Alternatives getAlternatives() { return cAlternatives; }

		//PackageDefinitionOrStub
		public RuleCall getPackageDefinitionOrStubParserRuleCall_0() { return cPackageDefinitionOrStubParserRuleCall_0; }

		//ClassifierDefinitionOrStub
		public RuleCall getClassifierDefinitionOrStubParserRuleCall_1() { return cClassifierDefinitionOrStubParserRuleCall_1; }
	}

	public class ClassifierDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassifierDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cActiveClassDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDataTypeDefinitionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEnumerationDefinitionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cAssociationDefinitionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cSignalDefinitionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cActivityDefinitionParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		/// ***************
		//
		// * CLASSIFIERS *
		//
		// *************** / ClassifierDefinition:
		//
		//	ClassDefinition | ActiveClassDefinition | DataTypeDefinition | EnumerationDefinition | AssociationDefinition |
		//
		//	SignalDefinition | ActivityDefinition;
		public ParserRule getRule() { return rule; }

		//ClassDefinition | ActiveClassDefinition | DataTypeDefinition | EnumerationDefinition | AssociationDefinition |
		//
		//SignalDefinition | ActivityDefinition
		public Alternatives getAlternatives() { return cAlternatives; }

		//ClassDefinition
		public RuleCall getClassDefinitionParserRuleCall_0() { return cClassDefinitionParserRuleCall_0; }

		//ActiveClassDefinition
		public RuleCall getActiveClassDefinitionParserRuleCall_1() { return cActiveClassDefinitionParserRuleCall_1; }

		//DataTypeDefinition
		public RuleCall getDataTypeDefinitionParserRuleCall_2() { return cDataTypeDefinitionParserRuleCall_2; }

		//EnumerationDefinition
		public RuleCall getEnumerationDefinitionParserRuleCall_3() { return cEnumerationDefinitionParserRuleCall_3; }

		//AssociationDefinition
		public RuleCall getAssociationDefinitionParserRuleCall_4() { return cAssociationDefinitionParserRuleCall_4; }

		//SignalDefinition
		public RuleCall getSignalDefinitionParserRuleCall_5() { return cSignalDefinitionParserRuleCall_5; }

		//ActivityDefinition
		public RuleCall getActivityDefinitionParserRuleCall_6() { return cActivityDefinitionParserRuleCall_6; }
	}

	public class ClassifierDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassifierDefinitionOrStub");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassDefinitionOrStubParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cActiveClassDefinitionOrStubParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDataTypeDefinitionOrStubParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEnumerationDefinitionOrStubParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cAssociationDefinitionOrStubParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cSignalDefinitionOrStubParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cActivityDefinitionOrStubParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//ClassifierDefinitionOrStub:
		//
		//	ClassDefinitionOrStub | ActiveClassDefinitionOrStub | DataTypeDefinitionOrStub | EnumerationDefinitionOrStub |
		//
		//	AssociationDefinitionOrStub | SignalDefinitionOrStub | ActivityDefinitionOrStub;
		public ParserRule getRule() { return rule; }

		//ClassDefinitionOrStub | ActiveClassDefinitionOrStub | DataTypeDefinitionOrStub | EnumerationDefinitionOrStub |
		//
		//AssociationDefinitionOrStub | SignalDefinitionOrStub | ActivityDefinitionOrStub
		public Alternatives getAlternatives() { return cAlternatives; }

		//ClassDefinitionOrStub
		public RuleCall getClassDefinitionOrStubParserRuleCall_0() { return cClassDefinitionOrStubParserRuleCall_0; }

		//ActiveClassDefinitionOrStub
		public RuleCall getActiveClassDefinitionOrStubParserRuleCall_1() { return cActiveClassDefinitionOrStubParserRuleCall_1; }

		//DataTypeDefinitionOrStub
		public RuleCall getDataTypeDefinitionOrStubParserRuleCall_2() { return cDataTypeDefinitionOrStubParserRuleCall_2; }

		//EnumerationDefinitionOrStub
		public RuleCall getEnumerationDefinitionOrStubParserRuleCall_3() { return cEnumerationDefinitionOrStubParserRuleCall_3; }

		//AssociationDefinitionOrStub
		public RuleCall getAssociationDefinitionOrStubParserRuleCall_4() { return cAssociationDefinitionOrStubParserRuleCall_4; }

		//SignalDefinitionOrStub
		public RuleCall getSignalDefinitionOrStubParserRuleCall_5() { return cSignalDefinitionOrStubParserRuleCall_5; }

		//ActivityDefinitionOrStub
		public RuleCall getActivityDefinitionOrStubParserRuleCall_6() { return cActivityDefinitionOrStubParserRuleCall_6; }
	}

	public class ClassifierSignatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassifierSignature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTemplateParametersAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTemplateParametersTemplateParametersParserRuleCall_1_0 = (RuleCall)cTemplateParametersAssignment_1.eContents().get(0);
		private final Assignment cSpecializationClauseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpecializationClauseSpecializationClauseParserRuleCall_2_0 = (RuleCall)cSpecializationClauseAssignment_2.eContents().get(0);
		
		//ClassifierSignature:
		//
		//	name=Name templateParameters=TemplateParameters? specializationClause=SpecializationClause?;
		public ParserRule getRule() { return rule; }

		//name=Name templateParameters=TemplateParameters? specializationClause=SpecializationClause?
		public Group getGroup() { return cGroup; }

		//name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//templateParameters=TemplateParameters?
		public Assignment getTemplateParametersAssignment_1() { return cTemplateParametersAssignment_1; }

		//TemplateParameters
		public RuleCall getTemplateParametersTemplateParametersParserRuleCall_1_0() { return cTemplateParametersTemplateParametersParserRuleCall_1_0; }

		//specializationClause=SpecializationClause?
		public Assignment getSpecializationClauseAssignment_2() { return cSpecializationClauseAssignment_2; }

		//SpecializationClause
		public RuleCall getSpecializationClauseSpecializationClauseParserRuleCall_2_0() { return cSpecializationClauseSpecializationClauseParserRuleCall_2_0; }
	}

	public class TemplateParametersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TemplateParameters");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLessThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cClassifierTemplateParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClassifierTemplateParameterClassifierTemplateParameterParserRuleCall_1_0 = (RuleCall)cClassifierTemplateParameterAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cClassifierTemplateParameterAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cClassifierTemplateParameterClassifierTemplateParameterParserRuleCall_2_1_0 = (RuleCall)cClassifierTemplateParameterAssignment_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TemplateParameters:
		//
		//	"<" classifierTemplateParameter+=ClassifierTemplateParameter (","
		//
		//	classifierTemplateParameter+=ClassifierTemplateParameter)* ">";
		public ParserRule getRule() { return rule; }

		//"<" classifierTemplateParameter+=ClassifierTemplateParameter (","
		//
		//classifierTemplateParameter+=ClassifierTemplateParameter)* ">"
		public Group getGroup() { return cGroup; }

		//"<"
		public Keyword getLessThanSignKeyword_0() { return cLessThanSignKeyword_0; }

		//classifierTemplateParameter+=ClassifierTemplateParameter
		public Assignment getClassifierTemplateParameterAssignment_1() { return cClassifierTemplateParameterAssignment_1; }

		//ClassifierTemplateParameter
		public RuleCall getClassifierTemplateParameterClassifierTemplateParameterParserRuleCall_1_0() { return cClassifierTemplateParameterClassifierTemplateParameterParserRuleCall_1_0; }

		//("," classifierTemplateParameter+=ClassifierTemplateParameter)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//classifierTemplateParameter+=ClassifierTemplateParameter
		public Assignment getClassifierTemplateParameterAssignment_2_1() { return cClassifierTemplateParameterAssignment_2_1; }

		//ClassifierTemplateParameter
		public RuleCall getClassifierTemplateParameterClassifierTemplateParameterParserRuleCall_2_1_0() { return cClassifierTemplateParameterClassifierTemplateParameterParserRuleCall_2_1_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}

	public class ClassifierTemplateParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassifierTemplateParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSpecializesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_2_1_0 = (RuleCall)cQualifiedNameAssignment_2_1.eContents().get(0);
		
		//ClassifierTemplateParameter:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / name=Name ("specializes" qualifiedName=QualifiedName)?;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / name=Name ("specializes" qualifiedName=QualifiedName)?
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }

		//("specializes" qualifiedName=QualifiedName)?
		public Group getGroup_2() { return cGroup_2; }

		//"specializes"
		public Keyword getSpecializesKeyword_2_0() { return cSpecializesKeyword_2_0; }

		//qualifiedName=QualifiedName
		public Assignment getQualifiedNameAssignment_2_1() { return cQualifiedNameAssignment_2_1; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_2_1_0() { return cQualifiedNameQualifiedNameParserRuleCall_2_1_0; }
	}

	public class SpecializationClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SpecializationClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpecializesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQualifiedNameListAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQualifiedNameListQualifiedNameListParserRuleCall_1_0 = (RuleCall)cQualifiedNameListAssignment_1.eContents().get(0);
		
		//SpecializationClause:
		//
		//	"specializes" qualifiedNameList=QualifiedNameList;
		public ParserRule getRule() { return rule; }

		//"specializes" qualifiedNameList=QualifiedNameList
		public Group getGroup() { return cGroup; }

		//"specializes"
		public Keyword getSpecializesKeyword_0() { return cSpecializesKeyword_0; }

		//qualifiedNameList=QualifiedNameList
		public Assignment getQualifiedNameListAssignment_1() { return cQualifiedNameListAssignment_1; }

		//QualifiedNameList
		public RuleCall getQualifiedNameListQualifiedNameListParserRuleCall_1_0() { return cQualifiedNameListQualifiedNameListParserRuleCall_1_0; }
	}

	public class ClassDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsAbstractAbstractKeyword_0_0 = (Keyword)cIsAbstractAssignment_0.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassifierSignatureAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassifierSignatureClassifierSignatureParserRuleCall_2_0 = (RuleCall)cClassifierSignatureAssignment_2.eContents().get(0);
		
		/// * CLASSES * / ClassDeclaration:
		//
		//	isAbstract?="abstract"? "class" classifierSignature=ClassifierSignature;
		public ParserRule getRule() { return rule; }

		//isAbstract?="abstract"? "class" classifierSignature=ClassifierSignature
		public Group getGroup() { return cGroup; }

		//isAbstract?="abstract"?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }

		//"abstract"
		public Keyword getIsAbstractAbstractKeyword_0_0() { return cIsAbstractAbstractKeyword_0_0; }

		//"class"
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }

		//classifierSignature=ClassifierSignature
		public Assignment getClassifierSignatureAssignment_2() { return cClassifierSignatureAssignment_2; }

		//ClassifierSignature
		public RuleCall getClassifierSignatureClassifierSignatureParserRuleCall_2_0() { return cClassifierSignatureClassifierSignatureParserRuleCall_2_0; }
	}

	public class ClassDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cClassDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cClassDeclarationClassDeclarationParserRuleCall_0_0 = (RuleCall)cClassDeclarationAssignment_0.eContents().get(0);
		private final Assignment cClassBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClassBodyClassBodyParserRuleCall_1_0 = (RuleCall)cClassBodyAssignment_1.eContents().get(0);
		
		//ClassDefinition:
		//
		//	classDeclaration=ClassDeclaration classBody=ClassBody;
		public ParserRule getRule() { return rule; }

		//classDeclaration=ClassDeclaration classBody=ClassBody
		public Group getGroup() { return cGroup; }

		//classDeclaration=ClassDeclaration
		public Assignment getClassDeclarationAssignment_0() { return cClassDeclarationAssignment_0; }

		//ClassDeclaration
		public RuleCall getClassDeclarationClassDeclarationParserRuleCall_0_0() { return cClassDeclarationClassDeclarationParserRuleCall_0_0; }

		//classBody=ClassBody
		public Assignment getClassBodyAssignment_1() { return cClassBodyAssignment_1; }

		//ClassBody
		public RuleCall getClassBodyClassBodyParserRuleCall_1_0() { return cClassBodyClassBodyParserRuleCall_1_0; }
	}

	public class ClassDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cClassDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cClassDeclarationClassDeclarationParserRuleCall_0_0 = (RuleCall)cClassDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cClassBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cClassBodyClassBodyParserRuleCall_1_1_0 = (RuleCall)cClassBodyAssignment_1_1.eContents().get(0);
		
		//ClassDefinitionOrStub:
		//
		//	classDeclaration=ClassDeclaration (";" | classBody=ClassBody);
		public ParserRule getRule() { return rule; }

		//classDeclaration=ClassDeclaration (";" | classBody=ClassBody)
		public Group getGroup() { return cGroup; }

		//classDeclaration=ClassDeclaration
		public Assignment getClassDeclarationAssignment_0() { return cClassDeclarationAssignment_0; }

		//ClassDeclaration
		public RuleCall getClassDeclarationClassDeclarationParserRuleCall_0_0() { return cClassDeclarationClassDeclarationParserRuleCall_0_0; }

		//";" | classBody=ClassBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//classBody=ClassBody
		public Assignment getClassBodyAssignment_1_1() { return cClassBodyAssignment_1_1; }

		//ClassBody
		public RuleCall getClassBodyClassBodyParserRuleCall_1_1_0() { return cClassBodyClassBodyParserRuleCall_1_1_0; }
	}

	public class ClassBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cClassBodyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassMemberAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassMemberClassMemberParserRuleCall_2_0 = (RuleCall)cClassMemberAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ClassBody:
		//
		//	{ClassBody} "{" classMember+=ClassMember* "}";
		public ParserRule getRule() { return rule; }

		//{ClassBody} "{" classMember+=ClassMember* "}"
		public Group getGroup() { return cGroup; }

		//{ClassBody}
		public Action getClassBodyAction_0() { return cClassBodyAction_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//classMember+=ClassMember*
		public Assignment getClassMemberAssignment_2() { return cClassMemberAssignment_2; }

		//ClassMember
		public RuleCall getClassMemberClassMemberParserRuleCall_2_0() { return cClassMemberClassMemberParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class ClassMemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassMember");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cStereotypeAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0 = (RuleCall)cStereotypeAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cVisibilityIndicatorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVisibilityIndicatorVisibilityIndicatorParserRuleCall_2_0 = (RuleCall)cVisibilityIndicatorAssignment_2.eContents().get(0);
		private final Assignment cClassMemberDefinitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClassMemberDefinitionClassMemberDefinitionParserRuleCall_3_0 = (RuleCall)cClassMemberDefinitionAssignment_3.eContents().get(0);
		
		//ClassMember:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//	visibilityIndicator=VisibilityIndicator? classMemberDefinition=ClassMemberDefinition;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//visibilityIndicator=VisibilityIndicator? classMemberDefinition=ClassMemberDefinition
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//stereotypeAnnotations=StereotypeAnnotations
		public Assignment getStereotypeAnnotationsAssignment_1() { return cStereotypeAnnotationsAssignment_1; }

		//StereotypeAnnotations
		public RuleCall getStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0() { return cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0; }

		//visibilityIndicator=VisibilityIndicator?
		public Assignment getVisibilityIndicatorAssignment_2() { return cVisibilityIndicatorAssignment_2; }

		//VisibilityIndicator
		public RuleCall getVisibilityIndicatorVisibilityIndicatorParserRuleCall_2_0() { return cVisibilityIndicatorVisibilityIndicatorParserRuleCall_2_0; }

		//classMemberDefinition=ClassMemberDefinition
		public Assignment getClassMemberDefinitionAssignment_3() { return cClassMemberDefinitionAssignment_3; }

		//ClassMemberDefinition
		public RuleCall getClassMemberDefinitionClassMemberDefinitionParserRuleCall_3_0() { return cClassMemberDefinitionClassMemberDefinitionParserRuleCall_3_0; }
	}

	public class ClassMemberDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassMemberDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassifierDefinitionOrStubParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFeatureDefinitionOrStubParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ClassMemberDefinition:
		//
		//	ClassifierDefinitionOrStub | FeatureDefinitionOrStub;
		public ParserRule getRule() { return rule; }

		//ClassifierDefinitionOrStub | FeatureDefinitionOrStub
		public Alternatives getAlternatives() { return cAlternatives; }

		//ClassifierDefinitionOrStub
		public RuleCall getClassifierDefinitionOrStubParserRuleCall_0() { return cClassifierDefinitionOrStubParserRuleCall_0; }

		//FeatureDefinitionOrStub
		public RuleCall getFeatureDefinitionOrStubParserRuleCall_1() { return cFeatureDefinitionOrStubParserRuleCall_1; }
	}

	public class ActiveClassDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActiveClassDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsAbstractAbstractKeyword_0_0 = (Keyword)cIsAbstractAssignment_0.eContents().get(0);
		private final Keyword cActiveKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cClassKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cClassifierSignatureAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClassifierSignatureClassifierSignatureParserRuleCall_3_0 = (RuleCall)cClassifierSignatureAssignment_3.eContents().get(0);
		
		/// * ACTIVE CLASSES * / ActiveClassDeclaration:
		//
		//	isAbstract?="abstract"? "active" "class" classifierSignature=ClassifierSignature;
		public ParserRule getRule() { return rule; }

		//isAbstract?="abstract"? "active" "class" classifierSignature=ClassifierSignature
		public Group getGroup() { return cGroup; }

		//isAbstract?="abstract"?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }

		//"abstract"
		public Keyword getIsAbstractAbstractKeyword_0_0() { return cIsAbstractAbstractKeyword_0_0; }

		//"active"
		public Keyword getActiveKeyword_1() { return cActiveKeyword_1; }

		//"class"
		public Keyword getClassKeyword_2() { return cClassKeyword_2; }

		//classifierSignature=ClassifierSignature
		public Assignment getClassifierSignatureAssignment_3() { return cClassifierSignatureAssignment_3; }

		//ClassifierSignature
		public RuleCall getClassifierSignatureClassifierSignatureParserRuleCall_3_0() { return cClassifierSignatureClassifierSignatureParserRuleCall_3_0; }
	}

	public class ActiveClassDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActiveClassDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActiveClassDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActiveClassDeclarationActiveClassDeclarationParserRuleCall_0_0 = (RuleCall)cActiveClassDeclarationAssignment_0.eContents().get(0);
		private final Assignment cActiveClassBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActiveClassBodyActiveClassBodyParserRuleCall_1_0 = (RuleCall)cActiveClassBodyAssignment_1.eContents().get(0);
		
		//ActiveClassDefinition:
		//
		//	activeClassDeclaration=ActiveClassDeclaration activeClassBody=ActiveClassBody;
		public ParserRule getRule() { return rule; }

		//activeClassDeclaration=ActiveClassDeclaration activeClassBody=ActiveClassBody
		public Group getGroup() { return cGroup; }

		//activeClassDeclaration=ActiveClassDeclaration
		public Assignment getActiveClassDeclarationAssignment_0() { return cActiveClassDeclarationAssignment_0; }

		//ActiveClassDeclaration
		public RuleCall getActiveClassDeclarationActiveClassDeclarationParserRuleCall_0_0() { return cActiveClassDeclarationActiveClassDeclarationParserRuleCall_0_0; }

		//activeClassBody=ActiveClassBody
		public Assignment getActiveClassBodyAssignment_1() { return cActiveClassBodyAssignment_1; }

		//ActiveClassBody
		public RuleCall getActiveClassBodyActiveClassBodyParserRuleCall_1_0() { return cActiveClassBodyActiveClassBodyParserRuleCall_1_0; }
	}

	public class ActiveClassDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActiveClassDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActiveClassDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActiveClassDeclarationActiveClassDeclarationParserRuleCall_0_0 = (RuleCall)cActiveClassDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cActiveClassBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cActiveClassBodyActiveClassBodyParserRuleCall_1_1_0 = (RuleCall)cActiveClassBodyAssignment_1_1.eContents().get(0);
		
		//ActiveClassDefinitionOrStub:
		//
		//	activeClassDeclaration=ActiveClassDeclaration (";" | activeClassBody=ActiveClassBody);
		public ParserRule getRule() { return rule; }

		//activeClassDeclaration=ActiveClassDeclaration (";" | activeClassBody=ActiveClassBody)
		public Group getGroup() { return cGroup; }

		//activeClassDeclaration=ActiveClassDeclaration
		public Assignment getActiveClassDeclarationAssignment_0() { return cActiveClassDeclarationAssignment_0; }

		//ActiveClassDeclaration
		public RuleCall getActiveClassDeclarationActiveClassDeclarationParserRuleCall_0_0() { return cActiveClassDeclarationActiveClassDeclarationParserRuleCall_0_0; }

		//";" | activeClassBody=ActiveClassBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//activeClassBody=ActiveClassBody
		public Assignment getActiveClassBodyAssignment_1_1() { return cActiveClassBodyAssignment_1_1; }

		//ActiveClassBody
		public RuleCall getActiveClassBodyActiveClassBodyParserRuleCall_1_1_0() { return cActiveClassBodyActiveClassBodyParserRuleCall_1_1_0; }
	}

	public class ActiveClassBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActiveClassBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActiveClassBodyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cActiveClassMemberAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActiveClassMemberActiveClassMemberParserRuleCall_2_0 = (RuleCall)cActiveClassMemberAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDoKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBehaviorClasueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBehaviorClasueBehaviorClauseParserRuleCall_4_1_0 = (RuleCall)cBehaviorClasueAssignment_4_1.eContents().get(0);
		
		//ActiveClassBody:
		//
		//	{ActiveClassBody} "{" activeClassMember+=ActiveClassMember* "}" ("do" behaviorClasue=BehaviorClause)?;
		public ParserRule getRule() { return rule; }

		//{ActiveClassBody} "{" activeClassMember+=ActiveClassMember* "}" ("do" behaviorClasue=BehaviorClause)?
		public Group getGroup() { return cGroup; }

		//{ActiveClassBody}
		public Action getActiveClassBodyAction_0() { return cActiveClassBodyAction_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//activeClassMember+=ActiveClassMember*
		public Assignment getActiveClassMemberAssignment_2() { return cActiveClassMemberAssignment_2; }

		//ActiveClassMember
		public RuleCall getActiveClassMemberActiveClassMemberParserRuleCall_2_0() { return cActiveClassMemberActiveClassMemberParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }

		//("do" behaviorClasue=BehaviorClause)?
		public Group getGroup_4() { return cGroup_4; }

		//"do"
		public Keyword getDoKeyword_4_0() { return cDoKeyword_4_0; }

		//behaviorClasue=BehaviorClause
		public Assignment getBehaviorClasueAssignment_4_1() { return cBehaviorClasueAssignment_4_1; }

		//BehaviorClause
		public RuleCall getBehaviorClasueBehaviorClauseParserRuleCall_4_1_0() { return cBehaviorClasueBehaviorClauseParserRuleCall_4_1_0; }
	}

	public class BehaviorClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BehaviorClause");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cBlockAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cBlockBlockParserRuleCall_0_0 = (RuleCall)cBlockAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//BehaviorClause:
		//
		//	block=Block | name=Name;
		public ParserRule getRule() { return rule; }

		//block=Block | name=Name
		public Alternatives getAlternatives() { return cAlternatives; }

		//block=Block
		public Assignment getBlockAssignment_0() { return cBlockAssignment_0; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_0_0() { return cBlockBlockParserRuleCall_0_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }
	}

	public class ActiveClassMemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActiveClassMember");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cStereotypeAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0 = (RuleCall)cStereotypeAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cVisibilityIndicatorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVisibilityIndicatorVisibilityIndicatorParserRuleCall_2_0 = (RuleCall)cVisibilityIndicatorAssignment_2.eContents().get(0);
		private final Assignment cActiveClassMemberDefinitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActiveClassMemberDefinitionActiveClassMemberDefinitionParserRuleCall_3_0 = (RuleCall)cActiveClassMemberDefinitionAssignment_3.eContents().get(0);
		
		//ActiveClassMember:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//	visibilityIndicator=VisibilityIndicator? activeClassMemberDefinition=ActiveClassMemberDefinition;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//visibilityIndicator=VisibilityIndicator? activeClassMemberDefinition=ActiveClassMemberDefinition
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//stereotypeAnnotations=StereotypeAnnotations
		public Assignment getStereotypeAnnotationsAssignment_1() { return cStereotypeAnnotationsAssignment_1; }

		//StereotypeAnnotations
		public RuleCall getStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0() { return cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0; }

		//visibilityIndicator=VisibilityIndicator?
		public Assignment getVisibilityIndicatorAssignment_2() { return cVisibilityIndicatorAssignment_2; }

		//VisibilityIndicator
		public RuleCall getVisibilityIndicatorVisibilityIndicatorParserRuleCall_2_0() { return cVisibilityIndicatorVisibilityIndicatorParserRuleCall_2_0; }

		//activeClassMemberDefinition=ActiveClassMemberDefinition
		public Assignment getActiveClassMemberDefinitionAssignment_3() { return cActiveClassMemberDefinitionAssignment_3; }

		//ActiveClassMemberDefinition
		public RuleCall getActiveClassMemberDefinitionActiveClassMemberDefinitionParserRuleCall_3_0() { return cActiveClassMemberDefinitionActiveClassMemberDefinitionParserRuleCall_3_0; }
	}

	public class ActiveClassMemberDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActiveClassMemberDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassMemberDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cActiveFeatureDefinitionOrStubParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ActiveClassMemberDefinition:
		//
		//	ClassMemberDefinition | ActiveFeatureDefinitionOrStub;
		public ParserRule getRule() { return rule; }

		//ClassMemberDefinition | ActiveFeatureDefinitionOrStub
		public Alternatives getAlternatives() { return cAlternatives; }

		//ClassMemberDefinition
		public RuleCall getClassMemberDefinitionParserRuleCall_0() { return cClassMemberDefinitionParserRuleCall_0; }

		//ActiveFeatureDefinitionOrStub
		public RuleCall getActiveFeatureDefinitionOrStubParserRuleCall_1() { return cActiveFeatureDefinitionOrStubParserRuleCall_1; }
	}

	public class DataTypeDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsAbstractAbstractKeyword_0_0 = (Keyword)cIsAbstractAssignment_0.eContents().get(0);
		private final Keyword cDatatypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassifierSignatureAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassifierSignatureClassifierSignatureParserRuleCall_2_0 = (RuleCall)cClassifierSignatureAssignment_2.eContents().get(0);
		
		/// * DATA TYPES * / DataTypeDeclaration:
		//
		//	isAbstract?="abstract"? "datatype" classifierSignature=ClassifierSignature;
		public ParserRule getRule() { return rule; }

		//isAbstract?="abstract"? "datatype" classifierSignature=ClassifierSignature
		public Group getGroup() { return cGroup; }

		//isAbstract?="abstract"?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }

		//"abstract"
		public Keyword getIsAbstractAbstractKeyword_0_0() { return cIsAbstractAbstractKeyword_0_0; }

		//"datatype"
		public Keyword getDatatypeKeyword_1() { return cDatatypeKeyword_1; }

		//classifierSignature=ClassifierSignature
		public Assignment getClassifierSignatureAssignment_2() { return cClassifierSignatureAssignment_2; }

		//ClassifierSignature
		public RuleCall getClassifierSignatureClassifierSignatureParserRuleCall_2_0() { return cClassifierSignatureClassifierSignatureParserRuleCall_2_0; }
	}

	public class DataTypeDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDataTypeDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDataTypeDeclarationDataTypeDeclarationParserRuleCall_0_0 = (RuleCall)cDataTypeDeclarationAssignment_0.eContents().get(0);
		private final Assignment cStructureBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStructureBodyStructuredBodyParserRuleCall_1_0 = (RuleCall)cStructureBodyAssignment_1.eContents().get(0);
		
		//DataTypeDefinition:
		//
		//	dataTypeDeclaration=DataTypeDeclaration structureBody=StructuredBody;
		public ParserRule getRule() { return rule; }

		//dataTypeDeclaration=DataTypeDeclaration structureBody=StructuredBody
		public Group getGroup() { return cGroup; }

		//dataTypeDeclaration=DataTypeDeclaration
		public Assignment getDataTypeDeclarationAssignment_0() { return cDataTypeDeclarationAssignment_0; }

		//DataTypeDeclaration
		public RuleCall getDataTypeDeclarationDataTypeDeclarationParserRuleCall_0_0() { return cDataTypeDeclarationDataTypeDeclarationParserRuleCall_0_0; }

		//structureBody=StructuredBody
		public Assignment getStructureBodyAssignment_1() { return cStructureBodyAssignment_1; }

		//StructuredBody
		public RuleCall getStructureBodyStructuredBodyParserRuleCall_1_0() { return cStructureBodyStructuredBodyParserRuleCall_1_0; }
	}

	public class DataTypeDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDataTypeDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDataTypeDeclarationDataTypeDeclarationParserRuleCall_0_0 = (RuleCall)cDataTypeDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cStructureBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cStructureBodyStructuredBodyParserRuleCall_1_1_0 = (RuleCall)cStructureBodyAssignment_1_1.eContents().get(0);
		
		//DataTypeDefinitionOrStub:
		//
		//	dataTypeDeclaration=DataTypeDeclaration (";" | structureBody=StructuredBody);
		public ParserRule getRule() { return rule; }

		//dataTypeDeclaration=DataTypeDeclaration (";" | structureBody=StructuredBody)
		public Group getGroup() { return cGroup; }

		//dataTypeDeclaration=DataTypeDeclaration
		public Assignment getDataTypeDeclarationAssignment_0() { return cDataTypeDeclarationAssignment_0; }

		//DataTypeDeclaration
		public RuleCall getDataTypeDeclarationDataTypeDeclarationParserRuleCall_0_0() { return cDataTypeDeclarationDataTypeDeclarationParserRuleCall_0_0; }

		//";" | structureBody=StructuredBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//structureBody=StructuredBody
		public Assignment getStructureBodyAssignment_1_1() { return cStructureBodyAssignment_1_1; }

		//StructuredBody
		public RuleCall getStructureBodyStructuredBodyParserRuleCall_1_1_0() { return cStructureBodyStructuredBodyParserRuleCall_1_1_0; }
	}

	public class StructuredBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StructuredBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStructuredBodyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStructuredMemberAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStructuredMemberStructuredMemberParserRuleCall_2_0 = (RuleCall)cStructuredMemberAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//StructuredBody:
		//
		//	{StructuredBody} "{" structuredMember+=StructuredMember* "}";
		public ParserRule getRule() { return rule; }

		//{StructuredBody} "{" structuredMember+=StructuredMember* "}"
		public Group getGroup() { return cGroup; }

		//{StructuredBody}
		public Action getStructuredBodyAction_0() { return cStructuredBodyAction_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//structuredMember+=StructuredMember*
		public Assignment getStructuredMemberAssignment_2() { return cStructuredMemberAssignment_2; }

		//StructuredMember
		public RuleCall getStructuredMemberStructuredMemberParserRuleCall_2_0() { return cStructuredMemberStructuredMemberParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class StructuredMemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StructuredMember");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cStreotypeAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStreotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0 = (RuleCall)cStreotypeAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cIsPublicAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsPublicPublicKeyword_2_0 = (Keyword)cIsPublicAssignment_2.eContents().get(0);
		private final Assignment cPropertyDefinitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPropertyDefinitionPropertyDefinitionParserRuleCall_3_0 = (RuleCall)cPropertyDefinitionAssignment_3.eContents().get(0);
		
		//StructuredMember:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / streotypeAnnotations=StereotypeAnnotations isPublic?="public"?
		//
		//	propertyDefinition=PropertyDefinition;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / streotypeAnnotations=StereotypeAnnotations isPublic?="public"?
		//
		//propertyDefinition=PropertyDefinition
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//streotypeAnnotations=StereotypeAnnotations
		public Assignment getStreotypeAnnotationsAssignment_1() { return cStreotypeAnnotationsAssignment_1; }

		//StereotypeAnnotations
		public RuleCall getStreotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0() { return cStreotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0; }

		//isPublic?="public"?
		public Assignment getIsPublicAssignment_2() { return cIsPublicAssignment_2; }

		//"public"
		public Keyword getIsPublicPublicKeyword_2_0() { return cIsPublicPublicKeyword_2_0; }

		//propertyDefinition=PropertyDefinition
		public Assignment getPropertyDefinitionAssignment_3() { return cPropertyDefinitionAssignment_3; }

		//PropertyDefinition
		public RuleCall getPropertyDefinitionPropertyDefinitionParserRuleCall_3_0() { return cPropertyDefinitionPropertyDefinitionParserRuleCall_3_0; }
	}

	public class AssociationDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssociationDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsAbstractAbstractKeyword_0_0 = (Keyword)cIsAbstractAssignment_0.eContents().get(0);
		private final Keyword cAssocKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassifierSignatureAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassifierSignatureClassifierSignatureParserRuleCall_2_0 = (RuleCall)cClassifierSignatureAssignment_2.eContents().get(0);
		
		/// * ASSOCIATIONS * / AssociationDeclaration:
		//
		//	isAbstract?="abstract"? "assoc" classifierSignature=ClassifierSignature;
		public ParserRule getRule() { return rule; }

		//isAbstract?="abstract"? "assoc" classifierSignature=ClassifierSignature
		public Group getGroup() { return cGroup; }

		//isAbstract?="abstract"?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }

		//"abstract"
		public Keyword getIsAbstractAbstractKeyword_0_0() { return cIsAbstractAbstractKeyword_0_0; }

		//"assoc"
		public Keyword getAssocKeyword_1() { return cAssocKeyword_1; }

		//classifierSignature=ClassifierSignature
		public Assignment getClassifierSignatureAssignment_2() { return cClassifierSignatureAssignment_2; }

		//ClassifierSignature
		public RuleCall getClassifierSignatureClassifierSignatureParserRuleCall_2_0() { return cClassifierSignatureClassifierSignatureParserRuleCall_2_0; }
	}

	public class AssociationDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssociationDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAssociationDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAssociationDeclarationAssociationDeclarationParserRuleCall_0_0 = (RuleCall)cAssociationDeclarationAssignment_0.eContents().get(0);
		private final Assignment cStructuredBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStructuredBodyStructuredBodyParserRuleCall_1_0 = (RuleCall)cStructuredBodyAssignment_1.eContents().get(0);
		
		//AssociationDefinition:
		//
		//	associationDeclaration=AssociationDeclaration structuredBody=StructuredBody;
		public ParserRule getRule() { return rule; }

		//associationDeclaration=AssociationDeclaration structuredBody=StructuredBody
		public Group getGroup() { return cGroup; }

		//associationDeclaration=AssociationDeclaration
		public Assignment getAssociationDeclarationAssignment_0() { return cAssociationDeclarationAssignment_0; }

		//AssociationDeclaration
		public RuleCall getAssociationDeclarationAssociationDeclarationParserRuleCall_0_0() { return cAssociationDeclarationAssociationDeclarationParserRuleCall_0_0; }

		//structuredBody=StructuredBody
		public Assignment getStructuredBodyAssignment_1() { return cStructuredBodyAssignment_1; }

		//StructuredBody
		public RuleCall getStructuredBodyStructuredBodyParserRuleCall_1_0() { return cStructuredBodyStructuredBodyParserRuleCall_1_0; }
	}

	public class AssociationDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssociationDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAssociationDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAssociationDeclarationAssociationDeclarationParserRuleCall_0_0 = (RuleCall)cAssociationDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cStructuredBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cStructuredBodyStructuredBodyParserRuleCall_1_1_0 = (RuleCall)cStructuredBodyAssignment_1_1.eContents().get(0);
		
		//AssociationDefinitionOrStub:
		//
		//	associationDeclaration=AssociationDeclaration (";" | structuredBody=StructuredBody);
		public ParserRule getRule() { return rule; }

		//associationDeclaration=AssociationDeclaration (";" | structuredBody=StructuredBody)
		public Group getGroup() { return cGroup; }

		//associationDeclaration=AssociationDeclaration
		public Assignment getAssociationDeclarationAssignment_0() { return cAssociationDeclarationAssignment_0; }

		//AssociationDeclaration
		public RuleCall getAssociationDeclarationAssociationDeclarationParserRuleCall_0_0() { return cAssociationDeclarationAssociationDeclarationParserRuleCall_0_0; }

		//";" | structuredBody=StructuredBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//structuredBody=StructuredBody
		public Assignment getStructuredBodyAssignment_1_1() { return cStructuredBodyAssignment_1_1; }

		//StructuredBody
		public RuleCall getStructuredBodyStructuredBodyParserRuleCall_1_1_0() { return cStructuredBodyStructuredBodyParserRuleCall_1_1_0; }
	}

	public class EnumerationDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumerationDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cSpecializationClauseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpecializationClauseSpecializationClauseParserRuleCall_2_0 = (RuleCall)cSpecializationClauseAssignment_2.eContents().get(0);
		
		/// * ENUMERATIONS * / EnumerationDeclaration:
		//
		//	"enum" name=Name specializationClause=SpecializationClause?;
		public ParserRule getRule() { return rule; }

		//"enum" name=Name specializationClause=SpecializationClause?
		public Group getGroup() { return cGroup; }

		//"enum"
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }

		//specializationClause=SpecializationClause?
		public Assignment getSpecializationClauseAssignment_2() { return cSpecializationClauseAssignment_2; }

		//SpecializationClause
		public RuleCall getSpecializationClauseSpecializationClauseParserRuleCall_2_0() { return cSpecializationClauseSpecializationClauseParserRuleCall_2_0; }
	}

	public class EnumerationDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumerationDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEnumerationClauseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEnumerationClauseEnumerationDeclarationParserRuleCall_0_0 = (RuleCall)cEnumerationClauseAssignment_0.eContents().get(0);
		private final Assignment cEnumerationBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEnumerationBodyEnumerationBodyParserRuleCall_1_0 = (RuleCall)cEnumerationBodyAssignment_1.eContents().get(0);
		
		//EnumerationDefinition:
		//
		//	enumerationClause=EnumerationDeclaration enumerationBody=EnumerationBody;
		public ParserRule getRule() { return rule; }

		//enumerationClause=EnumerationDeclaration enumerationBody=EnumerationBody
		public Group getGroup() { return cGroup; }

		//enumerationClause=EnumerationDeclaration
		public Assignment getEnumerationClauseAssignment_0() { return cEnumerationClauseAssignment_0; }

		//EnumerationDeclaration
		public RuleCall getEnumerationClauseEnumerationDeclarationParserRuleCall_0_0() { return cEnumerationClauseEnumerationDeclarationParserRuleCall_0_0; }

		//enumerationBody=EnumerationBody
		public Assignment getEnumerationBodyAssignment_1() { return cEnumerationBodyAssignment_1; }

		//EnumerationBody
		public RuleCall getEnumerationBodyEnumerationBodyParserRuleCall_1_0() { return cEnumerationBodyEnumerationBodyParserRuleCall_1_0; }
	}

	public class EnumerationDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumerationDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEnumerationDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEnumerationDeclarationEnumerationDeclarationParserRuleCall_0_0 = (RuleCall)cEnumerationDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cEnumerationBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cEnumerationBodyEnumerationBodyParserRuleCall_1_1_0 = (RuleCall)cEnumerationBodyAssignment_1_1.eContents().get(0);
		
		//EnumerationDefinitionOrStub:
		//
		//	enumerationDeclaration=EnumerationDeclaration (";" | enumerationBody=EnumerationBody);
		public ParserRule getRule() { return rule; }

		//enumerationDeclaration=EnumerationDeclaration (";" | enumerationBody=EnumerationBody)
		public Group getGroup() { return cGroup; }

		//enumerationDeclaration=EnumerationDeclaration
		public Assignment getEnumerationDeclarationAssignment_0() { return cEnumerationDeclarationAssignment_0; }

		//EnumerationDeclaration
		public RuleCall getEnumerationDeclarationEnumerationDeclarationParserRuleCall_0_0() { return cEnumerationDeclarationEnumerationDeclarationParserRuleCall_0_0; }

		//";" | enumerationBody=EnumerationBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//enumerationBody=EnumerationBody
		public Assignment getEnumerationBodyAssignment_1_1() { return cEnumerationBodyAssignment_1_1; }

		//EnumerationBody
		public RuleCall getEnumerationBodyEnumerationBodyParserRuleCall_1_1_0() { return cEnumerationBodyEnumerationBodyParserRuleCall_1_1_0; }
	}

	public class EnumerationBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumerationBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEnumerationLiteralNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEnumerationLiteralNameEnumerationLiteralNameParserRuleCall_1_0 = (RuleCall)cEnumerationLiteralNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEnumerationLiteralNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEnumerationLiteralNameEnumerationLiteralNameParserRuleCall_2_1_0 = (RuleCall)cEnumerationLiteralNameAssignment_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EnumerationBody:
		//
		//	"{" enumerationLiteralName+=EnumerationLiteralName ("," enumerationLiteralName+=EnumerationLiteralName)* "}";
		public ParserRule getRule() { return rule; }

		//"{" enumerationLiteralName+=EnumerationLiteralName ("," enumerationLiteralName+=EnumerationLiteralName)* "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//enumerationLiteralName+=EnumerationLiteralName
		public Assignment getEnumerationLiteralNameAssignment_1() { return cEnumerationLiteralNameAssignment_1; }

		//EnumerationLiteralName
		public RuleCall getEnumerationLiteralNameEnumerationLiteralNameParserRuleCall_1_0() { return cEnumerationLiteralNameEnumerationLiteralNameParserRuleCall_1_0; }

		//("," enumerationLiteralName+=EnumerationLiteralName)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//enumerationLiteralName+=EnumerationLiteralName
		public Assignment getEnumerationLiteralNameAssignment_2_1() { return cEnumerationLiteralNameAssignment_2_1; }

		//EnumerationLiteralName
		public RuleCall getEnumerationLiteralNameEnumerationLiteralNameParserRuleCall_2_1_0() { return cEnumerationLiteralNameEnumerationLiteralNameParserRuleCall_2_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class EnumerationLiteralNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumerationLiteralName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//EnumerationLiteralName:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / name=Name;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / name=Name
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }
	}

	public class SignalDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignalDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsAbstractAbstractKeyword_0_0 = (Keyword)cIsAbstractAssignment_0.eContents().get(0);
		private final Keyword cSignalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassifierSignatureAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassifierSignatureClassifierSignatureParserRuleCall_2_0 = (RuleCall)cClassifierSignatureAssignment_2.eContents().get(0);
		
		/// * SIGNALS * / SignalDeclaration:
		//
		//	isAbstract?="abstract"? "signal" classifierSignature=ClassifierSignature;
		public ParserRule getRule() { return rule; }

		//isAbstract?="abstract"? "signal" classifierSignature=ClassifierSignature
		public Group getGroup() { return cGroup; }

		//isAbstract?="abstract"?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }

		//"abstract"
		public Keyword getIsAbstractAbstractKeyword_0_0() { return cIsAbstractAbstractKeyword_0_0; }

		//"signal"
		public Keyword getSignalKeyword_1() { return cSignalKeyword_1; }

		//classifierSignature=ClassifierSignature
		public Assignment getClassifierSignatureAssignment_2() { return cClassifierSignatureAssignment_2; }

		//ClassifierSignature
		public RuleCall getClassifierSignatureClassifierSignatureParserRuleCall_2_0() { return cClassifierSignatureClassifierSignatureParserRuleCall_2_0; }
	}

	public class SignalDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignalDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSignalDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSignalDeclarationSignalDeclarationParserRuleCall_0_0 = (RuleCall)cSignalDeclarationAssignment_0.eContents().get(0);
		private final Assignment cStructuredBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStructuredBodyStructuredBodyParserRuleCall_1_0 = (RuleCall)cStructuredBodyAssignment_1.eContents().get(0);
		
		//SignalDefinition:
		//
		//	signalDeclaration=SignalDeclaration structuredBody=StructuredBody;
		public ParserRule getRule() { return rule; }

		//signalDeclaration=SignalDeclaration structuredBody=StructuredBody
		public Group getGroup() { return cGroup; }

		//signalDeclaration=SignalDeclaration
		public Assignment getSignalDeclarationAssignment_0() { return cSignalDeclarationAssignment_0; }

		//SignalDeclaration
		public RuleCall getSignalDeclarationSignalDeclarationParserRuleCall_0_0() { return cSignalDeclarationSignalDeclarationParserRuleCall_0_0; }

		//structuredBody=StructuredBody
		public Assignment getStructuredBodyAssignment_1() { return cStructuredBodyAssignment_1; }

		//StructuredBody
		public RuleCall getStructuredBodyStructuredBodyParserRuleCall_1_0() { return cStructuredBodyStructuredBodyParserRuleCall_1_0; }
	}

	public class SignalDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignalDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSignalDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSignalDeclarationSignalDeclarationParserRuleCall_0_0 = (RuleCall)cSignalDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cStructuredBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cStructuredBodyStructuredBodyParserRuleCall_1_1_0 = (RuleCall)cStructuredBodyAssignment_1_1.eContents().get(0);
		
		//SignalDefinitionOrStub:
		//
		//	signalDeclaration=SignalDeclaration (";" | structuredBody=StructuredBody);
		public ParserRule getRule() { return rule; }

		//signalDeclaration=SignalDeclaration (";" | structuredBody=StructuredBody)
		public Group getGroup() { return cGroup; }

		//signalDeclaration=SignalDeclaration
		public Assignment getSignalDeclarationAssignment_0() { return cSignalDeclarationAssignment_0; }

		//SignalDeclaration
		public RuleCall getSignalDeclarationSignalDeclarationParserRuleCall_0_0() { return cSignalDeclarationSignalDeclarationParserRuleCall_0_0; }

		//";" | structuredBody=StructuredBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//structuredBody=StructuredBody
		public Assignment getStructuredBodyAssignment_1_1() { return cStructuredBodyAssignment_1_1; }

		//StructuredBody
		public RuleCall getStructuredBodyStructuredBodyParserRuleCall_1_1_0() { return cStructuredBodyStructuredBodyParserRuleCall_1_1_0; }
	}

	public class ActivityDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActivityDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActivityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTemplateParametersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTemplateParametersTemplateParametersParserRuleCall_2_0 = (RuleCall)cTemplateParametersAssignment_2.eContents().get(0);
		private final Assignment cFormalParametersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFormalParametersFormalParametersParserRuleCall_3_0 = (RuleCall)cFormalParametersAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypePartAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypePartTypePartParserRuleCall_4_1_0 = (RuleCall)cTypePartAssignment_4_1.eContents().get(0);
		
		/// * ACTIVITIES * / ActivityDeclaration:
		//
		//	"activity" name=Name templateParameters=TemplateParameters? formalParameters=FormalParameters (":"
		//
		//	typePart=TypePart)?;
		public ParserRule getRule() { return rule; }

		//"activity" name=Name templateParameters=TemplateParameters? formalParameters=FormalParameters (":" typePart=TypePart)?
		public Group getGroup() { return cGroup; }

		//"activity"
		public Keyword getActivityKeyword_0() { return cActivityKeyword_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }

		//templateParameters=TemplateParameters?
		public Assignment getTemplateParametersAssignment_2() { return cTemplateParametersAssignment_2; }

		//TemplateParameters
		public RuleCall getTemplateParametersTemplateParametersParserRuleCall_2_0() { return cTemplateParametersTemplateParametersParserRuleCall_2_0; }

		//formalParameters=FormalParameters
		public Assignment getFormalParametersAssignment_3() { return cFormalParametersAssignment_3; }

		//FormalParameters
		public RuleCall getFormalParametersFormalParametersParserRuleCall_3_0() { return cFormalParametersFormalParametersParserRuleCall_3_0; }

		//(":" typePart=TypePart)?
		public Group getGroup_4() { return cGroup_4; }

		//":"
		public Keyword getColonKeyword_4_0() { return cColonKeyword_4_0; }

		//typePart=TypePart
		public Assignment getTypePartAssignment_4_1() { return cTypePartAssignment_4_1; }

		//TypePart
		public RuleCall getTypePartTypePartParserRuleCall_4_1_0() { return cTypePartTypePartParserRuleCall_4_1_0; }
	}

	public class ActivityDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActivityDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActivityDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActivityDeclarationActivityDeclarationParserRuleCall_0_0 = (RuleCall)cActivityDeclarationAssignment_0.eContents().get(0);
		private final Assignment cBlockAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBlockBlockParserRuleCall_1_0 = (RuleCall)cBlockAssignment_1.eContents().get(0);
		
		//ActivityDefinition:
		//
		//	activityDeclaration=ActivityDeclaration block=Block;
		public ParserRule getRule() { return rule; }

		//activityDeclaration=ActivityDeclaration block=Block
		public Group getGroup() { return cGroup; }

		//activityDeclaration=ActivityDeclaration
		public Assignment getActivityDeclarationAssignment_0() { return cActivityDeclarationAssignment_0; }

		//ActivityDeclaration
		public RuleCall getActivityDeclarationActivityDeclarationParserRuleCall_0_0() { return cActivityDeclarationActivityDeclarationParserRuleCall_0_0; }

		//block=Block
		public Assignment getBlockAssignment_1() { return cBlockAssignment_1; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_1_0() { return cBlockBlockParserRuleCall_1_0; }
	}

	public class ActivityDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActivityDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActivityDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActivityDeclarationActivityDeclarationParserRuleCall_0_0 = (RuleCall)cActivityDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cBlockAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cBlockBlockParserRuleCall_1_1_0 = (RuleCall)cBlockAssignment_1_1.eContents().get(0);
		
		//ActivityDefinitionOrStub:
		//
		//	activityDeclaration=ActivityDeclaration (";" | block=Block);
		public ParserRule getRule() { return rule; }

		//activityDeclaration=ActivityDeclaration (";" | block=Block)
		public Group getGroup() { return cGroup; }

		//activityDeclaration=ActivityDeclaration
		public Assignment getActivityDeclarationAssignment_0() { return cActivityDeclarationAssignment_0; }

		//ActivityDeclaration
		public RuleCall getActivityDeclarationActivityDeclarationParserRuleCall_0_0() { return cActivityDeclarationActivityDeclarationParserRuleCall_0_0; }

		//";" | block=Block
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//block=Block
		public Assignment getBlockAssignment_1_1() { return cBlockAssignment_1_1; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_1_1_0() { return cBlockBlockParserRuleCall_1_1_0; }
	}

	public class FormalParametersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FormalParameters");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFormalParametersAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFormalParameterListAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFormalParameterListFormalParameterListParserRuleCall_2_0 = (RuleCall)cFormalParameterListAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FormalParameters:
		//
		//	{FormalParameters} "(" formalParameterList=FormalParameterList? ")";
		public ParserRule getRule() { return rule; }

		//{FormalParameters} "(" formalParameterList=FormalParameterList? ")"
		public Group getGroup() { return cGroup; }

		//{FormalParameters}
		public Action getFormalParametersAction_0() { return cFormalParametersAction_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//formalParameterList=FormalParameterList?
		public Assignment getFormalParameterListAssignment_2() { return cFormalParameterListAssignment_2; }

		//FormalParameterList
		public RuleCall getFormalParameterListFormalParameterListParserRuleCall_2_0() { return cFormalParameterListFormalParameterListParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class FormalParameterListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FormalParameterList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFormalParameterAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFormalParameterFormalParameterParserRuleCall_0_0 = (RuleCall)cFormalParameterAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cFormalParameterAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFormalParameterFormalParameterParserRuleCall_1_1_0 = (RuleCall)cFormalParameterAssignment_1_1.eContents().get(0);
		
		//FormalParameterList:
		//
		//	formalParameter+=FormalParameter ("," formalParameter+=FormalParameter)*;
		public ParserRule getRule() { return rule; }

		//formalParameter+=FormalParameter ("," formalParameter+=FormalParameter)*
		public Group getGroup() { return cGroup; }

		//formalParameter+=FormalParameter
		public Assignment getFormalParameterAssignment_0() { return cFormalParameterAssignment_0; }

		//FormalParameter
		public RuleCall getFormalParameterFormalParameterParserRuleCall_0_0() { return cFormalParameterFormalParameterParserRuleCall_0_0; }

		//("," formalParameter+=FormalParameter)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//formalParameter+=FormalParameter
		public Assignment getFormalParameterAssignment_1_1() { return cFormalParameterAssignment_1_1; }

		//FormalParameter
		public RuleCall getFormalParameterFormalParameterParserRuleCall_1_1_0() { return cFormalParameterFormalParameterParserRuleCall_1_1_0; }
	}

	public class FormalParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FormalParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cStereotypeAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0 = (RuleCall)cStereotypeAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cParameterDirectionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParameterDirectionParameterDirectionEnumRuleCall_2_0 = (RuleCall)cParameterDirectionAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameNameParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTypePartAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypePartTypePartParserRuleCall_5_0 = (RuleCall)cTypePartAssignment_5.eContents().get(0);
		
		//FormalParameter:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//	parameterDirection=ParameterDirection name=Name ":" typePart=TypePart;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
		//
		//parameterDirection=ParameterDirection name=Name ":" typePart=TypePart
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//stereotypeAnnotations=StereotypeAnnotations
		public Assignment getStereotypeAnnotationsAssignment_1() { return cStereotypeAnnotationsAssignment_1; }

		//StereotypeAnnotations
		public RuleCall getStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0() { return cStereotypeAnnotationsStereotypeAnnotationsParserRuleCall_1_0; }

		//parameterDirection=ParameterDirection
		public Assignment getParameterDirectionAssignment_2() { return cParameterDirectionAssignment_2; }

		//ParameterDirection
		public RuleCall getParameterDirectionParameterDirectionEnumRuleCall_2_0() { return cParameterDirectionParameterDirectionEnumRuleCall_2_0; }

		//name=Name
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//Name
		public RuleCall getNameNameParserRuleCall_3_0() { return cNameNameParserRuleCall_3_0; }

		//":"
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }

		//typePart=TypePart
		public Assignment getTypePartAssignment_5() { return cTypePartAssignment_5; }

		//TypePart
		public RuleCall getTypePartTypePartParserRuleCall_5_0() { return cTypePartTypePartParserRuleCall_5_0; }
	}

	public class FeatureDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureDefinitionOrStub");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationDefinitionOrStubParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		/// * FEATURES * / FeatureDefinitionOrStub:
		//
		//	AttributeDefinition | OperationDefinitionOrStub;
		public ParserRule getRule() { return rule; }

		//AttributeDefinition | OperationDefinitionOrStub
		public Alternatives getAlternatives() { return cAlternatives; }

		//AttributeDefinition
		public RuleCall getAttributeDefinitionParserRuleCall_0() { return cAttributeDefinitionParserRuleCall_0; }

		//OperationDefinitionOrStub
		public RuleCall getOperationDefinitionOrStubParserRuleCall_1() { return cOperationDefinitionOrStubParserRuleCall_1; }
	}

	public class ActiveFeatureDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ActiveFeatureDefinitionOrStub");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cReceptionDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSignalReceptionDefinitionOrStubParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ActiveFeatureDefinitionOrStub:
		//
		//	ReceptionDefinition | SignalReceptionDefinitionOrStub;
		public ParserRule getRule() { return rule; }

		//ReceptionDefinition | SignalReceptionDefinitionOrStub
		public Alternatives getAlternatives() { return cAlternatives; }

		//ReceptionDefinition
		public RuleCall getReceptionDefinitionParserRuleCall_0() { return cReceptionDefinitionParserRuleCall_0; }

		//SignalReceptionDefinitionOrStub
		public RuleCall getSignalReceptionDefinitionOrStubParserRuleCall_1() { return cSignalReceptionDefinitionOrStubParserRuleCall_1; }
	}

	public class PropertyDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPropertyDeclarationPropertyDeclarationParserRuleCall_0_0 = (RuleCall)cPropertyDeclarationAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		/// * PROPERTIES * / PropertyDefinition:
		//
		//	propertyDeclaration=PropertyDeclaration ";";
		public ParserRule getRule() { return rule; }

		//propertyDeclaration=PropertyDeclaration ";"
		public Group getGroup() { return cGroup; }

		//propertyDeclaration=PropertyDeclaration
		public Assignment getPropertyDeclarationAssignment_0() { return cPropertyDeclarationAssignment_0; }

		//PropertyDeclaration
		public RuleCall getPropertyDeclarationPropertyDeclarationParserRuleCall_0_0() { return cPropertyDeclarationPropertyDeclarationParserRuleCall_0_0; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class AttributeDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AttributeDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPropertyDeclarationPropertyDeclarationParserRuleCall_0_0 = (RuleCall)cPropertyDeclarationAssignment_0.eContents().get(0);
		private final Assignment cAttributeInitializerAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttributeInitializerAttributeInitializerParserRuleCall_1_0 = (RuleCall)cAttributeInitializerAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AttributeDefinition:
		//
		//	propertyDeclaration=PropertyDeclaration attributeInitializer=AttributeInitializer? ";";
		public ParserRule getRule() { return rule; }

		//propertyDeclaration=PropertyDeclaration attributeInitializer=AttributeInitializer? ";"
		public Group getGroup() { return cGroup; }

		//propertyDeclaration=PropertyDeclaration
		public Assignment getPropertyDeclarationAssignment_0() { return cPropertyDeclarationAssignment_0; }

		//PropertyDeclaration
		public RuleCall getPropertyDeclarationPropertyDeclarationParserRuleCall_0_0() { return cPropertyDeclarationPropertyDeclarationParserRuleCall_0_0; }

		//attributeInitializer=AttributeInitializer?
		public Assignment getAttributeInitializerAssignment_1() { return cAttributeInitializerAssignment_1; }

		//AttributeInitializer
		public RuleCall getAttributeInitializerAttributeInitializerParserRuleCall_1_0() { return cAttributeInitializerAttributeInitializerParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class AttributeInitializerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AttributeInitializer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInitializationExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInitializationExpressionInitializationExpressionParserRuleCall_1_0 = (RuleCall)cInitializationExpressionAssignment_1.eContents().get(0);
		
		//AttributeInitializer:
		//
		//	"=" initializationExpression=InitializationExpression;
		public ParserRule getRule() { return rule; }

		//"=" initializationExpression=InitializationExpression
		public Group getGroup() { return cGroup; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//initializationExpression=InitializationExpression
		public Assignment getInitializationExpressionAssignment_1() { return cInitializationExpressionAssignment_1; }

		//InitializationExpression
		public RuleCall getInitializationExpressionInitializationExpressionParserRuleCall_1_0() { return cInitializationExpressionInitializationExpressionParserRuleCall_1_0; }
	}

	public class PropertyDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIsCompositeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsCompositeComposeKeyword_2_0 = (Keyword)cIsCompositeAssignment_2.eContents().get(0);
		private final Assignment cTypePartAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypePartTypePartParserRuleCall_3_0 = (RuleCall)cTypePartAssignment_3.eContents().get(0);
		
		//PropertyDeclaration:
		//
		//	name=Name ":" isComposite?="compose"? typePart=TypePart;
		public ParserRule getRule() { return rule; }

		//name=Name ":" isComposite?="compose"? typePart=TypePart
		public Group getGroup() { return cGroup; }

		//name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//isComposite?="compose"?
		public Assignment getIsCompositeAssignment_2() { return cIsCompositeAssignment_2; }

		//"compose"
		public Keyword getIsCompositeComposeKeyword_2_0() { return cIsCompositeComposeKeyword_2_0; }

		//typePart=TypePart
		public Assignment getTypePartAssignment_3() { return cTypePartAssignment_3; }

		//TypePart
		public RuleCall getTypePartTypePartParserRuleCall_3_0() { return cTypePartTypePartParserRuleCall_3_0; }
	}

	public class TypePartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypePart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeNameTypeNameParserRuleCall_0_0 = (RuleCall)cTypeNameAssignment_0.eContents().get(0);
		private final Assignment cMultiplicityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMultiplicityMultiplicityParserRuleCall_1_0 = (RuleCall)cMultiplicityAssignment_1.eContents().get(0);
		
		//TypePart:
		//
		//	typeName=TypeName multiplicity=Multiplicity?;
		public ParserRule getRule() { return rule; }

		//typeName=TypeName multiplicity=Multiplicity?
		public Group getGroup() { return cGroup; }

		//typeName=TypeName
		public Assignment getTypeNameAssignment_0() { return cTypeNameAssignment_0; }

		//TypeName
		public RuleCall getTypeNameTypeNameParserRuleCall_0_0() { return cTypeNameTypeNameParserRuleCall_0_0; }

		//multiplicity=Multiplicity?
		public Assignment getMultiplicityAssignment_1() { return cMultiplicityAssignment_1; }

		//Multiplicity
		public RuleCall getMultiplicityMultiplicityParserRuleCall_1_0() { return cMultiplicityMultiplicityParserRuleCall_1_0; }
	}

	public class TypeNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cQualifiedNameAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cQualifiedNameAssignment_0.eContents().get(0);
		private final Assignment cAnyAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cAnyAnyKeyword_1_0 = (Keyword)cAnyAssignment_1.eContents().get(0);
		
		//TypeName:
		//
		//	qualifiedName=QualifiedName | any?="any";
		public ParserRule getRule() { return rule; }

		//qualifiedName=QualifiedName | any?="any"
		public Alternatives getAlternatives() { return cAlternatives; }

		//qualifiedName=QualifiedName
		public Assignment getQualifiedNameAssignment_0() { return cQualifiedNameAssignment_0; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_0_0() { return cQualifiedNameQualifiedNameParserRuleCall_0_0; }

		//any?="any"
		public Assignment getAnyAssignment_1() { return cAnyAssignment_1; }

		//"any"
		public Keyword getAnyAnyKeyword_1_0() { return cAnyAnyKeyword_1_0; }
	}

	public class MultiplicityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Multiplicity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMultiplicityAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMultiplicityRangeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMultiplicityRangeMultiplicityRangeParserRuleCall_2_0 = (RuleCall)cMultiplicityRangeAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cIsOrderedAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final Keyword cIsOrderedOrderedKeyword_4_0_0_0 = (Keyword)cIsOrderedAssignment_4_0_0.eContents().get(0);
		private final Assignment cIsNonUniqueAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final Keyword cIsNonUniqueNonuniqueKeyword_4_0_1_0 = (Keyword)cIsNonUniqueAssignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Assignment cIsNonUniqueAssignment_4_1_0 = (Assignment)cGroup_4_1.eContents().get(0);
		private final Keyword cIsNonUniqueNonuniqueKeyword_4_1_0_0 = (Keyword)cIsNonUniqueAssignment_4_1_0.eContents().get(0);
		private final Assignment cIsOrderedAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final Keyword cIsOrderedOrderedKeyword_4_1_1_0 = (Keyword)cIsOrderedAssignment_4_1_1.eContents().get(0);
		private final Assignment cIsSequenceAssignment_4_2 = (Assignment)cAlternatives_4.eContents().get(2);
		private final Keyword cIsSequenceSequenceKeyword_4_2_0 = (Keyword)cIsSequenceAssignment_4_2.eContents().get(0);
		
		//Multiplicity:
		//
		//	{Multiplicity} "[" multiplicityRange=MultiplicityRange? "]" (isOrdered?="ordered" isNonUnique?="nonunique"? |
		//
		//	isNonUnique?="nonunique" isOrdered?="ordered"? | isSequence?="sequence")?;
		public ParserRule getRule() { return rule; }

		//{Multiplicity} "[" multiplicityRange=MultiplicityRange? "]" (isOrdered?="ordered" isNonUnique?="nonunique"? |
		//
		//isNonUnique?="nonunique" isOrdered?="ordered"? | isSequence?="sequence")?
		public Group getGroup() { return cGroup; }

		//{Multiplicity}
		public Action getMultiplicityAction_0() { return cMultiplicityAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//multiplicityRange=MultiplicityRange?
		public Assignment getMultiplicityRangeAssignment_2() { return cMultiplicityRangeAssignment_2; }

		//MultiplicityRange
		public RuleCall getMultiplicityRangeMultiplicityRangeParserRuleCall_2_0() { return cMultiplicityRangeMultiplicityRangeParserRuleCall_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }

		//(isOrdered?="ordered" isNonUnique?="nonunique"? | isNonUnique?="nonunique" isOrdered?="ordered"? |
		//
		//isSequence?="sequence")?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//isOrdered?="ordered" isNonUnique?="nonunique"?
		public Group getGroup_4_0() { return cGroup_4_0; }

		//isOrdered?="ordered"
		public Assignment getIsOrderedAssignment_4_0_0() { return cIsOrderedAssignment_4_0_0; }

		//"ordered"
		public Keyword getIsOrderedOrderedKeyword_4_0_0_0() { return cIsOrderedOrderedKeyword_4_0_0_0; }

		//isNonUnique?="nonunique"?
		public Assignment getIsNonUniqueAssignment_4_0_1() { return cIsNonUniqueAssignment_4_0_1; }

		//"nonunique"
		public Keyword getIsNonUniqueNonuniqueKeyword_4_0_1_0() { return cIsNonUniqueNonuniqueKeyword_4_0_1_0; }

		//isNonUnique?="nonunique" isOrdered?="ordered"?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//isNonUnique?="nonunique"
		public Assignment getIsNonUniqueAssignment_4_1_0() { return cIsNonUniqueAssignment_4_1_0; }

		//"nonunique"
		public Keyword getIsNonUniqueNonuniqueKeyword_4_1_0_0() { return cIsNonUniqueNonuniqueKeyword_4_1_0_0; }

		//isOrdered?="ordered"?
		public Assignment getIsOrderedAssignment_4_1_1() { return cIsOrderedAssignment_4_1_1; }

		//"ordered"
		public Keyword getIsOrderedOrderedKeyword_4_1_1_0() { return cIsOrderedOrderedKeyword_4_1_1_0; }

		//isSequence?="sequence"
		public Assignment getIsSequenceAssignment_4_2() { return cIsSequenceAssignment_4_2; }

		//"sequence"
		public Keyword getIsSequenceSequenceKeyword_4_2_0() { return cIsSequenceSequenceKeyword_4_2_0; }
	}

	public class MultiplicityRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MultiplicityRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cLowerAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cLowerINTEGER_LITERALParserRuleCall_0_0_0 = (RuleCall)cLowerAssignment_0_0.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cUpperAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUpperUnlimitedNaturalLiteralParserRuleCall_1_0 = (RuleCall)cUpperAssignment_1.eContents().get(0);
		
		//MultiplicityRange:
		//
		//	(lower=INTEGER_LITERAL "..")? upper=UnlimitedNaturalLiteral;
		public ParserRule getRule() { return rule; }

		//(lower=INTEGER_LITERAL "..")? upper=UnlimitedNaturalLiteral
		public Group getGroup() { return cGroup; }

		//(lower=INTEGER_LITERAL "..")?
		public Group getGroup_0() { return cGroup_0; }

		//lower=INTEGER_LITERAL
		public Assignment getLowerAssignment_0_0() { return cLowerAssignment_0_0; }

		//INTEGER_LITERAL
		public RuleCall getLowerINTEGER_LITERALParserRuleCall_0_0_0() { return cLowerINTEGER_LITERALParserRuleCall_0_0_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_0_1() { return cFullStopFullStopKeyword_0_1; }

		//upper=UnlimitedNaturalLiteral
		public Assignment getUpperAssignment_1() { return cUpperAssignment_1; }

		//UnlimitedNaturalLiteral
		public RuleCall getUpperUnlimitedNaturalLiteralParserRuleCall_1_0() { return cUpperUnlimitedNaturalLiteralParserRuleCall_1_0; }
	}

	public class UnlimitedNaturalLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnlimitedNaturalLiteral");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cIntegerAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cIntegerINTEGER_LITERALParserRuleCall_0_0 = (RuleCall)cIntegerAssignment_0.eContents().get(0);
		private final Assignment cStarAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cStarAsteriskKeyword_1_0 = (Keyword)cStarAssignment_1.eContents().get(0);
		
		//UnlimitedNaturalLiteral:
		//
		//	integer=INTEGER_LITERAL | star?="*";
		public ParserRule getRule() { return rule; }

		//integer=INTEGER_LITERAL | star?="*"
		public Alternatives getAlternatives() { return cAlternatives; }

		//integer=INTEGER_LITERAL
		public Assignment getIntegerAssignment_0() { return cIntegerAssignment_0; }

		//INTEGER_LITERAL
		public RuleCall getIntegerINTEGER_LITERALParserRuleCall_0_0() { return cIntegerINTEGER_LITERALParserRuleCall_0_0; }

		//star?="*"
		public Assignment getStarAssignment_1() { return cStarAssignment_1; }

		//"*"
		public Keyword getStarAsteriskKeyword_1_0() { return cStarAsteriskKeyword_1_0; }
	}

	public class OperationDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OperationDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsAbstractAbstractKeyword_0_0 = (Keyword)cIsAbstractAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cFormalParametersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFormalParametersFormalParametersParserRuleCall_2_0 = (RuleCall)cFormalParametersAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTypePartAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTypePartTypePartParserRuleCall_3_1_0 = (RuleCall)cTypePartAssignment_3_1.eContents().get(0);
		private final Assignment cRedefinitionClauseAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRedefinitionClauseRedefinitionClauseParserRuleCall_4_0 = (RuleCall)cRedefinitionClauseAssignment_4.eContents().get(0);
		
		/// * OPERATIONS * / OperationDeclaration:
		//
		//	isAbstract?="abstract"? name=Name formalParameters=FormalParameters (":" typePart=TypePart)?
		//
		//	redefinitionClause=RedefinitionClause?;
		public ParserRule getRule() { return rule; }

		//isAbstract?="abstract"? name=Name formalParameters=FormalParameters (":" typePart=TypePart)?
		//
		//redefinitionClause=RedefinitionClause?
		public Group getGroup() { return cGroup; }

		//isAbstract?="abstract"?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }

		//"abstract"
		public Keyword getIsAbstractAbstractKeyword_0_0() { return cIsAbstractAbstractKeyword_0_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }

		//formalParameters=FormalParameters
		public Assignment getFormalParametersAssignment_2() { return cFormalParametersAssignment_2; }

		//FormalParameters
		public RuleCall getFormalParametersFormalParametersParserRuleCall_2_0() { return cFormalParametersFormalParametersParserRuleCall_2_0; }

		//(":" typePart=TypePart)?
		public Group getGroup_3() { return cGroup_3; }

		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }

		//typePart=TypePart
		public Assignment getTypePartAssignment_3_1() { return cTypePartAssignment_3_1; }

		//TypePart
		public RuleCall getTypePartTypePartParserRuleCall_3_1_0() { return cTypePartTypePartParserRuleCall_3_1_0; }

		//redefinitionClause=RedefinitionClause?
		public Assignment getRedefinitionClauseAssignment_4() { return cRedefinitionClauseAssignment_4; }

		//RedefinitionClause
		public RuleCall getRedefinitionClauseRedefinitionClauseParserRuleCall_4_0() { return cRedefinitionClauseRedefinitionClauseParserRuleCall_4_0; }
	}

	public class OperationDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OperationDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOperationDeclarationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cBlockAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cBlockBlockParserRuleCall_1_1_0 = (RuleCall)cBlockAssignment_1_1.eContents().get(0);
		
		//OperationDefinitionOrStub:
		//
		//	OperationDeclaration (";" | block=Block);
		public ParserRule getRule() { return rule; }

		//OperationDeclaration (";" | block=Block)
		public Group getGroup() { return cGroup; }

		//OperationDeclaration
		public RuleCall getOperationDeclarationParserRuleCall_0() { return cOperationDeclarationParserRuleCall_0; }

		//";" | block=Block
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//block=Block
		public Assignment getBlockAssignment_1_1() { return cBlockAssignment_1_1; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_1_1_0() { return cBlockBlockParserRuleCall_1_1_0; }
	}

	public class RedefinitionClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RedefinitionClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRedefinesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQualifiedNameListAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQualifiedNameListQualifiedNameListParserRuleCall_1_0 = (RuleCall)cQualifiedNameListAssignment_1.eContents().get(0);
		
		//RedefinitionClause:
		//
		//	"redefines" qualifiedNameList=QualifiedNameList;
		public ParserRule getRule() { return rule; }

		//"redefines" qualifiedNameList=QualifiedNameList
		public Group getGroup() { return cGroup; }

		//"redefines"
		public Keyword getRedefinesKeyword_0() { return cRedefinesKeyword_0; }

		//qualifiedNameList=QualifiedNameList
		public Assignment getQualifiedNameListAssignment_1() { return cQualifiedNameListAssignment_1; }

		//QualifiedNameList
		public RuleCall getQualifiedNameListQualifiedNameListParserRuleCall_1_0() { return cQualifiedNameListQualifiedNameListParserRuleCall_1_0; }
	}

	public class ReceptionDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReceptionDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReceiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cReceptionNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cReceptionNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cReceptionNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		/// * RECEPTIONS * / ReceptionDefinition:
		//
		//	"receive" receptionName=QualifiedName ";";
		public ParserRule getRule() { return rule; }

		//"receive" receptionName=QualifiedName ";"
		public Group getGroup() { return cGroup; }

		//"receive"
		public Keyword getReceiveKeyword_0() { return cReceiveKeyword_0; }

		//receptionName=QualifiedName
		public Assignment getReceptionNameAssignment_1() { return cReceptionNameAssignment_1; }

		//QualifiedName
		public RuleCall getReceptionNameQualifiedNameParserRuleCall_1_0() { return cReceptionNameQualifiedNameParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class SignalReceptionDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignalReceptionDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReceiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSignalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSignalNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSignalNameNameParserRuleCall_2_0 = (RuleCall)cSignalNameAssignment_2.eContents().get(0);
		private final Assignment cSpecializationClauseAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSpecializationClauseSpecializationClauseParserRuleCall_3_0 = (RuleCall)cSpecializationClauseAssignment_3.eContents().get(0);
		
		//SignalReceptionDeclaration:
		//
		//	"receive" "signal" signalName=Name specializationClause=SpecializationClause?;
		public ParserRule getRule() { return rule; }

		//"receive" "signal" signalName=Name specializationClause=SpecializationClause?
		public Group getGroup() { return cGroup; }

		//"receive"
		public Keyword getReceiveKeyword_0() { return cReceiveKeyword_0; }

		//"signal"
		public Keyword getSignalKeyword_1() { return cSignalKeyword_1; }

		//signalName=Name
		public Assignment getSignalNameAssignment_2() { return cSignalNameAssignment_2; }

		//Name
		public RuleCall getSignalNameNameParserRuleCall_2_0() { return cSignalNameNameParserRuleCall_2_0; }

		//specializationClause=SpecializationClause?
		public Assignment getSpecializationClauseAssignment_3() { return cSpecializationClauseAssignment_3; }

		//SpecializationClause
		public RuleCall getSpecializationClauseSpecializationClauseParserRuleCall_3_0() { return cSpecializationClauseSpecializationClauseParserRuleCall_3_0; }
	}

	public class SignalReceptionDefinitionOrStubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignalReceptionDefinitionOrStub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSignalReceptionOrDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSignalReceptionOrDeclarationSignalReceptionDeclarationParserRuleCall_0_0 = (RuleCall)cSignalReceptionOrDeclarationAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cStructuredBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cStructuredBodyStructuredBodyParserRuleCall_1_1_0 = (RuleCall)cStructuredBodyAssignment_1_1.eContents().get(0);
		
		//SignalReceptionDefinitionOrStub:
		//
		//	signalReceptionOrDeclaration=SignalReceptionDeclaration (";" | structuredBody=StructuredBody);
		public ParserRule getRule() { return rule; }

		//signalReceptionOrDeclaration=SignalReceptionDeclaration (";" | structuredBody=StructuredBody)
		public Group getGroup() { return cGroup; }

		//signalReceptionOrDeclaration=SignalReceptionDeclaration
		public Assignment getSignalReceptionOrDeclarationAssignment_0() { return cSignalReceptionOrDeclarationAssignment_0; }

		//SignalReceptionDeclaration
		public RuleCall getSignalReceptionOrDeclarationSignalReceptionDeclarationParserRuleCall_0_0() { return cSignalReceptionOrDeclarationSignalReceptionDeclarationParserRuleCall_0_0; }

		//";" | structuredBody=StructuredBody
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//structuredBody=StructuredBody
		public Assignment getStructuredBodyAssignment_1_1() { return cStructuredBodyAssignment_1_1; }

		//StructuredBody
		public RuleCall getStructuredBodyStructuredBodyParserRuleCall_1_1_0() { return cStructuredBodyStructuredBodyParserRuleCall_1_1_0; }
	}

	public class NameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Name");
		private final Assignment cIdAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_0 = (RuleCall)cIdAssignment.eContents().get(0);
		
		/// ***************
		//
		// * NAMES *
		//
		// *************** / Name:
		//
		//	id=ID;
		public ParserRule getRule() { return rule; }

		//id=ID
		public Assignment getIdAssignment() { return cIdAssignment; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_0() { return cIdIDTerminalRuleCall_0; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnqualifiedAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnqualifiedUnqualifiedNameParserRuleCall_0_0 = (RuleCall)cUnqualifiedAssignment_0.eContents().get(0);
		private final Assignment cNameCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameCompletionColonQualifiedNameCompletionParserRuleCall_1_0 = (RuleCall)cNameCompletionAssignment_1.eContents().get(0);
		
		//QualifiedName: // unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
		//
		//	unqualified=UnqualifiedName nameCompletion=ColonQualifiedNameCompletion?;
		public ParserRule getRule() { return rule; }

		//// unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
		//
		//unqualified=UnqualifiedName nameCompletion=ColonQualifiedNameCompletion?
		public Group getGroup() { return cGroup; }

		//// unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
		//
		//unqualified=UnqualifiedName
		public Assignment getUnqualifiedAssignment_0() { return cUnqualifiedAssignment_0; }

		//UnqualifiedName
		public RuleCall getUnqualifiedUnqualifiedNameParserRuleCall_0_0() { return cUnqualifiedUnqualifiedNameParserRuleCall_0_0; }

		//nameCompletion=ColonQualifiedNameCompletion?
		public Assignment getNameCompletionAssignment_1() { return cNameCompletionAssignment_1; }

		//ColonQualifiedNameCompletion
		public RuleCall getNameCompletionColonQualifiedNameCompletionParserRuleCall_1_0() { return cNameCompletionColonQualifiedNameCompletionParserRuleCall_1_0; }
	}

	public class ColonQualifiedNameCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ColonQualifiedNameCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColonColonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNamedBindingsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNamedBindingsNameBindingParserRuleCall_1_0 = (RuleCall)cNamedBindingsAssignment_1.eContents().get(0);
		
		////PotentiallyAmbiguousQualifiedName :
		//
		////	unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))? / * AMBIGUOUS * /
		//
		////;
		//
		////ColonQualifiedName : 
		//
		////	unqualified = UnqualifiedName nameCompletion = ColonQualifiedNameCompletion
		//
		////;
		//
		//ColonQualifiedNameCompletion:
		//
		//	("::" namedBindings+=NameBinding)+;
		public ParserRule getRule() { return rule; }

		//("::" namedBindings+=NameBinding)+
		public Group getGroup() { return cGroup; }

		//"::"
		public Keyword getColonColonKeyword_0() { return cColonColonKeyword_0; }

		//namedBindings+=NameBinding
		public Assignment getNamedBindingsAssignment_1() { return cNamedBindingsAssignment_1; }

		//NameBinding
		public RuleCall getNamedBindingsNameBindingParserRuleCall_1_0() { return cNamedBindingsNameBindingParserRuleCall_1_0; }
	}

	public class UnqualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnqualifiedName");
		private final RuleCall cNameBindingParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		////DotQualifiedName : 
		//
		////	unqualified = UnqualifiedName nameCompletion = DotQualifiedNameCompletion
		//
		////;
		//
		////DotQualifiedNameCompletion : 
		//
		////	( '.' nameBindings += NameBinding )+ 
		//
		////;
		//
		//UnqualifiedName:
		//
		//	NameBinding;
		public ParserRule getRule() { return rule; }

		//NameBinding
		public RuleCall getNameBindingParserRuleCall() { return cNameBindingParserRuleCall; }
	}

	public class NameBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTemplateBindingAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTemplateBindingTemplateBindingParserRuleCall_1_0 = (RuleCall)cTemplateBindingAssignment_1.eContents().get(0);
		
		//NameBinding:
		//
		//	name=Name templateBinding=TemplateBinding?;
		public ParserRule getRule() { return rule; }

		//name=Name templateBinding=TemplateBinding?
		public Group getGroup() { return cGroup; }

		//name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//templateBinding=TemplateBinding?
		public Assignment getTemplateBindingAssignment_1() { return cTemplateBindingAssignment_1; }

		//TemplateBinding
		public RuleCall getTemplateBindingTemplateBindingParserRuleCall_1_0() { return cTemplateBindingTemplateBindingParserRuleCall_1_0; }
	}

	public class QualifiedNameWithoutBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithoutBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnqualifiedAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnqualifiedNameParserRuleCall_0_0 = (RuleCall)cUnqualifiedAssignment_0.eContents().get(0);
		private final Assignment cNameCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameCompletionColonQualifiedNameCompletionWithoutBindingParserRuleCall_1_0 = (RuleCall)cNameCompletionAssignment_1.eContents().get(0);
		
		//QualifiedNameWithoutBinding: // unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
		//
		//	unqualified=Name nameCompletion=ColonQualifiedNameCompletionWithoutBinding?;
		public ParserRule getRule() { return rule; }

		//// unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
		//
		//unqualified=Name nameCompletion=ColonQualifiedNameCompletionWithoutBinding?
		public Group getGroup() { return cGroup; }

		//// unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
		//
		//unqualified=Name
		public Assignment getUnqualifiedAssignment_0() { return cUnqualifiedAssignment_0; }

		//Name
		public RuleCall getUnqualifiedNameParserRuleCall_0_0() { return cUnqualifiedNameParserRuleCall_0_0; }

		//nameCompletion=ColonQualifiedNameCompletionWithoutBinding?
		public Assignment getNameCompletionAssignment_1() { return cNameCompletionAssignment_1; }

		//ColonQualifiedNameCompletionWithoutBinding
		public RuleCall getNameCompletionColonQualifiedNameCompletionWithoutBindingParserRuleCall_1_0() { return cNameCompletionColonQualifiedNameCompletionWithoutBindingParserRuleCall_1_0; }
	}

	public class ColonQualifiedNameCompletionWithoutBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ColonQualifiedNameCompletionWithoutBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColonColonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNamesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNamesNameParserRuleCall_1_0 = (RuleCall)cNamesAssignment_1.eContents().get(0);
		
		////PotentiallyAmbiguousQualifiedName :
		//
		////	unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))? / * AMBIGUOUS * /
		//
		////;
		//
		////ColonQualifiedName : 
		//
		////	unqualified = UnqualifiedName nameCompletion = ColonQualifiedNameCompletion
		//
		////;
		//
		//ColonQualifiedNameCompletionWithoutBinding:
		//
		//	("::" names+=Name)+;
		public ParserRule getRule() { return rule; }

		//("::" names+=Name)+
		public Group getGroup() { return cGroup; }

		//"::"
		public Keyword getColonColonKeyword_0() { return cColonColonKeyword_0; }

		//names+=Name
		public Assignment getNamesAssignment_1() { return cNamesAssignment_1; }

		//Name
		public RuleCall getNamesNameParserRuleCall_1_0() { return cNamesNameParserRuleCall_1_0; }
	}

	public class TemplateBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TemplateBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLessThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cNamedTemplateBindingParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cPositionalTemplateBindingParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		////DotQualifiedName : 
		//
		////	unqualified = UnqualifiedName nameCompletion = DotQualifiedNameCompletion
		//
		////;
		//
		////DotQualifiedNameCompletion : 
		//
		////	( '.' nameBindings += NameBinding )+ 
		//
		////;
		//
		/// * ^ Unbounded lookahead required here * / TemplateBinding:
		//
		//	"<" (NamedTemplateBinding | PositionalTemplateBinding) ">";
		public ParserRule getRule() { return rule; }

		//"<" (NamedTemplateBinding | PositionalTemplateBinding) ">"
		public Group getGroup() { return cGroup; }

		//"<"
		public Keyword getLessThanSignKeyword_0() { return cLessThanSignKeyword_0; }

		//NamedTemplateBinding | PositionalTemplateBinding
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//NamedTemplateBinding
		public RuleCall getNamedTemplateBindingParserRuleCall_1_0() { return cNamedTemplateBindingParserRuleCall_1_0; }

		//PositionalTemplateBinding
		public RuleCall getPositionalTemplateBindingParserRuleCall_1_1() { return cPositionalTemplateBindingParserRuleCall_1_1; }

		//">"
		public Keyword getGreaterThanSignKeyword_2() { return cGreaterThanSignKeyword_2; }
	}

	public class PositionalTemplateBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PositionalTemplateBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cQualifiedNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cQualifiedNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_1_1_0 = (RuleCall)cQualifiedNameAssignment_1_1.eContents().get(0);
		
		//PositionalTemplateBinding:
		//
		//	qualifiedName+=QualifiedName ("," qualifiedName+=QualifiedName)*;
		public ParserRule getRule() { return rule; }

		//qualifiedName+=QualifiedName ("," qualifiedName+=QualifiedName)*
		public Group getGroup() { return cGroup; }

		//qualifiedName+=QualifiedName
		public Assignment getQualifiedNameAssignment_0() { return cQualifiedNameAssignment_0; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_0_0() { return cQualifiedNameQualifiedNameParserRuleCall_0_0; }

		//("," qualifiedName+=QualifiedName)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//qualifiedName+=QualifiedName
		public Assignment getQualifiedNameAssignment_1_1() { return cQualifiedNameAssignment_1_1; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_1_1_0() { return cQualifiedNameQualifiedNameParserRuleCall_1_1_0; }
	}

	public class NamedTemplateBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamedTemplateBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTemplateParameterSubstitutionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTemplateParameterSubstitutionTemplateParameterSubstitutionParserRuleCall_0_0 = (RuleCall)cTemplateParameterSubstitutionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTemplateParameterSubstitutionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTemplateParameterSubstitutionTemplateParameterSubstitutionParserRuleCall_1_1_0 = (RuleCall)cTemplateParameterSubstitutionAssignment_1_1.eContents().get(0);
		
		//NamedTemplateBinding:
		//
		//	templateParameterSubstitution+=TemplateParameterSubstitution (","
		//
		//	templateParameterSubstitution+=TemplateParameterSubstitution)*;
		public ParserRule getRule() { return rule; }

		//templateParameterSubstitution+=TemplateParameterSubstitution (","
		//
		//templateParameterSubstitution+=TemplateParameterSubstitution)*
		public Group getGroup() { return cGroup; }

		//templateParameterSubstitution+=TemplateParameterSubstitution
		public Assignment getTemplateParameterSubstitutionAssignment_0() { return cTemplateParameterSubstitutionAssignment_0; }

		//TemplateParameterSubstitution
		public RuleCall getTemplateParameterSubstitutionTemplateParameterSubstitutionParserRuleCall_0_0() { return cTemplateParameterSubstitutionTemplateParameterSubstitutionParserRuleCall_0_0; }

		//("," templateParameterSubstitution+=TemplateParameterSubstitution)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//templateParameterSubstitution+=TemplateParameterSubstitution
		public Assignment getTemplateParameterSubstitutionAssignment_1_1() { return cTemplateParameterSubstitutionAssignment_1_1; }

		//TemplateParameterSubstitution
		public RuleCall getTemplateParameterSubstitutionTemplateParameterSubstitutionParserRuleCall_1_1_0() { return cTemplateParameterSubstitutionTemplateParameterSubstitutionParserRuleCall_1_1_0; }
	}

	public class TemplateParameterSubstitutionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TemplateParameterSubstitution");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cQualifiedNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cQualifiedNameAssignment_2.eContents().get(0);
		
		//TemplateParameterSubstitution:
		//
		//	name=Name "=>" qualifiedName=QualifiedName;
		public ParserRule getRule() { return rule; }

		//name=Name "=>" qualifiedName=QualifiedName
		public Group getGroup() { return cGroup; }

		//name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }

		//qualifiedName=QualifiedName
		public Assignment getQualifiedNameAssignment_2() { return cQualifiedNameAssignment_2; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_2_0() { return cQualifiedNameQualifiedNameParserRuleCall_2_0; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionCompletionExpressionCompletionParserRuleCall_1_0 = (RuleCall)cExpressionCompletionAssignment_1.eContents().get(0);
		
		/// ***************
		//
		// * EXPRESSIONS *
		//
		// *************** / Expression:
		//
		//	unaryExpression=UnaryExpression expressionCompletion=ExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression expressionCompletion=ExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//expressionCompletion=ExpressionCompletion
		public Assignment getExpressionCompletionAssignment_1() { return cExpressionCompletionAssignment_1; }

		//ExpressionCompletion
		public RuleCall getExpressionCompletionExpressionCompletionParserRuleCall_1_0() { return cExpressionCompletionExpressionCompletionParserRuleCall_1_0; }
	}

	public class NonNameExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NonNameExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNonNameUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNonNameUnaryExpressionNonNameUnaryExpressionParserRuleCall_0_0 = (RuleCall)cNonNameUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionCompletionExpressionCompletionParserRuleCall_1_0 = (RuleCall)cExpressionCompletionAssignment_1.eContents().get(0);
		
		//NonNameExpression:
		//
		//	nonNameUnaryExpression=NonNameUnaryExpression expressionCompletion=ExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//nonNameUnaryExpression=NonNameUnaryExpression expressionCompletion=ExpressionCompletion
		public Group getGroup() { return cGroup; }

		//nonNameUnaryExpression=NonNameUnaryExpression
		public Assignment getNonNameUnaryExpressionAssignment_0() { return cNonNameUnaryExpressionAssignment_0; }

		//NonNameUnaryExpression
		public RuleCall getNonNameUnaryExpressionNonNameUnaryExpressionParserRuleCall_0_0() { return cNonNameUnaryExpressionNonNameUnaryExpressionParserRuleCall_0_0; }

		//expressionCompletion=ExpressionCompletion
		public Assignment getExpressionCompletionAssignment_1() { return cExpressionCompletionAssignment_1; }

		//ExpressionCompletion
		public RuleCall getExpressionCompletionExpressionCompletionParserRuleCall_1_0() { return cExpressionCompletionExpressionCompletionParserRuleCall_1_0; }
	}

	public class NameToExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameToExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameToPrimaryAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameToPrimaryNameToPrimaryExpressionParserRuleCall_0_0 = (RuleCall)cNameToPrimaryAssignment_0.eContents().get(0);
		private final Assignment cPrimaryToExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPrimaryToExpressionCompletionPrimaryToExpressionCompletionParserRuleCall_1_0 = (RuleCall)cPrimaryToExpressionCompletionAssignment_1.eContents().get(0);
		
		//NameToExpressionCompletion:
		//
		//	nameToPrimary=NameToPrimaryExpression?
		//
		//	/ *=> ( nameToPrimary = NameToPrimaryExpression )? primaryToExpressionCompletion = PrimaryToExpressionCompletion* /
		//
		//	primaryToExpressionCompletion=PrimaryToExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//nameToPrimary=NameToPrimaryExpression?
		//
		/// *=> ( nameToPrimary = NameToPrimaryExpression )? primaryToExpressionCompletion = PrimaryToExpressionCompletion* /
		//
		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		public Group getGroup() { return cGroup; }

		//nameToPrimary=NameToPrimaryExpression?
		public Assignment getNameToPrimaryAssignment_0() { return cNameToPrimaryAssignment_0; }

		//NameToPrimaryExpression
		public RuleCall getNameToPrimaryNameToPrimaryExpressionParserRuleCall_0_0() { return cNameToPrimaryNameToPrimaryExpressionParserRuleCall_0_0; }

		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		public Assignment getPrimaryToExpressionCompletionAssignment_1() { return cPrimaryToExpressionCompletionAssignment_1; }

		//PrimaryToExpressionCompletion
		public RuleCall getPrimaryToExpressionCompletionPrimaryToExpressionCompletionParserRuleCall_1_0() { return cPrimaryToExpressionCompletionPrimaryToExpressionCompletionParserRuleCall_1_0; }
	}

	public class PrimaryToExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrimaryToExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPostFixExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPostFixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_0 = (RuleCall)cPostFixExpressionCompletionAssignment_0.eContents().get(0);
		private final Assignment cExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionCompletionExpressionCompletionParserRuleCall_1_0 = (RuleCall)cExpressionCompletionAssignment_1.eContents().get(0);
		
		////NameToExpressionCompletionInLocalNameDeclaration : // ADDED
		//
		////	/ *=> ( nameToPrimary = NameToPrimaryExpression )? primaryToExpressionCompletion = PrimaryToExpressionCompletion* /
		//
		////	nameToPrimary = NameToPrimaryExpressionInLocalNameDeclaration / *NameToPrimaryExpression* / primaryToExpressionCompletion = PrimaryToExpressionCompletion
		//
		////;
		//
		////
		//
		////NameToPrimaryExpressionInLocalNameDeclaration : // ADDED 
		//
		////	('.'
		//
		////		( linkOperationCompletion = LinkOperationCompletion 
		//
		////		  | classExtentExpressionCompletion = ClassExtentExpressionCompletion
		//
		////		  | feature= Name (invocation = FeatureInvocation)?// ADDED (as compared to NameToPrimaryExpression)
		//
		////		)
		//
		////	) 
		//
		////	| (sequenceConstructionCompletion = SequenceConstructionExpressionCompletion) 
		//
		////	| (behaviorInvocation = BehaviorInvocation)
		//
		////	| (index = Index) // ADDED (as compared to NameToPrimaryExpression)
		//
		////	| (sequenceOperationOrReductionOrExpansion = SequenceOperationOrReductionOrExpansion) // ADDED (as compared to NameToPrimaryExpression)
		//
		////	 
		//
		////;
		//
		//PrimaryToExpressionCompletion:
		//
		//	postFixExpressionCompletion=PostfixExpressionCompletion?
		//
		//	/ *postFixExpressionCompletion = PostfixExpressionCompletion expressionCompletion = ExpressionCompletion* /
		//
		//	expressionCompletion=ExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//postFixExpressionCompletion=PostfixExpressionCompletion?
		//
		/// *postFixExpressionCompletion = PostfixExpressionCompletion expressionCompletion = ExpressionCompletion* /
		//
		//expressionCompletion=ExpressionCompletion
		public Group getGroup() { return cGroup; }

		//postFixExpressionCompletion=PostfixExpressionCompletion?
		public Assignment getPostFixExpressionCompletionAssignment_0() { return cPostFixExpressionCompletionAssignment_0; }

		//PostfixExpressionCompletion
		public RuleCall getPostFixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_0() { return cPostFixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_0; }

		//expressionCompletion=ExpressionCompletion
		public Assignment getExpressionCompletionAssignment_1() { return cExpressionCompletionAssignment_1; }

		//ExpressionCompletion
		public RuleCall getExpressionCompletionExpressionCompletionParserRuleCall_1_0() { return cExpressionCompletionExpressionCompletionParserRuleCall_1_0; }
	}

	public class ExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExpressionCompletion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAssignmentExpressionCompletionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cConditionalExpressionCompletionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ExpressionCompletion:
		//
		//	AssignmentExpressionCompletion | ConditionalExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//AssignmentExpressionCompletion | ConditionalExpressionCompletion
		public Alternatives getAlternatives() { return cAlternatives; }

		//AssignmentExpressionCompletion
		public RuleCall getAssignmentExpressionCompletionParserRuleCall_0() { return cAssignmentExpressionCompletionParserRuleCall_0; }

		//ConditionalExpressionCompletion
		public RuleCall getConditionalExpressionCompletionParserRuleCall_1() { return cConditionalExpressionCompletionParserRuleCall_1; }
	}

	public class PrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrimaryExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cNameOrPrimaryExpressionAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cNameOrPrimaryExpressionNameOrPrimaryExpressionParserRuleCall_0_0_0 = (RuleCall)cNameOrPrimaryExpressionAssignment_0_0.eContents().get(0);
		private final Assignment cBaseExpressionAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cBaseExpressionBaseExpressionParserRuleCall_0_1_0 = (RuleCall)cBaseExpressionAssignment_0_1.eContents().get(0);
		private final Assignment cParenthesizedExpressionAssignment_0_2 = (Assignment)cAlternatives_0.eContents().get(2);
		private final RuleCall cParenthesizedExpressionParenthesizedExpressionParserRuleCall_0_2_0 = (RuleCall)cParenthesizedExpressionAssignment_0_2.eContents().get(0);
		private final Assignment cPrimaryExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPrimaryExpressionCompletionPrimaryExpressionCompletionParserRuleCall_1_0 = (RuleCall)cPrimaryExpressionCompletionAssignment_1.eContents().get(0);
		
		/// * PRIMARY EXPRESSIONS * / PrimaryExpression:
		//
		//	(nameOrPrimaryExpression=NameOrPrimaryExpression | baseExpression=BaseExpression |
		//
		//	parenthesizedExpression=ParenthesizedExpression) primaryExpressionCompletion=PrimaryExpressionCompletion?;
		public ParserRule getRule() { return rule; }

		//(nameOrPrimaryExpression=NameOrPrimaryExpression | baseExpression=BaseExpression |
		//
		//parenthesizedExpression=ParenthesizedExpression) primaryExpressionCompletion=PrimaryExpressionCompletion?
		public Group getGroup() { return cGroup; }

		//nameOrPrimaryExpression=NameOrPrimaryExpression | baseExpression=BaseExpression |
		//
		//parenthesizedExpression=ParenthesizedExpression
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//nameOrPrimaryExpression=NameOrPrimaryExpression
		public Assignment getNameOrPrimaryExpressionAssignment_0_0() { return cNameOrPrimaryExpressionAssignment_0_0; }

		//NameOrPrimaryExpression
		public RuleCall getNameOrPrimaryExpressionNameOrPrimaryExpressionParserRuleCall_0_0_0() { return cNameOrPrimaryExpressionNameOrPrimaryExpressionParserRuleCall_0_0_0; }

		//baseExpression=BaseExpression
		public Assignment getBaseExpressionAssignment_0_1() { return cBaseExpressionAssignment_0_1; }

		//BaseExpression
		public RuleCall getBaseExpressionBaseExpressionParserRuleCall_0_1_0() { return cBaseExpressionBaseExpressionParserRuleCall_0_1_0; }

		//parenthesizedExpression=ParenthesizedExpression
		public Assignment getParenthesizedExpressionAssignment_0_2() { return cParenthesizedExpressionAssignment_0_2; }

		//ParenthesizedExpression
		public RuleCall getParenthesizedExpressionParenthesizedExpressionParserRuleCall_0_2_0() { return cParenthesizedExpressionParenthesizedExpressionParserRuleCall_0_2_0; }

		//primaryExpressionCompletion=PrimaryExpressionCompletion?
		public Assignment getPrimaryExpressionCompletionAssignment_1() { return cPrimaryExpressionCompletionAssignment_1; }

		//PrimaryExpressionCompletion
		public RuleCall getPrimaryExpressionCompletionPrimaryExpressionCompletionParserRuleCall_1_0() { return cPrimaryExpressionCompletionPrimaryExpressionCompletionParserRuleCall_1_0; }
	}

	public class BaseExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BaseExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLiteralExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cThisExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSuperInvocationExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cInstanceCreationOrSequenceConstructionExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSequenceAnyExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//BaseExpression:
		//
		//	LiteralExpression | ThisExpression | SuperInvocationExpression | InstanceCreationOrSequenceConstructionExpression |
		//
		//	SequenceAnyExpression;
		public ParserRule getRule() { return rule; }

		//LiteralExpression | ThisExpression | SuperInvocationExpression | InstanceCreationOrSequenceConstructionExpression |
		//
		//SequenceAnyExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//LiteralExpression
		public RuleCall getLiteralExpressionParserRuleCall_0() { return cLiteralExpressionParserRuleCall_0; }

		//ThisExpression
		public RuleCall getThisExpressionParserRuleCall_1() { return cThisExpressionParserRuleCall_1; }

		//SuperInvocationExpression
		public RuleCall getSuperInvocationExpressionParserRuleCall_2() { return cSuperInvocationExpressionParserRuleCall_2; }

		//InstanceCreationOrSequenceConstructionExpression
		public RuleCall getInstanceCreationOrSequenceConstructionExpressionParserRuleCall_3() { return cInstanceCreationOrSequenceConstructionExpressionParserRuleCall_3; }

		//SequenceAnyExpression
		public RuleCall getSequenceAnyExpressionParserRuleCall_4() { return cSequenceAnyExpressionParserRuleCall_4; }
	}

	public class NameToPrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameToPrimaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cFullStopKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Assignment cLinkOperationCompletionAssignment_0_1_0 = (Assignment)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cLinkOperationCompletionLinkOperationCompletionParserRuleCall_0_1_0_0 = (RuleCall)cLinkOperationCompletionAssignment_0_1_0.eContents().get(0);
		private final Assignment cClassExtentExpressionCompletionAssignment_0_1_1 = (Assignment)cAlternatives_0_1.eContents().get(1);
		private final RuleCall cClassExtentExpressionCompletionClassExtentExpressionCompletionParserRuleCall_0_1_1_0 = (RuleCall)cClassExtentExpressionCompletionAssignment_0_1_1.eContents().get(0);
		private final Assignment cSequenceConstructionCompletionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cSequenceConstructionCompletionSequenceConstructionExpressionCompletionParserRuleCall_1_0 = (RuleCall)cSequenceConstructionCompletionAssignment_1.eContents().get(0);
		private final Assignment cBehaviorInvocationAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cBehaviorInvocationBehaviorInvocationParserRuleCall_2_0 = (RuleCall)cBehaviorInvocationAssignment_2.eContents().get(0);
		
		//NameToPrimaryExpression:
		//
		//	"." (linkOperationCompletion=LinkOperationCompletion |
		//
		//	classExtentExpressionCompletion=ClassExtentExpressionCompletion) |
		//
		//	sequenceConstructionCompletion=SequenceConstructionExpressionCompletion | behaviorInvocation=BehaviorInvocation;
		public ParserRule getRule() { return rule; }

		//"." (linkOperationCompletion=LinkOperationCompletion | classExtentExpressionCompletion=ClassExtentExpressionCompletion)
		//
		//| sequenceConstructionCompletion=SequenceConstructionExpressionCompletion | behaviorInvocation=BehaviorInvocation
		public Alternatives getAlternatives() { return cAlternatives; }

		//"." (linkOperationCompletion=LinkOperationCompletion | classExtentExpressionCompletion=ClassExtentExpressionCompletion)
		public Group getGroup_0() { return cGroup_0; }

		//"."
		public Keyword getFullStopKeyword_0_0() { return cFullStopKeyword_0_0; }

		//linkOperationCompletion=LinkOperationCompletion | classExtentExpressionCompletion=ClassExtentExpressionCompletion
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//linkOperationCompletion=LinkOperationCompletion
		public Assignment getLinkOperationCompletionAssignment_0_1_0() { return cLinkOperationCompletionAssignment_0_1_0; }

		//LinkOperationCompletion
		public RuleCall getLinkOperationCompletionLinkOperationCompletionParserRuleCall_0_1_0_0() { return cLinkOperationCompletionLinkOperationCompletionParserRuleCall_0_1_0_0; }

		//classExtentExpressionCompletion=ClassExtentExpressionCompletion
		public Assignment getClassExtentExpressionCompletionAssignment_0_1_1() { return cClassExtentExpressionCompletionAssignment_0_1_1; }

		//ClassExtentExpressionCompletion
		public RuleCall getClassExtentExpressionCompletionClassExtentExpressionCompletionParserRuleCall_0_1_1_0() { return cClassExtentExpressionCompletionClassExtentExpressionCompletionParserRuleCall_0_1_1_0; }

		//sequenceConstructionCompletion=SequenceConstructionExpressionCompletion
		public Assignment getSequenceConstructionCompletionAssignment_1() { return cSequenceConstructionCompletionAssignment_1; }

		//SequenceConstructionExpressionCompletion
		public RuleCall getSequenceConstructionCompletionSequenceConstructionExpressionCompletionParserRuleCall_1_0() { return cSequenceConstructionCompletionSequenceConstructionExpressionCompletionParserRuleCall_1_0; }

		//behaviorInvocation=BehaviorInvocation
		public Assignment getBehaviorInvocationAssignment_2() { return cBehaviorInvocationAssignment_2; }

		//BehaviorInvocation
		public RuleCall getBehaviorInvocationBehaviorInvocationParserRuleCall_2_0() { return cBehaviorInvocationBehaviorInvocationParserRuleCall_2_0; }
	}

	public class PrimaryExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrimaryExpressionCompletion");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexParserRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//PrimaryExpressionCompletion:
		//
		//	content+=Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index+;
		public ParserRule getRule() { return rule; }

		//content+=Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index+
		public Assignment getContentAssignment() { return cContentAssignment; }

		//Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index
		public RuleCall getContentFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexParserRuleCall_0() { return cContentFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexParserRuleCall_0; }
	}

	public class Feature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cFeatureAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cFeatureFeatureParserRuleCall_0_0_0 = (RuleCall)cFeatureAssignment_0_0.eContents().get(0);
		private final Assignment cFeatureInvocationAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cFeatureInvocationFeatureInvocationParserRuleCall_0_1_0 = (RuleCall)cFeatureInvocationAssignment_0_1.eContents().get(0);
		private final Assignment cSequenceOperationOrReductionOrExpansionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cSequenceOperationOrReductionOrExpansionSequenceOperationOrReductionOrExpansionParserRuleCall_1_0 = (RuleCall)cSequenceOperationOrReductionOrExpansionAssignment_1.eContents().get(0);
		private final Assignment cIndexAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cIndexIndexParserRuleCall_2_0 = (RuleCall)cIndexAssignment_2.eContents().get(0);
		
		//Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index:
		//
		//	feature=Feature featureInvocation=FeatureInvocation? |
		//
		//	sequenceOperationOrReductionOrExpansion=SequenceOperationOrReductionOrExpansion | index=Index;
		public ParserRule getRule() { return rule; }

		//feature=Feature featureInvocation=FeatureInvocation? |
		//
		//sequenceOperationOrReductionOrExpansion=SequenceOperationOrReductionOrExpansion | index=Index
		public Alternatives getAlternatives() { return cAlternatives; }

		//feature=Feature featureInvocation=FeatureInvocation?
		public Group getGroup_0() { return cGroup_0; }

		//feature=Feature
		public Assignment getFeatureAssignment_0_0() { return cFeatureAssignment_0_0; }

		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_0_0_0() { return cFeatureFeatureParserRuleCall_0_0_0; }

		//featureInvocation=FeatureInvocation?
		public Assignment getFeatureInvocationAssignment_0_1() { return cFeatureInvocationAssignment_0_1; }

		//FeatureInvocation
		public RuleCall getFeatureInvocationFeatureInvocationParserRuleCall_0_1_0() { return cFeatureInvocationFeatureInvocationParserRuleCall_0_1_0; }

		//sequenceOperationOrReductionOrExpansion=SequenceOperationOrReductionOrExpansion
		public Assignment getSequenceOperationOrReductionOrExpansionAssignment_1() { return cSequenceOperationOrReductionOrExpansionAssignment_1; }

		//SequenceOperationOrReductionOrExpansion
		public RuleCall getSequenceOperationOrReductionOrExpansionSequenceOperationOrReductionOrExpansionParserRuleCall_1_0() { return cSequenceOperationOrReductionOrExpansionSequenceOperationOrReductionOrExpansionParserRuleCall_1_0; }

		//index=Index
		public Assignment getIndexAssignment_2() { return cIndexAssignment_2; }

		//Index
		public RuleCall getIndexIndexParserRuleCall_2_0() { return cIndexIndexParserRuleCall_2_0; }
	}

	public class LiteralExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralExpression");
		private final Assignment cExpressionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionPRIMITIVE_LITERALParserRuleCall_0 = (RuleCall)cExpressionAssignment.eContents().get(0);
		
		/// * LITERAL EXPRESSIONS * / LiteralExpression:
		//
		//	expression=PRIMITIVE_LITERAL;
		public ParserRule getRule() { return rule; }

		//expression=PRIMITIVE_LITERAL
		public Assignment getExpressionAssignment() { return cExpressionAssignment; }

		//PRIMITIVE_LITERAL
		public RuleCall getExpressionPRIMITIVE_LITERALParserRuleCall_0() { return cExpressionPRIMITIVE_LITERALParserRuleCall_0; }
	}

	public class NameOrPrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameOrPrimaryExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPotentiallyAmbiguousQualifiedNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPotentiallyAmbiguousQualifiedNameQualifiedNameWithoutBindingParserRuleCall_0_0 = (RuleCall)cPotentiallyAmbiguousQualifiedNameAssignment_0.eContents().get(0);
		private final Assignment cNameToPrimaryExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameToPrimaryExpressionNameToPrimaryExpressionParserRuleCall_1_0 = (RuleCall)cNameToPrimaryExpressionAssignment_1.eContents().get(0);
		
		/// * NAME EXPRESSIONS * / NameOrPrimaryExpression: //potentiallyAmbiguousQualifiedName = PotentiallyAmbiguousQualifiedName
		//
		//	potentiallyAmbiguousQualifiedName= / *QualifiedName* / QualifiedNameWithoutBinding
		//
		//	nameToPrimaryExpression=NameToPrimaryExpression?;
		public ParserRule getRule() { return rule; }

		////potentiallyAmbiguousQualifiedName = PotentiallyAmbiguousQualifiedName
		//
		//potentiallyAmbiguousQualifiedName= / *QualifiedName* / QualifiedNameWithoutBinding
		//
		//nameToPrimaryExpression=NameToPrimaryExpression?
		public Group getGroup() { return cGroup; }

		////potentiallyAmbiguousQualifiedName = PotentiallyAmbiguousQualifiedName
		//
		//potentiallyAmbiguousQualifiedName= / *QualifiedName* / QualifiedNameWithoutBinding
		public Assignment getPotentiallyAmbiguousQualifiedNameAssignment_0() { return cPotentiallyAmbiguousQualifiedNameAssignment_0; }

		/// *QualifiedName* / QualifiedNameWithoutBinding
		public RuleCall getPotentiallyAmbiguousQualifiedNameQualifiedNameWithoutBindingParserRuleCall_0_0() { return cPotentiallyAmbiguousQualifiedNameQualifiedNameWithoutBindingParserRuleCall_0_0; }

		//nameToPrimaryExpression=NameToPrimaryExpression?
		public Assignment getNameToPrimaryExpressionAssignment_1() { return cNameToPrimaryExpressionAssignment_1; }

		//NameToPrimaryExpression
		public RuleCall getNameToPrimaryExpressionNameToPrimaryExpressionParserRuleCall_1_0() { return cNameToPrimaryExpressionNameToPrimaryExpressionParserRuleCall_1_0; }
	}

	public class ThisExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ThisExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cThisExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cThisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTupleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTupleTupleParserRuleCall_2_0 = (RuleCall)cTupleAssignment_2.eContents().get(0);
		
		/// * THIS EXPRESSIONS * / ThisExpression:
		//
		//	{ThisExpression} "this" tuple=Tuple?;
		public ParserRule getRule() { return rule; }

		//{ThisExpression} "this" tuple=Tuple?
		public Group getGroup() { return cGroup; }

		//{ThisExpression}
		public Action getThisExpressionAction_0() { return cThisExpressionAction_0; }

		//"this"
		public Keyword getThisKeyword_1() { return cThisKeyword_1; }

		//tuple=Tuple?
		public Assignment getTupleAssignment_2() { return cTupleAssignment_2; }

		//Tuple
		public RuleCall getTupleTupleParserRuleCall_2_0() { return cTupleTupleParserRuleCall_2_0; }
	}

	public class ParenthesizedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ParenthesizedExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		/// * PARENTHESIZED EXPRESSIONS * / ParenthesizedExpression:
		//
		//	"(" expression=Expression ")";
		public ParserRule getRule() { return rule; }

		//"(" expression=Expression ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFullStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// * PROPERTY ACCESS EXPRESSIONS * / Feature: //'.' nameBinding = NameBinding
		//
		//	"." name=Name;
		public ParserRule getRule() { return rule; }

		////'.' nameBinding = NameBinding
		//
		//"." name=Name
		public Group getGroup() { return cGroup; }

		////'.' nameBinding = NameBinding
		//
		//"."
		public Keyword getFullStopKeyword_0() { return cFullStopKeyword_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }
	}

	public class TupleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Tuple");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTupleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cNamedTupleExpressionListAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cNamedTupleExpressionListNamedTupleExpressionListParserRuleCall_2_0_0 = (RuleCall)cNamedTupleExpressionListAssignment_2_0.eContents().get(0);
		private final Assignment cPositionalTupleExpressionListAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_1_0 = (RuleCall)cPositionalTupleExpressionListAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		/// * INVOCATION EXPRESSIONS * / Tuple:
		//
		/// * {Tuple}'(' ( namedTupleExpressionList = NamedTupleExpressionList | ( positionalTupleExpressionList = PositionalTupleExpressionList )? ) ')' * /
		//
		//	{Tuple} "(" (namedTupleExpressionList=NamedTupleExpressionList |
		//
		//	positionalTupleExpressionList=PositionalTupleExpressionList)? ")";
		public ParserRule getRule() { return rule; }

		/// * {Tuple}'(' ( namedTupleExpressionList = NamedTupleExpressionList | ( positionalTupleExpressionList = PositionalTupleExpressionList )? ) ')' * /
		//
		//{Tuple} "(" (namedTupleExpressionList=NamedTupleExpressionList |
		//
		//positionalTupleExpressionList=PositionalTupleExpressionList)? ")"
		public Group getGroup() { return cGroup; }

		/// * {Tuple}'(' ( namedTupleExpressionList = NamedTupleExpressionList | ( positionalTupleExpressionList = PositionalTupleExpressionList )? ) ')' * /
		//
		//{Tuple}
		public Action getTupleAction_0() { return cTupleAction_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(namedTupleExpressionList=NamedTupleExpressionList | positionalTupleExpressionList=PositionalTupleExpressionList)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//namedTupleExpressionList=NamedTupleExpressionList
		public Assignment getNamedTupleExpressionListAssignment_2_0() { return cNamedTupleExpressionListAssignment_2_0; }

		//NamedTupleExpressionList
		public RuleCall getNamedTupleExpressionListNamedTupleExpressionListParserRuleCall_2_0_0() { return cNamedTupleExpressionListNamedTupleExpressionListParserRuleCall_2_0_0; }

		//positionalTupleExpressionList=PositionalTupleExpressionList
		public Assignment getPositionalTupleExpressionListAssignment_2_1() { return cPositionalTupleExpressionListAssignment_2_1; }

		//PositionalTupleExpressionList
		public RuleCall getPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_1_0() { return cPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class PositionalTupleExpressionListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PositionalTupleExpressionList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_1_0 = (RuleCall)cExpressionAssignment_1_1.eContents().get(0);
		
		//PositionalTupleExpressionList: //expression = Expression positionalTupleExpressionListCompletion = PositionalTupleExpressionListCompletion
		//
		//	expression+=Expression ("," expression+=Expression)*;
		public ParserRule getRule() { return rule; }

		////expression = Expression positionalTupleExpressionListCompletion = PositionalTupleExpressionListCompletion
		//
		//expression+=Expression ("," expression+=Expression)*
		public Group getGroup() { return cGroup; }

		////expression = Expression positionalTupleExpressionListCompletion = PositionalTupleExpressionListCompletion
		//
		//expression+=Expression
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0_0() { return cExpressionExpressionParserRuleCall_0_0; }

		//("," expression+=Expression)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//expression+=Expression
		public Assignment getExpressionAssignment_1_1() { return cExpressionAssignment_1_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_1_0() { return cExpressionExpressionParserRuleCall_1_1_0; }
	}

	public class PositionalTupleExpressionListCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PositionalTupleExpressionListCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPositionalTupleExpressionListCompletionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_1_0 = (RuleCall)cExpressionAssignment_1_1.eContents().get(0);
		
		//PositionalTupleExpressionListCompletion:
		//
		//	{PositionalTupleExpressionListCompletion} ("," expression+=Expression)*;
		public ParserRule getRule() { return rule; }

		//{PositionalTupleExpressionListCompletion} ("," expression+=Expression)*
		public Group getGroup() { return cGroup; }

		//{PositionalTupleExpressionListCompletion}
		public Action getPositionalTupleExpressionListCompletionAction_0() { return cPositionalTupleExpressionListCompletionAction_0; }

		//("," expression+=Expression)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//expression+=Expression
		public Assignment getExpressionAssignment_1_1() { return cExpressionAssignment_1_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_1_0() { return cExpressionExpressionParserRuleCall_1_1_0; }
	}

	public class NamedTupleExpressionListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamedTupleExpressionList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamedExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamedExpressionNamedExpressionParserRuleCall_0_0 = (RuleCall)cNamedExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNamedExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNamedExpressionNamedExpressionParserRuleCall_1_1_0 = (RuleCall)cNamedExpressionAssignment_1_1.eContents().get(0);
		
		//NamedTupleExpressionList:
		//
		//	namedExpression+=NamedExpression ("," namedExpression+=NamedExpression)*;
		public ParserRule getRule() { return rule; }

		//namedExpression+=NamedExpression ("," namedExpression+=NamedExpression)*
		public Group getGroup() { return cGroup; }

		//namedExpression+=NamedExpression
		public Assignment getNamedExpressionAssignment_0() { return cNamedExpressionAssignment_0; }

		//NamedExpression
		public RuleCall getNamedExpressionNamedExpressionParserRuleCall_0_0() { return cNamedExpressionNamedExpressionParserRuleCall_0_0; }

		//("," namedExpression+=NamedExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//namedExpression+=NamedExpression
		public Assignment getNamedExpressionAssignment_1_1() { return cNamedExpressionAssignment_1_1; }

		//NamedExpression
		public RuleCall getNamedExpressionNamedExpressionParserRuleCall_1_1_0() { return cNamedExpressionNamedExpressionParserRuleCall_1_1_0; }
	}

	public class NamedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamedExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//NamedExpression:
		//
		//	=> name=Name "=>" expression=Expression;
		public ParserRule getRule() { return rule; }

		//=> name=Name "=>" expression=Expression
		public Group getGroup() { return cGroup; }

		//=> name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }

		//expression=Expression
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }
	}

	public class BehaviorInvocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BehaviorInvocation");
		private final Assignment cTupleAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTupleTupleParserRuleCall_0 = (RuleCall)cTupleAssignment.eContents().get(0);
		
		//BehaviorInvocation:
		//
		//	tuple=Tuple;
		public ParserRule getRule() { return rule; }

		//tuple=Tuple
		public Assignment getTupleAssignment() { return cTupleAssignment; }

		//Tuple
		public RuleCall getTupleTupleParserRuleCall_0() { return cTupleTupleParserRuleCall_0; }
	}

	public class FeatureInvocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureInvocation");
		private final Assignment cTupleAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTupleTupleParserRuleCall_0 = (RuleCall)cTupleAssignment.eContents().get(0);
		
		//FeatureInvocation:
		//
		//	tuple=Tuple;
		public ParserRule getRule() { return rule; }

		//tuple=Tuple
		public Assignment getTupleAssignment() { return cTupleAssignment; }

		//Tuple
		public RuleCall getTupleTupleParserRuleCall_0() { return cTupleTupleParserRuleCall_0; }
	}

	public class SuperInvocationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SuperInvocationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSuperKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_1_1_0 = (RuleCall)cQualifiedNameAssignment_1_1.eContents().get(0);
		private final Assignment cTupleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTupleTupleParserRuleCall_2_0 = (RuleCall)cTupleAssignment_2.eContents().get(0);
		
		//SuperInvocationExpression:
		//
		//	"super" ("." qualifiedName=QualifiedName)? tuple=Tuple;
		public ParserRule getRule() { return rule; }

		//"super" ("." qualifiedName=QualifiedName)? tuple=Tuple
		public Group getGroup() { return cGroup; }

		//"super"
		public Keyword getSuperKeyword_0() { return cSuperKeyword_0; }

		//("." qualifiedName=QualifiedName)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//qualifiedName=QualifiedName
		public Assignment getQualifiedNameAssignment_1_1() { return cQualifiedNameAssignment_1_1; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_1_1_0() { return cQualifiedNameQualifiedNameParserRuleCall_1_1_0; }

		//tuple=Tuple
		public Assignment getTupleAssignment_2() { return cTupleAssignment_2; }

		//Tuple
		public RuleCall getTupleTupleParserRuleCall_2_0() { return cTupleTupleParserRuleCall_2_0; }
	}

	public class InstanceCreationOrSequenceConstructionExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InstanceCreationOrSequenceConstructionExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cQualifiedNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cSequenceConstructionExpressionCompletionAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cSequenceConstructionExpressionCompletionSequenceConstructionExpressionCompletionParserRuleCall_2_0_0 = (RuleCall)cSequenceConstructionExpressionCompletionAssignment_2_0.eContents().get(0);
		private final Assignment cTupleAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cTupleTupleParserRuleCall_2_1_0 = (RuleCall)cTupleAssignment_2_1.eContents().get(0);
		
		/// * INSTANCE CREATION EXPRESSIONS * / InstanceCreationOrSequenceConstructionExpression:
		//
		//	"new" qualifiedName=QualifiedName (sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion
		//
		//	| tuple=Tuple);
		public ParserRule getRule() { return rule; }

		//"new" qualifiedName=QualifiedName (sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion |
		//
		//tuple=Tuple)
		public Group getGroup() { return cGroup; }

		//"new"
		public Keyword getNewKeyword_0() { return cNewKeyword_0; }

		//qualifiedName=QualifiedName
		public Assignment getQualifiedNameAssignment_1() { return cQualifiedNameAssignment_1; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_1_0() { return cQualifiedNameQualifiedNameParserRuleCall_1_0; }

		//sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion | tuple=Tuple
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion
		public Assignment getSequenceConstructionExpressionCompletionAssignment_2_0() { return cSequenceConstructionExpressionCompletionAssignment_2_0; }

		//SequenceConstructionExpressionCompletion
		public RuleCall getSequenceConstructionExpressionCompletionSequenceConstructionExpressionCompletionParserRuleCall_2_0_0() { return cSequenceConstructionExpressionCompletionSequenceConstructionExpressionCompletionParserRuleCall_2_0_0; }

		//tuple=Tuple
		public Assignment getTupleAssignment_2_1() { return cTupleAssignment_2_1; }

		//Tuple
		public RuleCall getTupleTupleParserRuleCall_2_1_0() { return cTupleTupleParserRuleCall_2_1_0; }
	}

	public class LinkOperationCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LinkOperationCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLinkOperationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLinkOperationLinkOperationEnumRuleCall_0_0 = (RuleCall)cLinkOperationAssignment_0.eContents().get(0);
		private final Assignment cLinkOperationTupleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkOperationTupleLinkOperationTupleParserRuleCall_1_0 = (RuleCall)cLinkOperationTupleAssignment_1.eContents().get(0);
		
		/// * LINK OPERATION EXPRESSIONS * / LinkOperationCompletion:
		//
		//	linkOperation=LinkOperation linkOperationTuple=LinkOperationTuple;
		public ParserRule getRule() { return rule; }

		//linkOperation=LinkOperation linkOperationTuple=LinkOperationTuple
		public Group getGroup() { return cGroup; }

		//linkOperation=LinkOperation
		public Assignment getLinkOperationAssignment_0() { return cLinkOperationAssignment_0; }

		//LinkOperation
		public RuleCall getLinkOperationLinkOperationEnumRuleCall_0_0() { return cLinkOperationLinkOperationEnumRuleCall_0_0; }

		//linkOperationTuple=LinkOperationTuple
		public Assignment getLinkOperationTupleAssignment_1() { return cLinkOperationTupleAssignment_1; }

		//LinkOperationTuple
		public RuleCall getLinkOperationTupleLinkOperationTupleParserRuleCall_1_0() { return cLinkOperationTupleLinkOperationTupleParserRuleCall_1_0; }
	}

	public class LinkOperationTupleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LinkOperationTuple");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLinkOperationTupleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cNameAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_2_0_0_0 = (RuleCall)cNameAssignment_2_0_0.eContents().get(0);
		private final Alternatives cAlternatives_2_0_1 = (Alternatives)cGroup_2_0.eContents().get(1);
		private final Group cGroup_2_0_1_0 = (Group)cAlternatives_2_0_1.eContents().get(0);
		private final Assignment cIndexAssignment_2_0_1_0_0 = (Assignment)cGroup_2_0_1_0.eContents().get(0);
		private final RuleCall cIndexIndexParserRuleCall_2_0_1_0_0_0 = (RuleCall)cIndexAssignment_2_0_1_0_0.eContents().get(0);
		private final Alternatives cAlternatives_2_0_1_0_1 = (Alternatives)cGroup_2_0_1_0.eContents().get(1);
		private final Group cGroup_2_0_1_0_1_0 = (Group)cAlternatives_2_0_1_0_1.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2_0_1_0_1_0_0 = (Keyword)cGroup_2_0_1_0_1_0.eContents().get(0);
		private final Assignment cIndexNamedExpressionListCompletionAssignment_2_0_1_0_1_0_1 = (Assignment)cGroup_2_0_1_0_1_0.eContents().get(1);
		private final RuleCall cIndexNamedExpressionListCompletionIndexedNamedExpressionListCompletionParserRuleCall_2_0_1_0_1_0_1_0 = (RuleCall)cIndexNamedExpressionListCompletionAssignment_2_0_1_0_1_0_1.eContents().get(0);
		private final Group cGroup_2_0_1_0_1_1 = (Group)cAlternatives_2_0_1_0_1.eContents().get(1);
		private final Assignment cPrimaryToExpressionCompletionAssignment_2_0_1_0_1_1_0 = (Assignment)cGroup_2_0_1_0_1_1.eContents().get(0);
		private final RuleCall cPrimaryToExpressionCompletionPrimaryToExpressionCompletionParserRuleCall_2_0_1_0_1_1_0_0 = (RuleCall)cPrimaryToExpressionCompletionAssignment_2_0_1_0_1_1_0.eContents().get(0);
		private final Assignment cPositionalTupleExpressionListCompletionAssignment_2_0_1_0_1_1_1 = (Assignment)cGroup_2_0_1_0_1_1.eContents().get(1);
		private final RuleCall cPositionalTupleExpressionListCompletionPositionalTupleExpressionListCompletionParserRuleCall_2_0_1_0_1_1_1_0 = (RuleCall)cPositionalTupleExpressionListCompletionAssignment_2_0_1_0_1_1_1.eContents().get(0);
		private final Group cGroup_2_0_1_1 = (Group)cAlternatives_2_0_1.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2_0_1_1_0 = (Keyword)cGroup_2_0_1_1.eContents().get(0);
		private final Assignment cIndexedNamedExpressionListCompletionAssignment_2_0_1_1_1 = (Assignment)cGroup_2_0_1_1.eContents().get(1);
		private final RuleCall cIndexedNamedExpressionListCompletionIndexedNamedExpressionListCompletionParserRuleCall_2_0_1_1_1_0 = (RuleCall)cIndexedNamedExpressionListCompletionAssignment_2_0_1_1_1.eContents().get(0);
		private final Assignment cPositionalTupleExpressionListCompletionAssignment_2_0_1_2 = (Assignment)cAlternatives_2_0_1.eContents().get(2);
		private final RuleCall cPositionalTupleExpressionListCompletionPositionalTupleExpressionListCompletionParserRuleCall_2_0_1_2_0 = (RuleCall)cPositionalTupleExpressionListCompletionAssignment_2_0_1_2.eContents().get(0);
		private final Group cGroup_2_0_1_3 = (Group)cAlternatives_2_0_1.eContents().get(3);
		private final Assignment cNameToExpressionCompletionAssignment_2_0_1_3_0 = (Assignment)cGroup_2_0_1_3.eContents().get(0);
		private final RuleCall cNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_2_0_1_3_0_0 = (RuleCall)cNameToExpressionCompletionAssignment_2_0_1_3_0.eContents().get(0);
		private final Keyword cCommaKeyword_2_0_1_3_1 = (Keyword)cGroup_2_0_1_3.eContents().get(1);
		private final Assignment cPositionalTupleExpressionListAssignment_2_0_1_3_2 = (Assignment)cGroup_2_0_1_3.eContents().get(2);
		private final RuleCall cPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_0_1_3_2_0 = (RuleCall)cPositionalTupleExpressionListAssignment_2_0_1_3_2.eContents().get(0);
		private final Assignment cPositionalTupleExpressionListAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_1_0 = (RuleCall)cPositionalTupleExpressionListAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//LinkOperationTuple:
		//
		//	{LinkOperationTuple} "(" (=> name=Name (=> index=Index ("=>"
		//
		//	indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
		//
		//	primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//	positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion) | "=>"
		//
		//	indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | positionalTupleExpressionListCompletion= // ADDED
		//
		//	PositionalTupleExpressionListCompletion | nameToExpressionCompletion=NameToExpressionCompletion ","
		//
		//	positionalTupleExpressionList= // ADDED
		//
		//	PositionalTupleExpressionList) | positionalTupleExpressionList=PositionalTupleExpressionList)? ")";
		public ParserRule getRule() { return rule; }

		//{LinkOperationTuple} "(" (=> name=Name (=> index=Index ("=>"
		//
		//indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
		//
		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion) | "=>"
		//
		//indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | positionalTupleExpressionListCompletion= // ADDED
		//
		//PositionalTupleExpressionListCompletion | nameToExpressionCompletion=NameToExpressionCompletion ","
		//
		//positionalTupleExpressionList= // ADDED
		//
		//PositionalTupleExpressionList) | positionalTupleExpressionList=PositionalTupleExpressionList)? ")"
		public Group getGroup() { return cGroup; }

		//{LinkOperationTuple}
		public Action getLinkOperationTupleAction_0() { return cLinkOperationTupleAction_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(=> name=Name (=> index=Index ("=>" indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
		//
		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion) | "=>"
		//
		//indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | positionalTupleExpressionListCompletion= // ADDED
		//
		//PositionalTupleExpressionListCompletion | nameToExpressionCompletion=NameToExpressionCompletion ","
		//
		//positionalTupleExpressionList= // ADDED
		//
		//PositionalTupleExpressionList) | positionalTupleExpressionList=PositionalTupleExpressionList)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//=> name=Name (=> index=Index ("=>" indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
		//
		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion) | "=>"
		//
		//indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | positionalTupleExpressionListCompletion= // ADDED
		//
		//PositionalTupleExpressionListCompletion | nameToExpressionCompletion=NameToExpressionCompletion ","
		//
		//positionalTupleExpressionList= // ADDED
		//
		//PositionalTupleExpressionList)
		public Group getGroup_2_0() { return cGroup_2_0; }

		//=> name=Name
		public Assignment getNameAssignment_2_0_0() { return cNameAssignment_2_0_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_2_0_0_0() { return cNameNameParserRuleCall_2_0_0_0; }

		//=> index=Index ("=>" indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
		//
		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion) | "=>"
		//
		//indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | positionalTupleExpressionListCompletion= // ADDED
		//
		//PositionalTupleExpressionListCompletion | nameToExpressionCompletion=NameToExpressionCompletion ","
		//
		//positionalTupleExpressionList= // ADDED
		//
		//PositionalTupleExpressionList
		public Alternatives getAlternatives_2_0_1() { return cAlternatives_2_0_1; }

		//=> index=Index ("=>" indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
		//
		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion)
		public Group getGroup_2_0_1_0() { return cGroup_2_0_1_0; }

		//=> index=Index
		public Assignment getIndexAssignment_2_0_1_0_0() { return cIndexAssignment_2_0_1_0_0; }

		//Index
		public RuleCall getIndexIndexParserRuleCall_2_0_1_0_0_0() { return cIndexIndexParserRuleCall_2_0_1_0_0_0; }

		//"=>" indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
		//
		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion
		public Alternatives getAlternatives_2_0_1_0_1() { return cAlternatives_2_0_1_0_1; }

		//"=>" indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion
		public Group getGroup_2_0_1_0_1_0() { return cGroup_2_0_1_0_1_0; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_2_0_1_0_1_0_0() { return cEqualsSignGreaterThanSignKeyword_2_0_1_0_1_0_0; }

		//indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion
		public Assignment getIndexNamedExpressionListCompletionAssignment_2_0_1_0_1_0_1() { return cIndexNamedExpressionListCompletionAssignment_2_0_1_0_1_0_1; }

		//IndexedNamedExpressionListCompletion
		public RuleCall getIndexNamedExpressionListCompletionIndexedNamedExpressionListCompletionParserRuleCall_2_0_1_0_1_0_1_0() { return cIndexNamedExpressionListCompletionIndexedNamedExpressionListCompletionParserRuleCall_2_0_1_0_1_0_1_0; }

		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		//
		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion
		public Group getGroup_2_0_1_0_1_1() { return cGroup_2_0_1_0_1_1; }

		//primaryToExpressionCompletion=PrimaryToExpressionCompletion
		public Assignment getPrimaryToExpressionCompletionAssignment_2_0_1_0_1_1_0() { return cPrimaryToExpressionCompletionAssignment_2_0_1_0_1_1_0; }

		//PrimaryToExpressionCompletion
		public RuleCall getPrimaryToExpressionCompletionPrimaryToExpressionCompletionParserRuleCall_2_0_1_0_1_1_0_0() { return cPrimaryToExpressionCompletionPrimaryToExpressionCompletionParserRuleCall_2_0_1_0_1_1_0_0; }

		//positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion
		public Assignment getPositionalTupleExpressionListCompletionAssignment_2_0_1_0_1_1_1() { return cPositionalTupleExpressionListCompletionAssignment_2_0_1_0_1_1_1; }

		//PositionalTupleExpressionListCompletion
		public RuleCall getPositionalTupleExpressionListCompletionPositionalTupleExpressionListCompletionParserRuleCall_2_0_1_0_1_1_1_0() { return cPositionalTupleExpressionListCompletionPositionalTupleExpressionListCompletionParserRuleCall_2_0_1_0_1_1_1_0; }

		//"=>" indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion
		public Group getGroup_2_0_1_1() { return cGroup_2_0_1_1; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_2_0_1_1_0() { return cEqualsSignGreaterThanSignKeyword_2_0_1_1_0; }

		//indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion
		public Assignment getIndexedNamedExpressionListCompletionAssignment_2_0_1_1_1() { return cIndexedNamedExpressionListCompletionAssignment_2_0_1_1_1; }

		//IndexedNamedExpressionListCompletion
		public RuleCall getIndexedNamedExpressionListCompletionIndexedNamedExpressionListCompletionParserRuleCall_2_0_1_1_1_0() { return cIndexedNamedExpressionListCompletionIndexedNamedExpressionListCompletionParserRuleCall_2_0_1_1_1_0; }

		//positionalTupleExpressionListCompletion= // ADDED
		//
		//PositionalTupleExpressionListCompletion
		public Assignment getPositionalTupleExpressionListCompletionAssignment_2_0_1_2() { return cPositionalTupleExpressionListCompletionAssignment_2_0_1_2; }

		//// ADDED
		//
		//PositionalTupleExpressionListCompletion
		public RuleCall getPositionalTupleExpressionListCompletionPositionalTupleExpressionListCompletionParserRuleCall_2_0_1_2_0() { return cPositionalTupleExpressionListCompletionPositionalTupleExpressionListCompletionParserRuleCall_2_0_1_2_0; }

		//nameToExpressionCompletion=NameToExpressionCompletion "," positionalTupleExpressionList= // ADDED
		//
		//PositionalTupleExpressionList
		public Group getGroup_2_0_1_3() { return cGroup_2_0_1_3; }

		//nameToExpressionCompletion=NameToExpressionCompletion
		public Assignment getNameToExpressionCompletionAssignment_2_0_1_3_0() { return cNameToExpressionCompletionAssignment_2_0_1_3_0; }

		//NameToExpressionCompletion
		public RuleCall getNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_2_0_1_3_0_0() { return cNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_2_0_1_3_0_0; }

		//","
		public Keyword getCommaKeyword_2_0_1_3_1() { return cCommaKeyword_2_0_1_3_1; }

		//positionalTupleExpressionList= // ADDED
		//
		//PositionalTupleExpressionList
		public Assignment getPositionalTupleExpressionListAssignment_2_0_1_3_2() { return cPositionalTupleExpressionListAssignment_2_0_1_3_2; }

		//// ADDED
		//
		//PositionalTupleExpressionList
		public RuleCall getPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_0_1_3_2_0() { return cPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_0_1_3_2_0; }

		//positionalTupleExpressionList=PositionalTupleExpressionList
		public Assignment getPositionalTupleExpressionListAssignment_2_1() { return cPositionalTupleExpressionListAssignment_2_1; }

		//PositionalTupleExpressionList
		public RuleCall getPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_1_0() { return cPositionalTupleExpressionListPositionalTupleExpressionListParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class IndexedNamedExpressionListCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IndexedNamedExpressionListCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cIndexedNamedExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cIndexedNamedExpressionIndexedNamedExpressionParserRuleCall_1_1_0 = (RuleCall)cIndexedNamedExpressionAssignment_1_1.eContents().get(0);
		
		//IndexedNamedExpressionListCompletion:
		//
		//	expression=Expression ("," indexedNamedExpression+=IndexedNamedExpression)*;
		public ParserRule getRule() { return rule; }

		//expression=Expression ("," indexedNamedExpression+=IndexedNamedExpression)*
		public Group getGroup() { return cGroup; }

		//expression=Expression
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0_0() { return cExpressionExpressionParserRuleCall_0_0; }

		//("," indexedNamedExpression+=IndexedNamedExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//indexedNamedExpression+=IndexedNamedExpression
		public Assignment getIndexedNamedExpressionAssignment_1_1() { return cIndexedNamedExpressionAssignment_1_1; }

		//IndexedNamedExpression
		public RuleCall getIndexedNamedExpressionIndexedNamedExpressionParserRuleCall_1_1_0() { return cIndexedNamedExpressionIndexedNamedExpressionParserRuleCall_1_1_0; }
	}

	public class IndexedNamedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IndexedNamedExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cIndexAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIndexIndexParserRuleCall_1_0 = (RuleCall)cIndexAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//IndexedNamedExpression:
		//
		//	name=Name index=Index? "=>" expression=Expression;
		public ParserRule getRule() { return rule; }

		//name=Name index=Index? "=>" expression=Expression
		public Group getGroup() { return cGroup; }

		//name=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//index=Index?
		public Assignment getIndexAssignment_1() { return cIndexAssignment_1; }

		//Index
		public RuleCall getIndexIndexParserRuleCall_1_0() { return cIndexIndexParserRuleCall_1_0; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_2() { return cEqualsSignGreaterThanSignKeyword_2; }

		//expression=Expression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_3_0() { return cExpressionExpressionParserRuleCall_3_0; }
	}

	public class ClassExtentExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassExtentExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cClassExtentExpressionCompletionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAllInstancesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		///// * CLASS EXTENT EXPRESSIONS * /
		//
		//ClassExtentExpressionCompletion:
		//
		//	{ClassExtentExpressionCompletion} "allInstances" "(" ")";
		public ParserRule getRule() { return rule; }

		//{ClassExtentExpressionCompletion} "allInstances" "(" ")"
		public Group getGroup() { return cGroup; }

		//{ClassExtentExpressionCompletion}
		public Action getClassExtentExpressionCompletionAction_0() { return cClassExtentExpressionCompletionAction_0; }

		//"allInstances"
		public Keyword getAllInstancesKeyword_1() { return cAllInstancesKeyword_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class SequenceAnyExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceAnyExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSequenceAnyExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cAnyKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cSequenceConstructionExpressionCompletionAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cSequenceConstructionExpressionCompletionSequenceConstructionExpressionCompletionParserRuleCall_1_0_1_0 = (RuleCall)cSequenceConstructionExpressionCompletionAssignment_1_0_1.eContents().get(0);
		private final Keyword cNullKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		///// * SEQUENCE CONSTRUCTION EXPRESSIONS * /
		//
		//SequenceAnyExpression:
		//
		//	{SequenceAnyExpression} ("any" sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion |
		//
		//	"null");
		public ParserRule getRule() { return rule; }

		//{SequenceAnyExpression} ("any" sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion |
		//
		//"null")
		public Group getGroup() { return cGroup; }

		//{SequenceAnyExpression}
		public Action getSequenceAnyExpressionAction_0() { return cSequenceAnyExpressionAction_0; }

		//"any" sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion | "null"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"any" sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion
		public Group getGroup_1_0() { return cGroup_1_0; }

		//"any"
		public Keyword getAnyKeyword_1_0_0() { return cAnyKeyword_1_0_0; }

		//sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion
		public Assignment getSequenceConstructionExpressionCompletionAssignment_1_0_1() { return cSequenceConstructionExpressionCompletionAssignment_1_0_1; }

		//SequenceConstructionExpressionCompletion
		public RuleCall getSequenceConstructionExpressionCompletionSequenceConstructionExpressionCompletionParserRuleCall_1_0_1_0() { return cSequenceConstructionExpressionCompletionSequenceConstructionExpressionCompletionParserRuleCall_1_0_1_0; }

		//"null"
		public Keyword getNullKeyword_1_1() { return cNullKeyword_1_1; }
	}

	public class SequenceConstructionExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceConstructionExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSequenceConstructionExpressionCompletionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cMultiplicityIndicatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMultiplicityIndicatorMultiplicityIndicatorParserRuleCall_1_0 = (RuleCall)cMultiplicityIndicatorAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSequenceElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSequenceElementsSequenceElementsParserRuleCall_3_0 = (RuleCall)cSequenceElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SequenceConstructionExpressionCompletion:
		//
		//	{SequenceConstructionExpressionCompletion} multiplicityIndicator=MultiplicityIndicator? "{"
		//
		//	sequenceElements=SequenceElements? "}";
		public ParserRule getRule() { return rule; }

		//{SequenceConstructionExpressionCompletion} multiplicityIndicator=MultiplicityIndicator? "{"
		//
		//sequenceElements=SequenceElements? "}"
		public Group getGroup() { return cGroup; }

		//{SequenceConstructionExpressionCompletion}
		public Action getSequenceConstructionExpressionCompletionAction_0() { return cSequenceConstructionExpressionCompletionAction_0; }

		//multiplicityIndicator=MultiplicityIndicator?
		public Assignment getMultiplicityIndicatorAssignment_1() { return cMultiplicityIndicatorAssignment_1; }

		//MultiplicityIndicator
		public RuleCall getMultiplicityIndicatorMultiplicityIndicatorParserRuleCall_1_0() { return cMultiplicityIndicatorMultiplicityIndicatorParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//sequenceElements=SequenceElements?
		public Assignment getSequenceElementsAssignment_3() { return cSequenceElementsAssignment_3; }

		//SequenceElements
		public RuleCall getSequenceElementsSequenceElementsParserRuleCall_3_0() { return cSequenceElementsSequenceElementsParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class MultiplicityIndicatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MultiplicityIndicator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMultiplicityIndicatorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MultiplicityIndicator:
		//
		//	{MultiplicityIndicator} "[" "]";
		public ParserRule getRule() { return rule; }

		//{MultiplicityIndicator} "[" "]"
		public Group getGroup() { return cGroup; }

		//{MultiplicityIndicator}
		public Action getMultiplicityIndicatorAction_0() { return cMultiplicityIndicatorAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}

	public class SequenceElementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceElements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cExpression1Assignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cExpression1ExpressionParserRuleCall_0_0_0 = (RuleCall)cExpression1Assignment_0_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cAlternatives_0_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_0_1_0_0 = (Keyword)cGroup_0_1_0.eContents().get(0);
		private final Assignment cExpression2Assignment_0_1_0_1 = (Assignment)cGroup_0_1_0.eContents().get(1);
		private final RuleCall cExpression2ExpressionParserRuleCall_0_1_0_1_0 = (RuleCall)cExpression2Assignment_0_1_0_1.eContents().get(0);
		private final Assignment cSequenceElementListCompletionAssignment_0_1_1 = (Assignment)cAlternatives_0_1.eContents().get(1);
		private final RuleCall cSequenceElementListCompletionSequenceElementListCompletionParserRuleCall_0_1_1_0 = (RuleCall)cSequenceElementListCompletionAssignment_0_1_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cSequenceInitializationExpressionAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cSequenceInitializationExpressionSequenceInitializationExpressionParserRuleCall_1_0_0 = (RuleCall)cSequenceInitializationExpressionAssignment_1_0.eContents().get(0);
		private final Assignment cSequenceElementListCompletionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSequenceElementListCompletionSequenceElementListCompletionParserRuleCall_1_1_0 = (RuleCall)cSequenceElementListCompletionAssignment_1_1.eContents().get(0);
		
		//SequenceElements:
		//
		//	expression1=Expression (".." expression2=Expression | sequenceElementListCompletion=SequenceElementListCompletion) |
		//
		//	sequenceInitializationExpression=SequenceInitializationExpression
		//
		//	sequenceElementListCompletion=SequenceElementListCompletion;
		public ParserRule getRule() { return rule; }

		//expression1=Expression (".." expression2=Expression | sequenceElementListCompletion=SequenceElementListCompletion) |
		//
		//sequenceInitializationExpression=SequenceInitializationExpression
		//
		//sequenceElementListCompletion=SequenceElementListCompletion
		public Alternatives getAlternatives() { return cAlternatives; }

		//expression1=Expression (".." expression2=Expression | sequenceElementListCompletion=SequenceElementListCompletion)
		public Group getGroup_0() { return cGroup_0; }

		//expression1=Expression
		public Assignment getExpression1Assignment_0_0() { return cExpression1Assignment_0_0; }

		//Expression
		public RuleCall getExpression1ExpressionParserRuleCall_0_0_0() { return cExpression1ExpressionParserRuleCall_0_0_0; }

		//".." expression2=Expression | sequenceElementListCompletion=SequenceElementListCompletion
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//".." expression2=Expression
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_0_1_0_0() { return cFullStopFullStopKeyword_0_1_0_0; }

		//expression2=Expression
		public Assignment getExpression2Assignment_0_1_0_1() { return cExpression2Assignment_0_1_0_1; }

		//Expression
		public RuleCall getExpression2ExpressionParserRuleCall_0_1_0_1_0() { return cExpression2ExpressionParserRuleCall_0_1_0_1_0; }

		//sequenceElementListCompletion=SequenceElementListCompletion
		public Assignment getSequenceElementListCompletionAssignment_0_1_1() { return cSequenceElementListCompletionAssignment_0_1_1; }

		//SequenceElementListCompletion
		public RuleCall getSequenceElementListCompletionSequenceElementListCompletionParserRuleCall_0_1_1_0() { return cSequenceElementListCompletionSequenceElementListCompletionParserRuleCall_0_1_1_0; }

		//sequenceInitializationExpression=SequenceInitializationExpression
		//
		//sequenceElementListCompletion=SequenceElementListCompletion
		public Group getGroup_1() { return cGroup_1; }

		//sequenceInitializationExpression=SequenceInitializationExpression
		public Assignment getSequenceInitializationExpressionAssignment_1_0() { return cSequenceInitializationExpressionAssignment_1_0; }

		//SequenceInitializationExpression
		public RuleCall getSequenceInitializationExpressionSequenceInitializationExpressionParserRuleCall_1_0_0() { return cSequenceInitializationExpressionSequenceInitializationExpressionParserRuleCall_1_0_0; }

		//sequenceElementListCompletion=SequenceElementListCompletion
		public Assignment getSequenceElementListCompletionAssignment_1_1() { return cSequenceElementListCompletionAssignment_1_1; }

		//SequenceElementListCompletion
		public RuleCall getSequenceElementListCompletionSequenceElementListCompletionParserRuleCall_1_1_0() { return cSequenceElementListCompletionSequenceElementListCompletionParserRuleCall_1_1_0; }
	}

	public class SequenceElementListCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceElementListCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSequenceElementListCompletionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSequenceElementAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSequenceElementSequenceElementParserRuleCall_1_1_0 = (RuleCall)cSequenceElementAssignment_1_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SequenceElementListCompletion:
		//
		//	{SequenceElementListCompletion} ("," sequenceElement+=SequenceElement)* ","?;
		public ParserRule getRule() { return rule; }

		//{SequenceElementListCompletion} ("," sequenceElement+=SequenceElement)* ","?
		public Group getGroup() { return cGroup; }

		//{SequenceElementListCompletion}
		public Action getSequenceElementListCompletionAction_0() { return cSequenceElementListCompletionAction_0; }

		//("," sequenceElement+=SequenceElement)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//sequenceElement+=SequenceElement
		public Assignment getSequenceElementAssignment_1_1() { return cSequenceElementAssignment_1_1; }

		//SequenceElement
		public RuleCall getSequenceElementSequenceElementParserRuleCall_1_1_0() { return cSequenceElementSequenceElementParserRuleCall_1_1_0; }

		//","?
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
	}

	public class SequenceElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Assignment cSequenceInitializationExpressionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cSequenceInitializationExpressionSequenceInitializationExpressionParserRuleCall_1_0 = (RuleCall)cSequenceInitializationExpressionAssignment_1.eContents().get(0);
		
		//SequenceElement:
		//
		//	expression=Expression | sequenceInitializationExpression=SequenceInitializationExpression;
		public ParserRule getRule() { return rule; }

		//expression=Expression | sequenceInitializationExpression=SequenceInitializationExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//expression=Expression
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0_0() { return cExpressionExpressionParserRuleCall_0_0; }

		//sequenceInitializationExpression=SequenceInitializationExpression
		public Assignment getSequenceInitializationExpressionAssignment_1() { return cSequenceInitializationExpressionAssignment_1; }

		//SequenceInitializationExpression
		public RuleCall getSequenceInitializationExpressionSequenceInitializationExpressionParserRuleCall_1_0() { return cSequenceInitializationExpressionSequenceInitializationExpressionParserRuleCall_1_0; }
	}

	public class SequenceInitializationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceInitializationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsNewAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsNewNewKeyword_0_0 = (Keyword)cIsNewAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSequenceElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSequenceElementsSequenceElementsParserRuleCall_2_0 = (RuleCall)cSequenceElementsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SequenceInitializationExpression:
		//
		//	isNew?="new"? "{" sequenceElements=SequenceElements "}";
		public ParserRule getRule() { return rule; }

		//isNew?="new"? "{" sequenceElements=SequenceElements "}"
		public Group getGroup() { return cGroup; }

		//isNew?="new"?
		public Assignment getIsNewAssignment_0() { return cIsNewAssignment_0; }

		//"new"
		public Keyword getIsNewNewKeyword_0_0() { return cIsNewNewKeyword_0_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//sequenceElements=SequenceElements
		public Assignment getSequenceElementsAssignment_2() { return cSequenceElementsAssignment_2; }

		//SequenceElements
		public RuleCall getSequenceElementsSequenceElementsParserRuleCall_2_0() { return cSequenceElementsSequenceElementsParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class IndexElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Index");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		///// * SEQUENCE ACCESS EXPRESSIONS * /
		//
		//Index:
		//
		//	"[" expression=Expression "]";
		public ParserRule getRule() { return rule; }

		//"[" expression=Expression "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}

	public class SequenceOperationOrReductionOrExpansionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceOperationOrReductionOrExpansion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_1_0_0_0 = (RuleCall)cQualifiedNameAssignment_1_0_0.eContents().get(0);
		private final Assignment cTupleAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cTupleTupleParserRuleCall_1_0_1_0 = (RuleCall)cTupleAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cIsReduceAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final Keyword cIsReduceReduceKeyword_1_1_0_0 = (Keyword)cIsReduceAssignment_1_1_0.eContents().get(0);
		private final Assignment cIsOrderedAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final Keyword cIsOrderedOrderedKeyword_1_1_1_0 = (Keyword)cIsOrderedAssignment_1_1_1.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cQualifiedNameQualifiedNameWithoutBindingParserRuleCall_1_1_2_0 = (RuleCall)cQualifiedNameAssignment_1_1_2.eContents().get(0);
		private final Assignment cTemplateBindingAssignment_1_1_3 = (Assignment)cGroup_1_1.eContents().get(3);
		private final RuleCall cTemplateBindingTemplateBindingParserRuleCall_1_1_3_0 = (RuleCall)cTemplateBindingAssignment_1_1_3.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Assignment cIdAssignment_1_2_0 = (Assignment)cGroup_1_2.eContents().get(0);
		private final RuleCall cIdIDTerminalRuleCall_1_2_0_0 = (RuleCall)cIdAssignment_1_2_0.eContents().get(0);
		private final Assignment cNameAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_2_1_0 = (RuleCall)cNameAssignment_1_2_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Assignment cExpressionAssignment_1_2_3 = (Assignment)cGroup_1_2.eContents().get(3);
		private final RuleCall cExpressionExpressionParserRuleCall_1_2_3_0 = (RuleCall)cExpressionAssignment_1_2_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2_4 = (Keyword)cGroup_1_2.eContents().get(4);
		
		///// * SEQUENCE OPERATION, REDUCTION AND EXPANSION EXPRESSIONS * /
		//
		//SequenceOperationOrReductionOrExpansion:
		//
		//	"->" (qualifiedName=QualifiedName tuple=Tuple | isReduce?="reduce" isOrdered?="ordered"? => qualifiedName=
		//
		//	/ *QualifiedName* / QualifiedNameWithoutBinding => templateBinding=TemplateBinding? | id=ID name=Name "("
		//
		//	expression=Expression ")");
		public ParserRule getRule() { return rule; }

		//"->" (qualifiedName=QualifiedName tuple=Tuple | isReduce?="reduce" isOrdered?="ordered"? => qualifiedName=
		//
		/// *QualifiedName* / QualifiedNameWithoutBinding => templateBinding=TemplateBinding? | id=ID name=Name "("
		//
		//expression=Expression ")")
		public Group getGroup() { return cGroup; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }

		//qualifiedName=QualifiedName tuple=Tuple | isReduce?="reduce" isOrdered?="ordered"? => qualifiedName= / *QualifiedName* /
		//
		//QualifiedNameWithoutBinding => templateBinding=TemplateBinding? | id=ID name=Name "(" expression=Expression ")"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//qualifiedName=QualifiedName tuple=Tuple
		public Group getGroup_1_0() { return cGroup_1_0; }

		//qualifiedName=QualifiedName
		public Assignment getQualifiedNameAssignment_1_0_0() { return cQualifiedNameAssignment_1_0_0; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_1_0_0_0() { return cQualifiedNameQualifiedNameParserRuleCall_1_0_0_0; }

		//tuple=Tuple
		public Assignment getTupleAssignment_1_0_1() { return cTupleAssignment_1_0_1; }

		//Tuple
		public RuleCall getTupleTupleParserRuleCall_1_0_1_0() { return cTupleTupleParserRuleCall_1_0_1_0; }

		//isReduce?="reduce" isOrdered?="ordered"? => qualifiedName= / *QualifiedName* / QualifiedNameWithoutBinding =>
		//
		//templateBinding=TemplateBinding?
		public Group getGroup_1_1() { return cGroup_1_1; }

		//isReduce?="reduce"
		public Assignment getIsReduceAssignment_1_1_0() { return cIsReduceAssignment_1_1_0; }

		//"reduce"
		public Keyword getIsReduceReduceKeyword_1_1_0_0() { return cIsReduceReduceKeyword_1_1_0_0; }

		//isOrdered?="ordered"?
		public Assignment getIsOrderedAssignment_1_1_1() { return cIsOrderedAssignment_1_1_1; }

		//"ordered"
		public Keyword getIsOrderedOrderedKeyword_1_1_1_0() { return cIsOrderedOrderedKeyword_1_1_1_0; }

		//=> qualifiedName= / *QualifiedName* / QualifiedNameWithoutBinding
		public Assignment getQualifiedNameAssignment_1_1_2() { return cQualifiedNameAssignment_1_1_2; }

		/// *QualifiedName* / QualifiedNameWithoutBinding
		public RuleCall getQualifiedNameQualifiedNameWithoutBindingParserRuleCall_1_1_2_0() { return cQualifiedNameQualifiedNameWithoutBindingParserRuleCall_1_1_2_0; }

		//=> templateBinding=TemplateBinding?
		public Assignment getTemplateBindingAssignment_1_1_3() { return cTemplateBindingAssignment_1_1_3; }

		//TemplateBinding
		public RuleCall getTemplateBindingTemplateBindingParserRuleCall_1_1_3_0() { return cTemplateBindingTemplateBindingParserRuleCall_1_1_3_0; }

		//id=ID name=Name "(" expression=Expression ")"
		public Group getGroup_1_2() { return cGroup_1_2; }

		//id=ID
		public Assignment getIdAssignment_1_2_0() { return cIdAssignment_1_2_0; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_2_0_0() { return cIdIDTerminalRuleCall_1_2_0_0; }

		//name=Name
		public Assignment getNameAssignment_1_2_1() { return cNameAssignment_1_2_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_2_1_0() { return cNameNameParserRuleCall_1_2_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_2_2() { return cLeftParenthesisKeyword_1_2_2; }

		//expression=Expression
		public Assignment getExpressionAssignment_1_2_3() { return cExpressionAssignment_1_2_3; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_2_3_0() { return cExpressionExpressionParserRuleCall_1_2_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_2_4() { return cRightParenthesisKeyword_1_2_4; }
	}

	public class PostfixExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PostfixExpressionCompletion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cPrimaryExpressionCompletionAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cPrimaryExpressionCompletionPrimaryExpressionCompletionParserRuleCall_0_0_0 = (RuleCall)cPrimaryExpressionCompletionAssignment_0_0.eContents().get(0);
		private final Assignment cPostfixOperationAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cPostfixOperationPostfixOperationParserRuleCall_0_1_0 = (RuleCall)cPostfixOperationAssignment_0_1.eContents().get(0);
		private final Assignment cPostfixOperationAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cPostfixOperationPostfixOperationParserRuleCall_1_0 = (RuleCall)cPostfixOperationAssignment_1.eContents().get(0);
		
		///// * INCREMENT OR DECREMENT EXPRESSIONS * /
		//
		//PostfixExpressionCompletion:
		//
		//	primaryExpressionCompletion=PrimaryExpressionCompletion postfixOperation=PostfixOperation? |
		//
		//	postfixOperation=PostfixOperation;
		public ParserRule getRule() { return rule; }

		//primaryExpressionCompletion=PrimaryExpressionCompletion postfixOperation=PostfixOperation? |
		//
		//postfixOperation=PostfixOperation
		public Alternatives getAlternatives() { return cAlternatives; }

		//primaryExpressionCompletion=PrimaryExpressionCompletion postfixOperation=PostfixOperation?
		public Group getGroup_0() { return cGroup_0; }

		//primaryExpressionCompletion=PrimaryExpressionCompletion
		public Assignment getPrimaryExpressionCompletionAssignment_0_0() { return cPrimaryExpressionCompletionAssignment_0_0; }

		//PrimaryExpressionCompletion
		public RuleCall getPrimaryExpressionCompletionPrimaryExpressionCompletionParserRuleCall_0_0_0() { return cPrimaryExpressionCompletionPrimaryExpressionCompletionParserRuleCall_0_0_0; }

		//postfixOperation=PostfixOperation?
		public Assignment getPostfixOperationAssignment_0_1() { return cPostfixOperationAssignment_0_1; }

		//PostfixOperation
		public RuleCall getPostfixOperationPostfixOperationParserRuleCall_0_1_0() { return cPostfixOperationPostfixOperationParserRuleCall_0_1_0; }

		//postfixOperation=PostfixOperation
		public Assignment getPostfixOperationAssignment_1() { return cPostfixOperationAssignment_1; }

		//PostfixOperation
		public RuleCall getPostfixOperationPostfixOperationParserRuleCall_1_0() { return cPostfixOperationPostfixOperationParserRuleCall_1_0; }
	}

	public class PostfixOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PostfixOperation");
		private final Assignment cOperatorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOperatorAffixOperatorEnumRuleCall_0 = (RuleCall)cOperatorAssignment.eContents().get(0);
		
		//PostfixOperation:
		//
		//	operator=AffixOperator;
		public ParserRule getRule() { return rule; }

		//operator=AffixOperator
		public Assignment getOperatorAssignment() { return cOperatorAssignment; }

		//AffixOperator
		public RuleCall getOperatorAffixOperatorEnumRuleCall_0() { return cOperatorAffixOperatorEnumRuleCall_0; }
	}

	public class PrefixExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrefixExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOperatorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOperatorAffixOperatorEnumRuleCall_0_0 = (RuleCall)cOperatorAssignment_0.eContents().get(0);
		private final Assignment cPrimaryExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPrimaryExpressionPrimaryExpressionParserRuleCall_1_0 = (RuleCall)cPrimaryExpressionAssignment_1.eContents().get(0);
		
		//PrefixExpression:
		//
		//	operator=AffixOperator primaryExpression=PrimaryExpression;
		public ParserRule getRule() { return rule; }

		//operator=AffixOperator primaryExpression=PrimaryExpression
		public Group getGroup() { return cGroup; }

		//operator=AffixOperator
		public Assignment getOperatorAssignment_0() { return cOperatorAssignment_0; }

		//AffixOperator
		public RuleCall getOperatorAffixOperatorEnumRuleCall_0_0() { return cOperatorAffixOperatorEnumRuleCall_0_0; }

		//primaryExpression=PrimaryExpression
		public Assignment getPrimaryExpressionAssignment_1() { return cPrimaryExpressionAssignment_1; }

		//PrimaryExpression
		public RuleCall getPrimaryExpressionPrimaryExpressionParserRuleCall_1_0() { return cPrimaryExpressionPrimaryExpressionParserRuleCall_1_0; }
	}

	public class UnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPostfixOrCastExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNonPostfixNonCastUnaryExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		///// * UNARY EXPRESSIONS * /
		//
		//UnaryExpression:
		//
		//	PostfixOrCastExpression | NonPostfixNonCastUnaryExpression;
		public ParserRule getRule() { return rule; }

		//PostfixOrCastExpression | NonPostfixNonCastUnaryExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//PostfixOrCastExpression
		public RuleCall getPostfixOrCastExpressionParserRuleCall_0() { return cPostfixOrCastExpressionParserRuleCall_0; }

		//NonPostfixNonCastUnaryExpression
		public RuleCall getNonPostfixNonCastUnaryExpressionParserRuleCall_1() { return cNonPostfixNonCastUnaryExpressionParserRuleCall_1; }
	}

	public class PostfixOrCastExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PostfixOrCastExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNonNamePostfixOrCastExpressionAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNonNamePostfixOrCastExpressionNonNamePostfixOrCastExpressionParserRuleCall_0_0 = (RuleCall)cNonNamePostfixOrCastExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cNameOrPrimaryExpressionAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameOrPrimaryExpressionNameOrPrimaryExpressionParserRuleCall_1_0_0 = (RuleCall)cNameOrPrimaryExpressionAssignment_1_0.eContents().get(0);
		private final Assignment cPostFixExpressionCompletionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPostFixExpressionCompletionPostfixExpressionCompletionParserRuleCall_1_1_0 = (RuleCall)cPostFixExpressionCompletionAssignment_1_1.eContents().get(0);
		
		//PostfixOrCastExpression:
		//
		//	nonNamePostfixOrCastExpression=NonNamePostfixOrCastExpression //(nonNamePostfixOrCastExpression = NonNamePostfixOrCastExpression) | (nameOrPrimaryExpression = NameOrPrimaryExpression postFixExpressionCompletion = PostfixExpressionCompletion)
		//
		//	| nameOrPrimaryExpression=NameOrPrimaryExpression postFixExpressionCompletion=PostfixExpressionCompletion?;
		public ParserRule getRule() { return rule; }

		//nonNamePostfixOrCastExpression=NonNamePostfixOrCastExpression //(nonNamePostfixOrCastExpression = NonNamePostfixOrCastExpression) | (nameOrPrimaryExpression = NameOrPrimaryExpression postFixExpressionCompletion = PostfixExpressionCompletion)
		//
		//| nameOrPrimaryExpression=NameOrPrimaryExpression postFixExpressionCompletion=PostfixExpressionCompletion?
		public Alternatives getAlternatives() { return cAlternatives; }

		//nonNamePostfixOrCastExpression=NonNamePostfixOrCastExpression
		public Assignment getNonNamePostfixOrCastExpressionAssignment_0() { return cNonNamePostfixOrCastExpressionAssignment_0; }

		//NonNamePostfixOrCastExpression
		public RuleCall getNonNamePostfixOrCastExpressionNonNamePostfixOrCastExpressionParserRuleCall_0_0() { return cNonNamePostfixOrCastExpressionNonNamePostfixOrCastExpressionParserRuleCall_0_0; }

		//nameOrPrimaryExpression=NameOrPrimaryExpression postFixExpressionCompletion=PostfixExpressionCompletion?
		public Group getGroup_1() { return cGroup_1; }

		//nameOrPrimaryExpression=NameOrPrimaryExpression
		public Assignment getNameOrPrimaryExpressionAssignment_1_0() { return cNameOrPrimaryExpressionAssignment_1_0; }

		//NameOrPrimaryExpression
		public RuleCall getNameOrPrimaryExpressionNameOrPrimaryExpressionParserRuleCall_1_0_0() { return cNameOrPrimaryExpressionNameOrPrimaryExpressionParserRuleCall_1_0_0; }

		//postFixExpressionCompletion=PostfixExpressionCompletion?
		public Assignment getPostFixExpressionCompletionAssignment_1_1() { return cPostFixExpressionCompletionAssignment_1_1; }

		//PostfixExpressionCompletion
		public RuleCall getPostFixExpressionCompletionPostfixExpressionCompletionParserRuleCall_1_1_0() { return cPostFixExpressionCompletionPostfixExpressionCompletionParserRuleCall_1_1_0; }
	}

	public class NonNameUnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NonNameUnaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNonNamePostfixOrCastExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNonPostfixNonCastUnaryExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NonNameUnaryExpression:
		//
		//	NonNamePostfixOrCastExpression | NonPostfixNonCastUnaryExpression;
		public ParserRule getRule() { return rule; }

		//NonNamePostfixOrCastExpression | NonPostfixNonCastUnaryExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//NonNamePostfixOrCastExpression
		public RuleCall getNonNamePostfixOrCastExpressionParserRuleCall_0() { return cNonNamePostfixOrCastExpressionParserRuleCall_0; }

		//NonPostfixNonCastUnaryExpression
		public RuleCall getNonPostfixNonCastUnaryExpressionParserRuleCall_1() { return cNonPostfixNonCastUnaryExpressionParserRuleCall_1; }
	}

	public class NonNamePostfixOrCastExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NonNamePostfixOrCastExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cAlternatives_0_1.eContents().get(0);
		private final Assignment cAnyAssignment_0_1_0_0 = (Assignment)cGroup_0_1_0.eContents().get(0);
		private final Keyword cAnyAnyKeyword_0_1_0_0_0 = (Keyword)cAnyAssignment_0_1_0_0.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_1_0_1 = (Keyword)cGroup_0_1_0.eContents().get(1);
		private final Assignment cCastCompletionAssignment_0_1_0_2 = (Assignment)cGroup_0_1_0.eContents().get(2);
		private final RuleCall cCastCompletionCastCompletionParserRuleCall_0_1_0_2_0 = (RuleCall)cCastCompletionAssignment_0_1_0_2.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cAlternatives_0_1.eContents().get(1);
		private final Assignment cPotentiallyAmbiguousQualifiedNameAssignment_0_1_1_0 = (Assignment)cGroup_0_1_1.eContents().get(0);
		private final RuleCall cPotentiallyAmbiguousQualifiedNameQualifiedNameWithoutBindingParserRuleCall_0_1_1_0_0 = (RuleCall)cPotentiallyAmbiguousQualifiedNameAssignment_0_1_1_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1_1_1 = (Alternatives)cGroup_0_1_1.eContents().get(1);
		private final Group cGroup_0_1_1_1_0 = (Group)cAlternatives_0_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_1_1_1_0_0 = (Keyword)cGroup_0_1_1_1_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1_1_1_0_1 = (Alternatives)cGroup_0_1_1_1_0.eContents().get(1);
		private final Assignment cCastCompletionAssignment_0_1_1_1_0_1_0 = (Assignment)cAlternatives_0_1_1_1_0_1.eContents().get(0);
		private final RuleCall cCastCompletionCastCompletionParserRuleCall_0_1_1_1_0_1_0_0 = (RuleCall)cCastCompletionAssignment_0_1_1_1_0_1_0.eContents().get(0);
		private final Assignment cPostifixExpressionCompletionAssignment_0_1_1_1_0_1_1 = (Assignment)cAlternatives_0_1_1_1_0_1.eContents().get(1);
		private final RuleCall cPostifixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_1_1_0_1_1_0 = (RuleCall)cPostifixExpressionCompletionAssignment_0_1_1_1_0_1_1.eContents().get(0);
		private final Group cGroup_0_1_1_1_1 = (Group)cAlternatives_0_1_1_1.eContents().get(1);
		private final Assignment cNameToExpressionCompletionAssignment_0_1_1_1_1_0 = (Assignment)cGroup_0_1_1_1_1.eContents().get(0);
		private final RuleCall cNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_0_1_1_1_1_0_0 = (RuleCall)cNameToExpressionCompletionAssignment_0_1_1_1_1_0.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_1_1_1_1_1 = (Keyword)cGroup_0_1_1_1_1.eContents().get(1);
		private final Assignment cPostfixExpressionCompletionAssignment_0_1_1_1_1_2 = (Assignment)cGroup_0_1_1_1_1.eContents().get(2);
		private final RuleCall cPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_1_1_1_2_0 = (RuleCall)cPostfixExpressionCompletionAssignment_0_1_1_1_1_2.eContents().get(0);
		private final Group cGroup_0_1_2 = (Group)cAlternatives_0_1.eContents().get(2);
		private final Assignment cNonNameExpressionAssignment_0_1_2_0 = (Assignment)cGroup_0_1_2.eContents().get(0);
		private final RuleCall cNonNameExpressionNonNameExpressionParserRuleCall_0_1_2_0_0 = (RuleCall)cNonNameExpressionAssignment_0_1_2_0.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_1_2_1 = (Keyword)cGroup_0_1_2.eContents().get(1);
		private final Assignment cPostfixExpressionCompletionAssignment_0_1_2_2 = (Assignment)cGroup_0_1_2.eContents().get(2);
		private final RuleCall cPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_2_2_0 = (RuleCall)cPostfixExpressionCompletionAssignment_0_1_2_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cBaseExpressionAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cBaseExpressionBaseExpressionParserRuleCall_1_0_0 = (RuleCall)cBaseExpressionAssignment_1_0.eContents().get(0);
		private final Assignment cPostfixExpressionCompletionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_1_1_0 = (RuleCall)cPostfixExpressionCompletionAssignment_1_1.eContents().get(0);
		
		//NonNamePostfixOrCastExpression:
		//
		//	"(" (any?="any" ")" castCompletion=CastCompletion //| (potentiallyAmbiguousQualifiedName = QualifiedNameWithoutBinding ( ')' castCompletion = CastCompletion | nameToExpressionCompletion = NameToExpressionCompletion ')' (postfixExpressionCompletion = PostfixExpressionCompletion)?))
		//
		//	| potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding (")" (=> castCompletion=CastCompletion |
		//
		//	postifixExpressionCompletion=PostfixExpressionCompletion)? | nameToExpressionCompletion=NameToExpressionCompletion
		//
		//	")" postfixExpressionCompletion=PostfixExpressionCompletion?) | nonNameExpression=NonNameExpression ")"
		//
		//	postfixExpressionCompletion=PostfixExpressionCompletion?) | baseExpression=BaseExpression
		//
		//	postfixExpressionCompletion=PostfixExpressionCompletion?;
		public ParserRule getRule() { return rule; }

		//"(" (any?="any" ")" castCompletion=CastCompletion //| (potentiallyAmbiguousQualifiedName = QualifiedNameWithoutBinding ( ')' castCompletion = CastCompletion | nameToExpressionCompletion = NameToExpressionCompletion ')' (postfixExpressionCompletion = PostfixExpressionCompletion)?))
		//
		//| potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding (")" (=> castCompletion=CastCompletion |
		//
		//postifixExpressionCompletion=PostfixExpressionCompletion)? | nameToExpressionCompletion=NameToExpressionCompletion ")"
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?) | nonNameExpression=NonNameExpression ")"
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?) | baseExpression=BaseExpression
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?
		public Alternatives getAlternatives() { return cAlternatives; }

		//"(" (any?="any" ")" castCompletion=CastCompletion //| (potentiallyAmbiguousQualifiedName = QualifiedNameWithoutBinding ( ')' castCompletion = CastCompletion | nameToExpressionCompletion = NameToExpressionCompletion ')' (postfixExpressionCompletion = PostfixExpressionCompletion)?))
		//
		//| potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding (")" (=> castCompletion=CastCompletion |
		//
		//postifixExpressionCompletion=PostfixExpressionCompletion)? | nameToExpressionCompletion=NameToExpressionCompletion ")"
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?) | nonNameExpression=NonNameExpression ")"
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?)
		public Group getGroup_0() { return cGroup_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }

		//any?="any" ")" castCompletion=CastCompletion //| (potentiallyAmbiguousQualifiedName = QualifiedNameWithoutBinding ( ')' castCompletion = CastCompletion | nameToExpressionCompletion = NameToExpressionCompletion ')' (postfixExpressionCompletion = PostfixExpressionCompletion)?))
		//
		//| potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding (")" (=> castCompletion=CastCompletion |
		//
		//postifixExpressionCompletion=PostfixExpressionCompletion)? | nameToExpressionCompletion=NameToExpressionCompletion ")"
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?) | nonNameExpression=NonNameExpression ")"
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//any?="any" ")" castCompletion=CastCompletion
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }

		//any?="any"
		public Assignment getAnyAssignment_0_1_0_0() { return cAnyAssignment_0_1_0_0; }

		//"any"
		public Keyword getAnyAnyKeyword_0_1_0_0_0() { return cAnyAnyKeyword_0_1_0_0_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_1_0_1() { return cRightParenthesisKeyword_0_1_0_1; }

		//castCompletion=CastCompletion
		public Assignment getCastCompletionAssignment_0_1_0_2() { return cCastCompletionAssignment_0_1_0_2; }

		//CastCompletion
		public RuleCall getCastCompletionCastCompletionParserRuleCall_0_1_0_2_0() { return cCastCompletionCastCompletionParserRuleCall_0_1_0_2_0; }

		//potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding (")" (=> castCompletion=CastCompletion |
		//
		//postifixExpressionCompletion=PostfixExpressionCompletion)? | nameToExpressionCompletion=NameToExpressionCompletion ")"
		//
		//postfixExpressionCompletion=PostfixExpressionCompletion?)
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }

		//potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding
		public Assignment getPotentiallyAmbiguousQualifiedNameAssignment_0_1_1_0() { return cPotentiallyAmbiguousQualifiedNameAssignment_0_1_1_0; }

		//QualifiedNameWithoutBinding
		public RuleCall getPotentiallyAmbiguousQualifiedNameQualifiedNameWithoutBindingParserRuleCall_0_1_1_0_0() { return cPotentiallyAmbiguousQualifiedNameQualifiedNameWithoutBindingParserRuleCall_0_1_1_0_0; }

		//")" (=> castCompletion=CastCompletion | postifixExpressionCompletion=PostfixExpressionCompletion)? |
		//
		//nameToExpressionCompletion=NameToExpressionCompletion ")" postfixExpressionCompletion=PostfixExpressionCompletion?
		public Alternatives getAlternatives_0_1_1_1() { return cAlternatives_0_1_1_1; }

		//")" (=> castCompletion=CastCompletion | postifixExpressionCompletion=PostfixExpressionCompletion)?
		public Group getGroup_0_1_1_1_0() { return cGroup_0_1_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_1_1_1_0_0() { return cRightParenthesisKeyword_0_1_1_1_0_0; }

		//(=> castCompletion=CastCompletion | postifixExpressionCompletion=PostfixExpressionCompletion)?
		public Alternatives getAlternatives_0_1_1_1_0_1() { return cAlternatives_0_1_1_1_0_1; }

		//=> castCompletion=CastCompletion
		public Assignment getCastCompletionAssignment_0_1_1_1_0_1_0() { return cCastCompletionAssignment_0_1_1_1_0_1_0; }

		//CastCompletion
		public RuleCall getCastCompletionCastCompletionParserRuleCall_0_1_1_1_0_1_0_0() { return cCastCompletionCastCompletionParserRuleCall_0_1_1_1_0_1_0_0; }

		//postifixExpressionCompletion=PostfixExpressionCompletion
		public Assignment getPostifixExpressionCompletionAssignment_0_1_1_1_0_1_1() { return cPostifixExpressionCompletionAssignment_0_1_1_1_0_1_1; }

		//PostfixExpressionCompletion
		public RuleCall getPostifixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_1_1_0_1_1_0() { return cPostifixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_1_1_0_1_1_0; }

		//nameToExpressionCompletion=NameToExpressionCompletion ")" postfixExpressionCompletion=PostfixExpressionCompletion?
		public Group getGroup_0_1_1_1_1() { return cGroup_0_1_1_1_1; }

		//nameToExpressionCompletion=NameToExpressionCompletion
		public Assignment getNameToExpressionCompletionAssignment_0_1_1_1_1_0() { return cNameToExpressionCompletionAssignment_0_1_1_1_1_0; }

		//NameToExpressionCompletion
		public RuleCall getNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_0_1_1_1_1_0_0() { return cNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_0_1_1_1_1_0_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_1_1_1_1_1() { return cRightParenthesisKeyword_0_1_1_1_1_1; }

		//postfixExpressionCompletion=PostfixExpressionCompletion?
		public Assignment getPostfixExpressionCompletionAssignment_0_1_1_1_1_2() { return cPostfixExpressionCompletionAssignment_0_1_1_1_1_2; }

		//PostfixExpressionCompletion
		public RuleCall getPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_1_1_1_2_0() { return cPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_1_1_1_2_0; }

		//nonNameExpression=NonNameExpression ")" postfixExpressionCompletion=PostfixExpressionCompletion?
		public Group getGroup_0_1_2() { return cGroup_0_1_2; }

		//nonNameExpression=NonNameExpression
		public Assignment getNonNameExpressionAssignment_0_1_2_0() { return cNonNameExpressionAssignment_0_1_2_0; }

		//NonNameExpression
		public RuleCall getNonNameExpressionNonNameExpressionParserRuleCall_0_1_2_0_0() { return cNonNameExpressionNonNameExpressionParserRuleCall_0_1_2_0_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_1_2_1() { return cRightParenthesisKeyword_0_1_2_1; }

		//postfixExpressionCompletion=PostfixExpressionCompletion?
		public Assignment getPostfixExpressionCompletionAssignment_0_1_2_2() { return cPostfixExpressionCompletionAssignment_0_1_2_2; }

		//PostfixExpressionCompletion
		public RuleCall getPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_2_2_0() { return cPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_0_1_2_2_0; }

		//baseExpression=BaseExpression postfixExpressionCompletion=PostfixExpressionCompletion?
		public Group getGroup_1() { return cGroup_1; }

		//baseExpression=BaseExpression
		public Assignment getBaseExpressionAssignment_1_0() { return cBaseExpressionAssignment_1_0; }

		//BaseExpression
		public RuleCall getBaseExpressionBaseExpressionParserRuleCall_1_0_0() { return cBaseExpressionBaseExpressionParserRuleCall_1_0_0; }

		//postfixExpressionCompletion=PostfixExpressionCompletion?
		public Assignment getPostfixExpressionCompletionAssignment_1_1() { return cPostfixExpressionCompletionAssignment_1_1; }

		//PostfixExpressionCompletion
		public RuleCall getPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_1_1_0() { return cPostfixExpressionCompletionPostfixExpressionCompletionParserRuleCall_1_1_0; }
	}

	public class NonPostfixNonCastUnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NonPostfixNonCastUnaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrefixExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNumericUnaryExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBooleanNegationExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBitStringComplementExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cIsolationExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//NonPostfixNonCastUnaryExpression:
		//
		//	PrefixExpression | NumericUnaryExpression | BooleanNegationExpression | BitStringComplementExpression |
		//
		//	IsolationExpression;
		public ParserRule getRule() { return rule; }

		//PrefixExpression | NumericUnaryExpression | BooleanNegationExpression | BitStringComplementExpression |
		//
		//IsolationExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//PrefixExpression
		public RuleCall getPrefixExpressionParserRuleCall_0() { return cPrefixExpressionParserRuleCall_0; }

		//NumericUnaryExpression
		public RuleCall getNumericUnaryExpressionParserRuleCall_1() { return cNumericUnaryExpressionParserRuleCall_1; }

		//BooleanNegationExpression
		public RuleCall getBooleanNegationExpressionParserRuleCall_2() { return cBooleanNegationExpressionParserRuleCall_2; }

		//BitStringComplementExpression
		public RuleCall getBitStringComplementExpressionParserRuleCall_3() { return cBitStringComplementExpressionParserRuleCall_3; }

		//IsolationExpression
		public RuleCall getIsolationExpressionParserRuleCall_4() { return cIsolationExpressionParserRuleCall_4; }
	}

	public class BooleanNegationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanNegationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUnaryExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_1_0 = (RuleCall)cUnaryExpressionAssignment_1.eContents().get(0);
		
		//BooleanNegationExpression:
		//
		//	"!" unaryExpression=UnaryExpression;
		public ParserRule getRule() { return rule; }

		//"!" unaryExpression=UnaryExpression
		public Group getGroup() { return cGroup; }

		//"!"
		public Keyword getExclamationMarkKeyword_0() { return cExclamationMarkKeyword_0; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_1() { return cUnaryExpressionAssignment_1; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_1_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_1_0; }
	}

	public class BitStringComplementExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BitStringComplementExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTildeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUnaryExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_1_0 = (RuleCall)cUnaryExpressionAssignment_1.eContents().get(0);
		
		//BitStringComplementExpression:
		//
		//	"~" unaryExpression=UnaryExpression;
		public ParserRule getRule() { return rule; }

		//"~" unaryExpression=UnaryExpression
		public Group getGroup() { return cGroup; }

		//"~"
		public Keyword getTildeKeyword_0() { return cTildeKeyword_0; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_1() { return cUnaryExpressionAssignment_1; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_1_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_1_0; }
	}

	public class NumericUnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NumericUnaryExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOperatorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOperatorNumericUnaryOperatorEnumRuleCall_0_0 = (RuleCall)cOperatorAssignment_0.eContents().get(0);
		private final Assignment cUnaryExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_1_0 = (RuleCall)cUnaryExpressionAssignment_1.eContents().get(0);
		
		//NumericUnaryExpression:
		//
		//	operator=NumericUnaryOperator unaryExpression=UnaryExpression;
		public ParserRule getRule() { return rule; }

		//operator=NumericUnaryOperator unaryExpression=UnaryExpression
		public Group getGroup() { return cGroup; }

		//operator=NumericUnaryOperator
		public Assignment getOperatorAssignment_0() { return cOperatorAssignment_0; }

		//NumericUnaryOperator
		public RuleCall getOperatorNumericUnaryOperatorEnumRuleCall_0_0() { return cOperatorNumericUnaryOperatorEnumRuleCall_0_0; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_1() { return cUnaryExpressionAssignment_1; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_1_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_1_0; }
	}

	public class IsolationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IsolationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDollarSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUnaryExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_1_0 = (RuleCall)cUnaryExpressionAssignment_1.eContents().get(0);
		
		//IsolationExpression:
		//
		//	"$" unaryExpression=UnaryExpression;
		public ParserRule getRule() { return rule; }

		//"$" unaryExpression=UnaryExpression
		public Group getGroup() { return cGroup; }

		//"$"
		public Keyword getDollarSignKeyword_0() { return cDollarSignKeyword_0; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_1() { return cUnaryExpressionAssignment_1; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_1_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_1_0; }
	}

	public class CastCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CastCompletion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPostfixOrCastExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBooleanNegationExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBitStringComplementExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cIsolationExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		////CastExpression : // This rule is the spec, but not used actually
		//
		////	'(' typeName = TypeName ')' castCompletion = CastCompletion
		//
		////;
		//
		//CastCompletion:
		//
		//	PostfixOrCastExpression | BooleanNegationExpression | BitStringComplementExpression | IsolationExpression;
		public ParserRule getRule() { return rule; }

		//PostfixOrCastExpression | BooleanNegationExpression | BitStringComplementExpression | IsolationExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//PostfixOrCastExpression
		public RuleCall getPostfixOrCastExpressionParserRuleCall_0() { return cPostfixOrCastExpressionParserRuleCall_0; }

		//BooleanNegationExpression
		public RuleCall getBooleanNegationExpressionParserRuleCall_1() { return cBooleanNegationExpressionParserRuleCall_1; }

		//BitStringComplementExpression
		public RuleCall getBitStringComplementExpressionParserRuleCall_2() { return cBitStringComplementExpressionParserRuleCall_2; }

		//IsolationExpression
		public RuleCall getIsolationExpressionParserRuleCall_3() { return cIsolationExpressionParserRuleCall_3; }
	}

	public class MultiplicativeExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MultiplicativeExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cMultiplicativeExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMultiplicativeExpressionCompletionMultiplicativeExpressionCompletionParserRuleCall_1_0 = (RuleCall)cMultiplicativeExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * ARITHMETIC EXPRESSIONS * /
		//
		//MultiplicativeExpression:
		//
		//	unaryExpression=UnaryExpression multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion
		public Assignment getMultiplicativeExpressionCompletionAssignment_1() { return cMultiplicativeExpressionCompletionAssignment_1; }

		//MultiplicativeExpressionCompletion
		public RuleCall getMultiplicativeExpressionCompletionMultiplicativeExpressionCompletionParserRuleCall_1_0() { return cMultiplicativeExpressionCompletionMultiplicativeExpressionCompletionParserRuleCall_1_0; }
	}

	public class MultiplicativeExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MultiplicativeExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMultiplicativeExpressionCompletionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorMultiplicativeOperatorEnumRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cUnaryExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_1_1_0 = (RuleCall)cUnaryExpressionAssignment_1_1.eContents().get(0);
		
		//MultiplicativeExpressionCompletion:
		//
		//	{MultiplicativeExpressionCompletion} (operator+=MultiplicativeOperator unaryExpression+=UnaryExpression)*;
		public ParserRule getRule() { return rule; }

		//{MultiplicativeExpressionCompletion} (operator+=MultiplicativeOperator unaryExpression+=UnaryExpression)*
		public Group getGroup() { return cGroup; }

		//{MultiplicativeExpressionCompletion}
		public Action getMultiplicativeExpressionCompletionAction_0() { return cMultiplicativeExpressionCompletionAction_0; }

		//(operator+=MultiplicativeOperator unaryExpression+=UnaryExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//operator+=MultiplicativeOperator
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }

		//MultiplicativeOperator
		public RuleCall getOperatorMultiplicativeOperatorEnumRuleCall_1_0_0() { return cOperatorMultiplicativeOperatorEnumRuleCall_1_0_0; }

		//unaryExpression+=UnaryExpression
		public Assignment getUnaryExpressionAssignment_1_1() { return cUnaryExpressionAssignment_1_1; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_1_1_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_1_1_0; }
	}

	public class AdditiveExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AdditiveExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cAdditiveExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAdditiveExpressionCompletionAdditiveExpressionCompletionParserRuleCall_1_0 = (RuleCall)cAdditiveExpressionCompletionAssignment_1.eContents().get(0);
		
		//AdditiveExpression:
		//
		//	unaryExpression=UnaryExpression additiveExpressionCompletion=AdditiveExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression additiveExpressionCompletion=AdditiveExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//additiveExpressionCompletion=AdditiveExpressionCompletion
		public Assignment getAdditiveExpressionCompletionAssignment_1() { return cAdditiveExpressionCompletionAssignment_1; }

		//AdditiveExpressionCompletion
		public RuleCall getAdditiveExpressionCompletionAdditiveExpressionCompletionParserRuleCall_1_0() { return cAdditiveExpressionCompletionAdditiveExpressionCompletionParserRuleCall_1_0; }
	}

	public class AdditiveExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AdditiveExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMultiplicativeExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMultiplicativeExpressionCompletionMultiplicativeExpressionCompletionParserRuleCall_0_0 = (RuleCall)cMultiplicativeExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorAdditiveOperatorEnumRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cMultiplicativeExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMultiplicativeExpressionMultiplicativeExpressionParserRuleCall_1_1_0 = (RuleCall)cMultiplicativeExpressionAssignment_1_1.eContents().get(0);
		
		//AdditiveExpressionCompletion:
		//
		//	multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion (operator+=AdditiveOperator
		//
		//	multiplicativeExpression+=MultiplicativeExpression)*;
		public ParserRule getRule() { return rule; }

		//multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion (operator+=AdditiveOperator
		//
		//multiplicativeExpression+=MultiplicativeExpression)*
		public Group getGroup() { return cGroup; }

		//multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion
		public Assignment getMultiplicativeExpressionCompletionAssignment_0() { return cMultiplicativeExpressionCompletionAssignment_0; }

		//MultiplicativeExpressionCompletion
		public RuleCall getMultiplicativeExpressionCompletionMultiplicativeExpressionCompletionParserRuleCall_0_0() { return cMultiplicativeExpressionCompletionMultiplicativeExpressionCompletionParserRuleCall_0_0; }

		//(operator+=AdditiveOperator multiplicativeExpression+=MultiplicativeExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//operator+=AdditiveOperator
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }

		//AdditiveOperator
		public RuleCall getOperatorAdditiveOperatorEnumRuleCall_1_0_0() { return cOperatorAdditiveOperatorEnumRuleCall_1_0_0; }

		//multiplicativeExpression+=MultiplicativeExpression
		public Assignment getMultiplicativeExpressionAssignment_1_1() { return cMultiplicativeExpressionAssignment_1_1; }

		//MultiplicativeExpression
		public RuleCall getMultiplicativeExpressionMultiplicativeExpressionParserRuleCall_1_1_0() { return cMultiplicativeExpressionMultiplicativeExpressionParserRuleCall_1_1_0; }
	}

	public class ShiftExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ShiftExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cShiftExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cShiftExpressionCompletionShiftExpressionCompletionParserRuleCall_1_0 = (RuleCall)cShiftExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * SHIFT EXPRESSIONS * /
		//
		//ShiftExpression:
		//
		//	unaryExpression=UnaryExpression shiftExpressionCompletion=ShiftExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression shiftExpressionCompletion=ShiftExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//shiftExpressionCompletion=ShiftExpressionCompletion
		public Assignment getShiftExpressionCompletionAssignment_1() { return cShiftExpressionCompletionAssignment_1; }

		//ShiftExpressionCompletion
		public RuleCall getShiftExpressionCompletionShiftExpressionCompletionParserRuleCall_1_0() { return cShiftExpressionCompletionShiftExpressionCompletionParserRuleCall_1_0; }
	}

	public class ShiftExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ShiftExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAdditiveExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAdditiveExpressionCompletionAdditiveExpressionCompletionParserRuleCall_0_0 = (RuleCall)cAdditiveExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorShiftOperatorEnumRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cAdditiveExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAdditiveExpressionAdditiveExpressionParserRuleCall_1_1_0 = (RuleCall)cAdditiveExpressionAssignment_1_1.eContents().get(0);
		
		//ShiftExpressionCompletion:
		//
		//	additiveExpressionCompletion=AdditiveExpressionCompletion (operator+=ShiftOperator
		//
		//	additiveExpression+=AdditiveExpression)*;
		public ParserRule getRule() { return rule; }

		//additiveExpressionCompletion=AdditiveExpressionCompletion (operator+=ShiftOperator
		//
		//additiveExpression+=AdditiveExpression)*
		public Group getGroup() { return cGroup; }

		//additiveExpressionCompletion=AdditiveExpressionCompletion
		public Assignment getAdditiveExpressionCompletionAssignment_0() { return cAdditiveExpressionCompletionAssignment_0; }

		//AdditiveExpressionCompletion
		public RuleCall getAdditiveExpressionCompletionAdditiveExpressionCompletionParserRuleCall_0_0() { return cAdditiveExpressionCompletionAdditiveExpressionCompletionParserRuleCall_0_0; }

		//(operator+=ShiftOperator additiveExpression+=AdditiveExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//operator+=ShiftOperator
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }

		//ShiftOperator
		public RuleCall getOperatorShiftOperatorEnumRuleCall_1_0_0() { return cOperatorShiftOperatorEnumRuleCall_1_0_0; }

		//additiveExpression+=AdditiveExpression
		public Assignment getAdditiveExpressionAssignment_1_1() { return cAdditiveExpressionAssignment_1_1; }

		//AdditiveExpression
		public RuleCall getAdditiveExpressionAdditiveExpressionParserRuleCall_1_1_0() { return cAdditiveExpressionAdditiveExpressionParserRuleCall_1_1_0; }
	}

	public class RelationalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RelationalExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cRelationalExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRelationalExpressionCompletionRelationalExpressionCompletionParserRuleCall_1_0 = (RuleCall)cRelationalExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * RELATIONAL EXPRESSIONS * /
		//
		//// In the spec, this rule is not explicitly called by any other rules
		//
		//RelationalExpression:
		//
		//	unaryExpression=UnaryExpression relationalExpressionCompletion=RelationalExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression relationalExpressionCompletion=RelationalExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//relationalExpressionCompletion=RelationalExpressionCompletion
		public Assignment getRelationalExpressionCompletionAssignment_1() { return cRelationalExpressionCompletionAssignment_1; }

		//RelationalExpressionCompletion
		public RuleCall getRelationalExpressionCompletionRelationalExpressionCompletionParserRuleCall_1_0() { return cRelationalExpressionCompletionRelationalExpressionCompletionParserRuleCall_1_0; }
	}

	public class RelationalExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RelationalExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cShiftExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cShiftExpressionCompletionShiftExpressionCompletionParserRuleCall_0_0 = (RuleCall)cShiftExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cRelationalOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cRelationalOperatorRelationalOperatorEnumRuleCall_1_0_0 = (RuleCall)cRelationalOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cShiftExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cShiftExpressionShiftExpressionParserRuleCall_1_1_0 = (RuleCall)cShiftExpressionAssignment_1_1.eContents().get(0);
		
		//RelationalExpressionCompletion:
		//
		//	shiftExpressionCompletion=ShiftExpressionCompletion (relationalOperator=RelationalOperator
		//
		//	shiftExpression=ShiftExpression)?;
		public ParserRule getRule() { return rule; }

		//shiftExpressionCompletion=ShiftExpressionCompletion (relationalOperator=RelationalOperator
		//
		//shiftExpression=ShiftExpression)?
		public Group getGroup() { return cGroup; }

		//shiftExpressionCompletion=ShiftExpressionCompletion
		public Assignment getShiftExpressionCompletionAssignment_0() { return cShiftExpressionCompletionAssignment_0; }

		//ShiftExpressionCompletion
		public RuleCall getShiftExpressionCompletionShiftExpressionCompletionParserRuleCall_0_0() { return cShiftExpressionCompletionShiftExpressionCompletionParserRuleCall_0_0; }

		//(relationalOperator=RelationalOperator shiftExpression=ShiftExpression)?
		public Group getGroup_1() { return cGroup_1; }

		//relationalOperator=RelationalOperator
		public Assignment getRelationalOperatorAssignment_1_0() { return cRelationalOperatorAssignment_1_0; }

		//RelationalOperator
		public RuleCall getRelationalOperatorRelationalOperatorEnumRuleCall_1_0_0() { return cRelationalOperatorRelationalOperatorEnumRuleCall_1_0_0; }

		//shiftExpression=ShiftExpression
		public Assignment getShiftExpressionAssignment_1_1() { return cShiftExpressionAssignment_1_1; }

		//ShiftExpression
		public RuleCall getShiftExpressionShiftExpressionParserRuleCall_1_1_0() { return cShiftExpressionShiftExpressionParserRuleCall_1_1_0; }
	}

	public class ClassificationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassificationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cClassificationExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0 = (RuleCall)cClassificationExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * CLASSIFICATION EXPRESSIONS * /
		//
		//ClassificationExpression:
		//
		//	unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//classificationExpressionCompletion=ClassificationExpressionCompletion
		public Assignment getClassificationExpressionCompletionAssignment_1() { return cClassificationExpressionCompletionAssignment_1; }

		//ClassificationExpressionCompletion
		public RuleCall getClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0() { return cClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0; }
	}

	public class ClassificationExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassificationExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRelationalExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cRelationalExpressionCompletionRelationalExpressionCompletionParserRuleCall_0_0 = (RuleCall)cRelationalExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorClassificationOperatorEnumRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		
		//ClassificationExpressionCompletion:
		//
		//	relationalExpressionCompletion=RelationalExpressionCompletion (operator=ClassificationOperator name=QualifiedName)?;
		public ParserRule getRule() { return rule; }

		//relationalExpressionCompletion=RelationalExpressionCompletion (operator=ClassificationOperator name=QualifiedName)?
		public Group getGroup() { return cGroup; }

		//relationalExpressionCompletion=RelationalExpressionCompletion
		public Assignment getRelationalExpressionCompletionAssignment_0() { return cRelationalExpressionCompletionAssignment_0; }

		//RelationalExpressionCompletion
		public RuleCall getRelationalExpressionCompletionRelationalExpressionCompletionParserRuleCall_0_0() { return cRelationalExpressionCompletionRelationalExpressionCompletionParserRuleCall_0_0; }

		//(operator=ClassificationOperator name=QualifiedName)?
		public Group getGroup_1() { return cGroup_1; }

		//operator=ClassificationOperator
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }

		//ClassificationOperator
		public RuleCall getOperatorClassificationOperatorEnumRuleCall_1_0_0() { return cOperatorClassificationOperatorEnumRuleCall_1_0_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_1_0() { return cNameQualifiedNameParserRuleCall_1_1_0; }
	}

	public class EqualityExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EqualityExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cClassificationExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0 = (RuleCall)cClassificationExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * EQUALITY EXPRESSIONS * /
		//
		//EqualityExpression:
		//
		//	unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//classificationExpressionCompletion=ClassificationExpressionCompletion
		public Assignment getClassificationExpressionCompletionAssignment_1() { return cClassificationExpressionCompletionAssignment_1; }

		//ClassificationExpressionCompletion
		public RuleCall getClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0() { return cClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0; }
	}

	public class EqualityExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EqualityExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cClassificationExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_0_0 = (RuleCall)cClassificationExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorEqualityOperatorEnumRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cClassificationExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cClassificationExpressionClassificationExpressionParserRuleCall_1_1_0 = (RuleCall)cClassificationExpressionAssignment_1_1.eContents().get(0);
		
		//EqualityExpressionCompletion:
		//
		//	classificationExpressionCompletion=ClassificationExpressionCompletion (operator+=EqualityOperator
		//
		//	classificationExpression+=ClassificationExpression)*;
		public ParserRule getRule() { return rule; }

		//classificationExpressionCompletion=ClassificationExpressionCompletion (operator+=EqualityOperator
		//
		//classificationExpression+=ClassificationExpression)*
		public Group getGroup() { return cGroup; }

		//classificationExpressionCompletion=ClassificationExpressionCompletion
		public Assignment getClassificationExpressionCompletionAssignment_0() { return cClassificationExpressionCompletionAssignment_0; }

		//ClassificationExpressionCompletion
		public RuleCall getClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_0_0() { return cClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_0_0; }

		//(operator+=EqualityOperator classificationExpression+=ClassificationExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//operator+=EqualityOperator
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }

		//EqualityOperator
		public RuleCall getOperatorEqualityOperatorEnumRuleCall_1_0_0() { return cOperatorEqualityOperatorEnumRuleCall_1_0_0; }

		//classificationExpression+=ClassificationExpression
		public Assignment getClassificationExpressionAssignment_1_1() { return cClassificationExpressionAssignment_1_1; }

		//ClassificationExpression
		public RuleCall getClassificationExpressionClassificationExpressionParserRuleCall_1_1_0() { return cClassificationExpressionClassificationExpressionParserRuleCall_1_1_0; }
	}

	public class AndExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AndExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cAndExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAndExpressionCompletionAndExpressionCompletionParserRuleCall_1_0 = (RuleCall)cAndExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * LOGICAL EXPRESSIONS * /
		//
		//AndExpression:
		//
		//	unaryExpression=UnaryExpression andExpressionCompletion=AndExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression andExpressionCompletion=AndExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//andExpressionCompletion=AndExpressionCompletion
		public Assignment getAndExpressionCompletionAssignment_1() { return cAndExpressionCompletionAssignment_1; }

		//AndExpressionCompletion
		public RuleCall getAndExpressionCompletionAndExpressionCompletionParserRuleCall_1_0() { return cAndExpressionCompletionAndExpressionCompletionParserRuleCall_1_0; }
	}

	public class AndExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AndExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEqualityExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEqualityExpressionCompletionEqualityExpressionCompletionParserRuleCall_0_0 = (RuleCall)cEqualityExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAmpersandKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEqualityExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEqualityExpressionEqualityExpressionParserRuleCall_1_1_0 = (RuleCall)cEqualityExpressionAssignment_1_1.eContents().get(0);
		
		//AndExpressionCompletion:
		//
		//	equalityExpressionCompletion=EqualityExpressionCompletion ("&" equalityExpression+=EqualityExpression)*;
		public ParserRule getRule() { return rule; }

		//equalityExpressionCompletion=EqualityExpressionCompletion ("&" equalityExpression+=EqualityExpression)*
		public Group getGroup() { return cGroup; }

		//equalityExpressionCompletion=EqualityExpressionCompletion
		public Assignment getEqualityExpressionCompletionAssignment_0() { return cEqualityExpressionCompletionAssignment_0; }

		//EqualityExpressionCompletion
		public RuleCall getEqualityExpressionCompletionEqualityExpressionCompletionParserRuleCall_0_0() { return cEqualityExpressionCompletionEqualityExpressionCompletionParserRuleCall_0_0; }

		//("&" equalityExpression+=EqualityExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//"&"
		public Keyword getAmpersandKeyword_1_0() { return cAmpersandKeyword_1_0; }

		//equalityExpression+=EqualityExpression
		public Assignment getEqualityExpressionAssignment_1_1() { return cEqualityExpressionAssignment_1_1; }

		//EqualityExpression
		public RuleCall getEqualityExpressionEqualityExpressionParserRuleCall_1_1_0() { return cEqualityExpressionEqualityExpressionParserRuleCall_1_1_0; }
	}

	public class ExclusiveOrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExclusiveOrExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cExclusiveOrExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExclusiveOrExpressionCompletionExclusiveOrExpressionCompletionParserRuleCall_1_0 = (RuleCall)cExclusiveOrExpressionCompletionAssignment_1.eContents().get(0);
		
		//ExclusiveOrExpression:
		//
		//	unaryExpression=UnaryExpression exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion
		public Assignment getExclusiveOrExpressionCompletionAssignment_1() { return cExclusiveOrExpressionCompletionAssignment_1; }

		//ExclusiveOrExpressionCompletion
		public RuleCall getExclusiveOrExpressionCompletionExclusiveOrExpressionCompletionParserRuleCall_1_0() { return cExclusiveOrExpressionCompletionExclusiveOrExpressionCompletionParserRuleCall_1_0; }
	}

	public class ExclusiveOrExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExclusiveOrExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAndExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAndExpressionCompletionAndExpressionCompletionParserRuleCall_0_0 = (RuleCall)cAndExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCircumflexAccentKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAndExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAndExpressionAndExpressionParserRuleCall_1_1_0 = (RuleCall)cAndExpressionAssignment_1_1.eContents().get(0);
		
		//ExclusiveOrExpressionCompletion:
		//
		//	andExpressionCompletion=AndExpressionCompletion ("^" andExpression+=AndExpression)*;
		public ParserRule getRule() { return rule; }

		//andExpressionCompletion=AndExpressionCompletion ("^" andExpression+=AndExpression)*
		public Group getGroup() { return cGroup; }

		//andExpressionCompletion=AndExpressionCompletion
		public Assignment getAndExpressionCompletionAssignment_0() { return cAndExpressionCompletionAssignment_0; }

		//AndExpressionCompletion
		public RuleCall getAndExpressionCompletionAndExpressionCompletionParserRuleCall_0_0() { return cAndExpressionCompletionAndExpressionCompletionParserRuleCall_0_0; }

		//("^" andExpression+=AndExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//"^"
		public Keyword getCircumflexAccentKeyword_1_0() { return cCircumflexAccentKeyword_1_0; }

		//andExpression+=AndExpression
		public Assignment getAndExpressionAssignment_1_1() { return cAndExpressionAssignment_1_1; }

		//AndExpression
		public RuleCall getAndExpressionAndExpressionParserRuleCall_1_1_0() { return cAndExpressionAndExpressionParserRuleCall_1_1_0; }
	}

	public class InclusiveOrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InclusiveOrExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cInclusiveOrExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInclusiveOrExpressionCompletionInclusiveOrExpressionCompletionParserRuleCall_1_0 = (RuleCall)cInclusiveOrExpressionCompletionAssignment_1.eContents().get(0);
		
		//InclusiveOrExpression:
		//
		//	unaryExpression=UnaryExpression inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion
		public Assignment getInclusiveOrExpressionCompletionAssignment_1() { return cInclusiveOrExpressionCompletionAssignment_1; }

		//InclusiveOrExpressionCompletion
		public RuleCall getInclusiveOrExpressionCompletionInclusiveOrExpressionCompletionParserRuleCall_1_0() { return cInclusiveOrExpressionCompletionInclusiveOrExpressionCompletionParserRuleCall_1_0; }
	}

	public class InclusiveOrExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InclusiveOrExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExclusiveOrExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExclusiveOrExpressionCompletionExclusiveOrExpressionCompletionParserRuleCall_0_0 = (RuleCall)cExclusiveOrExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExclusiveOrExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExclusiveOrExpressionExclusiveOrExpressionParserRuleCall_1_1_0 = (RuleCall)cExclusiveOrExpressionAssignment_1_1.eContents().get(0);
		
		//InclusiveOrExpressionCompletion:
		//
		//	exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion ("|" exclusiveOrExpression+=ExclusiveOrExpression)*;
		public ParserRule getRule() { return rule; }

		//exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion ("|" exclusiveOrExpression+=ExclusiveOrExpression)*
		public Group getGroup() { return cGroup; }

		//exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion
		public Assignment getExclusiveOrExpressionCompletionAssignment_0() { return cExclusiveOrExpressionCompletionAssignment_0; }

		//ExclusiveOrExpressionCompletion
		public RuleCall getExclusiveOrExpressionCompletionExclusiveOrExpressionCompletionParserRuleCall_0_0() { return cExclusiveOrExpressionCompletionExclusiveOrExpressionCompletionParserRuleCall_0_0; }

		//("|" exclusiveOrExpression+=ExclusiveOrExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//"|"
		public Keyword getVerticalLineKeyword_1_0() { return cVerticalLineKeyword_1_0; }

		//exclusiveOrExpression+=ExclusiveOrExpression
		public Assignment getExclusiveOrExpressionAssignment_1_1() { return cExclusiveOrExpressionAssignment_1_1; }

		//ExclusiveOrExpression
		public RuleCall getExclusiveOrExpressionExclusiveOrExpressionParserRuleCall_1_1_0() { return cExclusiveOrExpressionExclusiveOrExpressionParserRuleCall_1_1_0; }
	}

	public class ConditionalAndExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConditionalAndExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cConditionalAndExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionalAndExpressionCompletionConditionalAndExpressionCompletionParserRuleCall_1_0 = (RuleCall)cConditionalAndExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * CONDITIONAL LOGICAL EXPRESSIONS * /
		//
		//ConditionalAndExpression:
		//
		//	unaryExpression=UnaryExpression conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion
		public Assignment getConditionalAndExpressionCompletionAssignment_1() { return cConditionalAndExpressionCompletionAssignment_1; }

		//ConditionalAndExpressionCompletion
		public RuleCall getConditionalAndExpressionCompletionConditionalAndExpressionCompletionParserRuleCall_1_0() { return cConditionalAndExpressionCompletionConditionalAndExpressionCompletionParserRuleCall_1_0; }
	}

	public class ConditionalAndExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConditionalAndExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInclusiveOrExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInclusiveOrExpressionCompletionInclusiveOrExpressionCompletionParserRuleCall_0_0 = (RuleCall)cInclusiveOrExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAmpersandAmpersandKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cInclusiveOrExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cInclusiveOrExpressionInclusiveOrExpressionParserRuleCall_1_1_0 = (RuleCall)cInclusiveOrExpressionAssignment_1_1.eContents().get(0);
		
		//ConditionalAndExpressionCompletion:
		//
		//	inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion ("&&" inclusiveOrExpression+=InclusiveOrExpression)*;
		public ParserRule getRule() { return rule; }

		//inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion ("&&" inclusiveOrExpression+=InclusiveOrExpression)*
		public Group getGroup() { return cGroup; }

		//inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion
		public Assignment getInclusiveOrExpressionCompletionAssignment_0() { return cInclusiveOrExpressionCompletionAssignment_0; }

		//InclusiveOrExpressionCompletion
		public RuleCall getInclusiveOrExpressionCompletionInclusiveOrExpressionCompletionParserRuleCall_0_0() { return cInclusiveOrExpressionCompletionInclusiveOrExpressionCompletionParserRuleCall_0_0; }

		//("&&" inclusiveOrExpression+=InclusiveOrExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//"&&"
		public Keyword getAmpersandAmpersandKeyword_1_0() { return cAmpersandAmpersandKeyword_1_0; }

		//inclusiveOrExpression+=InclusiveOrExpression
		public Assignment getInclusiveOrExpressionAssignment_1_1() { return cInclusiveOrExpressionAssignment_1_1; }

		//InclusiveOrExpression
		public RuleCall getInclusiveOrExpressionInclusiveOrExpressionParserRuleCall_1_1_0() { return cInclusiveOrExpressionInclusiveOrExpressionParserRuleCall_1_1_0; }
	}

	public class ConditionalOrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConditionalOrExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cConditionalOrExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionalOrExpressionCompletionConditionalOrExpressionCompletionParserRuleCall_1_0 = (RuleCall)cConditionalOrExpressionCompletionAssignment_1.eContents().get(0);
		
		//// In the spec, this rule is not explicitly called by any other rule
		//
		//ConditionalOrExpression:
		//
		//	unaryExpression=UnaryExpression conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion
		public Assignment getConditionalOrExpressionCompletionAssignment_1() { return cConditionalOrExpressionCompletionAssignment_1; }

		//ConditionalOrExpressionCompletion
		public RuleCall getConditionalOrExpressionCompletionConditionalOrExpressionCompletionParserRuleCall_1_0() { return cConditionalOrExpressionCompletionConditionalOrExpressionCompletionParserRuleCall_1_0; }
	}

	public class ConditionalOrExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConditionalOrExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConditionalAndExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cConditionalAndExpressionCompletionConditionalAndExpressionCompletionParserRuleCall_0_0 = (RuleCall)cConditionalAndExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cVerticalLineVerticalLineKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cConditionalAndExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cConditionalAndExpressionConditionalAndExpressionParserRuleCall_1_1_0 = (RuleCall)cConditionalAndExpressionAssignment_1_1.eContents().get(0);
		
		//ConditionalOrExpressionCompletion:
		//
		//	conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion ("||"
		//
		//	conditionalAndExpression+=ConditionalAndExpression)*;
		public ParserRule getRule() { return rule; }

		//conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion ("||"
		//
		//conditionalAndExpression+=ConditionalAndExpression)*
		public Group getGroup() { return cGroup; }

		//conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion
		public Assignment getConditionalAndExpressionCompletionAssignment_0() { return cConditionalAndExpressionCompletionAssignment_0; }

		//ConditionalAndExpressionCompletion
		public RuleCall getConditionalAndExpressionCompletionConditionalAndExpressionCompletionParserRuleCall_0_0() { return cConditionalAndExpressionCompletionConditionalAndExpressionCompletionParserRuleCall_0_0; }

		//("||" conditionalAndExpression+=ConditionalAndExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//"||"
		public Keyword getVerticalLineVerticalLineKeyword_1_0() { return cVerticalLineVerticalLineKeyword_1_0; }

		//conditionalAndExpression+=ConditionalAndExpression
		public Assignment getConditionalAndExpressionAssignment_1_1() { return cConditionalAndExpressionAssignment_1_1; }

		//ConditionalAndExpression
		public RuleCall getConditionalAndExpressionConditionalAndExpressionParserRuleCall_1_1_0() { return cConditionalAndExpressionConditionalAndExpressionParserRuleCall_1_1_0; }
	}

	public class ConditionalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConditionalExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cUnaryExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cUnaryExpressionUnaryExpressionParserRuleCall_0_0 = (RuleCall)cUnaryExpressionAssignment_0.eContents().get(0);
		private final Assignment cConditionalExpressionCompletionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionalExpressionCompletionConditionalExpressionCompletionParserRuleCall_1_0 = (RuleCall)cConditionalExpressionCompletionAssignment_1.eContents().get(0);
		
		///// * CONDITIONAL-TEST EXPRESSIONS * /
		//
		//ConditionalExpression:
		//
		//	unaryExpression=UnaryExpression conditionalExpressionCompletion=ConditionalExpressionCompletion;
		public ParserRule getRule() { return rule; }

		//unaryExpression=UnaryExpression conditionalExpressionCompletion=ConditionalExpressionCompletion
		public Group getGroup() { return cGroup; }

		//unaryExpression=UnaryExpression
		public Assignment getUnaryExpressionAssignment_0() { return cUnaryExpressionAssignment_0; }

		//UnaryExpression
		public RuleCall getUnaryExpressionUnaryExpressionParserRuleCall_0_0() { return cUnaryExpressionUnaryExpressionParserRuleCall_0_0; }

		//conditionalExpressionCompletion=ConditionalExpressionCompletion
		public Assignment getConditionalExpressionCompletionAssignment_1() { return cConditionalExpressionCompletionAssignment_1; }

		//ConditionalExpressionCompletion
		public RuleCall getConditionalExpressionCompletionConditionalExpressionCompletionParserRuleCall_1_0() { return cConditionalExpressionCompletionConditionalExpressionCompletionParserRuleCall_1_0; }
	}

	public class ConditionalExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConditionalExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConditionalOrExpressionCompletionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cConditionalOrExpressionCompletionConditionalOrExpressionCompletionParserRuleCall_0_0 = (RuleCall)cConditionalOrExpressionCompletionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cQuestionMarkKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_1_0 = (RuleCall)cExpressionAssignment_1_1.eContents().get(0);
		private final Keyword cColonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cConditionalExpressionAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cConditionalExpressionConditionalExpressionParserRuleCall_1_3_0 = (RuleCall)cConditionalExpressionAssignment_1_3.eContents().get(0);
		
		//ConditionalExpressionCompletion:
		//
		//	conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion ("?" expression=Expression ":"
		//
		//	conditionalExpression=ConditionalExpression)?;
		public ParserRule getRule() { return rule; }

		//conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion ("?" expression=Expression ":"
		//
		//conditionalExpression=ConditionalExpression)?
		public Group getGroup() { return cGroup; }

		//conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion
		public Assignment getConditionalOrExpressionCompletionAssignment_0() { return cConditionalOrExpressionCompletionAssignment_0; }

		//ConditionalOrExpressionCompletion
		public RuleCall getConditionalOrExpressionCompletionConditionalOrExpressionCompletionParserRuleCall_0_0() { return cConditionalOrExpressionCompletionConditionalOrExpressionCompletionParserRuleCall_0_0; }

		//("?" expression=Expression ":" conditionalExpression=ConditionalExpression)?
		public Group getGroup_1() { return cGroup_1; }

		//"?"
		public Keyword getQuestionMarkKeyword_1_0() { return cQuestionMarkKeyword_1_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1_1() { return cExpressionAssignment_1_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_1_0() { return cExpressionExpressionParserRuleCall_1_1_0; }

		//":"
		public Keyword getColonKeyword_1_2() { return cColonKeyword_1_2; }

		//conditionalExpression=ConditionalExpression
		public Assignment getConditionalExpressionAssignment_1_3() { return cConditionalExpressionAssignment_1_3; }

		//ConditionalExpression
		public RuleCall getConditionalExpressionConditionalExpressionParserRuleCall_1_3_0() { return cConditionalExpressionConditionalExpressionParserRuleCall_1_3_0; }
	}

	public class AssignmentExpressionCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssignmentExpressionCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOperatorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOperatorAssignmentOperatorEnumRuleCall_0_0 = (RuleCall)cOperatorAssignment_0.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		///// * ASSIGNMENT EXPRESSIONS * /
		//
		//AssignmentExpressionCompletion:
		//
		//	operator=AssignmentOperator expression=Expression;
		public ParserRule getRule() { return rule; }

		//operator=AssignmentOperator expression=Expression
		public Group getGroup() { return cGroup; }

		//operator=AssignmentOperator
		public Assignment getOperatorAssignment_0() { return cOperatorAssignment_0; }

		//AssignmentOperator
		public RuleCall getOperatorAssignmentOperatorEnumRuleCall_0_0() { return cOperatorAssignmentOperatorEnumRuleCall_0_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
	}

	public class StatementSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StatementSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStatementSequenceAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDocumentStatementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDocumentStatementDocumentedStatementParserRuleCall_1_0 = (RuleCall)cDocumentStatementAssignment_1.eContents().get(0);
		
		///// **************
		//
		//// * STATEMENTS *
		//
		//// ************** /
		//
		//StatementSequence:
		//
		//	{StatementSequence} documentStatement+=DocumentedStatement*;
		public ParserRule getRule() { return rule; }

		//{StatementSequence} documentStatement+=DocumentedStatement*
		public Group getGroup() { return cGroup; }

		//{StatementSequence}
		public Action getStatementSequenceAction_0() { return cStatementSequenceAction_0; }

		//documentStatement+=DocumentedStatement*
		public Assignment getDocumentStatementAssignment_1() { return cDocumentStatementAssignment_1; }

		//DocumentedStatement
		public RuleCall getDocumentStatementDocumentedStatementParserRuleCall_1_0() { return cDocumentStatementDocumentedStatementParserRuleCall_1_0; }
	}

	public class DocumentedStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DocumentedStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cStatementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementStatementParserRuleCall_1_0 = (RuleCall)cStatementAssignment_1.eContents().get(0);
		
		//DocumentedStatement:
		//
		//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / statement=Statement;
		public ParserRule getRule() { return rule; }

		//comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / statement=Statement
		public Group getGroup() { return cGroup; }

		//comment=ML_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_0_0() { return cCommentML_COMMENTTerminalRuleCall_0_0; }

		//statement=Statement
		public Assignment getStatementAssignment_1() { return cStatementAssignment_1; }

		//Statement
		public RuleCall getStatementStatementParserRuleCall_1_0() { return cStatementStatementParserRuleCall_1_0; }
	}

	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAnnotatedStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInLineStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBlockStatementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEmptyStatementParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cLocalNameDeclarationOrExpressionStatementParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cLocalNameDeclarationStatementParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cIfStatementParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cSwitchStatementParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cWhileStatementParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cForStatementParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cDoStatementParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cBreakStatementParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cReturnStatementParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cAcceptStatementParserRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		private final RuleCall cClassifyStatementParserRuleCall_14 = (RuleCall)cAlternatives.eContents().get(14);
		
		//Statement:
		//
		//	AnnotatedStatement | InLineStatement | BlockStatement | EmptyStatement | LocalNameDeclarationOrExpressionStatement |
		//
		//	LocalNameDeclarationStatement | IfStatement | SwitchStatement | WhileStatement | ForStatement | DoStatement |
		//
		//	BreakStatement | ReturnStatement | AcceptStatement | ClassifyStatement;
		public ParserRule getRule() { return rule; }

		//AnnotatedStatement | InLineStatement | BlockStatement | EmptyStatement | LocalNameDeclarationOrExpressionStatement |
		//
		//LocalNameDeclarationStatement | IfStatement | SwitchStatement | WhileStatement | ForStatement | DoStatement |
		//
		//BreakStatement | ReturnStatement | AcceptStatement | ClassifyStatement
		public Alternatives getAlternatives() { return cAlternatives; }

		//AnnotatedStatement
		public RuleCall getAnnotatedStatementParserRuleCall_0() { return cAnnotatedStatementParserRuleCall_0; }

		//InLineStatement
		public RuleCall getInLineStatementParserRuleCall_1() { return cInLineStatementParserRuleCall_1; }

		//BlockStatement
		public RuleCall getBlockStatementParserRuleCall_2() { return cBlockStatementParserRuleCall_2; }

		//EmptyStatement
		public RuleCall getEmptyStatementParserRuleCall_3() { return cEmptyStatementParserRuleCall_3; }

		//LocalNameDeclarationOrExpressionStatement
		public RuleCall getLocalNameDeclarationOrExpressionStatementParserRuleCall_4() { return cLocalNameDeclarationOrExpressionStatementParserRuleCall_4; }

		//LocalNameDeclarationStatement
		public RuleCall getLocalNameDeclarationStatementParserRuleCall_5() { return cLocalNameDeclarationStatementParserRuleCall_5; }

		//IfStatement
		public RuleCall getIfStatementParserRuleCall_6() { return cIfStatementParserRuleCall_6; }

		//SwitchStatement
		public RuleCall getSwitchStatementParserRuleCall_7() { return cSwitchStatementParserRuleCall_7; }

		//WhileStatement
		public RuleCall getWhileStatementParserRuleCall_8() { return cWhileStatementParserRuleCall_8; }

		//ForStatement
		public RuleCall getForStatementParserRuleCall_9() { return cForStatementParserRuleCall_9; }

		//DoStatement
		public RuleCall getDoStatementParserRuleCall_10() { return cDoStatementParserRuleCall_10; }

		//BreakStatement
		public RuleCall getBreakStatementParserRuleCall_11() { return cBreakStatementParserRuleCall_11; }

		//ReturnStatement
		public RuleCall getReturnStatementParserRuleCall_12() { return cReturnStatementParserRuleCall_12; }

		//AcceptStatement
		public RuleCall getAcceptStatementParserRuleCall_13() { return cAcceptStatementParserRuleCall_13; }

		//ClassifyStatement
		public RuleCall getClassifyStatementParserRuleCall_14() { return cClassifyStatementParserRuleCall_14; }
	}

	public class BlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Block");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStatementSequenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementSequenceStatementSequenceParserRuleCall_1_0 = (RuleCall)cStatementSequenceAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		///// * BLOCK * /
		//
		//Block:
		//
		//	"{" statementSequence=StatementSequence "}";
		public ParserRule getRule() { return rule; }

		//"{" statementSequence=StatementSequence "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//statementSequence=StatementSequence
		public Assignment getStatementSequenceAssignment_1() { return cStatementSequenceAssignment_1; }

		//StatementSequence
		public RuleCall getStatementSequenceStatementSequenceParserRuleCall_1_0() { return cStatementSequenceStatementSequenceParserRuleCall_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class AnnotatedStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnotatedStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSolidusSolidusCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnnotationsAnnotationsParserRuleCall_1_0 = (RuleCall)cAnnotationsAssignment_1.eContents().get(0);
		private final Keyword cLineFeedLfKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStatementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatementStatementParserRuleCall_3_0 = (RuleCall)cStatementAssignment_3.eContents().get(0);
		
		///// * ANNOTATED STATEMENTS * /
		//
		//AnnotatedStatement:
		//
		//	"//@" annotations=Annotations / * <EOL> * / "\n" statement=Statement;
		public ParserRule getRule() { return rule; }

		//"//@" annotations=Annotations / * <EOL> * / "\n" statement=Statement
		public Group getGroup() { return cGroup; }

		//"//@"
		public Keyword getSolidusSolidusCommercialAtKeyword_0() { return cSolidusSolidusCommercialAtKeyword_0; }

		//annotations=Annotations
		public Assignment getAnnotationsAssignment_1() { return cAnnotationsAssignment_1; }

		//Annotations
		public RuleCall getAnnotationsAnnotationsParserRuleCall_1_0() { return cAnnotationsAnnotationsParserRuleCall_1_0; }

		/// * <EOL> * / "\n"
		public Keyword getLineFeedLfKeyword_2() { return cLineFeedLfKeyword_2; }

		//statement=Statement
		public Assignment getStatementAssignment_3() { return cStatementAssignment_3; }

		//Statement
		public RuleCall getStatementStatementParserRuleCall_3_0() { return cStatementStatementParserRuleCall_3_0; }
	}

	public class AnnotationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Annotations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommercialAtKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAnnotationAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAnnotationAnnotationParserRuleCall_1_1_0 = (RuleCall)cAnnotationAssignment_1_1.eContents().get(0);
		
		//Annotations:
		//
		//	annotation+=Annotation ("@" annotation+=Annotation)*;
		public ParserRule getRule() { return rule; }

		//annotation+=Annotation ("@" annotation+=Annotation)*
		public Group getGroup() { return cGroup; }

		//annotation+=Annotation
		public Assignment getAnnotationAssignment_0() { return cAnnotationAssignment_0; }

		//Annotation
		public RuleCall getAnnotationAnnotationParserRuleCall_0_0() { return cAnnotationAnnotationParserRuleCall_0_0; }

		//("@" annotation+=Annotation)*
		public Group getGroup_1() { return cGroup_1; }

		//"@"
		public Keyword getCommercialAtKeyword_1_0() { return cCommercialAtKeyword_1_0; }

		//annotation+=Annotation
		public Assignment getAnnotationAssignment_1_1() { return cAnnotationAssignment_1_1; }

		//Annotation
		public RuleCall getAnnotationAnnotationParserRuleCall_1_1_0() { return cAnnotationAnnotationParserRuleCall_1_1_0; }
	}

	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIdAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIdIDTerminalRuleCall_0_0 = (RuleCall)cIdAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameListAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameListNameListParserRuleCall_1_1_0 = (RuleCall)cNameListAssignment_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Annotation:
		//
		//	id=ID ("(" nameList=NameList ")")?;
		public ParserRule getRule() { return rule; }

		//id=ID ("(" nameList=NameList ")")?
		public Group getGroup() { return cGroup; }

		//id=ID
		public Assignment getIdAssignment_0() { return cIdAssignment_0; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_0_0() { return cIdIDTerminalRuleCall_0_0; }

		//("(" nameList=NameList ")")?
		public Group getGroup_1() { return cGroup_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }

		//nameList=NameList
		public Assignment getNameListAssignment_1_1() { return cNameListAssignment_1_1; }

		//NameList
		public RuleCall getNameListNameListParserRuleCall_1_1_0() { return cNameListNameListParserRuleCall_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}

	public class NameListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		
		//NameList:
		//
		//	name+=Name ("," name+=Name)*;
		public ParserRule getRule() { return rule; }

		//name+=Name ("," name+=Name)*
		public Group getGroup() { return cGroup; }

		//name+=Name
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0() { return cNameNameParserRuleCall_0_0; }

		//("," name+=Name)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//name+=Name
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_1_0() { return cNameNameParserRuleCall_1_1_0; }
	}

	public class InLineStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InLineStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSolidusAsteriskCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameNameParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		///// * IN-LINE STATEMENTS * /
		//
		////<DOCUMENTATION_COMMENT>
		//
		//InLineStatement:
		//
		//	"/ *@" id=ID "(" name=Name ")";
		public ParserRule getRule() { return rule; }

		//"/ *@" id=ID "(" name=Name ")"
		public Group getGroup() { return cGroup; }

		//"/ *@"
		public Keyword getSolidusAsteriskCommercialAtKeyword_0() { return cSolidusAsteriskCommercialAtKeyword_0; }

		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//name=Name
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//Name
		public RuleCall getNameNameParserRuleCall_3_0() { return cNameNameParserRuleCall_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class BlockStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BlockStatement");
		private final Assignment cBlockAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cBlockBlockParserRuleCall_0 = (RuleCall)cBlockAssignment.eContents().get(0);
		
		///// * BLOCK STATEMENTS * /
		//
		//BlockStatement:
		//
		//	block=Block;
		public ParserRule getRule() { return rule; }

		//block=Block
		public Assignment getBlockAssignment() { return cBlockAssignment; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_0() { return cBlockBlockParserRuleCall_0; }
	}

	public class EmptyStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EmptyStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEmptyStatementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		///// * EMPTY STATEMENTS * /
		//
		//EmptyStatement:
		//
		//	{EmptyStatement} ";";
		public ParserRule getRule() { return rule; }

		//{EmptyStatement} ";"
		public Group getGroup() { return cGroup; }

		//{EmptyStatement}
		public Action getEmptyStatementAction_0() { return cEmptyStatementAction_0; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class LocalNameDeclarationOrExpressionStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LocalNameDeclarationOrExpressionStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cPotentiallyAmbiguousNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cPotentiallyAmbiguousNameQualifiedNameParserRuleCall_0_0_0 = (RuleCall)cPotentiallyAmbiguousNameAssignment_0_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cAlternatives_0_1.eContents().get(0);
		private final Assignment cMultiplicaityIndicatorAssignment_0_1_0_0 = (Assignment)cGroup_0_1_0.eContents().get(0);
		private final RuleCall cMultiplicaityIndicatorMultiplicityIndicatorParserRuleCall_0_1_0_0_0 = (RuleCall)cMultiplicaityIndicatorAssignment_0_1_0_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1_0_1 = (Assignment)cGroup_0_1_0.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_0_1_0_1_0 = (RuleCall)cNameAssignment_0_1_0_1.eContents().get(0);
		private final Assignment cLocalNameDeclarationCompletionAssignment_0_1_0_2 = (Assignment)cGroup_0_1_0.eContents().get(2);
		private final RuleCall cLocalNameDeclarationCompletionLocalNameDeclarationStatementCompletionParserRuleCall_0_1_0_2_0 = (RuleCall)cLocalNameDeclarationCompletionAssignment_0_1_0_2.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cAlternatives_0_1.eContents().get(1);
		private final Assignment cNameToExpressionCompletionAssignment_0_1_1_0 = (Assignment)cGroup_0_1_1.eContents().get(0);
		private final RuleCall cNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_0_1_1_0_0 = (RuleCall)cNameToExpressionCompletionAssignment_0_1_1_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_0_1_1_1 = (Keyword)cGroup_0_1_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cNonNameExpressionAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNonNameExpressionNonNameExpressionParserRuleCall_1_0_0 = (RuleCall)cNonNameExpressionAssignment_1_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		///// * LOCAL NAME DECLARATION AND EXPRESSION STATEMENTS * /
		//
		//LocalNameDeclarationOrExpressionStatement:
		//
		//	potentiallyAmbiguousName=QualifiedName (multiplicaityIndicator=MultiplicityIndicator? name=Name
		//
		//	localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion //| (localNameDeclarationCompletion = LocalNameDeclarationStatementCompletion) // ADDED
		//
		//	| nameToExpressionCompletion= / *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion ";") //potentiallyAmbiguousName = PotentiallyAmbiguousQualifiedName
		//
		//	| nonNameExpression=NonNameExpression ";";
		public ParserRule getRule() { return rule; }

		//potentiallyAmbiguousName=QualifiedName (multiplicaityIndicator=MultiplicityIndicator? name=Name
		//
		//localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion //| (localNameDeclarationCompletion = LocalNameDeclarationStatementCompletion) // ADDED
		//
		//| nameToExpressionCompletion= / *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion ";") //potentiallyAmbiguousName = PotentiallyAmbiguousQualifiedName
		//
		//| nonNameExpression=NonNameExpression ";"
		public Alternatives getAlternatives() { return cAlternatives; }

		//potentiallyAmbiguousName=QualifiedName (multiplicaityIndicator=MultiplicityIndicator? name=Name
		//
		//localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion //| (localNameDeclarationCompletion = LocalNameDeclarationStatementCompletion) // ADDED
		//
		//| nameToExpressionCompletion= / *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion ";")
		public Group getGroup_0() { return cGroup_0; }

		//potentiallyAmbiguousName=QualifiedName
		public Assignment getPotentiallyAmbiguousNameAssignment_0_0() { return cPotentiallyAmbiguousNameAssignment_0_0; }

		//QualifiedName
		public RuleCall getPotentiallyAmbiguousNameQualifiedNameParserRuleCall_0_0_0() { return cPotentiallyAmbiguousNameQualifiedNameParserRuleCall_0_0_0; }

		//multiplicaityIndicator=MultiplicityIndicator? name=Name
		//
		//localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion //| (localNameDeclarationCompletion = LocalNameDeclarationStatementCompletion) // ADDED
		//
		//| nameToExpressionCompletion= / *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion ";"
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//multiplicaityIndicator=MultiplicityIndicator? name=Name
		//
		//localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }

		//multiplicaityIndicator=MultiplicityIndicator?
		public Assignment getMultiplicaityIndicatorAssignment_0_1_0_0() { return cMultiplicaityIndicatorAssignment_0_1_0_0; }

		//MultiplicityIndicator
		public RuleCall getMultiplicaityIndicatorMultiplicityIndicatorParserRuleCall_0_1_0_0_0() { return cMultiplicaityIndicatorMultiplicityIndicatorParserRuleCall_0_1_0_0_0; }

		//name=Name
		public Assignment getNameAssignment_0_1_0_1() { return cNameAssignment_0_1_0_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_1_0_1_0() { return cNameNameParserRuleCall_0_1_0_1_0; }

		//localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion
		public Assignment getLocalNameDeclarationCompletionAssignment_0_1_0_2() { return cLocalNameDeclarationCompletionAssignment_0_1_0_2; }

		//LocalNameDeclarationStatementCompletion
		public RuleCall getLocalNameDeclarationCompletionLocalNameDeclarationStatementCompletionParserRuleCall_0_1_0_2_0() { return cLocalNameDeclarationCompletionLocalNameDeclarationStatementCompletionParserRuleCall_0_1_0_2_0; }

		//nameToExpressionCompletion= / *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion ";"
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }

		//nameToExpressionCompletion= / *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion
		public Assignment getNameToExpressionCompletionAssignment_0_1_1_0() { return cNameToExpressionCompletionAssignment_0_1_1_0; }

		/// *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion
		public RuleCall getNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_0_1_1_0_0() { return cNameToExpressionCompletionNameToExpressionCompletionParserRuleCall_0_1_1_0_0; }

		//";"
		public Keyword getSemicolonKeyword_0_1_1_1() { return cSemicolonKeyword_0_1_1_1; }

		//nonNameExpression=NonNameExpression ";"
		public Group getGroup_1() { return cGroup_1; }

		//nonNameExpression=NonNameExpression
		public Assignment getNonNameExpressionAssignment_1_0() { return cNonNameExpressionAssignment_1_0; }

		//NonNameExpression
		public RuleCall getNonNameExpressionNonNameExpressionParserRuleCall_1_0_0() { return cNonNameExpressionNonNameExpressionParserRuleCall_1_0_0; }

		//";"
		public Keyword getSemicolonKeyword_1_1() { return cSemicolonKeyword_1_1; }
	}

	public class LocalNameDeclarationStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LocalNameDeclarationStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeNameTypeNameParserRuleCall_3_0 = (RuleCall)cTypeNameAssignment_3.eContents().get(0);
		private final Assignment cMultiplicityIndicatorAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMultiplicityIndicatorMultiplicityIndicatorParserRuleCall_4_0 = (RuleCall)cMultiplicityIndicatorAssignment_4.eContents().get(0);
		private final Assignment cLocalNameDeclarationCompletionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLocalNameDeclarationCompletionLocalNameDeclarationStatementCompletionParserRuleCall_5_0 = (RuleCall)cLocalNameDeclarationCompletionAssignment_5.eContents().get(0);
		
		//LocalNameDeclarationStatement:
		//
		//	"let" name=Name ":" typeName=TypeName multiplicityIndicator=MultiplicityIndicator?
		//
		//	localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion;
		public ParserRule getRule() { return rule; }

		//"let" name=Name ":" typeName=TypeName multiplicityIndicator=MultiplicityIndicator?
		//
		//localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion
		public Group getGroup() { return cGroup; }

		//"let"
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }

		//name=Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//typeName=TypeName
		public Assignment getTypeNameAssignment_3() { return cTypeNameAssignment_3; }

		//TypeName
		public RuleCall getTypeNameTypeNameParserRuleCall_3_0() { return cTypeNameTypeNameParserRuleCall_3_0; }

		//multiplicityIndicator=MultiplicityIndicator?
		public Assignment getMultiplicityIndicatorAssignment_4() { return cMultiplicityIndicatorAssignment_4; }

		//MultiplicityIndicator
		public RuleCall getMultiplicityIndicatorMultiplicityIndicatorParserRuleCall_4_0() { return cMultiplicityIndicatorMultiplicityIndicatorParserRuleCall_4_0; }

		//localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion
		public Assignment getLocalNameDeclarationCompletionAssignment_5() { return cLocalNameDeclarationCompletionAssignment_5; }

		//LocalNameDeclarationStatementCompletion
		public RuleCall getLocalNameDeclarationCompletionLocalNameDeclarationStatementCompletionParserRuleCall_5_0() { return cLocalNameDeclarationCompletionLocalNameDeclarationStatementCompletionParserRuleCall_5_0; }
	}

	public class LocalNameDeclarationStatementCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LocalNameDeclarationStatementCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInitializationExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInitializationExpressionInitializationExpressionParserRuleCall_1_0 = (RuleCall)cInitializationExpressionAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//LocalNameDeclarationStatementCompletion:
		//
		//	"=" initializationExpression=InitializationExpression ";";
		public ParserRule getRule() { return rule; }

		//"=" initializationExpression=InitializationExpression ";"
		public Group getGroup() { return cGroup; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//initializationExpression=InitializationExpression
		public Assignment getInitializationExpressionAssignment_1() { return cInitializationExpressionAssignment_1; }

		//InitializationExpression
		public RuleCall getInitializationExpressionInitializationExpressionParserRuleCall_1_0() { return cInitializationExpressionInitializationExpressionParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class InitializationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InitializationExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSequenceInitializationExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cInstanceInitializationExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//InitializationExpression:
		//
		//	Expression | SequenceInitializationExpression | InstanceInitializationExpression;
		public ParserRule getRule() { return rule; }

		//Expression | SequenceInitializationExpression | InstanceInitializationExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//Expression
		public RuleCall getExpressionParserRuleCall_0() { return cExpressionParserRuleCall_0; }

		//SequenceInitializationExpression
		public RuleCall getSequenceInitializationExpressionParserRuleCall_1() { return cSequenceInitializationExpressionParserRuleCall_1; }

		//InstanceInitializationExpression
		public RuleCall getInstanceInitializationExpressionParserRuleCall_2() { return cInstanceInitializationExpressionParserRuleCall_2; }
	}

	public class InstanceInitializationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InstanceInitializationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTupleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTupleTupleParserRuleCall_1_0 = (RuleCall)cTupleAssignment_1.eContents().get(0);
		
		//InstanceInitializationExpression:
		//
		//	"new" tuple=Tuple;
		public ParserRule getRule() { return rule; }

		//"new" tuple=Tuple
		public Group getGroup() { return cGroup; }

		//"new"
		public Keyword getNewKeyword_0() { return cNewKeyword_0; }

		//tuple=Tuple
		public Assignment getTupleAssignment_1() { return cTupleAssignment_1; }

		//Tuple
		public RuleCall getTupleTupleParserRuleCall_1_0() { return cTupleTupleParserRuleCall_1_0; }
	}

	public class IfStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IfStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSequentialClausesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSequentialClausesSequentialClausesParserRuleCall_1_0 = (RuleCall)cSequentialClausesAssignment_1.eContents().get(0);
		private final Assignment cFinalClauseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFinalClauseFinalClauseParserRuleCall_2_0 = (RuleCall)cFinalClauseAssignment_2.eContents().get(0);
		
		/// * IF STATEMENTS * / IfStatement:
		//
		//	"if" sequentialClauses=SequentialClauses finalClause=FinalClause?;
		public ParserRule getRule() { return rule; }

		//"if" sequentialClauses=SequentialClauses finalClause=FinalClause?
		public Group getGroup() { return cGroup; }

		//"if"
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//sequentialClauses=SequentialClauses
		public Assignment getSequentialClausesAssignment_1() { return cSequentialClausesAssignment_1; }

		//SequentialClauses
		public RuleCall getSequentialClausesSequentialClausesParserRuleCall_1_0() { return cSequentialClausesSequentialClausesParserRuleCall_1_0; }

		//finalClause=FinalClause?
		public Assignment getFinalClauseAssignment_2() { return cFinalClauseAssignment_2; }

		//FinalClause
		public RuleCall getFinalClauseFinalClauseParserRuleCall_2_0() { return cFinalClauseFinalClauseParserRuleCall_2_0; }
	}

	public class SequentialClausesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequentialClauses");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConcurrentClausesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cConcurrentClausesConcurrentClausesParserRuleCall_0_0 = (RuleCall)cConcurrentClausesAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cElseKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cIfKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cConcurrentClausesAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cConcurrentClausesConcurrentClausesParserRuleCall_1_2_0 = (RuleCall)cConcurrentClausesAssignment_1_2.eContents().get(0);
		
		//SequentialClauses:
		//
		//	concurrentClauses+=ConcurrentClauses ("else" "if" concurrentClauses+=ConcurrentClauses)*;
		public ParserRule getRule() { return rule; }

		//concurrentClauses+=ConcurrentClauses ("else" "if" concurrentClauses+=ConcurrentClauses)*
		public Group getGroup() { return cGroup; }

		//concurrentClauses+=ConcurrentClauses
		public Assignment getConcurrentClausesAssignment_0() { return cConcurrentClausesAssignment_0; }

		//ConcurrentClauses
		public RuleCall getConcurrentClausesConcurrentClausesParserRuleCall_0_0() { return cConcurrentClausesConcurrentClausesParserRuleCall_0_0; }

		//("else" "if" concurrentClauses+=ConcurrentClauses)*
		public Group getGroup_1() { return cGroup_1; }

		//"else"
		public Keyword getElseKeyword_1_0() { return cElseKeyword_1_0; }

		//"if"
		public Keyword getIfKeyword_1_1() { return cIfKeyword_1_1; }

		//concurrentClauses+=ConcurrentClauses
		public Assignment getConcurrentClausesAssignment_1_2() { return cConcurrentClausesAssignment_1_2; }

		//ConcurrentClauses
		public RuleCall getConcurrentClausesConcurrentClausesParserRuleCall_1_2_0() { return cConcurrentClausesConcurrentClausesParserRuleCall_1_2_0; }
	}

	public class ConcurrentClausesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConcurrentClauses");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNonFinalClauseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNonFinalClauseNonFinalClauseParserRuleCall_0_0 = (RuleCall)cNonFinalClauseAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cOrKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cIfKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cNonFinalClauseAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cNonFinalClauseNonFinalClauseParserRuleCall_1_2_0 = (RuleCall)cNonFinalClauseAssignment_1_2.eContents().get(0);
		
		//ConcurrentClauses:
		//
		//	nonFinalClause+=NonFinalClause ("or" "if" nonFinalClause+=NonFinalClause)*;
		public ParserRule getRule() { return rule; }

		//nonFinalClause+=NonFinalClause ("or" "if" nonFinalClause+=NonFinalClause)*
		public Group getGroup() { return cGroup; }

		//nonFinalClause+=NonFinalClause
		public Assignment getNonFinalClauseAssignment_0() { return cNonFinalClauseAssignment_0; }

		//NonFinalClause
		public RuleCall getNonFinalClauseNonFinalClauseParserRuleCall_0_0() { return cNonFinalClauseNonFinalClauseParserRuleCall_0_0; }

		//("or" "if" nonFinalClause+=NonFinalClause)*
		public Group getGroup_1() { return cGroup_1; }

		//"or"
		public Keyword getOrKeyword_1_0() { return cOrKeyword_1_0; }

		//"if"
		public Keyword getIfKeyword_1_1() { return cIfKeyword_1_1; }

		//nonFinalClause+=NonFinalClause
		public Assignment getNonFinalClauseAssignment_1_2() { return cNonFinalClauseAssignment_1_2; }

		//NonFinalClause
		public RuleCall getNonFinalClauseNonFinalClauseParserRuleCall_1_2_0() { return cNonFinalClauseNonFinalClauseParserRuleCall_1_2_0; }
	}

	public class NonFinalClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NonFinalClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBlockAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBlockBlockParserRuleCall_3_0 = (RuleCall)cBlockAssignment_3.eContents().get(0);
		
		//NonFinalClause:
		//
		//	"(" expression=Expression ")" block=Block;
		public ParserRule getRule() { return rule; }

		//"(" expression=Expression ")" block=Block
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }

		//block=Block
		public Assignment getBlockAssignment_3() { return cBlockAssignment_3; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_3_0() { return cBlockBlockParserRuleCall_3_0; }
	}

	public class FinalClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FinalClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBlockAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBlockBlockParserRuleCall_1_0 = (RuleCall)cBlockAssignment_1.eContents().get(0);
		
		//FinalClause:
		//
		//	"else" block=Block;
		public ParserRule getRule() { return rule; }

		//"else" block=Block
		public Group getGroup() { return cGroup; }

		//"else"
		public Keyword getElseKeyword_0() { return cElseKeyword_0; }

		//block=Block
		public Assignment getBlockAssignment_1() { return cBlockAssignment_1; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_1_0() { return cBlockBlockParserRuleCall_1_0; }
	}

	public class SwitchStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SwitchStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSwitchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSwitchClauseAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSwitchClauseSwitchClauseParserRuleCall_5_0 = (RuleCall)cSwitchClauseAssignment_5.eContents().get(0);
		private final Assignment cDefaultClauseAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDefaultClauseSwitchDefaultClauseParserRuleCall_6_0 = (RuleCall)cDefaultClauseAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		///// * SWITCH STATEMENTS * /
		//
		//SwitchStatement:
		//
		//	"switch" "(" expression=Expression ")" "{" switchClause+=SwitchClause* defaultClause=SwitchDefaultClause? "}";
		public ParserRule getRule() { return rule; }

		//"switch" "(" expression=Expression ")" "{" switchClause+=SwitchClause* defaultClause=SwitchDefaultClause? "}"
		public Group getGroup() { return cGroup; }

		//"switch"
		public Keyword getSwitchKeyword_0() { return cSwitchKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//expression=Expression
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//switchClause+=SwitchClause*
		public Assignment getSwitchClauseAssignment_5() { return cSwitchClauseAssignment_5; }

		//SwitchClause
		public RuleCall getSwitchClauseSwitchClauseParserRuleCall_5_0() { return cSwitchClauseSwitchClauseParserRuleCall_5_0; }

		//defaultClause=SwitchDefaultClause?
		public Assignment getDefaultClauseAssignment_6() { return cDefaultClauseAssignment_6; }

		//SwitchDefaultClause
		public RuleCall getDefaultClauseSwitchDefaultClauseParserRuleCall_6_0() { return cDefaultClauseSwitchDefaultClauseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class SwitchClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SwitchClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSwitchCaseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSwitchCaseSwitchCaseParserRuleCall_0_0 = (RuleCall)cSwitchCaseAssignment_0.eContents().get(0);
		private final Assignment cSwitchCaseAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSwitchCaseSwitchCaseParserRuleCall_1_0 = (RuleCall)cSwitchCaseAssignment_1.eContents().get(0);
		private final Assignment cStatementSequenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0 = (RuleCall)cStatementSequenceAssignment_2.eContents().get(0);
		
		//SwitchClause:
		//
		//	switchCase+=SwitchCase switchCase+=SwitchCase* statementSequence=NonEmptyStatementSequence;
		public ParserRule getRule() { return rule; }

		//switchCase+=SwitchCase switchCase+=SwitchCase* statementSequence=NonEmptyStatementSequence
		public Group getGroup() { return cGroup; }

		//switchCase+=SwitchCase
		public Assignment getSwitchCaseAssignment_0() { return cSwitchCaseAssignment_0; }

		//SwitchCase
		public RuleCall getSwitchCaseSwitchCaseParserRuleCall_0_0() { return cSwitchCaseSwitchCaseParserRuleCall_0_0; }

		//switchCase+=SwitchCase*
		public Assignment getSwitchCaseAssignment_1() { return cSwitchCaseAssignment_1; }

		//SwitchCase
		public RuleCall getSwitchCaseSwitchCaseParserRuleCall_1_0() { return cSwitchCaseSwitchCaseParserRuleCall_1_0; }

		//statementSequence=NonEmptyStatementSequence
		public Assignment getStatementSequenceAssignment_2() { return cStatementSequenceAssignment_2; }

		//NonEmptyStatementSequence
		public RuleCall getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0() { return cStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0; }
	}

	public class SwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SwitchCase:
		//
		//	"case" expression=Expression ":";
		public ParserRule getRule() { return rule; }

		//"case" expression=Expression ":"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
	}

	public class SwitchDefaultClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SwitchDefaultClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefaultKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStatementSequenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0 = (RuleCall)cStatementSequenceAssignment_2.eContents().get(0);
		
		//SwitchDefaultClause:
		//
		//	"default" ":" statementSequence=NonEmptyStatementSequence;
		public ParserRule getRule() { return rule; }

		//"default" ":" statementSequence=NonEmptyStatementSequence
		public Group getGroup() { return cGroup; }

		//"default"
		public Keyword getDefaultKeyword_0() { return cDefaultKeyword_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//statementSequence=NonEmptyStatementSequence
		public Assignment getStatementSequenceAssignment_2() { return cStatementSequenceAssignment_2; }

		//NonEmptyStatementSequence
		public RuleCall getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0() { return cStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0; }
	}

	public class NonEmptyStatementSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NonEmptyStatementSequence");
		private final Assignment cStatementAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementDocumentedStatementParserRuleCall_0 = (RuleCall)cStatementAssignment.eContents().get(0);
		
		//NonEmptyStatementSequence:
		//
		//	statement+=DocumentedStatement+;
		public ParserRule getRule() { return rule; }

		//statement+=DocumentedStatement+
		public Assignment getStatementAssignment() { return cStatementAssignment; }

		//DocumentedStatement
		public RuleCall getStatementDocumentedStatementParserRuleCall_0() { return cStatementDocumentedStatementParserRuleCall_0; }
	}

	public class WhileStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WhileStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWhileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBlockAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBlockBlockParserRuleCall_4_0 = (RuleCall)cBlockAssignment_4.eContents().get(0);
		
		///// * WHILE STATEMENTS * /
		//
		//WhileStatement:
		//
		//	"while" "(" expression=Expression ")" block=Block;
		public ParserRule getRule() { return rule; }

		//"while" "(" expression=Expression ")" block=Block
		public Group getGroup() { return cGroup; }

		//"while"
		public Keyword getWhileKeyword_0() { return cWhileKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//expression=Expression
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//block=Block
		public Assignment getBlockAssignment_4() { return cBlockAssignment_4; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_4_0() { return cBlockBlockParserRuleCall_4_0; }
	}

	public class DoStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DoStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBlockAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBlockBlockParserRuleCall_1_0 = (RuleCall)cBlockAssignment_1.eContents().get(0);
		private final Keyword cWhileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExpressionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExpressionExpressionParserRuleCall_4_0 = (RuleCall)cExpressionAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		///// * DO STATEMENTS * /
		//
		//DoStatement:
		//
		//	"do" block=Block "while" "(" expression=Expression ")" ";";
		public ParserRule getRule() { return rule; }

		//"do" block=Block "while" "(" expression=Expression ")" ";"
		public Group getGroup() { return cGroup; }

		//"do"
		public Keyword getDoKeyword_0() { return cDoKeyword_0; }

		//block=Block
		public Assignment getBlockAssignment_1() { return cBlockAssignment_1; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_1_0() { return cBlockBlockParserRuleCall_1_0; }

		//"while"
		public Keyword getWhileKeyword_2() { return cWhileKeyword_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//expression=Expression
		public Assignment getExpressionAssignment_4() { return cExpressionAssignment_4; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_4_0() { return cExpressionExpressionParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class ForStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ForStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cForControlAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cForControlForControlParserRuleCall_2_0 = (RuleCall)cForControlAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBlockAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBlockBlockParserRuleCall_4_0 = (RuleCall)cBlockAssignment_4.eContents().get(0);
		
		///// * FOR STATEMENTS * /
		//
		//ForStatement:
		//
		//	"for" "(" forControl=ForControl ")" block=Block;
		public ParserRule getRule() { return rule; }

		//"for" "(" forControl=ForControl ")" block=Block
		public Group getGroup() { return cGroup; }

		//"for"
		public Keyword getForKeyword_0() { return cForKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//forControl=ForControl
		public Assignment getForControlAssignment_2() { return cForControlAssignment_2; }

		//ForControl
		public RuleCall getForControlForControlParserRuleCall_2_0() { return cForControlForControlParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//block=Block
		public Assignment getBlockAssignment_4() { return cBlockAssignment_4; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_4_0() { return cBlockBlockParserRuleCall_4_0; }
	}

	public class ForControlElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ForControl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLoopVariableDefinitionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_0_0 = (RuleCall)cLoopVariableDefinitionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cLoopVariableDefinitionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_1_1_0 = (RuleCall)cLoopVariableDefinitionAssignment_1_1.eContents().get(0);
		
		//ForControl:
		//
		//	loopVariableDefinition+=LoopVariableDefinition ("," loopVariableDefinition+=LoopVariableDefinition)*;
		public ParserRule getRule() { return rule; }

		//loopVariableDefinition+=LoopVariableDefinition ("," loopVariableDefinition+=LoopVariableDefinition)*
		public Group getGroup() { return cGroup; }

		//loopVariableDefinition+=LoopVariableDefinition
		public Assignment getLoopVariableDefinitionAssignment_0() { return cLoopVariableDefinitionAssignment_0; }

		//LoopVariableDefinition
		public RuleCall getLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_0_0() { return cLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_0_0; }

		//("," loopVariableDefinition+=LoopVariableDefinition)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//loopVariableDefinition+=LoopVariableDefinition
		public Assignment getLoopVariableDefinitionAssignment_1_1() { return cLoopVariableDefinitionAssignment_1_1; }

		//LoopVariableDefinition
		public RuleCall getLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_1_1_0() { return cLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_1_1_0; }
	}

	public class LoopVariableDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LoopVariableDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cInKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cExpression1Assignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cExpression1ExpressionParserRuleCall_0_2_0 = (RuleCall)cExpression1Assignment_0_2.eContents().get(0);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Keyword cFullStopFullStopKeyword_0_3_0 = (Keyword)cGroup_0_3.eContents().get(0);
		private final Assignment cExpression2Assignment_0_3_1 = (Assignment)cGroup_0_3.eContents().get(1);
		private final RuleCall cExpression2ExpressionParserRuleCall_0_3_1_0 = (RuleCall)cExpression2Assignment_0_3_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cTypeNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cTypeNameQualifiedNameParserRuleCall_1_0_0 = (RuleCall)cTypeNameAssignment_1_0.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Keyword cColonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cExpression3Assignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cExpression3ExpressionParserRuleCall_1_3_0 = (RuleCall)cExpression3Assignment_1_3.eContents().get(0);
		
		//LoopVariableDefinition:
		//
		//	name=Name "in" expression1=Expression (".." expression2=Expression)? | typeName=QualifiedName name=Name ":"
		//
		//	expression3=Expression;
		public ParserRule getRule() { return rule; }

		//name=Name "in" expression1=Expression (".." expression2=Expression)? | typeName=QualifiedName name=Name ":"
		//
		//expression3=Expression
		public Alternatives getAlternatives() { return cAlternatives; }

		//name=Name "in" expression1=Expression (".." expression2=Expression)?
		public Group getGroup_0() { return cGroup_0; }

		//name=Name
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_0_0_0() { return cNameNameParserRuleCall_0_0_0; }

		//"in"
		public Keyword getInKeyword_0_1() { return cInKeyword_0_1; }

		//expression1=Expression
		public Assignment getExpression1Assignment_0_2() { return cExpression1Assignment_0_2; }

		//Expression
		public RuleCall getExpression1ExpressionParserRuleCall_0_2_0() { return cExpression1ExpressionParserRuleCall_0_2_0; }

		//(".." expression2=Expression)?
		public Group getGroup_0_3() { return cGroup_0_3; }

		//".."
		public Keyword getFullStopFullStopKeyword_0_3_0() { return cFullStopFullStopKeyword_0_3_0; }

		//expression2=Expression
		public Assignment getExpression2Assignment_0_3_1() { return cExpression2Assignment_0_3_1; }

		//Expression
		public RuleCall getExpression2ExpressionParserRuleCall_0_3_1_0() { return cExpression2ExpressionParserRuleCall_0_3_1_0; }

		//typeName=QualifiedName name=Name ":" expression3=Expression
		public Group getGroup_1() { return cGroup_1; }

		//typeName=QualifiedName
		public Assignment getTypeNameAssignment_1_0() { return cTypeNameAssignment_1_0; }

		//QualifiedName
		public RuleCall getTypeNameQualifiedNameParserRuleCall_1_0_0() { return cTypeNameQualifiedNameParserRuleCall_1_0_0; }

		//name=Name
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_1_0() { return cNameNameParserRuleCall_1_1_0; }

		//":"
		public Keyword getColonKeyword_1_2() { return cColonKeyword_1_2; }

		//expression3=Expression
		public Assignment getExpression3Assignment_1_3() { return cExpression3Assignment_1_3; }

		//Expression
		public RuleCall getExpression3ExpressionParserRuleCall_1_3_0() { return cExpression3ExpressionParserRuleCall_1_3_0; }
	}

	public class BreakStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BreakStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBreakStatementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBreakKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		///// * BREAK STATEMENTS * /
		//
		//BreakStatement:
		//
		//	{BreakStatement} "break" ";";
		public ParserRule getRule() { return rule; }

		//{BreakStatement} "break" ";"
		public Group getGroup() { return cGroup; }

		//{BreakStatement}
		public Action getBreakStatementAction_0() { return cBreakStatementAction_0; }

		//"break"
		public Keyword getBreakKeyword_1() { return cBreakKeyword_1; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class ReturnStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReturnStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReturnStatementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReturnKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		///// * RETURN STATEMENTS * /
		//
		//ReturnStatement:
		//
		//	{ReturnStatement} "return" expression=Expression? ";";
		public ParserRule getRule() { return rule; }

		//{ReturnStatement} "return" expression=Expression? ";"
		public Group getGroup() { return cGroup; }

		//{ReturnStatement}
		public Action getReturnStatementAction_0() { return cReturnStatementAction_0; }

		//"return"
		public Keyword getReturnKeyword_1() { return cReturnKeyword_1; }

		//expression=Expression?
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class AcceptStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AcceptStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAcceptClauseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAcceptClauseAcceptClauseParserRuleCall_0_0 = (RuleCall)cAcceptClauseAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cSimpleCompletionAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cSimpleCompletionSimpleAcceptStatementCompletionParserRuleCall_1_0_0 = (RuleCall)cSimpleCompletionAssignment_1_0.eContents().get(0);
		private final Assignment cCompoundCompletionAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cCompoundCompletionCompoundAcceptStatementCompletionParserRuleCall_1_1_0 = (RuleCall)cCompoundCompletionAssignment_1_1.eContents().get(0);
		
		///// * ACCEPT STATEMENTS * /
		//
		//AcceptStatement:
		//
		//	acceptClause=AcceptClause (simpleCompletion=SimpleAcceptStatementCompletion |
		//
		//	compoundCompletion=CompoundAcceptStatementCompletion);
		public ParserRule getRule() { return rule; }

		//acceptClause=AcceptClause (simpleCompletion=SimpleAcceptStatementCompletion |
		//
		//compoundCompletion=CompoundAcceptStatementCompletion)
		public Group getGroup() { return cGroup; }

		//acceptClause=AcceptClause
		public Assignment getAcceptClauseAssignment_0() { return cAcceptClauseAssignment_0; }

		//AcceptClause
		public RuleCall getAcceptClauseAcceptClauseParserRuleCall_0_0() { return cAcceptClauseAcceptClauseParserRuleCall_0_0; }

		//simpleCompletion=SimpleAcceptStatementCompletion | compoundCompletion=CompoundAcceptStatementCompletion
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//simpleCompletion=SimpleAcceptStatementCompletion
		public Assignment getSimpleCompletionAssignment_1_0() { return cSimpleCompletionAssignment_1_0; }

		//SimpleAcceptStatementCompletion
		public RuleCall getSimpleCompletionSimpleAcceptStatementCompletionParserRuleCall_1_0_0() { return cSimpleCompletionSimpleAcceptStatementCompletionParserRuleCall_1_0_0; }

		//compoundCompletion=CompoundAcceptStatementCompletion
		public Assignment getCompoundCompletionAssignment_1_1() { return cCompoundCompletionAssignment_1_1; }

		//CompoundAcceptStatementCompletion
		public RuleCall getCompoundCompletionCompoundAcceptStatementCompletionParserRuleCall_1_1_0() { return cCompoundCompletionCompoundAcceptStatementCompletionParserRuleCall_1_1_0; }
	}

	public class SimpleAcceptStatementCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SimpleAcceptStatementCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSimpleAcceptStatementCompletionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//SimpleAcceptStatementCompletion:
		//
		//	{SimpleAcceptStatementCompletion} ";";
		public ParserRule getRule() { return rule; }

		//{SimpleAcceptStatementCompletion} ";"
		public Group getGroup() { return cGroup; }

		//{SimpleAcceptStatementCompletion}
		public Action getSimpleAcceptStatementCompletionAction_0() { return cSimpleAcceptStatementCompletionAction_0; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class CompoundAcceptStatementCompletionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CompoundAcceptStatementCompletion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBlockAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBlockBlockParserRuleCall_0_0 = (RuleCall)cBlockAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cOrKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAcceptBlockAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAcceptBlockAcceptBlockParserRuleCall_1_1_0 = (RuleCall)cAcceptBlockAssignment_1_1.eContents().get(0);
		
		//CompoundAcceptStatementCompletion:
		//
		//	block=Block ("or" acceptBlock+=AcceptBlock)*;
		public ParserRule getRule() { return rule; }

		//block=Block ("or" acceptBlock+=AcceptBlock)*
		public Group getGroup() { return cGroup; }

		//block=Block
		public Assignment getBlockAssignment_0() { return cBlockAssignment_0; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_0_0() { return cBlockBlockParserRuleCall_0_0; }

		//("or" acceptBlock+=AcceptBlock)*
		public Group getGroup_1() { return cGroup_1; }

		//"or"
		public Keyword getOrKeyword_1_0() { return cOrKeyword_1_0; }

		//acceptBlock+=AcceptBlock
		public Assignment getAcceptBlockAssignment_1_1() { return cAcceptBlockAssignment_1_1; }

		//AcceptBlock
		public RuleCall getAcceptBlockAcceptBlockParserRuleCall_1_1_0() { return cAcceptBlockAcceptBlockParserRuleCall_1_1_0; }
	}

	public class AcceptBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AcceptBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAcceptClauseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAcceptClauseAcceptClauseParserRuleCall_0_0 = (RuleCall)cAcceptClauseAssignment_0.eContents().get(0);
		private final Assignment cBlockAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBlockBlockParserRuleCall_1_0 = (RuleCall)cBlockAssignment_1.eContents().get(0);
		
		//AcceptBlock:
		//
		//	acceptClause=AcceptClause block=Block;
		public ParserRule getRule() { return rule; }

		//acceptClause=AcceptClause block=Block
		public Group getGroup() { return cGroup; }

		//acceptClause=AcceptClause
		public Assignment getAcceptClauseAssignment_0() { return cAcceptClauseAssignment_0; }

		//AcceptClause
		public RuleCall getAcceptClauseAcceptClauseParserRuleCall_0_0() { return cAcceptClauseAcceptClauseParserRuleCall_0_0; }

		//block=Block
		public Assignment getBlockAssignment_1() { return cBlockAssignment_1; }

		//Block
		public RuleCall getBlockBlockParserRuleCall_1_0() { return cBlockBlockParserRuleCall_1_0; }
	}

	public class AcceptClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AcceptClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAcceptKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cNameNameParserRuleCall_2_0_0 = (RuleCall)cNameAssignment_2_0.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cQualifiedNameListAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQualifiedNameListQualifiedNameListParserRuleCall_3_0 = (RuleCall)cQualifiedNameListAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//AcceptClause:
		//
		//	"accept" "(" (name=Name ":")? qualifiedNameList=QualifiedNameList ")";
		public ParserRule getRule() { return rule; }

		//"accept" "(" (name=Name ":")? qualifiedNameList=QualifiedNameList ")"
		public Group getGroup() { return cGroup; }

		//"accept"
		public Keyword getAcceptKeyword_0() { return cAcceptKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(name=Name ":")?
		public Group getGroup_2() { return cGroup_2; }

		//name=Name
		public Assignment getNameAssignment_2_0() { return cNameAssignment_2_0; }

		//Name
		public RuleCall getNameNameParserRuleCall_2_0_0() { return cNameNameParserRuleCall_2_0_0; }

		//":"
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }

		//qualifiedNameList=QualifiedNameList
		public Assignment getQualifiedNameListAssignment_3() { return cQualifiedNameListAssignment_3; }

		//QualifiedNameList
		public RuleCall getQualifiedNameListQualifiedNameListParserRuleCall_3_0() { return cQualifiedNameListQualifiedNameListParserRuleCall_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class ClassifyStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassifyStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassifyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Assignment cClassificationClauseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassificationClauseClassificationClauseParserRuleCall_2_0 = (RuleCall)cClassificationClauseAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		/// * CLASSIFY STATEMENTS * / ClassifyStatement:
		//
		//	"classify" expression=Expression classificationClause=ClassificationClause ";";
		public ParserRule getRule() { return rule; }

		//"classify" expression=Expression classificationClause=ClassificationClause ";"
		public Group getGroup() { return cGroup; }

		//"classify"
		public Keyword getClassifyKeyword_0() { return cClassifyKeyword_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }

		//classificationClause=ClassificationClause
		public Assignment getClassificationClauseAssignment_2() { return cClassificationClauseAssignment_2; }

		//ClassificationClause
		public RuleCall getClassificationClauseClassificationClauseParserRuleCall_2_0() { return cClassificationClauseClassificationClauseParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ClassificationClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassificationClause");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cClassificationFromClauseAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cClassificationFromClauseClassificationFromClauseParserRuleCall_0_0_0 = (RuleCall)cClassificationFromClauseAssignment_0_0.eContents().get(0);
		private final Assignment cClassificationToClauseAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cClassificationToClauseClassificationToClauseParserRuleCall_0_1_0 = (RuleCall)cClassificationToClauseAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cReclassifyAllClauseAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cReclassifyAllClauseReclassifyAllClauseParserRuleCall_1_0_0 = (RuleCall)cReclassifyAllClauseAssignment_1_0.eContents().get(0);
		private final Assignment cClassificationToClauseAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cClassificationToClauseClassificationToClauseParserRuleCall_1_1_0 = (RuleCall)cClassificationToClauseAssignment_1_1.eContents().get(0);
		
		//ClassificationClause:
		//
		//	classificationFromClause=ClassificationFromClause classificationToClause=ClassificationToClause? |
		//
		//	reclassifyAllClause=ReclassifyAllClause? classificationToClause=ClassificationToClause;
		public ParserRule getRule() { return rule; }

		//classificationFromClause=ClassificationFromClause classificationToClause=ClassificationToClause? |
		//
		//reclassifyAllClause=ReclassifyAllClause? classificationToClause=ClassificationToClause
		public Alternatives getAlternatives() { return cAlternatives; }

		//classificationFromClause=ClassificationFromClause classificationToClause=ClassificationToClause?
		public Group getGroup_0() { return cGroup_0; }

		//classificationFromClause=ClassificationFromClause
		public Assignment getClassificationFromClauseAssignment_0_0() { return cClassificationFromClauseAssignment_0_0; }

		//ClassificationFromClause
		public RuleCall getClassificationFromClauseClassificationFromClauseParserRuleCall_0_0_0() { return cClassificationFromClauseClassificationFromClauseParserRuleCall_0_0_0; }

		//classificationToClause=ClassificationToClause?
		public Assignment getClassificationToClauseAssignment_0_1() { return cClassificationToClauseAssignment_0_1; }

		//ClassificationToClause
		public RuleCall getClassificationToClauseClassificationToClauseParserRuleCall_0_1_0() { return cClassificationToClauseClassificationToClauseParserRuleCall_0_1_0; }

		//reclassifyAllClause=ReclassifyAllClause? classificationToClause=ClassificationToClause
		public Group getGroup_1() { return cGroup_1; }

		//reclassifyAllClause=ReclassifyAllClause?
		public Assignment getReclassifyAllClauseAssignment_1_0() { return cReclassifyAllClauseAssignment_1_0; }

		//ReclassifyAllClause
		public RuleCall getReclassifyAllClauseReclassifyAllClauseParserRuleCall_1_0_0() { return cReclassifyAllClauseReclassifyAllClauseParserRuleCall_1_0_0; }

		//classificationToClause=ClassificationToClause
		public Assignment getClassificationToClauseAssignment_1_1() { return cClassificationToClauseAssignment_1_1; }

		//ClassificationToClause
		public RuleCall getClassificationToClauseClassificationToClauseParserRuleCall_1_1_0() { return cClassificationToClauseClassificationToClauseParserRuleCall_1_1_0; }
	}

	public class ClassificationFromClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassificationFromClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFromKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQualifiedNameListAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQualifiedNameListQualifiedNameListParserRuleCall_1_0 = (RuleCall)cQualifiedNameListAssignment_1.eContents().get(0);
		
		//ClassificationFromClause:
		//
		//	"from" qualifiedNameList=QualifiedNameList;
		public ParserRule getRule() { return rule; }

		//"from" qualifiedNameList=QualifiedNameList
		public Group getGroup() { return cGroup; }

		//"from"
		public Keyword getFromKeyword_0() { return cFromKeyword_0; }

		//qualifiedNameList=QualifiedNameList
		public Assignment getQualifiedNameListAssignment_1() { return cQualifiedNameListAssignment_1; }

		//QualifiedNameList
		public RuleCall getQualifiedNameListQualifiedNameListParserRuleCall_1_0() { return cQualifiedNameListQualifiedNameListParserRuleCall_1_0; }
	}

	public class ClassificationToClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassificationToClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cToKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQualifiedNameListAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQualifiedNameListQualifiedNameListParserRuleCall_1_0 = (RuleCall)cQualifiedNameListAssignment_1.eContents().get(0);
		
		//ClassificationToClause:
		//
		//	"to" qualifiedNameList=QualifiedNameList;
		public ParserRule getRule() { return rule; }

		//"to" qualifiedNameList=QualifiedNameList
		public Group getGroup() { return cGroup; }

		//"to"
		public Keyword getToKeyword_0() { return cToKeyword_0; }

		//qualifiedNameList=QualifiedNameList
		public Assignment getQualifiedNameListAssignment_1() { return cQualifiedNameListAssignment_1; }

		//QualifiedNameList
		public RuleCall getQualifiedNameListQualifiedNameListParserRuleCall_1_0() { return cQualifiedNameListQualifiedNameListParserRuleCall_1_0; }
	}

	public class ReclassifyAllClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReclassifyAllClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReclassifyAllClauseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFromKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAsteriskKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ReclassifyAllClause:
		//
		//	{ReclassifyAllClause} "from" "*";
		public ParserRule getRule() { return rule; }

		//{ReclassifyAllClause} "from" "*"
		public Group getGroup() { return cGroup; }

		//{ReclassifyAllClause}
		public Action getReclassifyAllClauseAction_0() { return cReclassifyAllClauseAction_0; }

		//"from"
		public Keyword getFromKeyword_1() { return cFromKeyword_1; }

		//"*"
		public Keyword getAsteriskKeyword_2() { return cAsteriskKeyword_2; }
	}

	public class QualifiedNameListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cQualifiedNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cQualifiedNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cQualifiedNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cQualifiedNameQualifiedNameParserRuleCall_1_1_0 = (RuleCall)cQualifiedNameAssignment_1_1.eContents().get(0);
		
		//QualifiedNameList:
		//
		//	qualifiedName+=QualifiedName ("," qualifiedName+=QualifiedName)*;
		public ParserRule getRule() { return rule; }

		//qualifiedName+=QualifiedName ("," qualifiedName+=QualifiedName)*
		public Group getGroup() { return cGroup; }

		//qualifiedName+=QualifiedName
		public Assignment getQualifiedNameAssignment_0() { return cQualifiedNameAssignment_0; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_0_0() { return cQualifiedNameQualifiedNameParserRuleCall_0_0; }

		//("," qualifiedName+=QualifiedName)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//qualifiedName+=QualifiedName
		public Assignment getQualifiedNameAssignment_1_1() { return cQualifiedNameAssignment_1_1; }

		//QualifiedName
		public RuleCall getQualifiedNameQualifiedNameParserRuleCall_1_1_0() { return cQualifiedNameQualifiedNameParserRuleCall_1_1_0; }
	}
	
	
	public class ImportVisibilityIndicatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ImportVisibilityIndicator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPUBLICEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPUBLICPublicKeyword_0_0 = (Keyword)cPUBLICEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPRIVATEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPRIVATEPrivateKeyword_1_0 = (Keyword)cPRIVATEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum ImportVisibilityIndicator:
		//
		//	PUBLIC="public" | PRIVATE="private";
		public EnumRule getRule() { return rule; }

		//PUBLIC="public" | PRIVATE="private"
		public Alternatives getAlternatives() { return cAlternatives; }

		//PUBLIC="public"
		public EnumLiteralDeclaration getPUBLICEnumLiteralDeclaration_0() { return cPUBLICEnumLiteralDeclaration_0; }

		//"public"
		public Keyword getPUBLICPublicKeyword_0_0() { return cPUBLICPublicKeyword_0_0; }

		//PRIVATE="private"
		public EnumLiteralDeclaration getPRIVATEEnumLiteralDeclaration_1() { return cPRIVATEEnumLiteralDeclaration_1; }

		//"private"
		public Keyword getPRIVATEPrivateKeyword_1_0() { return cPRIVATEPrivateKeyword_1_0; }
	}

	public class ParameterDirectionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ParameterDirection");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINInKeyword_0_0 = (Keyword)cINEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOUTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOUTOutKeyword_1_0 = (Keyword)cOUTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cINOUTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cINOUTInoutKeyword_2_0 = (Keyword)cINOUTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ParameterDirection:
		//
		//	IN="in" | OUT="out" | INOUT="inout";
		public EnumRule getRule() { return rule; }

		//IN="in" | OUT="out" | INOUT="inout"
		public Alternatives getAlternatives() { return cAlternatives; }

		//IN="in"
		public EnumLiteralDeclaration getINEnumLiteralDeclaration_0() { return cINEnumLiteralDeclaration_0; }

		//"in"
		public Keyword getINInKeyword_0_0() { return cINInKeyword_0_0; }

		//OUT="out"
		public EnumLiteralDeclaration getOUTEnumLiteralDeclaration_1() { return cOUTEnumLiteralDeclaration_1; }

		//"out"
		public Keyword getOUTOutKeyword_1_0() { return cOUTOutKeyword_1_0; }

		//INOUT="inout"
		public EnumLiteralDeclaration getINOUTEnumLiteralDeclaration_2() { return cINOUTEnumLiteralDeclaration_2; }

		//"inout"
		public Keyword getINOUTInoutKeyword_2_0() { return cINOUTInoutKeyword_2_0; }
	}

	public class LinkOperationElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "LinkOperation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCREATE_LINKEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCREATE_LINKCreateLinkKeyword_0_0 = (Keyword)cCREATE_LINKEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDESTROY_LINKEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDESTROY_LINKDestroyLinkKeyword_1_0 = (Keyword)cDESTROY_LINKEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCLEAR_ASSOCEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCLEAR_ASSOCClearAssocKeyword_2_0 = (Keyword)cCLEAR_ASSOCEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum LinkOperation:
		//
		//	CREATE_LINK="createLink" | DESTROY_LINK="destroyLink" | CLEAR_ASSOC="clearAssoc";
		public EnumRule getRule() { return rule; }

		//CREATE_LINK="createLink" | DESTROY_LINK="destroyLink" | CLEAR_ASSOC="clearAssoc"
		public Alternatives getAlternatives() { return cAlternatives; }

		//CREATE_LINK="createLink"
		public EnumLiteralDeclaration getCREATE_LINKEnumLiteralDeclaration_0() { return cCREATE_LINKEnumLiteralDeclaration_0; }

		//"createLink"
		public Keyword getCREATE_LINKCreateLinkKeyword_0_0() { return cCREATE_LINKCreateLinkKeyword_0_0; }

		//DESTROY_LINK="destroyLink"
		public EnumLiteralDeclaration getDESTROY_LINKEnumLiteralDeclaration_1() { return cDESTROY_LINKEnumLiteralDeclaration_1; }

		//"destroyLink"
		public Keyword getDESTROY_LINKDestroyLinkKeyword_1_0() { return cDESTROY_LINKDestroyLinkKeyword_1_0; }

		//CLEAR_ASSOC="clearAssoc"
		public EnumLiteralDeclaration getCLEAR_ASSOCEnumLiteralDeclaration_2() { return cCLEAR_ASSOCEnumLiteralDeclaration_2; }

		//"clearAssoc"
		public Keyword getCLEAR_ASSOCClearAssocKeyword_2_0() { return cCLEAR_ASSOCClearAssocKeyword_2_0; }
	}

	public class AffixOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "AffixOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINCREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINCRPlusSignPlusSignKeyword_0_0 = (Keyword)cINCREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDECREnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDECRHyphenMinusHyphenMinusKeyword_1_0 = (Keyword)cDECREnumLiteralDeclaration_1.eContents().get(0);
		
		//enum AffixOperator:
		//
		//	INCR="++" | DECR="--";
		public EnumRule getRule() { return rule; }

		//INCR="++" | DECR="--"
		public Alternatives getAlternatives() { return cAlternatives; }

		//INCR="++"
		public EnumLiteralDeclaration getINCREnumLiteralDeclaration_0() { return cINCREnumLiteralDeclaration_0; }

		//"++"
		public Keyword getINCRPlusSignPlusSignKeyword_0_0() { return cINCRPlusSignPlusSignKeyword_0_0; }

		//DECR="--"
		public EnumLiteralDeclaration getDECREnumLiteralDeclaration_1() { return cDECREnumLiteralDeclaration_1; }

		//"--"
		public Keyword getDECRHyphenMinusHyphenMinusKeyword_1_0() { return cDECRHyphenMinusHyphenMinusKeyword_1_0; }
	}

	public class NumericUnaryOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "NumericUnaryOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPLUSEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPLUSPlusSignKeyword_0_0 = (Keyword)cPLUSEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMINUSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMINUSHyphenMinusKeyword_1_0 = (Keyword)cMINUSEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum NumericUnaryOperator:
		//
		//	PLUS="+" | MINUS="-";
		public EnumRule getRule() { return rule; }

		//PLUS="+" | MINUS="-"
		public Alternatives getAlternatives() { return cAlternatives; }

		//PLUS="+"
		public EnumLiteralDeclaration getPLUSEnumLiteralDeclaration_0() { return cPLUSEnumLiteralDeclaration_0; }

		//"+"
		public Keyword getPLUSPlusSignKeyword_0_0() { return cPLUSPlusSignKeyword_0_0; }

		//MINUS="-"
		public EnumLiteralDeclaration getMINUSEnumLiteralDeclaration_1() { return cMINUSEnumLiteralDeclaration_1; }

		//"-"
		public Keyword getMINUSHyphenMinusKeyword_1_0() { return cMINUSHyphenMinusKeyword_1_0; }
	}

	public class MultiplicativeOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "MultiplicativeOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSTAREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSTARAsteriskKeyword_0_0 = (Keyword)cSTAREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSLASHEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSLASHSolidusKeyword_1_0 = (Keyword)cSLASHEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cREMEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cREMPercentSignKeyword_2_0 = (Keyword)cREMEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum MultiplicativeOperator:
		//
		//	STAR="*" | SLASH="/" | REM="%";
		public EnumRule getRule() { return rule; }

		//STAR="*" | SLASH="/" | REM="%"
		public Alternatives getAlternatives() { return cAlternatives; }

		//STAR="*"
		public EnumLiteralDeclaration getSTAREnumLiteralDeclaration_0() { return cSTAREnumLiteralDeclaration_0; }

		//"*"
		public Keyword getSTARAsteriskKeyword_0_0() { return cSTARAsteriskKeyword_0_0; }

		//SLASH="/"
		public EnumLiteralDeclaration getSLASHEnumLiteralDeclaration_1() { return cSLASHEnumLiteralDeclaration_1; }

		//"/"
		public Keyword getSLASHSolidusKeyword_1_0() { return cSLASHSolidusKeyword_1_0; }

		//REM="%"
		public EnumLiteralDeclaration getREMEnumLiteralDeclaration_2() { return cREMEnumLiteralDeclaration_2; }

		//"%"
		public Keyword getREMPercentSignKeyword_2_0() { return cREMPercentSignKeyword_2_0; }
	}

	public class AdditiveOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "AdditiveOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPLUSEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPLUSPlusSignKeyword_0_0 = (Keyword)cPLUSEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMINUSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMINUSHyphenMinusKeyword_1_0 = (Keyword)cMINUSEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum AdditiveOperator:
		//
		//	PLUS="+" | MINUS="-";
		public EnumRule getRule() { return rule; }

		//PLUS="+" | MINUS="-"
		public Alternatives getAlternatives() { return cAlternatives; }

		//PLUS="+"
		public EnumLiteralDeclaration getPLUSEnumLiteralDeclaration_0() { return cPLUSEnumLiteralDeclaration_0; }

		//"+"
		public Keyword getPLUSPlusSignKeyword_0_0() { return cPLUSPlusSignKeyword_0_0; }

		//MINUS="-"
		public EnumLiteralDeclaration getMINUSEnumLiteralDeclaration_1() { return cMINUSEnumLiteralDeclaration_1; }

		//"-"
		public Keyword getMINUSHyphenMinusKeyword_1_0() { return cMINUSHyphenMinusKeyword_1_0; }
	}

	public class ShiftOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ShiftOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLSHIFTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLSHIFTLessThanSignLessThanSignKeyword_0_0 = (Keyword)cLSHIFTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRSHIFTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRSHIFTGreaterThanSignGreaterThanSignKeyword_1_0 = (Keyword)cRSHIFTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cURSHIFTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cURSHIFTGreaterThanSignGreaterThanSignGreaterThanSignKeyword_2_0 = (Keyword)cURSHIFTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ShiftOperator:
		//
		//	LSHIFT="<<" | RSHIFT=">>" | URSHIFT=">>>";
		public EnumRule getRule() { return rule; }

		//LSHIFT="<<" | RSHIFT=">>" | URSHIFT=">>>"
		public Alternatives getAlternatives() { return cAlternatives; }

		//LSHIFT="<<"
		public EnumLiteralDeclaration getLSHIFTEnumLiteralDeclaration_0() { return cLSHIFTEnumLiteralDeclaration_0; }

		//"<<"
		public Keyword getLSHIFTLessThanSignLessThanSignKeyword_0_0() { return cLSHIFTLessThanSignLessThanSignKeyword_0_0; }

		//RSHIFT=">>"
		public EnumLiteralDeclaration getRSHIFTEnumLiteralDeclaration_1() { return cRSHIFTEnumLiteralDeclaration_1; }

		//">>"
		public Keyword getRSHIFTGreaterThanSignGreaterThanSignKeyword_1_0() { return cRSHIFTGreaterThanSignGreaterThanSignKeyword_1_0; }

		//URSHIFT=">>>"
		public EnumLiteralDeclaration getURSHIFTEnumLiteralDeclaration_2() { return cURSHIFTEnumLiteralDeclaration_2; }

		//">>>"
		public Keyword getURSHIFTGreaterThanSignGreaterThanSignGreaterThanSignKeyword_2_0() { return cURSHIFTGreaterThanSignGreaterThanSignGreaterThanSignKeyword_2_0; }
	}

	public class RelationalOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "RelationalOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLTLessThanSignKeyword_0_0 = (Keyword)cLTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cGTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cGTGreaterThanSignKeyword_1_0 = (Keyword)cGTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLELessThanSignEqualsSignKeyword_2_0 = (Keyword)cLEEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cGEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cGEGreaterThanSignEqualsSignKeyword_3_0 = (Keyword)cGEEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum RelationalOperator:
		//
		//	LT="<" | GT=">" | LE="<=" | GE=">=";
		public EnumRule getRule() { return rule; }

		//LT="<" | GT=">" | LE="<=" | GE=">="
		public Alternatives getAlternatives() { return cAlternatives; }

		//LT="<"
		public EnumLiteralDeclaration getLTEnumLiteralDeclaration_0() { return cLTEnumLiteralDeclaration_0; }

		//"<"
		public Keyword getLTLessThanSignKeyword_0_0() { return cLTLessThanSignKeyword_0_0; }

		//GT=">"
		public EnumLiteralDeclaration getGTEnumLiteralDeclaration_1() { return cGTEnumLiteralDeclaration_1; }

		//">"
		public Keyword getGTGreaterThanSignKeyword_1_0() { return cGTGreaterThanSignKeyword_1_0; }

		//LE="<="
		public EnumLiteralDeclaration getLEEnumLiteralDeclaration_2() { return cLEEnumLiteralDeclaration_2; }

		//"<="
		public Keyword getLELessThanSignEqualsSignKeyword_2_0() { return cLELessThanSignEqualsSignKeyword_2_0; }

		//GE=">="
		public EnumLiteralDeclaration getGEEnumLiteralDeclaration_3() { return cGEEnumLiteralDeclaration_3; }

		//">="
		public Keyword getGEGreaterThanSignEqualsSignKeyword_3_0() { return cGEGreaterThanSignEqualsSignKeyword_3_0; }
	}

	public class ClassificationOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ClassificationOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINSTANCEOFEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINSTANCEOFInstanceofKeyword_0_0 = (Keyword)cINSTANCEOFEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cHASTYPEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cHASTYPEHastypeKeyword_1_0 = (Keyword)cHASTYPEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum ClassificationOperator:
		//
		//	INSTANCEOF="instanceof" | HASTYPE="hastype";
		public EnumRule getRule() { return rule; }

		//INSTANCEOF="instanceof" | HASTYPE="hastype"
		public Alternatives getAlternatives() { return cAlternatives; }

		//INSTANCEOF="instanceof"
		public EnumLiteralDeclaration getINSTANCEOFEnumLiteralDeclaration_0() { return cINSTANCEOFEnumLiteralDeclaration_0; }

		//"instanceof"
		public Keyword getINSTANCEOFInstanceofKeyword_0_0() { return cINSTANCEOFInstanceofKeyword_0_0; }

		//HASTYPE="hastype"
		public EnumLiteralDeclaration getHASTYPEEnumLiteralDeclaration_1() { return cHASTYPEEnumLiteralDeclaration_1; }

		//"hastype"
		public Keyword getHASTYPEHastypeKeyword_1_0() { return cHASTYPEHastypeKeyword_1_0; }
	}

	public class EqualityOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "EqualityOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEQEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEQEqualsSignEqualsSignKeyword_0_0 = (Keyword)cEQEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNEExclamationMarkEqualsSignKeyword_1_0 = (Keyword)cNEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum EqualityOperator:
		//
		//	EQ="==" | NE="!=";
		public EnumRule getRule() { return rule; }

		//EQ="==" | NE="!="
		public Alternatives getAlternatives() { return cAlternatives; }

		//EQ="=="
		public EnumLiteralDeclaration getEQEnumLiteralDeclaration_0() { return cEQEnumLiteralDeclaration_0; }

		//"=="
		public Keyword getEQEqualsSignEqualsSignKeyword_0_0() { return cEQEqualsSignEqualsSignKeyword_0_0; }

		//NE="!="
		public EnumLiteralDeclaration getNEEnumLiteralDeclaration_1() { return cNEEnumLiteralDeclaration_1; }

		//"!="
		public Keyword getNEExclamationMarkEqualsSignKeyword_1_0() { return cNEExclamationMarkEqualsSignKeyword_1_0; }
	}

	public class AssignmentOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "AssignmentOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cASSIGNEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cASSIGNEqualsSignKeyword_0_0 = (Keyword)cASSIGNEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPLUSASSIGNEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPLUSASSIGNPlusSignEqualsSignKeyword_1_0 = (Keyword)cPLUSASSIGNEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cMINUSASSIGNEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cMINUSASSIGNHyphenMinusEqualsSignKeyword_2_0 = (Keyword)cMINUSASSIGNEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSTARASSIGNEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSTARASSIGNAsteriskEqualsSignKeyword_3_0 = (Keyword)cSTARASSIGNEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cSLASHASSIGNEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cSLASHASSIGNSolidusEqualsSignKeyword_4_0 = (Keyword)cSLASHASSIGNEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cREMASSIGNEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cREMASSIGNPercentSignEqualsSignKeyword_5_0 = (Keyword)cREMASSIGNEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cANSASSIGNEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cANSASSIGNAmpersandEqualsSignKeyword_6_0 = (Keyword)cANSASSIGNEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cORASSIGNEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cORASSIGNVerticalLineEqualsSignKeyword_7_0 = (Keyword)cORASSIGNEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cXORASSIGNEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cXORASSIGNCircumflexAccentEqualsSignKeyword_8_0 = (Keyword)cXORASSIGNEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cLSHIFTASSIGNEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cLSHIFTASSIGNLessThanSignLessThanSignEqualsSignKeyword_9_0 = (Keyword)cLSHIFTASSIGNEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cRSHIFTASSIGNEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cRSHIFTASSIGNGreaterThanSignGreaterThanSignEqualsSignKeyword_10_0 = (Keyword)cRSHIFTASSIGNEnumLiteralDeclaration_10.eContents().get(0);
		private final EnumLiteralDeclaration cURSHIFTASSIGNEnumLiteralDeclaration_11 = (EnumLiteralDeclaration)cAlternatives.eContents().get(11);
		private final Keyword cURSHIFTASSIGNGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_11_0 = (Keyword)cURSHIFTASSIGNEnumLiteralDeclaration_11.eContents().get(0);
		
		//enum AssignmentOperator:
		//
		//	ASSIGN="=" | PLUSASSIGN="+=" | MINUSASSIGN="-=" | STARASSIGN="*=" | SLASHASSIGN="/=" | REMASSIGN="%=" |
		//
		//	ANSASSIGN="&=" | ORASSIGN="|=" | XORASSIGN="^=" | LSHIFTASSIGN="<<=" | RSHIFTASSIGN=">>=" | URSHIFTASSIGN=">>>=";
		public EnumRule getRule() { return rule; }

		//ASSIGN="=" | PLUSASSIGN="+=" | MINUSASSIGN="-=" | STARASSIGN="*=" | SLASHASSIGN="/=" | REMASSIGN="%=" | ANSASSIGN="&=" |
		//
		//ORASSIGN="|=" | XORASSIGN="^=" | LSHIFTASSIGN="<<=" | RSHIFTASSIGN=">>=" | URSHIFTASSIGN=">>>="
		public Alternatives getAlternatives() { return cAlternatives; }

		//ASSIGN="="
		public EnumLiteralDeclaration getASSIGNEnumLiteralDeclaration_0() { return cASSIGNEnumLiteralDeclaration_0; }

		//"="
		public Keyword getASSIGNEqualsSignKeyword_0_0() { return cASSIGNEqualsSignKeyword_0_0; }

		//PLUSASSIGN="+="
		public EnumLiteralDeclaration getPLUSASSIGNEnumLiteralDeclaration_1() { return cPLUSASSIGNEnumLiteralDeclaration_1; }

		//"+="
		public Keyword getPLUSASSIGNPlusSignEqualsSignKeyword_1_0() { return cPLUSASSIGNPlusSignEqualsSignKeyword_1_0; }

		//MINUSASSIGN="-="
		public EnumLiteralDeclaration getMINUSASSIGNEnumLiteralDeclaration_2() { return cMINUSASSIGNEnumLiteralDeclaration_2; }

		//"-="
		public Keyword getMINUSASSIGNHyphenMinusEqualsSignKeyword_2_0() { return cMINUSASSIGNHyphenMinusEqualsSignKeyword_2_0; }

		//STARASSIGN="*="
		public EnumLiteralDeclaration getSTARASSIGNEnumLiteralDeclaration_3() { return cSTARASSIGNEnumLiteralDeclaration_3; }

		//"*="
		public Keyword getSTARASSIGNAsteriskEqualsSignKeyword_3_0() { return cSTARASSIGNAsteriskEqualsSignKeyword_3_0; }

		//SLASHASSIGN="/="
		public EnumLiteralDeclaration getSLASHASSIGNEnumLiteralDeclaration_4() { return cSLASHASSIGNEnumLiteralDeclaration_4; }

		//"/="
		public Keyword getSLASHASSIGNSolidusEqualsSignKeyword_4_0() { return cSLASHASSIGNSolidusEqualsSignKeyword_4_0; }

		//REMASSIGN="%="
		public EnumLiteralDeclaration getREMASSIGNEnumLiteralDeclaration_5() { return cREMASSIGNEnumLiteralDeclaration_5; }

		//"%="
		public Keyword getREMASSIGNPercentSignEqualsSignKeyword_5_0() { return cREMASSIGNPercentSignEqualsSignKeyword_5_0; }

		//ANSASSIGN="&="
		public EnumLiteralDeclaration getANSASSIGNEnumLiteralDeclaration_6() { return cANSASSIGNEnumLiteralDeclaration_6; }

		//"&="
		public Keyword getANSASSIGNAmpersandEqualsSignKeyword_6_0() { return cANSASSIGNAmpersandEqualsSignKeyword_6_0; }

		//ORASSIGN="|="
		public EnumLiteralDeclaration getORASSIGNEnumLiteralDeclaration_7() { return cORASSIGNEnumLiteralDeclaration_7; }

		//"|="
		public Keyword getORASSIGNVerticalLineEqualsSignKeyword_7_0() { return cORASSIGNVerticalLineEqualsSignKeyword_7_0; }

		//XORASSIGN="^="
		public EnumLiteralDeclaration getXORASSIGNEnumLiteralDeclaration_8() { return cXORASSIGNEnumLiteralDeclaration_8; }

		//"^="
		public Keyword getXORASSIGNCircumflexAccentEqualsSignKeyword_8_0() { return cXORASSIGNCircumflexAccentEqualsSignKeyword_8_0; }

		//LSHIFTASSIGN="<<="
		public EnumLiteralDeclaration getLSHIFTASSIGNEnumLiteralDeclaration_9() { return cLSHIFTASSIGNEnumLiteralDeclaration_9; }

		//"<<="
		public Keyword getLSHIFTASSIGNLessThanSignLessThanSignEqualsSignKeyword_9_0() { return cLSHIFTASSIGNLessThanSignLessThanSignEqualsSignKeyword_9_0; }

		//RSHIFTASSIGN=">>="
		public EnumLiteralDeclaration getRSHIFTASSIGNEnumLiteralDeclaration_10() { return cRSHIFTASSIGNEnumLiteralDeclaration_10; }

		//">>="
		public Keyword getRSHIFTASSIGNGreaterThanSignGreaterThanSignEqualsSignKeyword_10_0() { return cRSHIFTASSIGNGreaterThanSignGreaterThanSignEqualsSignKeyword_10_0; }

		//URSHIFTASSIGN=">>>="
		public EnumLiteralDeclaration getURSHIFTASSIGNEnumLiteralDeclaration_11() { return cURSHIFTASSIGNEnumLiteralDeclaration_11; }

		//">>>="
		public Keyword getURSHIFTASSIGNGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_11_0() { return cURSHIFTASSIGNGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_11_0; }
	}
	
	private UnitDefinitionElements pUnitDefinition;
	private BOOLEAN_LITERALElements pBOOLEAN_LITERAL;
	private NUMBER_LITERALElements pNUMBER_LITERAL;
	private INTEGER_LITERALElements pINTEGER_LITERAL;
	private UNLIMITED_NATURALElements pUNLIMITED_NATURAL;
	private STRING_LITERALElements pSTRING_LITERAL;
	private StereotypeAnnotationsElements pStereotypeAnnotations;
	private StereotypeAnnotationElements pStereotypeAnnotation;
	private TaggedValuesElements pTaggedValues;
	private TaggedValueListElements pTaggedValueList;
	private PRIMITIVE_LITERALElements pPRIMITIVE_LITERAL;
	private TaggedValueElements pTaggedValue;
	private NamespaceDeclarationElements pNamespaceDeclaration;
	private ImportDeclarationElements pImportDeclaration;
	private ImportVisibilityIndicatorElements unknownRuleImportVisibilityIndicator;
	private ImportReferenceElements pImportReference;
	private ImportReferenceQualifiedNameCompletionElements pImportReferenceQualifiedNameCompletion;
	private ColonQualifiedNameCompletionOfImportReferenceElements pColonQualifiedNameCompletionOfImportReference;
	private AliasDefinitionElements pAliasDefinition;
	private NamespaceDefinitionElements pNamespaceDefinition;
	private VisibilityIndicatorElements pVisibilityIndicator;
	private PackageDeclarationElements pPackageDeclaration;
	private PackageDefinitionElements pPackageDefinition;
	private PackageDefinitionOrStubElements pPackageDefinitionOrStub;
	private PackageBodyElements pPackageBody;
	private PackagedElementElements pPackagedElement;
	private PackagedElementDefinitionElements pPackagedElementDefinition;
	private ClassifierDefinitionElements pClassifierDefinition;
	private ClassifierDefinitionOrStubElements pClassifierDefinitionOrStub;
	private ClassifierSignatureElements pClassifierSignature;
	private TemplateParametersElements pTemplateParameters;
	private ClassifierTemplateParameterElements pClassifierTemplateParameter;
	private SpecializationClauseElements pSpecializationClause;
	private ClassDeclarationElements pClassDeclaration;
	private ClassDefinitionElements pClassDefinition;
	private ClassDefinitionOrStubElements pClassDefinitionOrStub;
	private ClassBodyElements pClassBody;
	private ClassMemberElements pClassMember;
	private ClassMemberDefinitionElements pClassMemberDefinition;
	private ActiveClassDeclarationElements pActiveClassDeclaration;
	private ActiveClassDefinitionElements pActiveClassDefinition;
	private ActiveClassDefinitionOrStubElements pActiveClassDefinitionOrStub;
	private ActiveClassBodyElements pActiveClassBody;
	private BehaviorClauseElements pBehaviorClause;
	private ActiveClassMemberElements pActiveClassMember;
	private ActiveClassMemberDefinitionElements pActiveClassMemberDefinition;
	private DataTypeDeclarationElements pDataTypeDeclaration;
	private DataTypeDefinitionElements pDataTypeDefinition;
	private DataTypeDefinitionOrStubElements pDataTypeDefinitionOrStub;
	private StructuredBodyElements pStructuredBody;
	private StructuredMemberElements pStructuredMember;
	private AssociationDeclarationElements pAssociationDeclaration;
	private AssociationDefinitionElements pAssociationDefinition;
	private AssociationDefinitionOrStubElements pAssociationDefinitionOrStub;
	private EnumerationDeclarationElements pEnumerationDeclaration;
	private EnumerationDefinitionElements pEnumerationDefinition;
	private EnumerationDefinitionOrStubElements pEnumerationDefinitionOrStub;
	private EnumerationBodyElements pEnumerationBody;
	private EnumerationLiteralNameElements pEnumerationLiteralName;
	private SignalDeclarationElements pSignalDeclaration;
	private SignalDefinitionElements pSignalDefinition;
	private SignalDefinitionOrStubElements pSignalDefinitionOrStub;
	private ActivityDeclarationElements pActivityDeclaration;
	private ActivityDefinitionElements pActivityDefinition;
	private ActivityDefinitionOrStubElements pActivityDefinitionOrStub;
	private FormalParametersElements pFormalParameters;
	private FormalParameterListElements pFormalParameterList;
	private FormalParameterElements pFormalParameter;
	private ParameterDirectionElements unknownRuleParameterDirection;
	private FeatureDefinitionOrStubElements pFeatureDefinitionOrStub;
	private ActiveFeatureDefinitionOrStubElements pActiveFeatureDefinitionOrStub;
	private PropertyDefinitionElements pPropertyDefinition;
	private AttributeDefinitionElements pAttributeDefinition;
	private AttributeInitializerElements pAttributeInitializer;
	private PropertyDeclarationElements pPropertyDeclaration;
	private TypePartElements pTypePart;
	private TypeNameElements pTypeName;
	private MultiplicityElements pMultiplicity;
	private MultiplicityRangeElements pMultiplicityRange;
	private UnlimitedNaturalLiteralElements pUnlimitedNaturalLiteral;
	private OperationDeclarationElements pOperationDeclaration;
	private OperationDefinitionOrStubElements pOperationDefinitionOrStub;
	private RedefinitionClauseElements pRedefinitionClause;
	private ReceptionDefinitionElements pReceptionDefinition;
	private SignalReceptionDeclarationElements pSignalReceptionDeclaration;
	private SignalReceptionDefinitionOrStubElements pSignalReceptionDefinitionOrStub;
	private NameElements pName;
	private QualifiedNameElements pQualifiedName;
	private ColonQualifiedNameCompletionElements pColonQualifiedNameCompletion;
	private UnqualifiedNameElements pUnqualifiedName;
	private NameBindingElements pNameBinding;
	private QualifiedNameWithoutBindingElements pQualifiedNameWithoutBinding;
	private ColonQualifiedNameCompletionWithoutBindingElements pColonQualifiedNameCompletionWithoutBinding;
	private TemplateBindingElements pTemplateBinding;
	private PositionalTemplateBindingElements pPositionalTemplateBinding;
	private NamedTemplateBindingElements pNamedTemplateBinding;
	private TemplateParameterSubstitutionElements pTemplateParameterSubstitution;
	private ExpressionElements pExpression;
	private NonNameExpressionElements pNonNameExpression;
	private NameToExpressionCompletionElements pNameToExpressionCompletion;
	private PrimaryToExpressionCompletionElements pPrimaryToExpressionCompletion;
	private ExpressionCompletionElements pExpressionCompletion;
	private PrimaryExpressionElements pPrimaryExpression;
	private BaseExpressionElements pBaseExpression;
	private NameToPrimaryExpressionElements pNameToPrimaryExpression;
	private PrimaryExpressionCompletionElements pPrimaryExpressionCompletion;
	private Feature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexElements pFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index;
	private LiteralExpressionElements pLiteralExpression;
	private NameOrPrimaryExpressionElements pNameOrPrimaryExpression;
	private ThisExpressionElements pThisExpression;
	private ParenthesizedExpressionElements pParenthesizedExpression;
	private FeatureElements pFeature;
	private TupleElements pTuple;
	private PositionalTupleExpressionListElements pPositionalTupleExpressionList;
	private PositionalTupleExpressionListCompletionElements pPositionalTupleExpressionListCompletion;
	private NamedTupleExpressionListElements pNamedTupleExpressionList;
	private NamedExpressionElements pNamedExpression;
	private BehaviorInvocationElements pBehaviorInvocation;
	private FeatureInvocationElements pFeatureInvocation;
	private SuperInvocationExpressionElements pSuperInvocationExpression;
	private InstanceCreationOrSequenceConstructionExpressionElements pInstanceCreationOrSequenceConstructionExpression;
	private LinkOperationCompletionElements pLinkOperationCompletion;
	private LinkOperationElements unknownRuleLinkOperation;
	private LinkOperationTupleElements pLinkOperationTuple;
	private IndexedNamedExpressionListCompletionElements pIndexedNamedExpressionListCompletion;
	private IndexedNamedExpressionElements pIndexedNamedExpression;
	private ClassExtentExpressionCompletionElements pClassExtentExpressionCompletion;
	private SequenceAnyExpressionElements pSequenceAnyExpression;
	private SequenceConstructionExpressionCompletionElements pSequenceConstructionExpressionCompletion;
	private MultiplicityIndicatorElements pMultiplicityIndicator;
	private SequenceElementsElements pSequenceElements;
	private SequenceElementListCompletionElements pSequenceElementListCompletion;
	private SequenceElementElements pSequenceElement;
	private SequenceInitializationExpressionElements pSequenceInitializationExpression;
	private IndexElements pIndex;
	private SequenceOperationOrReductionOrExpansionElements pSequenceOperationOrReductionOrExpansion;
	private PostfixExpressionCompletionElements pPostfixExpressionCompletion;
	private PostfixOperationElements pPostfixOperation;
	private PrefixExpressionElements pPrefixExpression;
	private AffixOperatorElements unknownRuleAffixOperator;
	private UnaryExpressionElements pUnaryExpression;
	private PostfixOrCastExpressionElements pPostfixOrCastExpression;
	private NonNameUnaryExpressionElements pNonNameUnaryExpression;
	private NonNamePostfixOrCastExpressionElements pNonNamePostfixOrCastExpression;
	private NonPostfixNonCastUnaryExpressionElements pNonPostfixNonCastUnaryExpression;
	private BooleanNegationExpressionElements pBooleanNegationExpression;
	private BitStringComplementExpressionElements pBitStringComplementExpression;
	private NumericUnaryExpressionElements pNumericUnaryExpression;
	private NumericUnaryOperatorElements unknownRuleNumericUnaryOperator;
	private IsolationExpressionElements pIsolationExpression;
	private CastCompletionElements pCastCompletion;
	private MultiplicativeExpressionElements pMultiplicativeExpression;
	private MultiplicativeExpressionCompletionElements pMultiplicativeExpressionCompletion;
	private MultiplicativeOperatorElements unknownRuleMultiplicativeOperator;
	private AdditiveExpressionElements pAdditiveExpression;
	private AdditiveExpressionCompletionElements pAdditiveExpressionCompletion;
	private AdditiveOperatorElements unknownRuleAdditiveOperator;
	private ShiftExpressionElements pShiftExpression;
	private ShiftExpressionCompletionElements pShiftExpressionCompletion;
	private ShiftOperatorElements unknownRuleShiftOperator;
	private RelationalExpressionElements pRelationalExpression;
	private RelationalExpressionCompletionElements pRelationalExpressionCompletion;
	private RelationalOperatorElements unknownRuleRelationalOperator;
	private ClassificationExpressionElements pClassificationExpression;
	private ClassificationExpressionCompletionElements pClassificationExpressionCompletion;
	private ClassificationOperatorElements unknownRuleClassificationOperator;
	private EqualityExpressionElements pEqualityExpression;
	private EqualityExpressionCompletionElements pEqualityExpressionCompletion;
	private EqualityOperatorElements unknownRuleEqualityOperator;
	private AndExpressionElements pAndExpression;
	private AndExpressionCompletionElements pAndExpressionCompletion;
	private ExclusiveOrExpressionElements pExclusiveOrExpression;
	private ExclusiveOrExpressionCompletionElements pExclusiveOrExpressionCompletion;
	private InclusiveOrExpressionElements pInclusiveOrExpression;
	private InclusiveOrExpressionCompletionElements pInclusiveOrExpressionCompletion;
	private ConditionalAndExpressionElements pConditionalAndExpression;
	private ConditionalAndExpressionCompletionElements pConditionalAndExpressionCompletion;
	private ConditionalOrExpressionElements pConditionalOrExpression;
	private ConditionalOrExpressionCompletionElements pConditionalOrExpressionCompletion;
	private ConditionalExpressionElements pConditionalExpression;
	private ConditionalExpressionCompletionElements pConditionalExpressionCompletion;
	private AssignmentExpressionCompletionElements pAssignmentExpressionCompletion;
	private AssignmentOperatorElements unknownRuleAssignmentOperator;
	private StatementSequenceElements pStatementSequence;
	private DocumentedStatementElements pDocumentedStatement;
	private StatementElements pStatement;
	private BlockElements pBlock;
	private AnnotatedStatementElements pAnnotatedStatement;
	private AnnotationsElements pAnnotations;
	private AnnotationElements pAnnotation;
	private NameListElements pNameList;
	private InLineStatementElements pInLineStatement;
	private BlockStatementElements pBlockStatement;
	private EmptyStatementElements pEmptyStatement;
	private LocalNameDeclarationOrExpressionStatementElements pLocalNameDeclarationOrExpressionStatement;
	private LocalNameDeclarationStatementElements pLocalNameDeclarationStatement;
	private LocalNameDeclarationStatementCompletionElements pLocalNameDeclarationStatementCompletion;
	private InitializationExpressionElements pInitializationExpression;
	private InstanceInitializationExpressionElements pInstanceInitializationExpression;
	private IfStatementElements pIfStatement;
	private SequentialClausesElements pSequentialClauses;
	private ConcurrentClausesElements pConcurrentClauses;
	private NonFinalClauseElements pNonFinalClause;
	private FinalClauseElements pFinalClause;
	private SwitchStatementElements pSwitchStatement;
	private SwitchClauseElements pSwitchClause;
	private SwitchCaseElements pSwitchCase;
	private SwitchDefaultClauseElements pSwitchDefaultClause;
	private NonEmptyStatementSequenceElements pNonEmptyStatementSequence;
	private WhileStatementElements pWhileStatement;
	private DoStatementElements pDoStatement;
	private ForStatementElements pForStatement;
	private ForControlElements pForControl;
	private LoopVariableDefinitionElements pLoopVariableDefinition;
	private BreakStatementElements pBreakStatement;
	private ReturnStatementElements pReturnStatement;
	private AcceptStatementElements pAcceptStatement;
	private SimpleAcceptStatementCompletionElements pSimpleAcceptStatementCompletion;
	private CompoundAcceptStatementCompletionElements pCompoundAcceptStatementCompletion;
	private AcceptBlockElements pAcceptBlock;
	private AcceptClauseElements pAcceptClause;
	private ClassifyStatementElements pClassifyStatement;
	private ClassificationClauseElements pClassificationClause;
	private ClassificationFromClauseElements pClassificationFromClause;
	private ClassificationToClauseElements pClassificationToClause;
	private ReclassifyAllClauseElements pReclassifyAllClause;
	private QualifiedNameListElements pQualifiedNameList;
	private TerminalRule tBOOLEAN_VALUE;
	private TerminalRule tINTEGER_VALUE;
	private TerminalRule tID;
	private TerminalRule tSTRING;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public AlfGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.papyrus.alf.Alf".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//UnitDefinition:
	//
	//	namespaceDeclaration=NamespaceDeclaration? importDeclarations+=ImportDeclaration* comment=ML_COMMENT?
	//
	//	/ *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations namesapceDefinition=NamespaceDefinition;
	public UnitDefinitionElements getUnitDefinitionAccess() {
		return (pUnitDefinition != null) ? pUnitDefinition : (pUnitDefinition = new UnitDefinitionElements());
	}
	
	public ParserRule getUnitDefinitionRule() {
		return getUnitDefinitionAccess().getRule();
	}

	/// *********************************
	//
	// * PrimitiveLiterals
	//
	// ********************************** / BOOLEAN_LITERAL:
	//
	//	value=BOOLEAN_VALUE;
	public BOOLEAN_LITERALElements getBOOLEAN_LITERALAccess() {
		return (pBOOLEAN_LITERAL != null) ? pBOOLEAN_LITERAL : (pBOOLEAN_LITERAL = new BOOLEAN_LITERALElements());
	}
	
	public ParserRule getBOOLEAN_LITERALRule() {
		return getBOOLEAN_LITERALAccess().getRule();
	}

	//NUMBER_LITERAL:
	//
	//	INTEGER_LITERAL | UNLIMITED_NATURAL;
	public NUMBER_LITERALElements getNUMBER_LITERALAccess() {
		return (pNUMBER_LITERAL != null) ? pNUMBER_LITERAL : (pNUMBER_LITERAL = new NUMBER_LITERALElements());
	}
	
	public ParserRule getNUMBER_LITERALRule() {
		return getNUMBER_LITERALAccess().getRule();
	}

	//INTEGER_LITERAL:
	//
	//	value=INTEGER_VALUE;
	public INTEGER_LITERALElements getINTEGER_LITERALAccess() {
		return (pINTEGER_LITERAL != null) ? pINTEGER_LITERAL : (pINTEGER_LITERAL = new INTEGER_LITERALElements());
	}
	
	public ParserRule getINTEGER_LITERALRule() {
		return getINTEGER_LITERALAccess().getRule();
	}

	//UNLIMITED_NATURAL:
	//
	//	value="*";
	public UNLIMITED_NATURALElements getUNLIMITED_NATURALAccess() {
		return (pUNLIMITED_NATURAL != null) ? pUNLIMITED_NATURAL : (pUNLIMITED_NATURAL = new UNLIMITED_NATURALElements());
	}
	
	public ParserRule getUNLIMITED_NATURALRule() {
		return getUNLIMITED_NATURALAccess().getRule();
	}

	//STRING_LITERAL:
	//
	//	value=STRING;
	public STRING_LITERALElements getSTRING_LITERALAccess() {
		return (pSTRING_LITERAL != null) ? pSTRING_LITERAL : (pSTRING_LITERAL = new STRING_LITERALElements());
	}
	
	public ParserRule getSTRING_LITERALRule() {
		return getSTRING_LITERALAccess().getRule();
	}

	/// *********
	//
	// * UNITS *
	//
	// ********* / StereotypeAnnotations:
	//
	//	{StereotypeAnnotations} annotation+=StereotypeAnnotation*;
	public StereotypeAnnotationsElements getStereotypeAnnotationsAccess() {
		return (pStereotypeAnnotations != null) ? pStereotypeAnnotations : (pStereotypeAnnotations = new StereotypeAnnotationsElements());
	}
	
	public ParserRule getStereotypeAnnotationsRule() {
		return getStereotypeAnnotationsAccess().getRule();
	}

	//StereotypeAnnotation:
	//
	//	"@" stereotypeName=QualifiedName ("(" taggedValues=TaggedValues ")")?;
	public StereotypeAnnotationElements getStereotypeAnnotationAccess() {
		return (pStereotypeAnnotation != null) ? pStereotypeAnnotation : (pStereotypeAnnotation = new StereotypeAnnotationElements());
	}
	
	public ParserRule getStereotypeAnnotationRule() {
		return getStereotypeAnnotationAccess().getRule();
	}

	//TaggedValues:
	//
	//	QualifiedNameList | TaggedValueList;
	public TaggedValuesElements getTaggedValuesAccess() {
		return (pTaggedValues != null) ? pTaggedValues : (pTaggedValues = new TaggedValuesElements());
	}
	
	public ParserRule getTaggedValuesRule() {
		return getTaggedValuesAccess().getRule();
	}

	//TaggedValueList:
	//
	//	taggedValue+=TaggedValue ("," taggedValue+=TaggedValue)*;
	public TaggedValueListElements getTaggedValueListAccess() {
		return (pTaggedValueList != null) ? pTaggedValueList : (pTaggedValueList = new TaggedValueListElements());
	}
	
	public ParserRule getTaggedValueListRule() {
		return getTaggedValueListAccess().getRule();
	}

	//PRIMITIVE_LITERAL:
	//
	//	BOOLEAN_LITERAL | NUMBER_LITERAL | STRING_LITERAL;
	public PRIMITIVE_LITERALElements getPRIMITIVE_LITERALAccess() {
		return (pPRIMITIVE_LITERAL != null) ? pPRIMITIVE_LITERAL : (pPRIMITIVE_LITERAL = new PRIMITIVE_LITERALElements());
	}
	
	public ParserRule getPRIMITIVE_LITERALRule() {
		return getPRIMITIVE_LITERALAccess().getRule();
	}

	//TaggedValue:
	//
	//	name=Name "=>" value=PRIMITIVE_LITERAL;
	public TaggedValueElements getTaggedValueAccess() {
		return (pTaggedValue != null) ? pTaggedValue : (pTaggedValue = new TaggedValueElements());
	}
	
	public ParserRule getTaggedValueRule() {
		return getTaggedValueAccess().getRule();
	}

	//NamespaceDeclaration:
	//
	//	"namespace" qualifiedName=QualifiedName ";";
	public NamespaceDeclarationElements getNamespaceDeclarationAccess() {
		return (pNamespaceDeclaration != null) ? pNamespaceDeclaration : (pNamespaceDeclaration = new NamespaceDeclarationElements());
	}
	
	public ParserRule getNamespaceDeclarationRule() {
		return getNamespaceDeclarationAccess().getRule();
	}

	//ImportDeclaration:
	//
	//	visibility=ImportVisibilityIndicator "import" importReference=ImportReference ";";
	public ImportDeclarationElements getImportDeclarationAccess() {
		return (pImportDeclaration != null) ? pImportDeclaration : (pImportDeclaration = new ImportDeclarationElements());
	}
	
	public ParserRule getImportDeclarationRule() {
		return getImportDeclarationAccess().getRule();
	}

	//enum ImportVisibilityIndicator:
	//
	//	PUBLIC="public" | PRIVATE="private";
	public ImportVisibilityIndicatorElements getImportVisibilityIndicatorAccess() {
		return (unknownRuleImportVisibilityIndicator != null) ? unknownRuleImportVisibilityIndicator : (unknownRuleImportVisibilityIndicator = new ImportVisibilityIndicatorElements());
	}
	
	public EnumRule getImportVisibilityIndicatorRule() {
		return getImportVisibilityIndicatorAccess().getRule();
	}

	////ImportReference : 
	//
	////  ( colonQualifiedName = ColonQualifiedName ( '::' '*' | alias = AliasDefinition )?) 
	//
	////| ( dotQualifiedName = DotQualifiedName ( '.' '*' | alias = AliasDefinition )?) 
	//
	////| ( name = Name ( ( '::' | '.' ) '*' | alias = AliasDefinition )?)
	//
	////;
	//
	//ImportReference:
	//
	//	name=Name (completion=ImportReferenceQualifiedNameCompletion | alias=AliasDefinition | "::" star?="*")?;
	public ImportReferenceElements getImportReferenceAccess() {
		return (pImportReference != null) ? pImportReference : (pImportReference = new ImportReferenceElements());
	}
	
	public ParserRule getImportReferenceRule() {
		return getImportReferenceAccess().getRule();
	}

	//ImportReferenceQualifiedNameCompletion: //| DotQualifiedNameCompletionOfImportReference
	//
	//	ColonQualifiedNameCompletionOfImportReference;
	public ImportReferenceQualifiedNameCompletionElements getImportReferenceQualifiedNameCompletionAccess() {
		return (pImportReferenceQualifiedNameCompletion != null) ? pImportReferenceQualifiedNameCompletion : (pImportReferenceQualifiedNameCompletion = new ImportReferenceQualifiedNameCompletionElements());
	}
	
	public ParserRule getImportReferenceQualifiedNameCompletionRule() {
		return getImportReferenceQualifiedNameCompletionAccess().getRule();
	}

	//ColonQualifiedNameCompletionOfImportReference:
	//
	//	"::" name+=Name ("::" name+=Name)* ("::" star?="*" | alias=AliasDefinition)?;
	public ColonQualifiedNameCompletionOfImportReferenceElements getColonQualifiedNameCompletionOfImportReferenceAccess() {
		return (pColonQualifiedNameCompletionOfImportReference != null) ? pColonQualifiedNameCompletionOfImportReference : (pColonQualifiedNameCompletionOfImportReference = new ColonQualifiedNameCompletionOfImportReferenceElements());
	}
	
	public ParserRule getColonQualifiedNameCompletionOfImportReferenceRule() {
		return getColonQualifiedNameCompletionOfImportReferenceAccess().getRule();
	}

	////DotQualifiedNameCompletionOfImportReference :
	//
	////	'.' name+=Name (('.' name+=Name)* ('.' star ?='*' | alias = AliasDefinition)) ?
	//
	////;
	//
	//AliasDefinition:
	//
	//	"as" alias=Name;
	public AliasDefinitionElements getAliasDefinitionAccess() {
		return (pAliasDefinition != null) ? pAliasDefinition : (pAliasDefinition = new AliasDefinitionElements());
	}
	
	public ParserRule getAliasDefinitionRule() {
		return getAliasDefinitionAccess().getRule();
	}

	/// * NAMESPACES * / NamespaceDefinition:
	//
	//	PackageDefinition | ClassifierDefinition;
	public NamespaceDefinitionElements getNamespaceDefinitionAccess() {
		return (pNamespaceDefinition != null) ? pNamespaceDefinition : (pNamespaceDefinition = new NamespaceDefinitionElements());
	}
	
	public ParserRule getNamespaceDefinitionRule() {
		return getNamespaceDefinitionAccess().getRule();
	}

	//VisibilityIndicator:
	//
	//	PUBLIC="public" | PRIVATE="private" | PROTECTED="protected";
	public VisibilityIndicatorElements getVisibilityIndicatorAccess() {
		return (pVisibilityIndicator != null) ? pVisibilityIndicator : (pVisibilityIndicator = new VisibilityIndicatorElements());
	}
	
	public ParserRule getVisibilityIndicatorRule() {
		return getVisibilityIndicatorAccess().getRule();
	}

	/// * PACKAGES * / PackageDeclaration:
	//
	//	"package" name=Name;
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return (pPackageDeclaration != null) ? pPackageDeclaration : (pPackageDeclaration = new PackageDeclarationElements());
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}

	//PackageDefinition:
	//
	//	declaration=PackageDeclaration body=PackageBody;
	public PackageDefinitionElements getPackageDefinitionAccess() {
		return (pPackageDefinition != null) ? pPackageDefinition : (pPackageDefinition = new PackageDefinitionElements());
	}
	
	public ParserRule getPackageDefinitionRule() {
		return getPackageDefinitionAccess().getRule();
	}

	//PackageDefinitionOrStub:
	//
	//	declaration=PackageDeclaration (";" | body=PackageBody);
	public PackageDefinitionOrStubElements getPackageDefinitionOrStubAccess() {
		return (pPackageDefinitionOrStub != null) ? pPackageDefinitionOrStub : (pPackageDefinitionOrStub = new PackageDefinitionOrStubElements());
	}
	
	public ParserRule getPackageDefinitionOrStubRule() {
		return getPackageDefinitionOrStubAccess().getRule();
	}

	//PackageBody:
	//
	//	{PackageBody} "{" packagedElement+=PackagedElement* "}";
	public PackageBodyElements getPackageBodyAccess() {
		return (pPackageBody != null) ? pPackageBody : (pPackageBody = new PackageBodyElements());
	}
	
	public ParserRule getPackageBodyRule() {
		return getPackageBodyAccess().getRule();
	}

	//PackagedElement:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
	//
	//	importVisibilityIndicator=ImportVisibilityIndicator packagedElementDefinition=PackagedElementDefinition;
	public PackagedElementElements getPackagedElementAccess() {
		return (pPackagedElement != null) ? pPackagedElement : (pPackagedElement = new PackagedElementElements());
	}
	
	public ParserRule getPackagedElementRule() {
		return getPackagedElementAccess().getRule();
	}

	//PackagedElementDefinition:
	//
	//	PackageDefinitionOrStub | ClassifierDefinitionOrStub;
	public PackagedElementDefinitionElements getPackagedElementDefinitionAccess() {
		return (pPackagedElementDefinition != null) ? pPackagedElementDefinition : (pPackagedElementDefinition = new PackagedElementDefinitionElements());
	}
	
	public ParserRule getPackagedElementDefinitionRule() {
		return getPackagedElementDefinitionAccess().getRule();
	}

	/// ***************
	//
	// * CLASSIFIERS *
	//
	// *************** / ClassifierDefinition:
	//
	//	ClassDefinition | ActiveClassDefinition | DataTypeDefinition | EnumerationDefinition | AssociationDefinition |
	//
	//	SignalDefinition | ActivityDefinition;
	public ClassifierDefinitionElements getClassifierDefinitionAccess() {
		return (pClassifierDefinition != null) ? pClassifierDefinition : (pClassifierDefinition = new ClassifierDefinitionElements());
	}
	
	public ParserRule getClassifierDefinitionRule() {
		return getClassifierDefinitionAccess().getRule();
	}

	//ClassifierDefinitionOrStub:
	//
	//	ClassDefinitionOrStub | ActiveClassDefinitionOrStub | DataTypeDefinitionOrStub | EnumerationDefinitionOrStub |
	//
	//	AssociationDefinitionOrStub | SignalDefinitionOrStub | ActivityDefinitionOrStub;
	public ClassifierDefinitionOrStubElements getClassifierDefinitionOrStubAccess() {
		return (pClassifierDefinitionOrStub != null) ? pClassifierDefinitionOrStub : (pClassifierDefinitionOrStub = new ClassifierDefinitionOrStubElements());
	}
	
	public ParserRule getClassifierDefinitionOrStubRule() {
		return getClassifierDefinitionOrStubAccess().getRule();
	}

	//ClassifierSignature:
	//
	//	name=Name templateParameters=TemplateParameters? specializationClause=SpecializationClause?;
	public ClassifierSignatureElements getClassifierSignatureAccess() {
		return (pClassifierSignature != null) ? pClassifierSignature : (pClassifierSignature = new ClassifierSignatureElements());
	}
	
	public ParserRule getClassifierSignatureRule() {
		return getClassifierSignatureAccess().getRule();
	}

	//TemplateParameters:
	//
	//	"<" classifierTemplateParameter+=ClassifierTemplateParameter (","
	//
	//	classifierTemplateParameter+=ClassifierTemplateParameter)* ">";
	public TemplateParametersElements getTemplateParametersAccess() {
		return (pTemplateParameters != null) ? pTemplateParameters : (pTemplateParameters = new TemplateParametersElements());
	}
	
	public ParserRule getTemplateParametersRule() {
		return getTemplateParametersAccess().getRule();
	}

	//ClassifierTemplateParameter:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / name=Name ("specializes" qualifiedName=QualifiedName)?;
	public ClassifierTemplateParameterElements getClassifierTemplateParameterAccess() {
		return (pClassifierTemplateParameter != null) ? pClassifierTemplateParameter : (pClassifierTemplateParameter = new ClassifierTemplateParameterElements());
	}
	
	public ParserRule getClassifierTemplateParameterRule() {
		return getClassifierTemplateParameterAccess().getRule();
	}

	//SpecializationClause:
	//
	//	"specializes" qualifiedNameList=QualifiedNameList;
	public SpecializationClauseElements getSpecializationClauseAccess() {
		return (pSpecializationClause != null) ? pSpecializationClause : (pSpecializationClause = new SpecializationClauseElements());
	}
	
	public ParserRule getSpecializationClauseRule() {
		return getSpecializationClauseAccess().getRule();
	}

	/// * CLASSES * / ClassDeclaration:
	//
	//	isAbstract?="abstract"? "class" classifierSignature=ClassifierSignature;
	public ClassDeclarationElements getClassDeclarationAccess() {
		return (pClassDeclaration != null) ? pClassDeclaration : (pClassDeclaration = new ClassDeclarationElements());
	}
	
	public ParserRule getClassDeclarationRule() {
		return getClassDeclarationAccess().getRule();
	}

	//ClassDefinition:
	//
	//	classDeclaration=ClassDeclaration classBody=ClassBody;
	public ClassDefinitionElements getClassDefinitionAccess() {
		return (pClassDefinition != null) ? pClassDefinition : (pClassDefinition = new ClassDefinitionElements());
	}
	
	public ParserRule getClassDefinitionRule() {
		return getClassDefinitionAccess().getRule();
	}

	//ClassDefinitionOrStub:
	//
	//	classDeclaration=ClassDeclaration (";" | classBody=ClassBody);
	public ClassDefinitionOrStubElements getClassDefinitionOrStubAccess() {
		return (pClassDefinitionOrStub != null) ? pClassDefinitionOrStub : (pClassDefinitionOrStub = new ClassDefinitionOrStubElements());
	}
	
	public ParserRule getClassDefinitionOrStubRule() {
		return getClassDefinitionOrStubAccess().getRule();
	}

	//ClassBody:
	//
	//	{ClassBody} "{" classMember+=ClassMember* "}";
	public ClassBodyElements getClassBodyAccess() {
		return (pClassBody != null) ? pClassBody : (pClassBody = new ClassBodyElements());
	}
	
	public ParserRule getClassBodyRule() {
		return getClassBodyAccess().getRule();
	}

	//ClassMember:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
	//
	//	visibilityIndicator=VisibilityIndicator? classMemberDefinition=ClassMemberDefinition;
	public ClassMemberElements getClassMemberAccess() {
		return (pClassMember != null) ? pClassMember : (pClassMember = new ClassMemberElements());
	}
	
	public ParserRule getClassMemberRule() {
		return getClassMemberAccess().getRule();
	}

	//ClassMemberDefinition:
	//
	//	ClassifierDefinitionOrStub | FeatureDefinitionOrStub;
	public ClassMemberDefinitionElements getClassMemberDefinitionAccess() {
		return (pClassMemberDefinition != null) ? pClassMemberDefinition : (pClassMemberDefinition = new ClassMemberDefinitionElements());
	}
	
	public ParserRule getClassMemberDefinitionRule() {
		return getClassMemberDefinitionAccess().getRule();
	}

	/// * ACTIVE CLASSES * / ActiveClassDeclaration:
	//
	//	isAbstract?="abstract"? "active" "class" classifierSignature=ClassifierSignature;
	public ActiveClassDeclarationElements getActiveClassDeclarationAccess() {
		return (pActiveClassDeclaration != null) ? pActiveClassDeclaration : (pActiveClassDeclaration = new ActiveClassDeclarationElements());
	}
	
	public ParserRule getActiveClassDeclarationRule() {
		return getActiveClassDeclarationAccess().getRule();
	}

	//ActiveClassDefinition:
	//
	//	activeClassDeclaration=ActiveClassDeclaration activeClassBody=ActiveClassBody;
	public ActiveClassDefinitionElements getActiveClassDefinitionAccess() {
		return (pActiveClassDefinition != null) ? pActiveClassDefinition : (pActiveClassDefinition = new ActiveClassDefinitionElements());
	}
	
	public ParserRule getActiveClassDefinitionRule() {
		return getActiveClassDefinitionAccess().getRule();
	}

	//ActiveClassDefinitionOrStub:
	//
	//	activeClassDeclaration=ActiveClassDeclaration (";" | activeClassBody=ActiveClassBody);
	public ActiveClassDefinitionOrStubElements getActiveClassDefinitionOrStubAccess() {
		return (pActiveClassDefinitionOrStub != null) ? pActiveClassDefinitionOrStub : (pActiveClassDefinitionOrStub = new ActiveClassDefinitionOrStubElements());
	}
	
	public ParserRule getActiveClassDefinitionOrStubRule() {
		return getActiveClassDefinitionOrStubAccess().getRule();
	}

	//ActiveClassBody:
	//
	//	{ActiveClassBody} "{" activeClassMember+=ActiveClassMember* "}" ("do" behaviorClasue=BehaviorClause)?;
	public ActiveClassBodyElements getActiveClassBodyAccess() {
		return (pActiveClassBody != null) ? pActiveClassBody : (pActiveClassBody = new ActiveClassBodyElements());
	}
	
	public ParserRule getActiveClassBodyRule() {
		return getActiveClassBodyAccess().getRule();
	}

	//BehaviorClause:
	//
	//	block=Block | name=Name;
	public BehaviorClauseElements getBehaviorClauseAccess() {
		return (pBehaviorClause != null) ? pBehaviorClause : (pBehaviorClause = new BehaviorClauseElements());
	}
	
	public ParserRule getBehaviorClauseRule() {
		return getBehaviorClauseAccess().getRule();
	}

	//ActiveClassMember:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
	//
	//	visibilityIndicator=VisibilityIndicator? activeClassMemberDefinition=ActiveClassMemberDefinition;
	public ActiveClassMemberElements getActiveClassMemberAccess() {
		return (pActiveClassMember != null) ? pActiveClassMember : (pActiveClassMember = new ActiveClassMemberElements());
	}
	
	public ParserRule getActiveClassMemberRule() {
		return getActiveClassMemberAccess().getRule();
	}

	//ActiveClassMemberDefinition:
	//
	//	ClassMemberDefinition | ActiveFeatureDefinitionOrStub;
	public ActiveClassMemberDefinitionElements getActiveClassMemberDefinitionAccess() {
		return (pActiveClassMemberDefinition != null) ? pActiveClassMemberDefinition : (pActiveClassMemberDefinition = new ActiveClassMemberDefinitionElements());
	}
	
	public ParserRule getActiveClassMemberDefinitionRule() {
		return getActiveClassMemberDefinitionAccess().getRule();
	}

	/// * DATA TYPES * / DataTypeDeclaration:
	//
	//	isAbstract?="abstract"? "datatype" classifierSignature=ClassifierSignature;
	public DataTypeDeclarationElements getDataTypeDeclarationAccess() {
		return (pDataTypeDeclaration != null) ? pDataTypeDeclaration : (pDataTypeDeclaration = new DataTypeDeclarationElements());
	}
	
	public ParserRule getDataTypeDeclarationRule() {
		return getDataTypeDeclarationAccess().getRule();
	}

	//DataTypeDefinition:
	//
	//	dataTypeDeclaration=DataTypeDeclaration structureBody=StructuredBody;
	public DataTypeDefinitionElements getDataTypeDefinitionAccess() {
		return (pDataTypeDefinition != null) ? pDataTypeDefinition : (pDataTypeDefinition = new DataTypeDefinitionElements());
	}
	
	public ParserRule getDataTypeDefinitionRule() {
		return getDataTypeDefinitionAccess().getRule();
	}

	//DataTypeDefinitionOrStub:
	//
	//	dataTypeDeclaration=DataTypeDeclaration (";" | structureBody=StructuredBody);
	public DataTypeDefinitionOrStubElements getDataTypeDefinitionOrStubAccess() {
		return (pDataTypeDefinitionOrStub != null) ? pDataTypeDefinitionOrStub : (pDataTypeDefinitionOrStub = new DataTypeDefinitionOrStubElements());
	}
	
	public ParserRule getDataTypeDefinitionOrStubRule() {
		return getDataTypeDefinitionOrStubAccess().getRule();
	}

	//StructuredBody:
	//
	//	{StructuredBody} "{" structuredMember+=StructuredMember* "}";
	public StructuredBodyElements getStructuredBodyAccess() {
		return (pStructuredBody != null) ? pStructuredBody : (pStructuredBody = new StructuredBodyElements());
	}
	
	public ParserRule getStructuredBodyRule() {
		return getStructuredBodyAccess().getRule();
	}

	//StructuredMember:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / streotypeAnnotations=StereotypeAnnotations isPublic?="public"?
	//
	//	propertyDefinition=PropertyDefinition;
	public StructuredMemberElements getStructuredMemberAccess() {
		return (pStructuredMember != null) ? pStructuredMember : (pStructuredMember = new StructuredMemberElements());
	}
	
	public ParserRule getStructuredMemberRule() {
		return getStructuredMemberAccess().getRule();
	}

	/// * ASSOCIATIONS * / AssociationDeclaration:
	//
	//	isAbstract?="abstract"? "assoc" classifierSignature=ClassifierSignature;
	public AssociationDeclarationElements getAssociationDeclarationAccess() {
		return (pAssociationDeclaration != null) ? pAssociationDeclaration : (pAssociationDeclaration = new AssociationDeclarationElements());
	}
	
	public ParserRule getAssociationDeclarationRule() {
		return getAssociationDeclarationAccess().getRule();
	}

	//AssociationDefinition:
	//
	//	associationDeclaration=AssociationDeclaration structuredBody=StructuredBody;
	public AssociationDefinitionElements getAssociationDefinitionAccess() {
		return (pAssociationDefinition != null) ? pAssociationDefinition : (pAssociationDefinition = new AssociationDefinitionElements());
	}
	
	public ParserRule getAssociationDefinitionRule() {
		return getAssociationDefinitionAccess().getRule();
	}

	//AssociationDefinitionOrStub:
	//
	//	associationDeclaration=AssociationDeclaration (";" | structuredBody=StructuredBody);
	public AssociationDefinitionOrStubElements getAssociationDefinitionOrStubAccess() {
		return (pAssociationDefinitionOrStub != null) ? pAssociationDefinitionOrStub : (pAssociationDefinitionOrStub = new AssociationDefinitionOrStubElements());
	}
	
	public ParserRule getAssociationDefinitionOrStubRule() {
		return getAssociationDefinitionOrStubAccess().getRule();
	}

	/// * ENUMERATIONS * / EnumerationDeclaration:
	//
	//	"enum" name=Name specializationClause=SpecializationClause?;
	public EnumerationDeclarationElements getEnumerationDeclarationAccess() {
		return (pEnumerationDeclaration != null) ? pEnumerationDeclaration : (pEnumerationDeclaration = new EnumerationDeclarationElements());
	}
	
	public ParserRule getEnumerationDeclarationRule() {
		return getEnumerationDeclarationAccess().getRule();
	}

	//EnumerationDefinition:
	//
	//	enumerationClause=EnumerationDeclaration enumerationBody=EnumerationBody;
	public EnumerationDefinitionElements getEnumerationDefinitionAccess() {
		return (pEnumerationDefinition != null) ? pEnumerationDefinition : (pEnumerationDefinition = new EnumerationDefinitionElements());
	}
	
	public ParserRule getEnumerationDefinitionRule() {
		return getEnumerationDefinitionAccess().getRule();
	}

	//EnumerationDefinitionOrStub:
	//
	//	enumerationDeclaration=EnumerationDeclaration (";" | enumerationBody=EnumerationBody);
	public EnumerationDefinitionOrStubElements getEnumerationDefinitionOrStubAccess() {
		return (pEnumerationDefinitionOrStub != null) ? pEnumerationDefinitionOrStub : (pEnumerationDefinitionOrStub = new EnumerationDefinitionOrStubElements());
	}
	
	public ParserRule getEnumerationDefinitionOrStubRule() {
		return getEnumerationDefinitionOrStubAccess().getRule();
	}

	//EnumerationBody:
	//
	//	"{" enumerationLiteralName+=EnumerationLiteralName ("," enumerationLiteralName+=EnumerationLiteralName)* "}";
	public EnumerationBodyElements getEnumerationBodyAccess() {
		return (pEnumerationBody != null) ? pEnumerationBody : (pEnumerationBody = new EnumerationBodyElements());
	}
	
	public ParserRule getEnumerationBodyRule() {
		return getEnumerationBodyAccess().getRule();
	}

	//EnumerationLiteralName:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / name=Name;
	public EnumerationLiteralNameElements getEnumerationLiteralNameAccess() {
		return (pEnumerationLiteralName != null) ? pEnumerationLiteralName : (pEnumerationLiteralName = new EnumerationLiteralNameElements());
	}
	
	public ParserRule getEnumerationLiteralNameRule() {
		return getEnumerationLiteralNameAccess().getRule();
	}

	/// * SIGNALS * / SignalDeclaration:
	//
	//	isAbstract?="abstract"? "signal" classifierSignature=ClassifierSignature;
	public SignalDeclarationElements getSignalDeclarationAccess() {
		return (pSignalDeclaration != null) ? pSignalDeclaration : (pSignalDeclaration = new SignalDeclarationElements());
	}
	
	public ParserRule getSignalDeclarationRule() {
		return getSignalDeclarationAccess().getRule();
	}

	//SignalDefinition:
	//
	//	signalDeclaration=SignalDeclaration structuredBody=StructuredBody;
	public SignalDefinitionElements getSignalDefinitionAccess() {
		return (pSignalDefinition != null) ? pSignalDefinition : (pSignalDefinition = new SignalDefinitionElements());
	}
	
	public ParserRule getSignalDefinitionRule() {
		return getSignalDefinitionAccess().getRule();
	}

	//SignalDefinitionOrStub:
	//
	//	signalDeclaration=SignalDeclaration (";" | structuredBody=StructuredBody);
	public SignalDefinitionOrStubElements getSignalDefinitionOrStubAccess() {
		return (pSignalDefinitionOrStub != null) ? pSignalDefinitionOrStub : (pSignalDefinitionOrStub = new SignalDefinitionOrStubElements());
	}
	
	public ParserRule getSignalDefinitionOrStubRule() {
		return getSignalDefinitionOrStubAccess().getRule();
	}

	/// * ACTIVITIES * / ActivityDeclaration:
	//
	//	"activity" name=Name templateParameters=TemplateParameters? formalParameters=FormalParameters (":"
	//
	//	typePart=TypePart)?;
	public ActivityDeclarationElements getActivityDeclarationAccess() {
		return (pActivityDeclaration != null) ? pActivityDeclaration : (pActivityDeclaration = new ActivityDeclarationElements());
	}
	
	public ParserRule getActivityDeclarationRule() {
		return getActivityDeclarationAccess().getRule();
	}

	//ActivityDefinition:
	//
	//	activityDeclaration=ActivityDeclaration block=Block;
	public ActivityDefinitionElements getActivityDefinitionAccess() {
		return (pActivityDefinition != null) ? pActivityDefinition : (pActivityDefinition = new ActivityDefinitionElements());
	}
	
	public ParserRule getActivityDefinitionRule() {
		return getActivityDefinitionAccess().getRule();
	}

	//ActivityDefinitionOrStub:
	//
	//	activityDeclaration=ActivityDeclaration (";" | block=Block);
	public ActivityDefinitionOrStubElements getActivityDefinitionOrStubAccess() {
		return (pActivityDefinitionOrStub != null) ? pActivityDefinitionOrStub : (pActivityDefinitionOrStub = new ActivityDefinitionOrStubElements());
	}
	
	public ParserRule getActivityDefinitionOrStubRule() {
		return getActivityDefinitionOrStubAccess().getRule();
	}

	//FormalParameters:
	//
	//	{FormalParameters} "(" formalParameterList=FormalParameterList? ")";
	public FormalParametersElements getFormalParametersAccess() {
		return (pFormalParameters != null) ? pFormalParameters : (pFormalParameters = new FormalParametersElements());
	}
	
	public ParserRule getFormalParametersRule() {
		return getFormalParametersAccess().getRule();
	}

	//FormalParameterList:
	//
	//	formalParameter+=FormalParameter ("," formalParameter+=FormalParameter)*;
	public FormalParameterListElements getFormalParameterListAccess() {
		return (pFormalParameterList != null) ? pFormalParameterList : (pFormalParameterList = new FormalParameterListElements());
	}
	
	public ParserRule getFormalParameterListRule() {
		return getFormalParameterListAccess().getRule();
	}

	//FormalParameter:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / stereotypeAnnotations=StereotypeAnnotations
	//
	//	parameterDirection=ParameterDirection name=Name ":" typePart=TypePart;
	public FormalParameterElements getFormalParameterAccess() {
		return (pFormalParameter != null) ? pFormalParameter : (pFormalParameter = new FormalParameterElements());
	}
	
	public ParserRule getFormalParameterRule() {
		return getFormalParameterAccess().getRule();
	}

	//enum ParameterDirection:
	//
	//	IN="in" | OUT="out" | INOUT="inout";
	public ParameterDirectionElements getParameterDirectionAccess() {
		return (unknownRuleParameterDirection != null) ? unknownRuleParameterDirection : (unknownRuleParameterDirection = new ParameterDirectionElements());
	}
	
	public EnumRule getParameterDirectionRule() {
		return getParameterDirectionAccess().getRule();
	}

	/// * FEATURES * / FeatureDefinitionOrStub:
	//
	//	AttributeDefinition | OperationDefinitionOrStub;
	public FeatureDefinitionOrStubElements getFeatureDefinitionOrStubAccess() {
		return (pFeatureDefinitionOrStub != null) ? pFeatureDefinitionOrStub : (pFeatureDefinitionOrStub = new FeatureDefinitionOrStubElements());
	}
	
	public ParserRule getFeatureDefinitionOrStubRule() {
		return getFeatureDefinitionOrStubAccess().getRule();
	}

	//ActiveFeatureDefinitionOrStub:
	//
	//	ReceptionDefinition | SignalReceptionDefinitionOrStub;
	public ActiveFeatureDefinitionOrStubElements getActiveFeatureDefinitionOrStubAccess() {
		return (pActiveFeatureDefinitionOrStub != null) ? pActiveFeatureDefinitionOrStub : (pActiveFeatureDefinitionOrStub = new ActiveFeatureDefinitionOrStubElements());
	}
	
	public ParserRule getActiveFeatureDefinitionOrStubRule() {
		return getActiveFeatureDefinitionOrStubAccess().getRule();
	}

	/// * PROPERTIES * / PropertyDefinition:
	//
	//	propertyDeclaration=PropertyDeclaration ";";
	public PropertyDefinitionElements getPropertyDefinitionAccess() {
		return (pPropertyDefinition != null) ? pPropertyDefinition : (pPropertyDefinition = new PropertyDefinitionElements());
	}
	
	public ParserRule getPropertyDefinitionRule() {
		return getPropertyDefinitionAccess().getRule();
	}

	//AttributeDefinition:
	//
	//	propertyDeclaration=PropertyDeclaration attributeInitializer=AttributeInitializer? ";";
	public AttributeDefinitionElements getAttributeDefinitionAccess() {
		return (pAttributeDefinition != null) ? pAttributeDefinition : (pAttributeDefinition = new AttributeDefinitionElements());
	}
	
	public ParserRule getAttributeDefinitionRule() {
		return getAttributeDefinitionAccess().getRule();
	}

	//AttributeInitializer:
	//
	//	"=" initializationExpression=InitializationExpression;
	public AttributeInitializerElements getAttributeInitializerAccess() {
		return (pAttributeInitializer != null) ? pAttributeInitializer : (pAttributeInitializer = new AttributeInitializerElements());
	}
	
	public ParserRule getAttributeInitializerRule() {
		return getAttributeInitializerAccess().getRule();
	}

	//PropertyDeclaration:
	//
	//	name=Name ":" isComposite?="compose"? typePart=TypePart;
	public PropertyDeclarationElements getPropertyDeclarationAccess() {
		return (pPropertyDeclaration != null) ? pPropertyDeclaration : (pPropertyDeclaration = new PropertyDeclarationElements());
	}
	
	public ParserRule getPropertyDeclarationRule() {
		return getPropertyDeclarationAccess().getRule();
	}

	//TypePart:
	//
	//	typeName=TypeName multiplicity=Multiplicity?;
	public TypePartElements getTypePartAccess() {
		return (pTypePart != null) ? pTypePart : (pTypePart = new TypePartElements());
	}
	
	public ParserRule getTypePartRule() {
		return getTypePartAccess().getRule();
	}

	//TypeName:
	//
	//	qualifiedName=QualifiedName | any?="any";
	public TypeNameElements getTypeNameAccess() {
		return (pTypeName != null) ? pTypeName : (pTypeName = new TypeNameElements());
	}
	
	public ParserRule getTypeNameRule() {
		return getTypeNameAccess().getRule();
	}

	//Multiplicity:
	//
	//	{Multiplicity} "[" multiplicityRange=MultiplicityRange? "]" (isOrdered?="ordered" isNonUnique?="nonunique"? |
	//
	//	isNonUnique?="nonunique" isOrdered?="ordered"? | isSequence?="sequence")?;
	public MultiplicityElements getMultiplicityAccess() {
		return (pMultiplicity != null) ? pMultiplicity : (pMultiplicity = new MultiplicityElements());
	}
	
	public ParserRule getMultiplicityRule() {
		return getMultiplicityAccess().getRule();
	}

	//MultiplicityRange:
	//
	//	(lower=INTEGER_LITERAL "..")? upper=UnlimitedNaturalLiteral;
	public MultiplicityRangeElements getMultiplicityRangeAccess() {
		return (pMultiplicityRange != null) ? pMultiplicityRange : (pMultiplicityRange = new MultiplicityRangeElements());
	}
	
	public ParserRule getMultiplicityRangeRule() {
		return getMultiplicityRangeAccess().getRule();
	}

	//UnlimitedNaturalLiteral:
	//
	//	integer=INTEGER_LITERAL | star?="*";
	public UnlimitedNaturalLiteralElements getUnlimitedNaturalLiteralAccess() {
		return (pUnlimitedNaturalLiteral != null) ? pUnlimitedNaturalLiteral : (pUnlimitedNaturalLiteral = new UnlimitedNaturalLiteralElements());
	}
	
	public ParserRule getUnlimitedNaturalLiteralRule() {
		return getUnlimitedNaturalLiteralAccess().getRule();
	}

	/// * OPERATIONS * / OperationDeclaration:
	//
	//	isAbstract?="abstract"? name=Name formalParameters=FormalParameters (":" typePart=TypePart)?
	//
	//	redefinitionClause=RedefinitionClause?;
	public OperationDeclarationElements getOperationDeclarationAccess() {
		return (pOperationDeclaration != null) ? pOperationDeclaration : (pOperationDeclaration = new OperationDeclarationElements());
	}
	
	public ParserRule getOperationDeclarationRule() {
		return getOperationDeclarationAccess().getRule();
	}

	//OperationDefinitionOrStub:
	//
	//	OperationDeclaration (";" | block=Block);
	public OperationDefinitionOrStubElements getOperationDefinitionOrStubAccess() {
		return (pOperationDefinitionOrStub != null) ? pOperationDefinitionOrStub : (pOperationDefinitionOrStub = new OperationDefinitionOrStubElements());
	}
	
	public ParserRule getOperationDefinitionOrStubRule() {
		return getOperationDefinitionOrStubAccess().getRule();
	}

	//RedefinitionClause:
	//
	//	"redefines" qualifiedNameList=QualifiedNameList;
	public RedefinitionClauseElements getRedefinitionClauseAccess() {
		return (pRedefinitionClause != null) ? pRedefinitionClause : (pRedefinitionClause = new RedefinitionClauseElements());
	}
	
	public ParserRule getRedefinitionClauseRule() {
		return getRedefinitionClauseAccess().getRule();
	}

	/// * RECEPTIONS * / ReceptionDefinition:
	//
	//	"receive" receptionName=QualifiedName ";";
	public ReceptionDefinitionElements getReceptionDefinitionAccess() {
		return (pReceptionDefinition != null) ? pReceptionDefinition : (pReceptionDefinition = new ReceptionDefinitionElements());
	}
	
	public ParserRule getReceptionDefinitionRule() {
		return getReceptionDefinitionAccess().getRule();
	}

	//SignalReceptionDeclaration:
	//
	//	"receive" "signal" signalName=Name specializationClause=SpecializationClause?;
	public SignalReceptionDeclarationElements getSignalReceptionDeclarationAccess() {
		return (pSignalReceptionDeclaration != null) ? pSignalReceptionDeclaration : (pSignalReceptionDeclaration = new SignalReceptionDeclarationElements());
	}
	
	public ParserRule getSignalReceptionDeclarationRule() {
		return getSignalReceptionDeclarationAccess().getRule();
	}

	//SignalReceptionDefinitionOrStub:
	//
	//	signalReceptionOrDeclaration=SignalReceptionDeclaration (";" | structuredBody=StructuredBody);
	public SignalReceptionDefinitionOrStubElements getSignalReceptionDefinitionOrStubAccess() {
		return (pSignalReceptionDefinitionOrStub != null) ? pSignalReceptionDefinitionOrStub : (pSignalReceptionDefinitionOrStub = new SignalReceptionDefinitionOrStubElements());
	}
	
	public ParserRule getSignalReceptionDefinitionOrStubRule() {
		return getSignalReceptionDefinitionOrStubAccess().getRule();
	}

	/// ***************
	//
	// * NAMES *
	//
	// *************** / Name:
	//
	//	id=ID;
	public NameElements getNameAccess() {
		return (pName != null) ? pName : (pName = new NameElements());
	}
	
	public ParserRule getNameRule() {
		return getNameAccess().getRule();
	}

	//QualifiedName: // unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
	//
	//	unqualified=UnqualifiedName nameCompletion=ColonQualifiedNameCompletion?;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	////PotentiallyAmbiguousQualifiedName :
	//
	////	unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))? / * AMBIGUOUS * /
	//
	////;
	//
	////ColonQualifiedName : 
	//
	////	unqualified = UnqualifiedName nameCompletion = ColonQualifiedNameCompletion
	//
	////;
	//
	//ColonQualifiedNameCompletion:
	//
	//	("::" namedBindings+=NameBinding)+;
	public ColonQualifiedNameCompletionElements getColonQualifiedNameCompletionAccess() {
		return (pColonQualifiedNameCompletion != null) ? pColonQualifiedNameCompletion : (pColonQualifiedNameCompletion = new ColonQualifiedNameCompletionElements());
	}
	
	public ParserRule getColonQualifiedNameCompletionRule() {
		return getColonQualifiedNameCompletionAccess().getRule();
	}

	////DotQualifiedName : 
	//
	////	unqualified = UnqualifiedName nameCompletion = DotQualifiedNameCompletion
	//
	////;
	//
	////DotQualifiedNameCompletion : 
	//
	////	( '.' nameBindings += NameBinding )+ 
	//
	////;
	//
	//UnqualifiedName:
	//
	//	NameBinding;
	public UnqualifiedNameElements getUnqualifiedNameAccess() {
		return (pUnqualifiedName != null) ? pUnqualifiedName : (pUnqualifiedName = new UnqualifiedNameElements());
	}
	
	public ParserRule getUnqualifiedNameRule() {
		return getUnqualifiedNameAccess().getRule();
	}

	//NameBinding:
	//
	//	name=Name templateBinding=TemplateBinding?;
	public NameBindingElements getNameBindingAccess() {
		return (pNameBinding != null) ? pNameBinding : (pNameBinding = new NameBindingElements());
	}
	
	public ParserRule getNameBindingRule() {
		return getNameBindingAccess().getRule();
	}

	//QualifiedNameWithoutBinding: // unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))?
	//
	//	unqualified=Name nameCompletion=ColonQualifiedNameCompletionWithoutBinding?;
	public QualifiedNameWithoutBindingElements getQualifiedNameWithoutBindingAccess() {
		return (pQualifiedNameWithoutBinding != null) ? pQualifiedNameWithoutBinding : (pQualifiedNameWithoutBinding = new QualifiedNameWithoutBindingElements());
	}
	
	public ParserRule getQualifiedNameWithoutBindingRule() {
		return getQualifiedNameWithoutBindingAccess().getRule();
	}

	////PotentiallyAmbiguousQualifiedName :
	//
	////	unqualified = UnqualifiedName (nameCompletion = (ColonQualifiedNameCompletion | DotQualifiedNameCompletion))? / * AMBIGUOUS * /
	//
	////;
	//
	////ColonQualifiedName : 
	//
	////	unqualified = UnqualifiedName nameCompletion = ColonQualifiedNameCompletion
	//
	////;
	//
	//ColonQualifiedNameCompletionWithoutBinding:
	//
	//	("::" names+=Name)+;
	public ColonQualifiedNameCompletionWithoutBindingElements getColonQualifiedNameCompletionWithoutBindingAccess() {
		return (pColonQualifiedNameCompletionWithoutBinding != null) ? pColonQualifiedNameCompletionWithoutBinding : (pColonQualifiedNameCompletionWithoutBinding = new ColonQualifiedNameCompletionWithoutBindingElements());
	}
	
	public ParserRule getColonQualifiedNameCompletionWithoutBindingRule() {
		return getColonQualifiedNameCompletionWithoutBindingAccess().getRule();
	}

	////DotQualifiedName : 
	//
	////	unqualified = UnqualifiedName nameCompletion = DotQualifiedNameCompletion
	//
	////;
	//
	////DotQualifiedNameCompletion : 
	//
	////	( '.' nameBindings += NameBinding )+ 
	//
	////;
	//
	/// * ^ Unbounded lookahead required here * / TemplateBinding:
	//
	//	"<" (NamedTemplateBinding | PositionalTemplateBinding) ">";
	public TemplateBindingElements getTemplateBindingAccess() {
		return (pTemplateBinding != null) ? pTemplateBinding : (pTemplateBinding = new TemplateBindingElements());
	}
	
	public ParserRule getTemplateBindingRule() {
		return getTemplateBindingAccess().getRule();
	}

	//PositionalTemplateBinding:
	//
	//	qualifiedName+=QualifiedName ("," qualifiedName+=QualifiedName)*;
	public PositionalTemplateBindingElements getPositionalTemplateBindingAccess() {
		return (pPositionalTemplateBinding != null) ? pPositionalTemplateBinding : (pPositionalTemplateBinding = new PositionalTemplateBindingElements());
	}
	
	public ParserRule getPositionalTemplateBindingRule() {
		return getPositionalTemplateBindingAccess().getRule();
	}

	//NamedTemplateBinding:
	//
	//	templateParameterSubstitution+=TemplateParameterSubstitution (","
	//
	//	templateParameterSubstitution+=TemplateParameterSubstitution)*;
	public NamedTemplateBindingElements getNamedTemplateBindingAccess() {
		return (pNamedTemplateBinding != null) ? pNamedTemplateBinding : (pNamedTemplateBinding = new NamedTemplateBindingElements());
	}
	
	public ParserRule getNamedTemplateBindingRule() {
		return getNamedTemplateBindingAccess().getRule();
	}

	//TemplateParameterSubstitution:
	//
	//	name=Name "=>" qualifiedName=QualifiedName;
	public TemplateParameterSubstitutionElements getTemplateParameterSubstitutionAccess() {
		return (pTemplateParameterSubstitution != null) ? pTemplateParameterSubstitution : (pTemplateParameterSubstitution = new TemplateParameterSubstitutionElements());
	}
	
	public ParserRule getTemplateParameterSubstitutionRule() {
		return getTemplateParameterSubstitutionAccess().getRule();
	}

	/// ***************
	//
	// * EXPRESSIONS *
	//
	// *************** / Expression:
	//
	//	unaryExpression=UnaryExpression expressionCompletion=ExpressionCompletion;
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//NonNameExpression:
	//
	//	nonNameUnaryExpression=NonNameUnaryExpression expressionCompletion=ExpressionCompletion;
	public NonNameExpressionElements getNonNameExpressionAccess() {
		return (pNonNameExpression != null) ? pNonNameExpression : (pNonNameExpression = new NonNameExpressionElements());
	}
	
	public ParserRule getNonNameExpressionRule() {
		return getNonNameExpressionAccess().getRule();
	}

	//NameToExpressionCompletion:
	//
	//	nameToPrimary=NameToPrimaryExpression?
	//
	//	/ *=> ( nameToPrimary = NameToPrimaryExpression )? primaryToExpressionCompletion = PrimaryToExpressionCompletion* /
	//
	//	primaryToExpressionCompletion=PrimaryToExpressionCompletion;
	public NameToExpressionCompletionElements getNameToExpressionCompletionAccess() {
		return (pNameToExpressionCompletion != null) ? pNameToExpressionCompletion : (pNameToExpressionCompletion = new NameToExpressionCompletionElements());
	}
	
	public ParserRule getNameToExpressionCompletionRule() {
		return getNameToExpressionCompletionAccess().getRule();
	}

	////NameToExpressionCompletionInLocalNameDeclaration : // ADDED
	//
	////	/ *=> ( nameToPrimary = NameToPrimaryExpression )? primaryToExpressionCompletion = PrimaryToExpressionCompletion* /
	//
	////	nameToPrimary = NameToPrimaryExpressionInLocalNameDeclaration / *NameToPrimaryExpression* / primaryToExpressionCompletion = PrimaryToExpressionCompletion
	//
	////;
	//
	////
	//
	////NameToPrimaryExpressionInLocalNameDeclaration : // ADDED 
	//
	////	('.'
	//
	////		( linkOperationCompletion = LinkOperationCompletion 
	//
	////		  | classExtentExpressionCompletion = ClassExtentExpressionCompletion
	//
	////		  | feature= Name (invocation = FeatureInvocation)?// ADDED (as compared to NameToPrimaryExpression)
	//
	////		)
	//
	////	) 
	//
	////	| (sequenceConstructionCompletion = SequenceConstructionExpressionCompletion) 
	//
	////	| (behaviorInvocation = BehaviorInvocation)
	//
	////	| (index = Index) // ADDED (as compared to NameToPrimaryExpression)
	//
	////	| (sequenceOperationOrReductionOrExpansion = SequenceOperationOrReductionOrExpansion) // ADDED (as compared to NameToPrimaryExpression)
	//
	////	 
	//
	////;
	//
	//PrimaryToExpressionCompletion:
	//
	//	postFixExpressionCompletion=PostfixExpressionCompletion?
	//
	//	/ *postFixExpressionCompletion = PostfixExpressionCompletion expressionCompletion = ExpressionCompletion* /
	//
	//	expressionCompletion=ExpressionCompletion;
	public PrimaryToExpressionCompletionElements getPrimaryToExpressionCompletionAccess() {
		return (pPrimaryToExpressionCompletion != null) ? pPrimaryToExpressionCompletion : (pPrimaryToExpressionCompletion = new PrimaryToExpressionCompletionElements());
	}
	
	public ParserRule getPrimaryToExpressionCompletionRule() {
		return getPrimaryToExpressionCompletionAccess().getRule();
	}

	//ExpressionCompletion:
	//
	//	AssignmentExpressionCompletion | ConditionalExpressionCompletion;
	public ExpressionCompletionElements getExpressionCompletionAccess() {
		return (pExpressionCompletion != null) ? pExpressionCompletion : (pExpressionCompletion = new ExpressionCompletionElements());
	}
	
	public ParserRule getExpressionCompletionRule() {
		return getExpressionCompletionAccess().getRule();
	}

	/// * PRIMARY EXPRESSIONS * / PrimaryExpression:
	//
	//	(nameOrPrimaryExpression=NameOrPrimaryExpression | baseExpression=BaseExpression |
	//
	//	parenthesizedExpression=ParenthesizedExpression) primaryExpressionCompletion=PrimaryExpressionCompletion?;
	public PrimaryExpressionElements getPrimaryExpressionAccess() {
		return (pPrimaryExpression != null) ? pPrimaryExpression : (pPrimaryExpression = new PrimaryExpressionElements());
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}

	//BaseExpression:
	//
	//	LiteralExpression | ThisExpression | SuperInvocationExpression | InstanceCreationOrSequenceConstructionExpression |
	//
	//	SequenceAnyExpression;
	public BaseExpressionElements getBaseExpressionAccess() {
		return (pBaseExpression != null) ? pBaseExpression : (pBaseExpression = new BaseExpressionElements());
	}
	
	public ParserRule getBaseExpressionRule() {
		return getBaseExpressionAccess().getRule();
	}

	//NameToPrimaryExpression:
	//
	//	"." (linkOperationCompletion=LinkOperationCompletion |
	//
	//	classExtentExpressionCompletion=ClassExtentExpressionCompletion) |
	//
	//	sequenceConstructionCompletion=SequenceConstructionExpressionCompletion | behaviorInvocation=BehaviorInvocation;
	public NameToPrimaryExpressionElements getNameToPrimaryExpressionAccess() {
		return (pNameToPrimaryExpression != null) ? pNameToPrimaryExpression : (pNameToPrimaryExpression = new NameToPrimaryExpressionElements());
	}
	
	public ParserRule getNameToPrimaryExpressionRule() {
		return getNameToPrimaryExpressionAccess().getRule();
	}

	//PrimaryExpressionCompletion:
	//
	//	content+=Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index+;
	public PrimaryExpressionCompletionElements getPrimaryExpressionCompletionAccess() {
		return (pPrimaryExpressionCompletion != null) ? pPrimaryExpressionCompletion : (pPrimaryExpressionCompletion = new PrimaryExpressionCompletionElements());
	}
	
	public ParserRule getPrimaryExpressionCompletionRule() {
		return getPrimaryExpressionCompletionAccess().getRule();
	}

	//Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index:
	//
	//	feature=Feature featureInvocation=FeatureInvocation? |
	//
	//	sequenceOperationOrReductionOrExpansion=SequenceOperationOrReductionOrExpansion | index=Index;
	public Feature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexElements getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexAccess() {
		return (pFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index != null) ? pFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index : (pFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index = new Feature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexElements());
	}
	
	public ParserRule getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexRule() {
		return getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexAccess().getRule();
	}

	/// * LITERAL EXPRESSIONS * / LiteralExpression:
	//
	//	expression=PRIMITIVE_LITERAL;
	public LiteralExpressionElements getLiteralExpressionAccess() {
		return (pLiteralExpression != null) ? pLiteralExpression : (pLiteralExpression = new LiteralExpressionElements());
	}
	
	public ParserRule getLiteralExpressionRule() {
		return getLiteralExpressionAccess().getRule();
	}

	/// * NAME EXPRESSIONS * / NameOrPrimaryExpression: //potentiallyAmbiguousQualifiedName = PotentiallyAmbiguousQualifiedName
	//
	//	potentiallyAmbiguousQualifiedName= / *QualifiedName* / QualifiedNameWithoutBinding
	//
	//	nameToPrimaryExpression=NameToPrimaryExpression?;
	public NameOrPrimaryExpressionElements getNameOrPrimaryExpressionAccess() {
		return (pNameOrPrimaryExpression != null) ? pNameOrPrimaryExpression : (pNameOrPrimaryExpression = new NameOrPrimaryExpressionElements());
	}
	
	public ParserRule getNameOrPrimaryExpressionRule() {
		return getNameOrPrimaryExpressionAccess().getRule();
	}

	/// * THIS EXPRESSIONS * / ThisExpression:
	//
	//	{ThisExpression} "this" tuple=Tuple?;
	public ThisExpressionElements getThisExpressionAccess() {
		return (pThisExpression != null) ? pThisExpression : (pThisExpression = new ThisExpressionElements());
	}
	
	public ParserRule getThisExpressionRule() {
		return getThisExpressionAccess().getRule();
	}

	/// * PARENTHESIZED EXPRESSIONS * / ParenthesizedExpression:
	//
	//	"(" expression=Expression ")";
	public ParenthesizedExpressionElements getParenthesizedExpressionAccess() {
		return (pParenthesizedExpression != null) ? pParenthesizedExpression : (pParenthesizedExpression = new ParenthesizedExpressionElements());
	}
	
	public ParserRule getParenthesizedExpressionRule() {
		return getParenthesizedExpressionAccess().getRule();
	}

	/// * PROPERTY ACCESS EXPRESSIONS * / Feature: //'.' nameBinding = NameBinding
	//
	//	"." name=Name;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	/// * INVOCATION EXPRESSIONS * / Tuple:
	//
	/// * {Tuple}'(' ( namedTupleExpressionList = NamedTupleExpressionList | ( positionalTupleExpressionList = PositionalTupleExpressionList )? ) ')' * /
	//
	//	{Tuple} "(" (namedTupleExpressionList=NamedTupleExpressionList |
	//
	//	positionalTupleExpressionList=PositionalTupleExpressionList)? ")";
	public TupleElements getTupleAccess() {
		return (pTuple != null) ? pTuple : (pTuple = new TupleElements());
	}
	
	public ParserRule getTupleRule() {
		return getTupleAccess().getRule();
	}

	//PositionalTupleExpressionList: //expression = Expression positionalTupleExpressionListCompletion = PositionalTupleExpressionListCompletion
	//
	//	expression+=Expression ("," expression+=Expression)*;
	public PositionalTupleExpressionListElements getPositionalTupleExpressionListAccess() {
		return (pPositionalTupleExpressionList != null) ? pPositionalTupleExpressionList : (pPositionalTupleExpressionList = new PositionalTupleExpressionListElements());
	}
	
	public ParserRule getPositionalTupleExpressionListRule() {
		return getPositionalTupleExpressionListAccess().getRule();
	}

	//PositionalTupleExpressionListCompletion:
	//
	//	{PositionalTupleExpressionListCompletion} ("," expression+=Expression)*;
	public PositionalTupleExpressionListCompletionElements getPositionalTupleExpressionListCompletionAccess() {
		return (pPositionalTupleExpressionListCompletion != null) ? pPositionalTupleExpressionListCompletion : (pPositionalTupleExpressionListCompletion = new PositionalTupleExpressionListCompletionElements());
	}
	
	public ParserRule getPositionalTupleExpressionListCompletionRule() {
		return getPositionalTupleExpressionListCompletionAccess().getRule();
	}

	//NamedTupleExpressionList:
	//
	//	namedExpression+=NamedExpression ("," namedExpression+=NamedExpression)*;
	public NamedTupleExpressionListElements getNamedTupleExpressionListAccess() {
		return (pNamedTupleExpressionList != null) ? pNamedTupleExpressionList : (pNamedTupleExpressionList = new NamedTupleExpressionListElements());
	}
	
	public ParserRule getNamedTupleExpressionListRule() {
		return getNamedTupleExpressionListAccess().getRule();
	}

	//NamedExpression:
	//
	//	=> name=Name "=>" expression=Expression;
	public NamedExpressionElements getNamedExpressionAccess() {
		return (pNamedExpression != null) ? pNamedExpression : (pNamedExpression = new NamedExpressionElements());
	}
	
	public ParserRule getNamedExpressionRule() {
		return getNamedExpressionAccess().getRule();
	}

	//BehaviorInvocation:
	//
	//	tuple=Tuple;
	public BehaviorInvocationElements getBehaviorInvocationAccess() {
		return (pBehaviorInvocation != null) ? pBehaviorInvocation : (pBehaviorInvocation = new BehaviorInvocationElements());
	}
	
	public ParserRule getBehaviorInvocationRule() {
		return getBehaviorInvocationAccess().getRule();
	}

	//FeatureInvocation:
	//
	//	tuple=Tuple;
	public FeatureInvocationElements getFeatureInvocationAccess() {
		return (pFeatureInvocation != null) ? pFeatureInvocation : (pFeatureInvocation = new FeatureInvocationElements());
	}
	
	public ParserRule getFeatureInvocationRule() {
		return getFeatureInvocationAccess().getRule();
	}

	//SuperInvocationExpression:
	//
	//	"super" ("." qualifiedName=QualifiedName)? tuple=Tuple;
	public SuperInvocationExpressionElements getSuperInvocationExpressionAccess() {
		return (pSuperInvocationExpression != null) ? pSuperInvocationExpression : (pSuperInvocationExpression = new SuperInvocationExpressionElements());
	}
	
	public ParserRule getSuperInvocationExpressionRule() {
		return getSuperInvocationExpressionAccess().getRule();
	}

	/// * INSTANCE CREATION EXPRESSIONS * / InstanceCreationOrSequenceConstructionExpression:
	//
	//	"new" qualifiedName=QualifiedName (sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion
	//
	//	| tuple=Tuple);
	public InstanceCreationOrSequenceConstructionExpressionElements getInstanceCreationOrSequenceConstructionExpressionAccess() {
		return (pInstanceCreationOrSequenceConstructionExpression != null) ? pInstanceCreationOrSequenceConstructionExpression : (pInstanceCreationOrSequenceConstructionExpression = new InstanceCreationOrSequenceConstructionExpressionElements());
	}
	
	public ParserRule getInstanceCreationOrSequenceConstructionExpressionRule() {
		return getInstanceCreationOrSequenceConstructionExpressionAccess().getRule();
	}

	/// * LINK OPERATION EXPRESSIONS * / LinkOperationCompletion:
	//
	//	linkOperation=LinkOperation linkOperationTuple=LinkOperationTuple;
	public LinkOperationCompletionElements getLinkOperationCompletionAccess() {
		return (pLinkOperationCompletion != null) ? pLinkOperationCompletion : (pLinkOperationCompletion = new LinkOperationCompletionElements());
	}
	
	public ParserRule getLinkOperationCompletionRule() {
		return getLinkOperationCompletionAccess().getRule();
	}

	//enum LinkOperation:
	//
	//	CREATE_LINK="createLink" | DESTROY_LINK="destroyLink" | CLEAR_ASSOC="clearAssoc";
	public LinkOperationElements getLinkOperationAccess() {
		return (unknownRuleLinkOperation != null) ? unknownRuleLinkOperation : (unknownRuleLinkOperation = new LinkOperationElements());
	}
	
	public EnumRule getLinkOperationRule() {
		return getLinkOperationAccess().getRule();
	}

	//LinkOperationTuple:
	//
	//	{LinkOperationTuple} "(" (=> name=Name (=> index=Index ("=>"
	//
	//	indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion |
	//
	//	primaryToExpressionCompletion=PrimaryToExpressionCompletion
	//
	//	positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion) | "=>"
	//
	//	indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | positionalTupleExpressionListCompletion= // ADDED
	//
	//	PositionalTupleExpressionListCompletion | nameToExpressionCompletion=NameToExpressionCompletion ","
	//
	//	positionalTupleExpressionList= // ADDED
	//
	//	PositionalTupleExpressionList) | positionalTupleExpressionList=PositionalTupleExpressionList)? ")";
	public LinkOperationTupleElements getLinkOperationTupleAccess() {
		return (pLinkOperationTuple != null) ? pLinkOperationTuple : (pLinkOperationTuple = new LinkOperationTupleElements());
	}
	
	public ParserRule getLinkOperationTupleRule() {
		return getLinkOperationTupleAccess().getRule();
	}

	//IndexedNamedExpressionListCompletion:
	//
	//	expression=Expression ("," indexedNamedExpression+=IndexedNamedExpression)*;
	public IndexedNamedExpressionListCompletionElements getIndexedNamedExpressionListCompletionAccess() {
		return (pIndexedNamedExpressionListCompletion != null) ? pIndexedNamedExpressionListCompletion : (pIndexedNamedExpressionListCompletion = new IndexedNamedExpressionListCompletionElements());
	}
	
	public ParserRule getIndexedNamedExpressionListCompletionRule() {
		return getIndexedNamedExpressionListCompletionAccess().getRule();
	}

	//IndexedNamedExpression:
	//
	//	name=Name index=Index? "=>" expression=Expression;
	public IndexedNamedExpressionElements getIndexedNamedExpressionAccess() {
		return (pIndexedNamedExpression != null) ? pIndexedNamedExpression : (pIndexedNamedExpression = new IndexedNamedExpressionElements());
	}
	
	public ParserRule getIndexedNamedExpressionRule() {
		return getIndexedNamedExpressionAccess().getRule();
	}

	///// * CLASS EXTENT EXPRESSIONS * /
	//
	//ClassExtentExpressionCompletion:
	//
	//	{ClassExtentExpressionCompletion} "allInstances" "(" ")";
	public ClassExtentExpressionCompletionElements getClassExtentExpressionCompletionAccess() {
		return (pClassExtentExpressionCompletion != null) ? pClassExtentExpressionCompletion : (pClassExtentExpressionCompletion = new ClassExtentExpressionCompletionElements());
	}
	
	public ParserRule getClassExtentExpressionCompletionRule() {
		return getClassExtentExpressionCompletionAccess().getRule();
	}

	///// * SEQUENCE CONSTRUCTION EXPRESSIONS * /
	//
	//SequenceAnyExpression:
	//
	//	{SequenceAnyExpression} ("any" sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion |
	//
	//	"null");
	public SequenceAnyExpressionElements getSequenceAnyExpressionAccess() {
		return (pSequenceAnyExpression != null) ? pSequenceAnyExpression : (pSequenceAnyExpression = new SequenceAnyExpressionElements());
	}
	
	public ParserRule getSequenceAnyExpressionRule() {
		return getSequenceAnyExpressionAccess().getRule();
	}

	//SequenceConstructionExpressionCompletion:
	//
	//	{SequenceConstructionExpressionCompletion} multiplicityIndicator=MultiplicityIndicator? "{"
	//
	//	sequenceElements=SequenceElements? "}";
	public SequenceConstructionExpressionCompletionElements getSequenceConstructionExpressionCompletionAccess() {
		return (pSequenceConstructionExpressionCompletion != null) ? pSequenceConstructionExpressionCompletion : (pSequenceConstructionExpressionCompletion = new SequenceConstructionExpressionCompletionElements());
	}
	
	public ParserRule getSequenceConstructionExpressionCompletionRule() {
		return getSequenceConstructionExpressionCompletionAccess().getRule();
	}

	//MultiplicityIndicator:
	//
	//	{MultiplicityIndicator} "[" "]";
	public MultiplicityIndicatorElements getMultiplicityIndicatorAccess() {
		return (pMultiplicityIndicator != null) ? pMultiplicityIndicator : (pMultiplicityIndicator = new MultiplicityIndicatorElements());
	}
	
	public ParserRule getMultiplicityIndicatorRule() {
		return getMultiplicityIndicatorAccess().getRule();
	}

	//SequenceElements:
	//
	//	expression1=Expression (".." expression2=Expression | sequenceElementListCompletion=SequenceElementListCompletion) |
	//
	//	sequenceInitializationExpression=SequenceInitializationExpression
	//
	//	sequenceElementListCompletion=SequenceElementListCompletion;
	public SequenceElementsElements getSequenceElementsAccess() {
		return (pSequenceElements != null) ? pSequenceElements : (pSequenceElements = new SequenceElementsElements());
	}
	
	public ParserRule getSequenceElementsRule() {
		return getSequenceElementsAccess().getRule();
	}

	//SequenceElementListCompletion:
	//
	//	{SequenceElementListCompletion} ("," sequenceElement+=SequenceElement)* ","?;
	public SequenceElementListCompletionElements getSequenceElementListCompletionAccess() {
		return (pSequenceElementListCompletion != null) ? pSequenceElementListCompletion : (pSequenceElementListCompletion = new SequenceElementListCompletionElements());
	}
	
	public ParserRule getSequenceElementListCompletionRule() {
		return getSequenceElementListCompletionAccess().getRule();
	}

	//SequenceElement:
	//
	//	expression=Expression | sequenceInitializationExpression=SequenceInitializationExpression;
	public SequenceElementElements getSequenceElementAccess() {
		return (pSequenceElement != null) ? pSequenceElement : (pSequenceElement = new SequenceElementElements());
	}
	
	public ParserRule getSequenceElementRule() {
		return getSequenceElementAccess().getRule();
	}

	//SequenceInitializationExpression:
	//
	//	isNew?="new"? "{" sequenceElements=SequenceElements "}";
	public SequenceInitializationExpressionElements getSequenceInitializationExpressionAccess() {
		return (pSequenceInitializationExpression != null) ? pSequenceInitializationExpression : (pSequenceInitializationExpression = new SequenceInitializationExpressionElements());
	}
	
	public ParserRule getSequenceInitializationExpressionRule() {
		return getSequenceInitializationExpressionAccess().getRule();
	}

	///// * SEQUENCE ACCESS EXPRESSIONS * /
	//
	//Index:
	//
	//	"[" expression=Expression "]";
	public IndexElements getIndexAccess() {
		return (pIndex != null) ? pIndex : (pIndex = new IndexElements());
	}
	
	public ParserRule getIndexRule() {
		return getIndexAccess().getRule();
	}

	///// * SEQUENCE OPERATION, REDUCTION AND EXPANSION EXPRESSIONS * /
	//
	//SequenceOperationOrReductionOrExpansion:
	//
	//	"->" (qualifiedName=QualifiedName tuple=Tuple | isReduce?="reduce" isOrdered?="ordered"? => qualifiedName=
	//
	//	/ *QualifiedName* / QualifiedNameWithoutBinding => templateBinding=TemplateBinding? | id=ID name=Name "("
	//
	//	expression=Expression ")");
	public SequenceOperationOrReductionOrExpansionElements getSequenceOperationOrReductionOrExpansionAccess() {
		return (pSequenceOperationOrReductionOrExpansion != null) ? pSequenceOperationOrReductionOrExpansion : (pSequenceOperationOrReductionOrExpansion = new SequenceOperationOrReductionOrExpansionElements());
	}
	
	public ParserRule getSequenceOperationOrReductionOrExpansionRule() {
		return getSequenceOperationOrReductionOrExpansionAccess().getRule();
	}

	///// * INCREMENT OR DECREMENT EXPRESSIONS * /
	//
	//PostfixExpressionCompletion:
	//
	//	primaryExpressionCompletion=PrimaryExpressionCompletion postfixOperation=PostfixOperation? |
	//
	//	postfixOperation=PostfixOperation;
	public PostfixExpressionCompletionElements getPostfixExpressionCompletionAccess() {
		return (pPostfixExpressionCompletion != null) ? pPostfixExpressionCompletion : (pPostfixExpressionCompletion = new PostfixExpressionCompletionElements());
	}
	
	public ParserRule getPostfixExpressionCompletionRule() {
		return getPostfixExpressionCompletionAccess().getRule();
	}

	//PostfixOperation:
	//
	//	operator=AffixOperator;
	public PostfixOperationElements getPostfixOperationAccess() {
		return (pPostfixOperation != null) ? pPostfixOperation : (pPostfixOperation = new PostfixOperationElements());
	}
	
	public ParserRule getPostfixOperationRule() {
		return getPostfixOperationAccess().getRule();
	}

	//PrefixExpression:
	//
	//	operator=AffixOperator primaryExpression=PrimaryExpression;
	public PrefixExpressionElements getPrefixExpressionAccess() {
		return (pPrefixExpression != null) ? pPrefixExpression : (pPrefixExpression = new PrefixExpressionElements());
	}
	
	public ParserRule getPrefixExpressionRule() {
		return getPrefixExpressionAccess().getRule();
	}

	//enum AffixOperator:
	//
	//	INCR="++" | DECR="--";
	public AffixOperatorElements getAffixOperatorAccess() {
		return (unknownRuleAffixOperator != null) ? unknownRuleAffixOperator : (unknownRuleAffixOperator = new AffixOperatorElements());
	}
	
	public EnumRule getAffixOperatorRule() {
		return getAffixOperatorAccess().getRule();
	}

	///// * UNARY EXPRESSIONS * /
	//
	//UnaryExpression:
	//
	//	PostfixOrCastExpression | NonPostfixNonCastUnaryExpression;
	public UnaryExpressionElements getUnaryExpressionAccess() {
		return (pUnaryExpression != null) ? pUnaryExpression : (pUnaryExpression = new UnaryExpressionElements());
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}

	//PostfixOrCastExpression:
	//
	//	nonNamePostfixOrCastExpression=NonNamePostfixOrCastExpression //(nonNamePostfixOrCastExpression = NonNamePostfixOrCastExpression) | (nameOrPrimaryExpression = NameOrPrimaryExpression postFixExpressionCompletion = PostfixExpressionCompletion)
	//
	//	| nameOrPrimaryExpression=NameOrPrimaryExpression postFixExpressionCompletion=PostfixExpressionCompletion?;
	public PostfixOrCastExpressionElements getPostfixOrCastExpressionAccess() {
		return (pPostfixOrCastExpression != null) ? pPostfixOrCastExpression : (pPostfixOrCastExpression = new PostfixOrCastExpressionElements());
	}
	
	public ParserRule getPostfixOrCastExpressionRule() {
		return getPostfixOrCastExpressionAccess().getRule();
	}

	//NonNameUnaryExpression:
	//
	//	NonNamePostfixOrCastExpression | NonPostfixNonCastUnaryExpression;
	public NonNameUnaryExpressionElements getNonNameUnaryExpressionAccess() {
		return (pNonNameUnaryExpression != null) ? pNonNameUnaryExpression : (pNonNameUnaryExpression = new NonNameUnaryExpressionElements());
	}
	
	public ParserRule getNonNameUnaryExpressionRule() {
		return getNonNameUnaryExpressionAccess().getRule();
	}

	//NonNamePostfixOrCastExpression:
	//
	//	"(" (any?="any" ")" castCompletion=CastCompletion //| (potentiallyAmbiguousQualifiedName = QualifiedNameWithoutBinding ( ')' castCompletion = CastCompletion | nameToExpressionCompletion = NameToExpressionCompletion ')' (postfixExpressionCompletion = PostfixExpressionCompletion)?))
	//
	//	| potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding (")" (=> castCompletion=CastCompletion |
	//
	//	postifixExpressionCompletion=PostfixExpressionCompletion)? | nameToExpressionCompletion=NameToExpressionCompletion
	//
	//	")" postfixExpressionCompletion=PostfixExpressionCompletion?) | nonNameExpression=NonNameExpression ")"
	//
	//	postfixExpressionCompletion=PostfixExpressionCompletion?) | baseExpression=BaseExpression
	//
	//	postfixExpressionCompletion=PostfixExpressionCompletion?;
	public NonNamePostfixOrCastExpressionElements getNonNamePostfixOrCastExpressionAccess() {
		return (pNonNamePostfixOrCastExpression != null) ? pNonNamePostfixOrCastExpression : (pNonNamePostfixOrCastExpression = new NonNamePostfixOrCastExpressionElements());
	}
	
	public ParserRule getNonNamePostfixOrCastExpressionRule() {
		return getNonNamePostfixOrCastExpressionAccess().getRule();
	}

	//NonPostfixNonCastUnaryExpression:
	//
	//	PrefixExpression | NumericUnaryExpression | BooleanNegationExpression | BitStringComplementExpression |
	//
	//	IsolationExpression;
	public NonPostfixNonCastUnaryExpressionElements getNonPostfixNonCastUnaryExpressionAccess() {
		return (pNonPostfixNonCastUnaryExpression != null) ? pNonPostfixNonCastUnaryExpression : (pNonPostfixNonCastUnaryExpression = new NonPostfixNonCastUnaryExpressionElements());
	}
	
	public ParserRule getNonPostfixNonCastUnaryExpressionRule() {
		return getNonPostfixNonCastUnaryExpressionAccess().getRule();
	}

	//BooleanNegationExpression:
	//
	//	"!" unaryExpression=UnaryExpression;
	public BooleanNegationExpressionElements getBooleanNegationExpressionAccess() {
		return (pBooleanNegationExpression != null) ? pBooleanNegationExpression : (pBooleanNegationExpression = new BooleanNegationExpressionElements());
	}
	
	public ParserRule getBooleanNegationExpressionRule() {
		return getBooleanNegationExpressionAccess().getRule();
	}

	//BitStringComplementExpression:
	//
	//	"~" unaryExpression=UnaryExpression;
	public BitStringComplementExpressionElements getBitStringComplementExpressionAccess() {
		return (pBitStringComplementExpression != null) ? pBitStringComplementExpression : (pBitStringComplementExpression = new BitStringComplementExpressionElements());
	}
	
	public ParserRule getBitStringComplementExpressionRule() {
		return getBitStringComplementExpressionAccess().getRule();
	}

	//NumericUnaryExpression:
	//
	//	operator=NumericUnaryOperator unaryExpression=UnaryExpression;
	public NumericUnaryExpressionElements getNumericUnaryExpressionAccess() {
		return (pNumericUnaryExpression != null) ? pNumericUnaryExpression : (pNumericUnaryExpression = new NumericUnaryExpressionElements());
	}
	
	public ParserRule getNumericUnaryExpressionRule() {
		return getNumericUnaryExpressionAccess().getRule();
	}

	//enum NumericUnaryOperator:
	//
	//	PLUS="+" | MINUS="-";
	public NumericUnaryOperatorElements getNumericUnaryOperatorAccess() {
		return (unknownRuleNumericUnaryOperator != null) ? unknownRuleNumericUnaryOperator : (unknownRuleNumericUnaryOperator = new NumericUnaryOperatorElements());
	}
	
	public EnumRule getNumericUnaryOperatorRule() {
		return getNumericUnaryOperatorAccess().getRule();
	}

	//IsolationExpression:
	//
	//	"$" unaryExpression=UnaryExpression;
	public IsolationExpressionElements getIsolationExpressionAccess() {
		return (pIsolationExpression != null) ? pIsolationExpression : (pIsolationExpression = new IsolationExpressionElements());
	}
	
	public ParserRule getIsolationExpressionRule() {
		return getIsolationExpressionAccess().getRule();
	}

	////CastExpression : // This rule is the spec, but not used actually
	//
	////	'(' typeName = TypeName ')' castCompletion = CastCompletion
	//
	////;
	//
	//CastCompletion:
	//
	//	PostfixOrCastExpression | BooleanNegationExpression | BitStringComplementExpression | IsolationExpression;
	public CastCompletionElements getCastCompletionAccess() {
		return (pCastCompletion != null) ? pCastCompletion : (pCastCompletion = new CastCompletionElements());
	}
	
	public ParserRule getCastCompletionRule() {
		return getCastCompletionAccess().getRule();
	}

	///// * ARITHMETIC EXPRESSIONS * /
	//
	//MultiplicativeExpression:
	//
	//	unaryExpression=UnaryExpression multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion;
	public MultiplicativeExpressionElements getMultiplicativeExpressionAccess() {
		return (pMultiplicativeExpression != null) ? pMultiplicativeExpression : (pMultiplicativeExpression = new MultiplicativeExpressionElements());
	}
	
	public ParserRule getMultiplicativeExpressionRule() {
		return getMultiplicativeExpressionAccess().getRule();
	}

	//MultiplicativeExpressionCompletion:
	//
	//	{MultiplicativeExpressionCompletion} (operator+=MultiplicativeOperator unaryExpression+=UnaryExpression)*;
	public MultiplicativeExpressionCompletionElements getMultiplicativeExpressionCompletionAccess() {
		return (pMultiplicativeExpressionCompletion != null) ? pMultiplicativeExpressionCompletion : (pMultiplicativeExpressionCompletion = new MultiplicativeExpressionCompletionElements());
	}
	
	public ParserRule getMultiplicativeExpressionCompletionRule() {
		return getMultiplicativeExpressionCompletionAccess().getRule();
	}

	//enum MultiplicativeOperator:
	//
	//	STAR="*" | SLASH="/" | REM="%";
	public MultiplicativeOperatorElements getMultiplicativeOperatorAccess() {
		return (unknownRuleMultiplicativeOperator != null) ? unknownRuleMultiplicativeOperator : (unknownRuleMultiplicativeOperator = new MultiplicativeOperatorElements());
	}
	
	public EnumRule getMultiplicativeOperatorRule() {
		return getMultiplicativeOperatorAccess().getRule();
	}

	//AdditiveExpression:
	//
	//	unaryExpression=UnaryExpression additiveExpressionCompletion=AdditiveExpressionCompletion;
	public AdditiveExpressionElements getAdditiveExpressionAccess() {
		return (pAdditiveExpression != null) ? pAdditiveExpression : (pAdditiveExpression = new AdditiveExpressionElements());
	}
	
	public ParserRule getAdditiveExpressionRule() {
		return getAdditiveExpressionAccess().getRule();
	}

	//AdditiveExpressionCompletion:
	//
	//	multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion (operator+=AdditiveOperator
	//
	//	multiplicativeExpression+=MultiplicativeExpression)*;
	public AdditiveExpressionCompletionElements getAdditiveExpressionCompletionAccess() {
		return (pAdditiveExpressionCompletion != null) ? pAdditiveExpressionCompletion : (pAdditiveExpressionCompletion = new AdditiveExpressionCompletionElements());
	}
	
	public ParserRule getAdditiveExpressionCompletionRule() {
		return getAdditiveExpressionCompletionAccess().getRule();
	}

	//enum AdditiveOperator:
	//
	//	PLUS="+" | MINUS="-";
	public AdditiveOperatorElements getAdditiveOperatorAccess() {
		return (unknownRuleAdditiveOperator != null) ? unknownRuleAdditiveOperator : (unknownRuleAdditiveOperator = new AdditiveOperatorElements());
	}
	
	public EnumRule getAdditiveOperatorRule() {
		return getAdditiveOperatorAccess().getRule();
	}

	///// * SHIFT EXPRESSIONS * /
	//
	//ShiftExpression:
	//
	//	unaryExpression=UnaryExpression shiftExpressionCompletion=ShiftExpressionCompletion;
	public ShiftExpressionElements getShiftExpressionAccess() {
		return (pShiftExpression != null) ? pShiftExpression : (pShiftExpression = new ShiftExpressionElements());
	}
	
	public ParserRule getShiftExpressionRule() {
		return getShiftExpressionAccess().getRule();
	}

	//ShiftExpressionCompletion:
	//
	//	additiveExpressionCompletion=AdditiveExpressionCompletion (operator+=ShiftOperator
	//
	//	additiveExpression+=AdditiveExpression)*;
	public ShiftExpressionCompletionElements getShiftExpressionCompletionAccess() {
		return (pShiftExpressionCompletion != null) ? pShiftExpressionCompletion : (pShiftExpressionCompletion = new ShiftExpressionCompletionElements());
	}
	
	public ParserRule getShiftExpressionCompletionRule() {
		return getShiftExpressionCompletionAccess().getRule();
	}

	//enum ShiftOperator:
	//
	//	LSHIFT="<<" | RSHIFT=">>" | URSHIFT=">>>";
	public ShiftOperatorElements getShiftOperatorAccess() {
		return (unknownRuleShiftOperator != null) ? unknownRuleShiftOperator : (unknownRuleShiftOperator = new ShiftOperatorElements());
	}
	
	public EnumRule getShiftOperatorRule() {
		return getShiftOperatorAccess().getRule();
	}

	///// * RELATIONAL EXPRESSIONS * /
	//
	//// In the spec, this rule is not explicitly called by any other rules
	//
	//RelationalExpression:
	//
	//	unaryExpression=UnaryExpression relationalExpressionCompletion=RelationalExpressionCompletion;
	public RelationalExpressionElements getRelationalExpressionAccess() {
		return (pRelationalExpression != null) ? pRelationalExpression : (pRelationalExpression = new RelationalExpressionElements());
	}
	
	public ParserRule getRelationalExpressionRule() {
		return getRelationalExpressionAccess().getRule();
	}

	//RelationalExpressionCompletion:
	//
	//	shiftExpressionCompletion=ShiftExpressionCompletion (relationalOperator=RelationalOperator
	//
	//	shiftExpression=ShiftExpression)?;
	public RelationalExpressionCompletionElements getRelationalExpressionCompletionAccess() {
		return (pRelationalExpressionCompletion != null) ? pRelationalExpressionCompletion : (pRelationalExpressionCompletion = new RelationalExpressionCompletionElements());
	}
	
	public ParserRule getRelationalExpressionCompletionRule() {
		return getRelationalExpressionCompletionAccess().getRule();
	}

	//enum RelationalOperator:
	//
	//	LT="<" | GT=">" | LE="<=" | GE=">=";
	public RelationalOperatorElements getRelationalOperatorAccess() {
		return (unknownRuleRelationalOperator != null) ? unknownRuleRelationalOperator : (unknownRuleRelationalOperator = new RelationalOperatorElements());
	}
	
	public EnumRule getRelationalOperatorRule() {
		return getRelationalOperatorAccess().getRule();
	}

	///// * CLASSIFICATION EXPRESSIONS * /
	//
	//ClassificationExpression:
	//
	//	unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion;
	public ClassificationExpressionElements getClassificationExpressionAccess() {
		return (pClassificationExpression != null) ? pClassificationExpression : (pClassificationExpression = new ClassificationExpressionElements());
	}
	
	public ParserRule getClassificationExpressionRule() {
		return getClassificationExpressionAccess().getRule();
	}

	//ClassificationExpressionCompletion:
	//
	//	relationalExpressionCompletion=RelationalExpressionCompletion (operator=ClassificationOperator name=QualifiedName)?;
	public ClassificationExpressionCompletionElements getClassificationExpressionCompletionAccess() {
		return (pClassificationExpressionCompletion != null) ? pClassificationExpressionCompletion : (pClassificationExpressionCompletion = new ClassificationExpressionCompletionElements());
	}
	
	public ParserRule getClassificationExpressionCompletionRule() {
		return getClassificationExpressionCompletionAccess().getRule();
	}

	//enum ClassificationOperator:
	//
	//	INSTANCEOF="instanceof" | HASTYPE="hastype";
	public ClassificationOperatorElements getClassificationOperatorAccess() {
		return (unknownRuleClassificationOperator != null) ? unknownRuleClassificationOperator : (unknownRuleClassificationOperator = new ClassificationOperatorElements());
	}
	
	public EnumRule getClassificationOperatorRule() {
		return getClassificationOperatorAccess().getRule();
	}

	///// * EQUALITY EXPRESSIONS * /
	//
	//EqualityExpression:
	//
	//	unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion;
	public EqualityExpressionElements getEqualityExpressionAccess() {
		return (pEqualityExpression != null) ? pEqualityExpression : (pEqualityExpression = new EqualityExpressionElements());
	}
	
	public ParserRule getEqualityExpressionRule() {
		return getEqualityExpressionAccess().getRule();
	}

	//EqualityExpressionCompletion:
	//
	//	classificationExpressionCompletion=ClassificationExpressionCompletion (operator+=EqualityOperator
	//
	//	classificationExpression+=ClassificationExpression)*;
	public EqualityExpressionCompletionElements getEqualityExpressionCompletionAccess() {
		return (pEqualityExpressionCompletion != null) ? pEqualityExpressionCompletion : (pEqualityExpressionCompletion = new EqualityExpressionCompletionElements());
	}
	
	public ParserRule getEqualityExpressionCompletionRule() {
		return getEqualityExpressionCompletionAccess().getRule();
	}

	//enum EqualityOperator:
	//
	//	EQ="==" | NE="!=";
	public EqualityOperatorElements getEqualityOperatorAccess() {
		return (unknownRuleEqualityOperator != null) ? unknownRuleEqualityOperator : (unknownRuleEqualityOperator = new EqualityOperatorElements());
	}
	
	public EnumRule getEqualityOperatorRule() {
		return getEqualityOperatorAccess().getRule();
	}

	///// * LOGICAL EXPRESSIONS * /
	//
	//AndExpression:
	//
	//	unaryExpression=UnaryExpression andExpressionCompletion=AndExpressionCompletion;
	public AndExpressionElements getAndExpressionAccess() {
		return (pAndExpression != null) ? pAndExpression : (pAndExpression = new AndExpressionElements());
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}

	//AndExpressionCompletion:
	//
	//	equalityExpressionCompletion=EqualityExpressionCompletion ("&" equalityExpression+=EqualityExpression)*;
	public AndExpressionCompletionElements getAndExpressionCompletionAccess() {
		return (pAndExpressionCompletion != null) ? pAndExpressionCompletion : (pAndExpressionCompletion = new AndExpressionCompletionElements());
	}
	
	public ParserRule getAndExpressionCompletionRule() {
		return getAndExpressionCompletionAccess().getRule();
	}

	//ExclusiveOrExpression:
	//
	//	unaryExpression=UnaryExpression exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion;
	public ExclusiveOrExpressionElements getExclusiveOrExpressionAccess() {
		return (pExclusiveOrExpression != null) ? pExclusiveOrExpression : (pExclusiveOrExpression = new ExclusiveOrExpressionElements());
	}
	
	public ParserRule getExclusiveOrExpressionRule() {
		return getExclusiveOrExpressionAccess().getRule();
	}

	//ExclusiveOrExpressionCompletion:
	//
	//	andExpressionCompletion=AndExpressionCompletion ("^" andExpression+=AndExpression)*;
	public ExclusiveOrExpressionCompletionElements getExclusiveOrExpressionCompletionAccess() {
		return (pExclusiveOrExpressionCompletion != null) ? pExclusiveOrExpressionCompletion : (pExclusiveOrExpressionCompletion = new ExclusiveOrExpressionCompletionElements());
	}
	
	public ParserRule getExclusiveOrExpressionCompletionRule() {
		return getExclusiveOrExpressionCompletionAccess().getRule();
	}

	//InclusiveOrExpression:
	//
	//	unaryExpression=UnaryExpression inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion;
	public InclusiveOrExpressionElements getInclusiveOrExpressionAccess() {
		return (pInclusiveOrExpression != null) ? pInclusiveOrExpression : (pInclusiveOrExpression = new InclusiveOrExpressionElements());
	}
	
	public ParserRule getInclusiveOrExpressionRule() {
		return getInclusiveOrExpressionAccess().getRule();
	}

	//InclusiveOrExpressionCompletion:
	//
	//	exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion ("|" exclusiveOrExpression+=ExclusiveOrExpression)*;
	public InclusiveOrExpressionCompletionElements getInclusiveOrExpressionCompletionAccess() {
		return (pInclusiveOrExpressionCompletion != null) ? pInclusiveOrExpressionCompletion : (pInclusiveOrExpressionCompletion = new InclusiveOrExpressionCompletionElements());
	}
	
	public ParserRule getInclusiveOrExpressionCompletionRule() {
		return getInclusiveOrExpressionCompletionAccess().getRule();
	}

	///// * CONDITIONAL LOGICAL EXPRESSIONS * /
	//
	//ConditionalAndExpression:
	//
	//	unaryExpression=UnaryExpression conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion;
	public ConditionalAndExpressionElements getConditionalAndExpressionAccess() {
		return (pConditionalAndExpression != null) ? pConditionalAndExpression : (pConditionalAndExpression = new ConditionalAndExpressionElements());
	}
	
	public ParserRule getConditionalAndExpressionRule() {
		return getConditionalAndExpressionAccess().getRule();
	}

	//ConditionalAndExpressionCompletion:
	//
	//	inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion ("&&" inclusiveOrExpression+=InclusiveOrExpression)*;
	public ConditionalAndExpressionCompletionElements getConditionalAndExpressionCompletionAccess() {
		return (pConditionalAndExpressionCompletion != null) ? pConditionalAndExpressionCompletion : (pConditionalAndExpressionCompletion = new ConditionalAndExpressionCompletionElements());
	}
	
	public ParserRule getConditionalAndExpressionCompletionRule() {
		return getConditionalAndExpressionCompletionAccess().getRule();
	}

	//// In the spec, this rule is not explicitly called by any other rule
	//
	//ConditionalOrExpression:
	//
	//	unaryExpression=UnaryExpression conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion;
	public ConditionalOrExpressionElements getConditionalOrExpressionAccess() {
		return (pConditionalOrExpression != null) ? pConditionalOrExpression : (pConditionalOrExpression = new ConditionalOrExpressionElements());
	}
	
	public ParserRule getConditionalOrExpressionRule() {
		return getConditionalOrExpressionAccess().getRule();
	}

	//ConditionalOrExpressionCompletion:
	//
	//	conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion ("||"
	//
	//	conditionalAndExpression+=ConditionalAndExpression)*;
	public ConditionalOrExpressionCompletionElements getConditionalOrExpressionCompletionAccess() {
		return (pConditionalOrExpressionCompletion != null) ? pConditionalOrExpressionCompletion : (pConditionalOrExpressionCompletion = new ConditionalOrExpressionCompletionElements());
	}
	
	public ParserRule getConditionalOrExpressionCompletionRule() {
		return getConditionalOrExpressionCompletionAccess().getRule();
	}

	///// * CONDITIONAL-TEST EXPRESSIONS * /
	//
	//ConditionalExpression:
	//
	//	unaryExpression=UnaryExpression conditionalExpressionCompletion=ConditionalExpressionCompletion;
	public ConditionalExpressionElements getConditionalExpressionAccess() {
		return (pConditionalExpression != null) ? pConditionalExpression : (pConditionalExpression = new ConditionalExpressionElements());
	}
	
	public ParserRule getConditionalExpressionRule() {
		return getConditionalExpressionAccess().getRule();
	}

	//ConditionalExpressionCompletion:
	//
	//	conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion ("?" expression=Expression ":"
	//
	//	conditionalExpression=ConditionalExpression)?;
	public ConditionalExpressionCompletionElements getConditionalExpressionCompletionAccess() {
		return (pConditionalExpressionCompletion != null) ? pConditionalExpressionCompletion : (pConditionalExpressionCompletion = new ConditionalExpressionCompletionElements());
	}
	
	public ParserRule getConditionalExpressionCompletionRule() {
		return getConditionalExpressionCompletionAccess().getRule();
	}

	///// * ASSIGNMENT EXPRESSIONS * /
	//
	//AssignmentExpressionCompletion:
	//
	//	operator=AssignmentOperator expression=Expression;
	public AssignmentExpressionCompletionElements getAssignmentExpressionCompletionAccess() {
		return (pAssignmentExpressionCompletion != null) ? pAssignmentExpressionCompletion : (pAssignmentExpressionCompletion = new AssignmentExpressionCompletionElements());
	}
	
	public ParserRule getAssignmentExpressionCompletionRule() {
		return getAssignmentExpressionCompletionAccess().getRule();
	}

	//enum AssignmentOperator:
	//
	//	ASSIGN="=" | PLUSASSIGN="+=" | MINUSASSIGN="-=" | STARASSIGN="*=" | SLASHASSIGN="/=" | REMASSIGN="%=" |
	//
	//	ANSASSIGN="&=" | ORASSIGN="|=" | XORASSIGN="^=" | LSHIFTASSIGN="<<=" | RSHIFTASSIGN=">>=" | URSHIFTASSIGN=">>>=";
	public AssignmentOperatorElements getAssignmentOperatorAccess() {
		return (unknownRuleAssignmentOperator != null) ? unknownRuleAssignmentOperator : (unknownRuleAssignmentOperator = new AssignmentOperatorElements());
	}
	
	public EnumRule getAssignmentOperatorRule() {
		return getAssignmentOperatorAccess().getRule();
	}

	///// **************
	//
	//// * STATEMENTS *
	//
	//// ************** /
	//
	//StatementSequence:
	//
	//	{StatementSequence} documentStatement+=DocumentedStatement*;
	public StatementSequenceElements getStatementSequenceAccess() {
		return (pStatementSequence != null) ? pStatementSequence : (pStatementSequence = new StatementSequenceElements());
	}
	
	public ParserRule getStatementSequenceRule() {
		return getStatementSequenceAccess().getRule();
	}

	//DocumentedStatement:
	//
	//	comment=ML_COMMENT? / *DOCUMENTATION_COMMENT* / statement=Statement;
	public DocumentedStatementElements getDocumentedStatementAccess() {
		return (pDocumentedStatement != null) ? pDocumentedStatement : (pDocumentedStatement = new DocumentedStatementElements());
	}
	
	public ParserRule getDocumentedStatementRule() {
		return getDocumentedStatementAccess().getRule();
	}

	//Statement:
	//
	//	AnnotatedStatement | InLineStatement | BlockStatement | EmptyStatement | LocalNameDeclarationOrExpressionStatement |
	//
	//	LocalNameDeclarationStatement | IfStatement | SwitchStatement | WhileStatement | ForStatement | DoStatement |
	//
	//	BreakStatement | ReturnStatement | AcceptStatement | ClassifyStatement;
	public StatementElements getStatementAccess() {
		return (pStatement != null) ? pStatement : (pStatement = new StatementElements());
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}

	///// * BLOCK * /
	//
	//Block:
	//
	//	"{" statementSequence=StatementSequence "}";
	public BlockElements getBlockAccess() {
		return (pBlock != null) ? pBlock : (pBlock = new BlockElements());
	}
	
	public ParserRule getBlockRule() {
		return getBlockAccess().getRule();
	}

	///// * ANNOTATED STATEMENTS * /
	//
	//AnnotatedStatement:
	//
	//	"//@" annotations=Annotations / * <EOL> * / "\n" statement=Statement;
	public AnnotatedStatementElements getAnnotatedStatementAccess() {
		return (pAnnotatedStatement != null) ? pAnnotatedStatement : (pAnnotatedStatement = new AnnotatedStatementElements());
	}
	
	public ParserRule getAnnotatedStatementRule() {
		return getAnnotatedStatementAccess().getRule();
	}

	//Annotations:
	//
	//	annotation+=Annotation ("@" annotation+=Annotation)*;
	public AnnotationsElements getAnnotationsAccess() {
		return (pAnnotations != null) ? pAnnotations : (pAnnotations = new AnnotationsElements());
	}
	
	public ParserRule getAnnotationsRule() {
		return getAnnotationsAccess().getRule();
	}

	//Annotation:
	//
	//	id=ID ("(" nameList=NameList ")")?;
	public AnnotationElements getAnnotationAccess() {
		return (pAnnotation != null) ? pAnnotation : (pAnnotation = new AnnotationElements());
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//NameList:
	//
	//	name+=Name ("," name+=Name)*;
	public NameListElements getNameListAccess() {
		return (pNameList != null) ? pNameList : (pNameList = new NameListElements());
	}
	
	public ParserRule getNameListRule() {
		return getNameListAccess().getRule();
	}

	///// * IN-LINE STATEMENTS * /
	//
	////<DOCUMENTATION_COMMENT>
	//
	//InLineStatement:
	//
	//	"/ *@" id=ID "(" name=Name ")";
	public InLineStatementElements getInLineStatementAccess() {
		return (pInLineStatement != null) ? pInLineStatement : (pInLineStatement = new InLineStatementElements());
	}
	
	public ParserRule getInLineStatementRule() {
		return getInLineStatementAccess().getRule();
	}

	///// * BLOCK STATEMENTS * /
	//
	//BlockStatement:
	//
	//	block=Block;
	public BlockStatementElements getBlockStatementAccess() {
		return (pBlockStatement != null) ? pBlockStatement : (pBlockStatement = new BlockStatementElements());
	}
	
	public ParserRule getBlockStatementRule() {
		return getBlockStatementAccess().getRule();
	}

	///// * EMPTY STATEMENTS * /
	//
	//EmptyStatement:
	//
	//	{EmptyStatement} ";";
	public EmptyStatementElements getEmptyStatementAccess() {
		return (pEmptyStatement != null) ? pEmptyStatement : (pEmptyStatement = new EmptyStatementElements());
	}
	
	public ParserRule getEmptyStatementRule() {
		return getEmptyStatementAccess().getRule();
	}

	///// * LOCAL NAME DECLARATION AND EXPRESSION STATEMENTS * /
	//
	//LocalNameDeclarationOrExpressionStatement:
	//
	//	potentiallyAmbiguousName=QualifiedName (multiplicaityIndicator=MultiplicityIndicator? name=Name
	//
	//	localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion //| (localNameDeclarationCompletion = LocalNameDeclarationStatementCompletion) // ADDED
	//
	//	| nameToExpressionCompletion= / *NameToExpressionCompletionInLocalNameDeclaration* / NameToExpressionCompletion ";") //potentiallyAmbiguousName = PotentiallyAmbiguousQualifiedName
	//
	//	| nonNameExpression=NonNameExpression ";";
	public LocalNameDeclarationOrExpressionStatementElements getLocalNameDeclarationOrExpressionStatementAccess() {
		return (pLocalNameDeclarationOrExpressionStatement != null) ? pLocalNameDeclarationOrExpressionStatement : (pLocalNameDeclarationOrExpressionStatement = new LocalNameDeclarationOrExpressionStatementElements());
	}
	
	public ParserRule getLocalNameDeclarationOrExpressionStatementRule() {
		return getLocalNameDeclarationOrExpressionStatementAccess().getRule();
	}

	//LocalNameDeclarationStatement:
	//
	//	"let" name=Name ":" typeName=TypeName multiplicityIndicator=MultiplicityIndicator?
	//
	//	localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion;
	public LocalNameDeclarationStatementElements getLocalNameDeclarationStatementAccess() {
		return (pLocalNameDeclarationStatement != null) ? pLocalNameDeclarationStatement : (pLocalNameDeclarationStatement = new LocalNameDeclarationStatementElements());
	}
	
	public ParserRule getLocalNameDeclarationStatementRule() {
		return getLocalNameDeclarationStatementAccess().getRule();
	}

	//LocalNameDeclarationStatementCompletion:
	//
	//	"=" initializationExpression=InitializationExpression ";";
	public LocalNameDeclarationStatementCompletionElements getLocalNameDeclarationStatementCompletionAccess() {
		return (pLocalNameDeclarationStatementCompletion != null) ? pLocalNameDeclarationStatementCompletion : (pLocalNameDeclarationStatementCompletion = new LocalNameDeclarationStatementCompletionElements());
	}
	
	public ParserRule getLocalNameDeclarationStatementCompletionRule() {
		return getLocalNameDeclarationStatementCompletionAccess().getRule();
	}

	//InitializationExpression:
	//
	//	Expression | SequenceInitializationExpression | InstanceInitializationExpression;
	public InitializationExpressionElements getInitializationExpressionAccess() {
		return (pInitializationExpression != null) ? pInitializationExpression : (pInitializationExpression = new InitializationExpressionElements());
	}
	
	public ParserRule getInitializationExpressionRule() {
		return getInitializationExpressionAccess().getRule();
	}

	//InstanceInitializationExpression:
	//
	//	"new" tuple=Tuple;
	public InstanceInitializationExpressionElements getInstanceInitializationExpressionAccess() {
		return (pInstanceInitializationExpression != null) ? pInstanceInitializationExpression : (pInstanceInitializationExpression = new InstanceInitializationExpressionElements());
	}
	
	public ParserRule getInstanceInitializationExpressionRule() {
		return getInstanceInitializationExpressionAccess().getRule();
	}

	/// * IF STATEMENTS * / IfStatement:
	//
	//	"if" sequentialClauses=SequentialClauses finalClause=FinalClause?;
	public IfStatementElements getIfStatementAccess() {
		return (pIfStatement != null) ? pIfStatement : (pIfStatement = new IfStatementElements());
	}
	
	public ParserRule getIfStatementRule() {
		return getIfStatementAccess().getRule();
	}

	//SequentialClauses:
	//
	//	concurrentClauses+=ConcurrentClauses ("else" "if" concurrentClauses+=ConcurrentClauses)*;
	public SequentialClausesElements getSequentialClausesAccess() {
		return (pSequentialClauses != null) ? pSequentialClauses : (pSequentialClauses = new SequentialClausesElements());
	}
	
	public ParserRule getSequentialClausesRule() {
		return getSequentialClausesAccess().getRule();
	}

	//ConcurrentClauses:
	//
	//	nonFinalClause+=NonFinalClause ("or" "if" nonFinalClause+=NonFinalClause)*;
	public ConcurrentClausesElements getConcurrentClausesAccess() {
		return (pConcurrentClauses != null) ? pConcurrentClauses : (pConcurrentClauses = new ConcurrentClausesElements());
	}
	
	public ParserRule getConcurrentClausesRule() {
		return getConcurrentClausesAccess().getRule();
	}

	//NonFinalClause:
	//
	//	"(" expression=Expression ")" block=Block;
	public NonFinalClauseElements getNonFinalClauseAccess() {
		return (pNonFinalClause != null) ? pNonFinalClause : (pNonFinalClause = new NonFinalClauseElements());
	}
	
	public ParserRule getNonFinalClauseRule() {
		return getNonFinalClauseAccess().getRule();
	}

	//FinalClause:
	//
	//	"else" block=Block;
	public FinalClauseElements getFinalClauseAccess() {
		return (pFinalClause != null) ? pFinalClause : (pFinalClause = new FinalClauseElements());
	}
	
	public ParserRule getFinalClauseRule() {
		return getFinalClauseAccess().getRule();
	}

	///// * SWITCH STATEMENTS * /
	//
	//SwitchStatement:
	//
	//	"switch" "(" expression=Expression ")" "{" switchClause+=SwitchClause* defaultClause=SwitchDefaultClause? "}";
	public SwitchStatementElements getSwitchStatementAccess() {
		return (pSwitchStatement != null) ? pSwitchStatement : (pSwitchStatement = new SwitchStatementElements());
	}
	
	public ParserRule getSwitchStatementRule() {
		return getSwitchStatementAccess().getRule();
	}

	//SwitchClause:
	//
	//	switchCase+=SwitchCase switchCase+=SwitchCase* statementSequence=NonEmptyStatementSequence;
	public SwitchClauseElements getSwitchClauseAccess() {
		return (pSwitchClause != null) ? pSwitchClause : (pSwitchClause = new SwitchClauseElements());
	}
	
	public ParserRule getSwitchClauseRule() {
		return getSwitchClauseAccess().getRule();
	}

	//SwitchCase:
	//
	//	"case" expression=Expression ":";
	public SwitchCaseElements getSwitchCaseAccess() {
		return (pSwitchCase != null) ? pSwitchCase : (pSwitchCase = new SwitchCaseElements());
	}
	
	public ParserRule getSwitchCaseRule() {
		return getSwitchCaseAccess().getRule();
	}

	//SwitchDefaultClause:
	//
	//	"default" ":" statementSequence=NonEmptyStatementSequence;
	public SwitchDefaultClauseElements getSwitchDefaultClauseAccess() {
		return (pSwitchDefaultClause != null) ? pSwitchDefaultClause : (pSwitchDefaultClause = new SwitchDefaultClauseElements());
	}
	
	public ParserRule getSwitchDefaultClauseRule() {
		return getSwitchDefaultClauseAccess().getRule();
	}

	//NonEmptyStatementSequence:
	//
	//	statement+=DocumentedStatement+;
	public NonEmptyStatementSequenceElements getNonEmptyStatementSequenceAccess() {
		return (pNonEmptyStatementSequence != null) ? pNonEmptyStatementSequence : (pNonEmptyStatementSequence = new NonEmptyStatementSequenceElements());
	}
	
	public ParserRule getNonEmptyStatementSequenceRule() {
		return getNonEmptyStatementSequenceAccess().getRule();
	}

	///// * WHILE STATEMENTS * /
	//
	//WhileStatement:
	//
	//	"while" "(" expression=Expression ")" block=Block;
	public WhileStatementElements getWhileStatementAccess() {
		return (pWhileStatement != null) ? pWhileStatement : (pWhileStatement = new WhileStatementElements());
	}
	
	public ParserRule getWhileStatementRule() {
		return getWhileStatementAccess().getRule();
	}

	///// * DO STATEMENTS * /
	//
	//DoStatement:
	//
	//	"do" block=Block "while" "(" expression=Expression ")" ";";
	public DoStatementElements getDoStatementAccess() {
		return (pDoStatement != null) ? pDoStatement : (pDoStatement = new DoStatementElements());
	}
	
	public ParserRule getDoStatementRule() {
		return getDoStatementAccess().getRule();
	}

	///// * FOR STATEMENTS * /
	//
	//ForStatement:
	//
	//	"for" "(" forControl=ForControl ")" block=Block;
	public ForStatementElements getForStatementAccess() {
		return (pForStatement != null) ? pForStatement : (pForStatement = new ForStatementElements());
	}
	
	public ParserRule getForStatementRule() {
		return getForStatementAccess().getRule();
	}

	//ForControl:
	//
	//	loopVariableDefinition+=LoopVariableDefinition ("," loopVariableDefinition+=LoopVariableDefinition)*;
	public ForControlElements getForControlAccess() {
		return (pForControl != null) ? pForControl : (pForControl = new ForControlElements());
	}
	
	public ParserRule getForControlRule() {
		return getForControlAccess().getRule();
	}

	//LoopVariableDefinition:
	//
	//	name=Name "in" expression1=Expression (".." expression2=Expression)? | typeName=QualifiedName name=Name ":"
	//
	//	expression3=Expression;
	public LoopVariableDefinitionElements getLoopVariableDefinitionAccess() {
		return (pLoopVariableDefinition != null) ? pLoopVariableDefinition : (pLoopVariableDefinition = new LoopVariableDefinitionElements());
	}
	
	public ParserRule getLoopVariableDefinitionRule() {
		return getLoopVariableDefinitionAccess().getRule();
	}

	///// * BREAK STATEMENTS * /
	//
	//BreakStatement:
	//
	//	{BreakStatement} "break" ";";
	public BreakStatementElements getBreakStatementAccess() {
		return (pBreakStatement != null) ? pBreakStatement : (pBreakStatement = new BreakStatementElements());
	}
	
	public ParserRule getBreakStatementRule() {
		return getBreakStatementAccess().getRule();
	}

	///// * RETURN STATEMENTS * /
	//
	//ReturnStatement:
	//
	//	{ReturnStatement} "return" expression=Expression? ";";
	public ReturnStatementElements getReturnStatementAccess() {
		return (pReturnStatement != null) ? pReturnStatement : (pReturnStatement = new ReturnStatementElements());
	}
	
	public ParserRule getReturnStatementRule() {
		return getReturnStatementAccess().getRule();
	}

	///// * ACCEPT STATEMENTS * /
	//
	//AcceptStatement:
	//
	//	acceptClause=AcceptClause (simpleCompletion=SimpleAcceptStatementCompletion |
	//
	//	compoundCompletion=CompoundAcceptStatementCompletion);
	public AcceptStatementElements getAcceptStatementAccess() {
		return (pAcceptStatement != null) ? pAcceptStatement : (pAcceptStatement = new AcceptStatementElements());
	}
	
	public ParserRule getAcceptStatementRule() {
		return getAcceptStatementAccess().getRule();
	}

	//SimpleAcceptStatementCompletion:
	//
	//	{SimpleAcceptStatementCompletion} ";";
	public SimpleAcceptStatementCompletionElements getSimpleAcceptStatementCompletionAccess() {
		return (pSimpleAcceptStatementCompletion != null) ? pSimpleAcceptStatementCompletion : (pSimpleAcceptStatementCompletion = new SimpleAcceptStatementCompletionElements());
	}
	
	public ParserRule getSimpleAcceptStatementCompletionRule() {
		return getSimpleAcceptStatementCompletionAccess().getRule();
	}

	//CompoundAcceptStatementCompletion:
	//
	//	block=Block ("or" acceptBlock+=AcceptBlock)*;
	public CompoundAcceptStatementCompletionElements getCompoundAcceptStatementCompletionAccess() {
		return (pCompoundAcceptStatementCompletion != null) ? pCompoundAcceptStatementCompletion : (pCompoundAcceptStatementCompletion = new CompoundAcceptStatementCompletionElements());
	}
	
	public ParserRule getCompoundAcceptStatementCompletionRule() {
		return getCompoundAcceptStatementCompletionAccess().getRule();
	}

	//AcceptBlock:
	//
	//	acceptClause=AcceptClause block=Block;
	public AcceptBlockElements getAcceptBlockAccess() {
		return (pAcceptBlock != null) ? pAcceptBlock : (pAcceptBlock = new AcceptBlockElements());
	}
	
	public ParserRule getAcceptBlockRule() {
		return getAcceptBlockAccess().getRule();
	}

	//AcceptClause:
	//
	//	"accept" "(" (name=Name ":")? qualifiedNameList=QualifiedNameList ")";
	public AcceptClauseElements getAcceptClauseAccess() {
		return (pAcceptClause != null) ? pAcceptClause : (pAcceptClause = new AcceptClauseElements());
	}
	
	public ParserRule getAcceptClauseRule() {
		return getAcceptClauseAccess().getRule();
	}

	/// * CLASSIFY STATEMENTS * / ClassifyStatement:
	//
	//	"classify" expression=Expression classificationClause=ClassificationClause ";";
	public ClassifyStatementElements getClassifyStatementAccess() {
		return (pClassifyStatement != null) ? pClassifyStatement : (pClassifyStatement = new ClassifyStatementElements());
	}
	
	public ParserRule getClassifyStatementRule() {
		return getClassifyStatementAccess().getRule();
	}

	//ClassificationClause:
	//
	//	classificationFromClause=ClassificationFromClause classificationToClause=ClassificationToClause? |
	//
	//	reclassifyAllClause=ReclassifyAllClause? classificationToClause=ClassificationToClause;
	public ClassificationClauseElements getClassificationClauseAccess() {
		return (pClassificationClause != null) ? pClassificationClause : (pClassificationClause = new ClassificationClauseElements());
	}
	
	public ParserRule getClassificationClauseRule() {
		return getClassificationClauseAccess().getRule();
	}

	//ClassificationFromClause:
	//
	//	"from" qualifiedNameList=QualifiedNameList;
	public ClassificationFromClauseElements getClassificationFromClauseAccess() {
		return (pClassificationFromClause != null) ? pClassificationFromClause : (pClassificationFromClause = new ClassificationFromClauseElements());
	}
	
	public ParserRule getClassificationFromClauseRule() {
		return getClassificationFromClauseAccess().getRule();
	}

	//ClassificationToClause:
	//
	//	"to" qualifiedNameList=QualifiedNameList;
	public ClassificationToClauseElements getClassificationToClauseAccess() {
		return (pClassificationToClause != null) ? pClassificationToClause : (pClassificationToClause = new ClassificationToClauseElements());
	}
	
	public ParserRule getClassificationToClauseRule() {
		return getClassificationToClauseAccess().getRule();
	}

	//ReclassifyAllClause:
	//
	//	{ReclassifyAllClause} "from" "*";
	public ReclassifyAllClauseElements getReclassifyAllClauseAccess() {
		return (pReclassifyAllClause != null) ? pReclassifyAllClause : (pReclassifyAllClause = new ReclassifyAllClauseElements());
	}
	
	public ParserRule getReclassifyAllClauseRule() {
		return getReclassifyAllClauseAccess().getRule();
	}

	//QualifiedNameList:
	//
	//	qualifiedName+=QualifiedName ("," qualifiedName+=QualifiedName)*;
	public QualifiedNameListElements getQualifiedNameListAccess() {
		return (pQualifiedNameList != null) ? pQualifiedNameList : (pQualifiedNameList = new QualifiedNameListElements());
	}
	
	public ParserRule getQualifiedNameListRule() {
		return getQualifiedNameListAccess().getRule();
	}

	/// ****************
	//
	// * Terminals
	//
	// ***************** / terminal BOOLEAN_VALUE:
	//
	//	"true" | "false";
	public TerminalRule getBOOLEAN_VALUERule() {
		return (tBOOLEAN_VALUE != null) ? tBOOLEAN_VALUE : (tBOOLEAN_VALUE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BOOLEAN_VALUE"));
	} 

	//terminal INTEGER_VALUE:
	//
	//	("0" | "1".."9" ("_"? "0".."9")*) //DECIMAL 
	//
	//	// BINARY
	//
	//	// HEX
	//
	//	// OCT
	//
	//	| ("0b" | "0B") "0".."1" ("_"? "0".."1")* | ("0x" | "0X") ("0".."9" | "a".."f" | "A".."F") ("_"? ("0".."9" | "a".."f" |
	//
	//	"A".."F"))* | "0" "_"? "0".."7" ("_"? "0".."7")*;
	public TerminalRule getINTEGER_VALUERule() {
		return (tINTEGER_VALUE != null) ? tINTEGER_VALUE : (tINTEGER_VALUE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER_VALUE"));
	} 

	//terminal ID:
	//
	//	("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")* | "\'"->"\'";
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	} 

	////terminal DOCUMENTATION_COMMENT : '/ **' -> '* /' ;
	//
	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
