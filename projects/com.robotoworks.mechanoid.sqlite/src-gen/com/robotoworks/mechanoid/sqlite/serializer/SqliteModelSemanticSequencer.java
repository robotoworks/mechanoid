package com.robotoworks.mechanoid.sqlite.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ActiveRecordRegistrationStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Case;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CastExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CheckTableConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConfigBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DeleteStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Function;
import com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Literal;
import com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.TableSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateStatement;
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
			case SqliteModelPackage.ACTION_STATEMENT:
				if(context == grammarAccess.getConfigurationStatementRule()) {
					sequence_ConfigurationStatement(context, (ActionStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.ACTIVE_RECORD_REGISTRATION_STATEMENT:
				if(context == grammarAccess.getConfigurationStatementRule()) {
					sequence_ConfigurationStatement(context, (ActiveRecordRegistrationStatement) semanticObject); 
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
				if(context == grammarAccess.getDDLStatementRule()) {
					sequence_DDLStatement(context, (AlterTableStatement) semanticObject); 
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
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (CaseExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CAST_EXPRESSION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (CastExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CHECK_TABLE_CONSTRAINT:
				if(context == grammarAccess.getTableConstraintRule()) {
					sequence_TableConstraint(context, (CheckTableConstraint) semanticObject); 
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
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (ColumnLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CONFIG_BLOCK:
				if(context == grammarAccess.getConfigBlockRule()) {
					sequence_ConfigBlock(context, (ConfigBlock) semanticObject); 
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
				if(context == grammarAccess.getDDLStatementRule()) {
					sequence_DDLStatement(context, (CreateTableStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CREATE_TRIGGER_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule()) {
					sequence_DDLStatement(context, (CreateTriggerStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.CREATE_VIEW_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule()) {
					sequence_DDLStatement(context, (CreateViewStatement) semanticObject); 
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
			case SqliteModelPackage.DELETE_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getDeleteStatementRule()) {
					sequence_DeleteStatement(context, (DeleteStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.DROP_TABLE_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule()) {
					sequence_DDLStatement(context, (DropTableStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.DROP_TRIGGER_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule()) {
					sequence_DDLStatement(context, (DropTriggerStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.DROP_VIEW_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule()) {
					sequence_DDLStatement(context, (DropViewStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_ADD:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0()) {
					sequence_ExprAdd(context, (ExprAdd) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_AND:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0()) {
					sequence_ExprAnd(context, (ExprAnd) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_BIT:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0()) {
					sequence_ExprBit(context, (ExprBit) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_CONCAT:
				if(context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0()) {
					sequence_ExprConcat(context, (ExprConcat) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_EQUAL:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0()) {
					sequence_ExprEqual(context, (ExprEqual) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_MULT:
				if(context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0()) {
					sequence_ExprMult(context, (ExprMult) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_OR:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0()) {
					sequence_ExprOr(context, (ExprOr) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.EXPR_RELATE:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0()) {
					sequence_ExprRelate(context, (ExprRelate) semanticObject); 
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
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
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
			case SqliteModelPackage.INSERT_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getInsertStatementRule()) {
					sequence_InsertStatement(context, (InsertStatement) semanticObject); 
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
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
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
			case SqliteModelPackage.ORDERING_TERM:
				if(context == grammarAccess.getOrderingTermRule()) {
					sequence_OrderingTerm(context, (OrderingTerm) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.PRIMARY_CONTRAINT:
				if(context == grammarAccess.getTableConstraintRule()) {
					sequence_TableConstraint(context, (PrimaryContraint) semanticObject); 
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
			case SqliteModelPackage.RESULT_COLUMN_EXPRESSION:
				if(context == grammarAccess.getResultColumnRule()) {
					sequence_ResultColumn(context, (ResultColumnExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SELECT_CORE:
				if(context == grammarAccess.getSelectCoreRule()) {
					sequence_SelectCore(context, (SelectCore) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SELECT_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getSelectStatementRule()) {
					sequence_SelectStatement(context, (SelectStatement) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.SELECT_STATEMENT_EXPRESSION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
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
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
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
			case SqliteModelPackage.TABLE_SOURCE:
				if(context == grammarAccess.getTableSourceRule()) {
					sequence_TableSource(context, (TableSource) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT:
				if(context == grammarAccess.getTableConstraintRule()) {
					sequence_TableConstraint(context, (UniqueTableContraint) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION:
				if(context == grammarAccess.getUpdateColumnExpressionRule()) {
					sequence_UpdateColumnExpression(context, (UpdateColumnExpression) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.UPDATE_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getUpdateStatementRule()) {
					sequence_UpdateStatement(context, (UpdateStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     (statements+=ConfigurationStatement*)
	 */
	protected void sequence_ConfigBlock(EObject context, ConfigBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID path=STRING)
	 */
	protected void sequence_ConfigurationStatement(EObject context, ActionStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CONFIGURATION_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CONFIGURATION_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_0_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigurationStatementAccess().getPathSTRINGTerminalRuleCall_0_3_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ConfigurationStatement(EObject context, ActiveRecordRegistrationStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CONFIGURATION_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CONFIGURATION_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
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
	 *     (name=ID clause=AlterTableClause)
	 */
	protected void sequence_DDLStatement(EObject context, AlterTableStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_STATEMENT__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_STATEMENT__CLAUSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_3_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDDLStatementAccess().getClauseAlterTableClauseParserRuleCall_3_4_0(), semanticObject.getClause());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID columnDefs+=ColumnDef columnDefs+=ColumnDef* constraints+=TableConstraint*)
	 */
	protected void sequence_DDLStatement(EObject context, CreateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (updateColumnNames+=ID updateColumnNames+=ID*)? 
	 *         tableName=ID 
	 *         whenExpression=SqlExpression? 
	 *         (statements+=DMLStatement statements+=DMLStatement*)?
	 *     )
	 */
	protected void sequence_DDLStatement(EObject context, CreateTriggerStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID selectStatement=SelectStatement)
	 */
	protected void sequence_DDLStatement(EObject context, CreateViewStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CREATE_VIEW_STATEMENT__SELECT_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CREATE_VIEW_STATEMENT__SELECT_STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_1_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDDLStatementAccess().getSelectStatementSelectStatementParserRuleCall_1_5_0(), semanticObject.getSelectStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DDLStatement(EObject context, DropTableStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_4_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DDLStatement(EObject context, DropTriggerStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_5_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DDLStatement(EObject context, DropViewStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.DDL_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_6_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID config=ConfigBlock? migrations+=MigrationBlock*)
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
	 *     (tableName=ID expression=SqlExpression?)
	 */
	protected void sequence_DeleteStatement(EObject context, DeleteStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprAdd_ExprAdd_1_0 (op='+' | op='-') right=ExprBit)
	 */
	protected void sequence_ExprAdd(EObject context, ExprAdd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprAnd_ExprAnd_1_0 op='and' right=ExprOr)
	 */
	protected void sequence_ExprAnd(EObject context, ExprAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_AND__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_AND__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprBit_ExprBit_1_0 (op='<<' | op='>>' | op='&' | op='|') right=ExprRelate)
	 */
	protected void sequence_ExprBit(EObject context, ExprBit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprConcat_ExprConcat_1_0 op='||' right=ExprMult)
	 */
	protected void sequence_ExprConcat(EObject context, ExprConcat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_CONCAT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_CONCAT__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_CONCAT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_CONCAT__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_CONCAT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_CONCAT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=ExprEqual_ExprEqual_1_0 
	 *         (
	 *             op='=' | 
	 *             op='==' | 
	 *             op='!=' | 
	 *             op='<>' | 
	 *             op='is' | 
	 *             op='is not' | 
	 *             op='in' | 
	 *             op='like' | 
	 *             op='glob' | 
	 *             op='match' | 
	 *             op='regexp'
	 *         ) 
	 *         right=ExprAnd
	 *     )
	 */
	protected void sequence_ExprEqual(EObject context, ExprEqual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprMult_ExprMult_1_0 (op='*' | op='/' | op='%') right=ExprAdd)
	 */
	protected void sequence_ExprMult(EObject context, ExprMult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprOr_ExprOr_1_0 op='or' right=PrimaryExpression)
	 */
	protected void sequence_ExprOr(EObject context, ExprOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_OR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_OR__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPR_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPR_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExprOrAccess().getRightPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprRelate_ExprRelate_1_0 (op='<' | op='<=' | op='>' | op='>=') right=ExprEqual)
	 */
	protected void sequence_ExprRelate(EObject context, ExprRelate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (
	 *         conflictResolution=ConflictResolution? 
	 *         tableName=ID 
	 *         (columnNames+=ID columnNames+=ID*)? 
	 *         ((expressions+=SqlExpression expressions+=SqlExpression*) | selectStatement=SelectStatement)?
	 *     )
	 */
	protected void sequence_InsertStatement(EObject context, InsertStatement semanticObject) {
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
	 *     ((statements+=DDLStatement statements+=DDLStatement*)?)
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
	 *     (expression=SqlExpression (asc?='asc' | desc?='desc')?)
	 */
	protected void sequence_OrderingTerm(EObject context, OrderingTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (expression=SqlExpression type=SqliteDataType (isnull?='is null' | isnull?='not null' | isnull?='notnull')?)
	 */
	protected void sequence_PrimaryExpression(EObject context, CastExpression semanticObject) {
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
	 *     (root=ExprConcat (isnull?='is null' | isnull?='not null' | isnull?='notnull')?)
	 */
	protected void sequence_PrimaryExpression_SqlExpression(EObject context, SqlExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (table=[TableSource|ID]?)
	 */
	protected void sequence_ResultColumn(EObject context, ResultColumnAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     source=TableSource
	 */
	protected void sequence_SingleSource(EObject context, SingleSourceTable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_TABLE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_TABLE__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleSourceAccess().getSourceTableSourceParserRuleCall_0_1_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     root=ExprConcat
	 */
	protected void sequence_SqlExpression(EObject context, SqlExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? expression=SqlExpression)
	 */
	protected void sequence_TableConstraint(EObject context, CheckTableConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? columns+=IndexedColumn columns+=IndexedColumn* conflictClause=ConflictClause)
	 */
	protected void sequence_TableConstraint(EObject context, PrimaryContraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? columns+=IndexedColumn columns+=IndexedColumn* conflictClause=ConflictClause)
	 */
	protected void sequence_TableConstraint(EObject context, UniqueTableContraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (table=[CreateTableStatement|ID] tableAlias=ID?)
	 */
	protected void sequence_TableSource(EObject context, TableSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (columnName=ID expression=SqlExpression)
	 */
	protected void sequence_UpdateColumnExpression(EObject context, UpdateColumnExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.UPDATE_COLUMN_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.UPDATE_COLUMN_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateColumnExpressionAccess().getColumnNameIDTerminalRuleCall_0_0(), semanticObject.getColumnName());
		feeder.accept(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         conflictResolution=ConflictResolution? 
	 *         tableName=ID 
	 *         updateColumnExpressions+=UpdateColumnExpression 
	 *         updateColumnExpressions+=UpdateColumnExpression* 
	 *         whereExpression=SqlExpression?
	 *     )
	 */
	protected void sequence_UpdateStatement(EObject context, UpdateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
