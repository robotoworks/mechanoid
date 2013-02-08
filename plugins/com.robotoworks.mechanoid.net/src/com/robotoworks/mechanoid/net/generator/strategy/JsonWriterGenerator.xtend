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

class JsonWriterGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	
	
	def genWriteComplexType(ComplexTypeDeclaration decl) {
		genWriteComplexTypeLiteral(decl.literal)
	}
	
	def genWriteComplexTypeLiteral(ComplexTypeLiteral literal) '''
		«genWriteComplexTypeLiteralForMembers(literal.members)»
	'''
	
	def genWriteComplexTypeLiteralForMembers(EList<Member> members) '''
		target.beginObject();
		
		«FOR member:members»
			«genStatement(member)»
		«ENDFOR»
		
		target.endObject();
	'''
	
	def dispatch genStatement(TypedMember member) {
		genStatementForType(member, member.type)
	}

	
	def dispatch genStatement(SkipMember skipMember) '''
	
		target.name("«skipMember.name»");
		
		«genWriteComplexTypeLiteralForMembers(skipMember.literal.members)»
	'''
	
	def dispatch genStatementForType(TypedMember member, IntrinsicType type) '''
		target.name("«member.name»");
		target.value(«member.toGetMethodName.memberize("subject")»());
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type) {
		genStatementForType(member, type, type.declaration)
	}
	
	def dispatch genStatementForType(TypedMember member, UserType type, ComplexTypeDeclaration decl) '''
		if(«member.toGetMethodName.memberize("subject")»() != null) {
			target.name("«member.name»");
			provider.get(«type.innerSignature»Transformer.class).transformOut(«member.toGetMethodName.memberize("subject")»(), target);
		}
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type, EnumTypeDeclaration decl) '''
		if(«member.toGetMethodName.memberize("subject")»() != null) {
			target.name("«member.name»");
			target.value(«member.toGetMethodName.memberize("subject")»().toString());
		}
	'''
	
	def dispatch genStatementForType(TypedMember member, GenericListType type) {
		genStatementForGenericListType(member, type, type.elementType)
	}
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, IntrinsicType itemType) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonUtil")»
		«context.registerImport("java.util.List")»
		if(«member.toGetMethodName.memberize("subject")»() != null) {
			target.name("«member.name»");
			JsonUtil.write«itemType.boxedTypeSignature»List(target, «member.toGetMethodName.memberize("subject")»());
		}
	'''
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, UserType itemType) { 
		genStatementForUserTypeGenericList(member, type, itemType, itemType.declaration)
	}
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, ComplexTypeDeclaration decl) '''
		«context.registerImport("java.util.List")»
		if(«member.toGetMethodName.memberize("subject")»() != null) {
			target.name("«member.name»");
			provider.get(«type.innerSignature»Transformer.class).transformOut(«member.toGetMethodName.memberize("subject")»(), target);
		}
	'''
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, EnumTypeDeclaration decl) '''
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		
		if(«member.toGetMethodName.memberize("subject")»() != null) {
			
			target.name("«member.name»");
			
			target.beginArray();
			
			for(«member.type.innerSignature» element : «member.toGetMethodName.memberize("subject")»()) {
				target.value(element.toString());
			}
			
			target.endArray();
		}
	'''
}