package org.eclipse.papyrus.infra.gmfdiag.css3.ui.contentassist.antlr.internal;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.papyrus.infra.gmfdiag.css3.services.CSSGrammarAccess;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;

@SuppressWarnings("all")
public class InternalCSSParser extends AbstractInternalContentAssistParser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_CSSSTRING", "RULE_PLUS", "RULE_COMMA", "RULE_PERCENT", "RULE_DASH", "RULE_UNDERSCORE", "RULE_COLON", "RULE_HASHMARK", "RULE_ONE_HEX_LETTER", "RULE_ONE_NON_HEX_LETTER",
			"RULE_ONE_INT", "RULE_WS", "RULE_IMPORTANT_SYM", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'@media'", "'@MEDIA'", "'@font-face'", "'@FONT-FACE'", "'@keyframes'", "'@KEYFRAMES'", "'^='", "'$='",
			"'*='", "'='", "'*'", "'>'", "'~'", "'.'", "'/'", "'?'", "'['", "']'", "'@'", "'!'", "'$'", "'&'", "';'", "'not'", "'no'", "'url'", "'ur'", "'\\\\ '", "'\\\\('", "'\\\\)'", "'\\\\\\''", "'\\\\\"'", "'{'", "'}'", "'|'", "')'", "'('", "'not('",
			"'url('"
	};
	public static final int T__64 = 64;
	public static final int T__29 = 29;
	public static final int T__28 = 28;
	public static final int T__62 = 62;
	public static final int T__27 = 27;
	public static final int T__63 = 63;
	public static final int T__26 = 26;
	public static final int T__25 = 25;
	public static final int T__24 = 24;
	public static final int RULE_INCLUDES = 4;
	public static final int T__23 = 23;
	public static final int T__22 = 22;
	public static final int T__21 = 21;
	public static final int T__20 = 20;
	public static final int RULE_ONE_INT = 16;
	public static final int RULE_PERCENT = 9;
	public static final int T__61 = 61;
	public static final int T__60 = 60;
	public static final int EOF = -1;
	public static final int T__55 = 55;
	public static final int T__56 = 56;
	public static final int T__57 = 57;
	public static final int T__58 = 58;
	public static final int T__51 = 51;
	public static final int T__52 = 52;
	public static final int T__53 = 53;
	public static final int T__54 = 54;
	public static final int RULE_ONE_NON_HEX_LETTER = 15;
	public static final int T__59 = 59;
	public static final int T__50 = 50;
	public static final int T__42 = 42;
	public static final int T__43 = 43;
	public static final int T__40 = 40;
	public static final int T__41 = 41;
	public static final int T__46 = 46;
	public static final int T__47 = 47;
	public static final int T__44 = 44;
	public static final int T__45 = 45;
	public static final int T__48 = 48;
	public static final int T__49 = 49;
	public static final int RULE_UNDERSCORE = 11;
	public static final int RULE_PLUS = 7;
	public static final int RULE_ONE_HEX_LETTER = 14;
	public static final int RULE_COMMA = 8;
	public static final int RULE_HASHMARK = 13;
	public static final int RULE_ML_COMMENT = 19;
	public static final int RULE_DASHMATCH = 5;
	public static final int T__30 = 30;
	public static final int RULE_COLON = 12;
	public static final int T__31 = 31;
	public static final int T__32 = 32;
	public static final int T__33 = 33;
	public static final int T__34 = 34;
	public static final int T__35 = 35;
	public static final int T__36 = 36;
	public static final int T__37 = 37;
	public static final int T__38 = 38;
	public static final int T__39 = 39;
	public static final int RULE_CSSSTRING = 6;
	public static final int RULE_IMPORTANT_SYM = 18;
	public static final int RULE_WS = 17;
	public static final int RULE_DASH = 10;

	// delegates
	// delegators


	public InternalCSSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalCSSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}


	@Override
	public String[] getTokenNames() {
		return InternalCSSParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "InternalCSS.g";
	}



	private CSSGrammarAccess grammarAccess;

	public void setGrammarAccess(CSSGrammarAccess grammarAccess) {
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




	// $ANTLR start "entryRulestylesheet"
	// InternalCSS.g:61:1: entryRulestylesheet : rulestylesheet EOF ;
	public final void entryRulestylesheet() throws RecognitionException {
		try {
			// InternalCSS.g:62:1: ( rulestylesheet EOF )
			// InternalCSS.g:63:1: rulestylesheet EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getStylesheetRule());
				}
				pushFollow(FOLLOW_1);
				rulestylesheet();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getStylesheetRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulestylesheet"


	// $ANTLR start "rulestylesheet"
	// InternalCSS.g:70:1: rulestylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
	public final void rulestylesheet() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:74:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
			// InternalCSS.g:75:1: ( ( rule__Stylesheet__Group__0 ) )
			{
				// InternalCSS.g:75:1: ( ( rule__Stylesheet__Group__0 ) )
				// InternalCSS.g:76:1: ( rule__Stylesheet__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getGroup());
					}
					// InternalCSS.g:77:1: ( rule__Stylesheet__Group__0 )
					// InternalCSS.g:77:2: rule__Stylesheet__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Stylesheet__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulestylesheet"


	// $ANTLR start "entryRulecharset"
	// InternalCSS.g:89:1: entryRulecharset : rulecharset EOF ;
	public final void entryRulecharset() throws RecognitionException {
		try {
			// InternalCSS.g:90:1: ( rulecharset EOF )
			// InternalCSS.g:91:1: rulecharset EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getCharsetRule());
				}
				pushFollow(FOLLOW_1);
				rulecharset();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getCharsetRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulecharset"


	// $ANTLR start "rulecharset"
	// InternalCSS.g:98:1: rulecharset : ( ( rule__Charset__Group__0 ) ) ;
	public final void rulecharset() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:102:2: ( ( ( rule__Charset__Group__0 ) ) )
			// InternalCSS.g:103:1: ( ( rule__Charset__Group__0 ) )
			{
				// InternalCSS.g:103:1: ( ( rule__Charset__Group__0 ) )
				// InternalCSS.g:104:1: ( rule__Charset__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCharsetAccess().getGroup());
					}
					// InternalCSS.g:105:1: ( rule__Charset__Group__0 )
					// InternalCSS.g:105:2: rule__Charset__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Charset__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCharsetAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulecharset"


	// $ANTLR start "entryRuleimportExpression"
	// InternalCSS.g:117:1: entryRuleimportExpression : ruleimportExpression EOF ;
	public final void entryRuleimportExpression() throws RecognitionException {
		try {
			// InternalCSS.g:118:1: ( ruleimportExpression EOF )
			// InternalCSS.g:119:1: ruleimportExpression EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getImportExpressionRule());
				}
				pushFollow(FOLLOW_1);
				ruleimportExpression();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getImportExpressionRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleimportExpression"


	// $ANTLR start "ruleimportExpression"
	// InternalCSS.g:126:1: ruleimportExpression : ( ( rule__ImportExpression__Group__0 ) ) ;
	public final void ruleimportExpression() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:130:2: ( ( ( rule__ImportExpression__Group__0 ) ) )
			// InternalCSS.g:131:1: ( ( rule__ImportExpression__Group__0 ) )
			{
				// InternalCSS.g:131:1: ( ( rule__ImportExpression__Group__0 ) )
				// InternalCSS.g:132:1: ( rule__ImportExpression__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getGroup());
					}
					// InternalCSS.g:133:1: ( rule__ImportExpression__Group__0 )
					// InternalCSS.g:133:2: rule__ImportExpression__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__ImportExpression__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleimportExpression"


	// $ANTLR start "entryRulepage"
	// InternalCSS.g:145:1: entryRulepage : rulepage EOF ;
	public final void entryRulepage() throws RecognitionException {
		try {
			// InternalCSS.g:146:1: ( rulepage EOF )
			// InternalCSS.g:147:1: rulepage EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getPageRule());
				}
				pushFollow(FOLLOW_1);
				rulepage();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getPageRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulepage"


	// $ANTLR start "rulepage"
	// InternalCSS.g:154:1: rulepage : ( ( rule__Page__Group__0 ) ) ;
	public final void rulepage() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:158:2: ( ( ( rule__Page__Group__0 ) ) )
			// InternalCSS.g:159:1: ( ( rule__Page__Group__0 ) )
			{
				// InternalCSS.g:159:1: ( ( rule__Page__Group__0 ) )
				// InternalCSS.g:160:1: ( rule__Page__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getGroup());
					}
					// InternalCSS.g:161:1: ( rule__Page__Group__0 )
					// InternalCSS.g:161:2: rule__Page__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Page__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulepage"


	// $ANTLR start "entryRulepseudo_page"
	// InternalCSS.g:173:1: entryRulepseudo_page : rulepseudo_page EOF ;
	public final void entryRulepseudo_page() throws RecognitionException {
		try {
			// InternalCSS.g:174:1: ( rulepseudo_page EOF )
			// InternalCSS.g:175:1: rulepseudo_page EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getPseudo_pageRule());
				}
				pushFollow(FOLLOW_1);
				rulepseudo_page();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getPseudo_pageRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulepseudo_page"


	// $ANTLR start "rulepseudo_page"
	// InternalCSS.g:182:1: rulepseudo_page : ( ( rule__Pseudo_page__Group__0 ) ) ;
	public final void rulepseudo_page() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:186:2: ( ( ( rule__Pseudo_page__Group__0 ) ) )
			// InternalCSS.g:187:1: ( ( rule__Pseudo_page__Group__0 ) )
			{
				// InternalCSS.g:187:1: ( ( rule__Pseudo_page__Group__0 ) )
				// InternalCSS.g:188:1: ( rule__Pseudo_page__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudo_pageAccess().getGroup());
					}
					// InternalCSS.g:189:1: ( rule__Pseudo_page__Group__0 )
					// InternalCSS.g:189:2: rule__Pseudo_page__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Pseudo_page__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudo_pageAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulepseudo_page"


	// $ANTLR start "entryRulemedia"
	// InternalCSS.g:201:1: entryRulemedia : rulemedia EOF ;
	public final void entryRulemedia() throws RecognitionException {
		try {
			// InternalCSS.g:202:1: ( rulemedia EOF )
			// InternalCSS.g:203:1: rulemedia EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getMediaRule());
				}
				pushFollow(FOLLOW_1);
				rulemedia();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getMediaRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulemedia"


	// $ANTLR start "rulemedia"
	// InternalCSS.g:210:1: rulemedia : ( ( rule__Media__Group__0 ) ) ;
	public final void rulemedia() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:214:2: ( ( ( rule__Media__Group__0 ) ) )
			// InternalCSS.g:215:1: ( ( rule__Media__Group__0 ) )
			{
				// InternalCSS.g:215:1: ( ( rule__Media__Group__0 ) )
				// InternalCSS.g:216:1: ( rule__Media__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getGroup());
					}
					// InternalCSS.g:217:1: ( rule__Media__Group__0 )
					// InternalCSS.g:217:2: rule__Media__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Media__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulemedia"


	// $ANTLR start "entryRulemedia_list"
	// InternalCSS.g:229:1: entryRulemedia_list : rulemedia_list EOF ;
	public final void entryRulemedia_list() throws RecognitionException {
		try {
			// InternalCSS.g:230:1: ( rulemedia_list EOF )
			// InternalCSS.g:231:1: rulemedia_list EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getMedia_listRule());
				}
				pushFollow(FOLLOW_1);
				rulemedia_list();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getMedia_listRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulemedia_list"


	// $ANTLR start "rulemedia_list"
	// InternalCSS.g:238:1: rulemedia_list : ( ( rule__Media_list__Group__0 ) ) ;
	public final void rulemedia_list() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:242:2: ( ( ( rule__Media_list__Group__0 ) ) )
			// InternalCSS.g:243:1: ( ( rule__Media_list__Group__0 ) )
			{
				// InternalCSS.g:243:1: ( ( rule__Media_list__Group__0 ) )
				// InternalCSS.g:244:1: ( rule__Media_list__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMedia_listAccess().getGroup());
					}
					// InternalCSS.g:245:1: ( rule__Media_list__Group__0 )
					// InternalCSS.g:245:2: rule__Media_list__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Media_list__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getMedia_listAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulemedia_list"


	// $ANTLR start "entryRulemedium"
	// InternalCSS.g:257:1: entryRulemedium : rulemedium EOF ;
	public final void entryRulemedium() throws RecognitionException {
		try {
			// InternalCSS.g:258:1: ( rulemedium EOF )
			// InternalCSS.g:259:1: rulemedium EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getMediumRule());
				}
				pushFollow(FOLLOW_1);
				rulemedium();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getMediumRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulemedium"


	// $ANTLR start "rulemedium"
	// InternalCSS.g:266:1: rulemedium : ( ruleIdentifier ) ;
	public final void rulemedium() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:270:2: ( ( ruleIdentifier ) )
			// InternalCSS.g:271:1: ( ruleIdentifier )
			{
				// InternalCSS.g:271:1: ( ruleIdentifier )
				// InternalCSS.g:272:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediumAccess().getIdentifierParserRuleCall());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMediumAccess().getIdentifierParserRuleCall());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulemedium"


	// $ANTLR start "entryRulefont_face"
	// InternalCSS.g:285:1: entryRulefont_face : rulefont_face EOF ;
	public final void entryRulefont_face() throws RecognitionException {
		try {
			// InternalCSS.g:286:1: ( rulefont_face EOF )
			// InternalCSS.g:287:1: rulefont_face EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getFont_faceRule());
				}
				pushFollow(FOLLOW_1);
				rulefont_face();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getFont_faceRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulefont_face"


	// $ANTLR start "rulefont_face"
	// InternalCSS.g:294:1: rulefont_face : ( ( rule__Font_face__Group__0 ) ) ;
	public final void rulefont_face() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:298:2: ( ( ( rule__Font_face__Group__0 ) ) )
			// InternalCSS.g:299:1: ( ( rule__Font_face__Group__0 ) )
			{
				// InternalCSS.g:299:1: ( ( rule__Font_face__Group__0 ) )
				// InternalCSS.g:300:1: ( rule__Font_face__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getGroup());
					}
					// InternalCSS.g:301:1: ( rule__Font_face__Group__0 )
					// InternalCSS.g:301:2: rule__Font_face__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Font_face__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulefont_face"


	// $ANTLR start "entryRulekeyframes"
	// InternalCSS.g:313:1: entryRulekeyframes : rulekeyframes EOF ;
	public final void entryRulekeyframes() throws RecognitionException {
		try {
			// InternalCSS.g:314:1: ( rulekeyframes EOF )
			// InternalCSS.g:315:1: rulekeyframes EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getKeyframesRule());
				}
				pushFollow(FOLLOW_1);
				rulekeyframes();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getKeyframesRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulekeyframes"


	// $ANTLR start "rulekeyframes"
	// InternalCSS.g:322:1: rulekeyframes : ( ( rule__Keyframes__Group__0 ) ) ;
	public final void rulekeyframes() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:326:2: ( ( ( rule__Keyframes__Group__0 ) ) )
			// InternalCSS.g:327:1: ( ( rule__Keyframes__Group__0 ) )
			{
				// InternalCSS.g:327:1: ( ( rule__Keyframes__Group__0 ) )
				// InternalCSS.g:328:1: ( rule__Keyframes__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getGroup());
					}
					// InternalCSS.g:329:1: ( rule__Keyframes__Group__0 )
					// InternalCSS.g:329:2: rule__Keyframes__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Keyframes__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulekeyframes"


	// $ANTLR start "entryRulekeyframe_selector"
	// InternalCSS.g:341:1: entryRulekeyframe_selector : rulekeyframe_selector EOF ;
	public final void entryRulekeyframe_selector() throws RecognitionException {
		try {
			// InternalCSS.g:342:1: ( rulekeyframe_selector EOF )
			// InternalCSS.g:343:1: rulekeyframe_selector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getKeyframe_selectorRule());
				}
				pushFollow(FOLLOW_1);
				rulekeyframe_selector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getKeyframe_selectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulekeyframe_selector"


	// $ANTLR start "rulekeyframe_selector"
	// InternalCSS.g:350:1: rulekeyframe_selector : ( ( rule__Keyframe_selector__Group__0 ) ) ;
	public final void rulekeyframe_selector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:354:2: ( ( ( rule__Keyframe_selector__Group__0 ) ) )
			// InternalCSS.g:355:1: ( ( rule__Keyframe_selector__Group__0 ) )
			{
				// InternalCSS.g:355:1: ( ( rule__Keyframe_selector__Group__0 ) )
				// InternalCSS.g:356:1: ( rule__Keyframe_selector__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getGroup());
					}
					// InternalCSS.g:357:1: ( rule__Keyframe_selector__Group__0 )
					// InternalCSS.g:357:2: rule__Keyframe_selector__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Keyframe_selector__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulekeyframe_selector"


	// $ANTLR start "entryRuleruleset"
	// InternalCSS.g:369:1: entryRuleruleset : ruleruleset EOF ;
	public final void entryRuleruleset() throws RecognitionException {
		try {
			// InternalCSS.g:370:1: ( ruleruleset EOF )
			// InternalCSS.g:371:1: ruleruleset EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getRulesetRule());
				}
				pushFollow(FOLLOW_1);
				ruleruleset();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getRulesetRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleruleset"


	// $ANTLR start "ruleruleset"
	// InternalCSS.g:378:1: ruleruleset : ( ( rule__Ruleset__Group__0 ) ) ;
	public final void ruleruleset() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:382:2: ( ( ( rule__Ruleset__Group__0 ) ) )
			// InternalCSS.g:383:1: ( ( rule__Ruleset__Group__0 ) )
			{
				// InternalCSS.g:383:1: ( ( rule__Ruleset__Group__0 ) )
				// InternalCSS.g:384:1: ( rule__Ruleset__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getGroup());
					}
					// InternalCSS.g:385:1: ( rule__Ruleset__Group__0 )
					// InternalCSS.g:385:2: rule__Ruleset__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Ruleset__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleruleset"


	// $ANTLR start "entryRuleselector"
	// InternalCSS.g:397:1: entryRuleselector : ruleselector EOF ;
	public final void entryRuleselector() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");

		try {
			// InternalCSS.g:401:1: ( ruleselector EOF )
			// InternalCSS.g:402:1: ruleselector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getSelectorRule());
				}
				pushFollow(FOLLOW_1);
				ruleselector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getSelectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleselector"


	// $ANTLR start "ruleselector"
	// InternalCSS.g:412:1: ruleselector : ( ( rule__Selector__Group__0 ) ) ;
	public final void ruleselector() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:417:2: ( ( ( rule__Selector__Group__0 ) ) )
			// InternalCSS.g:418:1: ( ( rule__Selector__Group__0 ) )
			{
				// InternalCSS.g:418:1: ( ( rule__Selector__Group__0 ) )
				// InternalCSS.g:419:1: ( rule__Selector__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getGroup());
					}
					// InternalCSS.g:420:1: ( rule__Selector__Group__0 )
					// InternalCSS.g:420:2: rule__Selector__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Selector__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleselector"


	// $ANTLR start "entryRuleSimpleSelectorForNegation"
	// InternalCSS.g:433:1: entryRuleSimpleSelectorForNegation : ruleSimpleSelectorForNegation EOF ;
	public final void entryRuleSimpleSelectorForNegation() throws RecognitionException {
		try {
			// InternalCSS.g:434:1: ( ruleSimpleSelectorForNegation EOF )
			// InternalCSS.g:435:1: ruleSimpleSelectorForNegation EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getSimpleSelectorForNegationRule());
				}
				pushFollow(FOLLOW_1);
				ruleSimpleSelectorForNegation();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getSimpleSelectorForNegationRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleSimpleSelectorForNegation"


	// $ANTLR start "ruleSimpleSelectorForNegation"
	// InternalCSS.g:442:1: ruleSimpleSelectorForNegation : ( ( rule__SimpleSelectorForNegation__Alternatives ) ) ;
	public final void ruleSimpleSelectorForNegation() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:446:2: ( ( ( rule__SimpleSelectorForNegation__Alternatives ) ) )
			// InternalCSS.g:447:1: ( ( rule__SimpleSelectorForNegation__Alternatives ) )
			{
				// InternalCSS.g:447:1: ( ( rule__SimpleSelectorForNegation__Alternatives ) )
				// InternalCSS.g:448:1: ( rule__SimpleSelectorForNegation__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives());
					}
					// InternalCSS.g:449:1: ( rule__SimpleSelectorForNegation__Alternatives )
					// InternalCSS.g:449:2: rule__SimpleSelectorForNegation__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__SimpleSelectorForNegation__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleSimpleSelectorForNegation"


	// $ANTLR start "entryRuleSubSelectorForNegation"
	// InternalCSS.g:461:1: entryRuleSubSelectorForNegation : ruleSubSelectorForNegation EOF ;
	public final void entryRuleSubSelectorForNegation() throws RecognitionException {
		try {
			// InternalCSS.g:462:1: ( ruleSubSelectorForNegation EOF )
			// InternalCSS.g:463:1: ruleSubSelectorForNegation EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getSubSelectorForNegationRule());
				}
				pushFollow(FOLLOW_1);
				ruleSubSelectorForNegation();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getSubSelectorForNegationRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleSubSelectorForNegation"


	// $ANTLR start "ruleSubSelectorForNegation"
	// InternalCSS.g:470:1: ruleSubSelectorForNegation : ( ( rule__SubSelectorForNegation__Alternatives ) ) ;
	public final void ruleSubSelectorForNegation() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:474:2: ( ( ( rule__SubSelectorForNegation__Alternatives ) ) )
			// InternalCSS.g:475:1: ( ( rule__SubSelectorForNegation__Alternatives ) )
			{
				// InternalCSS.g:475:1: ( ( rule__SubSelectorForNegation__Alternatives ) )
				// InternalCSS.g:476:1: ( rule__SubSelectorForNegation__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorForNegationAccess().getAlternatives());
					}
					// InternalCSS.g:477:1: ( rule__SubSelectorForNegation__Alternatives )
					// InternalCSS.g:477:2: rule__SubSelectorForNegation__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__SubSelectorForNegation__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorForNegationAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleSubSelectorForNegation"


	// $ANTLR start "entryRulesimple_selector"
	// InternalCSS.g:489:1: entryRulesimple_selector : rulesimple_selector EOF ;
	public final void entryRulesimple_selector() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");

		try {
			// InternalCSS.g:493:1: ( rulesimple_selector EOF )
			// InternalCSS.g:494:1: rulesimple_selector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getSimple_selectorRule());
				}
				pushFollow(FOLLOW_1);
				rulesimple_selector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getSimple_selectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRulesimple_selector"


	// $ANTLR start "rulesimple_selector"
	// InternalCSS.g:504:1: rulesimple_selector : ( ( rule__Simple_selector__Alternatives ) ) ;
	public final void rulesimple_selector() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:509:2: ( ( ( rule__Simple_selector__Alternatives ) ) )
			// InternalCSS.g:510:1: ( ( rule__Simple_selector__Alternatives ) )
			{
				// InternalCSS.g:510:1: ( ( rule__Simple_selector__Alternatives ) )
				// InternalCSS.g:511:1: ( rule__Simple_selector__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getAlternatives());
					}
					// InternalCSS.g:512:1: ( rule__Simple_selector__Alternatives )
					// InternalCSS.g:512:2: rule__Simple_selector__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__Simple_selector__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "rulesimple_selector"


	// $ANTLR start "entryRuleSubSelector"
	// InternalCSS.g:525:1: entryRuleSubSelector : ruleSubSelector EOF ;
	public final void entryRuleSubSelector() throws RecognitionException {
		try {
			// InternalCSS.g:526:1: ( ruleSubSelector EOF )
			// InternalCSS.g:527:1: ruleSubSelector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getSubSelectorRule());
				}
				pushFollow(FOLLOW_1);
				ruleSubSelector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getSubSelectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleSubSelector"


	// $ANTLR start "ruleSubSelector"
	// InternalCSS.g:534:1: ruleSubSelector : ( ( rule__SubSelector__Alternatives ) ) ;
	public final void ruleSubSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:538:2: ( ( ( rule__SubSelector__Alternatives ) ) )
			// InternalCSS.g:539:1: ( ( rule__SubSelector__Alternatives ) )
			{
				// InternalCSS.g:539:1: ( ( rule__SubSelector__Alternatives ) )
				// InternalCSS.g:540:1: ( rule__SubSelector__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorAccess().getAlternatives());
					}
					// InternalCSS.g:541:1: ( rule__SubSelector__Alternatives )
					// InternalCSS.g:541:2: rule__SubSelector__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__SubSelector__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleSubSelector"


	// $ANTLR start "entryRuleAttributeSelector"
	// InternalCSS.g:553:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
	public final void entryRuleAttributeSelector() throws RecognitionException {
		try {
			// InternalCSS.g:554:1: ( ruleAttributeSelector EOF )
			// InternalCSS.g:555:1: ruleAttributeSelector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getAttributeSelectorRule());
				}
				pushFollow(FOLLOW_1);
				ruleAttributeSelector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getAttributeSelectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleAttributeSelector"


	// $ANTLR start "ruleAttributeSelector"
	// InternalCSS.g:562:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
	public final void ruleAttributeSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:566:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
			// InternalCSS.g:567:1: ( ( rule__AttributeSelector__Group__0 ) )
			{
				// InternalCSS.g:567:1: ( ( rule__AttributeSelector__Group__0 ) )
				// InternalCSS.g:568:1: ( rule__AttributeSelector__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getGroup());
					}
					// InternalCSS.g:569:1: ( rule__AttributeSelector__Group__0 )
					// InternalCSS.g:569:2: rule__AttributeSelector__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__AttributeSelector__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleAttributeSelector"


	// $ANTLR start "entryRuleClassSelector"
	// InternalCSS.g:581:1: entryRuleClassSelector : ruleClassSelector EOF ;
	public final void entryRuleClassSelector() throws RecognitionException {
		try {
			// InternalCSS.g:582:1: ( ruleClassSelector EOF )
			// InternalCSS.g:583:1: ruleClassSelector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getClassSelectorRule());
				}
				pushFollow(FOLLOW_1);
				ruleClassSelector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getClassSelectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleClassSelector"


	// $ANTLR start "ruleClassSelector"
	// InternalCSS.g:590:1: ruleClassSelector : ( ( rule__ClassSelector__Group__0 ) ) ;
	public final void ruleClassSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:594:2: ( ( ( rule__ClassSelector__Group__0 ) ) )
			// InternalCSS.g:595:1: ( ( rule__ClassSelector__Group__0 ) )
			{
				// InternalCSS.g:595:1: ( ( rule__ClassSelector__Group__0 ) )
				// InternalCSS.g:596:1: ( rule__ClassSelector__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getClassSelectorAccess().getGroup());
					}
					// InternalCSS.g:597:1: ( rule__ClassSelector__Group__0 )
					// InternalCSS.g:597:2: rule__ClassSelector__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__ClassSelector__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getClassSelectorAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleClassSelector"


	// $ANTLR start "entryRuleElementSelector"
	// InternalCSS.g:609:1: entryRuleElementSelector : ruleElementSelector EOF ;
	public final void entryRuleElementSelector() throws RecognitionException {
		try {
			// InternalCSS.g:610:1: ( ruleElementSelector EOF )
			// InternalCSS.g:611:1: ruleElementSelector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getElementSelectorRule());
				}
				pushFollow(FOLLOW_1);
				ruleElementSelector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getElementSelectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleElementSelector"


	// $ANTLR start "ruleElementSelector"
	// InternalCSS.g:618:1: ruleElementSelector : ( ( rule__ElementSelector__Group__0 ) ) ;
	public final void ruleElementSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:622:2: ( ( ( rule__ElementSelector__Group__0 ) ) )
			// InternalCSS.g:623:1: ( ( rule__ElementSelector__Group__0 ) )
			{
				// InternalCSS.g:623:1: ( ( rule__ElementSelector__Group__0 ) )
				// InternalCSS.g:624:1: ( rule__ElementSelector__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getElementSelectorAccess().getGroup());
					}
					// InternalCSS.g:625:1: ( rule__ElementSelector__Group__0 )
					// InternalCSS.g:625:2: rule__ElementSelector__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__ElementSelector__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getElementSelectorAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleElementSelector"


	// $ANTLR start "entryRuleUniversalSelector"
	// InternalCSS.g:637:1: entryRuleUniversalSelector : ruleUniversalSelector EOF ;
	public final void entryRuleUniversalSelector() throws RecognitionException {
		try {
			// InternalCSS.g:638:1: ( ruleUniversalSelector EOF )
			// InternalCSS.g:639:1: ruleUniversalSelector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getUniversalSelectorRule());
				}
				pushFollow(FOLLOW_1);
				ruleUniversalSelector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getUniversalSelectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleUniversalSelector"


	// $ANTLR start "ruleUniversalSelector"
	// InternalCSS.g:646:1: ruleUniversalSelector : ( ( rule__UniversalSelector__Group__0 ) ) ;
	public final void ruleUniversalSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:650:2: ( ( ( rule__UniversalSelector__Group__0 ) ) )
			// InternalCSS.g:651:1: ( ( rule__UniversalSelector__Group__0 ) )
			{
				// InternalCSS.g:651:1: ( ( rule__UniversalSelector__Group__0 ) )
				// InternalCSS.g:652:1: ( rule__UniversalSelector__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUniversalSelectorAccess().getGroup());
					}
					// InternalCSS.g:653:1: ( rule__UniversalSelector__Group__0 )
					// InternalCSS.g:653:2: rule__UniversalSelector__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__UniversalSelector__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getUniversalSelectorAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleUniversalSelector"


	// $ANTLR start "entryRuleIdSelector"
	// InternalCSS.g:665:1: entryRuleIdSelector : ruleIdSelector EOF ;
	public final void entryRuleIdSelector() throws RecognitionException {
		try {
			// InternalCSS.g:666:1: ( ruleIdSelector EOF )
			// InternalCSS.g:667:1: ruleIdSelector EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getIdSelectorRule());
				}
				pushFollow(FOLLOW_1);
				ruleIdSelector();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getIdSelectorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleIdSelector"


	// $ANTLR start "ruleIdSelector"
	// InternalCSS.g:674:1: ruleIdSelector : ( ( rule__IdSelector__Group__0 ) ) ;
	public final void ruleIdSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:678:2: ( ( ( rule__IdSelector__Group__0 ) ) )
			// InternalCSS.g:679:1: ( ( rule__IdSelector__Group__0 ) )
			{
				// InternalCSS.g:679:1: ( ( rule__IdSelector__Group__0 ) )
				// InternalCSS.g:680:1: ( rule__IdSelector__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdSelectorAccess().getGroup());
					}
					// InternalCSS.g:681:1: ( rule__IdSelector__Group__0 )
					// InternalCSS.g:681:2: rule__IdSelector__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__IdSelector__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdSelectorAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleIdSelector"


	// $ANTLR start "entryRulecss_namespace_prefix"
	// InternalCSS.g:693:1: entryRulecss_namespace_prefix : rulecss_namespace_prefix EOF ;
	public final void entryRulecss_namespace_prefix() throws RecognitionException {
		try {
			// InternalCSS.g:694:1: ( rulecss_namespace_prefix EOF )
			// InternalCSS.g:695:1: rulecss_namespace_prefix EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getCss_namespace_prefixRule());
				}
				pushFollow(FOLLOW_1);
				rulecss_namespace_prefix();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getCss_namespace_prefixRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulecss_namespace_prefix"


	// $ANTLR start "rulecss_namespace_prefix"
	// InternalCSS.g:702:1: rulecss_namespace_prefix : ( ( rule__Css_namespace_prefix__Group__0 ) ) ;
	public final void rulecss_namespace_prefix() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:706:2: ( ( ( rule__Css_namespace_prefix__Group__0 ) ) )
			// InternalCSS.g:707:1: ( ( rule__Css_namespace_prefix__Group__0 ) )
			{
				// InternalCSS.g:707:1: ( ( rule__Css_namespace_prefix__Group__0 ) )
				// InternalCSS.g:708:1: ( rule__Css_namespace_prefix__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_namespace_prefixAccess().getGroup());
					}
					// InternalCSS.g:709:1: ( rule__Css_namespace_prefix__Group__0 )
					// InternalCSS.g:709:2: rule__Css_namespace_prefix__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Css_namespace_prefix__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_namespace_prefixAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulecss_namespace_prefix"


	// $ANTLR start "entryRulecss_declaration"
	// InternalCSS.g:721:1: entryRulecss_declaration : rulecss_declaration EOF ;
	public final void entryRulecss_declaration() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");

		try {
			// InternalCSS.g:725:1: ( rulecss_declaration EOF )
			// InternalCSS.g:726:1: rulecss_declaration EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getCss_declarationRule());
				}
				pushFollow(FOLLOW_1);
				rulecss_declaration();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getCss_declarationRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRulecss_declaration"


	// $ANTLR start "rulecss_declaration"
	// InternalCSS.g:736:1: rulecss_declaration : ( ( rule__Css_declaration__Group__0 ) ) ;
	public final void rulecss_declaration() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:741:2: ( ( ( rule__Css_declaration__Group__0 ) ) )
			// InternalCSS.g:742:1: ( ( rule__Css_declaration__Group__0 ) )
			{
				// InternalCSS.g:742:1: ( ( rule__Css_declaration__Group__0 ) )
				// InternalCSS.g:743:1: ( rule__Css_declaration__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getGroup());
					}
					// InternalCSS.g:744:1: ( rule__Css_declaration__Group__0 )
					// InternalCSS.g:744:2: rule__Css_declaration__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Css_declaration__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "rulecss_declaration"


	// $ANTLR start "entryRulecss_property"
	// InternalCSS.g:757:1: entryRulecss_property : rulecss_property EOF ;
	public final void entryRulecss_property() throws RecognitionException {
		try {
			// InternalCSS.g:758:1: ( rulecss_property EOF )
			// InternalCSS.g:759:1: rulecss_property EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getCss_propertyRule());
				}
				pushFollow(FOLLOW_1);
				rulecss_property();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getCss_propertyRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulecss_property"


	// $ANTLR start "rulecss_property"
	// InternalCSS.g:766:1: rulecss_property : ( ( rule__Css_property__Group__0 ) ) ;
	public final void rulecss_property() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:770:2: ( ( ( rule__Css_property__Group__0 ) ) )
			// InternalCSS.g:771:1: ( ( rule__Css_property__Group__0 ) )
			{
				// InternalCSS.g:771:1: ( ( rule__Css_property__Group__0 ) )
				// InternalCSS.g:772:1: ( rule__Css_property__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_propertyAccess().getGroup());
					}
					// InternalCSS.g:773:1: ( rule__Css_property__Group__0 )
					// InternalCSS.g:773:2: rule__Css_property__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Css_property__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_propertyAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulecss_property"


	// $ANTLR start "entryRuleValidPropertyIdent"
	// InternalCSS.g:785:1: entryRuleValidPropertyIdent : ruleValidPropertyIdent EOF ;
	public final void entryRuleValidPropertyIdent() throws RecognitionException {
		try {
			// InternalCSS.g:786:1: ( ruleValidPropertyIdent EOF )
			// InternalCSS.g:787:1: ruleValidPropertyIdent EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getValidPropertyIdentRule());
				}
				pushFollow(FOLLOW_1);
				ruleValidPropertyIdent();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getValidPropertyIdentRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleValidPropertyIdent"


	// $ANTLR start "ruleValidPropertyIdent"
	// InternalCSS.g:794:1: ruleValidPropertyIdent : ( ruleIdentifier ) ;
	public final void ruleValidPropertyIdent() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:798:2: ( ( ruleIdentifier ) )
			// InternalCSS.g:799:1: ( ruleIdentifier )
			{
				// InternalCSS.g:799:1: ( ruleIdentifier )
				// InternalCSS.g:800:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleValidPropertyIdent"


	// $ANTLR start "entryRulePseudoClassOrFunc"
	// InternalCSS.g:813:1: entryRulePseudoClassOrFunc : rulePseudoClassOrFunc EOF ;
	public final void entryRulePseudoClassOrFunc() throws RecognitionException {
		try {
			// InternalCSS.g:814:1: ( rulePseudoClassOrFunc EOF )
			// InternalCSS.g:815:1: rulePseudoClassOrFunc EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getPseudoClassOrFuncRule());
				}
				pushFollow(FOLLOW_1);
				rulePseudoClassOrFunc();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getPseudoClassOrFuncRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulePseudoClassOrFunc"


	// $ANTLR start "rulePseudoClassOrFunc"
	// InternalCSS.g:822:1: rulePseudoClassOrFunc : ( ( rule__PseudoClassOrFunc__Alternatives ) ) ;
	public final void rulePseudoClassOrFunc() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:826:2: ( ( ( rule__PseudoClassOrFunc__Alternatives ) ) )
			// InternalCSS.g:827:1: ( ( rule__PseudoClassOrFunc__Alternatives ) )
			{
				// InternalCSS.g:827:1: ( ( rule__PseudoClassOrFunc__Alternatives ) )
				// InternalCSS.g:828:1: ( rule__PseudoClassOrFunc__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassOrFuncAccess().getAlternatives());
					}
					// InternalCSS.g:829:1: ( rule__PseudoClassOrFunc__Alternatives )
					// InternalCSS.g:829:2: rule__PseudoClassOrFunc__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassOrFunc__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassOrFuncAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulePseudoClassOrFunc"


	// $ANTLR start "entryRulePseudoClass"
	// InternalCSS.g:841:1: entryRulePseudoClass : rulePseudoClass EOF ;
	public final void entryRulePseudoClass() throws RecognitionException {
		try {
			// InternalCSS.g:842:1: ( rulePseudoClass EOF )
			// InternalCSS.g:843:1: rulePseudoClass EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getPseudoClassRule());
				}
				pushFollow(FOLLOW_1);
				rulePseudoClass();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getPseudoClassRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulePseudoClass"


	// $ANTLR start "rulePseudoClass"
	// InternalCSS.g:850:1: rulePseudoClass : ( ( rule__PseudoClass__Group__0 ) ) ;
	public final void rulePseudoClass() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:854:2: ( ( ( rule__PseudoClass__Group__0 ) ) )
			// InternalCSS.g:855:1: ( ( rule__PseudoClass__Group__0 ) )
			{
				// InternalCSS.g:855:1: ( ( rule__PseudoClass__Group__0 ) )
				// InternalCSS.g:856:1: ( rule__PseudoClass__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassAccess().getGroup());
					}
					// InternalCSS.g:857:1: ( rule__PseudoClass__Group__0 )
					// InternalCSS.g:857:2: rule__PseudoClass__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClass__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulePseudoClass"


	// $ANTLR start "entryRulePseudoClassName"
	// InternalCSS.g:869:1: entryRulePseudoClassName : rulePseudoClassName EOF ;
	public final void entryRulePseudoClassName() throws RecognitionException {
		try {
			// InternalCSS.g:870:1: ( rulePseudoClassName EOF )
			// InternalCSS.g:871:1: rulePseudoClassName EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getPseudoClassNameRule());
				}
				pushFollow(FOLLOW_1);
				rulePseudoClassName();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getPseudoClassNameRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulePseudoClassName"


	// $ANTLR start "rulePseudoClassName"
	// InternalCSS.g:878:1: rulePseudoClassName : ( ( rule__PseudoClassName__NameAssignment ) ) ;
	public final void rulePseudoClassName() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:882:2: ( ( ( rule__PseudoClassName__NameAssignment ) ) )
			// InternalCSS.g:883:1: ( ( rule__PseudoClassName__NameAssignment ) )
			{
				// InternalCSS.g:883:1: ( ( rule__PseudoClassName__NameAssignment ) )
				// InternalCSS.g:884:1: ( rule__PseudoClassName__NameAssignment )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassNameAccess().getNameAssignment());
					}
					// InternalCSS.g:885:1: ( rule__PseudoClassName__NameAssignment )
					// InternalCSS.g:885:2: rule__PseudoClassName__NameAssignment
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassName__NameAssignment();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassNameAccess().getNameAssignment());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulePseudoClassName"


	// $ANTLR start "entryRulePseudoClassFunction"
	// InternalCSS.g:897:1: entryRulePseudoClassFunction : rulePseudoClassFunction EOF ;
	public final void entryRulePseudoClassFunction() throws RecognitionException {
		try {
			// InternalCSS.g:898:1: ( rulePseudoClassFunction EOF )
			// InternalCSS.g:899:1: rulePseudoClassFunction EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getPseudoClassFunctionRule());
				}
				pushFollow(FOLLOW_1);
				rulePseudoClassFunction();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getPseudoClassFunctionRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulePseudoClassFunction"


	// $ANTLR start "rulePseudoClassFunction"
	// InternalCSS.g:906:1: rulePseudoClassFunction : ( ( rule__PseudoClassFunction__Alternatives ) ) ;
	public final void rulePseudoClassFunction() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:910:2: ( ( ( rule__PseudoClassFunction__Alternatives ) ) )
			// InternalCSS.g:911:1: ( ( rule__PseudoClassFunction__Alternatives ) )
			{
				// InternalCSS.g:911:1: ( ( rule__PseudoClassFunction__Alternatives ) )
				// InternalCSS.g:912:1: ( rule__PseudoClassFunction__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getAlternatives());
					}
					// InternalCSS.g:913:1: ( rule__PseudoClassFunction__Alternatives )
					// InternalCSS.g:913:2: rule__PseudoClassFunction__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassFunction__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulePseudoClassFunction"


	// $ANTLR start "entryRuleNotFunctionCall"
	// InternalCSS.g:925:1: entryRuleNotFunctionCall : ruleNotFunctionCall EOF ;
	public final void entryRuleNotFunctionCall() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();

		try {
			// InternalCSS.g:929:1: ( ruleNotFunctionCall EOF )
			// InternalCSS.g:930:1: ruleNotFunctionCall EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getNotFunctionCallRule());
				}
				pushFollow(FOLLOW_1);
				ruleNotFunctionCall();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getNotFunctionCallRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleNotFunctionCall"


	// $ANTLR start "ruleNotFunctionCall"
	// InternalCSS.g:940:1: ruleNotFunctionCall : ( ( rule__NotFunctionCall__Group__0 ) ) ;
	public final void ruleNotFunctionCall() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:945:2: ( ( ( rule__NotFunctionCall__Group__0 ) ) )
			// InternalCSS.g:946:1: ( ( rule__NotFunctionCall__Group__0 ) )
			{
				// InternalCSS.g:946:1: ( ( rule__NotFunctionCall__Group__0 ) )
				// InternalCSS.g:947:1: ( rule__NotFunctionCall__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNotFunctionCallAccess().getGroup());
					}
					// InternalCSS.g:948:1: ( rule__NotFunctionCall__Group__0 )
					// InternalCSS.g:948:2: rule__NotFunctionCall__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__NotFunctionCall__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNotFunctionCallAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleNotFunctionCall"


	// $ANTLR start "entryRulecombinator"
	// InternalCSS.g:961:1: entryRulecombinator : rulecombinator EOF ;
	public final void entryRulecombinator() throws RecognitionException {
		try {
			// InternalCSS.g:962:1: ( rulecombinator EOF )
			// InternalCSS.g:963:1: rulecombinator EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getCombinatorRule());
				}
				pushFollow(FOLLOW_1);
				rulecombinator();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getCombinatorRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRulecombinator"


	// $ANTLR start "rulecombinator"
	// InternalCSS.g:970:1: rulecombinator : ( ( rule__Combinator__Alternatives ) ) ;
	public final void rulecombinator() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:974:2: ( ( ( rule__Combinator__Alternatives ) ) )
			// InternalCSS.g:975:1: ( ( rule__Combinator__Alternatives ) )
			{
				// InternalCSS.g:975:1: ( ( rule__Combinator__Alternatives ) )
				// InternalCSS.g:976:1: ( rule__Combinator__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCombinatorAccess().getAlternatives());
					}
					// InternalCSS.g:977:1: ( rule__Combinator__Alternatives )
					// InternalCSS.g:977:2: rule__Combinator__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__Combinator__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCombinatorAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rulecombinator"


	// $ANTLR start "entryRuleSymbolTok"
	// InternalCSS.g:993:1: entryRuleSymbolTok : ruleSymbolTok EOF ;
	public final void entryRuleSymbolTok() throws RecognitionException {
		try {
			// InternalCSS.g:994:1: ( ruleSymbolTok EOF )
			// InternalCSS.g:995:1: ruleSymbolTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getSymbolTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleSymbolTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getSymbolTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleSymbolTok"


	// $ANTLR start "ruleSymbolTok"
	// InternalCSS.g:1002:1: ruleSymbolTok : ( ( rule__SymbolTok__Group__0 ) ) ;
	public final void ruleSymbolTok() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1006:2: ( ( ( rule__SymbolTok__Group__0 ) ) )
			// InternalCSS.g:1007:1: ( ( rule__SymbolTok__Group__0 ) )
			{
				// InternalCSS.g:1007:1: ( ( rule__SymbolTok__Group__0 ) )
				// InternalCSS.g:1008:1: ( rule__SymbolTok__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSymbolTokAccess().getGroup());
					}
					// InternalCSS.g:1009:1: ( rule__SymbolTok__Group__0 )
					// InternalCSS.g:1009:2: rule__SymbolTok__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__SymbolTok__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSymbolTokAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleSymbolTok"


	// $ANTLR start "entryRuleWSTok"
	// InternalCSS.g:1021:1: entryRuleWSTok : ruleWSTok EOF ;
	public final void entryRuleWSTok() throws RecognitionException {
		try {
			// InternalCSS.g:1022:1: ( ruleWSTok EOF )
			// InternalCSS.g:1023:1: ruleWSTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getWSTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleWSTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getWSTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleWSTok"


	// $ANTLR start "ruleWSTok"
	// InternalCSS.g:1030:1: ruleWSTok : ( ( rule__WSTok__Group__0 ) ) ;
	public final void ruleWSTok() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1034:2: ( ( ( rule__WSTok__Group__0 ) ) )
			// InternalCSS.g:1035:1: ( ( rule__WSTok__Group__0 ) )
			{
				// InternalCSS.g:1035:1: ( ( rule__WSTok__Group__0 ) )
				// InternalCSS.g:1036:1: ( rule__WSTok__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getWSTokAccess().getGroup());
					}
					// InternalCSS.g:1037:1: ( rule__WSTok__Group__0 )
					// InternalCSS.g:1037:2: rule__WSTok__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__WSTok__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getWSTokAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleWSTok"


	// $ANTLR start "entryRuleStringTok"
	// InternalCSS.g:1049:1: entryRuleStringTok : ruleStringTok EOF ;
	public final void entryRuleStringTok() throws RecognitionException {
		try {
			// InternalCSS.g:1050:1: ( ruleStringTok EOF )
			// InternalCSS.g:1051:1: ruleStringTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getStringTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleStringTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getStringTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleStringTok"


	// $ANTLR start "ruleStringTok"
	// InternalCSS.g:1058:1: ruleStringTok : ( ( rule__StringTok__Group__0 ) ) ;
	public final void ruleStringTok() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1062:2: ( ( ( rule__StringTok__Group__0 ) ) )
			// InternalCSS.g:1063:1: ( ( rule__StringTok__Group__0 ) )
			{
				// InternalCSS.g:1063:1: ( ( rule__StringTok__Group__0 ) )
				// InternalCSS.g:1064:1: ( rule__StringTok__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStringTokAccess().getGroup());
					}
					// InternalCSS.g:1065:1: ( rule__StringTok__Group__0 )
					// InternalCSS.g:1065:2: rule__StringTok__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__StringTok__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStringTokAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleStringTok"


	// $ANTLR start "entryRuleNumberTok"
	// InternalCSS.g:1077:1: entryRuleNumberTok : ruleNumberTok EOF ;
	public final void entryRuleNumberTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();

		try {
			// InternalCSS.g:1081:1: ( ruleNumberTok EOF )
			// InternalCSS.g:1082:1: ruleNumberTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getNumberTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleNumberTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getNumberTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleNumberTok"


	// $ANTLR start "ruleNumberTok"
	// InternalCSS.g:1092:1: ruleNumberTok : ( ( rule__NumberTok__Group__0 ) ) ;
	public final void ruleNumberTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1097:2: ( ( ( rule__NumberTok__Group__0 ) ) )
			// InternalCSS.g:1098:1: ( ( rule__NumberTok__Group__0 ) )
			{
				// InternalCSS.g:1098:1: ( ( rule__NumberTok__Group__0 ) )
				// InternalCSS.g:1099:1: ( rule__NumberTok__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumberTokAccess().getGroup());
					}
					// InternalCSS.g:1100:1: ( rule__NumberTok__Group__0 )
					// InternalCSS.g:1100:2: rule__NumberTok__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__NumberTok__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumberTokAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleNumberTok"


	// $ANTLR start "entryRuleUrlTok"
	// InternalCSS.g:1113:1: entryRuleUrlTok : ruleUrlTok EOF ;
	public final void entryRuleUrlTok() throws RecognitionException {
		try {
			// InternalCSS.g:1114:1: ( ruleUrlTok EOF )
			// InternalCSS.g:1115:1: ruleUrlTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getUrlTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleUrlTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getUrlTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleUrlTok"


	// $ANTLR start "ruleUrlTok"
	// InternalCSS.g:1122:1: ruleUrlTok : ( ( rule__UrlTok__Group__0 ) ) ;
	public final void ruleUrlTok() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1126:2: ( ( ( rule__UrlTok__Group__0 ) ) )
			// InternalCSS.g:1127:1: ( ( rule__UrlTok__Group__0 ) )
			{
				// InternalCSS.g:1127:1: ( ( rule__UrlTok__Group__0 ) )
				// InternalCSS.g:1128:1: ( rule__UrlTok__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUrlTokAccess().getGroup());
					}
					// InternalCSS.g:1129:1: ( rule__UrlTok__Group__0 )
					// InternalCSS.g:1129:2: rule__UrlTok__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__UrlTok__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getUrlTokAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleUrlTok"


	// $ANTLR start "entryRuleColorTok"
	// InternalCSS.g:1141:1: entryRuleColorTok : ruleColorTok EOF ;
	public final void entryRuleColorTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();

		try {
			// InternalCSS.g:1145:1: ( ruleColorTok EOF )
			// InternalCSS.g:1146:1: ruleColorTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getColorTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleColorTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getColorTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleColorTok"


	// $ANTLR start "ruleColorTok"
	// InternalCSS.g:1156:1: ruleColorTok : ( ( rule__ColorTok__Group__0 ) ) ;
	public final void ruleColorTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1161:2: ( ( ( rule__ColorTok__Group__0 ) ) )
			// InternalCSS.g:1162:1: ( ( rule__ColorTok__Group__0 ) )
			{
				// InternalCSS.g:1162:1: ( ( rule__ColorTok__Group__0 ) )
				// InternalCSS.g:1163:1: ( rule__ColorTok__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getColorTokAccess().getGroup());
					}
					// InternalCSS.g:1164:1: ( rule__ColorTok__Group__0 )
					// InternalCSS.g:1164:2: rule__ColorTok__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__ColorTok__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getColorTokAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleColorTok"


	// $ANTLR start "entryRuleIdentifierOrFuncTok"
	// InternalCSS.g:1177:1: entryRuleIdentifierOrFuncTok : ruleIdentifierOrFuncTok EOF ;
	public final void entryRuleIdentifierOrFuncTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");

		try {
			// InternalCSS.g:1181:1: ( ruleIdentifierOrFuncTok EOF )
			// InternalCSS.g:1182:1: ruleIdentifierOrFuncTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getIdentifierOrFuncTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleIdentifierOrFuncTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getIdentifierOrFuncTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleIdentifierOrFuncTok"


	// $ANTLR start "ruleIdentifierOrFuncTok"
	// InternalCSS.g:1192:1: ruleIdentifierOrFuncTok : ( ( rule__IdentifierOrFuncTok__Group__0 ) ) ;
	public final void ruleIdentifierOrFuncTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1197:2: ( ( ( rule__IdentifierOrFuncTok__Group__0 ) ) )
			// InternalCSS.g:1198:1: ( ( rule__IdentifierOrFuncTok__Group__0 ) )
			{
				// InternalCSS.g:1198:1: ( ( rule__IdentifierOrFuncTok__Group__0 ) )
				// InternalCSS.g:1199:1: ( rule__IdentifierOrFuncTok__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getGroup());
					}
					// InternalCSS.g:1200:1: ( rule__IdentifierOrFuncTok__Group__0 )
					// InternalCSS.g:1200:2: rule__IdentifierOrFuncTok__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__IdentifierOrFuncTok__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleIdentifierOrFuncTok"


	// $ANTLR start "entryRuleCssTok"
	// InternalCSS.g:1213:1: entryRuleCssTok : ruleCssTok EOF ;
	public final void entryRuleCssTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");

		try {
			// InternalCSS.g:1217:1: ( ruleCssTok EOF )
			// InternalCSS.g:1218:1: ruleCssTok EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getCssTokRule());
				}
				pushFollow(FOLLOW_1);
				ruleCssTok();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getCssTokRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleCssTok"


	// $ANTLR start "ruleCssTok"
	// InternalCSS.g:1228:1: ruleCssTok : ( ( rule__CssTok__Alternatives ) ) ;
	public final void ruleCssTok() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens("RULE_ML_COMMENT");
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1233:2: ( ( ( rule__CssTok__Alternatives ) ) )
			// InternalCSS.g:1234:1: ( ( rule__CssTok__Alternatives ) )
			{
				// InternalCSS.g:1234:1: ( ( rule__CssTok__Alternatives ) )
				// InternalCSS.g:1235:1: ( rule__CssTok__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getAlternatives());
					}
					// InternalCSS.g:1236:1: ( rule__CssTok__Alternatives )
					// InternalCSS.g:1236:2: rule__CssTok__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__CssTok__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleCssTok"


	// $ANTLR start "entryRuleURLType"
	// InternalCSS.g:1249:1: entryRuleURLType : ruleURLType EOF ;
	public final void entryRuleURLType() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();

		try {
			// InternalCSS.g:1253:1: ( ruleURLType EOF )
			// InternalCSS.g:1254:1: ruleURLType EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getURLTypeRule());
				}
				pushFollow(FOLLOW_1);
				ruleURLType();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getURLTypeRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleURLType"


	// $ANTLR start "ruleURLType"
	// InternalCSS.g:1264:1: ruleURLType : ( ( rule__URLType__Group__0 ) ) ;
	public final void ruleURLType() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1269:2: ( ( ( rule__URLType__Group__0 ) ) )
			// InternalCSS.g:1270:1: ( ( rule__URLType__Group__0 ) )
			{
				// InternalCSS.g:1270:1: ( ( rule__URLType__Group__0 ) )
				// InternalCSS.g:1271:1: ( rule__URLType__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getURLTypeAccess().getGroup());
					}
					// InternalCSS.g:1272:1: ( rule__URLType__Group__0 )
					// InternalCSS.g:1272:2: rule__URLType__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__URLType__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getURLTypeAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleURLType"


	// $ANTLR start "entryRuleValidURLSymbol"
	// InternalCSS.g:1285:1: entryRuleValidURLSymbol : ruleValidURLSymbol EOF ;
	public final void entryRuleValidURLSymbol() throws RecognitionException {
		try {
			// InternalCSS.g:1286:1: ( ruleValidURLSymbol EOF )
			// InternalCSS.g:1287:1: ruleValidURLSymbol EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getValidURLSymbolRule());
				}
				pushFollow(FOLLOW_1);
				ruleValidURLSymbol();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getValidURLSymbolRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleValidURLSymbol"


	// $ANTLR start "ruleValidURLSymbol"
	// InternalCSS.g:1294:1: ruleValidURLSymbol : ( ( rule__ValidURLSymbol__Alternatives ) ) ;
	public final void ruleValidURLSymbol() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1298:2: ( ( ( rule__ValidURLSymbol__Alternatives ) ) )
			// InternalCSS.g:1299:1: ( ( rule__ValidURLSymbol__Alternatives ) )
			{
				// InternalCSS.g:1299:1: ( ( rule__ValidURLSymbol__Alternatives ) )
				// InternalCSS.g:1300:1: ( rule__ValidURLSymbol__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getAlternatives());
					}
					// InternalCSS.g:1301:1: ( rule__ValidURLSymbol__Alternatives )
					// InternalCSS.g:1301:2: rule__ValidURLSymbol__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__ValidURLSymbol__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleValidURLSymbol"


	// $ANTLR start "entryRuleKeywordHack"
	// InternalCSS.g:1313:1: entryRuleKeywordHack : ruleKeywordHack EOF ;
	public final void entryRuleKeywordHack() throws RecognitionException {
		try {
			// InternalCSS.g:1314:1: ( ruleKeywordHack EOF )
			// InternalCSS.g:1315:1: ruleKeywordHack EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getKeywordHackRule());
				}
				pushFollow(FOLLOW_1);
				ruleKeywordHack();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getKeywordHackRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleKeywordHack"


	// $ANTLR start "ruleKeywordHack"
	// InternalCSS.g:1322:1: ruleKeywordHack : ( ( rule__KeywordHack__Alternatives ) ) ;
	public final void ruleKeywordHack() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1326:2: ( ( ( rule__KeywordHack__Alternatives ) ) )
			// InternalCSS.g:1327:1: ( ( rule__KeywordHack__Alternatives ) )
			{
				// InternalCSS.g:1327:1: ( ( rule__KeywordHack__Alternatives ) )
				// InternalCSS.g:1328:1: ( rule__KeywordHack__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeywordHackAccess().getAlternatives());
					}
					// InternalCSS.g:1329:1: ( rule__KeywordHack__Alternatives )
					// InternalCSS.g:1329:2: rule__KeywordHack__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__KeywordHack__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeywordHackAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleKeywordHack"


	// $ANTLR start "entryRuleValidURL"
	// InternalCSS.g:1341:1: entryRuleValidURL : ruleValidURL EOF ;
	public final void entryRuleValidURL() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();

		try {
			// InternalCSS.g:1345:1: ( ruleValidURL EOF )
			// InternalCSS.g:1346:1: ruleValidURL EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getValidURLRule());
				}
				pushFollow(FOLLOW_1);
				ruleValidURL();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getValidURLRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleValidURL"


	// $ANTLR start "ruleValidURL"
	// InternalCSS.g:1356:1: ruleValidURL : ( ( rule__ValidURL__Alternatives ) ) ;
	public final void ruleValidURL() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1361:2: ( ( ( rule__ValidURL__Alternatives ) ) )
			// InternalCSS.g:1362:1: ( ( rule__ValidURL__Alternatives ) )
			{
				// InternalCSS.g:1362:1: ( ( rule__ValidURL__Alternatives ) )
				// InternalCSS.g:1363:1: ( rule__ValidURL__Alternatives )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getAlternatives());
					}
					// InternalCSS.g:1364:1: ( rule__ValidURL__Alternatives )
					// InternalCSS.g:1364:2: rule__ValidURL__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__ValidURL__Alternatives();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getAlternatives());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleValidURL"


	// $ANTLR start "entryRuleIdentifier"
	// InternalCSS.g:1377:1: entryRuleIdentifier : ruleIdentifier EOF ;
	public final void entryRuleIdentifier() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();

		try {
			// InternalCSS.g:1381:1: ( ruleIdentifier EOF )
			// InternalCSS.g:1382:1: ruleIdentifier EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getIdentifierRule());
				}
				pushFollow(FOLLOW_1);
				ruleIdentifier();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getIdentifierRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleIdentifier"


	// $ANTLR start "ruleIdentifier"
	// InternalCSS.g:1392:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
	public final void ruleIdentifier() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1397:2: ( ( ( rule__Identifier__Group__0 ) ) )
			// InternalCSS.g:1398:1: ( ( rule__Identifier__Group__0 ) )
			{
				// InternalCSS.g:1398:1: ( ( rule__Identifier__Group__0 ) )
				// InternalCSS.g:1399:1: ( rule__Identifier__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getGroup());
					}
					// InternalCSS.g:1400:1: ( rule__Identifier__Group__0 )
					// InternalCSS.g:1400:2: rule__Identifier__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Identifier__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleIdentifier"


	// $ANTLR start "entryRuleNum"
	// InternalCSS.g:1413:1: entryRuleNum : ruleNum EOF ;
	public final void entryRuleNum() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();

		try {
			// InternalCSS.g:1417:1: ( ruleNum EOF )
			// InternalCSS.g:1418:1: ruleNum EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getNumRule());
				}
				pushFollow(FOLLOW_1);
				ruleNum();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getNumRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "entryRuleNum"


	// $ANTLR start "ruleNum"
	// InternalCSS.g:1428:1: ruleNum : ( ( rule__Num__Group__0 ) ) ;
	public final void ruleNum() throws RecognitionException {

		HiddenTokens myHiddenTokenState = ((XtextTokenStream) input).setHiddenTokens();
		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1433:2: ( ( ( rule__Num__Group__0 ) ) )
			// InternalCSS.g:1434:1: ( ( rule__Num__Group__0 ) )
			{
				// InternalCSS.g:1434:1: ( ( rule__Num__Group__0 ) )
				// InternalCSS.g:1435:1: ( rule__Num__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getGroup());
					}
					// InternalCSS.g:1436:1: ( rule__Num__Group__0 )
					// InternalCSS.g:1436:2: rule__Num__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Num__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);
			myHiddenTokenState.restore();

		}
		return;
	}
	// $ANTLR end "ruleNum"


	// $ANTLR start "entryRuleHex"
	// InternalCSS.g:1449:1: entryRuleHex : ruleHex EOF ;
	public final void entryRuleHex() throws RecognitionException {
		try {
			// InternalCSS.g:1450:1: ( ruleHex EOF )
			// InternalCSS.g:1451:1: ruleHex EOF
			{
				if (state.backtracking == 0) {
					before(grammarAccess.getHexRule());
				}
				pushFollow(FOLLOW_1);
				ruleHex();

				state._fsp--;
				if (state.failed) {
					return;
				}
				if (state.backtracking == 0) {
					after(grammarAccess.getHexRule());
				}
				match(input, EOF, FOLLOW_2);
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleHex"


	// $ANTLR start "ruleHex"
	// InternalCSS.g:1458:1: ruleHex : ( ( rule__Hex__Group__0 ) ) ;
	public final void ruleHex() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1462:2: ( ( ( rule__Hex__Group__0 ) ) )
			// InternalCSS.g:1463:1: ( ( rule__Hex__Group__0 ) )
			{
				// InternalCSS.g:1463:1: ( ( rule__Hex__Group__0 ) )
				// InternalCSS.g:1464:1: ( rule__Hex__Group__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getHexAccess().getGroup());
					}
					// InternalCSS.g:1465:1: ( rule__Hex__Group__0 )
					// InternalCSS.g:1465:2: rule__Hex__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Hex__Group__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getHexAccess().getGroup());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleHex"


	// $ANTLR start "rule__Stylesheet__Alternatives_2"
	// InternalCSS.g:1477:1: rule__Stylesheet__Alternatives_2 : ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) | ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) )
	// | ( ( rule__Stylesheet__KeyframesAssignment_2_4 ) ) );
	public final void rule__Stylesheet__Alternatives_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1481:1: ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) | ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) ) | ( (
			// rule__Stylesheet__KeyframesAssignment_2_4 ) ) )
			int alt1 = 5;
			switch (input.LA(1)) {
			case RULE_DASH:
			case RULE_UNDERSCORE:
			case RULE_COLON:
			case RULE_HASHMARK:
			case RULE_ONE_HEX_LETTER:
			case RULE_ONE_NON_HEX_LETTER:
			case 36:
			case 39:
			case 42:
			case 49:
			case 50:
			case 51:
			case 52:
			case 60: {
				alt1 = 1;
			}
				break;
			case 26:
			case 27: {
				alt1 = 2;
			}
				break;
			case 24:
			case 25: {
				alt1 = 3;
			}
				break;
			case 28:
			case 29: {
				alt1 = 4;
			}
				break;
			case 30:
			case 31: {
				alt1 = 5;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 1, 0, input);

				throw nvae;
			}

			switch (alt1) {
			case 1:
			// InternalCSS.g:1482:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
			{
				// InternalCSS.g:1482:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
				// InternalCSS.g:1483:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0());
					}
					// InternalCSS.g:1484:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
					// InternalCSS.g:1484:2: rule__Stylesheet__RulesetAssignment_2_0
					{
						pushFollow(FOLLOW_2);
						rule__Stylesheet__RulesetAssignment_2_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1488:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
			{
				// InternalCSS.g:1488:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
				// InternalCSS.g:1489:1: ( rule__Stylesheet__MediaAssignment_2_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1());
					}
					// InternalCSS.g:1490:1: ( rule__Stylesheet__MediaAssignment_2_1 )
					// InternalCSS.g:1490:2: rule__Stylesheet__MediaAssignment_2_1
					{
						pushFollow(FOLLOW_2);
						rule__Stylesheet__MediaAssignment_2_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:1494:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
			{
				// InternalCSS.g:1494:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
				// InternalCSS.g:1495:1: ( rule__Stylesheet__PageAssignment_2_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getPageAssignment_2_2());
					}
					// InternalCSS.g:1496:1: ( rule__Stylesheet__PageAssignment_2_2 )
					// InternalCSS.g:1496:2: rule__Stylesheet__PageAssignment_2_2
					{
						pushFollow(FOLLOW_2);
						rule__Stylesheet__PageAssignment_2_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getPageAssignment_2_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:1500:6: ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) )
			{
				// InternalCSS.g:1500:6: ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) )
				// InternalCSS.g:1501:1: ( rule__Stylesheet__Font_faceAssignment_2_3 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getFont_faceAssignment_2_3());
					}
					// InternalCSS.g:1502:1: ( rule__Stylesheet__Font_faceAssignment_2_3 )
					// InternalCSS.g:1502:2: rule__Stylesheet__Font_faceAssignment_2_3
					{
						pushFollow(FOLLOW_2);
						rule__Stylesheet__Font_faceAssignment_2_3();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getFont_faceAssignment_2_3());
					}

				}


			}
				break;
			case 5:
			// InternalCSS.g:1506:6: ( ( rule__Stylesheet__KeyframesAssignment_2_4 ) )
			{
				// InternalCSS.g:1506:6: ( ( rule__Stylesheet__KeyframesAssignment_2_4 ) )
				// InternalCSS.g:1507:1: ( rule__Stylesheet__KeyframesAssignment_2_4 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getKeyframesAssignment_2_4());
					}
					// InternalCSS.g:1508:1: ( rule__Stylesheet__KeyframesAssignment_2_4 )
					// InternalCSS.g:1508:2: rule__Stylesheet__KeyframesAssignment_2_4
					{
						pushFollow(FOLLOW_2);
						rule__Stylesheet__KeyframesAssignment_2_4();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getKeyframesAssignment_2_4());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Alternatives_2"


	// $ANTLR start "rule__Charset__Alternatives_0"
	// InternalCSS.g:1517:1: rule__Charset__Alternatives_0 : ( ( '@charset' ) | ( '@CHARSET' ) );
	public final void rule__Charset__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1521:1: ( ( '@charset' ) | ( '@CHARSET' ) )
			int alt2 = 2;
			int LA2_0 = input.LA(1);

			if ((LA2_0 == 20)) {
				alt2 = 1;
			} else if ((LA2_0 == 21)) {
				alt2 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

				throw nvae;
			}
			switch (alt2) {
			case 1:
			// InternalCSS.g:1522:1: ( '@charset' )
			{
				// InternalCSS.g:1522:1: ( '@charset' )
				// InternalCSS.g:1523:1: '@charset'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
					}
					match(input, 20, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1530:6: ( '@CHARSET' )
			{
				// InternalCSS.g:1530:6: ( '@CHARSET' )
				// InternalCSS.g:1531:1: '@CHARSET'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1());
					}
					match(input, 21, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__Alternatives_0"


	// $ANTLR start "rule__ImportExpression__Alternatives_0"
	// InternalCSS.g:1543:1: rule__ImportExpression__Alternatives_0 : ( ( '@import' ) | ( '@IMPORT' ) );
	public final void rule__ImportExpression__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1547:1: ( ( '@import' ) | ( '@IMPORT' ) )
			int alt3 = 2;
			int LA3_0 = input.LA(1);

			if ((LA3_0 == 22)) {
				alt3 = 1;
			} else if ((LA3_0 == 23)) {
				alt3 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

				throw nvae;
			}
			switch (alt3) {
			case 1:
			// InternalCSS.g:1548:1: ( '@import' )
			{
				// InternalCSS.g:1548:1: ( '@import' )
				// InternalCSS.g:1549:1: '@import'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0());
					}
					match(input, 22, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1556:6: ( '@IMPORT' )
			{
				// InternalCSS.g:1556:6: ( '@IMPORT' )
				// InternalCSS.g:1557:1: '@IMPORT'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_1());
					}
					match(input, 23, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Alternatives_0"


	// $ANTLR start "rule__ImportExpression__Alternatives_1"
	// InternalCSS.g:1569:1: rule__ImportExpression__Alternatives_1 : ( ( ( rule__ImportExpression__ValueAssignment_1_0 ) ) | ( ( rule__ImportExpression__Group_1_1__0 ) ) );
	public final void rule__ImportExpression__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1573:1: ( ( ( rule__ImportExpression__ValueAssignment_1_0 ) ) | ( ( rule__ImportExpression__Group_1_1__0 ) ) )
			int alt4 = 2;
			int LA4_0 = input.LA(1);

			if ((LA4_0 == RULE_CSSSTRING)) {
				alt4 = 1;
			} else if ((LA4_0 == 64)) {
				alt4 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

				throw nvae;
			}
			switch (alt4) {
			case 1:
			// InternalCSS.g:1574:1: ( ( rule__ImportExpression__ValueAssignment_1_0 ) )
			{
				// InternalCSS.g:1574:1: ( ( rule__ImportExpression__ValueAssignment_1_0 ) )
				// InternalCSS.g:1575:1: ( rule__ImportExpression__ValueAssignment_1_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getValueAssignment_1_0());
					}
					// InternalCSS.g:1576:1: ( rule__ImportExpression__ValueAssignment_1_0 )
					// InternalCSS.g:1576:2: rule__ImportExpression__ValueAssignment_1_0
					{
						pushFollow(FOLLOW_2);
						rule__ImportExpression__ValueAssignment_1_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getValueAssignment_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1580:6: ( ( rule__ImportExpression__Group_1_1__0 ) )
			{
				// InternalCSS.g:1580:6: ( ( rule__ImportExpression__Group_1_1__0 ) )
				// InternalCSS.g:1581:1: ( rule__ImportExpression__Group_1_1__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getGroup_1_1());
					}
					// InternalCSS.g:1582:1: ( rule__ImportExpression__Group_1_1__0 )
					// InternalCSS.g:1582:2: rule__ImportExpression__Group_1_1__0
					{
						pushFollow(FOLLOW_2);
						rule__ImportExpression__Group_1_1__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getGroup_1_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Alternatives_1"


	// $ANTLR start "rule__Page__Alternatives_1"
	// InternalCSS.g:1591:1: rule__Page__Alternatives_1 : ( ( '@page' ) | ( '@PAGE' ) );
	public final void rule__Page__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1595:1: ( ( '@page' ) | ( '@PAGE' ) )
			int alt5 = 2;
			int LA5_0 = input.LA(1);

			if ((LA5_0 == 24)) {
				alt5 = 1;
			} else if ((LA5_0 == 25)) {
				alt5 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 5, 0, input);

				throw nvae;
			}
			switch (alt5) {
			case 1:
			// InternalCSS.g:1596:1: ( '@page' )
			{
				// InternalCSS.g:1596:1: ( '@page' )
				// InternalCSS.g:1597:1: '@page'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getPageKeyword_1_0());
					}
					match(input, 24, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getPageKeyword_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1604:6: ( '@PAGE' )
			{
				// InternalCSS.g:1604:6: ( '@PAGE' )
				// InternalCSS.g:1605:1: '@PAGE'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getPAGEKeyword_1_1());
					}
					match(input, 25, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getPAGEKeyword_1_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Alternatives_1"


	// $ANTLR start "rule__Media__Alternatives_0"
	// InternalCSS.g:1617:1: rule__Media__Alternatives_0 : ( ( '@media' ) | ( '@MEDIA' ) );
	public final void rule__Media__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1621:1: ( ( '@media' ) | ( '@MEDIA' ) )
			int alt6 = 2;
			int LA6_0 = input.LA(1);

			if ((LA6_0 == 26)) {
				alt6 = 1;
			} else if ((LA6_0 == 27)) {
				alt6 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 6, 0, input);

				throw nvae;
			}
			switch (alt6) {
			case 1:
			// InternalCSS.g:1622:1: ( '@media' )
			{
				// InternalCSS.g:1622:1: ( '@media' )
				// InternalCSS.g:1623:1: '@media'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getMediaKeyword_0_0());
					}
					match(input, 26, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getMediaKeyword_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1630:6: ( '@MEDIA' )
			{
				// InternalCSS.g:1630:6: ( '@MEDIA' )
				// InternalCSS.g:1631:1: '@MEDIA'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
					}
					match(input, 27, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Alternatives_0"


	// $ANTLR start "rule__Font_face__Alternatives_1"
	// InternalCSS.g:1643:1: rule__Font_face__Alternatives_1 : ( ( '@font-face' ) | ( '@FONT-FACE' ) );
	public final void rule__Font_face__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1647:1: ( ( '@font-face' ) | ( '@FONT-FACE' ) )
			int alt7 = 2;
			int LA7_0 = input.LA(1);

			if ((LA7_0 == 28)) {
				alt7 = 1;
			} else if ((LA7_0 == 29)) {
				alt7 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 7, 0, input);

				throw nvae;
			}
			switch (alt7) {
			case 1:
			// InternalCSS.g:1648:1: ( '@font-face' )
			{
				// InternalCSS.g:1648:1: ( '@font-face' )
				// InternalCSS.g:1649:1: '@font-face'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getFontFaceKeyword_1_0());
					}
					match(input, 28, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getFontFaceKeyword_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1656:6: ( '@FONT-FACE' )
			{
				// InternalCSS.g:1656:6: ( '@FONT-FACE' )
				// InternalCSS.g:1657:1: '@FONT-FACE'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getFONTFACEKeyword_1_1());
					}
					match(input, 29, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getFONTFACEKeyword_1_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Alternatives_1"


	// $ANTLR start "rule__Keyframes__Alternatives_1"
	// InternalCSS.g:1669:1: rule__Keyframes__Alternatives_1 : ( ( '@keyframes' ) | ( '@KEYFRAMES' ) );
	public final void rule__Keyframes__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1673:1: ( ( '@keyframes' ) | ( '@KEYFRAMES' ) )
			int alt8 = 2;
			int LA8_0 = input.LA(1);

			if ((LA8_0 == 30)) {
				alt8 = 1;
			} else if ((LA8_0 == 31)) {
				alt8 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 8, 0, input);

				throw nvae;
			}
			switch (alt8) {
			case 1:
			// InternalCSS.g:1674:1: ( '@keyframes' )
			{
				// InternalCSS.g:1674:1: ( '@keyframes' )
				// InternalCSS.g:1675:1: '@keyframes'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getKeyframesKeyword_1_0());
					}
					match(input, 30, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getKeyframesKeyword_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1682:6: ( '@KEYFRAMES' )
			{
				// InternalCSS.g:1682:6: ( '@KEYFRAMES' )
				// InternalCSS.g:1683:1: '@KEYFRAMES'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getKEYFRAMESKeyword_1_1());
					}
					match(input, 31, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getKEYFRAMESKeyword_1_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Alternatives_1"


	// $ANTLR start "rule__Keyframe_selector__Alternatives_0"
	// InternalCSS.g:1695:1: rule__Keyframe_selector__Alternatives_0 : ( ( ( rule__Keyframe_selector__TypeAssignment_0_0 ) ) | ( ( rule__Keyframe_selector__Group_0_1__0 ) ) );
	public final void rule__Keyframe_selector__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1699:1: ( ( ( rule__Keyframe_selector__TypeAssignment_0_0 ) ) | ( ( rule__Keyframe_selector__Group_0_1__0 ) ) )
			int alt9 = 2;
			switch (input.LA(1)) {
			case RULE_DASH: {
				int LA9_1 = input.LA(2);

				if ((LA9_1 == RULE_ONE_INT || LA9_1 == 39)) {
					alt9 = 2;
				} else if ((LA9_1 == RULE_UNDERSCORE || (LA9_1 >= RULE_ONE_HEX_LETTER && LA9_1 <= RULE_ONE_NON_HEX_LETTER) || (LA9_1 >= 49 && LA9_1 <= 52))) {
					alt9 = 1;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae = new NoViableAltException("", 9, 1, input);

					throw nvae;
				}
			}
				break;
			case RULE_UNDERSCORE:
			case RULE_ONE_HEX_LETTER:
			case RULE_ONE_NON_HEX_LETTER:
			case 49:
			case 50:
			case 51:
			case 52: {
				alt9 = 1;
			}
				break;
			case RULE_PLUS:
			case RULE_ONE_INT:
			case 39: {
				alt9 = 2;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 9, 0, input);

				throw nvae;
			}

			switch (alt9) {
			case 1:
			// InternalCSS.g:1700:1: ( ( rule__Keyframe_selector__TypeAssignment_0_0 ) )
			{
				// InternalCSS.g:1700:1: ( ( rule__Keyframe_selector__TypeAssignment_0_0 ) )
				// InternalCSS.g:1701:1: ( rule__Keyframe_selector__TypeAssignment_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getTypeAssignment_0_0());
					}
					// InternalCSS.g:1702:1: ( rule__Keyframe_selector__TypeAssignment_0_0 )
					// InternalCSS.g:1702:2: rule__Keyframe_selector__TypeAssignment_0_0
					{
						pushFollow(FOLLOW_2);
						rule__Keyframe_selector__TypeAssignment_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getTypeAssignment_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1706:6: ( ( rule__Keyframe_selector__Group_0_1__0 ) )
			{
				// InternalCSS.g:1706:6: ( ( rule__Keyframe_selector__Group_0_1__0 ) )
				// InternalCSS.g:1707:1: ( rule__Keyframe_selector__Group_0_1__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getGroup_0_1());
					}
					// InternalCSS.g:1708:1: ( rule__Keyframe_selector__Group_0_1__0 )
					// InternalCSS.g:1708:2: rule__Keyframe_selector__Group_0_1__0
					{
						pushFollow(FOLLOW_2);
						rule__Keyframe_selector__Group_0_1__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getGroup_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Alternatives_0"


	// $ANTLR start "rule__Selector__Alternatives_1"
	// InternalCSS.g:1717:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) );
	public final void rule__Selector__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1721:1: ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) )
			int alt10 = 2;
			int LA10_0 = input.LA(1);

			if ((LA10_0 == RULE_PLUS || (LA10_0 >= 37 && LA10_0 <= 38))) {
				alt10 = 1;
			} else if ((LA10_0 == RULE_WS)) {
				alt10 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 10, 0, input);

				throw nvae;
			}
			switch (alt10) {
			case 1:
			// InternalCSS.g:1722:1: ( ( rule__Selector__Group_1_0__0 ) )
			{
				// InternalCSS.g:1722:1: ( ( rule__Selector__Group_1_0__0 ) )
				// InternalCSS.g:1723:1: ( rule__Selector__Group_1_0__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getGroup_1_0());
					}
					// InternalCSS.g:1724:1: ( rule__Selector__Group_1_0__0 )
					// InternalCSS.g:1724:2: rule__Selector__Group_1_0__0
					{
						pushFollow(FOLLOW_2);
						rule__Selector__Group_1_0__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getGroup_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1728:6: ( ( rule__Selector__Group_1_1__0 ) )
			{
				// InternalCSS.g:1728:6: ( ( rule__Selector__Group_1_1__0 ) )
				// InternalCSS.g:1729:1: ( rule__Selector__Group_1_1__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getGroup_1_1());
					}
					// InternalCSS.g:1730:1: ( rule__Selector__Group_1_1__0 )
					// InternalCSS.g:1730:2: rule__Selector__Group_1_1__0
					{
						pushFollow(FOLLOW_2);
						rule__Selector__Group_1_1__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getGroup_1_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Alternatives_1"


	// $ANTLR start "rule__SimpleSelectorForNegation__Alternatives"
	// InternalCSS.g:1739:1: rule__SimpleSelectorForNegation__Alternatives : ( ( ( rule__SimpleSelectorForNegation__Group_0__0 ) ) | ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( (
	// rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) ) );
	public final void rule__SimpleSelectorForNegation__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1743:1: ( ( ( rule__SimpleSelectorForNegation__Group_0__0 ) ) | ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) ) )
			int alt12 = 2;
			int LA12_0 = input.LA(1);

			if (((LA12_0 >= RULE_DASH && LA12_0 <= RULE_UNDERSCORE) || (LA12_0 >= RULE_ONE_HEX_LETTER && LA12_0 <= RULE_ONE_NON_HEX_LETTER) || LA12_0 == 36 || (LA12_0 >= 49 && LA12_0 <= 52) || LA12_0 == 60)) {
				alt12 = 1;
			} else if (((LA12_0 >= RULE_COLON && LA12_0 <= RULE_HASHMARK) || LA12_0 == 39 || LA12_0 == 42)) {
				alt12 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 12, 0, input);

				throw nvae;
			}
			switch (alt12) {
			case 1:
			// InternalCSS.g:1744:1: ( ( rule__SimpleSelectorForNegation__Group_0__0 ) )
			{
				// InternalCSS.g:1744:1: ( ( rule__SimpleSelectorForNegation__Group_0__0 ) )
				// InternalCSS.g:1745:1: ( rule__SimpleSelectorForNegation__Group_0__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getGroup_0());
					}
					// InternalCSS.g:1746:1: ( rule__SimpleSelectorForNegation__Group_0__0 )
					// InternalCSS.g:1746:2: rule__SimpleSelectorForNegation__Group_0__0
					{
						pushFollow(FOLLOW_2);
						rule__SimpleSelectorForNegation__Group_0__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getGroup_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1750:6: ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) )
			{
				// InternalCSS.g:1750:6: ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) )
				// InternalCSS.g:1751:1: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* )
				{
					// InternalCSS.g:1751:1: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) )
					// InternalCSS.g:1752:1: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1());
						}
						// InternalCSS.g:1753:1: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )
						// InternalCSS.g:1753:2: rule__SimpleSelectorForNegation__SubSelectorsAssignment_1
						{
							pushFollow(FOLLOW_3);
							rule__SimpleSelectorForNegation__SubSelectorsAssignment_1();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1());
						}

					}

					// InternalCSS.g:1756:1: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* )
					// InternalCSS.g:1757:1: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1());
						}
						// InternalCSS.g:1758:1: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )*
						loop11: do {
							int alt11 = 2;
							int LA11_0 = input.LA(1);

							if (((LA11_0 >= RULE_COLON && LA11_0 <= RULE_HASHMARK) || LA11_0 == 39 || LA11_0 == 42)) {
								alt11 = 1;
							}


							switch (alt11) {
							case 1:
							// InternalCSS.g:1758:2: rule__SimpleSelectorForNegation__SubSelectorsAssignment_1
							{
								pushFollow(FOLLOW_3);
								rule__SimpleSelectorForNegation__SubSelectorsAssignment_1();

								state._fsp--;
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop11;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1());
						}

					}


				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__Alternatives"


	// $ANTLR start "rule__SimpleSelectorForNegation__Alternatives_0_0"
	// InternalCSS.g:1768:1: rule__SimpleSelectorForNegation__Alternatives_0_0 : ( ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) ) );
	public final void rule__SimpleSelectorForNegation__Alternatives_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1772:1: ( ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) ) )
			int alt13 = 2;
			alt13 = dfa13.predict(input);
			switch (alt13) {
			case 1:
			// InternalCSS.g:1773:1: ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) )
			{
				// InternalCSS.g:1773:1: ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) )
				// InternalCSS.g:1774:1: ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getElementAssignment_0_0_0());
					}
					// InternalCSS.g:1775:1: ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 )
					// InternalCSS.g:1775:2: rule__SimpleSelectorForNegation__ElementAssignment_0_0_0
					{
						pushFollow(FOLLOW_2);
						rule__SimpleSelectorForNegation__ElementAssignment_0_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getElementAssignment_0_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1779:6: ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) )
			{
				// InternalCSS.g:1779:6: ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) )
				// InternalCSS.g:1780:1: ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalAssignment_0_0_1());
					}
					// InternalCSS.g:1781:1: ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 )
					// InternalCSS.g:1781:2: rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1
					{
						pushFollow(FOLLOW_2);
						rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalAssignment_0_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__Alternatives_0_0"


	// $ANTLR start "rule__SubSelectorForNegation__Alternatives"
	// InternalCSS.g:1790:1: rule__SubSelectorForNegation__Alternatives : ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClass ) );
	public final void rule__SubSelectorForNegation__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1794:1: ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClass ) )
			int alt14 = 4;
			switch (input.LA(1)) {
			case RULE_HASHMARK: {
				alt14 = 1;
			}
				break;
			case 39: {
				alt14 = 2;
			}
				break;
			case 42: {
				alt14 = 3;
			}
				break;
			case RULE_COLON: {
				alt14 = 4;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 14, 0, input);

				throw nvae;
			}

			switch (alt14) {
			case 1:
			// InternalCSS.g:1795:1: ( ruleIdSelector )
			{
				// InternalCSS.g:1795:1: ( ruleIdSelector )
				// InternalCSS.g:1796:1: ruleIdSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1801:6: ( ruleClassSelector )
			{
				// InternalCSS.g:1801:6: ( ruleClassSelector )
				// InternalCSS.g:1802:1: ruleClassSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1());
					}
					pushFollow(FOLLOW_2);
					ruleClassSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:1807:6: ( ruleAttributeSelector )
			{
				// InternalCSS.g:1807:6: ( ruleAttributeSelector )
				// InternalCSS.g:1808:1: ruleAttributeSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2());
					}
					pushFollow(FOLLOW_2);
					ruleAttributeSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:1813:6: ( rulePseudoClass )
			{
				// InternalCSS.g:1813:6: ( rulePseudoClass )
				// InternalCSS.g:1814:1: rulePseudoClass
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3());
					}
					pushFollow(FOLLOW_2);
					rulePseudoClass();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SubSelectorForNegation__Alternatives"


	// $ANTLR start "rule__Simple_selector__Alternatives"
	// InternalCSS.g:1824:1: rule__Simple_selector__Alternatives : ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) );
	public final void rule__Simple_selector__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1828:1: ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) )
			int alt16 = 2;
			int LA16_0 = input.LA(1);

			if (((LA16_0 >= RULE_DASH && LA16_0 <= RULE_UNDERSCORE) || (LA16_0 >= RULE_ONE_HEX_LETTER && LA16_0 <= RULE_ONE_NON_HEX_LETTER) || LA16_0 == 36 || (LA16_0 >= 49 && LA16_0 <= 52) || LA16_0 == 60)) {
				alt16 = 1;
			} else if (((LA16_0 >= RULE_COLON && LA16_0 <= RULE_HASHMARK) || LA16_0 == 39 || LA16_0 == 42)) {
				alt16 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 16, 0, input);

				throw nvae;
			}
			switch (alt16) {
			case 1:
			// InternalCSS.g:1829:1: ( ( rule__Simple_selector__Group_0__0 ) )
			{
				// InternalCSS.g:1829:1: ( ( rule__Simple_selector__Group_0__0 ) )
				// InternalCSS.g:1830:1: ( rule__Simple_selector__Group_0__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getGroup_0());
					}
					// InternalCSS.g:1831:1: ( rule__Simple_selector__Group_0__0 )
					// InternalCSS.g:1831:2: rule__Simple_selector__Group_0__0
					{
						pushFollow(FOLLOW_2);
						rule__Simple_selector__Group_0__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getGroup_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1835:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
			{
				// InternalCSS.g:1835:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
				// InternalCSS.g:1836:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
				{
					// InternalCSS.g:1836:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) )
					// InternalCSS.g:1837:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1());
						}
						// InternalCSS.g:1838:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
						// InternalCSS.g:1838:2: rule__Simple_selector__SubSelectorsAssignment_1
						{
							pushFollow(FOLLOW_3);
							rule__Simple_selector__SubSelectorsAssignment_1();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1());
						}

					}

					// InternalCSS.g:1841:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
					// InternalCSS.g:1842:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1());
						}
						// InternalCSS.g:1843:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
						loop15: do {
							int alt15 = 2;
							int LA15_0 = input.LA(1);

							if (((LA15_0 >= RULE_COLON && LA15_0 <= RULE_HASHMARK) || LA15_0 == 39 || LA15_0 == 42)) {
								alt15 = 1;
							}


							switch (alt15) {
							case 1:
							// InternalCSS.g:1843:2: rule__Simple_selector__SubSelectorsAssignment_1
							{
								pushFollow(FOLLOW_3);
								rule__Simple_selector__SubSelectorsAssignment_1();

								state._fsp--;
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop15;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1());
						}

					}


				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__Alternatives"


	// $ANTLR start "rule__Simple_selector__Alternatives_0_0"
	// InternalCSS.g:1853:1: rule__Simple_selector__Alternatives_0_0 : ( ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) ) | ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) ) );
	public final void rule__Simple_selector__Alternatives_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1857:1: ( ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) ) | ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) ) )
			int alt17 = 2;
			alt17 = dfa17.predict(input);
			switch (alt17) {
			case 1:
			// InternalCSS.g:1858:1: ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) )
			{
				// InternalCSS.g:1858:1: ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) )
				// InternalCSS.g:1859:1: ( rule__Simple_selector__ElementAssignment_0_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0_0());
					}
					// InternalCSS.g:1860:1: ( rule__Simple_selector__ElementAssignment_0_0_0 )
					// InternalCSS.g:1860:2: rule__Simple_selector__ElementAssignment_0_0_0
					{
						pushFollow(FOLLOW_2);
						rule__Simple_selector__ElementAssignment_0_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1864:6: ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) )
			{
				// InternalCSS.g:1864:6: ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) )
				// InternalCSS.g:1865:1: ( rule__Simple_selector__UniversalAssignment_0_0_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getUniversalAssignment_0_0_1());
					}
					// InternalCSS.g:1866:1: ( rule__Simple_selector__UniversalAssignment_0_0_1 )
					// InternalCSS.g:1866:2: rule__Simple_selector__UniversalAssignment_0_0_1
					{
						pushFollow(FOLLOW_2);
						rule__Simple_selector__UniversalAssignment_0_0_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getUniversalAssignment_0_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__Alternatives_0_0"


	// $ANTLR start "rule__SubSelector__Alternatives"
	// InternalCSS.g:1875:1: rule__SubSelector__Alternatives : ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClassOrFunc ) );
	public final void rule__SubSelector__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1879:1: ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClassOrFunc ) )
			int alt18 = 4;
			switch (input.LA(1)) {
			case RULE_HASHMARK: {
				alt18 = 1;
			}
				break;
			case 39: {
				alt18 = 2;
			}
				break;
			case 42: {
				alt18 = 3;
			}
				break;
			case RULE_COLON: {
				alt18 = 4;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 18, 0, input);

				throw nvae;
			}

			switch (alt18) {
			case 1:
			// InternalCSS.g:1880:1: ( ruleIdSelector )
			{
				// InternalCSS.g:1880:1: ( ruleIdSelector )
				// InternalCSS.g:1881:1: ruleIdSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1886:6: ( ruleClassSelector )
			{
				// InternalCSS.g:1886:6: ( ruleClassSelector )
				// InternalCSS.g:1887:1: ruleClassSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1());
					}
					pushFollow(FOLLOW_2);
					ruleClassSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:1892:6: ( ruleAttributeSelector )
			{
				// InternalCSS.g:1892:6: ( ruleAttributeSelector )
				// InternalCSS.g:1893:1: ruleAttributeSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2());
					}
					pushFollow(FOLLOW_2);
					ruleAttributeSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:1898:6: ( rulePseudoClassOrFunc )
			{
				// InternalCSS.g:1898:6: ( rulePseudoClassOrFunc )
				// InternalCSS.g:1899:1: rulePseudoClassOrFunc
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3());
					}
					pushFollow(FOLLOW_2);
					rulePseudoClassOrFunc();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SubSelector__Alternatives"


	// $ANTLR start "rule__AttributeSelector__OpAlternatives_3_0_0"
	// InternalCSS.g:1909:1: rule__AttributeSelector__OpAlternatives_3_0_0 : ( ( '^=' ) | ( '$=' ) | ( '*=' ) | ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) );
	public final void rule__AttributeSelector__OpAlternatives_3_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1913:1: ( ( '^=' ) | ( '$=' ) | ( '*=' ) | ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) )
			int alt19 = 6;
			switch (input.LA(1)) {
			case 32: {
				alt19 = 1;
			}
				break;
			case 33: {
				alt19 = 2;
			}
				break;
			case 34: {
				alt19 = 3;
			}
				break;
			case 35: {
				alt19 = 4;
			}
				break;
			case RULE_INCLUDES: {
				alt19 = 5;
			}
				break;
			case RULE_DASHMATCH: {
				alt19 = 6;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 19, 0, input);

				throw nvae;
			}

			switch (alt19) {
			case 1:
			// InternalCSS.g:1914:1: ( '^=' )
			{
				// InternalCSS.g:1914:1: ( '^=' )
				// InternalCSS.g:1915:1: '^='
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0());
					}
					match(input, 32, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1922:6: ( '$=' )
			{
				// InternalCSS.g:1922:6: ( '$=' )
				// InternalCSS.g:1923:1: '$='
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1());
					}
					match(input, 33, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:1930:6: ( '*=' )
			{
				// InternalCSS.g:1930:6: ( '*=' )
				// InternalCSS.g:1931:1: '*='
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2());
					}
					match(input, 34, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:1938:6: ( '=' )
			{
				// InternalCSS.g:1938:6: ( '=' )
				// InternalCSS.g:1939:1: '='
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3());
					}
					match(input, 35, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3());
					}

				}


			}
				break;
			case 5:
			// InternalCSS.g:1946:6: ( RULE_INCLUDES )
			{
				// InternalCSS.g:1946:6: ( RULE_INCLUDES )
				// InternalCSS.g:1947:1: RULE_INCLUDES
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4());
					}
					match(input, RULE_INCLUDES, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4());
					}

				}


			}
				break;
			case 6:
			// InternalCSS.g:1952:6: ( RULE_DASHMATCH )
			{
				// InternalCSS.g:1952:6: ( RULE_DASHMATCH )
				// InternalCSS.g:1953:1: RULE_DASHMATCH
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5());
					}
					match(input, RULE_DASHMATCH, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__OpAlternatives_3_0_0"


	// $ANTLR start "rule__AttributeSelector__ValueAlternatives_3_1_0"
	// InternalCSS.g:1963:1: rule__AttributeSelector__ValueAlternatives_3_1_0 : ( ( ruleIdentifier ) | ( RULE_CSSSTRING ) );
	public final void rule__AttributeSelector__ValueAlternatives_3_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1967:1: ( ( ruleIdentifier ) | ( RULE_CSSSTRING ) )
			int alt20 = 2;
			int LA20_0 = input.LA(1);

			if (((LA20_0 >= RULE_DASH && LA20_0 <= RULE_UNDERSCORE) || (LA20_0 >= RULE_ONE_HEX_LETTER && LA20_0 <= RULE_ONE_NON_HEX_LETTER) || (LA20_0 >= 49 && LA20_0 <= 52))) {
				alt20 = 1;
			} else if ((LA20_0 == RULE_CSSSTRING)) {
				alt20 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 20, 0, input);

				throw nvae;
			}
			switch (alt20) {
			case 1:
			// InternalCSS.g:1968:1: ( ruleIdentifier )
			{
				// InternalCSS.g:1968:1: ( ruleIdentifier )
				// InternalCSS.g:1969:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1974:6: ( RULE_CSSSTRING )
			{
				// InternalCSS.g:1974:6: ( RULE_CSSSTRING )
				// InternalCSS.g:1975:1: RULE_CSSSTRING
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getValueCSSSTRINGTerminalRuleCall_3_1_0_1());
					}
					match(input, RULE_CSSSTRING, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getValueCSSSTRINGTerminalRuleCall_3_1_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__ValueAlternatives_3_1_0"


	// $ANTLR start "rule__Css_namespace_prefix__Alternatives_0"
	// InternalCSS.g:1985:1: rule__Css_namespace_prefix__Alternatives_0 : ( ( ruleIdentifier ) | ( '*' ) );
	public final void rule__Css_namespace_prefix__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:1989:1: ( ( ruleIdentifier ) | ( '*' ) )
			int alt21 = 2;
			int LA21_0 = input.LA(1);

			if (((LA21_0 >= RULE_DASH && LA21_0 <= RULE_UNDERSCORE) || (LA21_0 >= RULE_ONE_HEX_LETTER && LA21_0 <= RULE_ONE_NON_HEX_LETTER) || (LA21_0 >= 49 && LA21_0 <= 52))) {
				alt21 = 1;
			} else if ((LA21_0 == 36)) {
				alt21 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 21, 0, input);

				throw nvae;
			}
			switch (alt21) {
			case 1:
			// InternalCSS.g:1990:1: ( ruleIdentifier )
			{
				// InternalCSS.g:1990:1: ( ruleIdentifier )
				// InternalCSS.g:1991:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_namespace_prefixAccess().getIdentifierParserRuleCall_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_namespace_prefixAccess().getIdentifierParserRuleCall_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:1996:6: ( '*' )
			{
				// InternalCSS.g:1996:6: ( '*' )
				// InternalCSS.g:1997:1: '*'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1());
					}
					match(input, 36, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_namespace_prefix__Alternatives_0"


	// $ANTLR start "rule__PseudoClassOrFunc__Alternatives"
	// InternalCSS.g:2009:1: rule__PseudoClassOrFunc__Alternatives : ( ( rulePseudoClass ) | ( rulePseudoClassFunction ) );
	public final void rule__PseudoClassOrFunc__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2013:1: ( ( rulePseudoClass ) | ( rulePseudoClassFunction ) )
			int alt22 = 2;
			alt22 = dfa22.predict(input);
			switch (alt22) {
			case 1:
			// InternalCSS.g:2014:1: ( rulePseudoClass )
			{
				// InternalCSS.g:2014:1: ( rulePseudoClass )
				// InternalCSS.g:2015:1: rulePseudoClass
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0());
					}
					pushFollow(FOLLOW_2);
					rulePseudoClass();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2020:6: ( rulePseudoClassFunction )
			{
				// InternalCSS.g:2020:6: ( rulePseudoClassFunction )
				// InternalCSS.g:2021:1: rulePseudoClassFunction
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1());
					}
					pushFollow(FOLLOW_2);
					rulePseudoClassFunction();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassOrFunc__Alternatives"


	// $ANTLR start "rule__PseudoClassFunction__Alternatives"
	// InternalCSS.g:2031:1: rule__PseudoClassFunction__Alternatives : ( ( ( rule__PseudoClassFunction__Group_0__0 ) ) | ( ( rule__PseudoClassFunction__Group_1__0 ) ) );
	public final void rule__PseudoClassFunction__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2035:1: ( ( ( rule__PseudoClassFunction__Group_0__0 ) ) | ( ( rule__PseudoClassFunction__Group_1__0 ) ) )
			int alt23 = 2;
			int LA23_0 = input.LA(1);

			if ((LA23_0 == RULE_COLON)) {
				int LA23_1 = input.LA(2);

				if ((LA23_1 == 63)) {
					alt23 = 1;
				} else if (((LA23_1 >= RULE_DASH && LA23_1 <= RULE_UNDERSCORE) || (LA23_1 >= RULE_ONE_HEX_LETTER && LA23_1 <= RULE_ONE_NON_HEX_LETTER) || (LA23_1 >= 49 && LA23_1 <= 52))) {
					alt23 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae = new NoViableAltException("", 23, 1, input);

					throw nvae;
				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 23, 0, input);

				throw nvae;
			}
			switch (alt23) {
			case 1:
			// InternalCSS.g:2036:1: ( ( rule__PseudoClassFunction__Group_0__0 ) )
			{
				// InternalCSS.g:2036:1: ( ( rule__PseudoClassFunction__Group_0__0 ) )
				// InternalCSS.g:2037:1: ( rule__PseudoClassFunction__Group_0__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getGroup_0());
					}
					// InternalCSS.g:2038:1: ( rule__PseudoClassFunction__Group_0__0 )
					// InternalCSS.g:2038:2: rule__PseudoClassFunction__Group_0__0
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassFunction__Group_0__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getGroup_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2042:6: ( ( rule__PseudoClassFunction__Group_1__0 ) )
			{
				// InternalCSS.g:2042:6: ( ( rule__PseudoClassFunction__Group_1__0 ) )
				// InternalCSS.g:2043:1: ( rule__PseudoClassFunction__Group_1__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getGroup_1());
					}
					// InternalCSS.g:2044:1: ( rule__PseudoClassFunction__Group_1__0 )
					// InternalCSS.g:2044:2: rule__PseudoClassFunction__Group_1__0
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassFunction__Group_1__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getGroup_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Alternatives"


	// $ANTLR start "rule__Combinator__Alternatives"
	// InternalCSS.g:2053:1: rule__Combinator__Alternatives : ( ( RULE_PLUS ) | ( '>' ) | ( '~' ) );
	public final void rule__Combinator__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2057:1: ( ( RULE_PLUS ) | ( '>' ) | ( '~' ) )
			int alt24 = 3;
			switch (input.LA(1)) {
			case RULE_PLUS: {
				alt24 = 1;
			}
				break;
			case 37: {
				alt24 = 2;
			}
				break;
			case 38: {
				alt24 = 3;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 24, 0, input);

				throw nvae;
			}

			switch (alt24) {
			case 1:
			// InternalCSS.g:2058:1: ( RULE_PLUS )
			{
				// InternalCSS.g:2058:1: ( RULE_PLUS )
				// InternalCSS.g:2059:1: RULE_PLUS
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0());
					}
					match(input, RULE_PLUS, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2064:6: ( '>' )
			{
				// InternalCSS.g:2064:6: ( '>' )
				// InternalCSS.g:2065:1: '>'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1());
					}
					match(input, 37, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:2072:6: ( '~' )
			{
				// InternalCSS.g:2072:6: ( '~' )
				// InternalCSS.g:2073:1: '~'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCombinatorAccess().getTildeKeyword_2());
					}
					match(input, 38, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCombinatorAccess().getTildeKeyword_2());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Combinator__Alternatives"


	// $ANTLR start "rule__SymbolTok__SymbolAlternatives_1_0"
	// InternalCSS.g:2087:1: rule__SymbolTok__SymbolAlternatives_1_0 : ( ( RULE_COMMA ) | ( RULE_PERCENT ) );
	public final void rule__SymbolTok__SymbolAlternatives_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2091:1: ( ( RULE_COMMA ) | ( RULE_PERCENT ) )
			int alt25 = 2;
			int LA25_0 = input.LA(1);

			if ((LA25_0 == RULE_COMMA)) {
				alt25 = 1;
			} else if ((LA25_0 == RULE_PERCENT)) {
				alt25 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 25, 0, input);

				throw nvae;
			}
			switch (alt25) {
			case 1:
			// InternalCSS.g:2092:1: ( RULE_COMMA )
			{
				// InternalCSS.g:2092:1: ( RULE_COMMA )
				// InternalCSS.g:2093:1: RULE_COMMA
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0());
					}
					match(input, RULE_COMMA, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2098:6: ( RULE_PERCENT )
			{
				// InternalCSS.g:2098:6: ( RULE_PERCENT )
				// InternalCSS.g:2099:1: RULE_PERCENT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1());
					}
					match(input, RULE_PERCENT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SymbolTok__SymbolAlternatives_1_0"


	// $ANTLR start "rule__CssTok__Alternatives"
	// InternalCSS.g:2109:1: rule__CssTok__Alternatives : ( ( ruleIdentifierOrFuncTok ) | ( ruleSymbolTok ) | ( ruleWSTok ) | ( ruleStringTok ) | ( ruleNumberTok ) | ( ruleUrlTok ) | ( ruleColorTok ) );
	public final void rule__CssTok__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2113:1: ( ( ruleIdentifierOrFuncTok ) | ( ruleSymbolTok ) | ( ruleWSTok ) | ( ruleStringTok ) | ( ruleNumberTok ) | ( ruleUrlTok ) | ( ruleColorTok ) )
			int alt26 = 7;
			switch (input.LA(1)) {
			case RULE_DASH: {
				int LA26_1 = input.LA(2);

				if ((LA26_1 == RULE_UNDERSCORE || (LA26_1 >= RULE_ONE_HEX_LETTER && LA26_1 <= RULE_ONE_NON_HEX_LETTER) || (LA26_1 >= 49 && LA26_1 <= 52))) {
					alt26 = 1;
				} else if ((LA26_1 == RULE_ONE_INT || LA26_1 == 39)) {
					alt26 = 5;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae = new NoViableAltException("", 26, 1, input);

					throw nvae;
				}
			}
				break;
			case RULE_UNDERSCORE:
			case RULE_ONE_HEX_LETTER:
			case RULE_ONE_NON_HEX_LETTER:
			case 49:
			case 50:
			case 51:
			case 52: {
				alt26 = 1;
			}
				break;
			case RULE_COMMA:
			case RULE_PERCENT: {
				alt26 = 2;
			}
				break;
			case RULE_WS: {
				alt26 = 3;
			}
				break;
			case RULE_CSSSTRING: {
				alt26 = 4;
			}
				break;
			case RULE_PLUS:
			case RULE_ONE_INT:
			case 39: {
				alt26 = 5;
			}
				break;
			case 64: {
				alt26 = 6;
			}
				break;
			case RULE_HASHMARK: {
				alt26 = 7;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 26, 0, input);

				throw nvae;
			}

			switch (alt26) {
			case 1:
			// InternalCSS.g:2114:1: ( ruleIdentifierOrFuncTok )
			{
				// InternalCSS.g:2114:1: ( ruleIdentifierOrFuncTok )
				// InternalCSS.g:2115:1: ruleIdentifierOrFuncTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifierOrFuncTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2120:6: ( ruleSymbolTok )
			{
				// InternalCSS.g:2120:6: ( ruleSymbolTok )
				// InternalCSS.g:2121:1: ruleSymbolTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1());
					}
					pushFollow(FOLLOW_2);
					ruleSymbolTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:2126:6: ( ruleWSTok )
			{
				// InternalCSS.g:2126:6: ( ruleWSTok )
				// InternalCSS.g:2127:1: ruleWSTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2());
					}
					pushFollow(FOLLOW_2);
					ruleWSTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:2132:6: ( ruleStringTok )
			{
				// InternalCSS.g:2132:6: ( ruleStringTok )
				// InternalCSS.g:2133:1: ruleStringTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3());
					}
					pushFollow(FOLLOW_2);
					ruleStringTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3());
					}

				}


			}
				break;
			case 5:
			// InternalCSS.g:2138:6: ( ruleNumberTok )
			{
				// InternalCSS.g:2138:6: ( ruleNumberTok )
				// InternalCSS.g:2139:1: ruleNumberTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4());
					}
					pushFollow(FOLLOW_2);
					ruleNumberTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4());
					}

				}


			}
				break;
			case 6:
			// InternalCSS.g:2144:6: ( ruleUrlTok )
			{
				// InternalCSS.g:2144:6: ( ruleUrlTok )
				// InternalCSS.g:2145:1: ruleUrlTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5());
					}
					pushFollow(FOLLOW_2);
					ruleUrlTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5());
					}

				}


			}
				break;
			case 7:
			// InternalCSS.g:2150:6: ( ruleColorTok )
			{
				// InternalCSS.g:2150:6: ( ruleColorTok )
				// InternalCSS.g:2151:1: ruleColorTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6());
					}
					pushFollow(FOLLOW_2);
					ruleColorTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__CssTok__Alternatives"


	// $ANTLR start "rule__ValidURLSymbol__Alternatives"
	// InternalCSS.g:2161:1: rule__ValidURLSymbol__Alternatives : ( ( RULE_DASH ) | ( '.' ) | ( RULE_UNDERSCORE ) | ( '~' ) | ( RULE_COLON ) | ( '/' ) | ( '?' ) | ( RULE_HASHMARK ) | ( '[' ) | ( ']' ) | ( '@' ) | ( '!' ) | ( '$' ) | ( '&' ) | ( '*' ) | (
	// RULE_PLUS ) | ( RULE_COMMA ) | ( ';' ) | ( ( rule__ValidURLSymbol__Group_18__0 ) ) );
	public final void rule__ValidURLSymbol__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2165:1: ( ( RULE_DASH ) | ( '.' ) | ( RULE_UNDERSCORE ) | ( '~' ) | ( RULE_COLON ) | ( '/' ) | ( '?' ) | ( RULE_HASHMARK ) | ( '[' ) | ( ']' ) | ( '@' ) | ( '!' ) | ( '$' ) | ( '&' ) | ( '*' ) | ( RULE_PLUS ) | ( RULE_COMMA ) | (
			// ';' ) | ( ( rule__ValidURLSymbol__Group_18__0 ) ) )
			int alt27 = 19;
			switch (input.LA(1)) {
			case RULE_DASH: {
				alt27 = 1;
			}
				break;
			case 39: {
				alt27 = 2;
			}
				break;
			case RULE_UNDERSCORE: {
				alt27 = 3;
			}
				break;
			case 38: {
				alt27 = 4;
			}
				break;
			case RULE_COLON: {
				alt27 = 5;
			}
				break;
			case 40: {
				alt27 = 6;
			}
				break;
			case 41: {
				alt27 = 7;
			}
				break;
			case RULE_HASHMARK: {
				alt27 = 8;
			}
				break;
			case 42: {
				alt27 = 9;
			}
				break;
			case 43: {
				alt27 = 10;
			}
				break;
			case 44: {
				alt27 = 11;
			}
				break;
			case 45: {
				alt27 = 12;
			}
				break;
			case 46: {
				alt27 = 13;
			}
				break;
			case 47: {
				alt27 = 14;
			}
				break;
			case 36: {
				alt27 = 15;
			}
				break;
			case RULE_PLUS: {
				alt27 = 16;
			}
				break;
			case RULE_COMMA: {
				alt27 = 17;
			}
				break;
			case 48: {
				alt27 = 18;
			}
				break;
			case 35: {
				alt27 = 19;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 27, 0, input);

				throw nvae;
			}

			switch (alt27) {
			case 1:
			// InternalCSS.g:2166:1: ( RULE_DASH )
			{
				// InternalCSS.g:2166:1: ( RULE_DASH )
				// InternalCSS.g:2167:1: RULE_DASH
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_0());
					}
					match(input, RULE_DASH, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2172:6: ( '.' )
			{
				// InternalCSS.g:2172:6: ( '.' )
				// InternalCSS.g:2173:1: '.'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1());
					}
					match(input, 39, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:2180:6: ( RULE_UNDERSCORE )
			{
				// InternalCSS.g:2180:6: ( RULE_UNDERSCORE )
				// InternalCSS.g:2181:1: RULE_UNDERSCORE
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getUNDERSCORETerminalRuleCall_2());
					}
					match(input, RULE_UNDERSCORE, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getUNDERSCORETerminalRuleCall_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:2186:6: ( '~' )
			{
				// InternalCSS.g:2186:6: ( '~' )
				// InternalCSS.g:2187:1: '~'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getTildeKeyword_3());
					}
					match(input, 38, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getTildeKeyword_3());
					}

				}


			}
				break;
			case 5:
			// InternalCSS.g:2194:6: ( RULE_COLON )
			{
				// InternalCSS.g:2194:6: ( RULE_COLON )
				// InternalCSS.g:2195:1: RULE_COLON
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getCOLONTerminalRuleCall_4());
					}
					match(input, RULE_COLON, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getCOLONTerminalRuleCall_4());
					}

				}


			}
				break;
			case 6:
			// InternalCSS.g:2200:6: ( '/' )
			{
				// InternalCSS.g:2200:6: ( '/' )
				// InternalCSS.g:2201:1: '/'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_5());
					}
					match(input, 40, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_5());
					}

				}


			}
				break;
			case 7:
			// InternalCSS.g:2208:6: ( '?' )
			{
				// InternalCSS.g:2208:6: ( '?' )
				// InternalCSS.g:2209:1: '?'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_6());
					}
					match(input, 41, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_6());
					}

				}


			}
				break;
			case 8:
			// InternalCSS.g:2216:6: ( RULE_HASHMARK )
			{
				// InternalCSS.g:2216:6: ( RULE_HASHMARK )
				// InternalCSS.g:2217:1: RULE_HASHMARK
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getHASHMARKTerminalRuleCall_7());
					}
					match(input, RULE_HASHMARK, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getHASHMARKTerminalRuleCall_7());
					}

				}


			}
				break;
			case 9:
			// InternalCSS.g:2222:6: ( '[' )
			{
				// InternalCSS.g:2222:6: ( '[' )
				// InternalCSS.g:2223:1: '['
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getLeftSquareBracketKeyword_8());
					}
					match(input, 42, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getLeftSquareBracketKeyword_8());
					}

				}


			}
				break;
			case 10:
			// InternalCSS.g:2230:6: ( ']' )
			{
				// InternalCSS.g:2230:6: ( ']' )
				// InternalCSS.g:2231:1: ']'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getRightSquareBracketKeyword_9());
					}
					match(input, 43, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getRightSquareBracketKeyword_9());
					}

				}


			}
				break;
			case 11:
			// InternalCSS.g:2238:6: ( '@' )
			{
				// InternalCSS.g:2238:6: ( '@' )
				// InternalCSS.g:2239:1: '@'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_10());
					}
					match(input, 44, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_10());
					}

				}


			}
				break;
			case 12:
			// InternalCSS.g:2246:6: ( '!' )
			{
				// InternalCSS.g:2246:6: ( '!' )
				// InternalCSS.g:2247:1: '!'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getExclamationMarkKeyword_11());
					}
					match(input, 45, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getExclamationMarkKeyword_11());
					}

				}


			}
				break;
			case 13:
			// InternalCSS.g:2254:6: ( '$' )
			{
				// InternalCSS.g:2254:6: ( '$' )
				// InternalCSS.g:2255:1: '$'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getDollarSignKeyword_12());
					}
					match(input, 46, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getDollarSignKeyword_12());
					}

				}


			}
				break;
			case 14:
			// InternalCSS.g:2262:6: ( '&' )
			{
				// InternalCSS.g:2262:6: ( '&' )
				// InternalCSS.g:2263:1: '&'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_13());
					}
					match(input, 47, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_13());
					}

				}


			}
				break;
			case 15:
			// InternalCSS.g:2270:6: ( '*' )
			{
				// InternalCSS.g:2270:6: ( '*' )
				// InternalCSS.g:2271:1: '*'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getAsteriskKeyword_14());
					}
					match(input, 36, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getAsteriskKeyword_14());
					}

				}


			}
				break;
			case 16:
			// InternalCSS.g:2278:6: ( RULE_PLUS )
			{
				// InternalCSS.g:2278:6: ( RULE_PLUS )
				// InternalCSS.g:2279:1: RULE_PLUS
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_15());
					}
					match(input, RULE_PLUS, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_15());
					}

				}


			}
				break;
			case 17:
			// InternalCSS.g:2284:6: ( RULE_COMMA )
			{
				// InternalCSS.g:2284:6: ( RULE_COMMA )
				// InternalCSS.g:2285:1: RULE_COMMA
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_16());
					}
					match(input, RULE_COMMA, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_16());
					}

				}


			}
				break;
			case 18:
			// InternalCSS.g:2290:6: ( ';' )
			{
				// InternalCSS.g:2290:6: ( ';' )
				// InternalCSS.g:2291:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getSemicolonKeyword_17());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getSemicolonKeyword_17());
					}

				}


			}
				break;
			case 19:
			// InternalCSS.g:2298:6: ( ( rule__ValidURLSymbol__Group_18__0 ) )
			{
				// InternalCSS.g:2298:6: ( ( rule__ValidURLSymbol__Group_18__0 ) )
				// InternalCSS.g:2299:1: ( rule__ValidURLSymbol__Group_18__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getGroup_18());
					}
					// InternalCSS.g:2300:1: ( rule__ValidURLSymbol__Group_18__0 )
					// InternalCSS.g:2300:2: rule__ValidURLSymbol__Group_18__0
					{
						pushFollow(FOLLOW_2);
						rule__ValidURLSymbol__Group_18__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getGroup_18());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURLSymbol__Alternatives"


	// $ANTLR start "rule__KeywordHack__Alternatives"
	// InternalCSS.g:2309:1: rule__KeywordHack__Alternatives : ( ( 'not' ) | ( 'no' ) | ( 'url' ) | ( 'ur' ) );
	public final void rule__KeywordHack__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2313:1: ( ( 'not' ) | ( 'no' ) | ( 'url' ) | ( 'ur' ) )
			int alt28 = 4;
			switch (input.LA(1)) {
			case 49: {
				alt28 = 1;
			}
				break;
			case 50: {
				alt28 = 2;
			}
				break;
			case 51: {
				alt28 = 3;
			}
				break;
			case 52: {
				alt28 = 4;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 28, 0, input);

				throw nvae;
			}

			switch (alt28) {
			case 1:
			// InternalCSS.g:2314:1: ( 'not' )
			{
				// InternalCSS.g:2314:1: ( 'not' )
				// InternalCSS.g:2315:1: 'not'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeywordHackAccess().getNotKeyword_0());
					}
					match(input, 49, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeywordHackAccess().getNotKeyword_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2322:6: ( 'no' )
			{
				// InternalCSS.g:2322:6: ( 'no' )
				// InternalCSS.g:2323:1: 'no'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeywordHackAccess().getNoKeyword_1());
					}
					match(input, 50, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeywordHackAccess().getNoKeyword_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:2330:6: ( 'url' )
			{
				// InternalCSS.g:2330:6: ( 'url' )
				// InternalCSS.g:2331:1: 'url'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeywordHackAccess().getUrlKeyword_2());
					}
					match(input, 51, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeywordHackAccess().getUrlKeyword_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:2338:6: ( 'ur' )
			{
				// InternalCSS.g:2338:6: ( 'ur' )
				// InternalCSS.g:2339:1: 'ur'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeywordHackAccess().getUrKeyword_3());
					}
					match(input, 52, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeywordHackAccess().getUrKeyword_3());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__KeywordHack__Alternatives"


	// $ANTLR start "rule__ValidURL__Alternatives"
	// InternalCSS.g:2351:1: rule__ValidURL__Alternatives : ( ( RULE_CSSSTRING ) | ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) ) );
	public final void rule__ValidURL__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2355:1: ( ( RULE_CSSSTRING ) | ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) ) )
			int alt30 = 2;
			int LA30_0 = input.LA(1);

			if ((LA30_0 == RULE_CSSSTRING)) {
				alt30 = 1;
			} else if (((LA30_0 >= RULE_PLUS && LA30_0 <= RULE_ONE_INT) || (LA30_0 >= 35 && LA30_0 <= 36) || (LA30_0 >= 38 && LA30_0 <= 57))) {
				alt30 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 30, 0, input);

				throw nvae;
			}
			switch (alt30) {
			case 1:
			// InternalCSS.g:2356:1: ( RULE_CSSSTRING )
			{
				// InternalCSS.g:2356:1: ( RULE_CSSSTRING )
				// InternalCSS.g:2357:1: RULE_CSSSTRING
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getCSSSTRINGTerminalRuleCall_0());
					}
					match(input, RULE_CSSSTRING, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getCSSSTRINGTerminalRuleCall_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2362:6: ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) )
			{
				// InternalCSS.g:2362:6: ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) )
				// InternalCSS.g:2363:1: ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* )
				{
					// InternalCSS.g:2363:1: ( ( rule__ValidURL__Alternatives_1 ) )
					// InternalCSS.g:2364:1: ( rule__ValidURL__Alternatives_1 )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getValidURLAccess().getAlternatives_1());
						}
						// InternalCSS.g:2365:1: ( rule__ValidURL__Alternatives_1 )
						// InternalCSS.g:2365:2: rule__ValidURL__Alternatives_1
						{
							pushFollow(FOLLOW_4);
							rule__ValidURL__Alternatives_1();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getValidURLAccess().getAlternatives_1());
						}

					}

					// InternalCSS.g:2368:1: ( ( rule__ValidURL__Alternatives_1 )* )
					// InternalCSS.g:2369:1: ( rule__ValidURL__Alternatives_1 )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getValidURLAccess().getAlternatives_1());
						}
						// InternalCSS.g:2370:1: ( rule__ValidURL__Alternatives_1 )*
						loop29: do {
							int alt29 = 2;
							int LA29_0 = input.LA(1);

							if (((LA29_0 >= RULE_PLUS && LA29_0 <= RULE_ONE_INT) || (LA29_0 >= 35 && LA29_0 <= 36) || (LA29_0 >= 38 && LA29_0 <= 57))) {
								alt29 = 1;
							}


							switch (alt29) {
							case 1:
							// InternalCSS.g:2370:2: rule__ValidURL__Alternatives_1
							{
								pushFollow(FOLLOW_4);
								rule__ValidURL__Alternatives_1();

								state._fsp--;
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop29;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getValidURLAccess().getAlternatives_1());
						}

					}


				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Alternatives"


	// $ANTLR start "rule__ValidURL__Alternatives_1"
	// InternalCSS.g:2380:1: rule__ValidURL__Alternatives_1 : ( ( ruleValidURLSymbol ) | ( ruleKeywordHack ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( '\\\\ ' ) | ( '\\\\(' ) | ( '\\\\)' ) | ( '\\\\\\'' ) | ( '\\\\\"' ) | (
	// ( rule__ValidURL__Group_1_10__0 ) ) );
	public final void rule__ValidURL__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2384:1: ( ( ruleValidURLSymbol ) | ( ruleKeywordHack ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( '\\\\ ' ) | ( '\\\\(' ) | ( '\\\\)' ) | ( '\\\\\\'' ) | ( '\\\\\"' ) | ( (
			// rule__ValidURL__Group_1_10__0 ) ) )
			int alt31 = 11;
			switch (input.LA(1)) {
			case RULE_PLUS:
			case RULE_COMMA:
			case RULE_DASH:
			case RULE_UNDERSCORE:
			case RULE_COLON:
			case RULE_HASHMARK:
			case 35:
			case 36:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48: {
				alt31 = 1;
			}
				break;
			case 49:
			case 50:
			case 51:
			case 52: {
				alt31 = 2;
			}
				break;
			case RULE_ONE_HEX_LETTER: {
				alt31 = 3;
			}
				break;
			case RULE_ONE_NON_HEX_LETTER: {
				alt31 = 4;
			}
				break;
			case RULE_ONE_INT: {
				alt31 = 5;
			}
				break;
			case 53: {
				alt31 = 6;
			}
				break;
			case 54: {
				alt31 = 7;
			}
				break;
			case 55: {
				alt31 = 8;
			}
				break;
			case 56: {
				alt31 = 9;
			}
				break;
			case 57: {
				alt31 = 10;
			}
				break;
			case RULE_PERCENT: {
				alt31 = 11;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 31, 0, input);

				throw nvae;
			}

			switch (alt31) {
			case 1:
			// InternalCSS.g:2385:1: ( ruleValidURLSymbol )
			{
				// InternalCSS.g:2385:1: ( ruleValidURLSymbol )
				// InternalCSS.g:2386:1: ruleValidURLSymbol
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleValidURLSymbol();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2391:6: ( ruleKeywordHack )
			{
				// InternalCSS.g:2391:6: ( ruleKeywordHack )
				// InternalCSS.g:2392:1: ruleKeywordHack
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getKeywordHackParserRuleCall_1_1());
					}
					pushFollow(FOLLOW_2);
					ruleKeywordHack();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getKeywordHackParserRuleCall_1_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:2397:6: ( RULE_ONE_HEX_LETTER )
			{
				// InternalCSS.g:2397:6: ( RULE_ONE_HEX_LETTER )
				// InternalCSS.g:2398:1: RULE_ONE_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_2());
					}
					match(input, RULE_ONE_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:2403:6: ( RULE_ONE_NON_HEX_LETTER )
			{
				// InternalCSS.g:2403:6: ( RULE_ONE_NON_HEX_LETTER )
				// InternalCSS.g:2404:1: RULE_ONE_NON_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_3());
					}
					match(input, RULE_ONE_NON_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_3());
					}

				}


			}
				break;
			case 5:
			// InternalCSS.g:2409:6: ( RULE_ONE_INT )
			{
				// InternalCSS.g:2409:6: ( RULE_ONE_INT )
				// InternalCSS.g:2410:1: RULE_ONE_INT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_4());
					}
					match(input, RULE_ONE_INT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_4());
					}

				}


			}
				break;
			case 6:
			// InternalCSS.g:2415:6: ( '\\\\ ' )
			{
				// InternalCSS.g:2415:6: ( '\\\\ ' )
				// InternalCSS.g:2416:1: '\\\\ '
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_5());
					}
					match(input, 53, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_5());
					}

				}


			}
				break;
			case 7:
			// InternalCSS.g:2423:6: ( '\\\\(' )
			{
				// InternalCSS.g:2423:6: ( '\\\\(' )
				// InternalCSS.g:2424:1: '\\\\('
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_6());
					}
					match(input, 54, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_6());
					}

				}


			}
				break;
			case 8:
			// InternalCSS.g:2431:6: ( '\\\\)' )
			{
				// InternalCSS.g:2431:6: ( '\\\\)' )
				// InternalCSS.g:2432:1: '\\\\)'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_7());
					}
					match(input, 55, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_7());
					}

				}


			}
				break;
			case 9:
			// InternalCSS.g:2439:6: ( '\\\\\\'' )
			{
				// InternalCSS.g:2439:6: ( '\\\\\\'' )
				// InternalCSS.g:2440:1: '\\\\\\''
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_8());
					}
					match(input, 56, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_8());
					}

				}


			}
				break;
			case 10:
			// InternalCSS.g:2447:6: ( '\\\\\"' )
			{
				// InternalCSS.g:2447:6: ( '\\\\\"' )
				// InternalCSS.g:2448:1: '\\\\\"'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_9());
					}
					match(input, 57, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_9());
					}

				}


			}
				break;
			case 11:
			// InternalCSS.g:2455:6: ( ( rule__ValidURL__Group_1_10__0 ) )
			{
				// InternalCSS.g:2455:6: ( ( rule__ValidURL__Group_1_10__0 ) )
				// InternalCSS.g:2456:1: ( rule__ValidURL__Group_1_10__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getGroup_1_10());
					}
					// InternalCSS.g:2457:1: ( rule__ValidURL__Group_1_10__0 )
					// InternalCSS.g:2457:2: rule__ValidURL__Group_1_10__0
					{
						pushFollow(FOLLOW_2);
						rule__ValidURL__Group_1_10__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getGroup_1_10());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Alternatives_1"


	// $ANTLR start "rule__ValidURL__Alternatives_1_10_1"
	// InternalCSS.g:2466:1: rule__ValidURL__Alternatives_1_10_1 : ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) );
	public final void rule__ValidURL__Alternatives_1_10_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2470:1: ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) )
			int alt32 = 2;
			int LA32_0 = input.LA(1);

			if ((LA32_0 == RULE_ONE_INT)) {
				alt32 = 1;
			} else if ((LA32_0 == RULE_ONE_HEX_LETTER)) {
				alt32 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 32, 0, input);

				throw nvae;
			}
			switch (alt32) {
			case 1:
			// InternalCSS.g:2471:1: ( RULE_ONE_INT )
			{
				// InternalCSS.g:2471:1: ( RULE_ONE_INT )
				// InternalCSS.g:2472:1: RULE_ONE_INT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_1_0());
					}
					match(input, RULE_ONE_INT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2477:6: ( RULE_ONE_HEX_LETTER )
			{
				// InternalCSS.g:2477:6: ( RULE_ONE_HEX_LETTER )
				// InternalCSS.g:2478:1: RULE_ONE_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_1_1());
					}
					match(input, RULE_ONE_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_1_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Alternatives_1_10_1"


	// $ANTLR start "rule__ValidURL__Alternatives_1_10_2"
	// InternalCSS.g:2488:1: rule__ValidURL__Alternatives_1_10_2 : ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) );
	public final void rule__ValidURL__Alternatives_1_10_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2492:1: ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) )
			int alt33 = 2;
			int LA33_0 = input.LA(1);

			if ((LA33_0 == RULE_ONE_INT)) {
				alt33 = 1;
			} else if ((LA33_0 == RULE_ONE_HEX_LETTER)) {
				alt33 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 33, 0, input);

				throw nvae;
			}
			switch (alt33) {
			case 1:
			// InternalCSS.g:2493:1: ( RULE_ONE_INT )
			{
				// InternalCSS.g:2493:1: ( RULE_ONE_INT )
				// InternalCSS.g:2494:1: RULE_ONE_INT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_2_0());
					}
					match(input, RULE_ONE_INT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_2_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2499:6: ( RULE_ONE_HEX_LETTER )
			{
				// InternalCSS.g:2499:6: ( RULE_ONE_HEX_LETTER )
				// InternalCSS.g:2500:1: RULE_ONE_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_2_1());
					}
					match(input, RULE_ONE_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_2_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Alternatives_1_10_2"


	// $ANTLR start "rule__Identifier__Alternatives_1"
	// InternalCSS.g:2510:1: rule__Identifier__Alternatives_1 : ( ( RULE_UNDERSCORE ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( ruleKeywordHack ) );
	public final void rule__Identifier__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2514:1: ( ( RULE_UNDERSCORE ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( ruleKeywordHack ) )
			int alt34 = 4;
			switch (input.LA(1)) {
			case RULE_UNDERSCORE: {
				alt34 = 1;
			}
				break;
			case RULE_ONE_HEX_LETTER: {
				alt34 = 2;
			}
				break;
			case RULE_ONE_NON_HEX_LETTER: {
				alt34 = 3;
			}
				break;
			case 49:
			case 50:
			case 51:
			case 52: {
				alt34 = 4;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 34, 0, input);

				throw nvae;
			}

			switch (alt34) {
			case 1:
			// InternalCSS.g:2515:1: ( RULE_UNDERSCORE )
			{
				// InternalCSS.g:2515:1: ( RULE_UNDERSCORE )
				// InternalCSS.g:2516:1: RULE_UNDERSCORE
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0());
					}
					match(input, RULE_UNDERSCORE, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2521:6: ( RULE_ONE_HEX_LETTER )
			{
				// InternalCSS.g:2521:6: ( RULE_ONE_HEX_LETTER )
				// InternalCSS.g:2522:1: RULE_ONE_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1());
					}
					match(input, RULE_ONE_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:2527:6: ( RULE_ONE_NON_HEX_LETTER )
			{
				// InternalCSS.g:2527:6: ( RULE_ONE_NON_HEX_LETTER )
				// InternalCSS.g:2528:1: RULE_ONE_NON_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2());
					}
					match(input, RULE_ONE_NON_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:2533:6: ( ruleKeywordHack )
			{
				// InternalCSS.g:2533:6: ( ruleKeywordHack )
				// InternalCSS.g:2534:1: ruleKeywordHack
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_1_3());
					}
					pushFollow(FOLLOW_2);
					ruleKeywordHack();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_1_3());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Alternatives_1"


	// $ANTLR start "rule__Identifier__Alternatives_2_0"
	// InternalCSS.g:2544:1: rule__Identifier__Alternatives_2_0 : ( ( RULE_UNDERSCORE ) | ( RULE_DASH ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( ruleKeywordHack ) );
	public final void rule__Identifier__Alternatives_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2548:1: ( ( RULE_UNDERSCORE ) | ( RULE_DASH ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( ruleKeywordHack ) )
			int alt35 = 6;
			switch (input.LA(1)) {
			case RULE_UNDERSCORE: {
				alt35 = 1;
			}
				break;
			case RULE_DASH: {
				alt35 = 2;
			}
				break;
			case RULE_ONE_HEX_LETTER: {
				alt35 = 3;
			}
				break;
			case RULE_ONE_NON_HEX_LETTER: {
				alt35 = 4;
			}
				break;
			case RULE_ONE_INT: {
				alt35 = 5;
			}
				break;
			case 49:
			case 50:
			case 51:
			case 52: {
				alt35 = 6;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 35, 0, input);

				throw nvae;
			}

			switch (alt35) {
			case 1:
			// InternalCSS.g:2549:1: ( RULE_UNDERSCORE )
			{
				// InternalCSS.g:2549:1: ( RULE_UNDERSCORE )
				// InternalCSS.g:2550:1: RULE_UNDERSCORE
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0());
					}
					match(input, RULE_UNDERSCORE, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2555:6: ( RULE_DASH )
			{
				// InternalCSS.g:2555:6: ( RULE_DASH )
				// InternalCSS.g:2556:1: RULE_DASH
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1());
					}
					match(input, RULE_DASH, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1());
					}

				}


			}
				break;
			case 3:
			// InternalCSS.g:2561:6: ( RULE_ONE_HEX_LETTER )
			{
				// InternalCSS.g:2561:6: ( RULE_ONE_HEX_LETTER )
				// InternalCSS.g:2562:1: RULE_ONE_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2());
					}
					match(input, RULE_ONE_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2());
					}

				}


			}
				break;
			case 4:
			// InternalCSS.g:2567:6: ( RULE_ONE_NON_HEX_LETTER )
			{
				// InternalCSS.g:2567:6: ( RULE_ONE_NON_HEX_LETTER )
				// InternalCSS.g:2568:1: RULE_ONE_NON_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3());
					}
					match(input, RULE_ONE_NON_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3());
					}

				}


			}
				break;
			case 5:
			// InternalCSS.g:2573:6: ( RULE_ONE_INT )
			{
				// InternalCSS.g:2573:6: ( RULE_ONE_INT )
				// InternalCSS.g:2574:1: RULE_ONE_INT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4());
					}
					match(input, RULE_ONE_INT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4());
					}

				}


			}
				break;
			case 6:
			// InternalCSS.g:2579:6: ( ruleKeywordHack )
			{
				// InternalCSS.g:2579:6: ( ruleKeywordHack )
				// InternalCSS.g:2580:1: ruleKeywordHack
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_2_0_5());
					}
					pushFollow(FOLLOW_2);
					ruleKeywordHack();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_2_0_5());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Alternatives_2_0"


	// $ANTLR start "rule__Num__Alternatives_0"
	// InternalCSS.g:2590:1: rule__Num__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
	public final void rule__Num__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2594:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
			int alt36 = 2;
			int LA36_0 = input.LA(1);

			if ((LA36_0 == RULE_PLUS)) {
				alt36 = 1;
			} else if ((LA36_0 == RULE_DASH)) {
				alt36 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 36, 0, input);

				throw nvae;
			}
			switch (alt36) {
			case 1:
			// InternalCSS.g:2595:1: ( RULE_PLUS )
			{
				// InternalCSS.g:2595:1: ( RULE_PLUS )
				// InternalCSS.g:2596:1: RULE_PLUS
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0());
					}
					match(input, RULE_PLUS, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2601:6: ( RULE_DASH )
			{
				// InternalCSS.g:2601:6: ( RULE_DASH )
				// InternalCSS.g:2602:1: RULE_DASH
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1());
					}
					match(input, RULE_DASH, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Alternatives_0"


	// $ANTLR start "rule__Num__Alternatives_1"
	// InternalCSS.g:2612:1: rule__Num__Alternatives_1 : ( ( ( rule__Num__Group_1_0__0 ) ) | ( ( rule__Num__Group_1_1__0 ) ) );
	public final void rule__Num__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2616:1: ( ( ( rule__Num__Group_1_0__0 ) ) | ( ( rule__Num__Group_1_1__0 ) ) )
			int alt37 = 2;
			int LA37_0 = input.LA(1);

			if ((LA37_0 == 39)) {
				alt37 = 1;
			} else if ((LA37_0 == RULE_ONE_INT)) {
				alt37 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 37, 0, input);

				throw nvae;
			}
			switch (alt37) {
			case 1:
			// InternalCSS.g:2617:1: ( ( rule__Num__Group_1_0__0 ) )
			{
				// InternalCSS.g:2617:1: ( ( rule__Num__Group_1_0__0 ) )
				// InternalCSS.g:2618:1: ( rule__Num__Group_1_0__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getGroup_1_0());
					}
					// InternalCSS.g:2619:1: ( rule__Num__Group_1_0__0 )
					// InternalCSS.g:2619:2: rule__Num__Group_1_0__0
					{
						pushFollow(FOLLOW_2);
						rule__Num__Group_1_0__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getGroup_1_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2623:6: ( ( rule__Num__Group_1_1__0 ) )
			{
				// InternalCSS.g:2623:6: ( ( rule__Num__Group_1_1__0 ) )
				// InternalCSS.g:2624:1: ( rule__Num__Group_1_1__0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getGroup_1_1());
					}
					// InternalCSS.g:2625:1: ( rule__Num__Group_1_1__0 )
					// InternalCSS.g:2625:2: rule__Num__Group_1_1__0
					{
						pushFollow(FOLLOW_2);
						rule__Num__Group_1_1__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getGroup_1_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Alternatives_1"


	// $ANTLR start "rule__Hex__Alternatives_1_0"
	// InternalCSS.g:2634:1: rule__Hex__Alternatives_1_0 : ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) );
	public final void rule__Hex__Alternatives_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2638:1: ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) )
			int alt38 = 2;
			int LA38_0 = input.LA(1);

			if ((LA38_0 == RULE_ONE_INT)) {
				alt38 = 1;
			} else if ((LA38_0 == RULE_ONE_HEX_LETTER)) {
				alt38 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 38, 0, input);

				throw nvae;
			}
			switch (alt38) {
			case 1:
			// InternalCSS.g:2639:1: ( RULE_ONE_INT )
			{
				// InternalCSS.g:2639:1: ( RULE_ONE_INT )
				// InternalCSS.g:2640:1: RULE_ONE_INT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0());
					}
					match(input, RULE_ONE_INT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0());
					}

				}


			}
				break;
			case 2:
			// InternalCSS.g:2645:6: ( RULE_ONE_HEX_LETTER )
			{
				// InternalCSS.g:2645:6: ( RULE_ONE_HEX_LETTER )
				// InternalCSS.g:2646:1: RULE_ONE_HEX_LETTER
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getHexAccess().getONE_HEX_LETTERTerminalRuleCall_1_0_1());
					}
					match(input, RULE_ONE_HEX_LETTER, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getHexAccess().getONE_HEX_LETTERTerminalRuleCall_1_0_1());
					}

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Hex__Alternatives_1_0"


	// $ANTLR start "rule__Stylesheet__Group__0"
	// InternalCSS.g:2658:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
	public final void rule__Stylesheet__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2662:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
			// InternalCSS.g:2663:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
			{
				pushFollow(FOLLOW_5);
				rule__Stylesheet__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Stylesheet__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Group__0"


	// $ANTLR start "rule__Stylesheet__Group__0__Impl"
	// InternalCSS.g:2670:1: rule__Stylesheet__Group__0__Impl : ( ( rule__Stylesheet__CharsetAssignment_0 )? ) ;
	public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2674:1: ( ( ( rule__Stylesheet__CharsetAssignment_0 )? ) )
			// InternalCSS.g:2675:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
			{
				// InternalCSS.g:2675:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
				// InternalCSS.g:2676:1: ( rule__Stylesheet__CharsetAssignment_0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getCharsetAssignment_0());
					}
					// InternalCSS.g:2677:1: ( rule__Stylesheet__CharsetAssignment_0 )?
					int alt39 = 2;
					int LA39_0 = input.LA(1);

					if (((LA39_0 >= 20 && LA39_0 <= 21))) {
						alt39 = 1;
					}
					switch (alt39) {
					case 1:
					// InternalCSS.g:2677:2: rule__Stylesheet__CharsetAssignment_0
					{
						pushFollow(FOLLOW_2);
						rule__Stylesheet__CharsetAssignment_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getCharsetAssignment_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Group__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group__1"
	// InternalCSS.g:2687:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 ;
	public final void rule__Stylesheet__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2691:1: ( rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 )
			// InternalCSS.g:2692:2: rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2
			{
				pushFollow(FOLLOW_5);
				rule__Stylesheet__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Stylesheet__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Group__1"


	// $ANTLR start "rule__Stylesheet__Group__1__Impl"
	// InternalCSS.g:2699:1: rule__Stylesheet__Group__1__Impl : ( ( rule__Stylesheet__ImportsAssignment_1 )* ) ;
	public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2703:1: ( ( ( rule__Stylesheet__ImportsAssignment_1 )* ) )
			// InternalCSS.g:2704:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
			{
				// InternalCSS.g:2704:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
				// InternalCSS.g:2705:1: ( rule__Stylesheet__ImportsAssignment_1 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getImportsAssignment_1());
					}
					// InternalCSS.g:2706:1: ( rule__Stylesheet__ImportsAssignment_1 )*
					loop40: do {
						int alt40 = 2;
						int LA40_0 = input.LA(1);

						if (((LA40_0 >= 22 && LA40_0 <= 23))) {
							alt40 = 1;
						}


						switch (alt40) {
						case 1:
						// InternalCSS.g:2706:2: rule__Stylesheet__ImportsAssignment_1
						{
							pushFollow(FOLLOW_6);
							rule__Stylesheet__ImportsAssignment_1();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop40;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getImportsAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Group__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group__2"
	// InternalCSS.g:2716:1: rule__Stylesheet__Group__2 : rule__Stylesheet__Group__2__Impl ;
	public final void rule__Stylesheet__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2720:1: ( rule__Stylesheet__Group__2__Impl )
			// InternalCSS.g:2721:2: rule__Stylesheet__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Stylesheet__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Group__2"


	// $ANTLR start "rule__Stylesheet__Group__2__Impl"
	// InternalCSS.g:2727:1: rule__Stylesheet__Group__2__Impl : ( ( rule__Stylesheet__Alternatives_2 )* ) ;
	public final void rule__Stylesheet__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2731:1: ( ( ( rule__Stylesheet__Alternatives_2 )* ) )
			// InternalCSS.g:2732:1: ( ( rule__Stylesheet__Alternatives_2 )* )
			{
				// InternalCSS.g:2732:1: ( ( rule__Stylesheet__Alternatives_2 )* )
				// InternalCSS.g:2733:1: ( rule__Stylesheet__Alternatives_2 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getAlternatives_2());
					}
					// InternalCSS.g:2734:1: ( rule__Stylesheet__Alternatives_2 )*
					loop41: do {
						int alt41 = 2;
						int LA41_0 = input.LA(1);

						if (((LA41_0 >= RULE_DASH && LA41_0 <= RULE_ONE_NON_HEX_LETTER) || (LA41_0 >= 24 && LA41_0 <= 31) || LA41_0 == 36 || LA41_0 == 39 || LA41_0 == 42 || (LA41_0 >= 49 && LA41_0 <= 52) || LA41_0 == 60)) {
							alt41 = 1;
						}


						switch (alt41) {
						case 1:
						// InternalCSS.g:2734:2: rule__Stylesheet__Alternatives_2
						{
							pushFollow(FOLLOW_7);
							rule__Stylesheet__Alternatives_2();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop41;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getAlternatives_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Group__2__Impl"


	// $ANTLR start "rule__Charset__Group__0"
	// InternalCSS.g:2750:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
	public final void rule__Charset__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2754:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
			// InternalCSS.g:2755:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
			{
				pushFollow(FOLLOW_8);
				rule__Charset__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Charset__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__Group__0"


	// $ANTLR start "rule__Charset__Group__0__Impl"
	// InternalCSS.g:2762:1: rule__Charset__Group__0__Impl : ( ( rule__Charset__Alternatives_0 ) ) ;
	public final void rule__Charset__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2766:1: ( ( ( rule__Charset__Alternatives_0 ) ) )
			// InternalCSS.g:2767:1: ( ( rule__Charset__Alternatives_0 ) )
			{
				// InternalCSS.g:2767:1: ( ( rule__Charset__Alternatives_0 ) )
				// InternalCSS.g:2768:1: ( rule__Charset__Alternatives_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCharsetAccess().getAlternatives_0());
					}
					// InternalCSS.g:2769:1: ( rule__Charset__Alternatives_0 )
					// InternalCSS.g:2769:2: rule__Charset__Alternatives_0
					{
						pushFollow(FOLLOW_2);
						rule__Charset__Alternatives_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCharsetAccess().getAlternatives_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__Group__0__Impl"


	// $ANTLR start "rule__Charset__Group__1"
	// InternalCSS.g:2779:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
	public final void rule__Charset__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2783:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
			// InternalCSS.g:2784:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
			{
				pushFollow(FOLLOW_9);
				rule__Charset__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Charset__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__Group__1"


	// $ANTLR start "rule__Charset__Group__1__Impl"
	// InternalCSS.g:2791:1: rule__Charset__Group__1__Impl : ( ( rule__Charset__CharsetAssignment_1 ) ) ;
	public final void rule__Charset__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2795:1: ( ( ( rule__Charset__CharsetAssignment_1 ) ) )
			// InternalCSS.g:2796:1: ( ( rule__Charset__CharsetAssignment_1 ) )
			{
				// InternalCSS.g:2796:1: ( ( rule__Charset__CharsetAssignment_1 ) )
				// InternalCSS.g:2797:1: ( rule__Charset__CharsetAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCharsetAccess().getCharsetAssignment_1());
					}
					// InternalCSS.g:2798:1: ( rule__Charset__CharsetAssignment_1 )
					// InternalCSS.g:2798:2: rule__Charset__CharsetAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Charset__CharsetAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCharsetAccess().getCharsetAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__Group__1__Impl"


	// $ANTLR start "rule__Charset__Group__2"
	// InternalCSS.g:2808:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
	public final void rule__Charset__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2812:1: ( rule__Charset__Group__2__Impl )
			// InternalCSS.g:2813:2: rule__Charset__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Charset__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__Group__2"


	// $ANTLR start "rule__Charset__Group__2__Impl"
	// InternalCSS.g:2819:1: rule__Charset__Group__2__Impl : ( ';' ) ;
	public final void rule__Charset__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2823:1: ( ( ';' ) )
			// InternalCSS.g:2824:1: ( ';' )
			{
				// InternalCSS.g:2824:1: ( ';' )
				// InternalCSS.g:2825:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCharsetAccess().getSemicolonKeyword_2());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCharsetAccess().getSemicolonKeyword_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__Group__2__Impl"


	// $ANTLR start "rule__ImportExpression__Group__0"
	// InternalCSS.g:2844:1: rule__ImportExpression__Group__0 : rule__ImportExpression__Group__0__Impl rule__ImportExpression__Group__1 ;
	public final void rule__ImportExpression__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2848:1: ( rule__ImportExpression__Group__0__Impl rule__ImportExpression__Group__1 )
			// InternalCSS.g:2849:2: rule__ImportExpression__Group__0__Impl rule__ImportExpression__Group__1
			{
				pushFollow(FOLLOW_10);
				rule__ImportExpression__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ImportExpression__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group__0"


	// $ANTLR start "rule__ImportExpression__Group__0__Impl"
	// InternalCSS.g:2856:1: rule__ImportExpression__Group__0__Impl : ( ( rule__ImportExpression__Alternatives_0 ) ) ;
	public final void rule__ImportExpression__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2860:1: ( ( ( rule__ImportExpression__Alternatives_0 ) ) )
			// InternalCSS.g:2861:1: ( ( rule__ImportExpression__Alternatives_0 ) )
			{
				// InternalCSS.g:2861:1: ( ( rule__ImportExpression__Alternatives_0 ) )
				// InternalCSS.g:2862:1: ( rule__ImportExpression__Alternatives_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getAlternatives_0());
					}
					// InternalCSS.g:2863:1: ( rule__ImportExpression__Alternatives_0 )
					// InternalCSS.g:2863:2: rule__ImportExpression__Alternatives_0
					{
						pushFollow(FOLLOW_2);
						rule__ImportExpression__Alternatives_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getAlternatives_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group__0__Impl"


	// $ANTLR start "rule__ImportExpression__Group__1"
	// InternalCSS.g:2873:1: rule__ImportExpression__Group__1 : rule__ImportExpression__Group__1__Impl rule__ImportExpression__Group__2 ;
	public final void rule__ImportExpression__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2877:1: ( rule__ImportExpression__Group__1__Impl rule__ImportExpression__Group__2 )
			// InternalCSS.g:2878:2: rule__ImportExpression__Group__1__Impl rule__ImportExpression__Group__2
			{
				pushFollow(FOLLOW_9);
				rule__ImportExpression__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ImportExpression__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group__1"


	// $ANTLR start "rule__ImportExpression__Group__1__Impl"
	// InternalCSS.g:2885:1: rule__ImportExpression__Group__1__Impl : ( ( rule__ImportExpression__Alternatives_1 ) ) ;
	public final void rule__ImportExpression__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2889:1: ( ( ( rule__ImportExpression__Alternatives_1 ) ) )
			// InternalCSS.g:2890:1: ( ( rule__ImportExpression__Alternatives_1 ) )
			{
				// InternalCSS.g:2890:1: ( ( rule__ImportExpression__Alternatives_1 ) )
				// InternalCSS.g:2891:1: ( rule__ImportExpression__Alternatives_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getAlternatives_1());
					}
					// InternalCSS.g:2892:1: ( rule__ImportExpression__Alternatives_1 )
					// InternalCSS.g:2892:2: rule__ImportExpression__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__ImportExpression__Alternatives_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getAlternatives_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group__1__Impl"


	// $ANTLR start "rule__ImportExpression__Group__2"
	// InternalCSS.g:2902:1: rule__ImportExpression__Group__2 : rule__ImportExpression__Group__2__Impl ;
	public final void rule__ImportExpression__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2906:1: ( rule__ImportExpression__Group__2__Impl )
			// InternalCSS.g:2907:2: rule__ImportExpression__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ImportExpression__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group__2"


	// $ANTLR start "rule__ImportExpression__Group__2__Impl"
	// InternalCSS.g:2913:1: rule__ImportExpression__Group__2__Impl : ( ';' ) ;
	public final void rule__ImportExpression__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2917:1: ( ( ';' ) )
			// InternalCSS.g:2918:1: ( ';' )
			{
				// InternalCSS.g:2918:1: ( ';' )
				// InternalCSS.g:2919:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_2());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group__2__Impl"


	// $ANTLR start "rule__ImportExpression__Group_1_1__0"
	// InternalCSS.g:2938:1: rule__ImportExpression__Group_1_1__0 : rule__ImportExpression__Group_1_1__0__Impl rule__ImportExpression__Group_1_1__1 ;
	public final void rule__ImportExpression__Group_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2942:1: ( rule__ImportExpression__Group_1_1__0__Impl rule__ImportExpression__Group_1_1__1 )
			// InternalCSS.g:2943:2: rule__ImportExpression__Group_1_1__0__Impl rule__ImportExpression__Group_1_1__1
			{
				pushFollow(FOLLOW_11);
				rule__ImportExpression__Group_1_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ImportExpression__Group_1_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group_1_1__0"


	// $ANTLR start "rule__ImportExpression__Group_1_1__0__Impl"
	// InternalCSS.g:2950:1: rule__ImportExpression__Group_1_1__0__Impl : ( ruleURLType ) ;
	public final void rule__ImportExpression__Group_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2954:1: ( ( ruleURLType ) )
			// InternalCSS.g:2955:1: ( ruleURLType )
			{
				// InternalCSS.g:2955:1: ( ruleURLType )
				// InternalCSS.g:2956:1: ruleURLType
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleURLType();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group_1_1__0__Impl"


	// $ANTLR start "rule__ImportExpression__Group_1_1__1"
	// InternalCSS.g:2967:1: rule__ImportExpression__Group_1_1__1 : rule__ImportExpression__Group_1_1__1__Impl ;
	public final void rule__ImportExpression__Group_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2971:1: ( rule__ImportExpression__Group_1_1__1__Impl )
			// InternalCSS.g:2972:2: rule__ImportExpression__Group_1_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ImportExpression__Group_1_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group_1_1__1"


	// $ANTLR start "rule__ImportExpression__Group_1_1__1__Impl"
	// InternalCSS.g:2978:1: rule__ImportExpression__Group_1_1__1__Impl : ( ( rule__ImportExpression__MediaListAssignment_1_1_1 )? ) ;
	public final void rule__ImportExpression__Group_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:2982:1: ( ( ( rule__ImportExpression__MediaListAssignment_1_1_1 )? ) )
			// InternalCSS.g:2983:1: ( ( rule__ImportExpression__MediaListAssignment_1_1_1 )? )
			{
				// InternalCSS.g:2983:1: ( ( rule__ImportExpression__MediaListAssignment_1_1_1 )? )
				// InternalCSS.g:2984:1: ( rule__ImportExpression__MediaListAssignment_1_1_1 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1_1());
					}
					// InternalCSS.g:2985:1: ( rule__ImportExpression__MediaListAssignment_1_1_1 )?
					int alt42 = 2;
					int LA42_0 = input.LA(1);

					if (((LA42_0 >= RULE_DASH && LA42_0 <= RULE_UNDERSCORE) || (LA42_0 >= RULE_ONE_HEX_LETTER && LA42_0 <= RULE_ONE_NON_HEX_LETTER) || (LA42_0 >= 49 && LA42_0 <= 52))) {
						alt42 = 1;
					}
					switch (alt42) {
					case 1:
					// InternalCSS.g:2985:2: rule__ImportExpression__MediaListAssignment_1_1_1
					{
						pushFollow(FOLLOW_2);
						rule__ImportExpression__MediaListAssignment_1_1_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__Group_1_1__1__Impl"


	// $ANTLR start "rule__Page__Group__0"
	// InternalCSS.g:2999:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
	public final void rule__Page__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3003:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
			// InternalCSS.g:3004:2: rule__Page__Group__0__Impl rule__Page__Group__1
			{
				pushFollow(FOLLOW_12);
				rule__Page__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Page__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__0"


	// $ANTLR start "rule__Page__Group__0__Impl"
	// InternalCSS.g:3011:1: rule__Page__Group__0__Impl : ( () ) ;
	public final void rule__Page__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3015:1: ( ( () ) )
			// InternalCSS.g:3016:1: ( () )
			{
				// InternalCSS.g:3016:1: ( () )
				// InternalCSS.g:3017:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getPageAction_0());
					}
					// InternalCSS.g:3018:1: ()
					// InternalCSS.g:3020:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getPageAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__0__Impl"


	// $ANTLR start "rule__Page__Group__1"
	// InternalCSS.g:3030:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
	public final void rule__Page__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3034:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
			// InternalCSS.g:3035:2: rule__Page__Group__1__Impl rule__Page__Group__2
			{
				pushFollow(FOLLOW_13);
				rule__Page__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Page__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__1"


	// $ANTLR start "rule__Page__Group__1__Impl"
	// InternalCSS.g:3042:1: rule__Page__Group__1__Impl : ( ( rule__Page__Alternatives_1 ) ) ;
	public final void rule__Page__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3046:1: ( ( ( rule__Page__Alternatives_1 ) ) )
			// InternalCSS.g:3047:1: ( ( rule__Page__Alternatives_1 ) )
			{
				// InternalCSS.g:3047:1: ( ( rule__Page__Alternatives_1 ) )
				// InternalCSS.g:3048:1: ( rule__Page__Alternatives_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getAlternatives_1());
					}
					// InternalCSS.g:3049:1: ( rule__Page__Alternatives_1 )
					// InternalCSS.g:3049:2: rule__Page__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Page__Alternatives_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getAlternatives_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__1__Impl"


	// $ANTLR start "rule__Page__Group__2"
	// InternalCSS.g:3059:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
	public final void rule__Page__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3063:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
			// InternalCSS.g:3064:2: rule__Page__Group__2__Impl rule__Page__Group__3
			{
				pushFollow(FOLLOW_13);
				rule__Page__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Page__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__2"


	// $ANTLR start "rule__Page__Group__2__Impl"
	// InternalCSS.g:3071:1: rule__Page__Group__2__Impl : ( ( rule__Page__PseudoPageAssignment_2 )? ) ;
	public final void rule__Page__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3075:1: ( ( ( rule__Page__PseudoPageAssignment_2 )? ) )
			// InternalCSS.g:3076:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
			{
				// InternalCSS.g:3076:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
				// InternalCSS.g:3077:1: ( rule__Page__PseudoPageAssignment_2 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getPseudoPageAssignment_2());
					}
					// InternalCSS.g:3078:1: ( rule__Page__PseudoPageAssignment_2 )?
					int alt43 = 2;
					int LA43_0 = input.LA(1);

					if ((LA43_0 == RULE_COLON)) {
						alt43 = 1;
					}
					switch (alt43) {
					case 1:
					// InternalCSS.g:3078:2: rule__Page__PseudoPageAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__Page__PseudoPageAssignment_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getPseudoPageAssignment_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__2__Impl"


	// $ANTLR start "rule__Page__Group__3"
	// InternalCSS.g:3088:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
	public final void rule__Page__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3092:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
			// InternalCSS.g:3093:2: rule__Page__Group__3__Impl rule__Page__Group__4
			{
				pushFollow(FOLLOW_14);
				rule__Page__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Page__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__3"


	// $ANTLR start "rule__Page__Group__3__Impl"
	// InternalCSS.g:3100:1: rule__Page__Group__3__Impl : ( '{' ) ;
	public final void rule__Page__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3104:1: ( ( '{' ) )
			// InternalCSS.g:3105:1: ( '{' )
			{
				// InternalCSS.g:3105:1: ( '{' )
				// InternalCSS.g:3106:1: '{'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
					}
					match(input, 58, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__3__Impl"


	// $ANTLR start "rule__Page__Group__4"
	// InternalCSS.g:3119:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
	public final void rule__Page__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3123:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
			// InternalCSS.g:3124:2: rule__Page__Group__4__Impl rule__Page__Group__5
			{
				pushFollow(FOLLOW_14);
				rule__Page__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Page__Group__5();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__4"


	// $ANTLR start "rule__Page__Group__4__Impl"
	// InternalCSS.g:3131:1: rule__Page__Group__4__Impl : ( ( rule__Page__DeclarationsAssignment_4 )? ) ;
	public final void rule__Page__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3135:1: ( ( ( rule__Page__DeclarationsAssignment_4 )? ) )
			// InternalCSS.g:3136:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
			{
				// InternalCSS.g:3136:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
				// InternalCSS.g:3137:1: ( rule__Page__DeclarationsAssignment_4 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getDeclarationsAssignment_4());
					}
					// InternalCSS.g:3138:1: ( rule__Page__DeclarationsAssignment_4 )?
					int alt44 = 2;
					int LA44_0 = input.LA(1);

					if (((LA44_0 >= RULE_DASH && LA44_0 <= RULE_UNDERSCORE) || (LA44_0 >= RULE_ONE_HEX_LETTER && LA44_0 <= RULE_ONE_NON_HEX_LETTER) || LA44_0 == RULE_WS || (LA44_0 >= 49 && LA44_0 <= 52))) {
						alt44 = 1;
					}
					switch (alt44) {
					case 1:
					// InternalCSS.g:3138:2: rule__Page__DeclarationsAssignment_4
					{
						pushFollow(FOLLOW_2);
						rule__Page__DeclarationsAssignment_4();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getDeclarationsAssignment_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__4__Impl"


	// $ANTLR start "rule__Page__Group__5"
	// InternalCSS.g:3148:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
	public final void rule__Page__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3152:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
			// InternalCSS.g:3153:2: rule__Page__Group__5__Impl rule__Page__Group__6
			{
				pushFollow(FOLLOW_14);
				rule__Page__Group__5__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Page__Group__6();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__5"


	// $ANTLR start "rule__Page__Group__5__Impl"
	// InternalCSS.g:3160:1: rule__Page__Group__5__Impl : ( ( rule__Page__Group_5__0 )* ) ;
	public final void rule__Page__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3164:1: ( ( ( rule__Page__Group_5__0 )* ) )
			// InternalCSS.g:3165:1: ( ( rule__Page__Group_5__0 )* )
			{
				// InternalCSS.g:3165:1: ( ( rule__Page__Group_5__0 )* )
				// InternalCSS.g:3166:1: ( rule__Page__Group_5__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getGroup_5());
					}
					// InternalCSS.g:3167:1: ( rule__Page__Group_5__0 )*
					loop45: do {
						int alt45 = 2;
						int LA45_0 = input.LA(1);

						if ((LA45_0 == 48)) {
							alt45 = 1;
						}


						switch (alt45) {
						case 1:
						// InternalCSS.g:3167:2: rule__Page__Group_5__0
						{
							pushFollow(FOLLOW_15);
							rule__Page__Group_5__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop45;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getGroup_5());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__5__Impl"


	// $ANTLR start "rule__Page__Group__6"
	// InternalCSS.g:3177:1: rule__Page__Group__6 : rule__Page__Group__6__Impl ;
	public final void rule__Page__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3181:1: ( rule__Page__Group__6__Impl )
			// InternalCSS.g:3182:2: rule__Page__Group__6__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Page__Group__6__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__6"


	// $ANTLR start "rule__Page__Group__6__Impl"
	// InternalCSS.g:3188:1: rule__Page__Group__6__Impl : ( '}' ) ;
	public final void rule__Page__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3192:1: ( ( '}' ) )
			// InternalCSS.g:3193:1: ( '}' )
			{
				// InternalCSS.g:3193:1: ( '}' )
				// InternalCSS.g:3194:1: '}'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
					}
					match(input, 59, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group__6__Impl"


	// $ANTLR start "rule__Page__Group_5__0"
	// InternalCSS.g:3221:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
	public final void rule__Page__Group_5__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3225:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
			// InternalCSS.g:3226:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
			{
				pushFollow(FOLLOW_16);
				rule__Page__Group_5__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Page__Group_5__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group_5__0"


	// $ANTLR start "rule__Page__Group_5__0__Impl"
	// InternalCSS.g:3233:1: rule__Page__Group_5__0__Impl : ( ';' ) ;
	public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3237:1: ( ( ';' ) )
			// InternalCSS.g:3238:1: ( ';' )
			{
				// InternalCSS.g:3238:1: ( ';' )
				// InternalCSS.g:3239:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group_5__0__Impl"


	// $ANTLR start "rule__Page__Group_5__1"
	// InternalCSS.g:3252:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl ;
	public final void rule__Page__Group_5__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3256:1: ( rule__Page__Group_5__1__Impl )
			// InternalCSS.g:3257:2: rule__Page__Group_5__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Page__Group_5__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group_5__1"


	// $ANTLR start "rule__Page__Group_5__1__Impl"
	// InternalCSS.g:3263:1: rule__Page__Group_5__1__Impl : ( ( rule__Page__DeclarationsAssignment_5_1 )? ) ;
	public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3267:1: ( ( ( rule__Page__DeclarationsAssignment_5_1 )? ) )
			// InternalCSS.g:3268:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
			{
				// InternalCSS.g:3268:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
				// InternalCSS.g:3269:1: ( rule__Page__DeclarationsAssignment_5_1 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1());
					}
					// InternalCSS.g:3270:1: ( rule__Page__DeclarationsAssignment_5_1 )?
					int alt46 = 2;
					int LA46_0 = input.LA(1);

					if (((LA46_0 >= RULE_DASH && LA46_0 <= RULE_UNDERSCORE) || (LA46_0 >= RULE_ONE_HEX_LETTER && LA46_0 <= RULE_ONE_NON_HEX_LETTER) || LA46_0 == RULE_WS || (LA46_0 >= 49 && LA46_0 <= 52))) {
						alt46 = 1;
					}
					switch (alt46) {
					case 1:
					// InternalCSS.g:3270:2: rule__Page__DeclarationsAssignment_5_1
					{
						pushFollow(FOLLOW_2);
						rule__Page__DeclarationsAssignment_5_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__Group_5__1__Impl"


	// $ANTLR start "rule__Pseudo_page__Group__0"
	// InternalCSS.g:3284:1: rule__Pseudo_page__Group__0 : rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 ;
	public final void rule__Pseudo_page__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3288:1: ( rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 )
			// InternalCSS.g:3289:2: rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1
			{
				pushFollow(FOLLOW_11);
				rule__Pseudo_page__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Pseudo_page__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Pseudo_page__Group__0"


	// $ANTLR start "rule__Pseudo_page__Group__0__Impl"
	// InternalCSS.g:3296:1: rule__Pseudo_page__Group__0__Impl : ( RULE_COLON ) ;
	public final void rule__Pseudo_page__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3300:1: ( ( RULE_COLON ) )
			// InternalCSS.g:3301:1: ( RULE_COLON )
			{
				// InternalCSS.g:3301:1: ( RULE_COLON )
				// InternalCSS.g:3302:1: RULE_COLON
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudo_pageAccess().getCOLONTerminalRuleCall_0());
					}
					match(input, RULE_COLON, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudo_pageAccess().getCOLONTerminalRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Pseudo_page__Group__0__Impl"


	// $ANTLR start "rule__Pseudo_page__Group__1"
	// InternalCSS.g:3313:1: rule__Pseudo_page__Group__1 : rule__Pseudo_page__Group__1__Impl ;
	public final void rule__Pseudo_page__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3317:1: ( rule__Pseudo_page__Group__1__Impl )
			// InternalCSS.g:3318:2: rule__Pseudo_page__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Pseudo_page__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Pseudo_page__Group__1"


	// $ANTLR start "rule__Pseudo_page__Group__1__Impl"
	// InternalCSS.g:3324:1: rule__Pseudo_page__Group__1__Impl : ( ruleIdentifier ) ;
	public final void rule__Pseudo_page__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3328:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:3329:1: ( ruleIdentifier )
			{
				// InternalCSS.g:3329:1: ( ruleIdentifier )
				// InternalCSS.g:3330:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudo_pageAccess().getIdentifierParserRuleCall_1());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudo_pageAccess().getIdentifierParserRuleCall_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Pseudo_page__Group__1__Impl"


	// $ANTLR start "rule__Media__Group__0"
	// InternalCSS.g:3345:1: rule__Media__Group__0 : rule__Media__Group__0__Impl rule__Media__Group__1 ;
	public final void rule__Media__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3349:1: ( rule__Media__Group__0__Impl rule__Media__Group__1 )
			// InternalCSS.g:3350:2: rule__Media__Group__0__Impl rule__Media__Group__1
			{
				pushFollow(FOLLOW_11);
				rule__Media__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Media__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__0"


	// $ANTLR start "rule__Media__Group__0__Impl"
	// InternalCSS.g:3357:1: rule__Media__Group__0__Impl : ( ( rule__Media__Alternatives_0 ) ) ;
	public final void rule__Media__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3361:1: ( ( ( rule__Media__Alternatives_0 ) ) )
			// InternalCSS.g:3362:1: ( ( rule__Media__Alternatives_0 ) )
			{
				// InternalCSS.g:3362:1: ( ( rule__Media__Alternatives_0 ) )
				// InternalCSS.g:3363:1: ( rule__Media__Alternatives_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getAlternatives_0());
					}
					// InternalCSS.g:3364:1: ( rule__Media__Alternatives_0 )
					// InternalCSS.g:3364:2: rule__Media__Alternatives_0
					{
						pushFollow(FOLLOW_2);
						rule__Media__Alternatives_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getAlternatives_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__0__Impl"


	// $ANTLR start "rule__Media__Group__1"
	// InternalCSS.g:3374:1: rule__Media__Group__1 : rule__Media__Group__1__Impl rule__Media__Group__2 ;
	public final void rule__Media__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3378:1: ( rule__Media__Group__1__Impl rule__Media__Group__2 )
			// InternalCSS.g:3379:2: rule__Media__Group__1__Impl rule__Media__Group__2
			{
				pushFollow(FOLLOW_17);
				rule__Media__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Media__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__1"


	// $ANTLR start "rule__Media__Group__1__Impl"
	// InternalCSS.g:3386:1: rule__Media__Group__1__Impl : ( ( rule__Media__MedialistAssignment_1 ) ) ;
	public final void rule__Media__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3390:1: ( ( ( rule__Media__MedialistAssignment_1 ) ) )
			// InternalCSS.g:3391:1: ( ( rule__Media__MedialistAssignment_1 ) )
			{
				// InternalCSS.g:3391:1: ( ( rule__Media__MedialistAssignment_1 ) )
				// InternalCSS.g:3392:1: ( rule__Media__MedialistAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getMedialistAssignment_1());
					}
					// InternalCSS.g:3393:1: ( rule__Media__MedialistAssignment_1 )
					// InternalCSS.g:3393:2: rule__Media__MedialistAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Media__MedialistAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getMedialistAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__1__Impl"


	// $ANTLR start "rule__Media__Group__2"
	// InternalCSS.g:3403:1: rule__Media__Group__2 : rule__Media__Group__2__Impl rule__Media__Group__3 ;
	public final void rule__Media__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3407:1: ( rule__Media__Group__2__Impl rule__Media__Group__3 )
			// InternalCSS.g:3408:2: rule__Media__Group__2__Impl rule__Media__Group__3
			{
				pushFollow(FOLLOW_18);
				rule__Media__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Media__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__2"


	// $ANTLR start "rule__Media__Group__2__Impl"
	// InternalCSS.g:3415:1: rule__Media__Group__2__Impl : ( '{' ) ;
	public final void rule__Media__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3419:1: ( ( '{' ) )
			// InternalCSS.g:3420:1: ( '{' )
			{
				// InternalCSS.g:3420:1: ( '{' )
				// InternalCSS.g:3421:1: '{'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
					}
					match(input, 58, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__2__Impl"


	// $ANTLR start "rule__Media__Group__3"
	// InternalCSS.g:3434:1: rule__Media__Group__3 : rule__Media__Group__3__Impl rule__Media__Group__4 ;
	public final void rule__Media__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3438:1: ( rule__Media__Group__3__Impl rule__Media__Group__4 )
			// InternalCSS.g:3439:2: rule__Media__Group__3__Impl rule__Media__Group__4
			{
				pushFollow(FOLLOW_18);
				rule__Media__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Media__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__3"


	// $ANTLR start "rule__Media__Group__3__Impl"
	// InternalCSS.g:3446:1: rule__Media__Group__3__Impl : ( ( rule__Media__RulesetsAssignment_3 )* ) ;
	public final void rule__Media__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3450:1: ( ( ( rule__Media__RulesetsAssignment_3 )* ) )
			// InternalCSS.g:3451:1: ( ( rule__Media__RulesetsAssignment_3 )* )
			{
				// InternalCSS.g:3451:1: ( ( rule__Media__RulesetsAssignment_3 )* )
				// InternalCSS.g:3452:1: ( rule__Media__RulesetsAssignment_3 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getRulesetsAssignment_3());
					}
					// InternalCSS.g:3453:1: ( rule__Media__RulesetsAssignment_3 )*
					loop47: do {
						int alt47 = 2;
						int LA47_0 = input.LA(1);

						if (((LA47_0 >= RULE_DASH && LA47_0 <= RULE_ONE_NON_HEX_LETTER) || LA47_0 == 36 || LA47_0 == 39 || LA47_0 == 42 || (LA47_0 >= 49 && LA47_0 <= 52) || LA47_0 == 60)) {
							alt47 = 1;
						}


						switch (alt47) {
						case 1:
						// InternalCSS.g:3453:2: rule__Media__RulesetsAssignment_3
						{
							pushFollow(FOLLOW_19);
							rule__Media__RulesetsAssignment_3();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop47;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getRulesetsAssignment_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__3__Impl"


	// $ANTLR start "rule__Media__Group__4"
	// InternalCSS.g:3463:1: rule__Media__Group__4 : rule__Media__Group__4__Impl ;
	public final void rule__Media__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3467:1: ( rule__Media__Group__4__Impl )
			// InternalCSS.g:3468:2: rule__Media__Group__4__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Media__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__4"


	// $ANTLR start "rule__Media__Group__4__Impl"
	// InternalCSS.g:3474:1: rule__Media__Group__4__Impl : ( '}' ) ;
	public final void rule__Media__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3478:1: ( ( '}' ) )
			// InternalCSS.g:3479:1: ( '}' )
			{
				// InternalCSS.g:3479:1: ( '}' )
				// InternalCSS.g:3480:1: '}'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4());
					}
					match(input, 59, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__Group__4__Impl"


	// $ANTLR start "rule__Media_list__Group__0"
	// InternalCSS.g:3503:1: rule__Media_list__Group__0 : rule__Media_list__Group__0__Impl rule__Media_list__Group__1 ;
	public final void rule__Media_list__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3507:1: ( rule__Media_list__Group__0__Impl rule__Media_list__Group__1 )
			// InternalCSS.g:3508:2: rule__Media_list__Group__0__Impl rule__Media_list__Group__1
			{
				pushFollow(FOLLOW_20);
				rule__Media_list__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Media_list__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group__0"


	// $ANTLR start "rule__Media_list__Group__0__Impl"
	// InternalCSS.g:3515:1: rule__Media_list__Group__0__Impl : ( rulemedium ) ;
	public final void rule__Media_list__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3519:1: ( ( rulemedium ) )
			// InternalCSS.g:3520:1: ( rulemedium )
			{
				// InternalCSS.g:3520:1: ( rulemedium )
				// InternalCSS.g:3521:1: rulemedium
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0());
					}
					pushFollow(FOLLOW_2);
					rulemedium();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group__0__Impl"


	// $ANTLR start "rule__Media_list__Group__1"
	// InternalCSS.g:3532:1: rule__Media_list__Group__1 : rule__Media_list__Group__1__Impl ;
	public final void rule__Media_list__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3536:1: ( rule__Media_list__Group__1__Impl )
			// InternalCSS.g:3537:2: rule__Media_list__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Media_list__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group__1"


	// $ANTLR start "rule__Media_list__Group__1__Impl"
	// InternalCSS.g:3543:1: rule__Media_list__Group__1__Impl : ( ( rule__Media_list__Group_1__0 )* ) ;
	public final void rule__Media_list__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3547:1: ( ( ( rule__Media_list__Group_1__0 )* ) )
			// InternalCSS.g:3548:1: ( ( rule__Media_list__Group_1__0 )* )
			{
				// InternalCSS.g:3548:1: ( ( rule__Media_list__Group_1__0 )* )
				// InternalCSS.g:3549:1: ( rule__Media_list__Group_1__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMedia_listAccess().getGroup_1());
					}
					// InternalCSS.g:3550:1: ( rule__Media_list__Group_1__0 )*
					loop48: do {
						int alt48 = 2;
						int LA48_0 = input.LA(1);

						if ((LA48_0 == RULE_COMMA)) {
							alt48 = 1;
						}


						switch (alt48) {
						case 1:
						// InternalCSS.g:3550:2: rule__Media_list__Group_1__0
						{
							pushFollow(FOLLOW_21);
							rule__Media_list__Group_1__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop48;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getMedia_listAccess().getGroup_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group__1__Impl"


	// $ANTLR start "rule__Media_list__Group_1__0"
	// InternalCSS.g:3564:1: rule__Media_list__Group_1__0 : rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 ;
	public final void rule__Media_list__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3568:1: ( rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 )
			// InternalCSS.g:3569:2: rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1
			{
				pushFollow(FOLLOW_11);
				rule__Media_list__Group_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Media_list__Group_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group_1__0"


	// $ANTLR start "rule__Media_list__Group_1__0__Impl"
	// InternalCSS.g:3576:1: rule__Media_list__Group_1__0__Impl : ( RULE_COMMA ) ;
	public final void rule__Media_list__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3580:1: ( ( RULE_COMMA ) )
			// InternalCSS.g:3581:1: ( RULE_COMMA )
			{
				// InternalCSS.g:3581:1: ( RULE_COMMA )
				// InternalCSS.g:3582:1: RULE_COMMA
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0());
					}
					match(input, RULE_COMMA, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group_1__0__Impl"


	// $ANTLR start "rule__Media_list__Group_1__1"
	// InternalCSS.g:3593:1: rule__Media_list__Group_1__1 : rule__Media_list__Group_1__1__Impl ;
	public final void rule__Media_list__Group_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3597:1: ( rule__Media_list__Group_1__1__Impl )
			// InternalCSS.g:3598:2: rule__Media_list__Group_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Media_list__Group_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group_1__1"


	// $ANTLR start "rule__Media_list__Group_1__1__Impl"
	// InternalCSS.g:3604:1: rule__Media_list__Group_1__1__Impl : ( rulemedium ) ;
	public final void rule__Media_list__Group_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3608:1: ( ( rulemedium ) )
			// InternalCSS.g:3609:1: ( rulemedium )
			{
				// InternalCSS.g:3609:1: ( rulemedium )
				// InternalCSS.g:3610:1: rulemedium
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1());
					}
					pushFollow(FOLLOW_2);
					rulemedium();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media_list__Group_1__1__Impl"


	// $ANTLR start "rule__Font_face__Group__0"
	// InternalCSS.g:3625:1: rule__Font_face__Group__0 : rule__Font_face__Group__0__Impl rule__Font_face__Group__1 ;
	public final void rule__Font_face__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3629:1: ( rule__Font_face__Group__0__Impl rule__Font_face__Group__1 )
			// InternalCSS.g:3630:2: rule__Font_face__Group__0__Impl rule__Font_face__Group__1
			{
				pushFollow(FOLLOW_22);
				rule__Font_face__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Font_face__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__0"


	// $ANTLR start "rule__Font_face__Group__0__Impl"
	// InternalCSS.g:3637:1: rule__Font_face__Group__0__Impl : ( () ) ;
	public final void rule__Font_face__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3641:1: ( ( () ) )
			// InternalCSS.g:3642:1: ( () )
			{
				// InternalCSS.g:3642:1: ( () )
				// InternalCSS.g:3643:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getFont_faceAction_0());
					}
					// InternalCSS.g:3644:1: ()
					// InternalCSS.g:3646:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getFont_faceAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__0__Impl"


	// $ANTLR start "rule__Font_face__Group__1"
	// InternalCSS.g:3656:1: rule__Font_face__Group__1 : rule__Font_face__Group__1__Impl rule__Font_face__Group__2 ;
	public final void rule__Font_face__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3660:1: ( rule__Font_face__Group__1__Impl rule__Font_face__Group__2 )
			// InternalCSS.g:3661:2: rule__Font_face__Group__1__Impl rule__Font_face__Group__2
			{
				pushFollow(FOLLOW_17);
				rule__Font_face__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Font_face__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__1"


	// $ANTLR start "rule__Font_face__Group__1__Impl"
	// InternalCSS.g:3668:1: rule__Font_face__Group__1__Impl : ( ( rule__Font_face__Alternatives_1 ) ) ;
	public final void rule__Font_face__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3672:1: ( ( ( rule__Font_face__Alternatives_1 ) ) )
			// InternalCSS.g:3673:1: ( ( rule__Font_face__Alternatives_1 ) )
			{
				// InternalCSS.g:3673:1: ( ( rule__Font_face__Alternatives_1 ) )
				// InternalCSS.g:3674:1: ( rule__Font_face__Alternatives_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getAlternatives_1());
					}
					// InternalCSS.g:3675:1: ( rule__Font_face__Alternatives_1 )
					// InternalCSS.g:3675:2: rule__Font_face__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Font_face__Alternatives_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getAlternatives_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__1__Impl"


	// $ANTLR start "rule__Font_face__Group__2"
	// InternalCSS.g:3685:1: rule__Font_face__Group__2 : rule__Font_face__Group__2__Impl rule__Font_face__Group__3 ;
	public final void rule__Font_face__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3689:1: ( rule__Font_face__Group__2__Impl rule__Font_face__Group__3 )
			// InternalCSS.g:3690:2: rule__Font_face__Group__2__Impl rule__Font_face__Group__3
			{
				pushFollow(FOLLOW_14);
				rule__Font_face__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Font_face__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__2"


	// $ANTLR start "rule__Font_face__Group__2__Impl"
	// InternalCSS.g:3697:1: rule__Font_face__Group__2__Impl : ( '{' ) ;
	public final void rule__Font_face__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3701:1: ( ( '{' ) )
			// InternalCSS.g:3702:1: ( '{' )
			{
				// InternalCSS.g:3702:1: ( '{' )
				// InternalCSS.g:3703:1: '{'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getLeftCurlyBracketKeyword_2());
					}
					match(input, 58, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getLeftCurlyBracketKeyword_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__2__Impl"


	// $ANTLR start "rule__Font_face__Group__3"
	// InternalCSS.g:3716:1: rule__Font_face__Group__3 : rule__Font_face__Group__3__Impl rule__Font_face__Group__4 ;
	public final void rule__Font_face__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3720:1: ( rule__Font_face__Group__3__Impl rule__Font_face__Group__4 )
			// InternalCSS.g:3721:2: rule__Font_face__Group__3__Impl rule__Font_face__Group__4
			{
				pushFollow(FOLLOW_14);
				rule__Font_face__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Font_face__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__3"


	// $ANTLR start "rule__Font_face__Group__3__Impl"
	// InternalCSS.g:3728:1: rule__Font_face__Group__3__Impl : ( ( rule__Font_face__DeclarationsAssignment_3 )? ) ;
	public final void rule__Font_face__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3732:1: ( ( ( rule__Font_face__DeclarationsAssignment_3 )? ) )
			// InternalCSS.g:3733:1: ( ( rule__Font_face__DeclarationsAssignment_3 )? )
			{
				// InternalCSS.g:3733:1: ( ( rule__Font_face__DeclarationsAssignment_3 )? )
				// InternalCSS.g:3734:1: ( rule__Font_face__DeclarationsAssignment_3 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getDeclarationsAssignment_3());
					}
					// InternalCSS.g:3735:1: ( rule__Font_face__DeclarationsAssignment_3 )?
					int alt49 = 2;
					int LA49_0 = input.LA(1);

					if (((LA49_0 >= RULE_DASH && LA49_0 <= RULE_UNDERSCORE) || (LA49_0 >= RULE_ONE_HEX_LETTER && LA49_0 <= RULE_ONE_NON_HEX_LETTER) || LA49_0 == RULE_WS || (LA49_0 >= 49 && LA49_0 <= 52))) {
						alt49 = 1;
					}
					switch (alt49) {
					case 1:
					// InternalCSS.g:3735:2: rule__Font_face__DeclarationsAssignment_3
					{
						pushFollow(FOLLOW_2);
						rule__Font_face__DeclarationsAssignment_3();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getDeclarationsAssignment_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__3__Impl"


	// $ANTLR start "rule__Font_face__Group__4"
	// InternalCSS.g:3745:1: rule__Font_face__Group__4 : rule__Font_face__Group__4__Impl rule__Font_face__Group__5 ;
	public final void rule__Font_face__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3749:1: ( rule__Font_face__Group__4__Impl rule__Font_face__Group__5 )
			// InternalCSS.g:3750:2: rule__Font_face__Group__4__Impl rule__Font_face__Group__5
			{
				pushFollow(FOLLOW_14);
				rule__Font_face__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Font_face__Group__5();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__4"


	// $ANTLR start "rule__Font_face__Group__4__Impl"
	// InternalCSS.g:3757:1: rule__Font_face__Group__4__Impl : ( ( rule__Font_face__Group_4__0 )* ) ;
	public final void rule__Font_face__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3761:1: ( ( ( rule__Font_face__Group_4__0 )* ) )
			// InternalCSS.g:3762:1: ( ( rule__Font_face__Group_4__0 )* )
			{
				// InternalCSS.g:3762:1: ( ( rule__Font_face__Group_4__0 )* )
				// InternalCSS.g:3763:1: ( rule__Font_face__Group_4__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getGroup_4());
					}
					// InternalCSS.g:3764:1: ( rule__Font_face__Group_4__0 )*
					loop50: do {
						int alt50 = 2;
						int LA50_0 = input.LA(1);

						if ((LA50_0 == 48)) {
							alt50 = 1;
						}


						switch (alt50) {
						case 1:
						// InternalCSS.g:3764:2: rule__Font_face__Group_4__0
						{
							pushFollow(FOLLOW_15);
							rule__Font_face__Group_4__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop50;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getGroup_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__4__Impl"


	// $ANTLR start "rule__Font_face__Group__5"
	// InternalCSS.g:3774:1: rule__Font_face__Group__5 : rule__Font_face__Group__5__Impl ;
	public final void rule__Font_face__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3778:1: ( rule__Font_face__Group__5__Impl )
			// InternalCSS.g:3779:2: rule__Font_face__Group__5__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Font_face__Group__5__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__5"


	// $ANTLR start "rule__Font_face__Group__5__Impl"
	// InternalCSS.g:3785:1: rule__Font_face__Group__5__Impl : ( '}' ) ;
	public final void rule__Font_face__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3789:1: ( ( '}' ) )
			// InternalCSS.g:3790:1: ( '}' )
			{
				// InternalCSS.g:3790:1: ( '}' )
				// InternalCSS.g:3791:1: '}'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getRightCurlyBracketKeyword_5());
					}
					match(input, 59, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getRightCurlyBracketKeyword_5());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group__5__Impl"


	// $ANTLR start "rule__Font_face__Group_4__0"
	// InternalCSS.g:3816:1: rule__Font_face__Group_4__0 : rule__Font_face__Group_4__0__Impl rule__Font_face__Group_4__1 ;
	public final void rule__Font_face__Group_4__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3820:1: ( rule__Font_face__Group_4__0__Impl rule__Font_face__Group_4__1 )
			// InternalCSS.g:3821:2: rule__Font_face__Group_4__0__Impl rule__Font_face__Group_4__1
			{
				pushFollow(FOLLOW_16);
				rule__Font_face__Group_4__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Font_face__Group_4__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group_4__0"


	// $ANTLR start "rule__Font_face__Group_4__0__Impl"
	// InternalCSS.g:3828:1: rule__Font_face__Group_4__0__Impl : ( ';' ) ;
	public final void rule__Font_face__Group_4__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3832:1: ( ( ';' ) )
			// InternalCSS.g:3833:1: ( ';' )
			{
				// InternalCSS.g:3833:1: ( ';' )
				// InternalCSS.g:3834:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getSemicolonKeyword_4_0());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getSemicolonKeyword_4_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group_4__0__Impl"


	// $ANTLR start "rule__Font_face__Group_4__1"
	// InternalCSS.g:3847:1: rule__Font_face__Group_4__1 : rule__Font_face__Group_4__1__Impl ;
	public final void rule__Font_face__Group_4__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3851:1: ( rule__Font_face__Group_4__1__Impl )
			// InternalCSS.g:3852:2: rule__Font_face__Group_4__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Font_face__Group_4__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group_4__1"


	// $ANTLR start "rule__Font_face__Group_4__1__Impl"
	// InternalCSS.g:3858:1: rule__Font_face__Group_4__1__Impl : ( ( rule__Font_face__DeclarationsAssignment_4_1 )? ) ;
	public final void rule__Font_face__Group_4__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3862:1: ( ( ( rule__Font_face__DeclarationsAssignment_4_1 )? ) )
			// InternalCSS.g:3863:1: ( ( rule__Font_face__DeclarationsAssignment_4_1 )? )
			{
				// InternalCSS.g:3863:1: ( ( rule__Font_face__DeclarationsAssignment_4_1 )? )
				// InternalCSS.g:3864:1: ( rule__Font_face__DeclarationsAssignment_4_1 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getDeclarationsAssignment_4_1());
					}
					// InternalCSS.g:3865:1: ( rule__Font_face__DeclarationsAssignment_4_1 )?
					int alt51 = 2;
					int LA51_0 = input.LA(1);

					if (((LA51_0 >= RULE_DASH && LA51_0 <= RULE_UNDERSCORE) || (LA51_0 >= RULE_ONE_HEX_LETTER && LA51_0 <= RULE_ONE_NON_HEX_LETTER) || LA51_0 == RULE_WS || (LA51_0 >= 49 && LA51_0 <= 52))) {
						alt51 = 1;
					}
					switch (alt51) {
					case 1:
					// InternalCSS.g:3865:2: rule__Font_face__DeclarationsAssignment_4_1
					{
						pushFollow(FOLLOW_2);
						rule__Font_face__DeclarationsAssignment_4_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getDeclarationsAssignment_4_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__Group_4__1__Impl"


	// $ANTLR start "rule__Keyframes__Group__0"
	// InternalCSS.g:3879:1: rule__Keyframes__Group__0 : rule__Keyframes__Group__0__Impl rule__Keyframes__Group__1 ;
	public final void rule__Keyframes__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3883:1: ( rule__Keyframes__Group__0__Impl rule__Keyframes__Group__1 )
			// InternalCSS.g:3884:2: rule__Keyframes__Group__0__Impl rule__Keyframes__Group__1
			{
				pushFollow(FOLLOW_23);
				rule__Keyframes__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__0"


	// $ANTLR start "rule__Keyframes__Group__0__Impl"
	// InternalCSS.g:3891:1: rule__Keyframes__Group__0__Impl : ( () ) ;
	public final void rule__Keyframes__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3895:1: ( ( () ) )
			// InternalCSS.g:3896:1: ( () )
			{
				// InternalCSS.g:3896:1: ( () )
				// InternalCSS.g:3897:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getFont_faceAction_0());
					}
					// InternalCSS.g:3898:1: ()
					// InternalCSS.g:3900:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getFont_faceAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__0__Impl"


	// $ANTLR start "rule__Keyframes__Group__1"
	// InternalCSS.g:3910:1: rule__Keyframes__Group__1 : rule__Keyframes__Group__1__Impl rule__Keyframes__Group__2 ;
	public final void rule__Keyframes__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3914:1: ( rule__Keyframes__Group__1__Impl rule__Keyframes__Group__2 )
			// InternalCSS.g:3915:2: rule__Keyframes__Group__1__Impl rule__Keyframes__Group__2
			{
				pushFollow(FOLLOW_11);
				rule__Keyframes__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__1"


	// $ANTLR start "rule__Keyframes__Group__1__Impl"
	// InternalCSS.g:3922:1: rule__Keyframes__Group__1__Impl : ( ( rule__Keyframes__Alternatives_1 ) ) ;
	public final void rule__Keyframes__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3926:1: ( ( ( rule__Keyframes__Alternatives_1 ) ) )
			// InternalCSS.g:3927:1: ( ( rule__Keyframes__Alternatives_1 ) )
			{
				// InternalCSS.g:3927:1: ( ( rule__Keyframes__Alternatives_1 ) )
				// InternalCSS.g:3928:1: ( rule__Keyframes__Alternatives_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getAlternatives_1());
					}
					// InternalCSS.g:3929:1: ( rule__Keyframes__Alternatives_1 )
					// InternalCSS.g:3929:2: rule__Keyframes__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Keyframes__Alternatives_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getAlternatives_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__1__Impl"


	// $ANTLR start "rule__Keyframes__Group__2"
	// InternalCSS.g:3939:1: rule__Keyframes__Group__2 : rule__Keyframes__Group__2__Impl rule__Keyframes__Group__3 ;
	public final void rule__Keyframes__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3943:1: ( rule__Keyframes__Group__2__Impl rule__Keyframes__Group__3 )
			// InternalCSS.g:3944:2: rule__Keyframes__Group__2__Impl rule__Keyframes__Group__3
			{
				pushFollow(FOLLOW_17);
				rule__Keyframes__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__2"


	// $ANTLR start "rule__Keyframes__Group__2__Impl"
	// InternalCSS.g:3951:1: rule__Keyframes__Group__2__Impl : ( ( rule__Keyframes__NameAssignment_2 ) ) ;
	public final void rule__Keyframes__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3955:1: ( ( ( rule__Keyframes__NameAssignment_2 ) ) )
			// InternalCSS.g:3956:1: ( ( rule__Keyframes__NameAssignment_2 ) )
			{
				// InternalCSS.g:3956:1: ( ( rule__Keyframes__NameAssignment_2 ) )
				// InternalCSS.g:3957:1: ( rule__Keyframes__NameAssignment_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getNameAssignment_2());
					}
					// InternalCSS.g:3958:1: ( rule__Keyframes__NameAssignment_2 )
					// InternalCSS.g:3958:2: rule__Keyframes__NameAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__Keyframes__NameAssignment_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getNameAssignment_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__2__Impl"


	// $ANTLR start "rule__Keyframes__Group__3"
	// InternalCSS.g:3968:1: rule__Keyframes__Group__3 : rule__Keyframes__Group__3__Impl rule__Keyframes__Group__4 ;
	public final void rule__Keyframes__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3972:1: ( rule__Keyframes__Group__3__Impl rule__Keyframes__Group__4 )
			// InternalCSS.g:3973:2: rule__Keyframes__Group__3__Impl rule__Keyframes__Group__4
			{
				pushFollow(FOLLOW_24);
				rule__Keyframes__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__3"


	// $ANTLR start "rule__Keyframes__Group__3__Impl"
	// InternalCSS.g:3980:1: rule__Keyframes__Group__3__Impl : ( '{' ) ;
	public final void rule__Keyframes__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:3984:1: ( ( '{' ) )
			// InternalCSS.g:3985:1: ( '{' )
			{
				// InternalCSS.g:3985:1: ( '{' )
				// InternalCSS.g:3986:1: '{'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getLeftCurlyBracketKeyword_3());
					}
					match(input, 58, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getLeftCurlyBracketKeyword_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__3__Impl"


	// $ANTLR start "rule__Keyframes__Group__4"
	// InternalCSS.g:3999:1: rule__Keyframes__Group__4 : rule__Keyframes__Group__4__Impl rule__Keyframes__Group__5 ;
	public final void rule__Keyframes__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4003:1: ( rule__Keyframes__Group__4__Impl rule__Keyframes__Group__5 )
			// InternalCSS.g:4004:2: rule__Keyframes__Group__4__Impl rule__Keyframes__Group__5
			{
				pushFollow(FOLLOW_24);
				rule__Keyframes__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group__5();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__4"


	// $ANTLR start "rule__Keyframes__Group__4__Impl"
	// InternalCSS.g:4011:1: rule__Keyframes__Group__4__Impl : ( ( rule__Keyframes__KeyframeselectorsAssignment_4 )? ) ;
	public final void rule__Keyframes__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4015:1: ( ( ( rule__Keyframes__KeyframeselectorsAssignment_4 )? ) )
			// InternalCSS.g:4016:1: ( ( rule__Keyframes__KeyframeselectorsAssignment_4 )? )
			{
				// InternalCSS.g:4016:1: ( ( rule__Keyframes__KeyframeselectorsAssignment_4 )? )
				// InternalCSS.g:4017:1: ( rule__Keyframes__KeyframeselectorsAssignment_4 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getKeyframeselectorsAssignment_4());
					}
					// InternalCSS.g:4018:1: ( rule__Keyframes__KeyframeselectorsAssignment_4 )?
					int alt52 = 2;
					int LA52_0 = input.LA(1);

					if ((LA52_0 == RULE_PLUS || (LA52_0 >= RULE_DASH && LA52_0 <= RULE_UNDERSCORE) || (LA52_0 >= RULE_ONE_HEX_LETTER && LA52_0 <= RULE_ONE_INT) || LA52_0 == 39 || (LA52_0 >= 49 && LA52_0 <= 52))) {
						alt52 = 1;
					}
					switch (alt52) {
					case 1:
					// InternalCSS.g:4018:2: rule__Keyframes__KeyframeselectorsAssignment_4
					{
						pushFollow(FOLLOW_2);
						rule__Keyframes__KeyframeselectorsAssignment_4();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getKeyframeselectorsAssignment_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__4__Impl"


	// $ANTLR start "rule__Keyframes__Group__5"
	// InternalCSS.g:4028:1: rule__Keyframes__Group__5 : rule__Keyframes__Group__5__Impl rule__Keyframes__Group__6 ;
	public final void rule__Keyframes__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4032:1: ( rule__Keyframes__Group__5__Impl rule__Keyframes__Group__6 )
			// InternalCSS.g:4033:2: rule__Keyframes__Group__5__Impl rule__Keyframes__Group__6
			{
				pushFollow(FOLLOW_24);
				rule__Keyframes__Group__5__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group__6();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__5"


	// $ANTLR start "rule__Keyframes__Group__5__Impl"
	// InternalCSS.g:4040:1: rule__Keyframes__Group__5__Impl : ( ( rule__Keyframes__Group_5__0 )* ) ;
	public final void rule__Keyframes__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4044:1: ( ( ( rule__Keyframes__Group_5__0 )* ) )
			// InternalCSS.g:4045:1: ( ( rule__Keyframes__Group_5__0 )* )
			{
				// InternalCSS.g:4045:1: ( ( rule__Keyframes__Group_5__0 )* )
				// InternalCSS.g:4046:1: ( rule__Keyframes__Group_5__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getGroup_5());
					}
					// InternalCSS.g:4047:1: ( rule__Keyframes__Group_5__0 )*
					loop53: do {
						int alt53 = 2;
						int LA53_0 = input.LA(1);

						if ((LA53_0 == 48)) {
							alt53 = 1;
						}


						switch (alt53) {
						case 1:
						// InternalCSS.g:4047:2: rule__Keyframes__Group_5__0
						{
							pushFollow(FOLLOW_15);
							rule__Keyframes__Group_5__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop53;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getGroup_5());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__5__Impl"


	// $ANTLR start "rule__Keyframes__Group__6"
	// InternalCSS.g:4057:1: rule__Keyframes__Group__6 : rule__Keyframes__Group__6__Impl ;
	public final void rule__Keyframes__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4061:1: ( rule__Keyframes__Group__6__Impl )
			// InternalCSS.g:4062:2: rule__Keyframes__Group__6__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group__6__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__6"


	// $ANTLR start "rule__Keyframes__Group__6__Impl"
	// InternalCSS.g:4068:1: rule__Keyframes__Group__6__Impl : ( '}' ) ;
	public final void rule__Keyframes__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4072:1: ( ( '}' ) )
			// InternalCSS.g:4073:1: ( '}' )
			{
				// InternalCSS.g:4073:1: ( '}' )
				// InternalCSS.g:4074:1: '}'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getRightCurlyBracketKeyword_6());
					}
					match(input, 59, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getRightCurlyBracketKeyword_6());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group__6__Impl"


	// $ANTLR start "rule__Keyframes__Group_5__0"
	// InternalCSS.g:4101:1: rule__Keyframes__Group_5__0 : rule__Keyframes__Group_5__0__Impl rule__Keyframes__Group_5__1 ;
	public final void rule__Keyframes__Group_5__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4105:1: ( rule__Keyframes__Group_5__0__Impl rule__Keyframes__Group_5__1 )
			// InternalCSS.g:4106:2: rule__Keyframes__Group_5__0__Impl rule__Keyframes__Group_5__1
			{
				pushFollow(FOLLOW_25);
				rule__Keyframes__Group_5__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group_5__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group_5__0"


	// $ANTLR start "rule__Keyframes__Group_5__0__Impl"
	// InternalCSS.g:4113:1: rule__Keyframes__Group_5__0__Impl : ( ';' ) ;
	public final void rule__Keyframes__Group_5__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4117:1: ( ( ';' ) )
			// InternalCSS.g:4118:1: ( ';' )
			{
				// InternalCSS.g:4118:1: ( ';' )
				// InternalCSS.g:4119:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getSemicolonKeyword_5_0());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getSemicolonKeyword_5_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group_5__0__Impl"


	// $ANTLR start "rule__Keyframes__Group_5__1"
	// InternalCSS.g:4132:1: rule__Keyframes__Group_5__1 : rule__Keyframes__Group_5__1__Impl ;
	public final void rule__Keyframes__Group_5__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4136:1: ( rule__Keyframes__Group_5__1__Impl )
			// InternalCSS.g:4137:2: rule__Keyframes__Group_5__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Keyframes__Group_5__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group_5__1"


	// $ANTLR start "rule__Keyframes__Group_5__1__Impl"
	// InternalCSS.g:4143:1: rule__Keyframes__Group_5__1__Impl : ( ( rule__Keyframes__KeyframeselectorsAssignment_5_1 )? ) ;
	public final void rule__Keyframes__Group_5__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4147:1: ( ( ( rule__Keyframes__KeyframeselectorsAssignment_5_1 )? ) )
			// InternalCSS.g:4148:1: ( ( rule__Keyframes__KeyframeselectorsAssignment_5_1 )? )
			{
				// InternalCSS.g:4148:1: ( ( rule__Keyframes__KeyframeselectorsAssignment_5_1 )? )
				// InternalCSS.g:4149:1: ( rule__Keyframes__KeyframeselectorsAssignment_5_1 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getKeyframeselectorsAssignment_5_1());
					}
					// InternalCSS.g:4150:1: ( rule__Keyframes__KeyframeselectorsAssignment_5_1 )?
					int alt54 = 2;
					int LA54_0 = input.LA(1);

					if ((LA54_0 == RULE_PLUS || (LA54_0 >= RULE_DASH && LA54_0 <= RULE_UNDERSCORE) || (LA54_0 >= RULE_ONE_HEX_LETTER && LA54_0 <= RULE_ONE_INT) || LA54_0 == 39 || (LA54_0 >= 49 && LA54_0 <= 52))) {
						alt54 = 1;
					}
					switch (alt54) {
					case 1:
					// InternalCSS.g:4150:2: rule__Keyframes__KeyframeselectorsAssignment_5_1
					{
						pushFollow(FOLLOW_2);
						rule__Keyframes__KeyframeselectorsAssignment_5_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getKeyframeselectorsAssignment_5_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__Group_5__1__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group__0"
	// InternalCSS.g:4164:1: rule__Keyframe_selector__Group__0 : rule__Keyframe_selector__Group__0__Impl rule__Keyframe_selector__Group__1 ;
	public final void rule__Keyframe_selector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4168:1: ( rule__Keyframe_selector__Group__0__Impl rule__Keyframe_selector__Group__1 )
			// InternalCSS.g:4169:2: rule__Keyframe_selector__Group__0__Impl rule__Keyframe_selector__Group__1
			{
				pushFollow(FOLLOW_17);
				rule__Keyframe_selector__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__0"


	// $ANTLR start "rule__Keyframe_selector__Group__0__Impl"
	// InternalCSS.g:4176:1: rule__Keyframe_selector__Group__0__Impl : ( ( rule__Keyframe_selector__Alternatives_0 ) ) ;
	public final void rule__Keyframe_selector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4180:1: ( ( ( rule__Keyframe_selector__Alternatives_0 ) ) )
			// InternalCSS.g:4181:1: ( ( rule__Keyframe_selector__Alternatives_0 ) )
			{
				// InternalCSS.g:4181:1: ( ( rule__Keyframe_selector__Alternatives_0 ) )
				// InternalCSS.g:4182:1: ( rule__Keyframe_selector__Alternatives_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getAlternatives_0());
					}
					// InternalCSS.g:4183:1: ( rule__Keyframe_selector__Alternatives_0 )
					// InternalCSS.g:4183:2: rule__Keyframe_selector__Alternatives_0
					{
						pushFollow(FOLLOW_2);
						rule__Keyframe_selector__Alternatives_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getAlternatives_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__0__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group__1"
	// InternalCSS.g:4193:1: rule__Keyframe_selector__Group__1 : rule__Keyframe_selector__Group__1__Impl rule__Keyframe_selector__Group__2 ;
	public final void rule__Keyframe_selector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4197:1: ( rule__Keyframe_selector__Group__1__Impl rule__Keyframe_selector__Group__2 )
			// InternalCSS.g:4198:2: rule__Keyframe_selector__Group__1__Impl rule__Keyframe_selector__Group__2
			{
				pushFollow(FOLLOW_14);
				rule__Keyframe_selector__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__1"


	// $ANTLR start "rule__Keyframe_selector__Group__1__Impl"
	// InternalCSS.g:4205:1: rule__Keyframe_selector__Group__1__Impl : ( '{' ) ;
	public final void rule__Keyframe_selector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4209:1: ( ( '{' ) )
			// InternalCSS.g:4210:1: ( '{' )
			{
				// InternalCSS.g:4210:1: ( '{' )
				// InternalCSS.g:4211:1: '{'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getLeftCurlyBracketKeyword_1());
					}
					match(input, 58, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getLeftCurlyBracketKeyword_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__1__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group__2"
	// InternalCSS.g:4224:1: rule__Keyframe_selector__Group__2 : rule__Keyframe_selector__Group__2__Impl rule__Keyframe_selector__Group__3 ;
	public final void rule__Keyframe_selector__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4228:1: ( rule__Keyframe_selector__Group__2__Impl rule__Keyframe_selector__Group__3 )
			// InternalCSS.g:4229:2: rule__Keyframe_selector__Group__2__Impl rule__Keyframe_selector__Group__3
			{
				pushFollow(FOLLOW_14);
				rule__Keyframe_selector__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__2"


	// $ANTLR start "rule__Keyframe_selector__Group__2__Impl"
	// InternalCSS.g:4236:1: rule__Keyframe_selector__Group__2__Impl : ( ( rule__Keyframe_selector__DeclarationsAssignment_2 )? ) ;
	public final void rule__Keyframe_selector__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4240:1: ( ( ( rule__Keyframe_selector__DeclarationsAssignment_2 )? ) )
			// InternalCSS.g:4241:1: ( ( rule__Keyframe_selector__DeclarationsAssignment_2 )? )
			{
				// InternalCSS.g:4241:1: ( ( rule__Keyframe_selector__DeclarationsAssignment_2 )? )
				// InternalCSS.g:4242:1: ( rule__Keyframe_selector__DeclarationsAssignment_2 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getDeclarationsAssignment_2());
					}
					// InternalCSS.g:4243:1: ( rule__Keyframe_selector__DeclarationsAssignment_2 )?
					int alt55 = 2;
					int LA55_0 = input.LA(1);

					if (((LA55_0 >= RULE_DASH && LA55_0 <= RULE_UNDERSCORE) || (LA55_0 >= RULE_ONE_HEX_LETTER && LA55_0 <= RULE_ONE_NON_HEX_LETTER) || LA55_0 == RULE_WS || (LA55_0 >= 49 && LA55_0 <= 52))) {
						alt55 = 1;
					}
					switch (alt55) {
					case 1:
					// InternalCSS.g:4243:2: rule__Keyframe_selector__DeclarationsAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__Keyframe_selector__DeclarationsAssignment_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getDeclarationsAssignment_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__2__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group__3"
	// InternalCSS.g:4253:1: rule__Keyframe_selector__Group__3 : rule__Keyframe_selector__Group__3__Impl rule__Keyframe_selector__Group__4 ;
	public final void rule__Keyframe_selector__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4257:1: ( rule__Keyframe_selector__Group__3__Impl rule__Keyframe_selector__Group__4 )
			// InternalCSS.g:4258:2: rule__Keyframe_selector__Group__3__Impl rule__Keyframe_selector__Group__4
			{
				pushFollow(FOLLOW_14);
				rule__Keyframe_selector__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__3"


	// $ANTLR start "rule__Keyframe_selector__Group__3__Impl"
	// InternalCSS.g:4265:1: rule__Keyframe_selector__Group__3__Impl : ( ( rule__Keyframe_selector__Group_3__0 )* ) ;
	public final void rule__Keyframe_selector__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4269:1: ( ( ( rule__Keyframe_selector__Group_3__0 )* ) )
			// InternalCSS.g:4270:1: ( ( rule__Keyframe_selector__Group_3__0 )* )
			{
				// InternalCSS.g:4270:1: ( ( rule__Keyframe_selector__Group_3__0 )* )
				// InternalCSS.g:4271:1: ( rule__Keyframe_selector__Group_3__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getGroup_3());
					}
					// InternalCSS.g:4272:1: ( rule__Keyframe_selector__Group_3__0 )*
					loop56: do {
						int alt56 = 2;
						int LA56_0 = input.LA(1);

						if ((LA56_0 == 48)) {
							alt56 = 1;
						}


						switch (alt56) {
						case 1:
						// InternalCSS.g:4272:2: rule__Keyframe_selector__Group_3__0
						{
							pushFollow(FOLLOW_15);
							rule__Keyframe_selector__Group_3__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop56;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getGroup_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__3__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group__4"
	// InternalCSS.g:4282:1: rule__Keyframe_selector__Group__4 : rule__Keyframe_selector__Group__4__Impl ;
	public final void rule__Keyframe_selector__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4286:1: ( rule__Keyframe_selector__Group__4__Impl )
			// InternalCSS.g:4287:2: rule__Keyframe_selector__Group__4__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__4"


	// $ANTLR start "rule__Keyframe_selector__Group__4__Impl"
	// InternalCSS.g:4293:1: rule__Keyframe_selector__Group__4__Impl : ( '}' ) ;
	public final void rule__Keyframe_selector__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4297:1: ( ( '}' ) )
			// InternalCSS.g:4298:1: ( '}' )
			{
				// InternalCSS.g:4298:1: ( '}' )
				// InternalCSS.g:4299:1: '}'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getRightCurlyBracketKeyword_4());
					}
					match(input, 59, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getRightCurlyBracketKeyword_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group__4__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group_0_1__0"
	// InternalCSS.g:4322:1: rule__Keyframe_selector__Group_0_1__0 : rule__Keyframe_selector__Group_0_1__0__Impl rule__Keyframe_selector__Group_0_1__1 ;
	public final void rule__Keyframe_selector__Group_0_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4326:1: ( rule__Keyframe_selector__Group_0_1__0__Impl rule__Keyframe_selector__Group_0_1__1 )
			// InternalCSS.g:4327:2: rule__Keyframe_selector__Group_0_1__0__Impl rule__Keyframe_selector__Group_0_1__1
			{
				pushFollow(FOLLOW_26);
				rule__Keyframe_selector__Group_0_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group_0_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_0_1__0"


	// $ANTLR start "rule__Keyframe_selector__Group_0_1__0__Impl"
	// InternalCSS.g:4334:1: rule__Keyframe_selector__Group_0_1__0__Impl : ( ( rule__Keyframe_selector__PercentageAssignment_0_1_0 ) ) ;
	public final void rule__Keyframe_selector__Group_0_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4338:1: ( ( ( rule__Keyframe_selector__PercentageAssignment_0_1_0 ) ) )
			// InternalCSS.g:4339:1: ( ( rule__Keyframe_selector__PercentageAssignment_0_1_0 ) )
			{
				// InternalCSS.g:4339:1: ( ( rule__Keyframe_selector__PercentageAssignment_0_1_0 ) )
				// InternalCSS.g:4340:1: ( rule__Keyframe_selector__PercentageAssignment_0_1_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getPercentageAssignment_0_1_0());
					}
					// InternalCSS.g:4341:1: ( rule__Keyframe_selector__PercentageAssignment_0_1_0 )
					// InternalCSS.g:4341:2: rule__Keyframe_selector__PercentageAssignment_0_1_0
					{
						pushFollow(FOLLOW_2);
						rule__Keyframe_selector__PercentageAssignment_0_1_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getPercentageAssignment_0_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_0_1__0__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group_0_1__1"
	// InternalCSS.g:4351:1: rule__Keyframe_selector__Group_0_1__1 : rule__Keyframe_selector__Group_0_1__1__Impl ;
	public final void rule__Keyframe_selector__Group_0_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4355:1: ( rule__Keyframe_selector__Group_0_1__1__Impl )
			// InternalCSS.g:4356:2: rule__Keyframe_selector__Group_0_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group_0_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_0_1__1"


	// $ANTLR start "rule__Keyframe_selector__Group_0_1__1__Impl"
	// InternalCSS.g:4362:1: rule__Keyframe_selector__Group_0_1__1__Impl : ( RULE_PERCENT ) ;
	public final void rule__Keyframe_selector__Group_0_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4366:1: ( ( RULE_PERCENT ) )
			// InternalCSS.g:4367:1: ( RULE_PERCENT )
			{
				// InternalCSS.g:4367:1: ( RULE_PERCENT )
				// InternalCSS.g:4368:1: RULE_PERCENT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getPERCENTTerminalRuleCall_0_1_1());
					}
					match(input, RULE_PERCENT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getPERCENTTerminalRuleCall_0_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_0_1__1__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group_3__0"
	// InternalCSS.g:4383:1: rule__Keyframe_selector__Group_3__0 : rule__Keyframe_selector__Group_3__0__Impl rule__Keyframe_selector__Group_3__1 ;
	public final void rule__Keyframe_selector__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4387:1: ( rule__Keyframe_selector__Group_3__0__Impl rule__Keyframe_selector__Group_3__1 )
			// InternalCSS.g:4388:2: rule__Keyframe_selector__Group_3__0__Impl rule__Keyframe_selector__Group_3__1
			{
				pushFollow(FOLLOW_16);
				rule__Keyframe_selector__Group_3__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group_3__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_3__0"


	// $ANTLR start "rule__Keyframe_selector__Group_3__0__Impl"
	// InternalCSS.g:4395:1: rule__Keyframe_selector__Group_3__0__Impl : ( ';' ) ;
	public final void rule__Keyframe_selector__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4399:1: ( ( ';' ) )
			// InternalCSS.g:4400:1: ( ';' )
			{
				// InternalCSS.g:4400:1: ( ';' )
				// InternalCSS.g:4401:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getSemicolonKeyword_3_0());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getSemicolonKeyword_3_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_3__0__Impl"


	// $ANTLR start "rule__Keyframe_selector__Group_3__1"
	// InternalCSS.g:4414:1: rule__Keyframe_selector__Group_3__1 : rule__Keyframe_selector__Group_3__1__Impl ;
	public final void rule__Keyframe_selector__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4418:1: ( rule__Keyframe_selector__Group_3__1__Impl )
			// InternalCSS.g:4419:2: rule__Keyframe_selector__Group_3__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Keyframe_selector__Group_3__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_3__1"


	// $ANTLR start "rule__Keyframe_selector__Group_3__1__Impl"
	// InternalCSS.g:4425:1: rule__Keyframe_selector__Group_3__1__Impl : ( ( rule__Keyframe_selector__DeclarationsAssignment_3_1 )? ) ;
	public final void rule__Keyframe_selector__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4429:1: ( ( ( rule__Keyframe_selector__DeclarationsAssignment_3_1 )? ) )
			// InternalCSS.g:4430:1: ( ( rule__Keyframe_selector__DeclarationsAssignment_3_1 )? )
			{
				// InternalCSS.g:4430:1: ( ( rule__Keyframe_selector__DeclarationsAssignment_3_1 )? )
				// InternalCSS.g:4431:1: ( rule__Keyframe_selector__DeclarationsAssignment_3_1 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getDeclarationsAssignment_3_1());
					}
					// InternalCSS.g:4432:1: ( rule__Keyframe_selector__DeclarationsAssignment_3_1 )?
					int alt57 = 2;
					int LA57_0 = input.LA(1);

					if (((LA57_0 >= RULE_DASH && LA57_0 <= RULE_UNDERSCORE) || (LA57_0 >= RULE_ONE_HEX_LETTER && LA57_0 <= RULE_ONE_NON_HEX_LETTER) || LA57_0 == RULE_WS || (LA57_0 >= 49 && LA57_0 <= 52))) {
						alt57 = 1;
					}
					switch (alt57) {
					case 1:
					// InternalCSS.g:4432:2: rule__Keyframe_selector__DeclarationsAssignment_3_1
					{
						pushFollow(FOLLOW_2);
						rule__Keyframe_selector__DeclarationsAssignment_3_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getDeclarationsAssignment_3_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__Group_3__1__Impl"


	// $ANTLR start "rule__Ruleset__Group__0"
	// InternalCSS.g:4446:1: rule__Ruleset__Group__0 : rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 ;
	public final void rule__Ruleset__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4450:1: ( rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 )
			// InternalCSS.g:4451:2: rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1
			{
				pushFollow(FOLLOW_27);
				rule__Ruleset__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__0"


	// $ANTLR start "rule__Ruleset__Group__0__Impl"
	// InternalCSS.g:4458:1: rule__Ruleset__Group__0__Impl : ( ( rule__Ruleset__SelectorsAssignment_0 ) ) ;
	public final void rule__Ruleset__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4462:1: ( ( ( rule__Ruleset__SelectorsAssignment_0 ) ) )
			// InternalCSS.g:4463:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
			{
				// InternalCSS.g:4463:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
				// InternalCSS.g:4464:1: ( rule__Ruleset__SelectorsAssignment_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getSelectorsAssignment_0());
					}
					// InternalCSS.g:4465:1: ( rule__Ruleset__SelectorsAssignment_0 )
					// InternalCSS.g:4465:2: rule__Ruleset__SelectorsAssignment_0
					{
						pushFollow(FOLLOW_2);
						rule__Ruleset__SelectorsAssignment_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getSelectorsAssignment_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__0__Impl"


	// $ANTLR start "rule__Ruleset__Group__1"
	// InternalCSS.g:4475:1: rule__Ruleset__Group__1 : rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 ;
	public final void rule__Ruleset__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4479:1: ( rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 )
			// InternalCSS.g:4480:2: rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2
			{
				pushFollow(FOLLOW_27);
				rule__Ruleset__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__1"


	// $ANTLR start "rule__Ruleset__Group__1__Impl"
	// InternalCSS.g:4487:1: rule__Ruleset__Group__1__Impl : ( ( rule__Ruleset__Group_1__0 )* ) ;
	public final void rule__Ruleset__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4491:1: ( ( ( rule__Ruleset__Group_1__0 )* ) )
			// InternalCSS.g:4492:1: ( ( rule__Ruleset__Group_1__0 )* )
			{
				// InternalCSS.g:4492:1: ( ( rule__Ruleset__Group_1__0 )* )
				// InternalCSS.g:4493:1: ( rule__Ruleset__Group_1__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getGroup_1());
					}
					// InternalCSS.g:4494:1: ( rule__Ruleset__Group_1__0 )*
					loop58: do {
						int alt58 = 2;
						alt58 = dfa58.predict(input);
						switch (alt58) {
						case 1:
						// InternalCSS.g:4494:2: rule__Ruleset__Group_1__0
						{
							pushFollow(FOLLOW_28);
							rule__Ruleset__Group_1__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop58;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getGroup_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__1__Impl"


	// $ANTLR start "rule__Ruleset__Group__2"
	// InternalCSS.g:4504:1: rule__Ruleset__Group__2 : rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 ;
	public final void rule__Ruleset__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4508:1: ( rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 )
			// InternalCSS.g:4509:2: rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3
			{
				pushFollow(FOLLOW_27);
				rule__Ruleset__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__2"


	// $ANTLR start "rule__Ruleset__Group__2__Impl"
	// InternalCSS.g:4516:1: rule__Ruleset__Group__2__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Ruleset__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4520:1: ( ( ( RULE_WS )* ) )
			// InternalCSS.g:4521:1: ( ( RULE_WS )* )
			{
				// InternalCSS.g:4521:1: ( ( RULE_WS )* )
				// InternalCSS.g:4522:1: ( RULE_WS )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2());
					}
					// InternalCSS.g:4523:1: ( RULE_WS )*
					loop59: do {
						int alt59 = 2;
						int LA59_0 = input.LA(1);

						if ((LA59_0 == RULE_WS)) {
							alt59 = 1;
						}


						switch (alt59) {
						case 1:
						// InternalCSS.g:4523:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_29);
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop59;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__2__Impl"


	// $ANTLR start "rule__Ruleset__Group__3"
	// InternalCSS.g:4533:1: rule__Ruleset__Group__3 : rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 ;
	public final void rule__Ruleset__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4537:1: ( rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 )
			// InternalCSS.g:4538:2: rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4
			{
				pushFollow(FOLLOW_30);
				rule__Ruleset__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__3"


	// $ANTLR start "rule__Ruleset__Group__3__Impl"
	// InternalCSS.g:4545:1: rule__Ruleset__Group__3__Impl : ( '{' ) ;
	public final void rule__Ruleset__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4549:1: ( ( '{' ) )
			// InternalCSS.g:4550:1: ( '{' )
			{
				// InternalCSS.g:4550:1: ( '{' )
				// InternalCSS.g:4551:1: '{'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
					}
					match(input, 58, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__3__Impl"


	// $ANTLR start "rule__Ruleset__Group__4"
	// InternalCSS.g:4564:1: rule__Ruleset__Group__4 : rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 ;
	public final void rule__Ruleset__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4568:1: ( rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 )
			// InternalCSS.g:4569:2: rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5
			{
				pushFollow(FOLLOW_30);
				rule__Ruleset__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group__5();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__4"


	// $ANTLR start "rule__Ruleset__Group__4__Impl"
	// InternalCSS.g:4576:1: rule__Ruleset__Group__4__Impl : ( ( rule__Ruleset__Group_4__0 )? ) ;
	public final void rule__Ruleset__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4580:1: ( ( ( rule__Ruleset__Group_4__0 )? ) )
			// InternalCSS.g:4581:1: ( ( rule__Ruleset__Group_4__0 )? )
			{
				// InternalCSS.g:4581:1: ( ( rule__Ruleset__Group_4__0 )? )
				// InternalCSS.g:4582:1: ( rule__Ruleset__Group_4__0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getGroup_4());
					}
					// InternalCSS.g:4583:1: ( rule__Ruleset__Group_4__0 )?
					int alt60 = 2;
					int LA60_0 = input.LA(1);

					if (((LA60_0 >= RULE_DASH && LA60_0 <= RULE_UNDERSCORE) || (LA60_0 >= RULE_ONE_HEX_LETTER && LA60_0 <= RULE_ONE_NON_HEX_LETTER) || LA60_0 == RULE_WS || (LA60_0 >= 49 && LA60_0 <= 52))) {
						alt60 = 1;
					}
					switch (alt60) {
					case 1:
					// InternalCSS.g:4583:2: rule__Ruleset__Group_4__0
					{
						pushFollow(FOLLOW_2);
						rule__Ruleset__Group_4__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getGroup_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__4__Impl"


	// $ANTLR start "rule__Ruleset__Group__5"
	// InternalCSS.g:4593:1: rule__Ruleset__Group__5 : rule__Ruleset__Group__5__Impl ;
	public final void rule__Ruleset__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4597:1: ( rule__Ruleset__Group__5__Impl )
			// InternalCSS.g:4598:2: rule__Ruleset__Group__5__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group__5__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__5"


	// $ANTLR start "rule__Ruleset__Group__5__Impl"
	// InternalCSS.g:4604:1: rule__Ruleset__Group__5__Impl : ( '}' ) ;
	public final void rule__Ruleset__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4608:1: ( ( '}' ) )
			// InternalCSS.g:4609:1: ( '}' )
			{
				// InternalCSS.g:4609:1: ( '}' )
				// InternalCSS.g:4610:1: '}'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5());
					}
					match(input, 59, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group__5__Impl"


	// $ANTLR start "rule__Ruleset__Group_1__0"
	// InternalCSS.g:4635:1: rule__Ruleset__Group_1__0 : rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 ;
	public final void rule__Ruleset__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4639:1: ( rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 )
			// InternalCSS.g:4640:2: rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1
			{
				pushFollow(FOLLOW_31);
				rule__Ruleset__Group_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_1__0"


	// $ANTLR start "rule__Ruleset__Group_1__0__Impl"
	// InternalCSS.g:4647:1: rule__Ruleset__Group_1__0__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Ruleset__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4651:1: ( ( ( RULE_WS )* ) )
			// InternalCSS.g:4652:1: ( ( RULE_WS )* )
			{
				// InternalCSS.g:4652:1: ( ( RULE_WS )* )
				// InternalCSS.g:4653:1: ( RULE_WS )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_0());
					}
					// InternalCSS.g:4654:1: ( RULE_WS )*
					loop61: do {
						int alt61 = 2;
						int LA61_0 = input.LA(1);

						if ((LA61_0 == RULE_WS)) {
							alt61 = 1;
						}


						switch (alt61) {
						case 1:
						// InternalCSS.g:4654:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_29);
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop61;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_1__0__Impl"


	// $ANTLR start "rule__Ruleset__Group_1__1"
	// InternalCSS.g:4664:1: rule__Ruleset__Group_1__1 : rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2 ;
	public final void rule__Ruleset__Group_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4668:1: ( rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2 )
			// InternalCSS.g:4669:2: rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2
			{
				pushFollow(FOLLOW_32);
				rule__Ruleset__Group_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_1__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_1__1"


	// $ANTLR start "rule__Ruleset__Group_1__1__Impl"
	// InternalCSS.g:4676:1: rule__Ruleset__Group_1__1__Impl : ( RULE_COMMA ) ;
	public final void rule__Ruleset__Group_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4680:1: ( ( RULE_COMMA ) )
			// InternalCSS.g:4681:1: ( RULE_COMMA )
			{
				// InternalCSS.g:4681:1: ( RULE_COMMA )
				// InternalCSS.g:4682:1: RULE_COMMA
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_1());
					}
					match(input, RULE_COMMA, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_1__1__Impl"


	// $ANTLR start "rule__Ruleset__Group_1__2"
	// InternalCSS.g:4693:1: rule__Ruleset__Group_1__2 : rule__Ruleset__Group_1__2__Impl ;
	public final void rule__Ruleset__Group_1__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4697:1: ( rule__Ruleset__Group_1__2__Impl )
			// InternalCSS.g:4698:2: rule__Ruleset__Group_1__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_1__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_1__2"


	// $ANTLR start "rule__Ruleset__Group_1__2__Impl"
	// InternalCSS.g:4704:1: rule__Ruleset__Group_1__2__Impl : ( ( rule__Ruleset__SelectorsAssignment_1_2 ) ) ;
	public final void rule__Ruleset__Group_1__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4708:1: ( ( ( rule__Ruleset__SelectorsAssignment_1_2 ) ) )
			// InternalCSS.g:4709:1: ( ( rule__Ruleset__SelectorsAssignment_1_2 ) )
			{
				// InternalCSS.g:4709:1: ( ( rule__Ruleset__SelectorsAssignment_1_2 ) )
				// InternalCSS.g:4710:1: ( rule__Ruleset__SelectorsAssignment_1_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_2());
					}
					// InternalCSS.g:4711:1: ( rule__Ruleset__SelectorsAssignment_1_2 )
					// InternalCSS.g:4711:2: rule__Ruleset__SelectorsAssignment_1_2
					{
						pushFollow(FOLLOW_2);
						rule__Ruleset__SelectorsAssignment_1_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_1__2__Impl"


	// $ANTLR start "rule__Ruleset__Group_4__0"
	// InternalCSS.g:4727:1: rule__Ruleset__Group_4__0 : rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1 ;
	public final void rule__Ruleset__Group_4__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4731:1: ( rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1 )
			// InternalCSS.g:4732:2: rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1
			{
				pushFollow(FOLLOW_9);
				rule__Ruleset__Group_4__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_4__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4__0"


	// $ANTLR start "rule__Ruleset__Group_4__0__Impl"
	// InternalCSS.g:4739:1: rule__Ruleset__Group_4__0__Impl : ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) ) ;
	public final void rule__Ruleset__Group_4__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4743:1: ( ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) ) )
			// InternalCSS.g:4744:1: ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) )
			{
				// InternalCSS.g:4744:1: ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) )
				// InternalCSS.g:4745:1: ( rule__Ruleset__DeclarationsAssignment_4_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_0());
					}
					// InternalCSS.g:4746:1: ( rule__Ruleset__DeclarationsAssignment_4_0 )
					// InternalCSS.g:4746:2: rule__Ruleset__DeclarationsAssignment_4_0
					{
						pushFollow(FOLLOW_2);
						rule__Ruleset__DeclarationsAssignment_4_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4__0__Impl"


	// $ANTLR start "rule__Ruleset__Group_4__1"
	// InternalCSS.g:4756:1: rule__Ruleset__Group_4__1 : rule__Ruleset__Group_4__1__Impl rule__Ruleset__Group_4__2 ;
	public final void rule__Ruleset__Group_4__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4760:1: ( rule__Ruleset__Group_4__1__Impl rule__Ruleset__Group_4__2 )
			// InternalCSS.g:4761:2: rule__Ruleset__Group_4__1__Impl rule__Ruleset__Group_4__2
			{
				pushFollow(FOLLOW_9);
				rule__Ruleset__Group_4__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_4__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4__1"


	// $ANTLR start "rule__Ruleset__Group_4__1__Impl"
	// InternalCSS.g:4768:1: rule__Ruleset__Group_4__1__Impl : ( ( rule__Ruleset__Group_4_1__0 )* ) ;
	public final void rule__Ruleset__Group_4__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4772:1: ( ( ( rule__Ruleset__Group_4_1__0 )* ) )
			// InternalCSS.g:4773:1: ( ( rule__Ruleset__Group_4_1__0 )* )
			{
				// InternalCSS.g:4773:1: ( ( rule__Ruleset__Group_4_1__0 )* )
				// InternalCSS.g:4774:1: ( rule__Ruleset__Group_4_1__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getGroup_4_1());
					}
					// InternalCSS.g:4775:1: ( rule__Ruleset__Group_4_1__0 )*
					loop62: do {
						int alt62 = 2;
						int LA62_0 = input.LA(1);

						if ((LA62_0 == 48)) {
							int LA62_1 = input.LA(2);

							if (((LA62_1 >= RULE_DASH && LA62_1 <= RULE_UNDERSCORE) || (LA62_1 >= RULE_ONE_HEX_LETTER && LA62_1 <= RULE_ONE_NON_HEX_LETTER) || LA62_1 == RULE_WS || (LA62_1 >= 49 && LA62_1 <= 52))) {
								alt62 = 1;
							}


						}


						switch (alt62) {
						case 1:
						// InternalCSS.g:4775:2: rule__Ruleset__Group_4_1__0
						{
							pushFollow(FOLLOW_15);
							rule__Ruleset__Group_4_1__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop62;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getGroup_4_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4__1__Impl"


	// $ANTLR start "rule__Ruleset__Group_4__2"
	// InternalCSS.g:4785:1: rule__Ruleset__Group_4__2 : rule__Ruleset__Group_4__2__Impl ;
	public final void rule__Ruleset__Group_4__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4789:1: ( rule__Ruleset__Group_4__2__Impl )
			// InternalCSS.g:4790:2: rule__Ruleset__Group_4__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_4__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4__2"


	// $ANTLR start "rule__Ruleset__Group_4__2__Impl"
	// InternalCSS.g:4796:1: rule__Ruleset__Group_4__2__Impl : ( ( ';' )? ) ;
	public final void rule__Ruleset__Group_4__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4800:1: ( ( ( ';' )? ) )
			// InternalCSS.g:4801:1: ( ( ';' )? )
			{
				// InternalCSS.g:4801:1: ( ( ';' )? )
				// InternalCSS.g:4802:1: ( ';' )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2());
					}
					// InternalCSS.g:4803:1: ( ';' )?
					int alt63 = 2;
					int LA63_0 = input.LA(1);

					if ((LA63_0 == 48)) {
						alt63 = 1;
					}
					switch (alt63) {
					case 1:
					// InternalCSS.g:4804:2: ';'
					{
						match(input, 48, FOLLOW_2);
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4__2__Impl"


	// $ANTLR start "rule__Ruleset__Group_4_1__0"
	// InternalCSS.g:4821:1: rule__Ruleset__Group_4_1__0 : rule__Ruleset__Group_4_1__0__Impl rule__Ruleset__Group_4_1__1 ;
	public final void rule__Ruleset__Group_4_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4825:1: ( rule__Ruleset__Group_4_1__0__Impl rule__Ruleset__Group_4_1__1 )
			// InternalCSS.g:4826:2: rule__Ruleset__Group_4_1__0__Impl rule__Ruleset__Group_4_1__1
			{
				pushFollow(FOLLOW_16);
				rule__Ruleset__Group_4_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_4_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4_1__0"


	// $ANTLR start "rule__Ruleset__Group_4_1__0__Impl"
	// InternalCSS.g:4833:1: rule__Ruleset__Group_4_1__0__Impl : ( ';' ) ;
	public final void rule__Ruleset__Group_4_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4837:1: ( ( ';' ) )
			// InternalCSS.g:4838:1: ( ';' )
			{
				// InternalCSS.g:4838:1: ( ';' )
				// InternalCSS.g:4839:1: ';'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1_0());
					}
					match(input, 48, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4_1__0__Impl"


	// $ANTLR start "rule__Ruleset__Group_4_1__1"
	// InternalCSS.g:4852:1: rule__Ruleset__Group_4_1__1 : rule__Ruleset__Group_4_1__1__Impl ;
	public final void rule__Ruleset__Group_4_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4856:1: ( rule__Ruleset__Group_4_1__1__Impl )
			// InternalCSS.g:4857:2: rule__Ruleset__Group_4_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Ruleset__Group_4_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4_1__1"


	// $ANTLR start "rule__Ruleset__Group_4_1__1__Impl"
	// InternalCSS.g:4863:1: rule__Ruleset__Group_4_1__1__Impl : ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) ) ;
	public final void rule__Ruleset__Group_4_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4867:1: ( ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) ) )
			// InternalCSS.g:4868:1: ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) )
			{
				// InternalCSS.g:4868:1: ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) )
				// InternalCSS.g:4869:1: ( rule__Ruleset__DeclarationsAssignment_4_1_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_1_1());
					}
					// InternalCSS.g:4870:1: ( rule__Ruleset__DeclarationsAssignment_4_1_1 )
					// InternalCSS.g:4870:2: rule__Ruleset__DeclarationsAssignment_4_1_1
					{
						pushFollow(FOLLOW_2);
						rule__Ruleset__DeclarationsAssignment_4_1_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__Group_4_1__1__Impl"


	// $ANTLR start "rule__Selector__Group__0"
	// InternalCSS.g:4884:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
	public final void rule__Selector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4888:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
			// InternalCSS.g:4889:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
			{
				pushFollow(FOLLOW_33);
				rule__Selector__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Selector__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group__0"


	// $ANTLR start "rule__Selector__Group__0__Impl"
	// InternalCSS.g:4896:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) ;
	public final void rule__Selector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4900:1: ( ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) )
			// InternalCSS.g:4901:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
			{
				// InternalCSS.g:4901:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
				// InternalCSS.g:4902:1: ( rule__Selector__SimpleselectorsAssignment_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0());
					}
					// InternalCSS.g:4903:1: ( rule__Selector__SimpleselectorsAssignment_0 )
					// InternalCSS.g:4903:2: rule__Selector__SimpleselectorsAssignment_0
					{
						pushFollow(FOLLOW_2);
						rule__Selector__SimpleselectorsAssignment_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group__0__Impl"


	// $ANTLR start "rule__Selector__Group__1"
	// InternalCSS.g:4913:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
	public final void rule__Selector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4917:1: ( rule__Selector__Group__1__Impl )
			// InternalCSS.g:4918:2: rule__Selector__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Selector__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group__1"


	// $ANTLR start "rule__Selector__Group__1__Impl"
	// InternalCSS.g:4924:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 )? ) ;
	public final void rule__Selector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4928:1: ( ( ( rule__Selector__Alternatives_1 )? ) )
			// InternalCSS.g:4929:1: ( ( rule__Selector__Alternatives_1 )? )
			{
				// InternalCSS.g:4929:1: ( ( rule__Selector__Alternatives_1 )? )
				// InternalCSS.g:4930:1: ( rule__Selector__Alternatives_1 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getAlternatives_1());
					}
					// InternalCSS.g:4931:1: ( rule__Selector__Alternatives_1 )?
					int alt64 = 2;
					alt64 = dfa64.predict(input);
					switch (alt64) {
					case 1:
					// InternalCSS.g:4931:2: rule__Selector__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Selector__Alternatives_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getAlternatives_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group__1__Impl"


	// $ANTLR start "rule__Selector__Group_1_0__0"
	// InternalCSS.g:4945:1: rule__Selector__Group_1_0__0 : rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 ;
	public final void rule__Selector__Group_1_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4949:1: ( rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 )
			// InternalCSS.g:4950:2: rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1
			{
				pushFollow(FOLLOW_34);
				rule__Selector__Group_1_0__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_0__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_0__0"


	// $ANTLR start "rule__Selector__Group_1_0__0__Impl"
	// InternalCSS.g:4957:1: rule__Selector__Group_1_0__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) ;
	public final void rule__Selector__Group_1_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4961:1: ( ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) )
			// InternalCSS.g:4962:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
			{
				// InternalCSS.g:4962:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
				// InternalCSS.g:4963:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0());
					}
					// InternalCSS.g:4964:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
					// InternalCSS.g:4964:2: rule__Selector__CombinatorAssignment_1_0_0
					{
						pushFollow(FOLLOW_2);
						rule__Selector__CombinatorAssignment_1_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_0__0__Impl"


	// $ANTLR start "rule__Selector__Group_1_0__1"
	// InternalCSS.g:4974:1: rule__Selector__Group_1_0__1 : rule__Selector__Group_1_0__1__Impl rule__Selector__Group_1_0__2 ;
	public final void rule__Selector__Group_1_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4978:1: ( rule__Selector__Group_1_0__1__Impl rule__Selector__Group_1_0__2 )
			// InternalCSS.g:4979:2: rule__Selector__Group_1_0__1__Impl rule__Selector__Group_1_0__2
			{
				pushFollow(FOLLOW_34);
				rule__Selector__Group_1_0__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_0__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_0__1"


	// $ANTLR start "rule__Selector__Group_1_0__1__Impl"
	// InternalCSS.g:4986:1: rule__Selector__Group_1_0__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Selector__Group_1_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:4990:1: ( ( ( RULE_WS )* ) )
			// InternalCSS.g:4991:1: ( ( RULE_WS )* )
			{
				// InternalCSS.g:4991:1: ( ( RULE_WS )* )
				// InternalCSS.g:4992:1: ( RULE_WS )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1());
					}
					// InternalCSS.g:4993:1: ( RULE_WS )*
					loop65: do {
						int alt65 = 2;
						int LA65_0 = input.LA(1);

						if ((LA65_0 == RULE_WS)) {
							alt65 = 1;
						}


						switch (alt65) {
						case 1:
						// InternalCSS.g:4993:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_29);
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop65;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_0__1__Impl"


	// $ANTLR start "rule__Selector__Group_1_0__2"
	// InternalCSS.g:5003:1: rule__Selector__Group_1_0__2 : rule__Selector__Group_1_0__2__Impl ;
	public final void rule__Selector__Group_1_0__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5007:1: ( rule__Selector__Group_1_0__2__Impl )
			// InternalCSS.g:5008:2: rule__Selector__Group_1_0__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_0__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_0__2"


	// $ANTLR start "rule__Selector__Group_1_0__2__Impl"
	// InternalCSS.g:5014:1: rule__Selector__Group_1_0__2__Impl : ( ( rule__Selector__SelectorAssignment_1_0_2 ) ) ;
	public final void rule__Selector__Group_1_0__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5018:1: ( ( ( rule__Selector__SelectorAssignment_1_0_2 ) ) )
			// InternalCSS.g:5019:1: ( ( rule__Selector__SelectorAssignment_1_0_2 ) )
			{
				// InternalCSS.g:5019:1: ( ( rule__Selector__SelectorAssignment_1_0_2 ) )
				// InternalCSS.g:5020:1: ( rule__Selector__SelectorAssignment_1_0_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_2());
					}
					// InternalCSS.g:5021:1: ( rule__Selector__SelectorAssignment_1_0_2 )
					// InternalCSS.g:5021:2: rule__Selector__SelectorAssignment_1_0_2
					{
						pushFollow(FOLLOW_2);
						rule__Selector__SelectorAssignment_1_0_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_0__2__Impl"


	// $ANTLR start "rule__Selector__Group_1_1__0"
	// InternalCSS.g:5037:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
	public final void rule__Selector__Group_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5041:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
			// InternalCSS.g:5042:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
			{
				pushFollow(FOLLOW_35);
				rule__Selector__Group_1_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1__0"


	// $ANTLR start "rule__Selector__Group_1_1__0__Impl"
	// InternalCSS.g:5049:1: rule__Selector__Group_1_1__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
	public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5053:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
			// InternalCSS.g:5054:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
			{
				// InternalCSS.g:5054:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
				// InternalCSS.g:5055:1: ( ( RULE_WS ) ) ( ( RULE_WS )* )
				{
					// InternalCSS.g:5055:1: ( ( RULE_WS ) )
					// InternalCSS.g:5056:1: ( RULE_WS )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
						}
						// InternalCSS.g:5057:1: ( RULE_WS )
						// InternalCSS.g:5057:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_29);
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
						}

					}

					// InternalCSS.g:5060:1: ( ( RULE_WS )* )
					// InternalCSS.g:5061:1: ( RULE_WS )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
						}
						// InternalCSS.g:5062:1: ( RULE_WS )*
						loop66: do {
							int alt66 = 2;
							int LA66_0 = input.LA(1);

							if ((LA66_0 == RULE_WS)) {
								alt66 = 1;
							}


							switch (alt66) {
							case 1:
							// InternalCSS.g:5062:3: RULE_WS
							{
								match(input, RULE_WS, FOLLOW_29);
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop66;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
						}

					}


				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1__0__Impl"


	// $ANTLR start "rule__Selector__Group_1_1__1"
	// InternalCSS.g:5073:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2 ;
	public final void rule__Selector__Group_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5077:1: ( rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2 )
			// InternalCSS.g:5078:2: rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2
			{
				pushFollow(FOLLOW_35);
				rule__Selector__Group_1_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_1__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1__1"


	// $ANTLR start "rule__Selector__Group_1_1__1__Impl"
	// InternalCSS.g:5085:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )? ) ;
	public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5089:1: ( ( ( rule__Selector__Group_1_1_1__0 )? ) )
			// InternalCSS.g:5090:1: ( ( rule__Selector__Group_1_1_1__0 )? )
			{
				// InternalCSS.g:5090:1: ( ( rule__Selector__Group_1_1_1__0 )? )
				// InternalCSS.g:5091:1: ( rule__Selector__Group_1_1_1__0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getGroup_1_1_1());
					}
					// InternalCSS.g:5092:1: ( rule__Selector__Group_1_1_1__0 )?
					int alt67 = 2;
					int LA67_0 = input.LA(1);

					if ((LA67_0 == RULE_PLUS || (LA67_0 >= 37 && LA67_0 <= 38))) {
						alt67 = 1;
					}
					switch (alt67) {
					case 1:
					// InternalCSS.g:5092:2: rule__Selector__Group_1_1_1__0
					{
						pushFollow(FOLLOW_2);
						rule__Selector__Group_1_1_1__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getGroup_1_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1__1__Impl"


	// $ANTLR start "rule__Selector__Group_1_1__2"
	// InternalCSS.g:5102:1: rule__Selector__Group_1_1__2 : rule__Selector__Group_1_1__2__Impl ;
	public final void rule__Selector__Group_1_1__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5106:1: ( rule__Selector__Group_1_1__2__Impl )
			// InternalCSS.g:5107:2: rule__Selector__Group_1_1__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_1__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1__2"


	// $ANTLR start "rule__Selector__Group_1_1__2__Impl"
	// InternalCSS.g:5113:1: rule__Selector__Group_1_1__2__Impl : ( ( rule__Selector__SelectorAssignment_1_1_2 ) ) ;
	public final void rule__Selector__Group_1_1__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5117:1: ( ( ( rule__Selector__SelectorAssignment_1_1_2 ) ) )
			// InternalCSS.g:5118:1: ( ( rule__Selector__SelectorAssignment_1_1_2 ) )
			{
				// InternalCSS.g:5118:1: ( ( rule__Selector__SelectorAssignment_1_1_2 ) )
				// InternalCSS.g:5119:1: ( rule__Selector__SelectorAssignment_1_1_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_2());
					}
					// InternalCSS.g:5120:1: ( rule__Selector__SelectorAssignment_1_1_2 )
					// InternalCSS.g:5120:2: rule__Selector__SelectorAssignment_1_1_2
					{
						pushFollow(FOLLOW_2);
						rule__Selector__SelectorAssignment_1_1_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1__2__Impl"


	// $ANTLR start "rule__Selector__Group_1_1_1__0"
	// InternalCSS.g:5136:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
	public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5140:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
			// InternalCSS.g:5141:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
			{
				pushFollow(FOLLOW_36);
				rule__Selector__Group_1_1_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_1_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1_1__0"


	// $ANTLR start "rule__Selector__Group_1_1_1__0__Impl"
	// InternalCSS.g:5148:1: rule__Selector__Group_1_1_1__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) ) ;
	public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5152:1: ( ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) ) )
			// InternalCSS.g:5153:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) )
			{
				// InternalCSS.g:5153:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) )
				// InternalCSS.g:5154:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0());
					}
					// InternalCSS.g:5155:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )
					// InternalCSS.g:5155:2: rule__Selector__CombinatorAssignment_1_1_1_0
					{
						pushFollow(FOLLOW_2);
						rule__Selector__CombinatorAssignment_1_1_1_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1_1__0__Impl"


	// $ANTLR start "rule__Selector__Group_1_1_1__1"
	// InternalCSS.g:5165:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
	public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5169:1: ( rule__Selector__Group_1_1_1__1__Impl )
			// InternalCSS.g:5170:2: rule__Selector__Group_1_1_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Selector__Group_1_1_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1_1__1"


	// $ANTLR start "rule__Selector__Group_1_1_1__1__Impl"
	// InternalCSS.g:5176:1: rule__Selector__Group_1_1_1__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5180:1: ( ( ( RULE_WS )* ) )
			// InternalCSS.g:5181:1: ( ( RULE_WS )* )
			{
				// InternalCSS.g:5181:1: ( ( RULE_WS )* )
				// InternalCSS.g:5182:1: ( RULE_WS )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1());
					}
					// InternalCSS.g:5183:1: ( RULE_WS )*
					loop68: do {
						int alt68 = 2;
						int LA68_0 = input.LA(1);

						if ((LA68_0 == RULE_WS)) {
							alt68 = 1;
						}


						switch (alt68) {
						case 1:
						// InternalCSS.g:5183:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_29);
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop68;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__Group_1_1_1__1__Impl"


	// $ANTLR start "rule__SimpleSelectorForNegation__Group_0__0"
	// InternalCSS.g:5197:1: rule__SimpleSelectorForNegation__Group_0__0 : rule__SimpleSelectorForNegation__Group_0__0__Impl rule__SimpleSelectorForNegation__Group_0__1 ;
	public final void rule__SimpleSelectorForNegation__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5201:1: ( rule__SimpleSelectorForNegation__Group_0__0__Impl rule__SimpleSelectorForNegation__Group_0__1 )
			// InternalCSS.g:5202:2: rule__SimpleSelectorForNegation__Group_0__0__Impl rule__SimpleSelectorForNegation__Group_0__1
			{
				pushFollow(FOLLOW_37);
				rule__SimpleSelectorForNegation__Group_0__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__SimpleSelectorForNegation__Group_0__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__Group_0__0"


	// $ANTLR start "rule__SimpleSelectorForNegation__Group_0__0__Impl"
	// InternalCSS.g:5209:1: rule__SimpleSelectorForNegation__Group_0__0__Impl : ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) ) ;
	public final void rule__SimpleSelectorForNegation__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5213:1: ( ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) ) )
			// InternalCSS.g:5214:1: ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) )
			{
				// InternalCSS.g:5214:1: ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) )
				// InternalCSS.g:5215:1: ( rule__SimpleSelectorForNegation__Alternatives_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives_0_0());
					}
					// InternalCSS.g:5216:1: ( rule__SimpleSelectorForNegation__Alternatives_0_0 )
					// InternalCSS.g:5216:2: rule__SimpleSelectorForNegation__Alternatives_0_0
					{
						pushFollow(FOLLOW_2);
						rule__SimpleSelectorForNegation__Alternatives_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__Group_0__0__Impl"


	// $ANTLR start "rule__SimpleSelectorForNegation__Group_0__1"
	// InternalCSS.g:5226:1: rule__SimpleSelectorForNegation__Group_0__1 : rule__SimpleSelectorForNegation__Group_0__1__Impl ;
	public final void rule__SimpleSelectorForNegation__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5230:1: ( rule__SimpleSelectorForNegation__Group_0__1__Impl )
			// InternalCSS.g:5231:2: rule__SimpleSelectorForNegation__Group_0__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__SimpleSelectorForNegation__Group_0__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__Group_0__1"


	// $ANTLR start "rule__SimpleSelectorForNegation__Group_0__1__Impl"
	// InternalCSS.g:5237:1: rule__SimpleSelectorForNegation__Group_0__1__Impl : ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* ) ;
	public final void rule__SimpleSelectorForNegation__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5241:1: ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* ) )
			// InternalCSS.g:5242:1: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* )
			{
				// InternalCSS.g:5242:1: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* )
				// InternalCSS.g:5243:1: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_0_1());
					}
					// InternalCSS.g:5244:1: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )*
					loop69: do {
						int alt69 = 2;
						int LA69_0 = input.LA(1);

						if (((LA69_0 >= RULE_COLON && LA69_0 <= RULE_HASHMARK) || LA69_0 == 39 || LA69_0 == 42)) {
							alt69 = 1;
						}


						switch (alt69) {
						case 1:
						// InternalCSS.g:5244:2: rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1
						{
							pushFollow(FOLLOW_3);
							rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop69;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_0_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__Group_0__1__Impl"


	// $ANTLR start "rule__Simple_selector__Group_0__0"
	// InternalCSS.g:5258:1: rule__Simple_selector__Group_0__0 : rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 ;
	public final void rule__Simple_selector__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5262:1: ( rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 )
			// InternalCSS.g:5263:2: rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1
			{
				pushFollow(FOLLOW_37);
				rule__Simple_selector__Group_0__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Simple_selector__Group_0__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__Group_0__0"


	// $ANTLR start "rule__Simple_selector__Group_0__0__Impl"
	// InternalCSS.g:5270:1: rule__Simple_selector__Group_0__0__Impl : ( ( rule__Simple_selector__Alternatives_0_0 ) ) ;
	public final void rule__Simple_selector__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5274:1: ( ( ( rule__Simple_selector__Alternatives_0_0 ) ) )
			// InternalCSS.g:5275:1: ( ( rule__Simple_selector__Alternatives_0_0 ) )
			{
				// InternalCSS.g:5275:1: ( ( rule__Simple_selector__Alternatives_0_0 ) )
				// InternalCSS.g:5276:1: ( rule__Simple_selector__Alternatives_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getAlternatives_0_0());
					}
					// InternalCSS.g:5277:1: ( rule__Simple_selector__Alternatives_0_0 )
					// InternalCSS.g:5277:2: rule__Simple_selector__Alternatives_0_0
					{
						pushFollow(FOLLOW_2);
						rule__Simple_selector__Alternatives_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getAlternatives_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__Group_0__0__Impl"


	// $ANTLR start "rule__Simple_selector__Group_0__1"
	// InternalCSS.g:5287:1: rule__Simple_selector__Group_0__1 : rule__Simple_selector__Group_0__1__Impl ;
	public final void rule__Simple_selector__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5291:1: ( rule__Simple_selector__Group_0__1__Impl )
			// InternalCSS.g:5292:2: rule__Simple_selector__Group_0__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Simple_selector__Group_0__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__Group_0__1"


	// $ANTLR start "rule__Simple_selector__Group_0__1__Impl"
	// InternalCSS.g:5298:1: rule__Simple_selector__Group_0__1__Impl : ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) ;
	public final void rule__Simple_selector__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5302:1: ( ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) )
			// InternalCSS.g:5303:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
			{
				// InternalCSS.g:5303:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
				// InternalCSS.g:5304:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1());
					}
					// InternalCSS.g:5305:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
					loop70: do {
						int alt70 = 2;
						int LA70_0 = input.LA(1);

						if (((LA70_0 >= RULE_COLON && LA70_0 <= RULE_HASHMARK) || LA70_0 == 39 || LA70_0 == 42)) {
							alt70 = 1;
						}


						switch (alt70) {
						case 1:
						// InternalCSS.g:5305:2: rule__Simple_selector__SubSelectorsAssignment_0_1
						{
							pushFollow(FOLLOW_3);
							rule__Simple_selector__SubSelectorsAssignment_0_1();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop70;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__Group_0__1__Impl"


	// $ANTLR start "rule__AttributeSelector__Group__0"
	// InternalCSS.g:5319:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
	public final void rule__AttributeSelector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5323:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
			// InternalCSS.g:5324:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
			{
				pushFollow(FOLLOW_38);
				rule__AttributeSelector__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__AttributeSelector__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__0"


	// $ANTLR start "rule__AttributeSelector__Group__0__Impl"
	// InternalCSS.g:5331:1: rule__AttributeSelector__Group__0__Impl : ( () ) ;
	public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5335:1: ( ( () ) )
			// InternalCSS.g:5336:1: ( () )
			{
				// InternalCSS.g:5336:1: ( () )
				// InternalCSS.g:5337:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0());
					}
					// InternalCSS.g:5338:1: ()
					// InternalCSS.g:5340:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__0__Impl"


	// $ANTLR start "rule__AttributeSelector__Group__1"
	// InternalCSS.g:5350:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2 ;
	public final void rule__AttributeSelector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5354:1: ( rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2 )
			// InternalCSS.g:5355:2: rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2
			{
				pushFollow(FOLLOW_11);
				rule__AttributeSelector__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__AttributeSelector__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__1"


	// $ANTLR start "rule__AttributeSelector__Group__1__Impl"
	// InternalCSS.g:5362:1: rule__AttributeSelector__Group__1__Impl : ( '[' ) ;
	public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5366:1: ( ( '[' ) )
			// InternalCSS.g:5367:1: ( '[' )
			{
				// InternalCSS.g:5367:1: ( '[' )
				// InternalCSS.g:5368:1: '['
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1());
					}
					match(input, 42, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__1__Impl"


	// $ANTLR start "rule__AttributeSelector__Group__2"
	// InternalCSS.g:5381:1: rule__AttributeSelector__Group__2 : rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3 ;
	public final void rule__AttributeSelector__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5385:1: ( rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3 )
			// InternalCSS.g:5386:2: rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3
			{
				pushFollow(FOLLOW_39);
				rule__AttributeSelector__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__AttributeSelector__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__2"


	// $ANTLR start "rule__AttributeSelector__Group__2__Impl"
	// InternalCSS.g:5393:1: rule__AttributeSelector__Group__2__Impl : ( ( rule__AttributeSelector__NameAssignment_2 ) ) ;
	public final void rule__AttributeSelector__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5397:1: ( ( ( rule__AttributeSelector__NameAssignment_2 ) ) )
			// InternalCSS.g:5398:1: ( ( rule__AttributeSelector__NameAssignment_2 ) )
			{
				// InternalCSS.g:5398:1: ( ( rule__AttributeSelector__NameAssignment_2 ) )
				// InternalCSS.g:5399:1: ( rule__AttributeSelector__NameAssignment_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getNameAssignment_2());
					}
					// InternalCSS.g:5400:1: ( rule__AttributeSelector__NameAssignment_2 )
					// InternalCSS.g:5400:2: rule__AttributeSelector__NameAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__AttributeSelector__NameAssignment_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getNameAssignment_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__2__Impl"


	// $ANTLR start "rule__AttributeSelector__Group__3"
	// InternalCSS.g:5410:1: rule__AttributeSelector__Group__3 : rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4 ;
	public final void rule__AttributeSelector__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5414:1: ( rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4 )
			// InternalCSS.g:5415:2: rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4
			{
				pushFollow(FOLLOW_39);
				rule__AttributeSelector__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__AttributeSelector__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__3"


	// $ANTLR start "rule__AttributeSelector__Group__3__Impl"
	// InternalCSS.g:5422:1: rule__AttributeSelector__Group__3__Impl : ( ( rule__AttributeSelector__Group_3__0 )? ) ;
	public final void rule__AttributeSelector__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5426:1: ( ( ( rule__AttributeSelector__Group_3__0 )? ) )
			// InternalCSS.g:5427:1: ( ( rule__AttributeSelector__Group_3__0 )? )
			{
				// InternalCSS.g:5427:1: ( ( rule__AttributeSelector__Group_3__0 )? )
				// InternalCSS.g:5428:1: ( rule__AttributeSelector__Group_3__0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getGroup_3());
					}
					// InternalCSS.g:5429:1: ( rule__AttributeSelector__Group_3__0 )?
					int alt71 = 2;
					int LA71_0 = input.LA(1);

					if (((LA71_0 >= RULE_INCLUDES && LA71_0 <= RULE_DASHMATCH) || (LA71_0 >= 32 && LA71_0 <= 35))) {
						alt71 = 1;
					}
					switch (alt71) {
					case 1:
					// InternalCSS.g:5429:2: rule__AttributeSelector__Group_3__0
					{
						pushFollow(FOLLOW_2);
						rule__AttributeSelector__Group_3__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getGroup_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__3__Impl"


	// $ANTLR start "rule__AttributeSelector__Group__4"
	// InternalCSS.g:5439:1: rule__AttributeSelector__Group__4 : rule__AttributeSelector__Group__4__Impl ;
	public final void rule__AttributeSelector__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5443:1: ( rule__AttributeSelector__Group__4__Impl )
			// InternalCSS.g:5444:2: rule__AttributeSelector__Group__4__Impl
			{
				pushFollow(FOLLOW_2);
				rule__AttributeSelector__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__4"


	// $ANTLR start "rule__AttributeSelector__Group__4__Impl"
	// InternalCSS.g:5450:1: rule__AttributeSelector__Group__4__Impl : ( ']' ) ;
	public final void rule__AttributeSelector__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5454:1: ( ( ']' ) )
			// InternalCSS.g:5455:1: ( ']' )
			{
				// InternalCSS.g:5455:1: ( ']' )
				// InternalCSS.g:5456:1: ']'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4());
					}
					match(input, 43, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group__4__Impl"


	// $ANTLR start "rule__AttributeSelector__Group_3__0"
	// InternalCSS.g:5479:1: rule__AttributeSelector__Group_3__0 : rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1 ;
	public final void rule__AttributeSelector__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5483:1: ( rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1 )
			// InternalCSS.g:5484:2: rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1
			{
				pushFollow(FOLLOW_40);
				rule__AttributeSelector__Group_3__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__AttributeSelector__Group_3__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group_3__0"


	// $ANTLR start "rule__AttributeSelector__Group_3__0__Impl"
	// InternalCSS.g:5491:1: rule__AttributeSelector__Group_3__0__Impl : ( ( rule__AttributeSelector__OpAssignment_3_0 ) ) ;
	public final void rule__AttributeSelector__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5495:1: ( ( ( rule__AttributeSelector__OpAssignment_3_0 ) ) )
			// InternalCSS.g:5496:1: ( ( rule__AttributeSelector__OpAssignment_3_0 ) )
			{
				// InternalCSS.g:5496:1: ( ( rule__AttributeSelector__OpAssignment_3_0 ) )
				// InternalCSS.g:5497:1: ( rule__AttributeSelector__OpAssignment_3_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpAssignment_3_0());
					}
					// InternalCSS.g:5498:1: ( rule__AttributeSelector__OpAssignment_3_0 )
					// InternalCSS.g:5498:2: rule__AttributeSelector__OpAssignment_3_0
					{
						pushFollow(FOLLOW_2);
						rule__AttributeSelector__OpAssignment_3_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpAssignment_3_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group_3__0__Impl"


	// $ANTLR start "rule__AttributeSelector__Group_3__1"
	// InternalCSS.g:5508:1: rule__AttributeSelector__Group_3__1 : rule__AttributeSelector__Group_3__1__Impl ;
	public final void rule__AttributeSelector__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5512:1: ( rule__AttributeSelector__Group_3__1__Impl )
			// InternalCSS.g:5513:2: rule__AttributeSelector__Group_3__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__AttributeSelector__Group_3__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group_3__1"


	// $ANTLR start "rule__AttributeSelector__Group_3__1__Impl"
	// InternalCSS.g:5519:1: rule__AttributeSelector__Group_3__1__Impl : ( ( rule__AttributeSelector__ValueAssignment_3_1 ) ) ;
	public final void rule__AttributeSelector__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5523:1: ( ( ( rule__AttributeSelector__ValueAssignment_3_1 ) ) )
			// InternalCSS.g:5524:1: ( ( rule__AttributeSelector__ValueAssignment_3_1 ) )
			{
				// InternalCSS.g:5524:1: ( ( rule__AttributeSelector__ValueAssignment_3_1 ) )
				// InternalCSS.g:5525:1: ( rule__AttributeSelector__ValueAssignment_3_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getValueAssignment_3_1());
					}
					// InternalCSS.g:5526:1: ( rule__AttributeSelector__ValueAssignment_3_1 )
					// InternalCSS.g:5526:2: rule__AttributeSelector__ValueAssignment_3_1
					{
						pushFollow(FOLLOW_2);
						rule__AttributeSelector__ValueAssignment_3_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getValueAssignment_3_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__Group_3__1__Impl"


	// $ANTLR start "rule__ClassSelector__Group__0"
	// InternalCSS.g:5540:1: rule__ClassSelector__Group__0 : rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1 ;
	public final void rule__ClassSelector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5544:1: ( rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1 )
			// InternalCSS.g:5545:2: rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1
			{
				pushFollow(FOLLOW_41);
				rule__ClassSelector__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ClassSelector__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassSelector__Group__0"


	// $ANTLR start "rule__ClassSelector__Group__0__Impl"
	// InternalCSS.g:5552:1: rule__ClassSelector__Group__0__Impl : ( () ) ;
	public final void rule__ClassSelector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5556:1: ( ( () ) )
			// InternalCSS.g:5557:1: ( () )
			{
				// InternalCSS.g:5557:1: ( () )
				// InternalCSS.g:5558:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getClassSelectorAccess().getClassSelectorAction_0());
					}
					// InternalCSS.g:5559:1: ()
					// InternalCSS.g:5561:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getClassSelectorAccess().getClassSelectorAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassSelector__Group__0__Impl"


	// $ANTLR start "rule__ClassSelector__Group__1"
	// InternalCSS.g:5571:1: rule__ClassSelector__Group__1 : rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2 ;
	public final void rule__ClassSelector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5575:1: ( rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2 )
			// InternalCSS.g:5576:2: rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2
			{
				pushFollow(FOLLOW_11);
				rule__ClassSelector__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ClassSelector__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassSelector__Group__1"


	// $ANTLR start "rule__ClassSelector__Group__1__Impl"
	// InternalCSS.g:5583:1: rule__ClassSelector__Group__1__Impl : ( '.' ) ;
	public final void rule__ClassSelector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5587:1: ( ( '.' ) )
			// InternalCSS.g:5588:1: ( '.' )
			{
				// InternalCSS.g:5588:1: ( '.' )
				// InternalCSS.g:5589:1: '.'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getClassSelectorAccess().getFullStopKeyword_1());
					}
					match(input, 39, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getClassSelectorAccess().getFullStopKeyword_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassSelector__Group__1__Impl"


	// $ANTLR start "rule__ClassSelector__Group__2"
	// InternalCSS.g:5602:1: rule__ClassSelector__Group__2 : rule__ClassSelector__Group__2__Impl ;
	public final void rule__ClassSelector__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5606:1: ( rule__ClassSelector__Group__2__Impl )
			// InternalCSS.g:5607:2: rule__ClassSelector__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ClassSelector__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassSelector__Group__2"


	// $ANTLR start "rule__ClassSelector__Group__2__Impl"
	// InternalCSS.g:5613:1: rule__ClassSelector__Group__2__Impl : ( ( rule__ClassSelector__NameAssignment_2 ) ) ;
	public final void rule__ClassSelector__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5617:1: ( ( ( rule__ClassSelector__NameAssignment_2 ) ) )
			// InternalCSS.g:5618:1: ( ( rule__ClassSelector__NameAssignment_2 ) )
			{
				// InternalCSS.g:5618:1: ( ( rule__ClassSelector__NameAssignment_2 ) )
				// InternalCSS.g:5619:1: ( rule__ClassSelector__NameAssignment_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getClassSelectorAccess().getNameAssignment_2());
					}
					// InternalCSS.g:5620:1: ( rule__ClassSelector__NameAssignment_2 )
					// InternalCSS.g:5620:2: rule__ClassSelector__NameAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__ClassSelector__NameAssignment_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getClassSelectorAccess().getNameAssignment_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassSelector__Group__2__Impl"


	// $ANTLR start "rule__ElementSelector__Group__0"
	// InternalCSS.g:5636:1: rule__ElementSelector__Group__0 : rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 ;
	public final void rule__ElementSelector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5640:1: ( rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 )
			// InternalCSS.g:5641:2: rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1
			{
				pushFollow(FOLLOW_11);
				rule__ElementSelector__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ElementSelector__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ElementSelector__Group__0"


	// $ANTLR start "rule__ElementSelector__Group__0__Impl"
	// InternalCSS.g:5648:1: rule__ElementSelector__Group__0__Impl : ( () ) ;
	public final void rule__ElementSelector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5652:1: ( ( () ) )
			// InternalCSS.g:5653:1: ( () )
			{
				// InternalCSS.g:5653:1: ( () )
				// InternalCSS.g:5654:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0());
					}
					// InternalCSS.g:5655:1: ()
					// InternalCSS.g:5657:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ElementSelector__Group__0__Impl"


	// $ANTLR start "rule__ElementSelector__Group__1"
	// InternalCSS.g:5667:1: rule__ElementSelector__Group__1 : rule__ElementSelector__Group__1__Impl ;
	public final void rule__ElementSelector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5671:1: ( rule__ElementSelector__Group__1__Impl )
			// InternalCSS.g:5672:2: rule__ElementSelector__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ElementSelector__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ElementSelector__Group__1"


	// $ANTLR start "rule__ElementSelector__Group__1__Impl"
	// InternalCSS.g:5678:1: rule__ElementSelector__Group__1__Impl : ( ( rule__ElementSelector__NameAssignment_1 ) ) ;
	public final void rule__ElementSelector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5682:1: ( ( ( rule__ElementSelector__NameAssignment_1 ) ) )
			// InternalCSS.g:5683:1: ( ( rule__ElementSelector__NameAssignment_1 ) )
			{
				// InternalCSS.g:5683:1: ( ( rule__ElementSelector__NameAssignment_1 ) )
				// InternalCSS.g:5684:1: ( rule__ElementSelector__NameAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getElementSelectorAccess().getNameAssignment_1());
					}
					// InternalCSS.g:5685:1: ( rule__ElementSelector__NameAssignment_1 )
					// InternalCSS.g:5685:2: rule__ElementSelector__NameAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__ElementSelector__NameAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getElementSelectorAccess().getNameAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ElementSelector__Group__1__Impl"


	// $ANTLR start "rule__UniversalSelector__Group__0"
	// InternalCSS.g:5699:1: rule__UniversalSelector__Group__0 : rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1 ;
	public final void rule__UniversalSelector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5703:1: ( rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1 )
			// InternalCSS.g:5704:2: rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1
			{
				pushFollow(FOLLOW_42);
				rule__UniversalSelector__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__UniversalSelector__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UniversalSelector__Group__0"


	// $ANTLR start "rule__UniversalSelector__Group__0__Impl"
	// InternalCSS.g:5711:1: rule__UniversalSelector__Group__0__Impl : ( () ) ;
	public final void rule__UniversalSelector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5715:1: ( ( () ) )
			// InternalCSS.g:5716:1: ( () )
			{
				// InternalCSS.g:5716:1: ( () )
				// InternalCSS.g:5717:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0());
					}
					// InternalCSS.g:5718:1: ()
					// InternalCSS.g:5720:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UniversalSelector__Group__0__Impl"


	// $ANTLR start "rule__UniversalSelector__Group__1"
	// InternalCSS.g:5730:1: rule__UniversalSelector__Group__1 : rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2 ;
	public final void rule__UniversalSelector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5734:1: ( rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2 )
			// InternalCSS.g:5735:2: rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2
			{
				pushFollow(FOLLOW_42);
				rule__UniversalSelector__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__UniversalSelector__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UniversalSelector__Group__1"


	// $ANTLR start "rule__UniversalSelector__Group__1__Impl"
	// InternalCSS.g:5742:1: rule__UniversalSelector__Group__1__Impl : ( ( rule__UniversalSelector__NamespaceAssignment_1 )? ) ;
	public final void rule__UniversalSelector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5746:1: ( ( ( rule__UniversalSelector__NamespaceAssignment_1 )? ) )
			// InternalCSS.g:5747:1: ( ( rule__UniversalSelector__NamespaceAssignment_1 )? )
			{
				// InternalCSS.g:5747:1: ( ( rule__UniversalSelector__NamespaceAssignment_1 )? )
				// InternalCSS.g:5748:1: ( rule__UniversalSelector__NamespaceAssignment_1 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUniversalSelectorAccess().getNamespaceAssignment_1());
					}
					// InternalCSS.g:5749:1: ( rule__UniversalSelector__NamespaceAssignment_1 )?
					int alt72 = 2;
					int LA72_0 = input.LA(1);

					if (((LA72_0 >= RULE_DASH && LA72_0 <= RULE_UNDERSCORE) || (LA72_0 >= RULE_ONE_HEX_LETTER && LA72_0 <= RULE_ONE_NON_HEX_LETTER) || (LA72_0 >= 49 && LA72_0 <= 52) || LA72_0 == 60)) {
						alt72 = 1;
					} else if ((LA72_0 == 36)) {
						int LA72_2 = input.LA(2);

						if ((LA72_2 == 60)) {
							alt72 = 1;
						}
					}
					switch (alt72) {
					case 1:
					// InternalCSS.g:5749:2: rule__UniversalSelector__NamespaceAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__UniversalSelector__NamespaceAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getUniversalSelectorAccess().getNamespaceAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UniversalSelector__Group__1__Impl"


	// $ANTLR start "rule__UniversalSelector__Group__2"
	// InternalCSS.g:5759:1: rule__UniversalSelector__Group__2 : rule__UniversalSelector__Group__2__Impl ;
	public final void rule__UniversalSelector__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5763:1: ( rule__UniversalSelector__Group__2__Impl )
			// InternalCSS.g:5764:2: rule__UniversalSelector__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__UniversalSelector__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UniversalSelector__Group__2"


	// $ANTLR start "rule__UniversalSelector__Group__2__Impl"
	// InternalCSS.g:5770:1: rule__UniversalSelector__Group__2__Impl : ( '*' ) ;
	public final void rule__UniversalSelector__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5774:1: ( ( '*' ) )
			// InternalCSS.g:5775:1: ( '*' )
			{
				// InternalCSS.g:5775:1: ( '*' )
				// InternalCSS.g:5776:1: '*'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2());
					}
					match(input, 36, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UniversalSelector__Group__2__Impl"


	// $ANTLR start "rule__IdSelector__Group__0"
	// InternalCSS.g:5795:1: rule__IdSelector__Group__0 : rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1 ;
	public final void rule__IdSelector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5799:1: ( rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1 )
			// InternalCSS.g:5800:2: rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1
			{
				pushFollow(FOLLOW_43);
				rule__IdSelector__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__IdSelector__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdSelector__Group__0"


	// $ANTLR start "rule__IdSelector__Group__0__Impl"
	// InternalCSS.g:5807:1: rule__IdSelector__Group__0__Impl : ( () ) ;
	public final void rule__IdSelector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5811:1: ( ( () ) )
			// InternalCSS.g:5812:1: ( () )
			{
				// InternalCSS.g:5812:1: ( () )
				// InternalCSS.g:5813:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdSelectorAccess().getIdSelectorAction_0());
					}
					// InternalCSS.g:5814:1: ()
					// InternalCSS.g:5816:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdSelectorAccess().getIdSelectorAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdSelector__Group__0__Impl"


	// $ANTLR start "rule__IdSelector__Group__1"
	// InternalCSS.g:5826:1: rule__IdSelector__Group__1 : rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2 ;
	public final void rule__IdSelector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5830:1: ( rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2 )
			// InternalCSS.g:5831:2: rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2
			{
				pushFollow(FOLLOW_11);
				rule__IdSelector__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__IdSelector__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdSelector__Group__1"


	// $ANTLR start "rule__IdSelector__Group__1__Impl"
	// InternalCSS.g:5838:1: rule__IdSelector__Group__1__Impl : ( RULE_HASHMARK ) ;
	public final void rule__IdSelector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5842:1: ( ( RULE_HASHMARK ) )
			// InternalCSS.g:5843:1: ( RULE_HASHMARK )
			{
				// InternalCSS.g:5843:1: ( RULE_HASHMARK )
				// InternalCSS.g:5844:1: RULE_HASHMARK
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1());
					}
					match(input, RULE_HASHMARK, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdSelector__Group__1__Impl"


	// $ANTLR start "rule__IdSelector__Group__2"
	// InternalCSS.g:5855:1: rule__IdSelector__Group__2 : rule__IdSelector__Group__2__Impl ;
	public final void rule__IdSelector__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5859:1: ( rule__IdSelector__Group__2__Impl )
			// InternalCSS.g:5860:2: rule__IdSelector__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__IdSelector__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdSelector__Group__2"


	// $ANTLR start "rule__IdSelector__Group__2__Impl"
	// InternalCSS.g:5866:1: rule__IdSelector__Group__2__Impl : ( ( rule__IdSelector__NameAssignment_2 ) ) ;
	public final void rule__IdSelector__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5870:1: ( ( ( rule__IdSelector__NameAssignment_2 ) ) )
			// InternalCSS.g:5871:1: ( ( rule__IdSelector__NameAssignment_2 ) )
			{
				// InternalCSS.g:5871:1: ( ( rule__IdSelector__NameAssignment_2 ) )
				// InternalCSS.g:5872:1: ( rule__IdSelector__NameAssignment_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdSelectorAccess().getNameAssignment_2());
					}
					// InternalCSS.g:5873:1: ( rule__IdSelector__NameAssignment_2 )
					// InternalCSS.g:5873:2: rule__IdSelector__NameAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__IdSelector__NameAssignment_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdSelectorAccess().getNameAssignment_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdSelector__Group__2__Impl"


	// $ANTLR start "rule__Css_namespace_prefix__Group__0"
	// InternalCSS.g:5889:1: rule__Css_namespace_prefix__Group__0 : rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1 ;
	public final void rule__Css_namespace_prefix__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5893:1: ( rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1 )
			// InternalCSS.g:5894:2: rule__Css_namespace_prefix__Group__0__Impl rule__Css_namespace_prefix__Group__1
			{
				pushFollow(FOLLOW_42);
				rule__Css_namespace_prefix__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Css_namespace_prefix__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_namespace_prefix__Group__0"


	// $ANTLR start "rule__Css_namespace_prefix__Group__0__Impl"
	// InternalCSS.g:5901:1: rule__Css_namespace_prefix__Group__0__Impl : ( ( rule__Css_namespace_prefix__Alternatives_0 )? ) ;
	public final void rule__Css_namespace_prefix__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5905:1: ( ( ( rule__Css_namespace_prefix__Alternatives_0 )? ) )
			// InternalCSS.g:5906:1: ( ( rule__Css_namespace_prefix__Alternatives_0 )? )
			{
				// InternalCSS.g:5906:1: ( ( rule__Css_namespace_prefix__Alternatives_0 )? )
				// InternalCSS.g:5907:1: ( rule__Css_namespace_prefix__Alternatives_0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_namespace_prefixAccess().getAlternatives_0());
					}
					// InternalCSS.g:5908:1: ( rule__Css_namespace_prefix__Alternatives_0 )?
					int alt73 = 2;
					int LA73_0 = input.LA(1);

					if (((LA73_0 >= RULE_DASH && LA73_0 <= RULE_UNDERSCORE) || (LA73_0 >= RULE_ONE_HEX_LETTER && LA73_0 <= RULE_ONE_NON_HEX_LETTER) || LA73_0 == 36 || (LA73_0 >= 49 && LA73_0 <= 52))) {
						alt73 = 1;
					}
					switch (alt73) {
					case 1:
					// InternalCSS.g:5908:2: rule__Css_namespace_prefix__Alternatives_0
					{
						pushFollow(FOLLOW_2);
						rule__Css_namespace_prefix__Alternatives_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_namespace_prefixAccess().getAlternatives_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_namespace_prefix__Group__0__Impl"


	// $ANTLR start "rule__Css_namespace_prefix__Group__1"
	// InternalCSS.g:5918:1: rule__Css_namespace_prefix__Group__1 : rule__Css_namespace_prefix__Group__1__Impl ;
	public final void rule__Css_namespace_prefix__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5922:1: ( rule__Css_namespace_prefix__Group__1__Impl )
			// InternalCSS.g:5923:2: rule__Css_namespace_prefix__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Css_namespace_prefix__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_namespace_prefix__Group__1"


	// $ANTLR start "rule__Css_namespace_prefix__Group__1__Impl"
	// InternalCSS.g:5929:1: rule__Css_namespace_prefix__Group__1__Impl : ( '|' ) ;
	public final void rule__Css_namespace_prefix__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5933:1: ( ( '|' ) )
			// InternalCSS.g:5934:1: ( '|' )
			{
				// InternalCSS.g:5934:1: ( '|' )
				// InternalCSS.g:5935:1: '|'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1());
					}
					match(input, 60, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_namespace_prefix__Group__1__Impl"


	// $ANTLR start "rule__Css_declaration__Group__0"
	// InternalCSS.g:5952:1: rule__Css_declaration__Group__0 : rule__Css_declaration__Group__0__Impl rule__Css_declaration__Group__1 ;
	public final void rule__Css_declaration__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5956:1: ( rule__Css_declaration__Group__0__Impl rule__Css_declaration__Group__1 )
			// InternalCSS.g:5957:2: rule__Css_declaration__Group__0__Impl rule__Css_declaration__Group__1
			{
				pushFollow(FOLLOW_16);
				rule__Css_declaration__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Css_declaration__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__0"


	// $ANTLR start "rule__Css_declaration__Group__0__Impl"
	// InternalCSS.g:5964:1: rule__Css_declaration__Group__0__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Css_declaration__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5968:1: ( ( ( RULE_WS )* ) )
			// InternalCSS.g:5969:1: ( ( RULE_WS )* )
			{
				// InternalCSS.g:5969:1: ( ( RULE_WS )* )
				// InternalCSS.g:5970:1: ( RULE_WS )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0());
					}
					// InternalCSS.g:5971:1: ( RULE_WS )*
					loop74: do {
						int alt74 = 2;
						int LA74_0 = input.LA(1);

						if ((LA74_0 == RULE_WS)) {
							alt74 = 1;
						}


						switch (alt74) {
						case 1:
						// InternalCSS.g:5971:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_29);
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop74;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__0__Impl"


	// $ANTLR start "rule__Css_declaration__Group__1"
	// InternalCSS.g:5981:1: rule__Css_declaration__Group__1 : rule__Css_declaration__Group__1__Impl rule__Css_declaration__Group__2 ;
	public final void rule__Css_declaration__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5985:1: ( rule__Css_declaration__Group__1__Impl rule__Css_declaration__Group__2 )
			// InternalCSS.g:5986:2: rule__Css_declaration__Group__1__Impl rule__Css_declaration__Group__2
			{
				pushFollow(FOLLOW_44);
				rule__Css_declaration__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Css_declaration__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__1"


	// $ANTLR start "rule__Css_declaration__Group__1__Impl"
	// InternalCSS.g:5993:1: rule__Css_declaration__Group__1__Impl : ( ( rule__Css_declaration__PropertyAssignment_1 ) ) ;
	public final void rule__Css_declaration__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:5997:1: ( ( ( rule__Css_declaration__PropertyAssignment_1 ) ) )
			// InternalCSS.g:5998:1: ( ( rule__Css_declaration__PropertyAssignment_1 ) )
			{
				// InternalCSS.g:5998:1: ( ( rule__Css_declaration__PropertyAssignment_1 ) )
				// InternalCSS.g:5999:1: ( rule__Css_declaration__PropertyAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getPropertyAssignment_1());
					}
					// InternalCSS.g:6000:1: ( rule__Css_declaration__PropertyAssignment_1 )
					// InternalCSS.g:6000:2: rule__Css_declaration__PropertyAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Css_declaration__PropertyAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getPropertyAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__1__Impl"


	// $ANTLR start "rule__Css_declaration__Group__2"
	// InternalCSS.g:6010:1: rule__Css_declaration__Group__2 : rule__Css_declaration__Group__2__Impl rule__Css_declaration__Group__3 ;
	public final void rule__Css_declaration__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6014:1: ( rule__Css_declaration__Group__2__Impl rule__Css_declaration__Group__3 )
			// InternalCSS.g:6015:2: rule__Css_declaration__Group__2__Impl rule__Css_declaration__Group__3
			{
				pushFollow(FOLLOW_44);
				rule__Css_declaration__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Css_declaration__Group__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__2"


	// $ANTLR start "rule__Css_declaration__Group__2__Impl"
	// InternalCSS.g:6022:1: rule__Css_declaration__Group__2__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Css_declaration__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6026:1: ( ( ( RULE_WS )* ) )
			// InternalCSS.g:6027:1: ( ( RULE_WS )* )
			{
				// InternalCSS.g:6027:1: ( ( RULE_WS )* )
				// InternalCSS.g:6028:1: ( RULE_WS )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2());
					}
					// InternalCSS.g:6029:1: ( RULE_WS )*
					loop75: do {
						int alt75 = 2;
						int LA75_0 = input.LA(1);

						if ((LA75_0 == RULE_WS)) {
							alt75 = 1;
						}


						switch (alt75) {
						case 1:
						// InternalCSS.g:6029:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_29);
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop75;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__2__Impl"


	// $ANTLR start "rule__Css_declaration__Group__3"
	// InternalCSS.g:6039:1: rule__Css_declaration__Group__3 : rule__Css_declaration__Group__3__Impl rule__Css_declaration__Group__4 ;
	public final void rule__Css_declaration__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6043:1: ( rule__Css_declaration__Group__3__Impl rule__Css_declaration__Group__4 )
			// InternalCSS.g:6044:2: rule__Css_declaration__Group__3__Impl rule__Css_declaration__Group__4
			{
				pushFollow(FOLLOW_45);
				rule__Css_declaration__Group__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Css_declaration__Group__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__3"


	// $ANTLR start "rule__Css_declaration__Group__3__Impl"
	// InternalCSS.g:6051:1: rule__Css_declaration__Group__3__Impl : ( RULE_COLON ) ;
	public final void rule__Css_declaration__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6055:1: ( ( RULE_COLON ) )
			// InternalCSS.g:6056:1: ( RULE_COLON )
			{
				// InternalCSS.g:6056:1: ( RULE_COLON )
				// InternalCSS.g:6057:1: RULE_COLON
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getCOLONTerminalRuleCall_3());
					}
					match(input, RULE_COLON, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getCOLONTerminalRuleCall_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__3__Impl"


	// $ANTLR start "rule__Css_declaration__Group__4"
	// InternalCSS.g:6068:1: rule__Css_declaration__Group__4 : rule__Css_declaration__Group__4__Impl rule__Css_declaration__Group__5 ;
	public final void rule__Css_declaration__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6072:1: ( rule__Css_declaration__Group__4__Impl rule__Css_declaration__Group__5 )
			// InternalCSS.g:6073:2: rule__Css_declaration__Group__4__Impl rule__Css_declaration__Group__5
			{
				pushFollow(FOLLOW_46);
				rule__Css_declaration__Group__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Css_declaration__Group__5();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__4"


	// $ANTLR start "rule__Css_declaration__Group__4__Impl"
	// InternalCSS.g:6080:1: rule__Css_declaration__Group__4__Impl : ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) ) ;
	public final void rule__Css_declaration__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6084:1: ( ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) ) )
			// InternalCSS.g:6085:1: ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) )
			{
				// InternalCSS.g:6085:1: ( ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* ) )
				// InternalCSS.g:6086:1: ( ( rule__Css_declaration__ValueTokensAssignment_4 ) ) ( ( rule__Css_declaration__ValueTokensAssignment_4 )* )
				{
					// InternalCSS.g:6086:1: ( ( rule__Css_declaration__ValueTokensAssignment_4 ) )
					// InternalCSS.g:6087:1: ( rule__Css_declaration__ValueTokensAssignment_4 )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4());
						}
						// InternalCSS.g:6088:1: ( rule__Css_declaration__ValueTokensAssignment_4 )
						// InternalCSS.g:6088:2: rule__Css_declaration__ValueTokensAssignment_4
						{
							pushFollow(FOLLOW_47);
							rule__Css_declaration__ValueTokensAssignment_4();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4());
						}

					}

					// InternalCSS.g:6091:1: ( ( rule__Css_declaration__ValueTokensAssignment_4 )* )
					// InternalCSS.g:6092:1: ( rule__Css_declaration__ValueTokensAssignment_4 )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4());
						}
						// InternalCSS.g:6093:1: ( rule__Css_declaration__ValueTokensAssignment_4 )*
						loop76: do {
							int alt76 = 2;
							int LA76_0 = input.LA(1);

							if (((LA76_0 >= RULE_CSSSTRING && LA76_0 <= RULE_UNDERSCORE) || (LA76_0 >= RULE_HASHMARK && LA76_0 <= RULE_WS) || LA76_0 == 39 || (LA76_0 >= 49 && LA76_0 <= 52) || LA76_0 == 64)) {
								alt76 = 1;
							}


							switch (alt76) {
							case 1:
							// InternalCSS.g:6093:2: rule__Css_declaration__ValueTokensAssignment_4
							{
								pushFollow(FOLLOW_47);
								rule__Css_declaration__ValueTokensAssignment_4();

								state._fsp--;
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop76;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getCss_declarationAccess().getValueTokensAssignment_4());
						}

					}


				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__4__Impl"


	// $ANTLR start "rule__Css_declaration__Group__5"
	// InternalCSS.g:6104:1: rule__Css_declaration__Group__5 : rule__Css_declaration__Group__5__Impl ;
	public final void rule__Css_declaration__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6108:1: ( rule__Css_declaration__Group__5__Impl )
			// InternalCSS.g:6109:2: rule__Css_declaration__Group__5__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Css_declaration__Group__5__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__5"


	// $ANTLR start "rule__Css_declaration__Group__5__Impl"
	// InternalCSS.g:6115:1: rule__Css_declaration__Group__5__Impl : ( ( rule__Css_declaration__ImportantAssignment_5 )? ) ;
	public final void rule__Css_declaration__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6119:1: ( ( ( rule__Css_declaration__ImportantAssignment_5 )? ) )
			// InternalCSS.g:6120:1: ( ( rule__Css_declaration__ImportantAssignment_5 )? )
			{
				// InternalCSS.g:6120:1: ( ( rule__Css_declaration__ImportantAssignment_5 )? )
				// InternalCSS.g:6121:1: ( rule__Css_declaration__ImportantAssignment_5 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getImportantAssignment_5());
					}
					// InternalCSS.g:6122:1: ( rule__Css_declaration__ImportantAssignment_5 )?
					int alt77 = 2;
					int LA77_0 = input.LA(1);

					if ((LA77_0 == RULE_IMPORTANT_SYM)) {
						alt77 = 1;
					}
					switch (alt77) {
					case 1:
					// InternalCSS.g:6122:2: rule__Css_declaration__ImportantAssignment_5
					{
						pushFollow(FOLLOW_2);
						rule__Css_declaration__ImportantAssignment_5();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getImportantAssignment_5());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__Group__5__Impl"


	// $ANTLR start "rule__Css_property__Group__0"
	// InternalCSS.g:6144:1: rule__Css_property__Group__0 : rule__Css_property__Group__0__Impl rule__Css_property__Group__1 ;
	public final void rule__Css_property__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6148:1: ( rule__Css_property__Group__0__Impl rule__Css_property__Group__1 )
			// InternalCSS.g:6149:2: rule__Css_property__Group__0__Impl rule__Css_property__Group__1
			{
				pushFollow(FOLLOW_16);
				rule__Css_property__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Css_property__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_property__Group__0"


	// $ANTLR start "rule__Css_property__Group__0__Impl"
	// InternalCSS.g:6156:1: rule__Css_property__Group__0__Impl : ( () ) ;
	public final void rule__Css_property__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6160:1: ( ( () ) )
			// InternalCSS.g:6161:1: ( () )
			{
				// InternalCSS.g:6161:1: ( () )
				// InternalCSS.g:6162:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_propertyAccess().getCss_propertyAction_0());
					}
					// InternalCSS.g:6163:1: ()
					// InternalCSS.g:6165:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_propertyAccess().getCss_propertyAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_property__Group__0__Impl"


	// $ANTLR start "rule__Css_property__Group__1"
	// InternalCSS.g:6175:1: rule__Css_property__Group__1 : rule__Css_property__Group__1__Impl ;
	public final void rule__Css_property__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6179:1: ( rule__Css_property__Group__1__Impl )
			// InternalCSS.g:6180:2: rule__Css_property__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Css_property__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_property__Group__1"


	// $ANTLR start "rule__Css_property__Group__1__Impl"
	// InternalCSS.g:6186:1: rule__Css_property__Group__1__Impl : ( ( rule__Css_property__NameAssignment_1 ) ) ;
	public final void rule__Css_property__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6190:1: ( ( ( rule__Css_property__NameAssignment_1 ) ) )
			// InternalCSS.g:6191:1: ( ( rule__Css_property__NameAssignment_1 ) )
			{
				// InternalCSS.g:6191:1: ( ( rule__Css_property__NameAssignment_1 ) )
				// InternalCSS.g:6192:1: ( rule__Css_property__NameAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_propertyAccess().getNameAssignment_1());
					}
					// InternalCSS.g:6193:1: ( rule__Css_property__NameAssignment_1 )
					// InternalCSS.g:6193:2: rule__Css_property__NameAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Css_property__NameAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getCss_propertyAccess().getNameAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_property__Group__1__Impl"


	// $ANTLR start "rule__PseudoClass__Group__0"
	// InternalCSS.g:6207:1: rule__PseudoClass__Group__0 : rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1 ;
	public final void rule__PseudoClass__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6211:1: ( rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1 )
			// InternalCSS.g:6212:2: rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1
			{
				pushFollow(FOLLOW_48);
				rule__PseudoClass__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClass__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClass__Group__0"


	// $ANTLR start "rule__PseudoClass__Group__0__Impl"
	// InternalCSS.g:6219:1: rule__PseudoClass__Group__0__Impl : ( RULE_COLON ) ;
	public final void rule__PseudoClass__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6223:1: ( ( RULE_COLON ) )
			// InternalCSS.g:6224:1: ( RULE_COLON )
			{
				// InternalCSS.g:6224:1: ( RULE_COLON )
				// InternalCSS.g:6225:1: RULE_COLON
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_0());
					}
					match(input, RULE_COLON, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClass__Group__0__Impl"


	// $ANTLR start "rule__PseudoClass__Group__1"
	// InternalCSS.g:6236:1: rule__PseudoClass__Group__1 : rule__PseudoClass__Group__1__Impl rule__PseudoClass__Group__2 ;
	public final void rule__PseudoClass__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6240:1: ( rule__PseudoClass__Group__1__Impl rule__PseudoClass__Group__2 )
			// InternalCSS.g:6241:2: rule__PseudoClass__Group__1__Impl rule__PseudoClass__Group__2
			{
				pushFollow(FOLLOW_48);
				rule__PseudoClass__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClass__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClass__Group__1"


	// $ANTLR start "rule__PseudoClass__Group__1__Impl"
	// InternalCSS.g:6248:1: rule__PseudoClass__Group__1__Impl : ( ( RULE_COLON )? ) ;
	public final void rule__PseudoClass__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6252:1: ( ( ( RULE_COLON )? ) )
			// InternalCSS.g:6253:1: ( ( RULE_COLON )? )
			{
				// InternalCSS.g:6253:1: ( ( RULE_COLON )? )
				// InternalCSS.g:6254:1: ( RULE_COLON )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1());
					}
					// InternalCSS.g:6255:1: ( RULE_COLON )?
					int alt78 = 2;
					int LA78_0 = input.LA(1);

					if ((LA78_0 == RULE_COLON)) {
						alt78 = 1;
					}
					switch (alt78) {
					case 1:
					// InternalCSS.g:6255:3: RULE_COLON
					{
						match(input, RULE_COLON, FOLLOW_2);
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClass__Group__1__Impl"


	// $ANTLR start "rule__PseudoClass__Group__2"
	// InternalCSS.g:6265:1: rule__PseudoClass__Group__2 : rule__PseudoClass__Group__2__Impl ;
	public final void rule__PseudoClass__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6269:1: ( rule__PseudoClass__Group__2__Impl )
			// InternalCSS.g:6270:2: rule__PseudoClass__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__PseudoClass__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClass__Group__2"


	// $ANTLR start "rule__PseudoClass__Group__2__Impl"
	// InternalCSS.g:6276:1: rule__PseudoClass__Group__2__Impl : ( rulePseudoClassName ) ;
	public final void rule__PseudoClass__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6280:1: ( ( rulePseudoClassName ) )
			// InternalCSS.g:6281:1: ( rulePseudoClassName )
			{
				// InternalCSS.g:6281:1: ( rulePseudoClassName )
				// InternalCSS.g:6282:1: rulePseudoClassName
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_2());
					}
					pushFollow(FOLLOW_2);
					rulePseudoClassName();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClass__Group__2__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_0__0"
	// InternalCSS.g:6299:1: rule__PseudoClassFunction__Group_0__0 : rule__PseudoClassFunction__Group_0__0__Impl rule__PseudoClassFunction__Group_0__1 ;
	public final void rule__PseudoClassFunction__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6303:1: ( rule__PseudoClassFunction__Group_0__0__Impl rule__PseudoClassFunction__Group_0__1 )
			// InternalCSS.g:6304:2: rule__PseudoClassFunction__Group_0__0__Impl rule__PseudoClassFunction__Group_0__1
			{
				pushFollow(FOLLOW_32);
				rule__PseudoClassFunction__Group_0__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_0__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_0__0"


	// $ANTLR start "rule__PseudoClassFunction__Group_0__0__Impl"
	// InternalCSS.g:6311:1: rule__PseudoClassFunction__Group_0__0__Impl : ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) ) ;
	public final void rule__PseudoClassFunction__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6315:1: ( ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) ) )
			// InternalCSS.g:6316:1: ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) )
			{
				// InternalCSS.g:6316:1: ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) )
				// InternalCSS.g:6317:1: ( rule__PseudoClassFunction__NotAssignment_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getNotAssignment_0_0());
					}
					// InternalCSS.g:6318:1: ( rule__PseudoClassFunction__NotAssignment_0_0 )
					// InternalCSS.g:6318:2: rule__PseudoClassFunction__NotAssignment_0_0
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassFunction__NotAssignment_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getNotAssignment_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_0__0__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_0__1"
	// InternalCSS.g:6328:1: rule__PseudoClassFunction__Group_0__1 : rule__PseudoClassFunction__Group_0__1__Impl rule__PseudoClassFunction__Group_0__2 ;
	public final void rule__PseudoClassFunction__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6332:1: ( rule__PseudoClassFunction__Group_0__1__Impl rule__PseudoClassFunction__Group_0__2 )
			// InternalCSS.g:6333:2: rule__PseudoClassFunction__Group_0__1__Impl rule__PseudoClassFunction__Group_0__2
			{
				pushFollow(FOLLOW_49);
				rule__PseudoClassFunction__Group_0__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_0__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_0__1"


	// $ANTLR start "rule__PseudoClassFunction__Group_0__1__Impl"
	// InternalCSS.g:6340:1: rule__PseudoClassFunction__Group_0__1__Impl : ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) ) ;
	public final void rule__PseudoClassFunction__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6344:1: ( ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) ) )
			// InternalCSS.g:6345:1: ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) )
			{
				// InternalCSS.g:6345:1: ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) )
				// InternalCSS.g:6346:1: ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorAssignment_0_1());
					}
					// InternalCSS.g:6347:1: ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 )
					// InternalCSS.g:6347:2: rule__PseudoClassFunction__ParamSelectorAssignment_0_1
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassFunction__ParamSelectorAssignment_0_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorAssignment_0_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_0__1__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_0__2"
	// InternalCSS.g:6357:1: rule__PseudoClassFunction__Group_0__2 : rule__PseudoClassFunction__Group_0__2__Impl ;
	public final void rule__PseudoClassFunction__Group_0__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6361:1: ( rule__PseudoClassFunction__Group_0__2__Impl )
			// InternalCSS.g:6362:2: rule__PseudoClassFunction__Group_0__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_0__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_0__2"


	// $ANTLR start "rule__PseudoClassFunction__Group_0__2__Impl"
	// InternalCSS.g:6368:1: rule__PseudoClassFunction__Group_0__2__Impl : ( ')' ) ;
	public final void rule__PseudoClassFunction__Group_0__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6372:1: ( ( ')' ) )
			// InternalCSS.g:6373:1: ( ')' )
			{
				// InternalCSS.g:6373:1: ( ')' )
				// InternalCSS.g:6374:1: ')'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2());
					}
					match(input, 61, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_0__2__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__0"
	// InternalCSS.g:6393:1: rule__PseudoClassFunction__Group_1__0 : rule__PseudoClassFunction__Group_1__0__Impl rule__PseudoClassFunction__Group_1__1 ;
	public final void rule__PseudoClassFunction__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6397:1: ( rule__PseudoClassFunction__Group_1__0__Impl rule__PseudoClassFunction__Group_1__1 )
			// InternalCSS.g:6398:2: rule__PseudoClassFunction__Group_1__0__Impl rule__PseudoClassFunction__Group_1__1
			{
				pushFollow(FOLLOW_11);
				rule__PseudoClassFunction__Group_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__0"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__0__Impl"
	// InternalCSS.g:6405:1: rule__PseudoClassFunction__Group_1__0__Impl : ( RULE_COLON ) ;
	public final void rule__PseudoClassFunction__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6409:1: ( ( RULE_COLON ) )
			// InternalCSS.g:6410:1: ( RULE_COLON )
			{
				// InternalCSS.g:6410:1: ( RULE_COLON )
				// InternalCSS.g:6411:1: RULE_COLON
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getCOLONTerminalRuleCall_1_0());
					}
					match(input, RULE_COLON, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getCOLONTerminalRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__0__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__1"
	// InternalCSS.g:6422:1: rule__PseudoClassFunction__Group_1__1 : rule__PseudoClassFunction__Group_1__1__Impl rule__PseudoClassFunction__Group_1__2 ;
	public final void rule__PseudoClassFunction__Group_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6426:1: ( rule__PseudoClassFunction__Group_1__1__Impl rule__PseudoClassFunction__Group_1__2 )
			// InternalCSS.g:6427:2: rule__PseudoClassFunction__Group_1__1__Impl rule__PseudoClassFunction__Group_1__2
			{
				pushFollow(FOLLOW_50);
				rule__PseudoClassFunction__Group_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_1__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__1"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__1__Impl"
	// InternalCSS.g:6434:1: rule__PseudoClassFunction__Group_1__1__Impl : ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) ) ;
	public final void rule__PseudoClassFunction__Group_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6438:1: ( ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) ) )
			// InternalCSS.g:6439:1: ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) )
			{
				// InternalCSS.g:6439:1: ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) )
				// InternalCSS.g:6440:1: ( rule__PseudoClassFunction__NameAssignment_1_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getNameAssignment_1_1());
					}
					// InternalCSS.g:6441:1: ( rule__PseudoClassFunction__NameAssignment_1_1 )
					// InternalCSS.g:6441:2: rule__PseudoClassFunction__NameAssignment_1_1
					{
						pushFollow(FOLLOW_2);
						rule__PseudoClassFunction__NameAssignment_1_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getNameAssignment_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__1__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__2"
	// InternalCSS.g:6451:1: rule__PseudoClassFunction__Group_1__2 : rule__PseudoClassFunction__Group_1__2__Impl rule__PseudoClassFunction__Group_1__3 ;
	public final void rule__PseudoClassFunction__Group_1__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6455:1: ( rule__PseudoClassFunction__Group_1__2__Impl rule__PseudoClassFunction__Group_1__3 )
			// InternalCSS.g:6456:2: rule__PseudoClassFunction__Group_1__2__Impl rule__PseudoClassFunction__Group_1__3
			{
				pushFollow(FOLLOW_51);
				rule__PseudoClassFunction__Group_1__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_1__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__2"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__2__Impl"
	// InternalCSS.g:6463:1: rule__PseudoClassFunction__Group_1__2__Impl : ( '(' ) ;
	public final void rule__PseudoClassFunction__Group_1__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6467:1: ( ( '(' ) )
			// InternalCSS.g:6468:1: ( '(' )
			{
				// InternalCSS.g:6468:1: ( '(' )
				// InternalCSS.g:6469:1: '('
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2());
					}
					match(input, 62, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__2__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__3"
	// InternalCSS.g:6482:1: rule__PseudoClassFunction__Group_1__3 : rule__PseudoClassFunction__Group_1__3__Impl rule__PseudoClassFunction__Group_1__4 ;
	public final void rule__PseudoClassFunction__Group_1__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6486:1: ( rule__PseudoClassFunction__Group_1__3__Impl rule__PseudoClassFunction__Group_1__4 )
			// InternalCSS.g:6487:2: rule__PseudoClassFunction__Group_1__3__Impl rule__PseudoClassFunction__Group_1__4
			{
				pushFollow(FOLLOW_51);
				rule__PseudoClassFunction__Group_1__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_1__4();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__3"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__3__Impl"
	// InternalCSS.g:6494:1: rule__PseudoClassFunction__Group_1__3__Impl : ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* ) ;
	public final void rule__PseudoClassFunction__Group_1__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6498:1: ( ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* ) )
			// InternalCSS.g:6499:1: ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* )
			{
				// InternalCSS.g:6499:1: ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* )
				// InternalCSS.g:6500:1: ( rule__PseudoClassFunction__ParamsAssignment_1_3 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getParamsAssignment_1_3());
					}
					// InternalCSS.g:6501:1: ( rule__PseudoClassFunction__ParamsAssignment_1_3 )*
					loop79: do {
						int alt79 = 2;
						int LA79_0 = input.LA(1);

						if (((LA79_0 >= RULE_CSSSTRING && LA79_0 <= RULE_UNDERSCORE) || (LA79_0 >= RULE_HASHMARK && LA79_0 <= RULE_WS) || LA79_0 == 39 || (LA79_0 >= 49 && LA79_0 <= 52) || LA79_0 == 64)) {
							alt79 = 1;
						}


						switch (alt79) {
						case 1:
						// InternalCSS.g:6501:2: rule__PseudoClassFunction__ParamsAssignment_1_3
						{
							pushFollow(FOLLOW_47);
							rule__PseudoClassFunction__ParamsAssignment_1_3();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop79;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getParamsAssignment_1_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__3__Impl"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__4"
	// InternalCSS.g:6511:1: rule__PseudoClassFunction__Group_1__4 : rule__PseudoClassFunction__Group_1__4__Impl ;
	public final void rule__PseudoClassFunction__Group_1__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6515:1: ( rule__PseudoClassFunction__Group_1__4__Impl )
			// InternalCSS.g:6516:2: rule__PseudoClassFunction__Group_1__4__Impl
			{
				pushFollow(FOLLOW_2);
				rule__PseudoClassFunction__Group_1__4__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__4"


	// $ANTLR start "rule__PseudoClassFunction__Group_1__4__Impl"
	// InternalCSS.g:6522:1: rule__PseudoClassFunction__Group_1__4__Impl : ( ')' ) ;
	public final void rule__PseudoClassFunction__Group_1__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6526:1: ( ( ')' ) )
			// InternalCSS.g:6527:1: ( ')' )
			{
				// InternalCSS.g:6527:1: ( ')' )
				// InternalCSS.g:6528:1: ')'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_1_4());
					}
					match(input, 61, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_1_4());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__Group_1__4__Impl"


	// $ANTLR start "rule__NotFunctionCall__Group__0"
	// InternalCSS.g:6551:1: rule__NotFunctionCall__Group__0 : rule__NotFunctionCall__Group__0__Impl rule__NotFunctionCall__Group__1 ;
	public final void rule__NotFunctionCall__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6555:1: ( rule__NotFunctionCall__Group__0__Impl rule__NotFunctionCall__Group__1 )
			// InternalCSS.g:6556:2: rule__NotFunctionCall__Group__0__Impl rule__NotFunctionCall__Group__1
			{
				pushFollow(FOLLOW_52);
				rule__NotFunctionCall__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__NotFunctionCall__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NotFunctionCall__Group__0"


	// $ANTLR start "rule__NotFunctionCall__Group__0__Impl"
	// InternalCSS.g:6563:1: rule__NotFunctionCall__Group__0__Impl : ( RULE_COLON ) ;
	public final void rule__NotFunctionCall__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6567:1: ( ( RULE_COLON ) )
			// InternalCSS.g:6568:1: ( RULE_COLON )
			{
				// InternalCSS.g:6568:1: ( RULE_COLON )
				// InternalCSS.g:6569:1: RULE_COLON
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNotFunctionCallAccess().getCOLONTerminalRuleCall_0());
					}
					match(input, RULE_COLON, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getNotFunctionCallAccess().getCOLONTerminalRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NotFunctionCall__Group__0__Impl"


	// $ANTLR start "rule__NotFunctionCall__Group__1"
	// InternalCSS.g:6580:1: rule__NotFunctionCall__Group__1 : rule__NotFunctionCall__Group__1__Impl ;
	public final void rule__NotFunctionCall__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6584:1: ( rule__NotFunctionCall__Group__1__Impl )
			// InternalCSS.g:6585:2: rule__NotFunctionCall__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__NotFunctionCall__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NotFunctionCall__Group__1"


	// $ANTLR start "rule__NotFunctionCall__Group__1__Impl"
	// InternalCSS.g:6591:1: rule__NotFunctionCall__Group__1__Impl : ( 'not(' ) ;
	public final void rule__NotFunctionCall__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6595:1: ( ( 'not(' ) )
			// InternalCSS.g:6596:1: ( 'not(' )
			{
				// InternalCSS.g:6596:1: ( 'not(' )
				// InternalCSS.g:6597:1: 'not('
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNotFunctionCallAccess().getNotKeyword_1());
					}
					match(input, 63, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getNotFunctionCallAccess().getNotKeyword_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NotFunctionCall__Group__1__Impl"


	// $ANTLR start "rule__SymbolTok__Group__0"
	// InternalCSS.g:6614:1: rule__SymbolTok__Group__0 : rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1 ;
	public final void rule__SymbolTok__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6618:1: ( rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1 )
			// InternalCSS.g:6619:2: rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1
			{
				pushFollow(FOLLOW_53);
				rule__SymbolTok__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__SymbolTok__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SymbolTok__Group__0"


	// $ANTLR start "rule__SymbolTok__Group__0__Impl"
	// InternalCSS.g:6626:1: rule__SymbolTok__Group__0__Impl : ( () ) ;
	public final void rule__SymbolTok__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6630:1: ( ( () ) )
			// InternalCSS.g:6631:1: ( () )
			{
				// InternalCSS.g:6631:1: ( () )
				// InternalCSS.g:6632:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSymbolTokAccess().getSymbolTokAction_0());
					}
					// InternalCSS.g:6633:1: ()
					// InternalCSS.g:6635:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSymbolTokAccess().getSymbolTokAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SymbolTok__Group__0__Impl"


	// $ANTLR start "rule__SymbolTok__Group__1"
	// InternalCSS.g:6645:1: rule__SymbolTok__Group__1 : rule__SymbolTok__Group__1__Impl ;
	public final void rule__SymbolTok__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6649:1: ( rule__SymbolTok__Group__1__Impl )
			// InternalCSS.g:6650:2: rule__SymbolTok__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__SymbolTok__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SymbolTok__Group__1"


	// $ANTLR start "rule__SymbolTok__Group__1__Impl"
	// InternalCSS.g:6656:1: rule__SymbolTok__Group__1__Impl : ( ( rule__SymbolTok__SymbolAssignment_1 ) ) ;
	public final void rule__SymbolTok__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6660:1: ( ( ( rule__SymbolTok__SymbolAssignment_1 ) ) )
			// InternalCSS.g:6661:1: ( ( rule__SymbolTok__SymbolAssignment_1 ) )
			{
				// InternalCSS.g:6661:1: ( ( rule__SymbolTok__SymbolAssignment_1 ) )
				// InternalCSS.g:6662:1: ( rule__SymbolTok__SymbolAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSymbolTokAccess().getSymbolAssignment_1());
					}
					// InternalCSS.g:6663:1: ( rule__SymbolTok__SymbolAssignment_1 )
					// InternalCSS.g:6663:2: rule__SymbolTok__SymbolAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__SymbolTok__SymbolAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSymbolTokAccess().getSymbolAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SymbolTok__Group__1__Impl"


	// $ANTLR start "rule__WSTok__Group__0"
	// InternalCSS.g:6677:1: rule__WSTok__Group__0 : rule__WSTok__Group__0__Impl rule__WSTok__Group__1 ;
	public final void rule__WSTok__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6681:1: ( rule__WSTok__Group__0__Impl rule__WSTok__Group__1 )
			// InternalCSS.g:6682:2: rule__WSTok__Group__0__Impl rule__WSTok__Group__1
			{
				pushFollow(FOLLOW_36);
				rule__WSTok__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__WSTok__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__WSTok__Group__0"


	// $ANTLR start "rule__WSTok__Group__0__Impl"
	// InternalCSS.g:6689:1: rule__WSTok__Group__0__Impl : ( () ) ;
	public final void rule__WSTok__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6693:1: ( ( () ) )
			// InternalCSS.g:6694:1: ( () )
			{
				// InternalCSS.g:6694:1: ( () )
				// InternalCSS.g:6695:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getWSTokAccess().getWSTokAction_0());
					}
					// InternalCSS.g:6696:1: ()
					// InternalCSS.g:6698:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getWSTokAccess().getWSTokAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__WSTok__Group__0__Impl"


	// $ANTLR start "rule__WSTok__Group__1"
	// InternalCSS.g:6708:1: rule__WSTok__Group__1 : rule__WSTok__Group__1__Impl ;
	public final void rule__WSTok__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6712:1: ( rule__WSTok__Group__1__Impl )
			// InternalCSS.g:6713:2: rule__WSTok__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__WSTok__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__WSTok__Group__1"


	// $ANTLR start "rule__WSTok__Group__1__Impl"
	// InternalCSS.g:6719:1: rule__WSTok__Group__1__Impl : ( RULE_WS ) ;
	public final void rule__WSTok__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6723:1: ( ( RULE_WS ) )
			// InternalCSS.g:6724:1: ( RULE_WS )
			{
				// InternalCSS.g:6724:1: ( RULE_WS )
				// InternalCSS.g:6725:1: RULE_WS
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1());
					}
					match(input, RULE_WS, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__WSTok__Group__1__Impl"


	// $ANTLR start "rule__StringTok__Group__0"
	// InternalCSS.g:6740:1: rule__StringTok__Group__0 : rule__StringTok__Group__0__Impl rule__StringTok__Group__1 ;
	public final void rule__StringTok__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6744:1: ( rule__StringTok__Group__0__Impl rule__StringTok__Group__1 )
			// InternalCSS.g:6745:2: rule__StringTok__Group__0__Impl rule__StringTok__Group__1
			{
				pushFollow(FOLLOW_8);
				rule__StringTok__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__StringTok__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__StringTok__Group__0"


	// $ANTLR start "rule__StringTok__Group__0__Impl"
	// InternalCSS.g:6752:1: rule__StringTok__Group__0__Impl : ( () ) ;
	public final void rule__StringTok__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6756:1: ( ( () ) )
			// InternalCSS.g:6757:1: ( () )
			{
				// InternalCSS.g:6757:1: ( () )
				// InternalCSS.g:6758:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStringTokAccess().getStringTokAction_0());
					}
					// InternalCSS.g:6759:1: ()
					// InternalCSS.g:6761:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStringTokAccess().getStringTokAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__StringTok__Group__0__Impl"


	// $ANTLR start "rule__StringTok__Group__1"
	// InternalCSS.g:6771:1: rule__StringTok__Group__1 : rule__StringTok__Group__1__Impl ;
	public final void rule__StringTok__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6775:1: ( rule__StringTok__Group__1__Impl )
			// InternalCSS.g:6776:2: rule__StringTok__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__StringTok__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__StringTok__Group__1"


	// $ANTLR start "rule__StringTok__Group__1__Impl"
	// InternalCSS.g:6782:1: rule__StringTok__Group__1__Impl : ( ( rule__StringTok__ValueAssignment_1 ) ) ;
	public final void rule__StringTok__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6786:1: ( ( ( rule__StringTok__ValueAssignment_1 ) ) )
			// InternalCSS.g:6787:1: ( ( rule__StringTok__ValueAssignment_1 ) )
			{
				// InternalCSS.g:6787:1: ( ( rule__StringTok__ValueAssignment_1 ) )
				// InternalCSS.g:6788:1: ( rule__StringTok__ValueAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStringTokAccess().getValueAssignment_1());
					}
					// InternalCSS.g:6789:1: ( rule__StringTok__ValueAssignment_1 )
					// InternalCSS.g:6789:2: rule__StringTok__ValueAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__StringTok__ValueAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getStringTokAccess().getValueAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__StringTok__Group__1__Impl"


	// $ANTLR start "rule__NumberTok__Group__0"
	// InternalCSS.g:6803:1: rule__NumberTok__Group__0 : rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1 ;
	public final void rule__NumberTok__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6807:1: ( rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1 )
			// InternalCSS.g:6808:2: rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1
			{
				pushFollow(FOLLOW_25);
				rule__NumberTok__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__NumberTok__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NumberTok__Group__0"


	// $ANTLR start "rule__NumberTok__Group__0__Impl"
	// InternalCSS.g:6815:1: rule__NumberTok__Group__0__Impl : ( () ) ;
	public final void rule__NumberTok__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6819:1: ( ( () ) )
			// InternalCSS.g:6820:1: ( () )
			{
				// InternalCSS.g:6820:1: ( () )
				// InternalCSS.g:6821:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumberTokAccess().getNumberTokAction_0());
					}
					// InternalCSS.g:6822:1: ()
					// InternalCSS.g:6824:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumberTokAccess().getNumberTokAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NumberTok__Group__0__Impl"


	// $ANTLR start "rule__NumberTok__Group__1"
	// InternalCSS.g:6834:1: rule__NumberTok__Group__1 : rule__NumberTok__Group__1__Impl ;
	public final void rule__NumberTok__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6838:1: ( rule__NumberTok__Group__1__Impl )
			// InternalCSS.g:6839:2: rule__NumberTok__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__NumberTok__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NumberTok__Group__1"


	// $ANTLR start "rule__NumberTok__Group__1__Impl"
	// InternalCSS.g:6845:1: rule__NumberTok__Group__1__Impl : ( ( rule__NumberTok__ValAssignment_1 ) ) ;
	public final void rule__NumberTok__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6849:1: ( ( ( rule__NumberTok__ValAssignment_1 ) ) )
			// InternalCSS.g:6850:1: ( ( rule__NumberTok__ValAssignment_1 ) )
			{
				// InternalCSS.g:6850:1: ( ( rule__NumberTok__ValAssignment_1 ) )
				// InternalCSS.g:6851:1: ( rule__NumberTok__ValAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumberTokAccess().getValAssignment_1());
					}
					// InternalCSS.g:6852:1: ( rule__NumberTok__ValAssignment_1 )
					// InternalCSS.g:6852:2: rule__NumberTok__ValAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__NumberTok__ValAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumberTokAccess().getValAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NumberTok__Group__1__Impl"


	// $ANTLR start "rule__UrlTok__Group__0"
	// InternalCSS.g:6866:1: rule__UrlTok__Group__0 : rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1 ;
	public final void rule__UrlTok__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6870:1: ( rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1 )
			// InternalCSS.g:6871:2: rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1
			{
				pushFollow(FOLLOW_10);
				rule__UrlTok__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__UrlTok__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UrlTok__Group__0"


	// $ANTLR start "rule__UrlTok__Group__0__Impl"
	// InternalCSS.g:6878:1: rule__UrlTok__Group__0__Impl : ( () ) ;
	public final void rule__UrlTok__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6882:1: ( ( () ) )
			// InternalCSS.g:6883:1: ( () )
			{
				// InternalCSS.g:6883:1: ( () )
				// InternalCSS.g:6884:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUrlTokAccess().getUrlTokAction_0());
					}
					// InternalCSS.g:6885:1: ()
					// InternalCSS.g:6887:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getUrlTokAccess().getUrlTokAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UrlTok__Group__0__Impl"


	// $ANTLR start "rule__UrlTok__Group__1"
	// InternalCSS.g:6897:1: rule__UrlTok__Group__1 : rule__UrlTok__Group__1__Impl ;
	public final void rule__UrlTok__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6901:1: ( rule__UrlTok__Group__1__Impl )
			// InternalCSS.g:6902:2: rule__UrlTok__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__UrlTok__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UrlTok__Group__1"


	// $ANTLR start "rule__UrlTok__Group__1__Impl"
	// InternalCSS.g:6908:1: rule__UrlTok__Group__1__Impl : ( ( rule__UrlTok__UrlAssignment_1 ) ) ;
	public final void rule__UrlTok__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6912:1: ( ( ( rule__UrlTok__UrlAssignment_1 ) ) )
			// InternalCSS.g:6913:1: ( ( rule__UrlTok__UrlAssignment_1 ) )
			{
				// InternalCSS.g:6913:1: ( ( rule__UrlTok__UrlAssignment_1 ) )
				// InternalCSS.g:6914:1: ( rule__UrlTok__UrlAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUrlTokAccess().getUrlAssignment_1());
					}
					// InternalCSS.g:6915:1: ( rule__UrlTok__UrlAssignment_1 )
					// InternalCSS.g:6915:2: rule__UrlTok__UrlAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__UrlTok__UrlAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getUrlTokAccess().getUrlAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UrlTok__Group__1__Impl"


	// $ANTLR start "rule__ColorTok__Group__0"
	// InternalCSS.g:6929:1: rule__ColorTok__Group__0 : rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1 ;
	public final void rule__ColorTok__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6933:1: ( rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1 )
			// InternalCSS.g:6934:2: rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1
			{
				pushFollow(FOLLOW_45);
				rule__ColorTok__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ColorTok__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ColorTok__Group__0"


	// $ANTLR start "rule__ColorTok__Group__0__Impl"
	// InternalCSS.g:6941:1: rule__ColorTok__Group__0__Impl : ( () ) ;
	public final void rule__ColorTok__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6945:1: ( ( () ) )
			// InternalCSS.g:6946:1: ( () )
			{
				// InternalCSS.g:6946:1: ( () )
				// InternalCSS.g:6947:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getColorTokAccess().getColorTokAction_0());
					}
					// InternalCSS.g:6948:1: ()
					// InternalCSS.g:6950:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getColorTokAccess().getColorTokAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ColorTok__Group__0__Impl"


	// $ANTLR start "rule__ColorTok__Group__1"
	// InternalCSS.g:6960:1: rule__ColorTok__Group__1 : rule__ColorTok__Group__1__Impl ;
	public final void rule__ColorTok__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6964:1: ( rule__ColorTok__Group__1__Impl )
			// InternalCSS.g:6965:2: rule__ColorTok__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ColorTok__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ColorTok__Group__1"


	// $ANTLR start "rule__ColorTok__Group__1__Impl"
	// InternalCSS.g:6971:1: rule__ColorTok__Group__1__Impl : ( ( rule__ColorTok__ValueAssignment_1 ) ) ;
	public final void rule__ColorTok__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6975:1: ( ( ( rule__ColorTok__ValueAssignment_1 ) ) )
			// InternalCSS.g:6976:1: ( ( rule__ColorTok__ValueAssignment_1 ) )
			{
				// InternalCSS.g:6976:1: ( ( rule__ColorTok__ValueAssignment_1 ) )
				// InternalCSS.g:6977:1: ( rule__ColorTok__ValueAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getColorTokAccess().getValueAssignment_1());
					}
					// InternalCSS.g:6978:1: ( rule__ColorTok__ValueAssignment_1 )
					// InternalCSS.g:6978:2: rule__ColorTok__ValueAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__ColorTok__ValueAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getColorTokAccess().getValueAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ColorTok__Group__1__Impl"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group__0"
	// InternalCSS.g:6992:1: rule__IdentifierOrFuncTok__Group__0 : rule__IdentifierOrFuncTok__Group__0__Impl rule__IdentifierOrFuncTok__Group__1 ;
	public final void rule__IdentifierOrFuncTok__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:6996:1: ( rule__IdentifierOrFuncTok__Group__0__Impl rule__IdentifierOrFuncTok__Group__1 )
			// InternalCSS.g:6997:2: rule__IdentifierOrFuncTok__Group__0__Impl rule__IdentifierOrFuncTok__Group__1
			{
				pushFollow(FOLLOW_11);
				rule__IdentifierOrFuncTok__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__IdentifierOrFuncTok__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group__0"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group__0__Impl"
	// InternalCSS.g:7004:1: rule__IdentifierOrFuncTok__Group__0__Impl : ( () ) ;
	public final void rule__IdentifierOrFuncTok__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7008:1: ( ( () ) )
			// InternalCSS.g:7009:1: ( () )
			{
				// InternalCSS.g:7009:1: ( () )
				// InternalCSS.g:7010:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0());
					}
					// InternalCSS.g:7011:1: ()
					// InternalCSS.g:7013:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group__0__Impl"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group__1"
	// InternalCSS.g:7023:1: rule__IdentifierOrFuncTok__Group__1 : rule__IdentifierOrFuncTok__Group__1__Impl rule__IdentifierOrFuncTok__Group__2 ;
	public final void rule__IdentifierOrFuncTok__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7027:1: ( rule__IdentifierOrFuncTok__Group__1__Impl rule__IdentifierOrFuncTok__Group__2 )
			// InternalCSS.g:7028:2: rule__IdentifierOrFuncTok__Group__1__Impl rule__IdentifierOrFuncTok__Group__2
			{
				pushFollow(FOLLOW_50);
				rule__IdentifierOrFuncTok__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__IdentifierOrFuncTok__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group__1"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group__1__Impl"
	// InternalCSS.g:7035:1: rule__IdentifierOrFuncTok__Group__1__Impl : ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) ) ;
	public final void rule__IdentifierOrFuncTok__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7039:1: ( ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) ) )
			// InternalCSS.g:7040:1: ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) )
			{
				// InternalCSS.g:7040:1: ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) )
				// InternalCSS.g:7041:1: ( rule__IdentifierOrFuncTok__NameAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getNameAssignment_1());
					}
					// InternalCSS.g:7042:1: ( rule__IdentifierOrFuncTok__NameAssignment_1 )
					// InternalCSS.g:7042:2: rule__IdentifierOrFuncTok__NameAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__IdentifierOrFuncTok__NameAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getNameAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group__1__Impl"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group__2"
	// InternalCSS.g:7052:1: rule__IdentifierOrFuncTok__Group__2 : rule__IdentifierOrFuncTok__Group__2__Impl ;
	public final void rule__IdentifierOrFuncTok__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7056:1: ( rule__IdentifierOrFuncTok__Group__2__Impl )
			// InternalCSS.g:7057:2: rule__IdentifierOrFuncTok__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__IdentifierOrFuncTok__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group__2"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group__2__Impl"
	// InternalCSS.g:7063:1: rule__IdentifierOrFuncTok__Group__2__Impl : ( ( rule__IdentifierOrFuncTok__Group_2__0 )? ) ;
	public final void rule__IdentifierOrFuncTok__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7067:1: ( ( ( rule__IdentifierOrFuncTok__Group_2__0 )? ) )
			// InternalCSS.g:7068:1: ( ( rule__IdentifierOrFuncTok__Group_2__0 )? )
			{
				// InternalCSS.g:7068:1: ( ( rule__IdentifierOrFuncTok__Group_2__0 )? )
				// InternalCSS.g:7069:1: ( rule__IdentifierOrFuncTok__Group_2__0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getGroup_2());
					}
					// InternalCSS.g:7070:1: ( rule__IdentifierOrFuncTok__Group_2__0 )?
					int alt80 = 2;
					int LA80_0 = input.LA(1);

					if ((LA80_0 == 62)) {
						alt80 = 1;
					}
					switch (alt80) {
					case 1:
					// InternalCSS.g:7070:2: rule__IdentifierOrFuncTok__Group_2__0
					{
						pushFollow(FOLLOW_2);
						rule__IdentifierOrFuncTok__Group_2__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getGroup_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group__2__Impl"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__0"
	// InternalCSS.g:7086:1: rule__IdentifierOrFuncTok__Group_2__0 : rule__IdentifierOrFuncTok__Group_2__0__Impl rule__IdentifierOrFuncTok__Group_2__1 ;
	public final void rule__IdentifierOrFuncTok__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7090:1: ( rule__IdentifierOrFuncTok__Group_2__0__Impl rule__IdentifierOrFuncTok__Group_2__1 )
			// InternalCSS.g:7091:2: rule__IdentifierOrFuncTok__Group_2__0__Impl rule__IdentifierOrFuncTok__Group_2__1
			{
				pushFollow(FOLLOW_50);
				rule__IdentifierOrFuncTok__Group_2__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__IdentifierOrFuncTok__Group_2__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__0"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__0__Impl"
	// InternalCSS.g:7098:1: rule__IdentifierOrFuncTok__Group_2__0__Impl : ( () ) ;
	public final void rule__IdentifierOrFuncTok__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7102:1: ( ( () ) )
			// InternalCSS.g:7103:1: ( () )
			{
				// InternalCSS.g:7103:1: ( () )
				// InternalCSS.g:7104:1: ()
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0());
					}
					// InternalCSS.g:7105:1: ()
					// InternalCSS.g:7107:1:
					{
					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0());
					}

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__0__Impl"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__1"
	// InternalCSS.g:7117:1: rule__IdentifierOrFuncTok__Group_2__1 : rule__IdentifierOrFuncTok__Group_2__1__Impl rule__IdentifierOrFuncTok__Group_2__2 ;
	public final void rule__IdentifierOrFuncTok__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7121:1: ( rule__IdentifierOrFuncTok__Group_2__1__Impl rule__IdentifierOrFuncTok__Group_2__2 )
			// InternalCSS.g:7122:2: rule__IdentifierOrFuncTok__Group_2__1__Impl rule__IdentifierOrFuncTok__Group_2__2
			{
				pushFollow(FOLLOW_45);
				rule__IdentifierOrFuncTok__Group_2__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__IdentifierOrFuncTok__Group_2__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__1"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__1__Impl"
	// InternalCSS.g:7129:1: rule__IdentifierOrFuncTok__Group_2__1__Impl : ( '(' ) ;
	public final void rule__IdentifierOrFuncTok__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7133:1: ( ( '(' ) )
			// InternalCSS.g:7134:1: ( '(' )
			{
				// InternalCSS.g:7134:1: ( '(' )
				// InternalCSS.g:7135:1: '('
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1());
					}
					match(input, 62, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__1__Impl"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__2"
	// InternalCSS.g:7148:1: rule__IdentifierOrFuncTok__Group_2__2 : rule__IdentifierOrFuncTok__Group_2__2__Impl rule__IdentifierOrFuncTok__Group_2__3 ;
	public final void rule__IdentifierOrFuncTok__Group_2__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7152:1: ( rule__IdentifierOrFuncTok__Group_2__2__Impl rule__IdentifierOrFuncTok__Group_2__3 )
			// InternalCSS.g:7153:2: rule__IdentifierOrFuncTok__Group_2__2__Impl rule__IdentifierOrFuncTok__Group_2__3
			{
				pushFollow(FOLLOW_49);
				rule__IdentifierOrFuncTok__Group_2__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__IdentifierOrFuncTok__Group_2__3();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__2"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__2__Impl"
	// InternalCSS.g:7160:1: rule__IdentifierOrFuncTok__Group_2__2__Impl : ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) ) ;
	public final void rule__IdentifierOrFuncTok__Group_2__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7164:1: ( ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) ) )
			// InternalCSS.g:7165:1: ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) )
			{
				// InternalCSS.g:7165:1: ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) )
				// InternalCSS.g:7166:1: ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* )
				{
					// InternalCSS.g:7166:1: ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) )
					// InternalCSS.g:7167:1: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2());
						}
						// InternalCSS.g:7168:1: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )
						// InternalCSS.g:7168:2: rule__IdentifierOrFuncTok__ParamsAssignment_2_2
						{
							pushFollow(FOLLOW_47);
							rule__IdentifierOrFuncTok__ParamsAssignment_2_2();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2());
						}

					}

					// InternalCSS.g:7171:1: ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* )
					// InternalCSS.g:7172:1: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2());
						}
						// InternalCSS.g:7173:1: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )*
						loop81: do {
							int alt81 = 2;
							int LA81_0 = input.LA(1);

							if (((LA81_0 >= RULE_CSSSTRING && LA81_0 <= RULE_UNDERSCORE) || (LA81_0 >= RULE_HASHMARK && LA81_0 <= RULE_WS) || LA81_0 == 39 || (LA81_0 >= 49 && LA81_0 <= 52) || LA81_0 == 64)) {
								alt81 = 1;
							}


							switch (alt81) {
							case 1:
							// InternalCSS.g:7173:2: rule__IdentifierOrFuncTok__ParamsAssignment_2_2
							{
								pushFollow(FOLLOW_47);
								rule__IdentifierOrFuncTok__ParamsAssignment_2_2();

								state._fsp--;
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop81;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2());
						}

					}


				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__2__Impl"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__3"
	// InternalCSS.g:7184:1: rule__IdentifierOrFuncTok__Group_2__3 : rule__IdentifierOrFuncTok__Group_2__3__Impl ;
	public final void rule__IdentifierOrFuncTok__Group_2__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7188:1: ( rule__IdentifierOrFuncTok__Group_2__3__Impl )
			// InternalCSS.g:7189:2: rule__IdentifierOrFuncTok__Group_2__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__IdentifierOrFuncTok__Group_2__3__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__3"


	// $ANTLR start "rule__IdentifierOrFuncTok__Group_2__3__Impl"
	// InternalCSS.g:7195:1: rule__IdentifierOrFuncTok__Group_2__3__Impl : ( ')' ) ;
	public final void rule__IdentifierOrFuncTok__Group_2__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7199:1: ( ( ')' ) )
			// InternalCSS.g:7200:1: ( ')' )
			{
				// InternalCSS.g:7200:1: ( ')' )
				// InternalCSS.g:7201:1: ')'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getRightParenthesisKeyword_2_3());
					}
					match(input, 61, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getRightParenthesisKeyword_2_3());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__Group_2__3__Impl"


	// $ANTLR start "rule__URLType__Group__0"
	// InternalCSS.g:7222:1: rule__URLType__Group__0 : rule__URLType__Group__0__Impl rule__URLType__Group__1 ;
	public final void rule__URLType__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7226:1: ( rule__URLType__Group__0__Impl rule__URLType__Group__1 )
			// InternalCSS.g:7227:2: rule__URLType__Group__0__Impl rule__URLType__Group__1
			{
				pushFollow(FOLLOW_54);
				rule__URLType__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__URLType__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__URLType__Group__0"


	// $ANTLR start "rule__URLType__Group__0__Impl"
	// InternalCSS.g:7234:1: rule__URLType__Group__0__Impl : ( 'url(' ) ;
	public final void rule__URLType__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7238:1: ( ( 'url(' ) )
			// InternalCSS.g:7239:1: ( 'url(' )
			{
				// InternalCSS.g:7239:1: ( 'url(' )
				// InternalCSS.g:7240:1: 'url('
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getURLTypeAccess().getUrlKeyword_0());
					}
					match(input, 64, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getURLTypeAccess().getUrlKeyword_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__URLType__Group__0__Impl"


	// $ANTLR start "rule__URLType__Group__1"
	// InternalCSS.g:7253:1: rule__URLType__Group__1 : rule__URLType__Group__1__Impl rule__URLType__Group__2 ;
	public final void rule__URLType__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7257:1: ( rule__URLType__Group__1__Impl rule__URLType__Group__2 )
			// InternalCSS.g:7258:2: rule__URLType__Group__1__Impl rule__URLType__Group__2
			{
				pushFollow(FOLLOW_49);
				rule__URLType__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__URLType__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__URLType__Group__1"


	// $ANTLR start "rule__URLType__Group__1__Impl"
	// InternalCSS.g:7265:1: rule__URLType__Group__1__Impl : ( ( rule__URLType__UrlAssignment_1 ) ) ;
	public final void rule__URLType__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7269:1: ( ( ( rule__URLType__UrlAssignment_1 ) ) )
			// InternalCSS.g:7270:1: ( ( rule__URLType__UrlAssignment_1 ) )
			{
				// InternalCSS.g:7270:1: ( ( rule__URLType__UrlAssignment_1 ) )
				// InternalCSS.g:7271:1: ( rule__URLType__UrlAssignment_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getURLTypeAccess().getUrlAssignment_1());
					}
					// InternalCSS.g:7272:1: ( rule__URLType__UrlAssignment_1 )
					// InternalCSS.g:7272:2: rule__URLType__UrlAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__URLType__UrlAssignment_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getURLTypeAccess().getUrlAssignment_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__URLType__Group__1__Impl"


	// $ANTLR start "rule__URLType__Group__2"
	// InternalCSS.g:7282:1: rule__URLType__Group__2 : rule__URLType__Group__2__Impl ;
	public final void rule__URLType__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7286:1: ( rule__URLType__Group__2__Impl )
			// InternalCSS.g:7287:2: rule__URLType__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__URLType__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__URLType__Group__2"


	// $ANTLR start "rule__URLType__Group__2__Impl"
	// InternalCSS.g:7293:1: rule__URLType__Group__2__Impl : ( ')' ) ;
	public final void rule__URLType__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7297:1: ( ( ')' ) )
			// InternalCSS.g:7298:1: ( ')' )
			{
				// InternalCSS.g:7298:1: ( ')' )
				// InternalCSS.g:7299:1: ')'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_2());
					}
					match(input, 61, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__URLType__Group__2__Impl"


	// $ANTLR start "rule__ValidURLSymbol__Group_18__0"
	// InternalCSS.g:7318:1: rule__ValidURLSymbol__Group_18__0 : rule__ValidURLSymbol__Group_18__0__Impl rule__ValidURLSymbol__Group_18__1 ;
	public final void rule__ValidURLSymbol__Group_18__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7322:1: ( rule__ValidURLSymbol__Group_18__0__Impl rule__ValidURLSymbol__Group_18__1 )
			// InternalCSS.g:7323:2: rule__ValidURLSymbol__Group_18__0__Impl rule__ValidURLSymbol__Group_18__1
			{
				pushFollow(FOLLOW_55);
				rule__ValidURLSymbol__Group_18__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ValidURLSymbol__Group_18__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURLSymbol__Group_18__0"


	// $ANTLR start "rule__ValidURLSymbol__Group_18__0__Impl"
	// InternalCSS.g:7330:1: rule__ValidURLSymbol__Group_18__0__Impl : ( '=' ) ;
	public final void rule__ValidURLSymbol__Group_18__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7334:1: ( ( '=' ) )
			// InternalCSS.g:7335:1: ( '=' )
			{
				// InternalCSS.g:7335:1: ( '=' )
				// InternalCSS.g:7336:1: '='
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_18_0());
					}
					match(input, 35, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_18_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURLSymbol__Group_18__0__Impl"


	// $ANTLR start "rule__ValidURLSymbol__Group_18__1"
	// InternalCSS.g:7349:1: rule__ValidURLSymbol__Group_18__1 : rule__ValidURLSymbol__Group_18__1__Impl ;
	public final void rule__ValidURLSymbol__Group_18__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7353:1: ( rule__ValidURLSymbol__Group_18__1__Impl )
			// InternalCSS.g:7354:2: rule__ValidURLSymbol__Group_18__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ValidURLSymbol__Group_18__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURLSymbol__Group_18__1"


	// $ANTLR start "rule__ValidURLSymbol__Group_18__1__Impl"
	// InternalCSS.g:7360:1: rule__ValidURLSymbol__Group_18__1__Impl : ( ruleKeywordHack ) ;
	public final void rule__ValidURLSymbol__Group_18__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7364:1: ( ( ruleKeywordHack ) )
			// InternalCSS.g:7365:1: ( ruleKeywordHack )
			{
				// InternalCSS.g:7365:1: ( ruleKeywordHack )
				// InternalCSS.g:7366:1: ruleKeywordHack
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLSymbolAccess().getKeywordHackParserRuleCall_18_1());
					}
					pushFollow(FOLLOW_2);
					ruleKeywordHack();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLSymbolAccess().getKeywordHackParserRuleCall_18_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURLSymbol__Group_18__1__Impl"


	// $ANTLR start "rule__ValidURL__Group_1_10__0"
	// InternalCSS.g:7381:1: rule__ValidURL__Group_1_10__0 : rule__ValidURL__Group_1_10__0__Impl rule__ValidURL__Group_1_10__1 ;
	public final void rule__ValidURL__Group_1_10__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7385:1: ( rule__ValidURL__Group_1_10__0__Impl rule__ValidURL__Group_1_10__1 )
			// InternalCSS.g:7386:2: rule__ValidURL__Group_1_10__0__Impl rule__ValidURL__Group_1_10__1
			{
				pushFollow(FOLLOW_56);
				rule__ValidURL__Group_1_10__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ValidURL__Group_1_10__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Group_1_10__0"


	// $ANTLR start "rule__ValidURL__Group_1_10__0__Impl"
	// InternalCSS.g:7393:1: rule__ValidURL__Group_1_10__0__Impl : ( RULE_PERCENT ) ;
	public final void rule__ValidURL__Group_1_10__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7397:1: ( ( RULE_PERCENT ) )
			// InternalCSS.g:7398:1: ( RULE_PERCENT )
			{
				// InternalCSS.g:7398:1: ( RULE_PERCENT )
				// InternalCSS.g:7399:1: RULE_PERCENT
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_10_0());
					}
					match(input, RULE_PERCENT, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_10_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Group_1_10__0__Impl"


	// $ANTLR start "rule__ValidURL__Group_1_10__1"
	// InternalCSS.g:7410:1: rule__ValidURL__Group_1_10__1 : rule__ValidURL__Group_1_10__1__Impl rule__ValidURL__Group_1_10__2 ;
	public final void rule__ValidURL__Group_1_10__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7414:1: ( rule__ValidURL__Group_1_10__1__Impl rule__ValidURL__Group_1_10__2 )
			// InternalCSS.g:7415:2: rule__ValidURL__Group_1_10__1__Impl rule__ValidURL__Group_1_10__2
			{
				pushFollow(FOLLOW_56);
				rule__ValidURL__Group_1_10__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__ValidURL__Group_1_10__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Group_1_10__1"


	// $ANTLR start "rule__ValidURL__Group_1_10__1__Impl"
	// InternalCSS.g:7422:1: rule__ValidURL__Group_1_10__1__Impl : ( ( rule__ValidURL__Alternatives_1_10_1 ) ) ;
	public final void rule__ValidURL__Group_1_10__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7426:1: ( ( ( rule__ValidURL__Alternatives_1_10_1 ) ) )
			// InternalCSS.g:7427:1: ( ( rule__ValidURL__Alternatives_1_10_1 ) )
			{
				// InternalCSS.g:7427:1: ( ( rule__ValidURL__Alternatives_1_10_1 ) )
				// InternalCSS.g:7428:1: ( rule__ValidURL__Alternatives_1_10_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getAlternatives_1_10_1());
					}
					// InternalCSS.g:7429:1: ( rule__ValidURL__Alternatives_1_10_1 )
					// InternalCSS.g:7429:2: rule__ValidURL__Alternatives_1_10_1
					{
						pushFollow(FOLLOW_2);
						rule__ValidURL__Alternatives_1_10_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getAlternatives_1_10_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Group_1_10__1__Impl"


	// $ANTLR start "rule__ValidURL__Group_1_10__2"
	// InternalCSS.g:7439:1: rule__ValidURL__Group_1_10__2 : rule__ValidURL__Group_1_10__2__Impl ;
	public final void rule__ValidURL__Group_1_10__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7443:1: ( rule__ValidURL__Group_1_10__2__Impl )
			// InternalCSS.g:7444:2: rule__ValidURL__Group_1_10__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ValidURL__Group_1_10__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Group_1_10__2"


	// $ANTLR start "rule__ValidURL__Group_1_10__2__Impl"
	// InternalCSS.g:7450:1: rule__ValidURL__Group_1_10__2__Impl : ( ( rule__ValidURL__Alternatives_1_10_2 ) ) ;
	public final void rule__ValidURL__Group_1_10__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7454:1: ( ( ( rule__ValidURL__Alternatives_1_10_2 ) ) )
			// InternalCSS.g:7455:1: ( ( rule__ValidURL__Alternatives_1_10_2 ) )
			{
				// InternalCSS.g:7455:1: ( ( rule__ValidURL__Alternatives_1_10_2 ) )
				// InternalCSS.g:7456:1: ( rule__ValidURL__Alternatives_1_10_2 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getValidURLAccess().getAlternatives_1_10_2());
					}
					// InternalCSS.g:7457:1: ( rule__ValidURL__Alternatives_1_10_2 )
					// InternalCSS.g:7457:2: rule__ValidURL__Alternatives_1_10_2
					{
						pushFollow(FOLLOW_2);
						rule__ValidURL__Alternatives_1_10_2();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getValidURLAccess().getAlternatives_1_10_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ValidURL__Group_1_10__2__Impl"


	// $ANTLR start "rule__Identifier__Group__0"
	// InternalCSS.g:7473:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
	public final void rule__Identifier__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7477:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
			// InternalCSS.g:7478:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
			{
				pushFollow(FOLLOW_11);
				rule__Identifier__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Identifier__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group__0"


	// $ANTLR start "rule__Identifier__Group__0__Impl"
	// InternalCSS.g:7485:1: rule__Identifier__Group__0__Impl : ( ( RULE_DASH )? ) ;
	public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7489:1: ( ( ( RULE_DASH )? ) )
			// InternalCSS.g:7490:1: ( ( RULE_DASH )? )
			{
				// InternalCSS.g:7490:1: ( ( RULE_DASH )? )
				// InternalCSS.g:7491:1: ( RULE_DASH )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0());
					}
					// InternalCSS.g:7492:1: ( RULE_DASH )?
					int alt82 = 2;
					int LA82_0 = input.LA(1);

					if ((LA82_0 == RULE_DASH)) {
						alt82 = 1;
					}
					switch (alt82) {
					case 1:
					// InternalCSS.g:7492:3: RULE_DASH
					{
						match(input, RULE_DASH, FOLLOW_2);
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group__0__Impl"


	// $ANTLR start "rule__Identifier__Group__1"
	// InternalCSS.g:7502:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
	public final void rule__Identifier__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7506:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
			// InternalCSS.g:7507:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
			{
				pushFollow(FOLLOW_57);
				rule__Identifier__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Identifier__Group__2();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group__1"


	// $ANTLR start "rule__Identifier__Group__1__Impl"
	// InternalCSS.g:7514:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Alternatives_1 ) ) ;
	public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7518:1: ( ( ( rule__Identifier__Alternatives_1 ) ) )
			// InternalCSS.g:7519:1: ( ( rule__Identifier__Alternatives_1 ) )
			{
				// InternalCSS.g:7519:1: ( ( rule__Identifier__Alternatives_1 ) )
				// InternalCSS.g:7520:1: ( rule__Identifier__Alternatives_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getAlternatives_1());
					}
					// InternalCSS.g:7521:1: ( rule__Identifier__Alternatives_1 )
					// InternalCSS.g:7521:2: rule__Identifier__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Identifier__Alternatives_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getAlternatives_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group__1__Impl"


	// $ANTLR start "rule__Identifier__Group__2"
	// InternalCSS.g:7531:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl ;
	public final void rule__Identifier__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7535:1: ( rule__Identifier__Group__2__Impl )
			// InternalCSS.g:7536:2: rule__Identifier__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Identifier__Group__2__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group__2"


	// $ANTLR start "rule__Identifier__Group__2__Impl"
	// InternalCSS.g:7542:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__Group_2__0 )* ) ;
	public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7546:1: ( ( ( rule__Identifier__Group_2__0 )* ) )
			// InternalCSS.g:7547:1: ( ( rule__Identifier__Group_2__0 )* )
			{
				// InternalCSS.g:7547:1: ( ( rule__Identifier__Group_2__0 )* )
				// InternalCSS.g:7548:1: ( rule__Identifier__Group_2__0 )*
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getGroup_2());
					}
					// InternalCSS.g:7549:1: ( rule__Identifier__Group_2__0 )*
					loop83: do {
						int alt83 = 2;
						alt83 = dfa83.predict(input);
						switch (alt83) {
						case 1:
						// InternalCSS.g:7549:2: rule__Identifier__Group_2__0
						{
							pushFollow(FOLLOW_58);
							rule__Identifier__Group_2__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}
							break;

						default:
							break loop83;
						}
					} while (true);

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getGroup_2());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group__2__Impl"


	// $ANTLR start "rule__Identifier__Group_2__0"
	// InternalCSS.g:7565:1: rule__Identifier__Group_2__0 : rule__Identifier__Group_2__0__Impl ;
	public final void rule__Identifier__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7569:1: ( rule__Identifier__Group_2__0__Impl )
			// InternalCSS.g:7570:2: rule__Identifier__Group_2__0__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Identifier__Group_2__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group_2__0"


	// $ANTLR start "rule__Identifier__Group_2__0__Impl"
	// InternalCSS.g:7576:1: rule__Identifier__Group_2__0__Impl : ( ( rule__Identifier__Alternatives_2_0 ) ) ;
	public final void rule__Identifier__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7580:1: ( ( ( rule__Identifier__Alternatives_2_0 ) ) )
			// InternalCSS.g:7581:1: ( ( rule__Identifier__Alternatives_2_0 ) )
			{
				// InternalCSS.g:7581:1: ( ( rule__Identifier__Alternatives_2_0 ) )
				// InternalCSS.g:7582:1: ( rule__Identifier__Alternatives_2_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierAccess().getAlternatives_2_0());
					}
					// InternalCSS.g:7583:1: ( rule__Identifier__Alternatives_2_0 )
					// InternalCSS.g:7583:2: rule__Identifier__Alternatives_2_0
					{
						pushFollow(FOLLOW_2);
						rule__Identifier__Alternatives_2_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierAccess().getAlternatives_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Identifier__Group_2__0__Impl"


	// $ANTLR start "rule__Num__Group__0"
	// InternalCSS.g:7595:1: rule__Num__Group__0 : rule__Num__Group__0__Impl rule__Num__Group__1 ;
	public final void rule__Num__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7599:1: ( rule__Num__Group__0__Impl rule__Num__Group__1 )
			// InternalCSS.g:7600:2: rule__Num__Group__0__Impl rule__Num__Group__1
			{
				pushFollow(FOLLOW_25);
				rule__Num__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Num__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group__0"


	// $ANTLR start "rule__Num__Group__0__Impl"
	// InternalCSS.g:7607:1: rule__Num__Group__0__Impl : ( ( rule__Num__Alternatives_0 )? ) ;
	public final void rule__Num__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7611:1: ( ( ( rule__Num__Alternatives_0 )? ) )
			// InternalCSS.g:7612:1: ( ( rule__Num__Alternatives_0 )? )
			{
				// InternalCSS.g:7612:1: ( ( rule__Num__Alternatives_0 )? )
				// InternalCSS.g:7613:1: ( rule__Num__Alternatives_0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getAlternatives_0());
					}
					// InternalCSS.g:7614:1: ( rule__Num__Alternatives_0 )?
					int alt84 = 2;
					int LA84_0 = input.LA(1);

					if ((LA84_0 == RULE_PLUS || LA84_0 == RULE_DASH)) {
						alt84 = 1;
					}
					switch (alt84) {
					case 1:
					// InternalCSS.g:7614:2: rule__Num__Alternatives_0
					{
						pushFollow(FOLLOW_2);
						rule__Num__Alternatives_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getAlternatives_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group__0__Impl"


	// $ANTLR start "rule__Num__Group__1"
	// InternalCSS.g:7624:1: rule__Num__Group__1 : rule__Num__Group__1__Impl ;
	public final void rule__Num__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7628:1: ( rule__Num__Group__1__Impl )
			// InternalCSS.g:7629:2: rule__Num__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Num__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group__1"


	// $ANTLR start "rule__Num__Group__1__Impl"
	// InternalCSS.g:7635:1: rule__Num__Group__1__Impl : ( ( rule__Num__Alternatives_1 ) ) ;
	public final void rule__Num__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7639:1: ( ( ( rule__Num__Alternatives_1 ) ) )
			// InternalCSS.g:7640:1: ( ( rule__Num__Alternatives_1 ) )
			{
				// InternalCSS.g:7640:1: ( ( rule__Num__Alternatives_1 ) )
				// InternalCSS.g:7641:1: ( rule__Num__Alternatives_1 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getAlternatives_1());
					}
					// InternalCSS.g:7642:1: ( rule__Num__Alternatives_1 )
					// InternalCSS.g:7642:2: rule__Num__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Num__Alternatives_1();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getAlternatives_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group__1__Impl"


	// $ANTLR start "rule__Num__Group_1_0__0"
	// InternalCSS.g:7656:1: rule__Num__Group_1_0__0 : rule__Num__Group_1_0__0__Impl rule__Num__Group_1_0__1 ;
	public final void rule__Num__Group_1_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7660:1: ( rule__Num__Group_1_0__0__Impl rule__Num__Group_1_0__1 )
			// InternalCSS.g:7661:2: rule__Num__Group_1_0__0__Impl rule__Num__Group_1_0__1
			{
				pushFollow(FOLLOW_59);
				rule__Num__Group_1_0__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Num__Group_1_0__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_0__0"


	// $ANTLR start "rule__Num__Group_1_0__0__Impl"
	// InternalCSS.g:7668:1: rule__Num__Group_1_0__0__Impl : ( '.' ) ;
	public final void rule__Num__Group_1_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7672:1: ( ( '.' ) )
			// InternalCSS.g:7673:1: ( '.' )
			{
				// InternalCSS.g:7673:1: ( '.' )
				// InternalCSS.g:7674:1: '.'
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getFullStopKeyword_1_0_0());
					}
					match(input, 39, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getFullStopKeyword_1_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_0__0__Impl"


	// $ANTLR start "rule__Num__Group_1_0__1"
	// InternalCSS.g:7687:1: rule__Num__Group_1_0__1 : rule__Num__Group_1_0__1__Impl ;
	public final void rule__Num__Group_1_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7691:1: ( rule__Num__Group_1_0__1__Impl )
			// InternalCSS.g:7692:2: rule__Num__Group_1_0__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Num__Group_1_0__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_0__1"


	// $ANTLR start "rule__Num__Group_1_0__1__Impl"
	// InternalCSS.g:7698:1: rule__Num__Group_1_0__1__Impl : ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) ;
	public final void rule__Num__Group_1_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7702:1: ( ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) )
			// InternalCSS.g:7703:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
			{
				// InternalCSS.g:7703:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
				// InternalCSS.g:7704:1: ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* )
				{
					// InternalCSS.g:7704:1: ( ( RULE_ONE_INT ) )
					// InternalCSS.g:7705:1: ( RULE_ONE_INT )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1());
						}
						// InternalCSS.g:7706:1: ( RULE_ONE_INT )
						// InternalCSS.g:7706:3: RULE_ONE_INT
						{
							match(input, RULE_ONE_INT, FOLLOW_60);
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1());
						}

					}

					// InternalCSS.g:7709:1: ( ( RULE_ONE_INT )* )
					// InternalCSS.g:7710:1: ( RULE_ONE_INT )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1());
						}
						// InternalCSS.g:7711:1: ( RULE_ONE_INT )*
						loop85: do {
							int alt85 = 2;
							int LA85_0 = input.LA(1);

							if ((LA85_0 == RULE_ONE_INT)) {
								int LA85_2 = input.LA(2);

								if ((synpred136_InternalCSS())) {
									alt85 = 1;
								}


							}


							switch (alt85) {
							case 1:
							// InternalCSS.g:7711:3: RULE_ONE_INT
							{
								match(input, RULE_ONE_INT, FOLLOW_60);
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop85;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1());
						}

					}


				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_0__1__Impl"


	// $ANTLR start "rule__Num__Group_1_1__0"
	// InternalCSS.g:7726:1: rule__Num__Group_1_1__0 : rule__Num__Group_1_1__0__Impl rule__Num__Group_1_1__1 ;
	public final void rule__Num__Group_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7730:1: ( rule__Num__Group_1_1__0__Impl rule__Num__Group_1_1__1 )
			// InternalCSS.g:7731:2: rule__Num__Group_1_1__0__Impl rule__Num__Group_1_1__1
			{
				pushFollow(FOLLOW_41);
				rule__Num__Group_1_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Num__Group_1_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1__0"


	// $ANTLR start "rule__Num__Group_1_1__0__Impl"
	// InternalCSS.g:7738:1: rule__Num__Group_1_1__0__Impl : ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) ;
	public final void rule__Num__Group_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7742:1: ( ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) )
			// InternalCSS.g:7743:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
			{
				// InternalCSS.g:7743:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
				// InternalCSS.g:7744:1: ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* )
				{
					// InternalCSS.g:7744:1: ( ( RULE_ONE_INT ) )
					// InternalCSS.g:7745:1: ( RULE_ONE_INT )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0());
						}
						// InternalCSS.g:7746:1: ( RULE_ONE_INT )
						// InternalCSS.g:7746:3: RULE_ONE_INT
						{
							match(input, RULE_ONE_INT, FOLLOW_60);
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0());
						}

					}

					// InternalCSS.g:7749:1: ( ( RULE_ONE_INT )* )
					// InternalCSS.g:7750:1: ( RULE_ONE_INT )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0());
						}
						// InternalCSS.g:7751:1: ( RULE_ONE_INT )*
						loop86: do {
							int alt86 = 2;
							int LA86_0 = input.LA(1);

							if ((LA86_0 == RULE_ONE_INT)) {
								int LA86_2 = input.LA(2);

								if ((synpred137_InternalCSS())) {
									alt86 = 1;
								}


							}


							switch (alt86) {
							case 1:
							// InternalCSS.g:7751:3: RULE_ONE_INT
							{
								match(input, RULE_ONE_INT, FOLLOW_60);
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop86;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0());
						}

					}


				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1__0__Impl"


	// $ANTLR start "rule__Num__Group_1_1__1"
	// InternalCSS.g:7762:1: rule__Num__Group_1_1__1 : rule__Num__Group_1_1__1__Impl ;
	public final void rule__Num__Group_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7766:1: ( rule__Num__Group_1_1__1__Impl )
			// InternalCSS.g:7767:2: rule__Num__Group_1_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Num__Group_1_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1__1"


	// $ANTLR start "rule__Num__Group_1_1__1__Impl"
	// InternalCSS.g:7773:1: rule__Num__Group_1_1__1__Impl : ( ( rule__Num__Group_1_1_1__0 )? ) ;
	public final void rule__Num__Group_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7777:1: ( ( ( rule__Num__Group_1_1_1__0 )? ) )
			// InternalCSS.g:7778:1: ( ( rule__Num__Group_1_1_1__0 )? )
			{
				// InternalCSS.g:7778:1: ( ( rule__Num__Group_1_1_1__0 )? )
				// InternalCSS.g:7779:1: ( rule__Num__Group_1_1_1__0 )?
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getGroup_1_1_1());
					}
					// InternalCSS.g:7780:1: ( rule__Num__Group_1_1_1__0 )?
					int alt87 = 2;
					int LA87_0 = input.LA(1);

					if ((LA87_0 == 39)) {
						int LA87_1 = input.LA(2);

						if ((LA87_1 == RULE_ONE_INT)) {
							int LA87_3 = input.LA(3);

							if ((synpred138_InternalCSS())) {
								alt87 = 1;
							}
						}
					}
					switch (alt87) {
					case 1:
					// InternalCSS.g:7780:2: rule__Num__Group_1_1_1__0
					{
						pushFollow(FOLLOW_2);
						rule__Num__Group_1_1_1__0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}
						break;

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getGroup_1_1_1());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1__1__Impl"


	// $ANTLR start "rule__Num__Group_1_1_1__0"
	// InternalCSS.g:7794:1: rule__Num__Group_1_1_1__0 : rule__Num__Group_1_1_1__0__Impl rule__Num__Group_1_1_1__1 ;
	public final void rule__Num__Group_1_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7798:1: ( rule__Num__Group_1_1_1__0__Impl rule__Num__Group_1_1_1__1 )
			// InternalCSS.g:7799:2: rule__Num__Group_1_1_1__0__Impl rule__Num__Group_1_1_1__1
			{
				pushFollow(FOLLOW_59);
				rule__Num__Group_1_1_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Num__Group_1_1_1__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1_1__0"


	// $ANTLR start "rule__Num__Group_1_1_1__0__Impl"
	// InternalCSS.g:7806:1: rule__Num__Group_1_1_1__0__Impl : ( ( '.' ) ) ;
	public final void rule__Num__Group_1_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7810:1: ( ( ( '.' ) ) )
			// InternalCSS.g:7811:1: ( ( '.' ) )
			{
				// InternalCSS.g:7811:1: ( ( '.' ) )
				// InternalCSS.g:7812:1: ( '.' )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0());
					}
					// InternalCSS.g:7813:1: ( '.' )
					// InternalCSS.g:7814:2: '.'
					{
						match(input, 39, FOLLOW_2);
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1_1__0__Impl"


	// $ANTLR start "rule__Num__Group_1_1_1__1"
	// InternalCSS.g:7825:1: rule__Num__Group_1_1_1__1 : rule__Num__Group_1_1_1__1__Impl ;
	public final void rule__Num__Group_1_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7829:1: ( rule__Num__Group_1_1_1__1__Impl )
			// InternalCSS.g:7830:2: rule__Num__Group_1_1_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Num__Group_1_1_1__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1_1__1"


	// $ANTLR start "rule__Num__Group_1_1_1__1__Impl"
	// InternalCSS.g:7836:1: rule__Num__Group_1_1_1__1__Impl : ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) ;
	public final void rule__Num__Group_1_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7840:1: ( ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) )
			// InternalCSS.g:7841:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
			{
				// InternalCSS.g:7841:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
				// InternalCSS.g:7842:1: ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* )
				{
					// InternalCSS.g:7842:1: ( ( RULE_ONE_INT ) )
					// InternalCSS.g:7843:1: ( RULE_ONE_INT )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1());
						}
						// InternalCSS.g:7844:1: ( RULE_ONE_INT )
						// InternalCSS.g:7844:3: RULE_ONE_INT
						{
							match(input, RULE_ONE_INT, FOLLOW_60);
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1());
						}

					}

					// InternalCSS.g:7847:1: ( ( RULE_ONE_INT )* )
					// InternalCSS.g:7848:1: ( RULE_ONE_INT )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1());
						}
						// InternalCSS.g:7849:1: ( RULE_ONE_INT )*
						loop88: do {
							int alt88 = 2;
							int LA88_0 = input.LA(1);

							if ((LA88_0 == RULE_ONE_INT)) {
								int LA88_2 = input.LA(2);

								if ((synpred139_InternalCSS())) {
									alt88 = 1;
								}


							}


							switch (alt88) {
							case 1:
							// InternalCSS.g:7849:3: RULE_ONE_INT
							{
								match(input, RULE_ONE_INT, FOLLOW_60);
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop88;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1());
						}

					}


				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Num__Group_1_1_1__1__Impl"


	// $ANTLR start "rule__Hex__Group__0"
	// InternalCSS.g:7864:1: rule__Hex__Group__0 : rule__Hex__Group__0__Impl rule__Hex__Group__1 ;
	public final void rule__Hex__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7868:1: ( rule__Hex__Group__0__Impl rule__Hex__Group__1 )
			// InternalCSS.g:7869:2: rule__Hex__Group__0__Impl rule__Hex__Group__1
			{
				pushFollow(FOLLOW_56);
				rule__Hex__Group__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}
				pushFollow(FOLLOW_2);
				rule__Hex__Group__1();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Hex__Group__0"


	// $ANTLR start "rule__Hex__Group__0__Impl"
	// InternalCSS.g:7876:1: rule__Hex__Group__0__Impl : ( RULE_HASHMARK ) ;
	public final void rule__Hex__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7880:1: ( ( RULE_HASHMARK ) )
			// InternalCSS.g:7881:1: ( RULE_HASHMARK )
			{
				// InternalCSS.g:7881:1: ( RULE_HASHMARK )
				// InternalCSS.g:7882:1: RULE_HASHMARK
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0());
					}
					match(input, RULE_HASHMARK, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Hex__Group__0__Impl"


	// $ANTLR start "rule__Hex__Group__1"
	// InternalCSS.g:7893:1: rule__Hex__Group__1 : rule__Hex__Group__1__Impl ;
	public final void rule__Hex__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7897:1: ( rule__Hex__Group__1__Impl )
			// InternalCSS.g:7898:2: rule__Hex__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Hex__Group__1__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Hex__Group__1"


	// $ANTLR start "rule__Hex__Group__1__Impl"
	// InternalCSS.g:7904:1: rule__Hex__Group__1__Impl : ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) ) ;
	public final void rule__Hex__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7908:1: ( ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) ) )
			// InternalCSS.g:7909:1: ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) )
			{
				// InternalCSS.g:7909:1: ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) )
				// InternalCSS.g:7910:1: ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* )
				{
					// InternalCSS.g:7910:1: ( ( rule__Hex__Group_1__0 ) )
					// InternalCSS.g:7911:1: ( rule__Hex__Group_1__0 )
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getHexAccess().getGroup_1());
						}
						// InternalCSS.g:7912:1: ( rule__Hex__Group_1__0 )
						// InternalCSS.g:7912:2: rule__Hex__Group_1__0
						{
							pushFollow(FOLLOW_61);
							rule__Hex__Group_1__0();

							state._fsp--;
							if (state.failed) {
								return;
							}

						}

						if (state.backtracking == 0) {
							after(grammarAccess.getHexAccess().getGroup_1());
						}

					}

					// InternalCSS.g:7915:1: ( ( rule__Hex__Group_1__0 )* )
					// InternalCSS.g:7916:1: ( rule__Hex__Group_1__0 )*
					{
						if (state.backtracking == 0) {
							before(grammarAccess.getHexAccess().getGroup_1());
						}
						// InternalCSS.g:7917:1: ( rule__Hex__Group_1__0 )*
						loop89: do {
							int alt89 = 2;
							int LA89_0 = input.LA(1);

							if ((LA89_0 == RULE_ONE_HEX_LETTER)) {
								int LA89_2 = input.LA(2);

								if ((synpred140_InternalCSS())) {
									alt89 = 1;
								}


							} else if ((LA89_0 == RULE_ONE_INT)) {
								int LA89_3 = input.LA(2);

								if ((synpred140_InternalCSS())) {
									alt89 = 1;
								}


							}


							switch (alt89) {
							case 1:
							// InternalCSS.g:7917:2: rule__Hex__Group_1__0
							{
								pushFollow(FOLLOW_61);
								rule__Hex__Group_1__0();

								state._fsp--;
								if (state.failed) {
									return;
								}

							}
								break;

							default:
								break loop89;
							}
						} while (true);

						if (state.backtracking == 0) {
							after(grammarAccess.getHexAccess().getGroup_1());
						}

					}


				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Hex__Group__1__Impl"


	// $ANTLR start "rule__Hex__Group_1__0"
	// InternalCSS.g:7932:1: rule__Hex__Group_1__0 : rule__Hex__Group_1__0__Impl ;
	public final void rule__Hex__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7936:1: ( rule__Hex__Group_1__0__Impl )
			// InternalCSS.g:7937:2: rule__Hex__Group_1__0__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Hex__Group_1__0__Impl();

				state._fsp--;
				if (state.failed) {
					return;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Hex__Group_1__0"


	// $ANTLR start "rule__Hex__Group_1__0__Impl"
	// InternalCSS.g:7943:1: rule__Hex__Group_1__0__Impl : ( ( rule__Hex__Alternatives_1_0 ) ) ;
	public final void rule__Hex__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7947:1: ( ( ( rule__Hex__Alternatives_1_0 ) ) )
			// InternalCSS.g:7948:1: ( ( rule__Hex__Alternatives_1_0 ) )
			{
				// InternalCSS.g:7948:1: ( ( rule__Hex__Alternatives_1_0 ) )
				// InternalCSS.g:7949:1: ( rule__Hex__Alternatives_1_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getHexAccess().getAlternatives_1_0());
					}
					// InternalCSS.g:7950:1: ( rule__Hex__Alternatives_1_0 )
					// InternalCSS.g:7950:2: rule__Hex__Alternatives_1_0
					{
						pushFollow(FOLLOW_2);
						rule__Hex__Alternatives_1_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getHexAccess().getAlternatives_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Hex__Group_1__0__Impl"


	// $ANTLR start "rule__Stylesheet__CharsetAssignment_0"
	// InternalCSS.g:7963:1: rule__Stylesheet__CharsetAssignment_0 : ( rulecharset ) ;
	public final void rule__Stylesheet__CharsetAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7967:1: ( ( rulecharset ) )
			// InternalCSS.g:7968:1: ( rulecharset )
			{
				// InternalCSS.g:7968:1: ( rulecharset )
				// InternalCSS.g:7969:1: rulecharset
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0());
					}
					pushFollow(FOLLOW_2);
					rulecharset();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__CharsetAssignment_0"


	// $ANTLR start "rule__Stylesheet__ImportsAssignment_1"
	// InternalCSS.g:7978:1: rule__Stylesheet__ImportsAssignment_1 : ( ruleimportExpression ) ;
	public final void rule__Stylesheet__ImportsAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7982:1: ( ( ruleimportExpression ) )
			// InternalCSS.g:7983:1: ( ruleimportExpression )
			{
				// InternalCSS.g:7983:1: ( ruleimportExpression )
				// InternalCSS.g:7984:1: ruleimportExpression
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleimportExpression();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__ImportsAssignment_1"


	// $ANTLR start "rule__Stylesheet__RulesetAssignment_2_0"
	// InternalCSS.g:7993:1: rule__Stylesheet__RulesetAssignment_2_0 : ( ruleruleset ) ;
	public final void rule__Stylesheet__RulesetAssignment_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:7997:1: ( ( ruleruleset ) )
			// InternalCSS.g:7998:1: ( ruleruleset )
			{
				// InternalCSS.g:7998:1: ( ruleruleset )
				// InternalCSS.g:7999:1: ruleruleset
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleruleset();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__RulesetAssignment_2_0"


	// $ANTLR start "rule__Stylesheet__MediaAssignment_2_1"
	// InternalCSS.g:8008:1: rule__Stylesheet__MediaAssignment_2_1 : ( rulemedia ) ;
	public final void rule__Stylesheet__MediaAssignment_2_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8012:1: ( ( rulemedia ) )
			// InternalCSS.g:8013:1: ( rulemedia )
			{
				// InternalCSS.g:8013:1: ( rulemedia )
				// InternalCSS.g:8014:1: rulemedia
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0());
					}
					pushFollow(FOLLOW_2);
					rulemedia();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__MediaAssignment_2_1"


	// $ANTLR start "rule__Stylesheet__PageAssignment_2_2"
	// InternalCSS.g:8023:1: rule__Stylesheet__PageAssignment_2_2 : ( rulepage ) ;
	public final void rule__Stylesheet__PageAssignment_2_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8027:1: ( ( rulepage ) )
			// InternalCSS.g:8028:1: ( rulepage )
			{
				// InternalCSS.g:8028:1: ( rulepage )
				// InternalCSS.g:8029:1: rulepage
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0());
					}
					pushFollow(FOLLOW_2);
					rulepage();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__PageAssignment_2_2"


	// $ANTLR start "rule__Stylesheet__Font_faceAssignment_2_3"
	// InternalCSS.g:8038:1: rule__Stylesheet__Font_faceAssignment_2_3 : ( rulefont_face ) ;
	public final void rule__Stylesheet__Font_faceAssignment_2_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8042:1: ( ( rulefont_face ) )
			// InternalCSS.g:8043:1: ( rulefont_face )
			{
				// InternalCSS.g:8043:1: ( rulefont_face )
				// InternalCSS.g:8044:1: rulefont_face
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getFont_faceFont_faceParserRuleCall_2_3_0());
					}
					pushFollow(FOLLOW_2);
					rulefont_face();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getFont_faceFont_faceParserRuleCall_2_3_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__Font_faceAssignment_2_3"


	// $ANTLR start "rule__Stylesheet__KeyframesAssignment_2_4"
	// InternalCSS.g:8053:1: rule__Stylesheet__KeyframesAssignment_2_4 : ( rulekeyframes ) ;
	public final void rule__Stylesheet__KeyframesAssignment_2_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8057:1: ( ( rulekeyframes ) )
			// InternalCSS.g:8058:1: ( rulekeyframes )
			{
				// InternalCSS.g:8058:1: ( rulekeyframes )
				// InternalCSS.g:8059:1: rulekeyframes
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStylesheetAccess().getKeyframesKeyframesParserRuleCall_2_4_0());
					}
					pushFollow(FOLLOW_2);
					rulekeyframes();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStylesheetAccess().getKeyframesKeyframesParserRuleCall_2_4_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Stylesheet__KeyframesAssignment_2_4"


	// $ANTLR start "rule__Charset__CharsetAssignment_1"
	// InternalCSS.g:8068:1: rule__Charset__CharsetAssignment_1 : ( RULE_CSSSTRING ) ;
	public final void rule__Charset__CharsetAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8072:1: ( ( RULE_CSSSTRING ) )
			// InternalCSS.g:8073:1: ( RULE_CSSSTRING )
			{
				// InternalCSS.g:8073:1: ( RULE_CSSSTRING )
				// InternalCSS.g:8074:1: RULE_CSSSTRING
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCharsetAccess().getCharsetCSSSTRINGTerminalRuleCall_1_0());
					}
					match(input, RULE_CSSSTRING, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCharsetAccess().getCharsetCSSSTRINGTerminalRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Charset__CharsetAssignment_1"


	// $ANTLR start "rule__ImportExpression__ValueAssignment_1_0"
	// InternalCSS.g:8083:1: rule__ImportExpression__ValueAssignment_1_0 : ( RULE_CSSSTRING ) ;
	public final void rule__ImportExpression__ValueAssignment_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8087:1: ( ( RULE_CSSSTRING ) )
			// InternalCSS.g:8088:1: ( RULE_CSSSTRING )
			{
				// InternalCSS.g:8088:1: ( RULE_CSSSTRING )
				// InternalCSS.g:8089:1: RULE_CSSSTRING
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getValueCSSSTRINGTerminalRuleCall_1_0_0());
					}
					match(input, RULE_CSSSTRING, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getValueCSSSTRINGTerminalRuleCall_1_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__ValueAssignment_1_0"


	// $ANTLR start "rule__ImportExpression__MediaListAssignment_1_1_1"
	// InternalCSS.g:8098:1: rule__ImportExpression__MediaListAssignment_1_1_1 : ( rulemedia_list ) ;
	public final void rule__ImportExpression__MediaListAssignment_1_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8102:1: ( ( rulemedia_list ) )
			// InternalCSS.g:8103:1: ( rulemedia_list )
			{
				// InternalCSS.g:8103:1: ( rulemedia_list )
				// InternalCSS.g:8104:1: rulemedia_list
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_1_0());
					}
					pushFollow(FOLLOW_2);
					rulemedia_list();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ImportExpression__MediaListAssignment_1_1_1"


	// $ANTLR start "rule__Page__PseudoPageAssignment_2"
	// InternalCSS.g:8113:1: rule__Page__PseudoPageAssignment_2 : ( rulepseudo_page ) ;
	public final void rule__Page__PseudoPageAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8117:1: ( ( rulepseudo_page ) )
			// InternalCSS.g:8118:1: ( rulepseudo_page )
			{
				// InternalCSS.g:8118:1: ( rulepseudo_page )
				// InternalCSS.g:8119:1: rulepseudo_page
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0());
					}
					pushFollow(FOLLOW_2);
					rulepseudo_page();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__PseudoPageAssignment_2"


	// $ANTLR start "rule__Page__DeclarationsAssignment_4"
	// InternalCSS.g:8128:1: rule__Page__DeclarationsAssignment_4 : ( rulecss_declaration ) ;
	public final void rule__Page__DeclarationsAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8132:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8133:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8133:1: ( rulecss_declaration )
				// InternalCSS.g:8134:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_4_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_4_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__DeclarationsAssignment_4"


	// $ANTLR start "rule__Page__DeclarationsAssignment_5_1"
	// InternalCSS.g:8143:1: rule__Page__DeclarationsAssignment_5_1 : ( rulecss_declaration ) ;
	public final void rule__Page__DeclarationsAssignment_5_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8147:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8148:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8148:1: ( rulecss_declaration )
				// InternalCSS.g:8149:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_5_1_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_5_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Page__DeclarationsAssignment_5_1"


	// $ANTLR start "rule__Media__MedialistAssignment_1"
	// InternalCSS.g:8158:1: rule__Media__MedialistAssignment_1 : ( rulemedia_list ) ;
	public final void rule__Media__MedialistAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8162:1: ( ( rulemedia_list ) )
			// InternalCSS.g:8163:1: ( rulemedia_list )
			{
				// InternalCSS.g:8163:1: ( rulemedia_list )
				// InternalCSS.g:8164:1: rulemedia_list
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					rulemedia_list();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__MedialistAssignment_1"


	// $ANTLR start "rule__Media__RulesetsAssignment_3"
	// InternalCSS.g:8173:1: rule__Media__RulesetsAssignment_3 : ( ruleruleset ) ;
	public final void rule__Media__RulesetsAssignment_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8177:1: ( ( ruleruleset ) )
			// InternalCSS.g:8178:1: ( ruleruleset )
			{
				// InternalCSS.g:8178:1: ( ruleruleset )
				// InternalCSS.g:8179:1: ruleruleset
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0());
					}
					pushFollow(FOLLOW_2);
					ruleruleset();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Media__RulesetsAssignment_3"


	// $ANTLR start "rule__Font_face__DeclarationsAssignment_3"
	// InternalCSS.g:8188:1: rule__Font_face__DeclarationsAssignment_3 : ( rulecss_declaration ) ;
	public final void rule__Font_face__DeclarationsAssignment_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8192:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8193:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8193:1: ( rulecss_declaration )
				// InternalCSS.g:8194:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getDeclarationsCss_declarationParserRuleCall_3_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getDeclarationsCss_declarationParserRuleCall_3_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__DeclarationsAssignment_3"


	// $ANTLR start "rule__Font_face__DeclarationsAssignment_4_1"
	// InternalCSS.g:8203:1: rule__Font_face__DeclarationsAssignment_4_1 : ( rulecss_declaration ) ;
	public final void rule__Font_face__DeclarationsAssignment_4_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8207:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8208:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8208:1: ( rulecss_declaration )
				// InternalCSS.g:8209:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getFont_faceAccess().getDeclarationsCss_declarationParserRuleCall_4_1_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getFont_faceAccess().getDeclarationsCss_declarationParserRuleCall_4_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Font_face__DeclarationsAssignment_4_1"


	// $ANTLR start "rule__Keyframes__NameAssignment_2"
	// InternalCSS.g:8218:1: rule__Keyframes__NameAssignment_2 : ( ruleIdentifier ) ;
	public final void rule__Keyframes__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8222:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8223:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8223:1: ( ruleIdentifier )
				// InternalCSS.g:8224:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getNameIdentifierParserRuleCall_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getNameIdentifierParserRuleCall_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__NameAssignment_2"


	// $ANTLR start "rule__Keyframes__KeyframeselectorsAssignment_4"
	// InternalCSS.g:8233:1: rule__Keyframes__KeyframeselectorsAssignment_4 : ( rulekeyframe_selector ) ;
	public final void rule__Keyframes__KeyframeselectorsAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8237:1: ( ( rulekeyframe_selector ) )
			// InternalCSS.g:8238:1: ( rulekeyframe_selector )
			{
				// InternalCSS.g:8238:1: ( rulekeyframe_selector )
				// InternalCSS.g:8239:1: rulekeyframe_selector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getKeyframeselectorsKeyframe_selectorParserRuleCall_4_0());
					}
					pushFollow(FOLLOW_2);
					rulekeyframe_selector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getKeyframeselectorsKeyframe_selectorParserRuleCall_4_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__KeyframeselectorsAssignment_4"


	// $ANTLR start "rule__Keyframes__KeyframeselectorsAssignment_5_1"
	// InternalCSS.g:8248:1: rule__Keyframes__KeyframeselectorsAssignment_5_1 : ( rulekeyframe_selector ) ;
	public final void rule__Keyframes__KeyframeselectorsAssignment_5_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8252:1: ( ( rulekeyframe_selector ) )
			// InternalCSS.g:8253:1: ( rulekeyframe_selector )
			{
				// InternalCSS.g:8253:1: ( rulekeyframe_selector )
				// InternalCSS.g:8254:1: rulekeyframe_selector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframesAccess().getKeyframeselectorsKeyframe_selectorParserRuleCall_5_1_0());
					}
					pushFollow(FOLLOW_2);
					rulekeyframe_selector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframesAccess().getKeyframeselectorsKeyframe_selectorParserRuleCall_5_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframes__KeyframeselectorsAssignment_5_1"


	// $ANTLR start "rule__Keyframe_selector__TypeAssignment_0_0"
	// InternalCSS.g:8263:1: rule__Keyframe_selector__TypeAssignment_0_0 : ( ruleIdentifier ) ;
	public final void rule__Keyframe_selector__TypeAssignment_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8267:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8268:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8268:1: ( ruleIdentifier )
				// InternalCSS.g:8269:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getTypeIdentifierParserRuleCall_0_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getTypeIdentifierParserRuleCall_0_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__TypeAssignment_0_0"


	// $ANTLR start "rule__Keyframe_selector__PercentageAssignment_0_1_0"
	// InternalCSS.g:8278:1: rule__Keyframe_selector__PercentageAssignment_0_1_0 : ( ruleNum ) ;
	public final void rule__Keyframe_selector__PercentageAssignment_0_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8282:1: ( ( ruleNum ) )
			// InternalCSS.g:8283:1: ( ruleNum )
			{
				// InternalCSS.g:8283:1: ( ruleNum )
				// InternalCSS.g:8284:1: ruleNum
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getPercentageNumParserRuleCall_0_1_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleNum();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getPercentageNumParserRuleCall_0_1_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__PercentageAssignment_0_1_0"


	// $ANTLR start "rule__Keyframe_selector__DeclarationsAssignment_2"
	// InternalCSS.g:8293:1: rule__Keyframe_selector__DeclarationsAssignment_2 : ( rulecss_declaration ) ;
	public final void rule__Keyframe_selector__DeclarationsAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8297:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8298:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8298:1: ( rulecss_declaration )
				// InternalCSS.g:8299:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getDeclarationsCss_declarationParserRuleCall_2_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getDeclarationsCss_declarationParserRuleCall_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__DeclarationsAssignment_2"


	// $ANTLR start "rule__Keyframe_selector__DeclarationsAssignment_3_1"
	// InternalCSS.g:8308:1: rule__Keyframe_selector__DeclarationsAssignment_3_1 : ( rulecss_declaration ) ;
	public final void rule__Keyframe_selector__DeclarationsAssignment_3_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8312:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8313:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8313:1: ( rulecss_declaration )
				// InternalCSS.g:8314:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getKeyframe_selectorAccess().getDeclarationsCss_declarationParserRuleCall_3_1_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getKeyframe_selectorAccess().getDeclarationsCss_declarationParserRuleCall_3_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Keyframe_selector__DeclarationsAssignment_3_1"


	// $ANTLR start "rule__Ruleset__SelectorsAssignment_0"
	// InternalCSS.g:8323:1: rule__Ruleset__SelectorsAssignment_0 : ( ruleselector ) ;
	public final void rule__Ruleset__SelectorsAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8327:1: ( ( ruleselector ) )
			// InternalCSS.g:8328:1: ( ruleselector )
			{
				// InternalCSS.g:8328:1: ( ruleselector )
				// InternalCSS.g:8329:1: ruleselector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleselector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__SelectorsAssignment_0"


	// $ANTLR start "rule__Ruleset__SelectorsAssignment_1_2"
	// InternalCSS.g:8338:1: rule__Ruleset__SelectorsAssignment_1_2 : ( ruleselector ) ;
	public final void rule__Ruleset__SelectorsAssignment_1_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8342:1: ( ( ruleselector ) )
			// InternalCSS.g:8343:1: ( ruleselector )
			{
				// InternalCSS.g:8343:1: ( ruleselector )
				// InternalCSS.g:8344:1: ruleselector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleselector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__SelectorsAssignment_1_2"


	// $ANTLR start "rule__Ruleset__DeclarationsAssignment_4_0"
	// InternalCSS.g:8353:1: rule__Ruleset__DeclarationsAssignment_4_0 : ( rulecss_declaration ) ;
	public final void rule__Ruleset__DeclarationsAssignment_4_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8357:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8358:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8358:1: ( rulecss_declaration )
				// InternalCSS.g:8359:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__DeclarationsAssignment_4_0"


	// $ANTLR start "rule__Ruleset__DeclarationsAssignment_4_1_1"
	// InternalCSS.g:8368:1: rule__Ruleset__DeclarationsAssignment_4_1_1 : ( rulecss_declaration ) ;
	public final void rule__Ruleset__DeclarationsAssignment_4_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8372:1: ( ( rulecss_declaration ) )
			// InternalCSS.g:8373:1: ( rulecss_declaration )
			{
				// InternalCSS.g:8373:1: ( rulecss_declaration )
				// InternalCSS.g:8374:1: rulecss_declaration
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_1_1_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_declaration();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_1_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Ruleset__DeclarationsAssignment_4_1_1"


	// $ANTLR start "rule__Selector__SimpleselectorsAssignment_0"
	// InternalCSS.g:8383:1: rule__Selector__SimpleselectorsAssignment_0 : ( rulesimple_selector ) ;
	public final void rule__Selector__SimpleselectorsAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8387:1: ( ( rulesimple_selector ) )
			// InternalCSS.g:8388:1: ( rulesimple_selector )
			{
				// InternalCSS.g:8388:1: ( rulesimple_selector )
				// InternalCSS.g:8389:1: rulesimple_selector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0());
					}
					pushFollow(FOLLOW_2);
					rulesimple_selector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__SimpleselectorsAssignment_0"


	// $ANTLR start "rule__Selector__CombinatorAssignment_1_0_0"
	// InternalCSS.g:8398:1: rule__Selector__CombinatorAssignment_1_0_0 : ( rulecombinator ) ;
	public final void rule__Selector__CombinatorAssignment_1_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8402:1: ( ( rulecombinator ) )
			// InternalCSS.g:8403:1: ( rulecombinator )
			{
				// InternalCSS.g:8403:1: ( rulecombinator )
				// InternalCSS.g:8404:1: rulecombinator
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0());
					}
					pushFollow(FOLLOW_2);
					rulecombinator();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__CombinatorAssignment_1_0_0"


	// $ANTLR start "rule__Selector__SelectorAssignment_1_0_2"
	// InternalCSS.g:8413:1: rule__Selector__SelectorAssignment_1_0_2 : ( ruleselector ) ;
	public final void rule__Selector__SelectorAssignment_1_0_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8417:1: ( ( ruleselector ) )
			// InternalCSS.g:8418:1: ( ruleselector )
			{
				// InternalCSS.g:8418:1: ( ruleselector )
				// InternalCSS.g:8419:1: ruleselector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleselector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__SelectorAssignment_1_0_2"


	// $ANTLR start "rule__Selector__CombinatorAssignment_1_1_1_0"
	// InternalCSS.g:8428:1: rule__Selector__CombinatorAssignment_1_1_1_0 : ( rulecombinator ) ;
	public final void rule__Selector__CombinatorAssignment_1_1_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8432:1: ( ( rulecombinator ) )
			// InternalCSS.g:8433:1: ( rulecombinator )
			{
				// InternalCSS.g:8433:1: ( rulecombinator )
				// InternalCSS.g:8434:1: rulecombinator
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0());
					}
					pushFollow(FOLLOW_2);
					rulecombinator();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__CombinatorAssignment_1_1_1_0"


	// $ANTLR start "rule__Selector__SelectorAssignment_1_1_2"
	// InternalCSS.g:8443:1: rule__Selector__SelectorAssignment_1_1_2 : ( ruleselector ) ;
	public final void rule__Selector__SelectorAssignment_1_1_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8447:1: ( ( ruleselector ) )
			// InternalCSS.g:8448:1: ( ruleselector )
			{
				// InternalCSS.g:8448:1: ( ruleselector )
				// InternalCSS.g:8449:1: ruleselector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleselector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Selector__SelectorAssignment_1_1_2"


	// $ANTLR start "rule__SimpleSelectorForNegation__ElementAssignment_0_0_0"
	// InternalCSS.g:8458:1: rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 : ( ruleElementSelector ) ;
	public final void rule__SimpleSelectorForNegation__ElementAssignment_0_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8462:1: ( ( ruleElementSelector ) )
			// InternalCSS.g:8463:1: ( ruleElementSelector )
			{
				// InternalCSS.g:8463:1: ( ruleElementSelector )
				// InternalCSS.g:8464:1: ruleElementSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleElementSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__ElementAssignment_0_0_0"


	// $ANTLR start "rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1"
	// InternalCSS.g:8473:1: rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 : ( ruleUniversalSelector ) ;
	public final void rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8477:1: ( ( ruleUniversalSelector ) )
			// InternalCSS.g:8478:1: ( ruleUniversalSelector )
			{
				// InternalCSS.g:8478:1: ( ruleUniversalSelector )
				// InternalCSS.g:8479:1: ruleUniversalSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleUniversalSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1"


	// $ANTLR start "rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1"
	// InternalCSS.g:8488:1: rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 : ( ruleSubSelectorForNegation ) ;
	public final void rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8492:1: ( ( ruleSubSelectorForNegation ) )
			// InternalCSS.g:8493:1: ( ruleSubSelectorForNegation )
			{
				// InternalCSS.g:8493:1: ( ruleSubSelectorForNegation )
				// InternalCSS.g:8494:1: ruleSubSelectorForNegation
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleSubSelectorForNegation();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1"


	// $ANTLR start "rule__SimpleSelectorForNegation__SubSelectorsAssignment_1"
	// InternalCSS.g:8503:1: rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 : ( ruleSubSelectorForNegation ) ;
	public final void rule__SimpleSelectorForNegation__SubSelectorsAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8507:1: ( ( ruleSubSelectorForNegation ) )
			// InternalCSS.g:8508:1: ( ruleSubSelectorForNegation )
			{
				// InternalCSS.g:8508:1: ( ruleSubSelectorForNegation )
				// InternalCSS.g:8509:1: ruleSubSelectorForNegation
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleSubSelectorForNegation();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SimpleSelectorForNegation__SubSelectorsAssignment_1"


	// $ANTLR start "rule__Simple_selector__ElementAssignment_0_0_0"
	// InternalCSS.g:8518:1: rule__Simple_selector__ElementAssignment_0_0_0 : ( ruleElementSelector ) ;
	public final void rule__Simple_selector__ElementAssignment_0_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8522:1: ( ( ruleElementSelector ) )
			// InternalCSS.g:8523:1: ( ruleElementSelector )
			{
				// InternalCSS.g:8523:1: ( ruleElementSelector )
				// InternalCSS.g:8524:1: ruleElementSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleElementSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__ElementAssignment_0_0_0"


	// $ANTLR start "rule__Simple_selector__UniversalAssignment_0_0_1"
	// InternalCSS.g:8533:1: rule__Simple_selector__UniversalAssignment_0_0_1 : ( ruleUniversalSelector ) ;
	public final void rule__Simple_selector__UniversalAssignment_0_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8537:1: ( ( ruleUniversalSelector ) )
			// InternalCSS.g:8538:1: ( ruleUniversalSelector )
			{
				// InternalCSS.g:8538:1: ( ruleUniversalSelector )
				// InternalCSS.g:8539:1: ruleUniversalSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleUniversalSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__UniversalAssignment_0_0_1"


	// $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_0_1"
	// InternalCSS.g:8548:1: rule__Simple_selector__SubSelectorsAssignment_0_1 : ( ruleSubSelector ) ;
	public final void rule__Simple_selector__SubSelectorsAssignment_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8552:1: ( ( ruleSubSelector ) )
			// InternalCSS.g:8553:1: ( ruleSubSelector )
			{
				// InternalCSS.g:8553:1: ( ruleSubSelector )
				// InternalCSS.g:8554:1: ruleSubSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleSubSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_0_1"


	// $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_1"
	// InternalCSS.g:8563:1: rule__Simple_selector__SubSelectorsAssignment_1 : ( ruleSubSelector ) ;
	public final void rule__Simple_selector__SubSelectorsAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8567:1: ( ( ruleSubSelector ) )
			// InternalCSS.g:8568:1: ( ruleSubSelector )
			{
				// InternalCSS.g:8568:1: ( ruleSubSelector )
				// InternalCSS.g:8569:1: ruleSubSelector
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleSubSelector();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_1"


	// $ANTLR start "rule__AttributeSelector__NameAssignment_2"
	// InternalCSS.g:8578:1: rule__AttributeSelector__NameAssignment_2 : ( ruleIdentifier ) ;
	public final void rule__AttributeSelector__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8582:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8583:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8583:1: ( ruleIdentifier )
				// InternalCSS.g:8584:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__NameAssignment_2"


	// $ANTLR start "rule__AttributeSelector__OpAssignment_3_0"
	// InternalCSS.g:8593:1: rule__AttributeSelector__OpAssignment_3_0 : ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) ) ;
	public final void rule__AttributeSelector__OpAssignment_3_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8597:1: ( ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) ) )
			// InternalCSS.g:8598:1: ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) )
			{
				// InternalCSS.g:8598:1: ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) )
				// InternalCSS.g:8599:1: ( rule__AttributeSelector__OpAlternatives_3_0_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getOpAlternatives_3_0_0());
					}
					// InternalCSS.g:8600:1: ( rule__AttributeSelector__OpAlternatives_3_0_0 )
					// InternalCSS.g:8600:2: rule__AttributeSelector__OpAlternatives_3_0_0
					{
						pushFollow(FOLLOW_2);
						rule__AttributeSelector__OpAlternatives_3_0_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getOpAlternatives_3_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__OpAssignment_3_0"


	// $ANTLR start "rule__AttributeSelector__ValueAssignment_3_1"
	// InternalCSS.g:8609:1: rule__AttributeSelector__ValueAssignment_3_1 : ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) ) ;
	public final void rule__AttributeSelector__ValueAssignment_3_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8613:1: ( ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) ) )
			// InternalCSS.g:8614:1: ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) )
			{
				// InternalCSS.g:8614:1: ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) )
				// InternalCSS.g:8615:1: ( rule__AttributeSelector__ValueAlternatives_3_1_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getAttributeSelectorAccess().getValueAlternatives_3_1_0());
					}
					// InternalCSS.g:8616:1: ( rule__AttributeSelector__ValueAlternatives_3_1_0 )
					// InternalCSS.g:8616:2: rule__AttributeSelector__ValueAlternatives_3_1_0
					{
						pushFollow(FOLLOW_2);
						rule__AttributeSelector__ValueAlternatives_3_1_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getAttributeSelectorAccess().getValueAlternatives_3_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__AttributeSelector__ValueAssignment_3_1"


	// $ANTLR start "rule__ClassSelector__NameAssignment_2"
	// InternalCSS.g:8625:1: rule__ClassSelector__NameAssignment_2 : ( ruleIdentifier ) ;
	public final void rule__ClassSelector__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8629:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8630:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8630:1: ( ruleIdentifier )
				// InternalCSS.g:8631:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassSelector__NameAssignment_2"


	// $ANTLR start "rule__ElementSelector__NameAssignment_1"
	// InternalCSS.g:8640:1: rule__ElementSelector__NameAssignment_1 : ( ruleIdentifier ) ;
	public final void rule__ElementSelector__NameAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8644:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8645:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8645:1: ( ruleIdentifier )
				// InternalCSS.g:8646:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ElementSelector__NameAssignment_1"


	// $ANTLR start "rule__UniversalSelector__NamespaceAssignment_1"
	// InternalCSS.g:8655:1: rule__UniversalSelector__NamespaceAssignment_1 : ( rulecss_namespace_prefix ) ;
	public final void rule__UniversalSelector__NamespaceAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8659:1: ( ( rulecss_namespace_prefix ) )
			// InternalCSS.g:8660:1: ( rulecss_namespace_prefix )
			{
				// InternalCSS.g:8660:1: ( rulecss_namespace_prefix )
				// InternalCSS.g:8661:1: rulecss_namespace_prefix
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUniversalSelectorAccess().getNamespaceCss_namespace_prefixParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_namespace_prefix();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getUniversalSelectorAccess().getNamespaceCss_namespace_prefixParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UniversalSelector__NamespaceAssignment_1"


	// $ANTLR start "rule__IdSelector__NameAssignment_2"
	// InternalCSS.g:8670:1: rule__IdSelector__NameAssignment_2 : ( ruleIdentifier ) ;
	public final void rule__IdSelector__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8674:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8675:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8675:1: ( ruleIdentifier )
				// InternalCSS.g:8676:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdSelector__NameAssignment_2"


	// $ANTLR start "rule__Css_declaration__PropertyAssignment_1"
	// InternalCSS.g:8685:1: rule__Css_declaration__PropertyAssignment_1 : ( rulecss_property ) ;
	public final void rule__Css_declaration__PropertyAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8689:1: ( ( rulecss_property ) )
			// InternalCSS.g:8690:1: ( rulecss_property )
			{
				// InternalCSS.g:8690:1: ( rulecss_property )
				// InternalCSS.g:8691:1: rulecss_property
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					rulecss_property();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__PropertyAssignment_1"


	// $ANTLR start "rule__Css_declaration__ValueTokensAssignment_4"
	// InternalCSS.g:8700:1: rule__Css_declaration__ValueTokensAssignment_4 : ( ruleCssTok ) ;
	public final void rule__Css_declaration__ValueTokensAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8704:1: ( ( ruleCssTok ) )
			// InternalCSS.g:8705:1: ( ruleCssTok )
			{
				// InternalCSS.g:8705:1: ( ruleCssTok )
				// InternalCSS.g:8706:1: ruleCssTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0());
					}
					pushFollow(FOLLOW_2);
					ruleCssTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__ValueTokensAssignment_4"


	// $ANTLR start "rule__Css_declaration__ImportantAssignment_5"
	// InternalCSS.g:8715:1: rule__Css_declaration__ImportantAssignment_5 : ( RULE_IMPORTANT_SYM ) ;
	public final void rule__Css_declaration__ImportantAssignment_5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8719:1: ( ( RULE_IMPORTANT_SYM ) )
			// InternalCSS.g:8720:1: ( RULE_IMPORTANT_SYM )
			{
				// InternalCSS.g:8720:1: ( RULE_IMPORTANT_SYM )
				// InternalCSS.g:8721:1: RULE_IMPORTANT_SYM
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_declarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_5_0());
					}
					match(input, RULE_IMPORTANT_SYM, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_declarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_5_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_declaration__ImportantAssignment_5"


	// $ANTLR start "rule__Css_property__NameAssignment_1"
	// InternalCSS.g:8730:1: rule__Css_property__NameAssignment_1 : ( ruleValidPropertyIdent ) ;
	public final void rule__Css_property__NameAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8734:1: ( ( ruleValidPropertyIdent ) )
			// InternalCSS.g:8735:1: ( ruleValidPropertyIdent )
			{
				// InternalCSS.g:8735:1: ( ruleValidPropertyIdent )
				// InternalCSS.g:8736:1: ruleValidPropertyIdent
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleValidPropertyIdent();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Css_property__NameAssignment_1"


	// $ANTLR start "rule__PseudoClassName__NameAssignment"
	// InternalCSS.g:8745:1: rule__PseudoClassName__NameAssignment : ( ruleIdentifier ) ;
	public final void rule__PseudoClassName__NameAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8749:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8750:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8750:1: ( ruleIdentifier )
				// InternalCSS.g:8751:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassNameAccess().getNameIdentifierParserRuleCall_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassNameAccess().getNameIdentifierParserRuleCall_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassName__NameAssignment"


	// $ANTLR start "rule__PseudoClassFunction__NotAssignment_0_0"
	// InternalCSS.g:8760:1: rule__PseudoClassFunction__NotAssignment_0_0 : ( ruleNotFunctionCall ) ;
	public final void rule__PseudoClassFunction__NotAssignment_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8764:1: ( ( ruleNotFunctionCall ) )
			// InternalCSS.g:8765:1: ( ruleNotFunctionCall )
			{
				// InternalCSS.g:8765:1: ( ruleNotFunctionCall )
				// InternalCSS.g:8766:1: ruleNotFunctionCall
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getNotNotFunctionCallParserRuleCall_0_0_0());
					}
					pushFollow(FOLLOW_2);
					ruleNotFunctionCall();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getNotNotFunctionCallParserRuleCall_0_0_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__NotAssignment_0_0"


	// $ANTLR start "rule__PseudoClassFunction__ParamSelectorAssignment_0_1"
	// InternalCSS.g:8775:1: rule__PseudoClassFunction__ParamSelectorAssignment_0_1 : ( ruleSimpleSelectorForNegation ) ;
	public final void rule__PseudoClassFunction__ParamSelectorAssignment_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8779:1: ( ( ruleSimpleSelectorForNegation ) )
			// InternalCSS.g:8780:1: ( ruleSimpleSelectorForNegation )
			{
				// InternalCSS.g:8780:1: ( ruleSimpleSelectorForNegation )
				// InternalCSS.g:8781:1: ruleSimpleSelectorForNegation
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleSimpleSelectorForNegation();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__ParamSelectorAssignment_0_1"


	// $ANTLR start "rule__PseudoClassFunction__NameAssignment_1_1"
	// InternalCSS.g:8790:1: rule__PseudoClassFunction__NameAssignment_1_1 : ( ruleIdentifier ) ;
	public final void rule__PseudoClassFunction__NameAssignment_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8794:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8795:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8795:1: ( ruleIdentifier )
				// InternalCSS.g:8796:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__NameAssignment_1_1"


	// $ANTLR start "rule__PseudoClassFunction__ParamsAssignment_1_3"
	// InternalCSS.g:8805:1: rule__PseudoClassFunction__ParamsAssignment_1_3 : ( ruleCssTok ) ;
	public final void rule__PseudoClassFunction__ParamsAssignment_1_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8809:1: ( ( ruleCssTok ) )
			// InternalCSS.g:8810:1: ( ruleCssTok )
			{
				// InternalCSS.g:8810:1: ( ruleCssTok )
				// InternalCSS.g:8811:1: ruleCssTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0());
					}
					pushFollow(FOLLOW_2);
					ruleCssTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__PseudoClassFunction__ParamsAssignment_1_3"


	// $ANTLR start "rule__SymbolTok__SymbolAssignment_1"
	// InternalCSS.g:8820:1: rule__SymbolTok__SymbolAssignment_1 : ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) ) ;
	public final void rule__SymbolTok__SymbolAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8824:1: ( ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) ) )
			// InternalCSS.g:8825:1: ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) )
			{
				// InternalCSS.g:8825:1: ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) )
				// InternalCSS.g:8826:1: ( rule__SymbolTok__SymbolAlternatives_1_0 )
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getSymbolTokAccess().getSymbolAlternatives_1_0());
					}
					// InternalCSS.g:8827:1: ( rule__SymbolTok__SymbolAlternatives_1_0 )
					// InternalCSS.g:8827:2: rule__SymbolTok__SymbolAlternatives_1_0
					{
						pushFollow(FOLLOW_2);
						rule__SymbolTok__SymbolAlternatives_1_0();

						state._fsp--;
						if (state.failed) {
							return;
						}

					}

					if (state.backtracking == 0) {
						after(grammarAccess.getSymbolTokAccess().getSymbolAlternatives_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__SymbolTok__SymbolAssignment_1"


	// $ANTLR start "rule__StringTok__ValueAssignment_1"
	// InternalCSS.g:8836:1: rule__StringTok__ValueAssignment_1 : ( RULE_CSSSTRING ) ;
	public final void rule__StringTok__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8840:1: ( ( RULE_CSSSTRING ) )
			// InternalCSS.g:8841:1: ( RULE_CSSSTRING )
			{
				// InternalCSS.g:8841:1: ( RULE_CSSSTRING )
				// InternalCSS.g:8842:1: RULE_CSSSTRING
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getStringTokAccess().getValueCSSSTRINGTerminalRuleCall_1_0());
					}
					match(input, RULE_CSSSTRING, FOLLOW_2);
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getStringTokAccess().getValueCSSSTRINGTerminalRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__StringTok__ValueAssignment_1"


	// $ANTLR start "rule__NumberTok__ValAssignment_1"
	// InternalCSS.g:8851:1: rule__NumberTok__ValAssignment_1 : ( ruleNum ) ;
	public final void rule__NumberTok__ValAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8855:1: ( ( ruleNum ) )
			// InternalCSS.g:8856:1: ( ruleNum )
			{
				// InternalCSS.g:8856:1: ( ruleNum )
				// InternalCSS.g:8857:1: ruleNum
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleNum();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__NumberTok__ValAssignment_1"


	// $ANTLR start "rule__UrlTok__UrlAssignment_1"
	// InternalCSS.g:8866:1: rule__UrlTok__UrlAssignment_1 : ( ruleURLType ) ;
	public final void rule__UrlTok__UrlAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8870:1: ( ( ruleURLType ) )
			// InternalCSS.g:8871:1: ( ruleURLType )
			{
				// InternalCSS.g:8871:1: ( ruleURLType )
				// InternalCSS.g:8872:1: ruleURLType
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleURLType();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UrlTok__UrlAssignment_1"


	// $ANTLR start "rule__ColorTok__ValueAssignment_1"
	// InternalCSS.g:8881:1: rule__ColorTok__ValueAssignment_1 : ( ruleHex ) ;
	public final void rule__ColorTok__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8885:1: ( ( ruleHex ) )
			// InternalCSS.g:8886:1: ( ruleHex )
			{
				// InternalCSS.g:8886:1: ( ruleHex )
				// InternalCSS.g:8887:1: ruleHex
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleHex();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ColorTok__ValueAssignment_1"


	// $ANTLR start "rule__IdentifierOrFuncTok__NameAssignment_1"
	// InternalCSS.g:8896:1: rule__IdentifierOrFuncTok__NameAssignment_1 : ( ruleIdentifier ) ;
	public final void rule__IdentifierOrFuncTok__NameAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8900:1: ( ( ruleIdentifier ) )
			// InternalCSS.g:8901:1: ( ruleIdentifier )
			{
				// InternalCSS.g:8901:1: ( ruleIdentifier )
				// InternalCSS.g:8902:1: ruleIdentifier
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleIdentifier();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__NameAssignment_1"


	// $ANTLR start "rule__IdentifierOrFuncTok__ParamsAssignment_2_2"
	// InternalCSS.g:8911:1: rule__IdentifierOrFuncTok__ParamsAssignment_2_2 : ( ruleCssTok ) ;
	public final void rule__IdentifierOrFuncTok__ParamsAssignment_2_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8915:1: ( ( ruleCssTok ) )
			// InternalCSS.g:8916:1: ( ruleCssTok )
			{
				// InternalCSS.g:8916:1: ( ruleCssTok )
				// InternalCSS.g:8917:1: ruleCssTok
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0());
					}
					pushFollow(FOLLOW_2);
					ruleCssTok();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__IdentifierOrFuncTok__ParamsAssignment_2_2"


	// $ANTLR start "rule__URLType__UrlAssignment_1"
	// InternalCSS.g:8926:1: rule__URLType__UrlAssignment_1 : ( ruleValidURL ) ;
	public final void rule__URLType__UrlAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalCSS.g:8930:1: ( ( ruleValidURL ) )
			// InternalCSS.g:8931:1: ( ruleValidURL )
			{
				// InternalCSS.g:8931:1: ( ruleValidURL )
				// InternalCSS.g:8932:1: ruleValidURL
				{
					if (state.backtracking == 0) {
						before(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0());
					}
					pushFollow(FOLLOW_2);
					ruleValidURL();

					state._fsp--;
					if (state.failed) {
						return;
					}
					if (state.backtracking == 0) {
						after(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0());
					}

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__URLType__UrlAssignment_1"

	// $ANTLR start synpred134_InternalCSS
	public final void synpred134_InternalCSS_fragment() throws RecognitionException {
		// InternalCSS.g:7549:2: ( rule__Identifier__Group_2__0 )
		// InternalCSS.g:7549:2: rule__Identifier__Group_2__0
		{
			pushFollow(FOLLOW_2);
			rule__Identifier__Group_2__0();

			state._fsp--;
			if (state.failed) {
				return;
			}

		}
	}
	// $ANTLR end synpred134_InternalCSS

	// $ANTLR start synpred136_InternalCSS
	public final void synpred136_InternalCSS_fragment() throws RecognitionException {
		// InternalCSS.g:7711:3: ( RULE_ONE_INT )
		// InternalCSS.g:7711:3: RULE_ONE_INT
		{
			match(input, RULE_ONE_INT, FOLLOW_2);
			if (state.failed) {
				return;
			}

		}
	}
	// $ANTLR end synpred136_InternalCSS

	// $ANTLR start synpred137_InternalCSS
	public final void synpred137_InternalCSS_fragment() throws RecognitionException {
		// InternalCSS.g:7751:3: ( RULE_ONE_INT )
		// InternalCSS.g:7751:3: RULE_ONE_INT
		{
			match(input, RULE_ONE_INT, FOLLOW_2);
			if (state.failed) {
				return;
			}

		}
	}
	// $ANTLR end synpred137_InternalCSS

	// $ANTLR start synpred138_InternalCSS
	public final void synpred138_InternalCSS_fragment() throws RecognitionException {
		// InternalCSS.g:7780:2: ( rule__Num__Group_1_1_1__0 )
		// InternalCSS.g:7780:2: rule__Num__Group_1_1_1__0
		{
			pushFollow(FOLLOW_2);
			rule__Num__Group_1_1_1__0();

			state._fsp--;
			if (state.failed) {
				return;
			}

		}
	}
	// $ANTLR end synpred138_InternalCSS

	// $ANTLR start synpred139_InternalCSS
	public final void synpred139_InternalCSS_fragment() throws RecognitionException {
		// InternalCSS.g:7849:3: ( RULE_ONE_INT )
		// InternalCSS.g:7849:3: RULE_ONE_INT
		{
			match(input, RULE_ONE_INT, FOLLOW_2);
			if (state.failed) {
				return;
			}

		}
	}
	// $ANTLR end synpred139_InternalCSS

	// $ANTLR start synpred140_InternalCSS
	public final void synpred140_InternalCSS_fragment() throws RecognitionException {
		// InternalCSS.g:7917:2: ( rule__Hex__Group_1__0 )
		// InternalCSS.g:7917:2: rule__Hex__Group_1__0
		{
			pushFollow(FOLLOW_2);
			rule__Hex__Group_1__0();

			state._fsp--;
			if (state.failed) {
				return;
			}

		}
	}
	// $ANTLR end synpred140_InternalCSS

	// Delegated rules

	public final boolean synpred139_InternalCSS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred139_InternalCSS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred137_InternalCSS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred137_InternalCSS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred134_InternalCSS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred134_InternalCSS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred140_InternalCSS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred140_InternalCSS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred136_InternalCSS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred136_InternalCSS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred138_InternalCSS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred138_InternalCSS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA58 dfa58 = new DFA58(this);
	protected DFA64 dfa64 = new DFA64(this);
	protected DFA83 dfa83 = new DFA83(this);
	static final String dfa_1s = "\24\uffff";
	static final String dfa_2s = "\2\uffff\7\23\1\uffff\11\23\1\uffff";
	static final String dfa_3s = "\1\12\1\13\7\12\1\uffff\11\12\1\uffff";
	static final String dfa_4s = "\1\74\1\64\7\75\1\uffff\11\75\1\uffff";
	static final String dfa_5s = "\11\uffff\1\2\11\uffff\1\1";
	static final String dfa_6s = "\24\uffff}>";
	static final String[] dfa_7s = {
			"\1\1\1\2\2\uffff\1\3\1\4\24\uffff\1\11\14\uffff\1\5\1\6\1\7\1\10\7\uffff\1\11",
			"\1\2\2\uffff\1\3\1\4\41\uffff\1\5\1\6\1\7\1\10",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			"\1\13\1\12\2\23\1\14\1\15\1\16\26\uffff\1\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\7\uffff\1\11\1\23",
			""
	};

	static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
	static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
	static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
	static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
	static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
	static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
	static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

	class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = dfa_1;
			this.eof = dfa_2;
			this.min = dfa_3;
			this.max = dfa_4;
			this.accept = dfa_5;
			this.special = dfa_6;
			this.transition = dfa_7;
		}

		@Override
		public String getDescription() {
			return "1768:1: rule__SimpleSelectorForNegation__Alternatives_0_0 : ( ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) ) );";
		}
	}

	static final String dfa_8s = "\1\12\1\13\7\7\1\uffff\11\7\1\uffff";
	static final String dfa_9s = "\1\74\1\64\7\74\1\uffff\11\74\1\uffff";
	static final String[] dfa_10s = {
			"\1\1\1\2\2\uffff\1\3\1\4\24\uffff\1\11\14\uffff\1\5\1\6\1\7\1\10\7\uffff\1\11",
			"\1\2\2\uffff\1\3\1\4\41\uffff\1\5\1\6\1\7\1\10",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			"\2\23\1\uffff\1\13\1\12\2\23\1\14\1\15\1\16\1\23\23\uffff\3\23\2\uffff\1\23\6\uffff\1\17\1\20\1\21\1\22\5\uffff\1\23\1\uffff\1\11",
			""
	};
	static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
	static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
	static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

	class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = dfa_1;
			this.eof = dfa_2;
			this.min = dfa_8;
			this.max = dfa_9;
			this.accept = dfa_5;
			this.special = dfa_6;
			this.transition = dfa_10;
		}

		@Override
		public String getDescription() {
			return "1853:1: rule__Simple_selector__Alternatives_0_0 : ( ( ( rule__Simple_selector__ElementAssignment_0_0_0 ) ) | ( ( rule__Simple_selector__UniversalAssignment_0_0_1 ) ) );";
		}
	}

	static final String dfa_11s = "\25\uffff";
	static final String dfa_12s = "\5\uffff\20\3";
	static final String dfa_13s = "\1\14\1\12\2\uffff\1\13\20\7";
	static final String dfa_14s = "\1\14\1\77\2\uffff\1\64\20\76";
	static final String dfa_15s = "\2\uffff\1\2\1\1\21\uffff";
	static final String dfa_16s = "\25\uffff}>";
	static final String[] dfa_17s = {
			"\1\1",
			"\1\4\1\5\1\3\1\uffff\1\6\1\7\41\uffff\1\10\1\11\1\12\1\13\12\uffff\1\2",
			"",
			"",
			"\1\5\2\uffff\1\6\1\7\41\uffff\1\10\1\11\1\12\1\13",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2",
			"\2\3\1\uffff\1\15\1\14\2\3\1\16\1\17\1\20\1\3\23\uffff\3\3\2\uffff\1\3\6\uffff\1\21\1\22\1\23\1\24\5\uffff\1\3\3\uffff\1\2"
	};

	static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
	static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
	static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
	static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
	static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
	static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
	static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

	class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = dfa_11;
			this.eof = dfa_12;
			this.min = dfa_13;
			this.max = dfa_14;
			this.accept = dfa_15;
			this.special = dfa_16;
			this.transition = dfa_17;
		}

		@Override
		public String getDescription() {
			return "2009:1: rule__PseudoClassOrFunc__Alternatives : ( ( rulePseudoClass ) | ( rulePseudoClassFunction ) );";
		}
	}

	static final String dfa_18s = "\4\uffff";
	static final String dfa_19s = "\2\10\2\uffff";
	static final String dfa_20s = "\2\72\2\uffff";
	static final String dfa_21s = "\2\uffff\1\2\1\1";
	static final String dfa_22s = "\4\uffff}>";
	static final String[] dfa_23s = {
			"\1\3\10\uffff\1\1\50\uffff\1\2",
			"\1\3\10\uffff\1\1\50\uffff\1\2",
			"",
			""
	};

	static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
	static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
	static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
	static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
	static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
	static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

	class DFA58 extends DFA {

		public DFA58(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 58;
			this.eot = dfa_18;
			this.eof = dfa_18;
			this.min = dfa_19;
			this.max = dfa_20;
			this.accept = dfa_21;
			this.special = dfa_22;
			this.transition = dfa_23;
		}

		@Override
		public String getDescription() {
			return "()* loopback of 4494:1: ( rule__Ruleset__Group_1__0 )*";
		}
	}

	static final String dfa_24s = "\5\uffff";
	static final String dfa_25s = "\1\3\4\uffff";
	static final String dfa_26s = "\1\7\1\uffff\1\7\1\uffff\1\7";
	static final String dfa_27s = "\1\72\1\uffff\1\74\1\uffff\1\74";
	static final String dfa_28s = "\1\uffff\1\1\1\uffff\1\2\1\uffff";
	static final String dfa_29s = "\5\uffff}>";
	static final String[] dfa_30s = {
			"\1\1\1\3\10\uffff\1\2\23\uffff\2\1\23\uffff\1\3",
			"",
			"\1\1\1\3\1\uffff\6\1\1\uffff\1\4\22\uffff\4\1\2\uffff\1\1\6\uffff\4\1\5\uffff\1\3\1\uffff\1\1",
			"",
			"\1\1\1\3\1\uffff\6\1\1\uffff\1\4\22\uffff\4\1\2\uffff\1\1\6\uffff\4\1\5\uffff\1\3\1\uffff\1\1"
	};

	static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
	static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
	static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
	static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
	static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
	static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
	static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

	class DFA64 extends DFA {

		public DFA64(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 64;
			this.eot = dfa_24;
			this.eof = dfa_25;
			this.min = dfa_26;
			this.max = dfa_27;
			this.accept = dfa_28;
			this.special = dfa_29;
			this.transition = dfa_30;
		}

		@Override
		public String getDescription() {
			return "4931:1: ( rule__Selector__Alternatives_1 )?";
		}
	}

	static final String dfa_31s = "\14\uffff";
	static final String dfa_32s = "\1\1\13\uffff";
	static final String dfa_33s = "\1\4\1\uffff\11\0\1\uffff";
	static final String dfa_34s = "\1\100\1\uffff\11\0\1\uffff";
	static final String dfa_35s = "\1\uffff\1\2\11\uffff\1\1";
	static final String dfa_36s = "\2\uffff\1\5\1\4\1\7\1\6\1\10\1\0\1\2\1\1\1\3\1\uffff}>";
	static final String[] dfa_37s = {
			"\6\1\1\2\1\3\2\1\1\4\1\5\1\12\2\1\15\uffff\4\1\1\uffff\3\1\2\uffff\2\1\4\uffff\1\1\1\6\1\7\1\10\1\11\5\uffff\5\1\1\uffff\1\1",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			""
	};

	static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
	static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
	static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
	static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
	static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
	static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
	static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

	class DFA83 extends DFA {

		public DFA83(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 83;
			this.eot = dfa_31;
			this.eof = dfa_32;
			this.min = dfa_33;
			this.max = dfa_34;
			this.accept = dfa_35;
			this.special = dfa_36;
			this.transition = dfa_37;
		}

		@Override
		public String getDescription() {
			return "()* loopback of 7549:1: ( rule__Identifier__Group_2__0 )*";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA83_7 = input.LA(1);


				int index83_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA83_9 = input.LA(1);


				int index83_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_9);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA83_8 = input.LA(1);


				int index83_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_8);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA83_10 = input.LA(1);


				int index83_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_10);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA83_3 = input.LA(1);


				int index83_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA83_2 = input.LA(1);


				int index83_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA83_5 = input.LA(1);


				int index83_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA83_4 = input.LA(1);


				int index83_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 8:
				int LA83_6 = input.LA(1);


				int index83_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred134_InternalCSS())) {
					s = 11;
				}

				else if ((true)) {
					s = 1;
				}


				input.seek(index83_6);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(getDescription(), 83, _s, input);
			error(nvae);
			throw nvae;
		}
	}


	public static final BitSet FOLLOW_1 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_2 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_3 = new BitSet(new long[] { 0x0000048000003002L });
	public static final BitSet FOLLOW_4 = new BitSet(new long[] { 0x03FFFFD80001FF82L });
	public static final BitSet FOLLOW_5 = new BitSet(new long[] { 0x101E0490FFC0FC00L });
	public static final BitSet FOLLOW_6 = new BitSet(new long[] { 0x0000000000C00002L });
	public static final BitSet FOLLOW_7 = new BitSet(new long[] { 0x101E0490FF00FC02L });
	public static final BitSet FOLLOW_8 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_9 = new BitSet(new long[] { 0x0001000000000000L });
	public static final BitSet FOLLOW_10 = new BitSet(new long[] { 0x0000000000000040L, 0x0000000000000001L });
	public static final BitSet FOLLOW_11 = new BitSet(new long[] { 0x001E00000000CC00L });
	public static final BitSet FOLLOW_12 = new BitSet(new long[] { 0x0000000003000000L });
	public static final BitSet FOLLOW_13 = new BitSet(new long[] { 0x0400000000001000L });
	public static final BitSet FOLLOW_14 = new BitSet(new long[] { 0x081F00000002CC00L });
	public static final BitSet FOLLOW_15 = new BitSet(new long[] { 0x0001000000000002L });
	public static final BitSet FOLLOW_16 = new BitSet(new long[] { 0x001E00000002CC00L });
	public static final BitSet FOLLOW_17 = new BitSet(new long[] { 0x0400000000000000L });
	public static final BitSet FOLLOW_18 = new BitSet(new long[] { 0x181E04900000FC00L });
	public static final BitSet FOLLOW_19 = new BitSet(new long[] { 0x101E04900000FC02L });
	public static final BitSet FOLLOW_20 = new BitSet(new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_21 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_22 = new BitSet(new long[] { 0x0000000030000000L });
	public static final BitSet FOLLOW_23 = new BitSet(new long[] { 0x101E0490FF00FC00L });
	public static final BitSet FOLLOW_24 = new BitSet(new long[] { 0x081F00800001CC80L });
	public static final BitSet FOLLOW_25 = new BitSet(new long[] { 0x001E00800001CC80L });
	public static final BitSet FOLLOW_26 = new BitSet(new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_27 = new BitSet(new long[] { 0x0400000000020100L });
	public static final BitSet FOLLOW_28 = new BitSet(new long[] { 0x0000000000020102L });
	public static final BitSet FOLLOW_29 = new BitSet(new long[] { 0x0000000000020002L });
	public static final BitSet FOLLOW_30 = new BitSet(new long[] { 0x081E00000002CC00L });
	public static final BitSet FOLLOW_31 = new BitSet(new long[] { 0x0000000000020100L });
	public static final BitSet FOLLOW_32 = new BitSet(new long[] { 0x101E04900000FC00L });
	public static final BitSet FOLLOW_33 = new BitSet(new long[] { 0x0000006000020080L });
	public static final BitSet FOLLOW_34 = new BitSet(new long[] { 0x101E04900002FC00L });
	public static final BitSet FOLLOW_35 = new BitSet(new long[] { 0x101E04F00000FC80L });
	public static final BitSet FOLLOW_36 = new BitSet(new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_37 = new BitSet(new long[] { 0x0000048000003000L });
	public static final BitSet FOLLOW_38 = new BitSet(new long[] { 0x0000040000000000L });
	public static final BitSet FOLLOW_39 = new BitSet(new long[] { 0x0000080F00000030L });
	public static final BitSet FOLLOW_40 = new BitSet(new long[] { 0x001E00000000CC40L });
	public static final BitSet FOLLOW_41 = new BitSet(new long[] { 0x0000008000000000L });
	public static final BitSet FOLLOW_42 = new BitSet(new long[] { 0x101E00100000CC00L });
	public static final BitSet FOLLOW_43 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_44 = new BitSet(new long[] { 0x0000000000021000L });
	public static final BitSet FOLLOW_45 = new BitSet(new long[] { 0x001E00800003EFC0L, 0x0000000000000001L });
	public static final BitSet FOLLOW_46 = new BitSet(new long[] { 0x0000000000040000L });
	public static final BitSet FOLLOW_47 = new BitSet(new long[] { 0x001E00800003EFC2L, 0x0000000000000001L });
	public static final BitSet FOLLOW_48 = new BitSet(new long[] { 0x001E00000000DC00L });
	public static final BitSet FOLLOW_49 = new BitSet(new long[] { 0x2000000000000000L });
	public static final BitSet FOLLOW_50 = new BitSet(new long[] { 0x4000000000000000L });
	public static final BitSet FOLLOW_51 = new BitSet(new long[] { 0x201E00800003EFC0L, 0x0000000000000001L });
	public static final BitSet FOLLOW_52 = new BitSet(new long[] { 0x8000000000000000L });
	public static final BitSet FOLLOW_53 = new BitSet(new long[] { 0x0000000000000300L });
	public static final BitSet FOLLOW_54 = new BitSet(new long[] { 0x03FFFFD80001FFC0L });
	public static final BitSet FOLLOW_55 = new BitSet(new long[] { 0x001E000000000000L });
	public static final BitSet FOLLOW_56 = new BitSet(new long[] { 0x0000000000014000L });
	public static final BitSet FOLLOW_57 = new BitSet(new long[] { 0x001E00000001CC00L });
	public static final BitSet FOLLOW_58 = new BitSet(new long[] { 0x001E00000001CC02L });
	public static final BitSet FOLLOW_59 = new BitSet(new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_60 = new BitSet(new long[] { 0x0000000000010002L });
	public static final BitSet FOLLOW_61 = new BitSet(new long[] { 0x0000000000014002L });

}