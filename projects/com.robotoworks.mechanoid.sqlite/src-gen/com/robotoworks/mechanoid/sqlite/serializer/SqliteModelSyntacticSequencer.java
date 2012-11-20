package com.robotoworks.mechanoid.sqlite.serializer;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SqliteModelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SqliteModelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Statment___IfKeyword_3_3_0_ExistsKeyword_3_3_1__q;
	protected AbstractElementAlias match_Statment___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SqliteModelGrammarAccess) access;
		match_Statment___IfKeyword_3_3_0_ExistsKeyword_3_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatmentAccess().getIfKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getStatmentAccess().getExistsKeyword_3_3_1()));
		match_Statment___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatmentAccess().getIfKeyword_4_3_0()), new TokenAlias(false, false, grammarAccess.getStatmentAccess().getExistsKeyword_4_3_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCompoundOperatorRule())
			return getCompoundOperatorToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * CompoundOperator:
	 * 	'union all' | 'union' | 'intersect' | 'except'
	 * ;
	 */
	protected String getCompoundOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "union all";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Statment___IfKeyword_3_3_0_ExistsKeyword_3_3_1__q.equals(syntax))
				emit_Statment___IfKeyword_3_3_0_ExistsKeyword_3_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Statment___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q.equals(syntax))
				emit_Statment___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('if' 'exists')?
	 */
	protected void emit_Statment___IfKeyword_3_3_0_ExistsKeyword_3_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('if' 'exists')?
	 */
	protected void emit_Statment___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
