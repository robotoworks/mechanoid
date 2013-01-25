package com.robotoworks.mechanoid.sqlite.scoping

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll

public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
	
//	def IScope scope_ResultColumnAll_source(ResultColumnAll context, EReference reference) {
//		
//		var tableSources = EcoreUtil::getRootContainer(context).eAllContents.filter(typeof(CreateTableStatement))
//
//		return Scopes::scopeFor(tableSources.toIterable)
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