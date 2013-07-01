package com.robotoworks.mechanoid.db.scoping

import com.google.common.collect.Lists
import com.robotoworks.mechanoid.db.naming.NameHelper
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock
import com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement
import com.robotoworks.mechanoid.db.sqliteModel.InsertStatement
import com.robotoworks.mechanoid.db.sqliteModel.NewColumn
import com.robotoworks.mechanoid.db.sqliteModel.OldColumn
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList
import com.robotoworks.mechanoid.db.sqliteModel.ResultColumn
import com.robotoworks.mechanoid.db.sqliteModel.SelectCore
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression
import com.robotoworks.mechanoid.db.sqliteModel.SelectExpression
import com.robotoworks.mechanoid.db.sqliteModel.SelectList
import com.robotoworks.mechanoid.db.sqliteModel.SelectSource
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition
import com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

import static extension com.robotoworks.mechanoid.db.util.ModelUtil.*
import com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement

public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
	
	@Inject IQualifiedNameProvider nameProvider
	
	
	def IScope scope_IndexedColumn_columnReference(CreateTableStatement context, EReference reference) {
		return Scopes::scopeFor(context.columnDefs, nameProvider, IScope::NULLSCOPE)
	}
	
	def IScope scope_ColumnSourceRef_column(SelectList context, EReference reference) {
		var expr = context.getAncestorOfType(typeof(SelectExpression))
		
		return Scopes::scopeFor(expr.getAllReferenceableColumns(false))
	}
	
	def IScope scope_ColumnSourceRef_column(ColumnSourceRef context, EReference reference) {
		
		if(context.source == null) {
			var scope =  buildScopeForColumnSourceRef_column(context, context)
			
			return scope
		} else {
			if(context.source instanceof SingleSourceTable) {
				var tableSource = context.source as SingleSourceTable
				
				return Scopes::scopeFor(findColumnDefs(tableSource.getAncestorOfType(typeof(DDLStatement)), tableSource.tableReference))
			}			
		}
		
		return IScope::NULLSCOPE
	}
	
	def IScope scope_ColumnSourceRef_source(ColumnSourceRef context, EReference reference) {
		var scope = buildScopeForColumnSourceRef_source(context, context)
		
		return scope
	}	
	
	def IScope scope_NewColumn_column(NewColumn context, EReference reference) {
		var trigger = context.getAncestorOfType(typeof(CreateTriggerStatement))
		
		if(trigger != null){
			return Scopes::scopeFor(trigger.findColumnDefs(trigger.table))
		}
		
		return IScope::NULLSCOPE
	}
	
	def IScope scope_OldColumn_column(OldColumn context, EReference reference) {
		var trigger = context.getAncestorOfType(typeof(CreateTriggerStatement))
		
		if(trigger != null){
			return Scopes::scopeFor(trigger.findColumnDefs(trigger.table))
		}
		
		return IScope::NULLSCOPE
	}
	
	def IScope scope_SingleSourceTable_tableReference(SingleSourceTable tbl, EReference reference) {
		var stmt = tbl.getAncestorOfType(typeof(DDLStatement))
		
		return stmt.scopeForTableDefinitionsBeforeStatement
	}
	def IScope scope_CreateTriggerStatement_table(CreateTriggerStatement context, EReference reference) {
		return context.scopeForTableDefinitionsBeforeStatement
	}
	
	def IScope scope_DeleteStatement_table(DeleteStatement context, EReference reference) {
		var stmt = context.getAncestorOfType(typeof(DDLStatement))
		return stmt.scopeForTableDefinitionsBeforeStatement
	}
	
	def IScope scope_InsertStatement_table(InsertStatement context, EReference reference) {
		var stmt = context.getAncestorOfType(typeof(DDLStatement))
		return stmt.scopeForTableDefinitionsBeforeStatement
	}
	
	def IScope scope_UpdateStatement_table(UpdateStatement context, EReference reference) {
		var stmt = context.getAncestorOfType(typeof(DDLStatement))
		return stmt.scopeForTableDefinitionsBeforeStatement
	}
	
	def IScope scope_InsertStatement_columnNames(InsertStatement context, EReference reference) {
		var stmt = context.getAncestorOfType(typeof(DDLStatement))
		return Scopes::scopeFor(stmt.findColumnDefs(context.table), IScope::NULLSCOPE)
	}
	
	def IScope scope_UpdateColumnExpression_columnName(UpdateColumnExpression context, EReference reference) {
		var updateStmt = context.getAncestorOfType(typeof(UpdateStatement))
		var containingStmt = context.getAncestorOfType(typeof(DDLStatement))
		return Scopes::scopeFor(containingStmt.findColumnDefs(updateStmt.table), IScope::NULLSCOPE)
	}
	
	def IScope scope_UpdateColumnExpression_columnName(UpdateStatement context, EReference reference) {
		var containingStmt = context.getAncestorOfType(typeof(DDLStatement))
		return Scopes::scopeFor(containingStmt.findColumnDefs(context.table), IScope::NULLSCOPE)
	}
	
	def IScope scope_ColumnSourceRef_source(UpdateStatement context, EReference reference) {
		var ddl = context.getAncestorOfType(typeof(DDLStatement))
		return Scopes::scopeFor(ddl.findColumnDefs(context.table), IScope::NULLSCOPE)
	}	
	
	def IScope scope_ColumnSourceRef_source(DeleteStatement context, EReference reference) {
		var ddl = context.getAncestorOfType(typeof(DDLStatement))
		return Scopes::scopeFor(ddl.findColumnDefs(context.table), IScope::NULLSCOPE)
	}	
	
	def scopeForTableDefinitionsBeforeStatement(DDLStatement stmt) {
		var refs = stmt.findPreviousStatementsOfType(typeof(TableDefinition))
		
		val map = new HashMap<String, EObject>()
		
		for(ref : refs.reverse){
			// Cannot complete if the name is null
			if(ref.name == null) {
				return IScope::NULLSCOPE;
			}
			
			if(!map.containsKey(ref.name)) {
				map.put(ref.name, ref)
			}
		}

		return Scopes::scopeFor(map.values, [NameHelper::getName((it as TableDefinition))], IScope::NULLSCOPE)
	}
	
	
	def IScope buildScopeForColumnSourceRef_column(ColumnSourceRef context, EObject parent) {
		
		var EObject temp = parent
		
		while(!(temp.eContainer instanceof DatabaseBlock)) {
			var container = temp.eContainer
			switch container {
				SelectExpression: {
					
					var includeAliases = context.getAncestorOfType(typeof(SelectList)) == null
					val ArrayList<EObject> items = container.getAllReferenceableColumns(includeAliases)
					
					return Scopes::scopeFor(items, buildScopeForColumnSourceRef_column(context, container))
				}
				ResultColumn: {
					val ArrayList<EObject> items = (container.eContainer.eContainer as SelectExpression).getAllReferenceableColumns(false)
					
					return Scopes::scopeFor(items, buildScopeForColumnSourceRef_column(context, container))				
				}
				UpdateStatement: {
					var ddl = container.getAncestorOfType(typeof(DDLStatement))
					return Scopes::scopeFor(ddl.findColumnDefs(container.table), IScope::NULLSCOPE)
				}
				InsertStatement: {
					var ddl = container.getAncestorOfType(typeof(DDLStatement))
					return Scopes::scopeFor(ddl.findColumnDefs(container.table), IScope::NULLSCOPE)
				}
				DeleteStatement: {
					var ddl = container.getAncestorOfType(typeof(DDLStatement))
					return Scopes::scopeFor(ddl.findColumnDefs(container.table), IScope::NULLSCOPE)
				}
				OrderingTermList: {
					var selectStatement = container.eContainer as SelectStatement
					
					var core = selectStatement.core as SelectCore
					
					return Scopes::scopeFor(core.allReferenceableColumns, IScope::NULLSCOPE)
				}
			}
			
			temp = temp.eContainer
		}
		
		return IScope::NULLSCOPE
	}
	
	def IScope buildScopeForColumnSourceRef_source(ColumnSourceRef context, EObject parent) {
		
		var EObject temp = parent
		
		while(!(temp.eContainer instanceof DatabaseBlock)) {
			var container = temp.eContainer
			switch container {
				SelectExpression: {
					val ArrayList<EObject> items = Lists::newArrayList()
					
					items.addAll(container.findAllSingleSources)
					
					return Scopes::scopeFor(items, [NameHelper::getName(it as SelectSource)], buildScopeForColumnSourceRef_source(context, container))
				}
				OrderingTermList: {
					var selectStatement = container.eContainer as SelectStatement
					
					var core = selectStatement.core as SelectCore
					
					return Scopes::scopeFor(core.allReferenceableSingleSources, [NameHelper::getName(it as SelectSource)], IScope::NULLSCOPE)
				}
			}
			
			temp = temp.eContainer
		}
		
		return IScope::NULLSCOPE
	}
		
	def ArrayList<EObject> getAllReferenceableColumns(SelectCoreExpression expr) {
		val ArrayList<EObject> items = Lists::newArrayList()
		
		if(expr instanceof SelectCore) {
			items.addAll(getAllReferenceableColumns((expr as SelectCore).left))
			items.addAll(getAllReferenceableColumns((expr as SelectCore).right))
		} else if (expr instanceof SelectExpression) {
			items.addAll((expr as SelectExpression).getAllReferenceableColumns(true))
		}
		
		return items
	}
	
	def getAllReferenceableColumns(SelectExpression expr, boolean includeAliases) {
		val ArrayList<EObject> items = Lists::newArrayList()
		
		if(expr.selectList != null && includeAliases) {
			items.addAll(expr.selectList.resultColumns.filter([it.name != null]))
		}
		
		expr.findAllSingleSources.filter([item|
			if(item instanceof SingleSourceTable) {
				return (item as SingleSourceTable).name == null
			}
			return false
		]).forEach([item|
			var source = item as SingleSourceTable
			
			items.addAll(findColumnDefs(item.getAncestorOfType(typeof(DDLStatement)), source.tableReference))
		])
		
		return items
	}
	
	/*
	 * Find column definitions from caller going back to the definition
	 */
	def findColumnDefs(DDLStatement caller, TableDefinition definition) {
		
		val columns = new ArrayList<EObject>()

		var tableHistory = definition.history

		var last = tableHistory.peekLast

		if(last instanceof CreateViewStatement) {
			var view = last as CreateViewStatement
			columns.addAll(view.viewResultColumns)
			return columns
		}

		// Columns directly declared in the create table statement
		columns.addAll((last as CreateTableStatement).columnDefs)

		// Every table rename and columns associated to that
		while(!tableHistory.empty) {
			val stmt = tableHistory.removeLast
			
			findStatementsOfTypeBetween(typeof(AlterTableAddColumnStatement), stmt, caller)
				.filter([it.table == stmt]).forEach([
					columns.add(it.columnDef)
				])
		}
		
		return columns
	}
	
	def getHistory(TableDefinition ref) {
		var refs = new LinkedList<TableDefinition>()
		
		var current = ref
		
		while(current instanceof AlterTableRenameStatement) {
			refs.add(current)
			current = (current as AlterTableRenameStatement).table
		}
		
		refs.add(current)
		
		return refs
	}
}