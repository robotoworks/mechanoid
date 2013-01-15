package com.robotoworks.mechanoid.net.serializer;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.net.services.NetModelGrammarAccess;
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
public class NetModelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected NetModelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Path___ArbitraryPathSegmentParserRuleCall_3_1_0_SolidusKeyword_3_0__a;
	protected AbstractElementAlias match_Path___SolidusKeyword_3_0_ArbitraryPathSegmentParserRuleCall_3_1_0__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (NetModelGrammarAccess) access;
		match_Path___ArbitraryPathSegmentParserRuleCall_3_1_0_SolidusKeyword_3_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()), new TokenAlias(false, false, grammarAccess.getPathAccess().getSolidusKeyword_3_0()));
		match_Path___SolidusKeyword_3_0_ArbitraryPathSegmentParserRuleCall_3_1_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPathAccess().getSolidusKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArbitraryPathSegmentRule())
			return getArbitraryPathSegmentToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArbitraryPathSegment:
	 * 	QualifiedName ("-" QualifiedName)*
	 * ;
	 */
	protected String getArbitraryPathSegmentToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Path___ArbitraryPathSegmentParserRuleCall_3_1_0_SolidusKeyword_3_0__a.equals(syntax))
				emit_Path___ArbitraryPathSegmentParserRuleCall_3_1_0_SolidusKeyword_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Path___SolidusKeyword_3_0_ArbitraryPathSegmentParserRuleCall_3_1_0__a.equals(syntax))
				emit_Path___SolidusKeyword_3_0_ArbitraryPathSegmentParserRuleCall_3_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (ArbitraryPathSegment '/')*
	 */
	protected void emit_Path___ArbitraryPathSegmentParserRuleCall_3_1_0_SolidusKeyword_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('/' ArbitraryPathSegment)*
	 */
	protected void emit_Path___SolidusKeyword_3_0_ArbitraryPathSegmentParserRuleCall_3_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
