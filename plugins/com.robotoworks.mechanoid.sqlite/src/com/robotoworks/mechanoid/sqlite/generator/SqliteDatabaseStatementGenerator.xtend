package com.robotoworks.mechanoid.sqlite.generator

import com.google.inject.Inject
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer

class SqliteDatabaseStatementGenerator {
	@Inject extension ISerializer
	SaveOptions saveOptions
	
	new () {
		saveOptions = SaveOptions::newBuilder()
				.noValidation
				.options;
	}
	
	def generateStatements(Iterable<DDLStatement> statements) '''
		«FOR stmt : statements»
		db.execSQL(
			«FOR line : stmt.serialize(saveOptions).trim.split("\\r?\\n") SEPARATOR " +"»
			"«line.trim.replaceAll('\\\"', '\\\\\"')» "
			«ENDFOR»
		);
		
		«ENDFOR»
	'''
}