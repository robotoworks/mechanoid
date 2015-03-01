package com.robotoworks.mechanoid.db.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.db.services.SqliteModelGrammarAccess;
import com.robotoworks.mechanoid.db.sqliteModel.ActionStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.db.sqliteModel.Case;
import com.robotoworks.mechanoid.db.sqliteModel.CaseExpression;
import com.robotoworks.mechanoid.db.sqliteModel.CastExpression;
import com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef;
import com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock;
import com.robotoworks.mechanoid.db.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.db.sqliteModel.ContentUri;
import com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment;
import com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment;
import com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.ExprAdd;
import com.robotoworks.mechanoid.db.sqliteModel.ExprAnd;
import com.robotoworks.mechanoid.db.sqliteModel.ExprBit;
import com.robotoworks.mechanoid.db.sqliteModel.ExprConcat;
import com.robotoworks.mechanoid.db.sqliteModel.ExprEqual;
import com.robotoworks.mechanoid.db.sqliteModel.ExprMult;
import com.robotoworks.mechanoid.db.sqliteModel.ExprOr;
import com.robotoworks.mechanoid.db.sqliteModel.ExprRelate;
import com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue;
import com.robotoworks.mechanoid.db.sqliteModel.Function;
import com.robotoworks.mechanoid.db.sqliteModel.FunctionArg;
import com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument;
import com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions;
import com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions;
import com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.db.sqliteModel.InitBlock;
import com.robotoworks.mechanoid.db.sqliteModel.InsertStatement;
import com.robotoworks.mechanoid.db.sqliteModel.IsNull;
import com.robotoworks.mechanoid.db.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.db.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.db.sqliteModel.Literal;
import com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue;
import com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.db.sqliteModel.Model;
import com.robotoworks.mechanoid.db.sqliteModel.NestedExpression;
import com.robotoworks.mechanoid.db.sqliteModel.NewColumn;
import com.robotoworks.mechanoid.db.sqliteModel.NotNull;
import com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression;
import com.robotoworks.mechanoid.db.sqliteModel.NullLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.OldColumn;
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList;
import com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.db.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectList;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.StringLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement;
import com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions;
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
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SqliteModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SqliteModelPackage.ACTION_STATEMENT:
				sequence_ConfigurationStatement(context, (ActionStatement) semanticObject); 
				return; 
			case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT:
				sequence_AlterTableAddColumnStatement(context, (AlterTableAddColumnStatement) semanticObject); 
				return; 
			case SqliteModelPackage.ALTER_TABLE_RENAME_STATEMENT:
				sequence_AlterTableRenameStatement(context, (AlterTableRenameStatement) semanticObject); 
				return; 
			case SqliteModelPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case SqliteModelPackage.CASE_EXPRESSION:
				sequence_PrimaryExpression(context, (CaseExpression) semanticObject); 
				return; 
			case SqliteModelPackage.CAST_EXPRESSION:
				sequence_PrimaryExpression(context, (CastExpression) semanticObject); 
				return; 
			case SqliteModelPackage.CHECK_CONSTRAINT:
				sequence_ColumnConstraint(context, (CheckConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.CHECK_TABLE_CONSTRAINT:
				sequence_CheckTableConstraint(context, (CheckTableConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.COLUMN_DEF:
				sequence_ColumnDef(context, (ColumnDef) semanticObject); 
				return; 
			case SqliteModelPackage.COLUMN_SOURCE_REF:
				sequence_PrimaryExpression(context, (ColumnSourceRef) semanticObject); 
				return; 
			case SqliteModelPackage.CONFIG_BLOCK:
				sequence_ConfigBlock(context, (ConfigBlock) semanticObject); 
				return; 
			case SqliteModelPackage.CONFLICT_CLAUSE:
				sequence_ConflictClause(context, (ConflictClause) semanticObject); 
				return; 
			case SqliteModelPackage.CONTENT_URI:
				sequence_ContentUri(context, (ContentUri) semanticObject); 
				return; 
			case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT:
				sequence_ContentUriSegment(context, (ContentUriParamSegment) semanticObject); 
				return; 
			case SqliteModelPackage.CONTENT_URI_SEGMENT:
				sequence_ContentUriSegment(context, (ContentUriSegment) semanticObject); 
				return; 
			case SqliteModelPackage.CREATE_INDEX_STATEMENT:
				sequence_CreateIndexStatement(context, (CreateIndexStatement) semanticObject); 
				return; 
			case SqliteModelPackage.CREATE_TABLE_STATEMENT:
				sequence_CreateTableStatement(context, (CreateTableStatement) semanticObject); 
				return; 
			case SqliteModelPackage.CREATE_TRIGGER_STATEMENT:
				sequence_CreateTriggerStatement(context, (CreateTriggerStatement) semanticObject); 
				return; 
			case SqliteModelPackage.CREATE_VIEW_STATEMENT:
				sequence_CreateViewStatement(context, (CreateViewStatement) semanticObject); 
				return; 
			case SqliteModelPackage.CURRENT_DATE_LITERAL:
				sequence_LiteralValue(context, (CurrentDateLiteral) semanticObject); 
				return; 
			case SqliteModelPackage.CURRENT_TIME_LITERAL:
				sequence_LiteralValue(context, (CurrentTimeLiteral) semanticObject); 
				return; 
			case SqliteModelPackage.CURRENT_TIME_STAMP_LITERAL:
				sequence_LiteralValue(context, (CurrentTimeStampLiteral) semanticObject); 
				return; 
			case SqliteModelPackage.DATABASE_BLOCK:
				sequence_DatabaseBlock(context, (DatabaseBlock) semanticObject); 
				return; 
			case SqliteModelPackage.DEFAULT_CONSTRAINT:
				sequence_ColumnConstraint(context, (DefaultConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.DELETE_STATEMENT:
				sequence_DeleteStatement(context, (DeleteStatement) semanticObject); 
				return; 
			case SqliteModelPackage.DROP_INDEX_STATEMENT:
				sequence_DropIndexStatement(context, (DropIndexStatement) semanticObject); 
				return; 
			case SqliteModelPackage.DROP_TABLE_STATEMENT:
				sequence_DropTableStatement(context, (DropTableStatement) semanticObject); 
				return; 
			case SqliteModelPackage.DROP_TRIGGER_STATEMENT:
				sequence_DropTriggerStatement(context, (DropTriggerStatement) semanticObject); 
				return; 
			case SqliteModelPackage.DROP_VIEW_STATEMENT:
				sequence_DropViewStatement(context, (DropViewStatement) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_ADD:
				sequence_ExprAdd(context, (ExprAdd) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_AND:
				sequence_ExprAnd(context, (ExprAnd) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_BIT:
				sequence_ExprBit(context, (ExprBit) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_CONCAT:
				sequence_ExprConcat(context, (ExprConcat) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_EQUAL:
				sequence_ExprEqual(context, (ExprEqual) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_MULT:
				sequence_ExprMult(context, (ExprMult) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_OR:
				sequence_ExprOr(context, (ExprOr) semanticObject); 
				return; 
			case SqliteModelPackage.EXPR_RELATE:
				sequence_ExprRelate(context, (ExprRelate) semanticObject); 
				return; 
			case SqliteModelPackage.EXPRESSION_DEFAULT_VALUE:
				sequence_DefaultValue(context, (ExpressionDefaultValue) semanticObject); 
				return; 
			case SqliteModelPackage.FUNCTION:
				if(context == grammarAccess.getConfigurationStatementRule()) {
					sequence_ConfigurationStatement(context, (Function) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExprAddRule() ||
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
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.FUNCTION_ARG:
				sequence_FunctionArg(context, (FunctionArg) semanticObject); 
				return; 
			case SqliteModelPackage.FUNCTION_ARGUMENT:
				sequence_PrimaryExpression(context, (FunctionArgument) semanticObject); 
				return; 
			case SqliteModelPackage.GROUP_BY_EXPRESSIONS:
				sequence_GroupByExpressions(context, (GroupByExpressions) semanticObject); 
				return; 
			case SqliteModelPackage.HAVING_EXPRESSIONS:
				sequence_HavingExpressions(context, (HavingExpressions) semanticObject); 
				return; 
			case SqliteModelPackage.INDEXED_COLUMN:
				sequence_IndexedColumn(context, (IndexedColumn) semanticObject); 
				return; 
			case SqliteModelPackage.INIT_BLOCK:
				sequence_InitBlock(context, (InitBlock) semanticObject); 
				return; 
			case SqliteModelPackage.INSERT_STATEMENT:
				sequence_InsertStatement(context, (InsertStatement) semanticObject); 
				return; 
			case SqliteModelPackage.IS_NULL:
				sequence_NullExpression(context, (IsNull) semanticObject); 
				return; 
			case SqliteModelPackage.JOIN_SOURCE:
				sequence_JoinSource(context, (JoinSource) semanticObject); 
				return; 
			case SqliteModelPackage.JOIN_STATEMENT:
				sequence_JoinStatement(context, (JoinStatement) semanticObject); 
				return; 
			case SqliteModelPackage.LITERAL:
				sequence_PrimaryExpression(context, (Literal) semanticObject); 
				return; 
			case SqliteModelPackage.LITERAL_DEFAULT_VALUE:
				sequence_DefaultValue(context, (LiteralDefaultValue) semanticObject); 
				return; 
			case SqliteModelPackage.MIGRATION_BLOCK:
				sequence_MigrationBlock(context, (MigrationBlock) semanticObject); 
				return; 
			case SqliteModelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SqliteModelPackage.NESTED_EXPRESSION:
				sequence_PrimaryExpression(context, (NestedExpression) semanticObject); 
				return; 
			case SqliteModelPackage.NEW_COLUMN:
				sequence_PrimaryExpression(context, (NewColumn) semanticObject); 
				return; 
			case SqliteModelPackage.NOT_NULL:
				sequence_NullExpression(context, (NotNull) semanticObject); 
				return; 
			case SqliteModelPackage.NOT_NULL_CONSTRAINT:
				sequence_ColumnConstraint(context, (NotNullConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.NULL_CHECK_EXPRESSION:
				sequence_NullCheckExpression(context, (NullCheckExpression) semanticObject); 
				return; 
			case SqliteModelPackage.NULL_LITERAL:
				sequence_LiteralValue(context, (NullLiteral) semanticObject); 
				return; 
			case SqliteModelPackage.NUMERIC_LITERAL:
				sequence_LiteralValue(context, (NumericLiteral) semanticObject); 
				return; 
			case SqliteModelPackage.OLD_COLUMN:
				sequence_PrimaryExpression(context, (OldColumn) semanticObject); 
				return; 
			case SqliteModelPackage.ORDERING_TERM:
				sequence_OrderingTerm(context, (OrderingTerm) semanticObject); 
				return; 
			case SqliteModelPackage.ORDERING_TERM_LIST:
				sequence_OrderingTermList(context, (OrderingTermList) semanticObject); 
				return; 
			case SqliteModelPackage.PRIMARY_CONSTRAINT:
				sequence_PrimaryConstraint(context, (PrimaryConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT:
				sequence_ColumnConstraint(context, (PrimaryKeyColumnConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.RESULT_COLUMN:
				sequence_ResultColumn(context, (ResultColumn) semanticObject); 
				return; 
			case SqliteModelPackage.SELECT_CORE:
				sequence_SelectCore(context, (SelectCore) semanticObject); 
				return; 
			case SqliteModelPackage.SELECT_EXPRESSION:
				sequence_SelectExpression(context, (SelectExpression) semanticObject); 
				return; 
			case SqliteModelPackage.SELECT_LIST:
				sequence_SelectList(context, (SelectList) semanticObject); 
				return; 
			case SqliteModelPackage.SELECT_STATEMENT:
				sequence_SelectStatement(context, (SelectStatement) semanticObject); 
				return; 
			case SqliteModelPackage.SELECT_STATEMENT_EXPRESSION:
				sequence_PrimaryExpression(context, (SelectStatementExpression) semanticObject); 
				return; 
			case SqliteModelPackage.SINGLE_SOURCE_JOIN:
				sequence_SingleSourceJoin(context, (SingleSourceJoin) semanticObject); 
				return; 
			case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT:
				sequence_SingleSourceSelectStatement(context, (SingleSourceSelectStatement) semanticObject); 
				return; 
			case SqliteModelPackage.SINGLE_SOURCE_TABLE:
				sequence_SingleSourceTable(context, (SingleSourceTable) semanticObject); 
				return; 
			case SqliteModelPackage.STRING_LITERAL:
				sequence_LiteralValue(context, (StringLiteral) semanticObject); 
				return; 
			case SqliteModelPackage.UNIQUE_CONSTRAINT:
				sequence_ColumnConstraint(context, (UniqueConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.UNIQUE_TABLE_CONSTRAINT:
				sequence_UniqueTableConstraint(context, (UniqueTableConstraint) semanticObject); 
				return; 
			case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION:
				sequence_UpdateColumnExpression(context, (UpdateColumnExpression) semanticObject); 
				return; 
			case SqliteModelPackage.UPDATE_STATEMENT:
				sequence_UpdateStatement(context, (UpdateStatement) semanticObject); 
				return; 
			case SqliteModelPackage.WHERE_EXPRESSIONS:
				sequence_WhereExpressions(context, (WhereExpressions) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (table=[TableDefinition|ID] columnDef=ColumnDef)
	 */
	protected void sequence_AlterTableAddColumnStatement(EObject context, AlterTableAddColumnStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionIDTerminalRuleCall_2_0_1(), semanticObject.getTable());
		feeder.accept(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0(), semanticObject.getColumnDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (table=[TableDefinition|ID] name=ID)
	 */
	protected void sequence_AlterTableRenameStatement(EObject context, AlterTableRenameStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.TABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.TABLE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_RENAME_STATEMENT__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ALTER_TABLE_RENAME_STATEMENT__TABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.getTable());
		feeder.accept(grammarAccess.getAlterTableRenameStatementAccess().getNameIDTerminalRuleCall_5_0(), semanticObject.getName());
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
	 *     (name=ID? expression=SqlExpression)
	 */
	protected void sequence_CheckTableConstraint(EObject context, CheckTableConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_ColumnConstraint(EObject context, CheckConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CHECK_CONSTRAINT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CHECK_CONSTRAINT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0(), semanticObject.getExpression());
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
		feeder.accept(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0(), semanticObject.getDefaultValue());
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
	 *     (conflictClause=ConflictClause?)
	 */
	protected void sequence_ColumnConstraint(EObject context, UniqueConstraint semanticObject) {
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
	 *     (name=ID uri=ContentUri)
	 */
	protected void sequence_ConfigurationStatement(EObject context, ActionStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CONFIGURATION_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CONFIGURATION_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.ACTION_STATEMENT__URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_0_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigurationStatementAccess().getUriContentUriParserRuleCall_0_3_0(), semanticObject.getUri());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (args+=FunctionArg args+=FunctionArg*)? statements+=DMLStatement*)
	 */
	protected void sequence_ConfigurationStatement(EObject context, Function semanticObject) {
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
	 *     (name=ID (num?='#' | text?='*'))
	 */
	protected void sequence_ContentUriSegment(EObject context, ContentUriParamSegment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ContentUriSegment(EObject context, ContentUriSegment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CONTENT_URI_SEGMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CONTENT_URI_SEGMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContentUriSegmentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID segments+=ContentUriSegment*)
	 */
	protected void sequence_ContentUri(EObject context, ContentUri semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unique?='unique'? name=ID table=[TableDefinition|ID] columns+=IndexedColumn columns+=IndexedColumn*)
	 */
	protected void sequence_CreateIndexStatement(EObject context, CreateIndexStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (temporary?='temp'? name=ID columnDefs+=ColumnDef columnDefs+=ColumnDef* constraints+=TableConstraint*)
	 */
	protected void sequence_CreateTableStatement(EObject context, CreateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         temporary?='temp'? 
	 *         name=ID 
	 *         (when='before' | when='after' | when='instead of')? 
	 *         (eventType='delete' | eventType='insert' | (eventType='update' (updateColumnNames+=ID updateColumnNames+=ID*)?)) 
	 *         table=[TableDefinition|ID] 
	 *         forEachRow='for each row'? 
	 *         whenExpression=SqlExpression? 
	 *         (statements+=DMLStatement statements+=DMLStatement*)?
	 *     )
	 */
	protected void sequence_CreateTriggerStatement(EObject context, CreateTriggerStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (temporary?='temp'? name=ID selectStatement=SelectStatement)
	 */
	protected void sequence_CreateViewStatement(EObject context, CreateViewStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID config=ConfigBlock? init=InitBlock? migrations+=MigrationBlock*)
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
	 *     (table=[TableDefinition|ID] expression=SqlExpression?)
	 */
	protected void sequence_DeleteStatement(EObject context, DeleteStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? index=[CreateIndexStatement|ID])
	 */
	protected void sequence_DropIndexStatement(EObject context, DropIndexStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? table=[TableDefinition|ID])
	 */
	protected void sequence_DropTableStatement(EObject context, DropTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? trigger=[CreateTriggerStatement|ID])
	 */
	protected void sequence_DropTriggerStatement(EObject context, DropTriggerStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? view=[CreateViewStatement|ID])
	 */
	protected void sequence_DropViewStatement(EObject context, DropViewStatement semanticObject) {
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
	 *             op='not in' | 
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
	 *     (left=ExprOr_ExprOr_1_0 op='or' right=NullCheckExpression)
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
		feeder.accept(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
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
	 *     (type=ColumnType name=ID)
	 */
	protected void sequence_FunctionArg(EObject context, FunctionArg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.FUNCTION_ARG__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.FUNCTION_ARG__TYPE));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.FUNCTION_ARG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.FUNCTION_ARG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFunctionArgAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (groupByExpressions+=SqlExpression groupByExpressions+=SqlExpression*)
	 */
	protected void sequence_GroupByExpressions(EObject context, GroupByExpressions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_HavingExpressions(EObject context, HavingExpressions semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.HAVING_EXPRESSIONS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.HAVING_EXPRESSIONS__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (columnReference=[ColumnDef|ID] collationName=ID? (asc?='asc' | desc?='desc')?)
	 */
	protected void sequence_IndexedColumn(EObject context, IndexedColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=DDLStatement*)
	 */
	protected void sequence_InitBlock(EObject context, InitBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         conflictResolution=ConflictResolution? 
	 *         table=[TableDefinition|ID] 
	 *         (columnNames+=[ColumnDef|ID] columnNames+=[ColumnDef|ID]*)? 
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
	 *     literal='current_timestamp'
	 */
	protected void sequence_LiteralValue(EObject context, CurrentTimeStampLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CURRENT_TIME_STAMP_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CURRENT_TIME_STAMP_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralCurrent_timestampKeyword_5_1_0(), semanticObject.getLiteral());
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
	 *     (statements+=DDLStatement*)
	 */
	protected void sequence_MigrationBlock(EObject context, MigrationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=QualifiedName database=DatabaseBlock)
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
		feeder.accept(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0(), semanticObject.getPackageName());
		feeder.accept(grammarAccess.getModelAccess().getDatabaseDatabaseBlockParserRuleCall_2_0(), semanticObject.getDatabase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=NullCheckExpression_NullCheckExpression_1_0 right=NullExpression)
	 */
	protected void sequence_NullCheckExpression(EObject context, NullCheckExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.NULL_CHECK_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.NULL_CHECK_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.NULL_CHECK_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.NULL_CHECK_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {IsNull}
	 */
	protected void sequence_NullExpression(EObject context, IsNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NotNull}
	 */
	protected void sequence_NullExpression(EObject context, NotNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (orderingTerms+=OrderingTerm orderingTerms+=OrderingTerm*)
	 */
	protected void sequence_OrderingTermList(EObject context, OrderingTermList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID? columns+=IndexedColumn columns+=IndexedColumn* conflictClause=ConflictClause)
	 */
	protected void sequence_PrimaryConstraint(EObject context, PrimaryConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (caseExpression=SqlExpression? cases+=Case+ elseExpression=SqlExpression?)
	 */
	protected void sequence_PrimaryExpression(EObject context, CaseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SqlExpression type=SqliteDataType)
	 */
	protected void sequence_PrimaryExpression(EObject context, CastExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CAST_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CAST_EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.CAST_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.CAST_EXPRESSION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=[SelectSource|ID] | (source=[SelectSource|ID] (all?='*' | column=[ColumnSource|ID])) | column=[ColumnSource|ID])
	 */
	protected void sequence_PrimaryExpression(EObject context, ColumnSourceRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (all?='*' | (arguments+=SqlExpression arguments+=SqlExpression*)))
	 */
	protected void sequence_PrimaryExpression(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=[FunctionArg|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, FunctionArgument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.FUNCTION_ARGUMENT__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.FUNCTION_ARGUMENT__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getArgFunctionArgIDTerminalRuleCall_9_2_0_1(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literalValue=LiteralValue
	 */
	protected void sequence_PrimaryExpression(EObject context, Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.LITERAL__LITERAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.LITERAL__LITERAL_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0(), semanticObject.getLiteralValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_PrimaryExpression(EObject context, NestedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.NESTED_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.NESTED_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     column=[ColumnSource|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, NewColumn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.NEW_COLUMN__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.NEW_COLUMN__COLUMN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceIDTerminalRuleCall_0_2_0_1(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     column=[ColumnSource|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, OldColumn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.OLD_COLUMN__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.OLD_COLUMN__COLUMN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceIDTerminalRuleCall_1_2_0_1(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (not?='not'? exists?='exists'? select=SelectStatement)
	 */
	protected void sequence_PrimaryExpression(EObject context, SelectStatementExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SqlExpression name=ID?)
	 */
	protected void sequence_ResultColumn(EObject context, ResultColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SelectCore_SelectCore_1_0 op=CompoundOperator right=SelectExpression)
	 */
	protected void sequence_SelectCore(EObject context, SelectCore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SELECT_CORE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SELECT_CORE__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SELECT_CORE__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SELECT_CORE__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SELECT_CORE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SELECT_CORE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (distinct?='distinct' | all?='all')? 
	 *         (allColumns?='*' | selectList=SelectList) 
	 *         source=JoinSource? 
	 *         where=WhereExpressions? 
	 *         groupBy=GroupByExpressions? 
	 *         having=HavingExpressions?
	 *     )
	 */
	protected void sequence_SelectExpression(EObject context, SelectExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resultColumns+=ResultColumn resultColumns+=ResultColumn*)
	 */
	protected void sequence_SelectList(EObject context, SelectList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (core=SelectCore orderby=OrderingTermList? (limit=SqlExpression limitOffset=SqlExpression?)?)
	 */
	protected void sequence_SelectStatement(EObject context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     joinSource=JoinSource
	 */
	protected void sequence_SingleSourceJoin(EObject context, SingleSourceJoin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_JOIN__JOIN_SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SINGLE_SOURCE_JOIN__JOIN_SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0(), semanticObject.getJoinSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (selectStatement=SelectStatement name=ID?)
	 */
	protected void sequence_SingleSourceSelectStatement(EObject context, SingleSourceSelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tableReference=[TableDefinition|ID] name=ID?)
	 */
	protected void sequence_SingleSourceTable(EObject context, SingleSourceTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? columns+=IndexedColumn columns+=IndexedColumn* conflictClause=ConflictClause)
	 */
	protected void sequence_UniqueTableConstraint(EObject context, UniqueTableConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (columnName=[ColumnDef|ID] expression=SqlExpression)
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
		feeder.accept(grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefIDTerminalRuleCall_0_0_1(), semanticObject.getColumnName());
		feeder.accept(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         conflictResolution=ConflictResolution? 
	 *         table=[TableDefinition|ID] 
	 *         updateColumnExpressions+=UpdateColumnExpression 
	 *         updateColumnExpressions+=UpdateColumnExpression* 
	 *         whereExpression=SqlExpression?
	 *     )
	 */
	protected void sequence_UpdateStatement(EObject context, UpdateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_WhereExpressions(EObject context, WhereExpressions semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.WHERE_EXPRESSIONS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.WHERE_EXPRESSIONS__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
