package com.robotoworks.mechanoid.sqlite.scoping

import com.google.common.collect.Lists
import com.robotoworks.mechanoid.sqlite.naming.NameHelper
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSourceRef
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock
import com.robotoworks.mechanoid.sqlite.sqliteModel.DeleteStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTermList
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectSource
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateStatement
import java.util.ArrayList
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.robotoworks.mechanoid.sqlite.sqliteModel.NewColumn
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTriggerStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.OldColumn

public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
	
	@Inject IQualifiedNameProvider nameProvider
	
	def IScope scope_IndexedColumn_columnReference(CreateTableStatement context, EReference reference) {
		
		var inScope = context.eAllContents.filter(typeof(ColumnDef))
		return Scopes::scopeFor(inScope.toIterable, nameProvider, IScope::NULLSCOPE)
	}
	
	def IScope scope_ColumnSourceRef_column(ColumnSourceRef context, EReference reference) {
		
		if(context.source == null) {
			var scope =  buildScopeForColumnSourceRef(context, context)
			
			return scope
		} else {
			if(context.source instanceof SingleSourceTable) {
				var tableSource = context.source as SingleSourceTable
				
				return Scopes::scopeFor(tableSource.tableReference.columnDefs)
			}			
		}
		
		return IScope::NULLSCOPE
	}
	
	def IScope scope_ColumnSourceRef_source(ColumnSourceRef context, EReference reference) {
		var scope = buildScopeForColumnSourceRef_source(context, context)
		
		return scope
	}	
	
	def IScope scope_NewColumn_column(NewColumn context, EReference reference) {
		var trigger = context.findOuter(typeof(CreateTriggerStatement))
		
		if(trigger != null){
			return Scopes::scopeFor(trigger.table.columnDefs)
		}
		
		return IScope::NULLSCOPE
	}
	
	def IScope scope_OldColumn_column(OldColumn context, EReference reference) {
		var trigger = context.findOuter(typeof(CreateTriggerStatement))
		
		if(trigger != null){
			return Scopes::scopeFor(trigger.table.columnDefs)
		}
		
		return IScope::NULLSCOPE
	}
	
	
	def buildScopeForColumnSourceRef(ColumnSourceRef context, EObject parent) {
		
		var EObject temp = parent
		
		while(!(temp.eContainer instanceof DatabaseBlock)) {
			var container = temp.eContainer
			switch container {
				SelectExpression: {
					
					val ArrayList<EObject> items = container.allReferenceableColumns
					
					return Scopes::scopeFor(items, buildScopeForColumnSourceRef(context, container))
				}
				UpdateStatement: {
					return Scopes::scopeFor(container.table.columnDefs, IScope::NULLSCOPE)
				}
				InsertStatement: {
					return Scopes::scopeFor(container.table.columnDefs, IScope::NULLSCOPE)
				}
				DeleteStatement: {
					return Scopes::scopeFor(container.table.columnDefs, IScope::NULLSCOPE)
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
	
	def buildScopeForColumnSourceRef_source(ColumnSourceRef context, EObject parent) {
		
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
		
	def ArrayList<SingleSource> findAllSingleSources(SelectExpression expr) {
		val ArrayList<SingleSource> items = Lists::newArrayList()
		
		items.add(expr.source.source)
		
		for(join : expr.source.joinStatements) {
			items.add(join.singleSource)
		}
		
		return items
	}
	
	def <T extends EObject> T findOuter(EObject obj, Class<T> ancestor) {
		var temp = obj as EObject;
		while(temp.eContainer != null) {
			temp = temp.eContainer
			
			if(ancestor.isAssignableFrom(temp.getClass())) {
				return temp as T
			}
		}
		
		return null
	}
	
	def getAllReferenceableColumns(SelectCoreExpression expr) {
		val ArrayList<EObject> items = Lists::newArrayList()
		
		if(expr instanceof SelectCore) {
			items.addAll(getAllReferenceableColumns((expr as SelectCore).left))
			items.addAll(getAllReferenceableColumns((expr as SelectCore).right))
		} else if (expr instanceof SelectExpression) {
			items.addAll((expr as SelectExpression).allReferenceableColumns)
		}
		
		return items
	}
	
	def getAllReferenceableSingleSources(SelectCoreExpression expr) {
		val ArrayList<EObject> items = Lists::newArrayList()
		
		if(expr instanceof SelectCore) {
			items.addAll(getAllReferenceableSingleSources((expr as SelectCore).left))
			items.addAll(getAllReferenceableSingleSources((expr as SelectCore).right))
		} else if (expr instanceof SelectExpression) {
			items.addAll((expr as SelectExpression).findAllSingleSources)
		}
		
		return items
	}
	
	def getAllReferenceableColumns(SelectExpression expr) {
		val ArrayList<EObject> items = Lists::newArrayList()
		
		if(expr.selectList != null) {
			items.addAll(expr.selectList.resultColumns)
		}
		
		expr.findAllSingleSources.filter([item|
			if(item instanceof SingleSourceTable) {
				return (item as SingleSourceTable).name == null
			}
			return false
		]).forEach([item|
			var source = item as SingleSourceTable
			
			items.addAll(source.tableReference.columnDefs)
		])
		
		return items
	}
}