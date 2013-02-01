package com.robotoworks.mechanoid.sqlite.util

import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

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
	
	def static <T extends DDLStatement> T findFirstPreviousStatementOfType(DDLStatement stmt, Class<T> statementType) {
		var current = stmt as EObject
		var MigrationBlock migration = null
		
		do {
			while(EcoreUtil2::getPreviousSibling(current) != null) {
				current = EcoreUtil2::getPreviousSibling(current)
				
				if(statementType.isAssignableFrom(current.getClass())) {
					return current as T
				}
			}
			
			migration = EcoreUtil2::getPreviousSibling(current.eContainer) as MigrationBlock
		} while (migration != null)
		
		return null	
	}
}