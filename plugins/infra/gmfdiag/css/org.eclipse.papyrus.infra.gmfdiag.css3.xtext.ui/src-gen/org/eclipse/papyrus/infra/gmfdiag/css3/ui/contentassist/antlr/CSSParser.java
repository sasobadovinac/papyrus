/*
 * generated by Xtext
 */
package org.eclipse.papyrus.infra.gmfdiag.css3.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.papyrus.infra.gmfdiag.css3.services.CSSGrammarAccess;

public class CSSParser extends AbstractContentAssistParser {

	@Inject
	private CSSGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected org.eclipse.papyrus.infra.gmfdiag.css3.ui.contentassist.antlr.internal.InternalCSSParser createParser() {
		org.eclipse.papyrus.infra.gmfdiag.css3.ui.contentassist.antlr.internal.InternalCSSParser result = new org.eclipse.papyrus.infra.gmfdiag.css3.ui.contentassist.antlr.internal.InternalCSSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStylesheetAccess().getAlternatives_2(), "rule__Stylesheet__Alternatives_2");
					put(grammarAccess.getCharsetAccess().getAlternatives_0(), "rule__Charset__Alternatives_0");
					put(grammarAccess.getImportExpressionAccess().getAlternatives_0(), "rule__ImportExpression__Alternatives_0");
					put(grammarAccess.getImportExpressionAccess().getAlternatives_1(), "rule__ImportExpression__Alternatives_1");
					put(grammarAccess.getPageAccess().getAlternatives_1(), "rule__Page__Alternatives_1");
					put(grammarAccess.getMediaAccess().getAlternatives_0(), "rule__Media__Alternatives_0");
					put(grammarAccess.getFont_faceAccess().getAlternatives_1(), "rule__Font_face__Alternatives_1");
					put(grammarAccess.getKeyframesAccess().getAlternatives_1(), "rule__Keyframes__Alternatives_1");
					put(grammarAccess.getKeyframe_selectorAccess().getAlternatives_0(), "rule__Keyframe_selector__Alternatives_0");
					put(grammarAccess.getSelectorAccess().getAlternatives_1(), "rule__Selector__Alternatives_1");
					put(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives(), "rule__SimpleSelectorForNegation__Alternatives");
					put(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives_0_0(), "rule__SimpleSelectorForNegation__Alternatives_0_0");
					put(grammarAccess.getSubSelectorForNegationAccess().getAlternatives(), "rule__SubSelectorForNegation__Alternatives");
					put(grammarAccess.getSimple_selectorAccess().getAlternatives(), "rule__Simple_selector__Alternatives");
					put(grammarAccess.getSimple_selectorAccess().getAlternatives_0_0(), "rule__Simple_selector__Alternatives_0_0");
					put(grammarAccess.getSubSelectorAccess().getAlternatives(), "rule__SubSelector__Alternatives");
					put(grammarAccess.getAttributeSelectorAccess().getOpAlternatives_3_0_0(), "rule__AttributeSelector__OpAlternatives_3_0_0");
					put(grammarAccess.getAttributeSelectorAccess().getValueAlternatives_3_1_0(), "rule__AttributeSelector__ValueAlternatives_3_1_0");
					put(grammarAccess.getCss_namespace_prefixAccess().getAlternatives_0(), "rule__Css_namespace_prefix__Alternatives_0");
					put(grammarAccess.getPseudoClassOrFuncAccess().getAlternatives(), "rule__PseudoClassOrFunc__Alternatives");
					put(grammarAccess.getPseudoClassFunctionAccess().getAlternatives(), "rule__PseudoClassFunction__Alternatives");
					put(grammarAccess.getCombinatorAccess().getAlternatives(), "rule__Combinator__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getUnary_operatorAccess().getAlternatives(), "rule__Unary_operator__Alternatives");
					put(grammarAccess.getSymbolTokAccess().getSymbolAlternatives_1_0(), "rule__SymbolTok__SymbolAlternatives_1_0");
					put(grammarAccess.getCssTokAccess().getAlternatives(), "rule__CssTok__Alternatives");
					put(grammarAccess.getValidURLSymbolAccess().getAlternatives(), "rule__ValidURLSymbol__Alternatives");
					put(grammarAccess.getKeywordHackAccess().getAlternatives(), "rule__KeywordHack__Alternatives");
					put(grammarAccess.getValidURLAccess().getAlternatives(), "rule__ValidURL__Alternatives");
					put(grammarAccess.getValidURLAccess().getAlternatives_1(), "rule__ValidURL__Alternatives_1");
					put(grammarAccess.getValidURLAccess().getAlternatives_1_10_1(), "rule__ValidURL__Alternatives_1_10_1");
					put(grammarAccess.getValidURLAccess().getAlternatives_1_10_2(), "rule__ValidURL__Alternatives_1_10_2");
					put(grammarAccess.getIdentifierAccess().getAlternatives_1(), "rule__Identifier__Alternatives_1");
					put(grammarAccess.getIdentifierAccess().getAlternatives_2_0(), "rule__Identifier__Alternatives_2_0");
					put(grammarAccess.getNumAccess().getAlternatives_0(), "rule__Num__Alternatives_0");
					put(grammarAccess.getNumAccess().getAlternatives_1(), "rule__Num__Alternatives_1");
					put(grammarAccess.getNumIntAccess().getAlternatives_0(), "rule__NumInt__Alternatives_0");
					put(grammarAccess.getHexAccess().getAlternatives_1_0(), "rule__Hex__Alternatives_1_0");
					put(grammarAccess.getStylesheetAccess().getGroup(), "rule__Stylesheet__Group__0");
					put(grammarAccess.getCharsetAccess().getGroup(), "rule__Charset__Group__0");
					put(grammarAccess.getImportExpressionAccess().getGroup(), "rule__ImportExpression__Group__0");
					put(grammarAccess.getImportExpressionAccess().getGroup_1_1(), "rule__ImportExpression__Group_1_1__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getPageAccess().getGroup_5(), "rule__Page__Group_5__0");
					put(grammarAccess.getPseudo_pageAccess().getGroup(), "rule__Pseudo_page__Group__0");
					put(grammarAccess.getMediaAccess().getGroup(), "rule__Media__Group__0");
					put(grammarAccess.getMedia_listAccess().getGroup(), "rule__Media_list__Group__0");
					put(grammarAccess.getMedia_listAccess().getGroup_1(), "rule__Media_list__Group_1__0");
					put(grammarAccess.getFont_faceAccess().getGroup(), "rule__Font_face__Group__0");
					put(grammarAccess.getFont_faceAccess().getGroup_4(), "rule__Font_face__Group_4__0");
					put(grammarAccess.getKeyframesAccess().getGroup(), "rule__Keyframes__Group__0");
					put(grammarAccess.getKeyframesAccess().getGroup_5(), "rule__Keyframes__Group_5__0");
					put(grammarAccess.getKeyframe_selectorAccess().getGroup(), "rule__Keyframe_selector__Group__0");
					put(grammarAccess.getKeyframe_selectorAccess().getGroup_0_1(), "rule__Keyframe_selector__Group_0_1__0");
					put(grammarAccess.getKeyframe_selectorAccess().getGroup_3(), "rule__Keyframe_selector__Group_3__0");
					put(grammarAccess.getRulesetAccess().getGroup(), "rule__Ruleset__Group__0");
					put(grammarAccess.getRulesetAccess().getGroup_1(), "rule__Ruleset__Group_1__0");
					put(grammarAccess.getRulesetAccess().getGroup_4(), "rule__Ruleset__Group_4__0");
					put(grammarAccess.getRulesetAccess().getGroup_4_1(), "rule__Ruleset__Group_4_1__0");
					put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup_1_0(), "rule__Selector__Group_1_0__0");
					put(grammarAccess.getSelectorAccess().getGroup_1_1(), "rule__Selector__Group_1_1__0");
					put(grammarAccess.getSelectorAccess().getGroup_1_1_1(), "rule__Selector__Group_1_1_1__0");
					put(grammarAccess.getSimpleSelectorForNegationAccess().getGroup_0(), "rule__SimpleSelectorForNegation__Group_0__0");
					put(grammarAccess.getSimple_selectorAccess().getGroup_0(), "rule__Simple_selector__Group_0__0");
					put(grammarAccess.getAttributeSelectorAccess().getGroup(), "rule__AttributeSelector__Group__0");
					put(grammarAccess.getAttributeSelectorAccess().getGroup_3(), "rule__AttributeSelector__Group_3__0");
					put(grammarAccess.getClassSelectorAccess().getGroup(), "rule__ClassSelector__Group__0");
					put(grammarAccess.getElementSelectorAccess().getGroup(), "rule__ElementSelector__Group__0");
					put(grammarAccess.getUniversalSelectorAccess().getGroup(), "rule__UniversalSelector__Group__0");
					put(grammarAccess.getIdSelectorAccess().getGroup(), "rule__IdSelector__Group__0");
					put(grammarAccess.getCss_namespace_prefixAccess().getGroup(), "rule__Css_namespace_prefix__Group__0");
					put(grammarAccess.getCss_declarationAccess().getGroup(), "rule__Css_declaration__Group__0");
					put(grammarAccess.getCss_propertyAccess().getGroup(), "rule__Css_property__Group__0");
					put(grammarAccess.getPseudoClassAccess().getGroup(), "rule__PseudoClass__Group__0");
					put(grammarAccess.getPseudoClassFunctionAccess().getGroup_0(), "rule__PseudoClassFunction__Group_0__0");
					put(grammarAccess.getPseudoClassFunctionAccess().getGroup_1(), "rule__PseudoClassFunction__Group_1__0");
					put(grammarAccess.getNotFunctionCallAccess().getGroup(), "rule__NotFunctionCall__Group__0");
					put(grammarAccess.getSymbolTokAccess().getGroup(), "rule__SymbolTok__Group__0");
					put(grammarAccess.getWSTokAccess().getGroup(), "rule__WSTok__Group__0");
					put(grammarAccess.getStringTokAccess().getGroup(), "rule__StringTok__Group__0");
					put(grammarAccess.getNumberTokAccess().getGroup(), "rule__NumberTok__Group__0");
					put(grammarAccess.getUrlTokAccess().getGroup(), "rule__UrlTok__Group__0");
					put(grammarAccess.getColorTokAccess().getGroup(), "rule__ColorTok__Group__0");
					put(grammarAccess.getIdentifierOrFuncTokAccess().getGroup(), "rule__IdentifierOrFuncTok__Group__0");
					put(grammarAccess.getIdentifierOrFuncTokAccess().getGroup_2(), "rule__IdentifierOrFuncTok__Group_2__0");
					put(grammarAccess.getIntegerTokAccess().getGroup(), "rule__IntegerTok__Group__0");
					put(grammarAccess.getURLTypeAccess().getGroup(), "rule__URLType__Group__0");
					put(grammarAccess.getValidURLSymbolAccess().getGroup_18(), "rule__ValidURLSymbol__Group_18__0");
					put(grammarAccess.getValidURLAccess().getGroup_1_10(), "rule__ValidURL__Group_1_10__0");
					put(grammarAccess.getIdentifierAccess().getGroup(), "rule__Identifier__Group__0");
					put(grammarAccess.getIdentifierAccess().getGroup_2(), "rule__Identifier__Group_2__0");
					put(grammarAccess.getNumAccess().getGroup(), "rule__Num__Group__0");
					put(grammarAccess.getNumAccess().getGroup_1_0(), "rule__Num__Group_1_0__0");
					put(grammarAccess.getNumAccess().getGroup_1_1(), "rule__Num__Group_1_1__0");
					put(grammarAccess.getNumAccess().getGroup_1_1_1(), "rule__Num__Group_1_1_1__0");
					put(grammarAccess.getNumIntAccess().getGroup(), "rule__NumInt__Group__0");
					put(grammarAccess.getHexAccess().getGroup(), "rule__Hex__Group__0");
					put(grammarAccess.getHexAccess().getGroup_1(), "rule__Hex__Group_1__0");
					put(grammarAccess.getStylesheetAccess().getCharsetAssignment_0(), "rule__Stylesheet__CharsetAssignment_0");
					put(grammarAccess.getStylesheetAccess().getImportsAssignment_1(), "rule__Stylesheet__ImportsAssignment_1");
					put(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0(), "rule__Stylesheet__RulesetAssignment_2_0");
					put(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1(), "rule__Stylesheet__MediaAssignment_2_1");
					put(grammarAccess.getStylesheetAccess().getPageAssignment_2_2(), "rule__Stylesheet__PageAssignment_2_2");
					put(grammarAccess.getStylesheetAccess().getFont_faceAssignment_2_3(), "rule__Stylesheet__Font_faceAssignment_2_3");
					put(grammarAccess.getStylesheetAccess().getKeyframesAssignment_2_4(), "rule__Stylesheet__KeyframesAssignment_2_4");
					put(grammarAccess.getCharsetAccess().getCharsetAssignment_1(), "rule__Charset__CharsetAssignment_1");
					put(grammarAccess.getImportExpressionAccess().getValueAssignment_1_0(), "rule__ImportExpression__ValueAssignment_1_0");
					put(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1_1(), "rule__ImportExpression__MediaListAssignment_1_1_1");
					put(grammarAccess.getPageAccess().getPseudoPageAssignment_2(), "rule__Page__PseudoPageAssignment_2");
					put(grammarAccess.getPageAccess().getDeclarationsAssignment_4(), "rule__Page__DeclarationsAssignment_4");
					put(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1(), "rule__Page__DeclarationsAssignment_5_1");
					put(grammarAccess.getMediaAccess().getMedialistAssignment_1(), "rule__Media__MedialistAssignment_1");
					put(grammarAccess.getMediaAccess().getRulesetsAssignment_3(), "rule__Media__RulesetsAssignment_3");
					put(grammarAccess.getFont_faceAccess().getDeclarationsAssignment_3(), "rule__Font_face__DeclarationsAssignment_3");
					put(grammarAccess.getFont_faceAccess().getDeclarationsAssignment_4_1(), "rule__Font_face__DeclarationsAssignment_4_1");
					put(grammarAccess.getKeyframesAccess().getNameAssignment_2(), "rule__Keyframes__NameAssignment_2");
					put(grammarAccess.getKeyframesAccess().getKeyframeselectorsAssignment_4(), "rule__Keyframes__KeyframeselectorsAssignment_4");
					put(grammarAccess.getKeyframesAccess().getKeyframeselectorsAssignment_5_1(), "rule__Keyframes__KeyframeselectorsAssignment_5_1");
					put(grammarAccess.getKeyframe_selectorAccess().getTypeAssignment_0_0(), "rule__Keyframe_selector__TypeAssignment_0_0");
					put(grammarAccess.getKeyframe_selectorAccess().getPercentageAssignment_0_1_0(), "rule__Keyframe_selector__PercentageAssignment_0_1_0");
					put(grammarAccess.getKeyframe_selectorAccess().getDeclarationsAssignment_2(), "rule__Keyframe_selector__DeclarationsAssignment_2");
					put(grammarAccess.getKeyframe_selectorAccess().getDeclarationsAssignment_3_1(), "rule__Keyframe_selector__DeclarationsAssignment_3_1");
					put(grammarAccess.getRulesetAccess().getSelectorsAssignment_0(), "rule__Ruleset__SelectorsAssignment_0");
					put(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_2(), "rule__Ruleset__SelectorsAssignment_1_2");
					put(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_0(), "rule__Ruleset__DeclarationsAssignment_4_0");
					put(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_1_1(), "rule__Ruleset__DeclarationsAssignment_4_1_1");
					put(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0(), "rule__Selector__SimpleselectorsAssignment_0");
					put(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0(), "rule__Selector__CombinatorAssignment_1_0_0");
					put(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_2(), "rule__Selector__SelectorAssignment_1_0_2");
					put(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0(), "rule__Selector__CombinatorAssignment_1_1_1_0");
					put(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_2(), "rule__Selector__SelectorAssignment_1_1_2");
					put(grammarAccess.getSimpleSelectorForNegationAccess().getElementAssignment_0_0_0(), "rule__SimpleSelectorForNegation__ElementAssignment_0_0_0");
					put(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalAssignment_0_0_1(), "rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1");
					put(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_0_1(), "rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1");
					put(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1(), "rule__SimpleSelectorForNegation__SubSelectorsAssignment_1");
					put(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0_0(), "rule__Simple_selector__ElementAssignment_0_0_0");
					put(grammarAccess.getSimple_selectorAccess().getUniversalAssignment_0_0_1(), "rule__Simple_selector__UniversalAssignment_0_0_1");
					put(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1(), "rule__Simple_selector__SubSelectorsAssignment_0_1");
					put(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1(), "rule__Simple_selector__SubSelectorsAssignment_1");
					put(grammarAccess.getAttributeSelectorAccess().getNameAssignment_2(), "rule__AttributeSelector__NameAssignment_2");
					put(grammarAccess.getAttributeSelectorAccess().getOpAssignment_3_0(), "rule__AttributeSelector__OpAssignment_3_0");
					put(grammarAccess.getAttributeSelectorAccess().getValueAssignment_3_1(), "rule__AttributeSelector__ValueAssignment_3_1");
					put(grammarAccess.getClassSelectorAccess().getNameAssignment_2(), "rule__ClassSelector__NameAssignment_2");
					put(grammarAccess.getElementSelectorAccess().getNameAssignment_1(), "rule__ElementSelector__NameAssignment_1");
					put(grammarAccess.getUniversalSelectorAccess().getNamespaceAssignment_1(), "rule__UniversalSelector__NamespaceAssignment_1");
					put(grammarAccess.getIdSelectorAccess().getNameAssignment_2(), "rule__IdSelector__NameAssignment_2");
					put(grammarAccess.getCss_declarationAccess().getPropertyAssignment_1(), "rule__Css_declaration__PropertyAssignment_1");
					put(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4(), "rule__Css_declaration__ValueTokensAssignment_4");
					put(grammarAccess.getCss_declarationAccess().getImportantAssignment_5(), "rule__Css_declaration__ImportantAssignment_5");
					put(grammarAccess.getCss_propertyAccess().getNameAssignment_1(), "rule__Css_property__NameAssignment_1");
					put(grammarAccess.getPseudoClassNameAccess().getNameAssignment(), "rule__PseudoClassName__NameAssignment");
					put(grammarAccess.getPseudoClassFunctionAccess().getNotAssignment_0_0(), "rule__PseudoClassFunction__NotAssignment_0_0");
					put(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorAssignment_0_1(), "rule__PseudoClassFunction__ParamSelectorAssignment_0_1");
					put(grammarAccess.getPseudoClassFunctionAccess().getNameAssignment_1_1(), "rule__PseudoClassFunction__NameAssignment_1_1");
					put(grammarAccess.getPseudoClassFunctionAccess().getParamsAssignment_1_3(), "rule__PseudoClassFunction__ParamsAssignment_1_3");
					put(grammarAccess.getSymbolTokAccess().getSymbolAssignment_1(), "rule__SymbolTok__SymbolAssignment_1");
					put(grammarAccess.getStringTokAccess().getValueAssignment_1(), "rule__StringTok__ValueAssignment_1");
					put(grammarAccess.getNumberTokAccess().getValAssignment_1(), "rule__NumberTok__ValAssignment_1");
					put(grammarAccess.getUrlTokAccess().getUrlAssignment_1(), "rule__UrlTok__UrlAssignment_1");
					put(grammarAccess.getColorTokAccess().getValueAssignment_1(), "rule__ColorTok__ValueAssignment_1");
					put(grammarAccess.getIdentifierOrFuncTokAccess().getNameAssignment_1(), "rule__IdentifierOrFuncTok__NameAssignment_1");
					put(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2(), "rule__IdentifierOrFuncTok__ParamsAssignment_2_2");
					put(grammarAccess.getIntegerTokAccess().getValAssignment_1(), "rule__IntegerTok__ValAssignment_1");
					put(grammarAccess.getURLTypeAccess().getUrlAssignment_1(), "rule__URLType__UrlAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.papyrus.infra.gmfdiag.css3.ui.contentassist.antlr.internal.InternalCSSParser typedParser = (org.eclipse.papyrus.infra.gmfdiag.css3.ui.contentassist.antlr.internal.InternalCSSParser) parser;
			typedParser.entryRulestylesheet();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT" };
	}

	public CSSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CSSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
