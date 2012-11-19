package com.robotoworks.mechanoid.sqlite.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Addition;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.And;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Case;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Division;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Function;
import com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Literal;
import com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Multiplication;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Or;
import com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryComparison;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SecondaryComparison;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Select;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Subtraction;
import com.robotoworks.mechanoid.sqlite.sqliteModel.TableDecl;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SqliteModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SqliteModelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SqliteModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SqliteModelPackage.ACTION_BLOCK:
				if(context == grammarAccess.getActionBlockRule()) {
					sequence_ActionBlock(context, (ActionBlock) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.ACTION_STATEMENT:
				if(context == grammarAccess.getActionStatementRule()) {
					sequence_ActionStatement(context, (ActionStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.ADDITION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0()) {
					sequence_Addition(context, (Addition) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_CLAUSE:
				if(context == grammarAccess.getAlterTableClauseRule()) {
					sequence_AlterTableClause(context, (AlterTableAddColumnClause) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.ALTER_TABLE_RENAME_CLAUSE:
				if(context == grammarAccess.getAlterTableClauseRule()) {
					sequence_AlterTableClause(context, (AlterTableRenameClause) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.ALTER_TABLE_STATEMENT:
				if(context == grammarAccess.getStatmentRule()) {
					sequence_Statment(context, (AlterTableStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CASE:
				if(context == grammarAccess.getCaseRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CASE_EXPRESSION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (CaseExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.COLUMN_DEF:
				if(context == grammarAccess.getColumnDefRule()) {
					sequence_ColumnDef(context, (ColumnDef) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.COLUMN_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (ColumnLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CONFLICT_CLAUSE:
				if(context == grammarAccess.getConflictClauseRule()) {
					sequence_ConflictClause(context, (ConflictClause) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CREATE_TABLE_STATEMENT:
				if(context == grammarAccess.getStatmentRule()) {
					sequence_Statment(context, (CreateTableStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CREATE_VIEW_STATEMENT:
				if(context == grammarAccess.getStatmentRule()) {
					sequence_Statment(context, (CreateViewStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CURRENT_DATE_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (CurrentDateLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CURRENT_TIME_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (CurrentTimeLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CURRENT_TIME_STAMP_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (CurrentTimeStampLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.DATABASE_BLOCK:
				if(context == grammarAccess.getDatabaseBlockRule()) {
					sequence_DatabaseBlock(context, (DatabaseBlock) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.DEFAULT_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (DefaultConstraint) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.DIVISION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0()) {
					sequence_Division(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPRESSION_DEFAULT_VALUE:
				if(context == grammarAccess.getDefaultValueRule()) {
					sequence_DefaultValue(context, (ExpressionDefaultValue) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.FUNCTION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.INDEXED_COLUMN:
				if(context == grammarAccess.getIndexedColumnRule()) {
					sequence_IndexedColumn(context, (IndexedColumn) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.JOIN_SOURCE:
				if(context == grammarAccess.getJoinSourceRule()) {
					sequence_JoinSource(context, (JoinSource) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.JOIN_STATEMENT:
				if(context == grammarAccess.getJoinStatementRule()) {
					sequence_JoinStatement(context, (JoinStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.LITERAL_DEFAULT_VALUE:
				if(context == grammarAccess.getDefaultValueRule()) {
					sequence_DefaultValue(context, (LiteralDefaultValue) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.MIGRATION_BLOCK:
				if(context == grammarAccess.getMigrationBlockRule()) {
					sequence_MigrationBlock(context, (MigrationBlock) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.MULTIPLICATION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0()) {
					sequence_Multiplication(context, (Multiplication) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.NOT_NULL_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (NotNullConstraint) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.NULL_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.NUMERIC_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (NumericLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.OR:
				if(context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.ORDERING_TERM:
				if(context == grammarAccess.getOrderingTermRule()) {
					sequence_OrderingTerm(context, (OrderingTerm) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.PRIMARY_COMPARISON:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0()) {
					sequence_PrimaryComparison(context, (PrimaryComparison) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (PrimaryKeyColumnConstraint) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.RESULT_COLUMN_ALL:
				if(context == grammarAccess.getResultColumnRule()) {
					sequence_ResultColumn(context, (ResultColumnAll) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.RESULT_COLUMN_ALL_WITH_TABLE_REF:
				if(context == grammarAccess.getResultColumnRule()) {
					sequence_ResultColumn(context, (ResultColumnAllWithTableRef) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.RESULT_COLUMN_EXPRESSION:
				if(context == grammarAccess.getResultColumnRule()) {
					sequence_ResultColumn(context, (ResultColumnExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SECONDARY_COMPARISON:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0()) {
					sequence_SecondaryComparison(context, (SecondaryComparison) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SELECT:
				if(context == grammarAccess.getSelectRule() ||
				   context == grammarAccess.getSelectAccess().getSelectLeftAction_1_0()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SELECT_CORE:
				if(context == grammarAccess.getSelectRule() ||
				   context == grammarAccess.getSelectCoreRule() ||
				   context == grammarAccess.getSelectAccess().getSelectLeftAction_1_0()) {
					sequence_SelectCore(context, (SelectCore) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SELECT_STATEMENT:
				if(context == grammarAccess.getSelectStatementRule()) {
					sequence_SelectStatement(context, (SelectStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SELECT_STATEMENT_EXPRESSION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (SelectStatementExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SINGLE_SOURCE_JOIN:
				if(context == grammarAccess.getSingleSourceRule()) {
					sequence_SingleSource(context, (SingleSourceJoin) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT:
				if(context == grammarAccess.getSingleSourceRule()) {
					sequence_SingleSource(context, (SingleSourceSelectStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SINGLE_SOURCE_TABLE:
				if(context == grammarAccess.getSingleSourceRule()) {
					sequence_SingleSource(context, (SingleSourceTable) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SQL_EXPRESSION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_PrimaryExpression_SqlExpression(context, (SqlExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSqlExpressionRule()) {
					sequence_SqlExpression(context, (SqlExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SUBTRACTION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0() ||
				   context == grammarAccess.getSubtractionRule() ||
				   context == grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()) {
					sequence_Subtraction(context, (Subtraction) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.TABLE_DECL:
				if(context == grammarAccess.getTableDeclRule()) {
					sequence_TableDecl(context, (TableDecl) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT:
				if(context == grammarAccess.getTableConstraintRule() ||
				   context == grammarAccess.getUniqueTableContraintRule()) {
					sequence_UniqueTableContraint(context, (UniqueTableContraint) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (actions+=ActionStatement*)
	 */
	protected void sequence_ActionBlock(EObject context, ActionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID path=STRING)
	 */
	protected void sequence_ActionStatement(EObject context, ActionStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionStatementAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionStatementAccess().getPathSTRINGTerminalRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Addition_1_0 right=Subtraction)
	 */
	protected void sequence_Addition(EObject context, Addition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ADDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ADDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ADDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ADDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightSubtractionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     columnDef=ColumnDef
	 */
	protected void sequence_AlterTableClause(EObject context, AlterTableAddColumnClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_CLAUSE__COLUMN_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_CLAUSE__COLUMN_DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlterTableClauseAccess().getColumnDefColumnDefParserRuleCall_1_2_0(), semanticObject.getColumnDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AlterTableClause(EObject context, AlterTableRenameClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_RENAME_CLAUSE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_RENAME_CLAUSE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlterTableClauseAccess().getNameIDTerminalRuleCall_0_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0 right=PrimaryComparison)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightPrimaryComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (whenExpression=SqlExpression thenExpression=SqlExpression)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CASE__WHEN_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CASE__WHEN_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CASE__THEN_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CASE__THEN_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0(), semanticObject.getWhenExpression());
		feeder.accept(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0(), semanticObject.getThenExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     defaultValue=DefaultValue
	 */
	protected void sequence_ColumnConstraint(EObject context, DefaultConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DEFAULT_CONSTRAINT__DEFAULT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DEFAULT_CONSTRAINT__DEFAULT_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_2_2_0(), semanticObject.getDefaultValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (conflictClause=ConflictClause?)
	 */
	protected void sequence_ColumnConstraint(EObject context, NotNullConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((asc?='asc' | desc?='desc')? autoincrement?='autoincrement'?)
	 */
	protected void sequence_ColumnConstraint(EObject context, PrimaryKeyColumnConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ColumnType constraints+=ColumnConstraint*)
	 */
	protected void sequence_ColumnDef(EObject context, ColumnDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     resolution=ConflictResolution
	 */
	protected void sequence_ConflictClause(EObject context, ConflictClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CONFLICT_CLAUSE__RESOLUTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CONFLICT_CLAUSE__RESOLUTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0(), semanticObject.getResolution());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID actions=ActionBlock? migrations+=MigrationBlock*)
	 */
	protected void sequence_DatabaseBlock(EObject context, DatabaseBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_DefaultValue(EObject context, ExpressionDefaultValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPRESSION_DEFAULT_VALUE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPRESSION_DEFAULT_VALUE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=LiteralValue
	 */
	protected void sequence_DefaultValue(EObject context, LiteralDefaultValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.LITERAL_DEFAULT_VALUE__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.LITERAL_DEFAULT_VALUE__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Division_Division_1_0 right=Multiplication)
	 */
	protected void sequence_Division(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionAccess().getRightMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=[ColumnDef|ID] (asc?='asc' | desc?='desc')?)
	 */
	protected void sequence_IndexedColumn(EObject context, IndexedColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=SingleSource joinStatements+=JoinStatement*)
	 */
	protected void sequence_JoinSource(EObject context, JoinSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (natural?='natural'? ((left?='left' outer?='outer'?) | inner?='inner' | cross?='cross')? singleSource=SingleSource expression=SqlExpression)
	 */
	protected void sequence_JoinStatement(EObject context, JoinStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     literal='current_date'
	 */
	protected void sequence_LiteralValue(EObject context, CurrentDateLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CURRENT_DATE_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CURRENT_DATE_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralCurrent_dateKeyword_4_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal='current_time'
	 */
	protected void sequence_LiteralValue(EObject context, CurrentTimeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CURRENT_TIME_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CURRENT_TIME_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralCurrent_timeKeyword_3_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal='current_time_stamp'
	 */
	protected void sequence_LiteralValue(EObject context, CurrentTimeStampLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CURRENT_TIME_STAMP_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CURRENT_TIME_STAMP_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralCurrent_time_stampKeyword_5_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal='null'
	 */
	protected void sequence_LiteralValue(EObject context, NullLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.NULL_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.NULL_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralNullKeyword_2_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     number=SignedNumber
	 */
	protected void sequence_LiteralValue(EObject context, NumericLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.NUMERIC_LITERAL__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.NUMERIC_LITERAL__NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=STRING
	 */
	protected void sequence_LiteralValue(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.STRING_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.STRING_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralSTRINGTerminalRuleCall_1_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((statements+=Statment statements+=Statment*)?)
	 */
	protected void sequence_MigrationBlock(EObject context, MigrationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=FQN database=DatabaseBlock)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.MODEL__PACKAGE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.MODEL__PACKAGE_NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.MODEL__DATABASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.MODEL__DATABASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0(), semanticObject.getPackageName());
		feeder.accept(grammarAccess.getModelAccess().getDatabaseDatabaseBlockParserRuleCall_2_0(), semanticObject.getDatabase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 right=Addition)
	 */
	protected void sequence_Multiplication(EObject context, Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightAdditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SqlExpression (asc?='asc' | desc?='desc')?)
	 */
	protected void sequence_OrderingTerm(EObject context, OrderingTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PrimaryComparison_PrimaryComparison_1_0 op=SecondaryComparisonOp right=SecondaryComparison)
	 */
	protected void sequence_PrimaryComparison(EObject context, PrimaryComparison semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPrimaryComparisonAccess().getOpSecondaryComparisonOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getPrimaryComparisonAccess().getRightSecondaryComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         caseExpression=SqlExpression? 
	 *         cases+=Case 
	 *         cases+=Case* 
	 *         elseExpression=SqlExpression? 
	 *         (isnull?='is null' | isnull?='not null' | isnull?='notnull')?
	 *     )
	 */
	protected void sequence_PrimaryExpression(EObject context, CaseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN (isnull?='is null' | isnull?='not null' | isnull?='notnull')?)
	 */
	protected void sequence_PrimaryExpression(EObject context, ColumnLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (all?='*' | (arguments+=SqlExpression arugments+=SqlExpression*)) (isnull?='is null' | isnull?='not null' | isnull?='notnull')?)
	 */
	protected void sequence_PrimaryExpression(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (literalValue=LiteralValue (isnull?='is null' | isnull?='not null' | isnull?='notnull')?)
	 */
	protected void sequence_PrimaryExpression(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (not?='not'? exists?='exists'? select=SelectStatement (isnull?='is null' | isnull?='not null' | isnull?='notnull')?)
	 */
	protected void sequence_PrimaryExpression(EObject context, SelectStatementExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (root=Or (isnull?='is null' | isnull?='not null' | isnull?='notnull')?)
	 */
	protected void sequence_PrimaryExpression_SqlExpression(EObject context, SqlExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ResultColumnAll}
	 */
	protected void sequence_ResultColumn(EObject context, ResultColumnAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     tableRef=ID
	 */
	protected void sequence_ResultColumn(EObject context, ResultColumnAllWithTableRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResultColumnAccess().getTableRefIDTerminalRuleCall_1_1_0(), semanticObject.getTableRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SqlExpression name=ID?)
	 */
	protected void sequence_ResultColumn(EObject context, ResultColumnExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SecondaryComparison_SecondaryComparison_1_0 op=PrimaryComparisonOp right=Division)
	 */
	protected void sequence_SecondaryComparison(EObject context, SecondaryComparison semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSecondaryComparisonAccess().getOpPrimaryComparisonOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSecondaryComparisonAccess().getRightDivisionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (distinct?='distinct' | all?='all')? 
	 *         resultColumns+=ResultColumn 
	 *         resultColumns+=ResultColumn* 
	 *         source=JoinSource? 
	 *         whereExpression=SqlExpression? 
	 *         (groupByExpressions+=SqlExpression groupByExpressions+=SqlExpression*)?
	 *     )
	 */
	protected void sequence_SelectCore(EObject context, SelectCore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (coreStatements+=SelectCore coreStatements+=SelectCore* (orderingTerms+=OrderingTerm orderingTerms+=OrderingTerm*)?)
	 */
	protected void sequence_SelectStatement(EObject context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Select_Select_1_0 compoundOperator=CompoundOperator right=SelectCore)
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SELECT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SELECT__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SELECT__COMPOUND_OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SELECT__COMPOUND_OPERATOR));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SELECT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SELECT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectAccess().getSelectLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSelectAccess().getCompoundOperatorCompoundOperatorParserRuleCall_1_1_0(), semanticObject.getCompoundOperator());
		feeder.accept(grammarAccess.getSelectAccess().getRightSelectCoreParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     joinSource=JoinSource
	 */
	protected void sequence_SingleSource(EObject context, SingleSourceJoin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_JOIN__JOIN_SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_JOIN__JOIN_SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleSourceAccess().getJoinSourceJoinSourceParserRuleCall_2_2_0(), semanticObject.getJoinSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     selectStatement=SelectStatement
	 */
	protected void sequence_SingleSource(EObject context, SingleSourceSelectStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleSourceAccess().getSelectStatementSelectStatementParserRuleCall_1_2_0(), semanticObject.getSelectStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tableName=ID name=ID?)
	 */
	protected void sequence_SingleSource(EObject context, SingleSourceTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     root=Or
	 */
	protected void sequence_SqlExpression(EObject context, SqlExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID clause=AlterTableClause)
	 */
	protected void sequence_Statment(EObject context, AlterTableStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.STATMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.STATMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_STATEMENT__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_STATEMENT__CLAUSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatmentAccess().getNameIDTerminalRuleCall_1_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStatmentAccess().getClauseAlterTableClauseParserRuleCall_1_4_0(), semanticObject.getClause());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID columnDefs+=ColumnDef columnDefs+=ColumnDef* constraints+=TableConstraint*)
	 */
	protected void sequence_Statment(EObject context, CreateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID selectStatement=SelectStatement)
	 */
	protected void sequence_Statment(EObject context, CreateViewStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.STATMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.STATMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CREATE_VIEW_STATEMENT__SELECT_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CREATE_VIEW_STATEMENT__SELECT_STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatmentAccess().getNameIDTerminalRuleCall_2_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStatmentAccess().getSelectStatementSelectStatementParserRuleCall_2_5_0(), semanticObject.getSelectStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Subtraction_Subtraction_1_0 right=PrimaryExpression)
	 */
	protected void sequence_Subtraction(EObject context, Subtraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SUBTRACTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SUBTRACTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SUBTRACTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SUBTRACTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubtractionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TableDecl(EObject context, TableDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.TABLE_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.TABLE_DECL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTableDeclAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (columns+=IndexedColumn columns+=IndexedColumn* conflictClause=ConflictClause)
	 */
	protected void sequence_UniqueTableContraint(EObject context, UniqueTableContraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
