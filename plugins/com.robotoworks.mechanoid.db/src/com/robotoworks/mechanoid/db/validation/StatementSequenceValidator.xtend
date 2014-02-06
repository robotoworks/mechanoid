package com.robotoworks.mechanoid.db.validation

import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock
import java.util.HashSet
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement
import com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement
import com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement
import com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression
import com.robotoworks.mechanoid.db.util.ModelUtil
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable
import com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement
import com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement

class StatementSequenceValidator {
	val tables = new HashSet<String>()
	val views = new HashSet<String>()
	val triggers = new HashSet<String>()
	val indexes = new HashSet<String>()

	def StatementSequenceValidatorResult validate(DatabaseBlock db) {
		
		tables.clear
		views.clear
		triggers.clear
		indexes.clear

		var result = new StatementSequenceValidatorResult()

		result.valid = true;

		for (migration : db.getMigrations()) {
			var statements = migration.getStatements();
			for(stmt : statements) {
				result.source = stmt
				validateStatement(result, stmt)
				
				if(result.valid) {
					sequence(stmt)
				} else {
					return result;
				}
			}
		}

		return result
	}
	
	def nameExists(String name) {
		return tables.contains(name) || 
			views.contains(name) || 
			triggers.contains(name) || 
			indexes.contains(name)
	}
	
	def sourceExists(String name) {
		return tables.contains(name) || 
			views.contains(name)
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, CreateTableStatement stmt) {
		if(nameExists(stmt.getName())) {
			result.valid = false
			result.message = "Name conflict, use another name"
			result.feature = SqliteModelPackage.Literals.TABLE_DEFINITION__NAME
		}
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, AlterTableRenameStatement stmt) {
		if(!tables.contains(stmt.getTable().getName())) {
			result.valid = false
			result.message = "No such table"
			result.feature = SqliteModelPackage.Literals.ALTER_TABLE_RENAME_STATEMENT__TABLE
		}
		else if(nameExists(stmt.getName())) {
			result.valid = false
			result.message = "Name conflict, use another name"
			result.feature = SqliteModelPackage.Literals.TABLE_DEFINITION__NAME
		}
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, AlterTableAddColumnStatement stmt) {
		if(!tables.contains(stmt.getTable().getName())) {
			result.valid = false
			result.message = "No such table"
			result.feature = SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE
		}
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, DropTableStatement stmt) {
		if(!tables.contains(stmt.getTable().getName())) {
			result.valid = false
			result.message = "No such table"
			result.feature = SqliteModelPackage.Literals.DROP_TABLE_STATEMENT__TABLE
		}		
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, CreateViewStatement stmt) {
		if(nameExists(stmt.name)) {
			result.valid = false
			result.message = "Name conflict, use another name"
			result.feature = SqliteModelPackage.Literals.TABLE_DEFINITION__NAME
		}
		else {
			validateTablesInExpression(result, stmt.selectStatement.core)
		}		
	}
	
	def void validateTablesInExpression(StatementSequenceValidatorResult result, SelectCoreExpression expr) {
		var sources = ModelUtil.getAllReferenceableSingleSources(expr);
		
		for(source : sources) {
			if(source instanceof SingleSourceTable) {
				var table = source as SingleSourceTable;
				
			    if(!sourceExists(table.getTableReference().getName())) {
			    	result.source = table
					result.valid = false
					result.message = "No such reference"
					result.feature = SqliteModelPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE
			        return;
			    }
			}
		}
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, DropViewStatement stmt) {
		if(!views.contains(stmt.getView().getName())) {
			result.valid = false
			result.message = "No such view"
			result.feature = SqliteModelPackage.Literals.DROP_VIEW_STATEMENT__VIEW
		}		
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, CreateTriggerStatement stmt) {
		if(nameExists(stmt.getName())) {
			result.valid = false
			result.message = "Name conflict, use another name"
			result.feature = SqliteModelPackage.Literals.CREATE_TRIGGER_STATEMENT__NAME
		} else if(!tables.contains(stmt.getTable().getName())) {
			result.valid = false
			result.message = "No such table"
			result.feature = SqliteModelPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE
		}		
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, DropTriggerStatement stmt) {
		if(!triggers.contains(stmt.getTrigger().getName())) {
			result.valid = false
			result.message = "No such trigger"
			result.feature = SqliteModelPackage.Literals.DROP_TRIGGER_STATEMENT__TRIGGER
		}	
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, CreateIndexStatement stmt) {
		if(nameExists(stmt.getName())) {
			result.valid = false
			result.message = "Name conflict, use another name"
			result.feature = SqliteModelPackage.Literals.CREATE_INDEX_STATEMENT__NAME
		} else if(!tables.contains(stmt.getTable().getName())) {
			result.valid = false
			result.message = "No such table"
			result.feature = SqliteModelPackage.Literals.CREATE_INDEX_STATEMENT__TABLE
		}		
	}
	
	def dispatch void validateStatement(StatementSequenceValidatorResult result, DropIndexStatement stmt) {
		if(!indexes.contains(stmt.index.name)) {
			result.valid = false
			result.message = "No such index"
			result.feature = SqliteModelPackage.Literals.DROP_INDEX_STATEMENT__INDEX
		}	
	}
	
	def dispatch void sequence(CreateTableStatement stmt) {
		tables.add(stmt.getName());
	}
	
	def dispatch void sequence(AlterTableRenameStatement stmt) {
		tables.remove(stmt.getTable().getName());
		tables.add(stmt.getName());	
	}
	
	def dispatch void sequence(AlterTableAddColumnStatement stmt) {
		
	}
	
	def dispatch void sequence(DropTableStatement stmt) {
		tables.remove(stmt.getTable().getName());
	}
	
	def dispatch void sequence(CreateViewStatement stmt) {
		views.add(stmt.getName());
	}
	
	def dispatch void sequence(DropViewStatement stmt) {
		views.remove(stmt.getView().getName());
	}
	
	def dispatch void sequence(CreateTriggerStatement stmt) {
		triggers.add(stmt.getName());
	}
	
	def dispatch void sequence(DropTriggerStatement stmt) {
		triggers.remove(stmt.getTrigger().getName());
	}
	
	def dispatch void sequence(CreateIndexStatement stmt) {
		indexes.add(stmt.name)
	}
	
	def dispatch void sequence(DropIndexStatement stmt) {
		indexes.remove(stmt.index.name)
	}
	
}
