package org.eclipse.papyrus.uml.textedit.message.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.papyrus.uml.textedit.message.xtext.services.UmlMessageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlMessageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAMERULE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'.'", "'*'", "'['", "']'"
    };
    public static final int RULE_NAMERULE=5;
    public static final int RULE_ID=7;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalUmlMessageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUmlMessageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUmlMessageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g"; }


     
     	private UmlMessageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(UmlMessageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMessageRule"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:61:1: entryRuleMessageRule : ruleMessageRule EOF ;
    public final void entryRuleMessageRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:62:1: ( ruleMessageRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:63:1: ruleMessageRule EOF
            {
             before(grammarAccess.getMessageRuleRule()); 
            pushFollow(FOLLOW_ruleMessageRule_in_entryRuleMessageRule61);
            ruleMessageRule();

            state._fsp--;

             after(grammarAccess.getMessageRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageRule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageRule"


    // $ANTLR start "ruleMessageRule"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:70:1: ruleMessageRule : ( ( rule__MessageRule__Group__0 ) ) ;
    public final void ruleMessageRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:74:2: ( ( ( rule__MessageRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:75:1: ( ( rule__MessageRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:75:1: ( ( rule__MessageRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:76:1: ( rule__MessageRule__Group__0 )
            {
             before(grammarAccess.getMessageRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:77:1: ( rule__MessageRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:77:2: rule__MessageRule__Group__0
            {
            pushFollow(FOLLOW_rule__MessageRule__Group__0_in_ruleMessageRule94);
            rule__MessageRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageRule"


    // $ANTLR start "entryRuleSequenceTermRule"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:89:1: entryRuleSequenceTermRule : ruleSequenceTermRule EOF ;
    public final void entryRuleSequenceTermRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:90:1: ( ruleSequenceTermRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:91:1: ruleSequenceTermRule EOF
            {
             before(grammarAccess.getSequenceTermRuleRule()); 
            pushFollow(FOLLOW_ruleSequenceTermRule_in_entryRuleSequenceTermRule121);
            ruleSequenceTermRule();

            state._fsp--;

             after(grammarAccess.getSequenceTermRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceTermRule128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceTermRule"


    // $ANTLR start "ruleSequenceTermRule"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:98:1: ruleSequenceTermRule : ( ( rule__SequenceTermRule__Group__0 ) ) ;
    public final void ruleSequenceTermRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:102:2: ( ( ( rule__SequenceTermRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:103:1: ( ( rule__SequenceTermRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:103:1: ( ( rule__SequenceTermRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:104:1: ( rule__SequenceTermRule__Group__0 )
            {
             before(grammarAccess.getSequenceTermRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:105:1: ( rule__SequenceTermRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:105:2: rule__SequenceTermRule__Group__0
            {
            pushFollow(FOLLOW_rule__SequenceTermRule__Group__0_in_ruleSequenceTermRule154);
            rule__SequenceTermRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceTermRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceTermRule"


    // $ANTLR start "entryRuleRecurrenceRule"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:117:1: entryRuleRecurrenceRule : ruleRecurrenceRule EOF ;
    public final void entryRuleRecurrenceRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:118:1: ( ruleRecurrenceRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:119:1: ruleRecurrenceRule EOF
            {
             before(grammarAccess.getRecurrenceRuleRule()); 
            pushFollow(FOLLOW_ruleRecurrenceRule_in_entryRuleRecurrenceRule181);
            ruleRecurrenceRule();

            state._fsp--;

             after(grammarAccess.getRecurrenceRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurrenceRule188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecurrenceRule"


    // $ANTLR start "ruleRecurrenceRule"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:126:1: ruleRecurrenceRule : ( ( rule__RecurrenceRule__Alternatives ) ) ;
    public final void ruleRecurrenceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:130:2: ( ( ( rule__RecurrenceRule__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:131:1: ( ( rule__RecurrenceRule__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:131:1: ( ( rule__RecurrenceRule__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:132:1: ( rule__RecurrenceRule__Alternatives )
            {
             before(grammarAccess.getRecurrenceRuleAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:133:1: ( rule__RecurrenceRule__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:133:2: rule__RecurrenceRule__Alternatives
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Alternatives_in_ruleRecurrenceRule214);
            rule__RecurrenceRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRecurrenceRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecurrenceRule"


    // $ANTLR start "rule__RecurrenceRule__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:145:1: rule__RecurrenceRule__Alternatives : ( ( ( rule__RecurrenceRule__Group_0__0 ) ) | ( ( rule__RecurrenceRule__Group_1__0 ) ) );
    public final void rule__RecurrenceRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:149:1: ( ( ( rule__RecurrenceRule__Group_0__0 ) ) | ( ( rule__RecurrenceRule__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:150:1: ( ( rule__RecurrenceRule__Group_0__0 ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:150:1: ( ( rule__RecurrenceRule__Group_0__0 ) )
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:151:1: ( rule__RecurrenceRule__Group_0__0 )
                    {
                     before(grammarAccess.getRecurrenceRuleAccess().getGroup_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:152:1: ( rule__RecurrenceRule__Group_0__0 )
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:152:2: rule__RecurrenceRule__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__0_in_rule__RecurrenceRule__Alternatives250);
                    rule__RecurrenceRule__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurrenceRuleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:156:6: ( ( rule__RecurrenceRule__Group_1__0 ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:156:6: ( ( rule__RecurrenceRule__Group_1__0 ) )
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:157:1: ( rule__RecurrenceRule__Group_1__0 )
                    {
                     before(grammarAccess.getRecurrenceRuleAccess().getGroup_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:158:1: ( rule__RecurrenceRule__Group_1__0 )
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:158:2: rule__RecurrenceRule__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RecurrenceRule__Group_1__0_in_rule__RecurrenceRule__Alternatives268);
                    rule__RecurrenceRule__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurrenceRuleAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Alternatives"


    // $ANTLR start "rule__MessageRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:169:1: rule__MessageRule__Group__0 : rule__MessageRule__Group__0__Impl rule__MessageRule__Group__1 ;
    public final void rule__MessageRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:173:1: ( rule__MessageRule__Group__0__Impl rule__MessageRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:174:2: rule__MessageRule__Group__0__Impl rule__MessageRule__Group__1
            {
            pushFollow(FOLLOW_rule__MessageRule__Group__0__Impl_in_rule__MessageRule__Group__0299);
            rule__MessageRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageRule__Group__1_in_rule__MessageRule__Group__0302);
            rule__MessageRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__0"


    // $ANTLR start "rule__MessageRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:181:1: rule__MessageRule__Group__0__Impl : ( ( rule__MessageRule__SequenceTermAssignment_0 ) ) ;
    public final void rule__MessageRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:185:1: ( ( ( rule__MessageRule__SequenceTermAssignment_0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:186:1: ( ( rule__MessageRule__SequenceTermAssignment_0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:186:1: ( ( rule__MessageRule__SequenceTermAssignment_0 ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:187:1: ( rule__MessageRule__SequenceTermAssignment_0 )
            {
             before(grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_0()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:188:1: ( rule__MessageRule__SequenceTermAssignment_0 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:188:2: rule__MessageRule__SequenceTermAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageRule__SequenceTermAssignment_0_in_rule__MessageRule__Group__0__Impl329);
            rule__MessageRule__SequenceTermAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__0__Impl"


    // $ANTLR start "rule__MessageRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:198:1: rule__MessageRule__Group__1 : rule__MessageRule__Group__1__Impl rule__MessageRule__Group__2 ;
    public final void rule__MessageRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:202:1: ( rule__MessageRule__Group__1__Impl rule__MessageRule__Group__2 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:203:2: rule__MessageRule__Group__1__Impl rule__MessageRule__Group__2
            {
            pushFollow(FOLLOW_rule__MessageRule__Group__1__Impl_in_rule__MessageRule__Group__1359);
            rule__MessageRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageRule__Group__2_in_rule__MessageRule__Group__1362);
            rule__MessageRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__1"


    // $ANTLR start "rule__MessageRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:210:1: rule__MessageRule__Group__1__Impl : ( ( rule__MessageRule__Group_1__0 )* ) ;
    public final void rule__MessageRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:214:1: ( ( ( rule__MessageRule__Group_1__0 )* ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:215:1: ( ( rule__MessageRule__Group_1__0 )* )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:215:1: ( ( rule__MessageRule__Group_1__0 )* )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:216:1: ( rule__MessageRule__Group_1__0 )*
            {
             before(grammarAccess.getMessageRuleAccess().getGroup_1()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:217:1: ( rule__MessageRule__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:217:2: rule__MessageRule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageRule__Group_1__0_in_rule__MessageRule__Group__1__Impl389);
            	    rule__MessageRule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMessageRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__1__Impl"


    // $ANTLR start "rule__MessageRule__Group__2"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:227:1: rule__MessageRule__Group__2 : rule__MessageRule__Group__2__Impl rule__MessageRule__Group__3 ;
    public final void rule__MessageRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:231:1: ( rule__MessageRule__Group__2__Impl rule__MessageRule__Group__3 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:232:2: rule__MessageRule__Group__2__Impl rule__MessageRule__Group__3
            {
            pushFollow(FOLLOW_rule__MessageRule__Group__2__Impl_in_rule__MessageRule__Group__2420);
            rule__MessageRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageRule__Group__3_in_rule__MessageRule__Group__2423);
            rule__MessageRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__2"


    // $ANTLR start "rule__MessageRule__Group__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:239:1: rule__MessageRule__Group__2__Impl : ( ':' ) ;
    public final void rule__MessageRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:243:1: ( ( ':' ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:244:1: ( ':' )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:244:1: ( ':' )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:245:1: ':'
            {
             before(grammarAccess.getMessageRuleAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__MessageRule__Group__2__Impl451); 
             after(grammarAccess.getMessageRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__2__Impl"


    // $ANTLR start "rule__MessageRule__Group__3"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:258:1: rule__MessageRule__Group__3 : rule__MessageRule__Group__3__Impl ;
    public final void rule__MessageRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:262:1: ( rule__MessageRule__Group__3__Impl )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:263:2: rule__MessageRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageRule__Group__3__Impl_in_rule__MessageRule__Group__3482);
            rule__MessageRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__3"


    // $ANTLR start "rule__MessageRule__Group__3__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:269:1: rule__MessageRule__Group__3__Impl : ( ( rule__MessageRule__NameAssignment_3 ) ) ;
    public final void rule__MessageRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:273:1: ( ( ( rule__MessageRule__NameAssignment_3 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:274:1: ( ( rule__MessageRule__NameAssignment_3 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:274:1: ( ( rule__MessageRule__NameAssignment_3 ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:275:1: ( rule__MessageRule__NameAssignment_3 )
            {
             before(grammarAccess.getMessageRuleAccess().getNameAssignment_3()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:276:1: ( rule__MessageRule__NameAssignment_3 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:276:2: rule__MessageRule__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__MessageRule__NameAssignment_3_in_rule__MessageRule__Group__3__Impl509);
            rule__MessageRule__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageRuleAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group__3__Impl"


    // $ANTLR start "rule__MessageRule__Group_1__0"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:294:1: rule__MessageRule__Group_1__0 : rule__MessageRule__Group_1__0__Impl rule__MessageRule__Group_1__1 ;
    public final void rule__MessageRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:298:1: ( rule__MessageRule__Group_1__0__Impl rule__MessageRule__Group_1__1 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:299:2: rule__MessageRule__Group_1__0__Impl rule__MessageRule__Group_1__1
            {
            pushFollow(FOLLOW_rule__MessageRule__Group_1__0__Impl_in_rule__MessageRule__Group_1__0547);
            rule__MessageRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageRule__Group_1__1_in_rule__MessageRule__Group_1__0550);
            rule__MessageRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group_1__0"


    // $ANTLR start "rule__MessageRule__Group_1__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:306:1: rule__MessageRule__Group_1__0__Impl : ( '.' ) ;
    public final void rule__MessageRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:310:1: ( ( '.' ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:311:1: ( '.' )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:311:1: ( '.' )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:312:1: '.'
            {
             before(grammarAccess.getMessageRuleAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__MessageRule__Group_1__0__Impl578); 
             after(grammarAccess.getMessageRuleAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group_1__0__Impl"


    // $ANTLR start "rule__MessageRule__Group_1__1"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:325:1: rule__MessageRule__Group_1__1 : rule__MessageRule__Group_1__1__Impl ;
    public final void rule__MessageRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:329:1: ( rule__MessageRule__Group_1__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:330:2: rule__MessageRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageRule__Group_1__1__Impl_in_rule__MessageRule__Group_1__1609);
            rule__MessageRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group_1__1"


    // $ANTLR start "rule__MessageRule__Group_1__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:336:1: rule__MessageRule__Group_1__1__Impl : ( ( rule__MessageRule__SequenceTermAssignment_1_1 ) ) ;
    public final void rule__MessageRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:340:1: ( ( ( rule__MessageRule__SequenceTermAssignment_1_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:341:1: ( ( rule__MessageRule__SequenceTermAssignment_1_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:341:1: ( ( rule__MessageRule__SequenceTermAssignment_1_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:342:1: ( rule__MessageRule__SequenceTermAssignment_1_1 )
            {
             before(grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_1_1()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:343:1: ( rule__MessageRule__SequenceTermAssignment_1_1 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:343:2: rule__MessageRule__SequenceTermAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MessageRule__SequenceTermAssignment_1_1_in_rule__MessageRule__Group_1__1__Impl636);
            rule__MessageRule__SequenceTermAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__Group_1__1__Impl"


    // $ANTLR start "rule__SequenceTermRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:357:1: rule__SequenceTermRule__Group__0 : rule__SequenceTermRule__Group__0__Impl rule__SequenceTermRule__Group__1 ;
    public final void rule__SequenceTermRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:361:1: ( rule__SequenceTermRule__Group__0__Impl rule__SequenceTermRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:362:2: rule__SequenceTermRule__Group__0__Impl rule__SequenceTermRule__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceTermRule__Group__0__Impl_in_rule__SequenceTermRule__Group__0670);
            rule__SequenceTermRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceTermRule__Group__1_in_rule__SequenceTermRule__Group__0673);
            rule__SequenceTermRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__Group__0"


    // $ANTLR start "rule__SequenceTermRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:369:1: rule__SequenceTermRule__Group__0__Impl : ( ( rule__SequenceTermRule__SequencialOrderAssignment_0 ) ) ;
    public final void rule__SequenceTermRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:373:1: ( ( ( rule__SequenceTermRule__SequencialOrderAssignment_0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:374:1: ( ( rule__SequenceTermRule__SequencialOrderAssignment_0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:374:1: ( ( rule__SequenceTermRule__SequencialOrderAssignment_0 ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:375:1: ( rule__SequenceTermRule__SequencialOrderAssignment_0 )
            {
             before(grammarAccess.getSequenceTermRuleAccess().getSequencialOrderAssignment_0()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:376:1: ( rule__SequenceTermRule__SequencialOrderAssignment_0 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:376:2: rule__SequenceTermRule__SequencialOrderAssignment_0
            {
            pushFollow(FOLLOW_rule__SequenceTermRule__SequencialOrderAssignment_0_in_rule__SequenceTermRule__Group__0__Impl700);
            rule__SequenceTermRule__SequencialOrderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceTermRuleAccess().getSequencialOrderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__Group__0__Impl"


    // $ANTLR start "rule__SequenceTermRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:386:1: rule__SequenceTermRule__Group__1 : rule__SequenceTermRule__Group__1__Impl rule__SequenceTermRule__Group__2 ;
    public final void rule__SequenceTermRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:390:1: ( rule__SequenceTermRule__Group__1__Impl rule__SequenceTermRule__Group__2 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:391:2: rule__SequenceTermRule__Group__1__Impl rule__SequenceTermRule__Group__2
            {
            pushFollow(FOLLOW_rule__SequenceTermRule__Group__1__Impl_in_rule__SequenceTermRule__Group__1730);
            rule__SequenceTermRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceTermRule__Group__2_in_rule__SequenceTermRule__Group__1733);
            rule__SequenceTermRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__Group__1"


    // $ANTLR start "rule__SequenceTermRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:398:1: rule__SequenceTermRule__Group__1__Impl : ( ( rule__SequenceTermRule__SequenceNameAssignment_1 )? ) ;
    public final void rule__SequenceTermRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:402:1: ( ( ( rule__SequenceTermRule__SequenceNameAssignment_1 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:403:1: ( ( rule__SequenceTermRule__SequenceNameAssignment_1 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:403:1: ( ( rule__SequenceTermRule__SequenceNameAssignment_1 )? )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:404:1: ( rule__SequenceTermRule__SequenceNameAssignment_1 )?
            {
             before(grammarAccess.getSequenceTermRuleAccess().getSequenceNameAssignment_1()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:405:1: ( rule__SequenceTermRule__SequenceNameAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:405:2: rule__SequenceTermRule__SequenceNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SequenceTermRule__SequenceNameAssignment_1_in_rule__SequenceTermRule__Group__1__Impl760);
                    rule__SequenceTermRule__SequenceNameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceTermRuleAccess().getSequenceNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__Group__1__Impl"


    // $ANTLR start "rule__SequenceTermRule__Group__2"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:415:1: rule__SequenceTermRule__Group__2 : rule__SequenceTermRule__Group__2__Impl ;
    public final void rule__SequenceTermRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:419:1: ( rule__SequenceTermRule__Group__2__Impl )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:420:2: rule__SequenceTermRule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SequenceTermRule__Group__2__Impl_in_rule__SequenceTermRule__Group__2791);
            rule__SequenceTermRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__Group__2"


    // $ANTLR start "rule__SequenceTermRule__Group__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:426:1: rule__SequenceTermRule__Group__2__Impl : ( ( rule__SequenceTermRule__RecurrenceAssignment_2 )? ) ;
    public final void rule__SequenceTermRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:430:1: ( ( ( rule__SequenceTermRule__RecurrenceAssignment_2 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:431:1: ( ( rule__SequenceTermRule__RecurrenceAssignment_2 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:431:1: ( ( rule__SequenceTermRule__RecurrenceAssignment_2 )? )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:432:1: ( rule__SequenceTermRule__RecurrenceAssignment_2 )?
            {
             before(grammarAccess.getSequenceTermRuleAccess().getRecurrenceAssignment_2()); 
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:433:1: ( rule__SequenceTermRule__RecurrenceAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:433:2: rule__SequenceTermRule__RecurrenceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SequenceTermRule__RecurrenceAssignment_2_in_rule__SequenceTermRule__Group__2__Impl818);
                    rule__SequenceTermRule__RecurrenceAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceTermRuleAccess().getRecurrenceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__Group__2__Impl"


    // $ANTLR start "rule__RecurrenceRule__Group_0__0"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:449:1: rule__RecurrenceRule__Group_0__0 : rule__RecurrenceRule__Group_0__0__Impl rule__RecurrenceRule__Group_0__1 ;
    public final void rule__RecurrenceRule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:453:1: ( rule__RecurrenceRule__Group_0__0__Impl rule__RecurrenceRule__Group_0__1 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:454:2: rule__RecurrenceRule__Group_0__0__Impl rule__RecurrenceRule__Group_0__1
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__0__Impl_in_rule__RecurrenceRule__Group_0__0855);
            rule__RecurrenceRule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__1_in_rule__RecurrenceRule__Group_0__0858);
            rule__RecurrenceRule__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__0"


    // $ANTLR start "rule__RecurrenceRule__Group_0__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:461:1: rule__RecurrenceRule__Group_0__0__Impl : ( '*' ) ;
    public final void rule__RecurrenceRule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:465:1: ( ( '*' ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:466:1: ( '*' )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:466:1: ( '*' )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:467:1: '*'
            {
             before(grammarAccess.getRecurrenceRuleAccess().getAsteriskKeyword_0_0()); 
            match(input,14,FOLLOW_14_in_rule__RecurrenceRule__Group_0__0__Impl886); 
             after(grammarAccess.getRecurrenceRuleAccess().getAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__0__Impl"


    // $ANTLR start "rule__RecurrenceRule__Group_0__1"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:480:1: rule__RecurrenceRule__Group_0__1 : rule__RecurrenceRule__Group_0__1__Impl rule__RecurrenceRule__Group_0__2 ;
    public final void rule__RecurrenceRule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:484:1: ( rule__RecurrenceRule__Group_0__1__Impl rule__RecurrenceRule__Group_0__2 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:485:2: rule__RecurrenceRule__Group_0__1__Impl rule__RecurrenceRule__Group_0__2
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__1__Impl_in_rule__RecurrenceRule__Group_0__1917);
            rule__RecurrenceRule__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__2_in_rule__RecurrenceRule__Group_0__1920);
            rule__RecurrenceRule__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__1"


    // $ANTLR start "rule__RecurrenceRule__Group_0__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:492:1: rule__RecurrenceRule__Group_0__1__Impl : ( '[' ) ;
    public final void rule__RecurrenceRule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:496:1: ( ( '[' ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:497:1: ( '[' )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:497:1: ( '[' )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:498:1: '['
            {
             before(grammarAccess.getRecurrenceRuleAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,15,FOLLOW_15_in_rule__RecurrenceRule__Group_0__1__Impl948); 
             after(grammarAccess.getRecurrenceRuleAccess().getLeftSquareBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__1__Impl"


    // $ANTLR start "rule__RecurrenceRule__Group_0__2"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:511:1: rule__RecurrenceRule__Group_0__2 : rule__RecurrenceRule__Group_0__2__Impl rule__RecurrenceRule__Group_0__3 ;
    public final void rule__RecurrenceRule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:515:1: ( rule__RecurrenceRule__Group_0__2__Impl rule__RecurrenceRule__Group_0__3 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:516:2: rule__RecurrenceRule__Group_0__2__Impl rule__RecurrenceRule__Group_0__3
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__2__Impl_in_rule__RecurrenceRule__Group_0__2979);
            rule__RecurrenceRule__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__3_in_rule__RecurrenceRule__Group_0__2982);
            rule__RecurrenceRule__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__2"


    // $ANTLR start "rule__RecurrenceRule__Group_0__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:523:1: rule__RecurrenceRule__Group_0__2__Impl : ( RULE_STRING ) ;
    public final void rule__RecurrenceRule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:527:1: ( ( RULE_STRING ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:528:1: ( RULE_STRING )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:528:1: ( RULE_STRING )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:529:1: RULE_STRING
            {
             before(grammarAccess.getRecurrenceRuleAccess().getSTRINGTerminalRuleCall_0_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RecurrenceRule__Group_0__2__Impl1009); 
             after(grammarAccess.getRecurrenceRuleAccess().getSTRINGTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__2__Impl"


    // $ANTLR start "rule__RecurrenceRule__Group_0__3"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:540:1: rule__RecurrenceRule__Group_0__3 : rule__RecurrenceRule__Group_0__3__Impl ;
    public final void rule__RecurrenceRule__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:544:1: ( rule__RecurrenceRule__Group_0__3__Impl )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:545:2: rule__RecurrenceRule__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Group_0__3__Impl_in_rule__RecurrenceRule__Group_0__31038);
            rule__RecurrenceRule__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__3"


    // $ANTLR start "rule__RecurrenceRule__Group_0__3__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:551:1: rule__RecurrenceRule__Group_0__3__Impl : ( ']' ) ;
    public final void rule__RecurrenceRule__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:555:1: ( ( ']' ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:556:1: ( ']' )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:556:1: ( ']' )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:557:1: ']'
            {
             before(grammarAccess.getRecurrenceRuleAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,16,FOLLOW_16_in_rule__RecurrenceRule__Group_0__3__Impl1066); 
             after(grammarAccess.getRecurrenceRuleAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_0__3__Impl"


    // $ANTLR start "rule__RecurrenceRule__Group_1__0"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:578:1: rule__RecurrenceRule__Group_1__0 : rule__RecurrenceRule__Group_1__0__Impl rule__RecurrenceRule__Group_1__1 ;
    public final void rule__RecurrenceRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:582:1: ( rule__RecurrenceRule__Group_1__0__Impl rule__RecurrenceRule__Group_1__1 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:583:2: rule__RecurrenceRule__Group_1__0__Impl rule__RecurrenceRule__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Group_1__0__Impl_in_rule__RecurrenceRule__Group_1__01105);
            rule__RecurrenceRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecurrenceRule__Group_1__1_in_rule__RecurrenceRule__Group_1__01108);
            rule__RecurrenceRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_1__0"


    // $ANTLR start "rule__RecurrenceRule__Group_1__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:590:1: rule__RecurrenceRule__Group_1__0__Impl : ( '[' ) ;
    public final void rule__RecurrenceRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:594:1: ( ( '[' ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:595:1: ( '[' )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:595:1: ( '[' )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:596:1: '['
            {
             before(grammarAccess.getRecurrenceRuleAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__RecurrenceRule__Group_1__0__Impl1136); 
             after(grammarAccess.getRecurrenceRuleAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_1__0__Impl"


    // $ANTLR start "rule__RecurrenceRule__Group_1__1"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:609:1: rule__RecurrenceRule__Group_1__1 : rule__RecurrenceRule__Group_1__1__Impl rule__RecurrenceRule__Group_1__2 ;
    public final void rule__RecurrenceRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:613:1: ( rule__RecurrenceRule__Group_1__1__Impl rule__RecurrenceRule__Group_1__2 )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:614:2: rule__RecurrenceRule__Group_1__1__Impl rule__RecurrenceRule__Group_1__2
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Group_1__1__Impl_in_rule__RecurrenceRule__Group_1__11167);
            rule__RecurrenceRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecurrenceRule__Group_1__2_in_rule__RecurrenceRule__Group_1__11170);
            rule__RecurrenceRule__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_1__1"


    // $ANTLR start "rule__RecurrenceRule__Group_1__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:621:1: rule__RecurrenceRule__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__RecurrenceRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:625:1: ( ( RULE_STRING ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:626:1: ( RULE_STRING )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:626:1: ( RULE_STRING )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:627:1: RULE_STRING
            {
             before(grammarAccess.getRecurrenceRuleAccess().getSTRINGTerminalRuleCall_1_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RecurrenceRule__Group_1__1__Impl1197); 
             after(grammarAccess.getRecurrenceRuleAccess().getSTRINGTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_1__1__Impl"


    // $ANTLR start "rule__RecurrenceRule__Group_1__2"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:638:1: rule__RecurrenceRule__Group_1__2 : rule__RecurrenceRule__Group_1__2__Impl ;
    public final void rule__RecurrenceRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:642:1: ( rule__RecurrenceRule__Group_1__2__Impl )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:643:2: rule__RecurrenceRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__RecurrenceRule__Group_1__2__Impl_in_rule__RecurrenceRule__Group_1__21226);
            rule__RecurrenceRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_1__2"


    // $ANTLR start "rule__RecurrenceRule__Group_1__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:649:1: rule__RecurrenceRule__Group_1__2__Impl : ( ']' ) ;
    public final void rule__RecurrenceRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:653:1: ( ( ']' ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:654:1: ( ']' )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:654:1: ( ']' )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:655:1: ']'
            {
             before(grammarAccess.getRecurrenceRuleAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,16,FOLLOW_16_in_rule__RecurrenceRule__Group_1__2__Impl1254); 
             after(grammarAccess.getRecurrenceRuleAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecurrenceRule__Group_1__2__Impl"


    // $ANTLR start "rule__MessageRule__SequenceTermAssignment_0"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:675:1: rule__MessageRule__SequenceTermAssignment_0 : ( ruleSequenceTermRule ) ;
    public final void rule__MessageRule__SequenceTermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:679:1: ( ( ruleSequenceTermRule ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:680:1: ( ruleSequenceTermRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:680:1: ( ruleSequenceTermRule )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:681:1: ruleSequenceTermRule
            {
             before(grammarAccess.getMessageRuleAccess().getSequenceTermSequenceTermRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSequenceTermRule_in_rule__MessageRule__SequenceTermAssignment_01296);
            ruleSequenceTermRule();

            state._fsp--;

             after(grammarAccess.getMessageRuleAccess().getSequenceTermSequenceTermRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__SequenceTermAssignment_0"


    // $ANTLR start "rule__MessageRule__SequenceTermAssignment_1_1"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:690:1: rule__MessageRule__SequenceTermAssignment_1_1 : ( ruleSequenceTermRule ) ;
    public final void rule__MessageRule__SequenceTermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:694:1: ( ( ruleSequenceTermRule ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:695:1: ( ruleSequenceTermRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:695:1: ( ruleSequenceTermRule )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:696:1: ruleSequenceTermRule
            {
             before(grammarAccess.getMessageRuleAccess().getSequenceTermSequenceTermRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSequenceTermRule_in_rule__MessageRule__SequenceTermAssignment_1_11327);
            ruleSequenceTermRule();

            state._fsp--;

             after(grammarAccess.getMessageRuleAccess().getSequenceTermSequenceTermRuleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__SequenceTermAssignment_1_1"


    // $ANTLR start "rule__MessageRule__NameAssignment_3"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:705:1: rule__MessageRule__NameAssignment_3 : ( RULE_NAMERULE ) ;
    public final void rule__MessageRule__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:709:1: ( ( RULE_NAMERULE ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:710:1: ( RULE_NAMERULE )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:710:1: ( RULE_NAMERULE )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:711:1: RULE_NAMERULE
            {
             before(grammarAccess.getMessageRuleAccess().getNameNameRuleTerminalRuleCall_3_0()); 
            match(input,RULE_NAMERULE,FOLLOW_RULE_NAMERULE_in_rule__MessageRule__NameAssignment_31358); 
             after(grammarAccess.getMessageRuleAccess().getNameNameRuleTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageRule__NameAssignment_3"


    // $ANTLR start "rule__SequenceTermRule__SequencialOrderAssignment_0"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:720:1: rule__SequenceTermRule__SequencialOrderAssignment_0 : ( RULE_INT ) ;
    public final void rule__SequenceTermRule__SequencialOrderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:724:1: ( ( RULE_INT ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:725:1: ( RULE_INT )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:725:1: ( RULE_INT )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:726:1: RULE_INT
            {
             before(grammarAccess.getSequenceTermRuleAccess().getSequencialOrderINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SequenceTermRule__SequencialOrderAssignment_01389); 
             after(grammarAccess.getSequenceTermRuleAccess().getSequencialOrderINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__SequencialOrderAssignment_0"


    // $ANTLR start "rule__SequenceTermRule__SequenceNameAssignment_1"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:735:1: rule__SequenceTermRule__SequenceNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SequenceTermRule__SequenceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:739:1: ( ( RULE_ID ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:740:1: ( RULE_ID )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:740:1: ( RULE_ID )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:741:1: RULE_ID
            {
             before(grammarAccess.getSequenceTermRuleAccess().getSequenceNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SequenceTermRule__SequenceNameAssignment_11420); 
             after(grammarAccess.getSequenceTermRuleAccess().getSequenceNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__SequenceNameAssignment_1"


    // $ANTLR start "rule__SequenceTermRule__RecurrenceAssignment_2"
    // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:750:1: rule__SequenceTermRule__RecurrenceAssignment_2 : ( ruleRecurrenceRule ) ;
    public final void rule__SequenceTermRule__RecurrenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:754:1: ( ( ruleRecurrenceRule ) )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:755:1: ( ruleRecurrenceRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:755:1: ( ruleRecurrenceRule )
            // ../org.eclipse.papyrus.uml.textedit.message.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/message/xtext/ui/contentassist/antlr/internal/InternalUmlMessage.g:756:1: ruleRecurrenceRule
            {
             before(grammarAccess.getSequenceTermRuleAccess().getRecurrenceRecurrenceRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecurrenceRule_in_rule__SequenceTermRule__RecurrenceAssignment_21451);
            ruleRecurrenceRule();

            state._fsp--;

             after(grammarAccess.getSequenceTermRuleAccess().getRecurrenceRecurrenceRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceTermRule__RecurrenceAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMessageRule_in_entryRuleMessageRule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageRule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__0_in_ruleMessageRule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceTermRule_in_entryRuleSequenceTermRule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceTermRule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__Group__0_in_ruleSequenceTermRule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurrenceRule_in_entryRuleRecurrenceRule181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurrenceRule188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Alternatives_in_ruleRecurrenceRule214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__0_in_rule__RecurrenceRule__Alternatives250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_1__0_in_rule__RecurrenceRule__Alternatives268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__0__Impl_in_rule__MessageRule__Group__0299 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__1_in_rule__MessageRule__Group__0302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__SequenceTermAssignment_0_in_rule__MessageRule__Group__0__Impl329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__1__Impl_in_rule__MessageRule__Group__1359 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__2_in_rule__MessageRule__Group__1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group_1__0_in_rule__MessageRule__Group__1__Impl389 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__2__Impl_in_rule__MessageRule__Group__2420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__3_in_rule__MessageRule__Group__2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MessageRule__Group__2__Impl451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group__3__Impl_in_rule__MessageRule__Group__3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__NameAssignment_3_in_rule__MessageRule__Group__3__Impl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group_1__0__Impl_in_rule__MessageRule__Group_1__0547 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MessageRule__Group_1__1_in_rule__MessageRule__Group_1__0550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MessageRule__Group_1__0__Impl578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__Group_1__1__Impl_in_rule__MessageRule__Group_1__1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageRule__SequenceTermAssignment_1_1_in_rule__MessageRule__Group_1__1__Impl636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__Group__0__Impl_in_rule__SequenceTermRule__Group__0670 = new BitSet(new long[]{0x000000000000C080L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__Group__1_in_rule__SequenceTermRule__Group__0673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__SequencialOrderAssignment_0_in_rule__SequenceTermRule__Group__0__Impl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__Group__1__Impl_in_rule__SequenceTermRule__Group__1730 = new BitSet(new long[]{0x000000000000C080L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__Group__2_in_rule__SequenceTermRule__Group__1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__SequenceNameAssignment_1_in_rule__SequenceTermRule__Group__1__Impl760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__Group__2__Impl_in_rule__SequenceTermRule__Group__2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceTermRule__RecurrenceAssignment_2_in_rule__SequenceTermRule__Group__2__Impl818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__0__Impl_in_rule__RecurrenceRule__Group_0__0855 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__1_in_rule__RecurrenceRule__Group_0__0858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RecurrenceRule__Group_0__0__Impl886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__1__Impl_in_rule__RecurrenceRule__Group_0__1917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__2_in_rule__RecurrenceRule__Group_0__1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RecurrenceRule__Group_0__1__Impl948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__2__Impl_in_rule__RecurrenceRule__Group_0__2979 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__3_in_rule__RecurrenceRule__Group_0__2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RecurrenceRule__Group_0__2__Impl1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_0__3__Impl_in_rule__RecurrenceRule__Group_0__31038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RecurrenceRule__Group_0__3__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_1__0__Impl_in_rule__RecurrenceRule__Group_1__01105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_1__1_in_rule__RecurrenceRule__Group_1__01108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RecurrenceRule__Group_1__0__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_1__1__Impl_in_rule__RecurrenceRule__Group_1__11167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_1__2_in_rule__RecurrenceRule__Group_1__11170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RecurrenceRule__Group_1__1__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecurrenceRule__Group_1__2__Impl_in_rule__RecurrenceRule__Group_1__21226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RecurrenceRule__Group_1__2__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceTermRule_in_rule__MessageRule__SequenceTermAssignment_01296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceTermRule_in_rule__MessageRule__SequenceTermAssignment_1_11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMERULE_in_rule__MessageRule__NameAssignment_31358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SequenceTermRule__SequencialOrderAssignment_01389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SequenceTermRule__SequenceNameAssignment_11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurrenceRule_in_rule__SequenceTermRule__RecurrenceAssignment_21451 = new BitSet(new long[]{0x0000000000000002L});

}