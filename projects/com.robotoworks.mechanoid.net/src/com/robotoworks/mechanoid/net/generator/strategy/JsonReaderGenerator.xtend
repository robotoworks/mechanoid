package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.Member
import com.robotoworks.mechanoid.net.netModel.SkipMember
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.UserType

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import org.eclipse.emf.common.util.EList

class JsonReaderGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	
	
	def genReadComplexType(ComplexTypeDeclaration decl) {
		genReadComplexTypeLiteral(decl.literal)
	}
	
	def genReadComplexTypeLiteral(ComplexTypeLiteral literal) '''
		source.beginObject();
		
		while(source.hasNext()) {
			String name = source.nextName();
			
			«var COUNTER = 0»
			«FOR member : literal.members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
		}
		
		source.endObject();
	'''
	
	def genReadComplexTypeLiteralForMembers(EList<Member> members) '''
		source.beginObject();
		
		while(source.hasNext()) {
			String name = source.nextName();
			
			«var COUNTER = 0»
			«FOR member : members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
		}
		
		source.endObject();
	'''

	
	def genBlock(Member member, int blockNumber) '''
		«IF blockNumber > 1»else «ENDIF»if(name.equals("«member.name»")) {
			«genStatement(member)»
		}
	''' 
	
	def dispatch genStatement(TypedMember member) {
		genStatementForType(member, member.type)
	}

	
	def dispatch genStatement(SkipMember skipMember) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		if(source.peek() != JsonToken.NULL) {
			source.beginObject();
			
			while(source.hasNext()) {
				name = source.nextName();
				
				«var COUNTER = 0»
				«FOR member : skipMember.literal.members»
				«genBlock(member, COUNTER = COUNTER + 1)»
				«ENDFOR»
			}
			
			source.endObject();
		}
	'''
	
	def dispatch genStatementForType(TypedMember member, IntrinsicType type) '''
		«member.toSetMethodName.memberize("target")»(source.next«type.signature.pascalize»());
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type) {
		genStatementForType(member, type, type.declaration)
	}
	
	def dispatch genStatementForType(TypedMember member, UserType type, ComplexTypeDeclaration decl) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		if(source.peek() != JsonToken.NULL) {
			«type.signature» targetMember = provider.get(«type.innerSignature»InputTransformer.class).transform(source);
			«member.toSetMethodName.memberize("target")»(targetMember);
		}
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type, EnumTypeDeclaration decl) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		if(source.peek() != JsonToken.NULL) {
			«type.signature» targetMember = «type.signature».fromValue(source.«decl.resolveJsonReaderMethodName»());
			«member.toSetMethodName.memberize("target")»(targetMember);
		}
	'''
	
	def dispatch genStatementForType(TypedMember member, GenericListType type) {
		genStatementForGenericListType(member, type, type.elementType)
	}
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, IntrinsicType itemType) '''
		«context.registerImport("java.util.List")»
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		if(source.peek() != JsonToken.NULL) {
			List<«itemType.boxedTypeSignature»> targetMember = JsonUtil.read«itemType.boxedTypeSignature»List(source);
			«member.toSetMethodName.memberize("target")»(targetMember);
		}
	'''
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, UserType itemType) { 
		genStatementForUserTypeGenericList(member, type, itemType, itemType.declaration)
	}
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, ComplexTypeDeclaration decl) '''
		«context.registerImport("java.util.List")»
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		if(source.peek() != JsonToken.NULL) {
			«type.signature» targetMember = provider.get(«type.innerSignature»ListInputTransformer.class).transform(source);
			«member.toSetMethodName.memberize("target")»(targetMember);
		}
	'''
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, EnumTypeDeclaration decl) '''
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«type.signature» targetMember = new Array«type.signature»();
		
		if(source.peek() != JsonToken.NULL) {
			
			source.beginArray();
			
			while(source.hasNext()) {
				«type.innerSignature» element = «type.innerSignature».fromValue(source.«decl.resolveJsonReaderMethodName»());
				targetMember.add(element);
			}
			
			source.endArray();
		}
		«member.toSetMethodName.memberize("target")»(targetMember);
	'''
}