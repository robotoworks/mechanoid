package com.robotoworks.mechanoid.sqlite.validation;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSourceRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectList;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.util.ModelUtil;

 

public class SqliteModelJavaValidator extends AbstractSqliteModelJavaValidator {

 
	@Inject TypeReferences typeReferences;
	
	@Check
	public void checkMechanoidLibOnClasspath(Model m) {
		JvmType type = typeReferences.findDeclaredType("com.robotoworks.mechanoid.content.CursorWalker", m);

		if(type == null) {
			error("mechanoid.jar is required in your /libs folder or on the classpath", SqliteModelPackage.Literals.MODEL__PACKAGE_NAME);
		}
	}
	
	@Check
	public void checkStatementSequence(DatabaseBlock db) {
		HashSet<String> tables = new HashSet<String>();
		HashSet<String> views = new HashSet<String>();
		HashSet<String> triggers = new HashSet<String>();
		
		for(MigrationBlock migration : db.getMigrations()) {
			EList<DDLStatement> statements = migration.getStatements();
			
			for(DDLStatement statement : statements) {
				if(statement instanceof CreateTableStatement) {
					CreateTableStatement ct = (CreateTableStatement) statement;
					if(tables.contains(ct.getName())) {
						error("Table exists, drop it or rename it first", ct, SqliteModelPackage.Literals.TABLE_DEFINITION__NAME, -1);
						return;
					} else if(views.contains(ct.getName())) {
						error("A view exists with this name, drop it first", ct, SqliteModelPackage.Literals.TABLE_DEFINITION__NAME, -1);
						return;				
					} else {
						tables.add(ct.getName());
					}
					
				} else if(statement instanceof AlterTableRenameStatement) {
					AlterTableRenameStatement atr = (AlterTableRenameStatement) statement;
					if(!tables.contains(atr.getTable().getName())) {
						error("Table does not exist", atr, SqliteModelPackage.Literals.ALTER_TABLE_RENAME_STATEMENT__TABLE, -1);
						return;						
					}
					
					if(tables.contains(atr.getName())) {
						error("Table to rename to already exists, use another name", atr, SqliteModelPackage.Literals.TABLE_DEFINITION__NAME, -1);
						return;								
					}
					
					tables.remove(atr.getTable().getName());
					tables.add(atr.getName());
					
				} else if(statement instanceof AlterTableAddColumnStatement) {
					AlterTableAddColumnStatement ata = (AlterTableAddColumnStatement) statement;
					if(!tables.contains(ata.getTable().getName())) {
						error("Table does not exist", ata, SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE, -1);
						return;								
					}
				} else if (statement instanceof DropTableStatement) {
					DropTableStatement dt = (DropTableStatement) statement;
					
					if(!tables.contains(dt.getTable().getName())) {
						error("Table does not exist", dt, SqliteModelPackage.Literals.DROP_TABLE_STATEMENT__TABLE, -1);
						return;							
					} else {
						tables.remove(dt.getTable().getName());
					}
					
				} else if(statement instanceof CreateViewStatement) {
					CreateViewStatement cv = (CreateViewStatement) statement;
					if(views.contains(cv.getName())) {
						error("View exists, drop it first", cv, SqliteModelPackage.Literals.CREATE_VIEW_STATEMENT__NAME, -1);
						return;
					}
					else if(tables.contains(cv.getName())) {
						error("A table exists with this name, drop it first", cv, SqliteModelPackage.Literals.CREATE_VIEW_STATEMENT__NAME, -1);
						return;
					} else {
						
						SelectCoreExpression expr = cv.getSelectStatement().getCore();
						
						if(!checkTablesInExpressionExist(tables, expr)) {
							return;
						}
						
						views.add(cv.getName());
					}
				} else if (statement instanceof DropViewStatement) {
					DropViewStatement dv = (DropViewStatement) statement;
					
					if(!views.contains(dv.getView().getName())) {
						error("View does not exist", dv, SqliteModelPackage.Literals.DROP_VIEW_STATEMENT__VIEW, -1);
						return;							
					} else {
						views.remove(dv.getView().getName());
					}
				}else if(statement instanceof CreateTriggerStatement) {
					CreateTriggerStatement ct = (CreateTriggerStatement) statement;
					if(triggers.contains(ct.getName())) {
						error("Trigger exists, drop it first", ct, SqliteModelPackage.Literals.CREATE_TRIGGER_STATEMENT__NAME, -1);
						return;
					} else {
						triggers.add(ct.getName());
					}
				} else if (statement instanceof DropTriggerStatement) {
					DropTriggerStatement dt = (DropTriggerStatement) statement;
					
					if(!triggers.contains(dt.getTrigger().getName())) {
						error("Trigger does not exist", dt, SqliteModelPackage.Literals.DROP_TRIGGER_STATEMENT__TRIGGER, -1);
						return;							
					} else {
						triggers.remove(dt.getTrigger().getName());
					}
				}
			}
		}
	}

	private boolean checkTablesInExpressionExist(HashSet<String> tables,
			SelectCoreExpression expr) {
		ArrayList<EObject> sources = ModelUtil.getAllReferenceableSingleSources(expr);
		
		for(EObject source : sources) {
			if(source instanceof SingleSourceTable) {
				SingleSourceTable table = (SingleSourceTable) source;
				
				if(!tables.contains(table.getTableReference().getName())) {
					error("Table does not exist", table, SqliteModelPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE, -1);
					return false;
				}
			}
		}
		
		return true;
	}

	@Check
	public void checkColumnSourceRefComplete(ColumnSourceRef ref) {
		if(ref.isAll()) {
			return;
		}
		
		if(ref.getSource() != null && ref.getColumn() == null) {
			error("Incomplete reference", SqliteModelPackage.Literals.COLUMN_SOURCE_REF__COLUMN);
		}
	}
	
	@Check
	public void checkUniqueResultColumnAliases(SelectList list) {
		EList<ColumnSource> cols = list.getResultColumns();
		
		for(int i=0; i < cols.size(); i++) {
			ColumnSource subject = cols.get(i);
			int matches = 0;
			for(int j=0; j < cols.size(); j++) {
				ColumnSource target = cols.get(j);
				
				if(subject.getName() != null && 
						target.getName() != null &&
						subject.getName().equalsIgnoreCase(target.getName())) {
					matches++;
				}
				
				if(matches > 1) {
					error("Duplicate alias not allowed", target, SqliteModelPackage.Literals.COLUMN_SOURCE__NAME, -1);
					return;
				}
			}
		}
	}
}
