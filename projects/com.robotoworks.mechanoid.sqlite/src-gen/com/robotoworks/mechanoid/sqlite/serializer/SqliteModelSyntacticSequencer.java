package com.robotoworks.mechanoid.sqlite.serializer;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SqliteModelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SqliteModelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DDLStatement_DeleteKeyword_2_5_0_or_InsertKeyword_2_5_1_or_UpdateKeyword_2_5_2_0;
	protected AbstractElementAlias match_DDLStatement___AfterKeyword_2_4_1_or_BeforeKeyword_2_4_0__q_or___InsteadKeyword_2_4_2_0_OfKeyword_2_4_2_1__;
	protected AbstractElementAlias match_DDLStatement___ForKeyword_2_8_0_EachKeyword_2_8_1_RowKeyword_2_8_2__q;
	protected AbstractElementAlias match_DDLStatement___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q;
	protected AbstractElementAlias match_DDLStatement___IfKeyword_5_3_0_ExistsKeyword_5_3_1__q;
	protected AbstractElementAlias match_DDLStatement___IfKeyword_6_3_0_ExistsKeyword_6_3_1__q;
	protected AbstractElementAlias match_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SqliteModelGrammarAccess) access;
		match_DDLStatement_DeleteKeyword_2_5_0_or_InsertKeyword_2_5_1_or_UpdateKeyword_2_5_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getDeleteKeyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getInsertKeyword_2_5_1()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getUpdateKeyword_2_5_2_0()));
		match_DDLStatement___AfterKeyword_2_4_1_or_BeforeKeyword_2_4_0__q_or___InsteadKeyword_2_4_2_0_OfKeyword_2_4_2_1__ = new AlternativeAlias(false, false, new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getAfterKeyword_2_4_1()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getBeforeKeyword_2_4_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getInsteadKeyword_2_4_2_0()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getOfKeyword_2_4_2_1())));
		match_DDLStatement___ForKeyword_2_8_0_EachKeyword_2_8_1_RowKeyword_2_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getForKeyword_2_8_0()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getEachKeyword_2_8_1()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getRowKeyword_2_8_2()));
		match_DDLStatement___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getIfKeyword_4_3_0()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getExistsKeyword_4_3_1()));
		match_DDLStatement___IfKeyword_5_3_0_ExistsKeyword_5_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getIfKeyword_5_3_0()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getExistsKeyword_5_3_1()));
		match_DDLStatement___IfKeyword_6_3_0_ExistsKeyword_6_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getIfKeyword_6_3_0()), new TokenAlias(false, false, grammarAccess.getDDLStatementAccess().getExistsKeyword_6_3_1()));
		match_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1()));
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
			if(match_DDLStatement_DeleteKeyword_2_5_0_or_InsertKeyword_2_5_1_or_UpdateKeyword_2_5_2_0.equals(syntax))
				emit_DDLStatement_DeleteKeyword_2_5_0_or_InsertKeyword_2_5_1_or_UpdateKeyword_2_5_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DDLStatement___AfterKeyword_2_4_1_or_BeforeKeyword_2_4_0__q_or___InsteadKeyword_2_4_2_0_OfKeyword_2_4_2_1__.equals(syntax))
				emit_DDLStatement___AfterKeyword_2_4_1_or_BeforeKeyword_2_4_0__q_or___InsteadKeyword_2_4_2_0_OfKeyword_2_4_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DDLStatement___ForKeyword_2_8_0_EachKeyword_2_8_1_RowKeyword_2_8_2__q.equals(syntax))
				emit_DDLStatement___ForKeyword_2_8_0_EachKeyword_2_8_1_RowKeyword_2_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DDLStatement___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q.equals(syntax))
				emit_DDLStatement___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DDLStatement___IfKeyword_5_3_0_ExistsKeyword_5_3_1__q.equals(syntax))
				emit_DDLStatement___IfKeyword_5_3_0_ExistsKeyword_5_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DDLStatement___IfKeyword_6_3_0_ExistsKeyword_6_3_1__q.equals(syntax))
				emit_DDLStatement___IfKeyword_6_3_0_ExistsKeyword_6_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1.equals(syntax))
				emit_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'delete' | 'insert' | 'update'
	 */
	protected void emit_DDLStatement_DeleteKeyword_2_5_0_or_InsertKeyword_2_5_1_or_UpdateKeyword_2_5_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('instead' 'of') | ('after' | 'before')?
	 */
	protected void emit_DDLStatement___AfterKeyword_2_4_1_or_BeforeKeyword_2_4_0__q_or___InsteadKeyword_2_4_2_0_OfKeyword_2_4_2_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('for' 'each' 'row')?
	 */
	protected void emit_DDLStatement___ForKeyword_2_8_0_EachKeyword_2_8_1_RowKeyword_2_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('if' 'exists')?
	 */
	protected void emit_DDLStatement___IfKeyword_4_3_0_ExistsKeyword_4_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('if' 'exists')?
	 */
	protected void emit_DDLStatement___IfKeyword_5_3_0_ExistsKeyword_5_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('if' 'exists')?
	 */
	protected void emit_DDLStatement___IfKeyword_6_3_0_ExistsKeyword_6_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'replace' | 'insert'
	 */
	protected void emit_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
