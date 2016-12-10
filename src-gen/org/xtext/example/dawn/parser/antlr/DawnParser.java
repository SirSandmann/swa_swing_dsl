/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.dawn.parser.antlr.internal.InternalDawnParser;
import org.xtext.example.dawn.services.DawnGrammarAccess;

public class DawnParser extends AbstractAntlrParser {

	@Inject
	private DawnGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDawnParser createParser(XtextTokenStream stream) {
		return new InternalDawnParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public DawnGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DawnGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}