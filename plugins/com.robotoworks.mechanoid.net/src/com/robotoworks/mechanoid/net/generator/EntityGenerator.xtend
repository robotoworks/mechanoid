package com.robotoworks.mechanoid.net.generator

import com.google.inject.Inject
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.SkipMember
import com.robotoworks.mechanoid.net.netModel.TypedMember

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*

class EntityGenerator {
	@Inject ImportHelper imports
	
	def generate(ComplexTypeDeclaration type, Model module) '''
	package «module.packageName»;
	
	import android.content.ContentValues;
	import com.robotoworks.mechanoid.db.ContentValuesUtil;
	import java.util.Map;
	
	«var classDecl = generateType(type, module)»
	«imports.printAndClear»
	«classDecl»
	'''
	
	def generateType(ComplexTypeDeclaration type, Model module) '''
	public class «type.name» {
	    
        «FOR member:type.literal.members»
        «generateKeyConstant(member)»
        «ENDFOR»

		«FOR member:type.literal.members»
		«generateField(member)»
		«ENDFOR»
		
		«FOR member:type.literal.members»
		«generateGetterAndSetter(member)»
		«ENDFOR»
		
		public ContentValues toContentValues() {
		    return toContentValues(null);
		}
		
		public ContentValues toContentValues(Map<String, String> map) {
		    ContentValues values = new ContentValues();
		    
            «FOR member:type.literal.members»
            «generatePutValuesStatement(member)»
            «ENDFOR»
	
	        return values;
		}
	}
	'''
	
	def dispatch generateField(TypedMember member) '''
		private «member.type.signature» «member.toIdentifier»;
		«IF(member.type instanceof GenericListType)»«imports.addImport("java.util.List")»«ENDIF»	
	'''
	
	def dispatch generateField(SkipMember skipper) '''
		«FOR member:skipper.literal.members»
		«generateField(member)»
		«ENDFOR»
	'''
	
	def dispatch generatePutValuesStatement(TypedMember member) '''
	ContentValuesUtil.putMapped(KEY_«member.name.toUpperCase», map, values, «member.toIdentifier»);
	'''
	
	def dispatch generatePutValuesStatement(SkipMember skipper) '''
		«FOR member:skipper.literal.members»
		«generateField(member)»
		«ENDFOR»
	'''
	
	def dispatch generateGetterAndSetter(TypedMember member) '''
		public «member.type.signature» «member.toGetMethodName»(){
			return «member.toIdentifier»;
		}
		public void «member.toSetMethodName»(«member.type.signature» value){
			this.«member.toIdentifier» = value;
		}
	'''
	
	def dispatch generateGetterAndSetter(SkipMember skipper) '''
		«FOR member:skipper.literal.members»
		«generateGetterAndSetter(member)»
		«ENDFOR»
	'''
	
	def dispatch generateKeyConstant(TypedMember member) '''
        public static final String KEY_«member.name.toUpperCase» = "«member.name»";
    '''
    
    def dispatch generateKeyConstant(SkipMember skipper) '''
        «FOR member:skipper.literal.members»
        «generateField(member)»
        «ENDFOR»
    '''
}