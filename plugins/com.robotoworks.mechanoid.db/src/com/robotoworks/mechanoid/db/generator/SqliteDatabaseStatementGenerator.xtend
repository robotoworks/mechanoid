package com.robotoworks.mechanoid.db.generator

import com.google.inject.Inject
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement
import java.util.Collection
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement
import com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement
import java.util.regex.Pattern

class SqliteDatabaseStatementGenerator {
	@Inject extension ISerializer
	SaveOptions saveOptions
	
	val stripCommentsExpr = Pattern::compile("\\/\\/[^\\r\\n]+|\\/\\*.*?\\*\\/", Pattern::DOTALL);
	
	new () {
		saveOptions = SaveOptions::newBuilder()
				.noValidation
				.options;
	}
	
	def generateStatements(Collection<DDLStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateTableStatements(Collection<CreateTableStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateViewStatements(Collection<CreateViewStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateTriggerStatements(Collection<CreateTriggerStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateIndexStatements(Collection<CreateIndexStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateStatement(DDLStatement stmt) '''
		db.execSQL(
			«FOR line : stmt.serialize(saveOptions).stripComments.trim.split("\\r?\\n") SEPARATOR " +"»
			"«line.trim.replaceAll('\\\"', '\\\\\"')» "
			«ENDFOR»
		);	
	'''
	
	def stripComments(String s) {
	    stripCommentsExpr.matcher(s).replaceAll("")
	}
}