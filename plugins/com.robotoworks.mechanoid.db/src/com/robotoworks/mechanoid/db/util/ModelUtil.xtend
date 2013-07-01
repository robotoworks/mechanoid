package com.robotoworks.mechanoid.db.util

import com.google.common.collect.Lists
import com.robotoworks.mechanoid.db.generator.SqliteDatabaseSnapshot
import com.robotoworks.mechanoid.db.sqliteModel.CastExpression
import com.robotoworks.mechanoid.db.sqliteModel.ColumnDef
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef
import com.robotoworks.mechanoid.db.sqliteModel.ColumnType
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock
import com.robotoworks.mechanoid.db.sqliteModel.ExprConcat
import com.robotoworks.mechanoid.db.sqliteModel.Function
import com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock
import com.robotoworks.mechanoid.db.sqliteModel.ResultColumn
import com.robotoworks.mechanoid.db.sqliteModel.SelectCore
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression
import com.robotoworks.mechanoid.db.sqliteModel.SelectExpression
import com.robotoworks.mechanoid.db.sqliteModel.SingleSource
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable
import com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition
import java.util.ArrayList
import java.util.HashSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.lib.Functions

class ModelUtil {
	def static <T extends DDLStatement> ArrayList<T> findPreviousStatementsOfType(DDLStatement stmt, Class<T> statementType) {
		var list = new ArrayList<T>()
		
		var db = ModelUtil::getAncestorOfType(stmt, typeof(DatabaseBlock))
		
		for(MigrationBlock migration : db.migrations) {
			for(ddl : migration.statements) {
				
				if(ddl == stmt) {
					return list
				}
				
				if(statementType.isAssignableFrom(ddl.getClass())) {
					list.add(ddl as T)
				}
			}
		}
		
		return list
	}
	
	def static <T extends DDLStatement> ArrayList<T> findStatementsOfTypeBetween(Class<T> statementType, DDLStatement from, DDLStatement to) {
		var list = new ArrayList<T>()
		
		var between = false

		var db = ModelUtil::getAncestorOfType(from, typeof(DatabaseBlock))
		
		for(MigrationBlock migration : db.migrations) {
			for(ddl : migration.statements) {
				
				if(ddl == to) {
					return list
				}
				
				if(statementType.isAssignableFrom(ddl.getClass())) {
					if(between) {
						list.add(ddl as T)
					}
				}

				if(ddl == from) {
					between = true	
				}
			}
		}
		
		return list
	}
	
	
	def static <T extends EObject> T getAncestorOfType(EObject obj, Class<T> ancestorType) {
		var temp = obj as EObject;
		while(temp.eContainer != null) {
			temp = temp.eContainer
			
			if(ancestorType.isAssignableFrom(temp.getClass())) {
				return temp as T
			}
		}
		
		return null
	}
	

	/*
	 * walks back and visits each previous statement from the given statement, returning
	 * false will cancel the process
	 */
	def static void forEachPreviousStatement(DDLStatement stmt, Functions.Function1<DDLStatement, Boolean> delegate) {
		var current = stmt as EObject
		var MigrationBlock migration = null
		
		do {
			while(EcoreUtil2::getPreviousSibling(current) != null) {
				current = EcoreUtil2::getPreviousSibling(current)
				if(!delegate.apply(current as DDLStatement)) {
					return;
				}	
			}
			
			var previousContainer = EcoreUtil2::getPreviousSibling(current.eContainer)
			
			if(previousContainer != null && previousContainer instanceof MigrationBlock) {
				migration = previousContainer as MigrationBlock
				
				current = migration.statements.last
				
				if(current == null) {
					return
				}
				
				if(!delegate.apply(current as DDLStatement)) {
					return;
				}	
				
			} else {
				migration = null
			}
		} while (migration != null)
	}
	
	def static ArrayList<EObject> getAllReferenceableSingleSources(SelectCoreExpression expr) {
		val ArrayList<EObject> items = Lists::newArrayList()
		
		if(expr instanceof SelectCore) {
			items.addAll(getAllReferenceableSingleSources((expr as SelectCore).left))
			items.addAll(getAllReferenceableSingleSources((expr as SelectCore).right))
		} else if (expr instanceof SelectExpression) {
			items.addAll(findAllSingleSources(expr as SelectExpression))
		}
		
		return items
	}
	
	def static ArrayList<SingleSource> findAllSingleSources(SelectExpression expr) {
		val ArrayList<SingleSource> items = Lists::newArrayList()
		
		items.add(expr.source.source)
		
		for(join : expr.source.joinStatements) {
			items.add(join.singleSource)
		}
		
		return items
	}

	def static toColumnType(SqliteDataType dt) {
		switch(dt) {
		case SqliteDataType::BLOB:
			return ColumnType::BLOB
		case SqliteDataType::INTEGER:
			return ColumnType::INTEGER
		case SqliteDataType::REAL:
			return ColumnType::REAL
		}
		return ColumnType::TEXT
	}
	
	def static toJavaTypeName(ColumnType type) {
		switch(type) {
		case ColumnType::TEXT:
			return "String"
		case ColumnType::INTEGER:
			return "long"
		case ColumnType::REAL:
			return "double"
		case ColumnType::BLOB:
			return "byte[]"
		case ColumnType::BOOLEAN:
			return "boolean"
		}
		
		return "!!ERROR!!";
	}
	
	def static ColumnType getInferredColumnType(ResultColumn col) { 
		var expr = col.expression
		switch expr {
			CastExpression: {
				return toColumnType(expr.type)
			}
			ColumnSourceRef: {
				if(expr.column instanceof ResultColumn) {
					return getInferredColumnType(expr.column as ResultColumn) as ColumnType
				} else {
					return (expr.column as ColumnDef).type
				}
			}
			ExprConcat: {
				return ColumnType::TEXT
			}
			Function: {
				if(expr.name.equalsIgnoreCase("count") ||
					expr.name.equalsIgnoreCase("length") ||
					expr.name.equalsIgnoreCase("random")
				) {
					return ColumnType::INTEGER
				}
				
				return ColumnType::TEXT
			}
		}
		
		return ColumnType::TEXT
	}
	
	def static getViewResultColumns(CreateViewStatement stmt) {
		var result = new ArrayList<ColumnSource>();
		
		var coreExpr = stmt.getSelectStatement().getCore()
		if(coreExpr instanceof SelectCore) {
			var core = coreExpr as SelectCore
			var selectList = (core.getRight() as SelectExpression).getSelectList();
			if(selectList != null) {
				result.addAll(selectList.getResultColumns().filter([it.name != null && !it.name.equals("")]))
			}
		} else {
			var selectList = (coreExpr as SelectExpression).getSelectList();
			if(selectList != null) {
				result.addAll(selectList.getResultColumns().filter([it.name != null && !it.name.equals("")]))
			}
		}
		
		return result;
	}
	
	def static getAllViewsReferencingTable(SqliteDatabaseSnapshot snapshot, TableDefinition tableDef) {
		var matches = new HashSet<CreateViewStatement>();
		
		for(view : snapshot.views) {
			if(isDefinitionReferencedByView(tableDef, view)) {
				matches.add(view)
			}
		}
		
		//snapshot.views.
		
		
		return matches;
	}
	
	def static boolean isDefinitionReferencedByView(TableDefinition tableDef, CreateViewStatement view) {
		return view.eAllContents.exists[obj|
			if(obj instanceof SingleSourceTable) {
				var sourceTable = obj as SingleSourceTable
				
				if(!(sourceTable.tableReference instanceof CreateViewStatement)) {
					if(sourceTable.tableReference.name.equals(tableDef.name)) {
						return true
					}
					
				} else {
					return isDefinitionReferencedByView(tableDef, sourceTable.tableReference as CreateViewStatement)
				}
			}
			
			return false
		]
	}
	
	def static hasAndroidPrimaryKey(CreateTableStatement stmt) {
		return stmt.getColumnDefs().exists([it.getName().equals("_id")])
	}
	
	def static hasAndroidPrimaryKey(CreateViewStatement stmt) {
		return getViewResultColumns(stmt).exists([
			!Strings::isEmpty(it.getName()) && it.getName().equals("_id")
		]);
	}
}