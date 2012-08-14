package com.robotoworks.mechanoid.sqlite.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AndExpr;
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
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Literal;
import com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.OrExpr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryComparisonExpr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SecondaryComparisonExpr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral;
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
			case SqliteModelPackage.AND_EXPR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndExprLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0()) {
					sequence_And(context, (AndExpr) semanticObject); 
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
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndExprLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0()) {
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
			case SqliteModelPackage.EXPRESSION_DEFAULT_VALUE:
				if(context == grammarAccess.getDefaultValueRule()) {
					sequence_DefaultValue(context, (ExpressionDefaultValue) semanticObject); 
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
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndExprLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0()) {
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
			case SqliteModelPackage.OR_EXPR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndExprLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0()) {
					sequence_Or(context, (OrExpr) semanticObject); 
					return; 
				}
				else break;
			case SqliteModelPackage.PRIMARY_COMPARISON_EXPR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndExprLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0()) {
					sequence_PrimaryComparison(context, (PrimaryComparisonExpr) semanticObject); 
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
			case SqliteModelPackage.SECONDARY_COMPARISON_EXPR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndExprLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryComparisonRule() ||
				   context == grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSecondaryComparisonRule() ||
				   context == grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0()) {
					sequence_SecondaryComparison(context, (SecondaryComparisonExpr) semanticObject); 
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
				if(context == grammarAccess.getSelectStatementRule()) {
					sequence_SelectStatement(context, (SelectStatement) semanticObject); 
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
			case SqliteModelPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (StringLiteral) semanticObject); 
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
	 *     (left=And_AndExpr_1_0 right=PrimaryComparison)
	 */
	protected void sequence_And(EObject context, AndExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.AND_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.AND_EXPR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.AND_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.AND_EXPR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightPrimaryComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
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
	 *     (name=ID migrations+=MigrationBlock*)
	 */
	protected void sequence_DatabaseBlock(EObject context, DatabaseBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Or
	 */
	protected void sequence_DefaultValue(EObject context, ExpressionDefaultValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.EXPRESSION_DEFAULT_VALUE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.EXPRESSION_DEFAULT_VALUE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueAccess().getExpressionOrParserRuleCall_1_2_0(), semanticObject.getExpression());
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
	 *     (natural?='natural'? ((left?='left' outer?='outer'?) | inner?='inner' | cross?='cross')? singleSource=SingleSource expression=Or)
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
	 *     (left=Or_OrExpr_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, OrExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.OR_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.OR_EXPR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.OR_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.OR_EXPR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PrimaryComparison_PrimaryComparisonExpr_1_0 op=SecondaryComparisonOp right=SecondaryComparison)
	 */
	protected void sequence_PrimaryComparison(EObject context, PrimaryComparisonExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON_EXPR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON_EXPR__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.PRIMARY_COMPARISON_EXPR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPrimaryComparisonAccess().getOpSecondaryComparisonOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getPrimaryComparisonAccess().getRightSecondaryComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=FQN
	 */
	protected void sequence_PrimaryExpression(EObject context, ColumnLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.COLUMN_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.COLUMN_LITERAL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getNameFQNParserRuleCall_0_1_0(), semanticObject.getName());
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
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_1_1_0(), semanticObject.getLiteralValue());
		feeder.finish();
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
	 *     (expression=Or name=ID?)
	 */
	protected void sequence_ResultColumn(EObject context, ResultColumnExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SecondaryComparison_SecondaryComparisonExpr_1_0 op=PrimaryComparisonOp right=PrimaryExpression)
	 */
	protected void sequence_SecondaryComparison(EObject context, SecondaryComparisonExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON_EXPR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON_EXPR__OP));
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SECONDARY_COMPARISON_EXPR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSecondaryComparisonAccess().getOpPrimaryComparisonOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSecondaryComparisonAccess().getRightPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((distinct?='distinct' | all?='all')? resultColumns+=ResultColumn resultColumns+=ResultColumn* source=JoinSource?)
	 */
	protected void sequence_SelectCore(EObject context, SelectCore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     core=SelectCore
	 */
	protected void sequence_SelectStatement(EObject context, SelectStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqliteModelPackage.Literals.SELECT_STATEMENT__CORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqliteModelPackage.Literals.SELECT_STATEMENT__CORE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0(), semanticObject.getCore());
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
