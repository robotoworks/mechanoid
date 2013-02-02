package com.robotoworks.mechanoid.sqlite.validation;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
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
						views.add(cv.getName());
					}
				}
			}
		}
	}
}
