package com.robotoworks.mechanoid.sqlite.scoping

import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSource

public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
	
	def IScope scope_IndexedColumn_columnReference(CreateTableStatement context, EReference reference) {
		
		var inScope = context.eAllContents.filter(typeof(ColumnDef))
		return Scopes::scopeFor(inScope.toIterable)
	}
	
//	def IScope scope_ColumnSource_column(ResultColumnExpression context, EReference reference) {
//		
//		var select = context.eContainer as SelectExpression
//		val columnSource = reference.eContainer as ColumnSource
//		
//		select.source.eAllContents.filter(typeof(SingleSource)).forEach([
//			if(it instanceof SingleSourceTable) {
//				if(columnSource.source != null && columnSource.source.name) {
//					
//				}
//				var tableSource = it as SingleSourceTable
//				tableSource.tableReference
//			}
//		])
//		
//		var inScope = context.eAllContents.filter(typeof(ColumnDef))
//		return Scopes::scopeFor(inScope.toIterable)
//	}
	
//	def IScope scope_ResultColumn_table(ResultColumn context, EReference reference) {
//		
//		var IScope scope = IScope::NULLSCOPE
//		
//		var SelectCore container = context.eContainer as SelectCore
//		var tableSources = container.eAllContents.filter(typeof(TableSource))	
//		
//		scope = Scopes::scopeFor(tableSources.toIterable)		
//		
//		return scope
//	}
//	
//	def IScope scope_ResultColumn_column(ResultColumn context,
//			EReference reference) {
//				
//				var IScope scope = IScope::NULLSCOPE
//
//				if(context.table == null) {
//					var SelectCore container = context.eContainer as SelectCore
//					
//					var tableSources = container.eAllContents.filter(typeof(TableSource))
//					
//					var ArrayList<ColumnDef> cols = Lists::newArrayList()
//					
//					for(s : tableSources.toIterable) {
//						cols.addAll(s.table.columnDefs)
//					}
//					
//					scope = Scopes::scopeFor(cols)
//					
//				}
//				
//				return scope
//	}

}