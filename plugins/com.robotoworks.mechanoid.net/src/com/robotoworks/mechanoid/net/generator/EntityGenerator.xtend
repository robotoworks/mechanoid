package com.robotoworks.mechanoid.net.generator

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.SkipMember
import com.google.inject.Inject

class EntityGenerator {
	@Inject ImportHelper imports
	
	def generate(ComplexTypeDeclaration type, Model module) '''
	package «module.packageName»;
	
	«var classDecl = generateType(type, module)»
	«imports.printAndClear»
	«classDecl»
	'''
	
	def generateType(ComplexTypeDeclaration type, Model module) '''
	public class «type.name» {
		«FOR member:type.literal.members»
		«generateField(member)»
		«ENDFOR»
		
		«FOR member:type.literal.members»
		«generateGetterAndSetter(member)»
		«ENDFOR»
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
}