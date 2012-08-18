package com.robotoworks.mechanoid.sqlite.serializer;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SqliteModelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SqliteModelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_2_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SqliteModelGrammarAccess) access;
		match_PrimaryExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_PrimaryExpression_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_PrimaryExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryExpression_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
