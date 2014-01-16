package com.robotoworks.mechanoid.net.generator

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.Member
import com.robotoworks.mechanoid.net.netModel.SkipMember
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.UserType
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.lib.Property

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*

class JsonWriterStatementGenerator {
	@Property ImportHelper imports
	
	@Property String writerIdentifier = "target"
	
	@Property String subjectIdentifier = "subject"
	
	@Property String providerIdentifier = "provider"
	
	def genWriteComplexType(ComplexTypeDeclaration decl) {
		genWriteComplexTypeLiteral(decl.literal)
	}
	
	def genWriteComplexTypeLiteral(ComplexTypeLiteral literal) '''
		«genWriteComplexTypeLiteralForMembers(literal.members)»
	'''
	
	def genWriteComplexTypeLiteralForMembers(EList<Member> members) '''
		«writerIdentifier».beginObject();
		
		«FOR member:members»
			«genStatement(member)»
		«ENDFOR»
		
		«writerIdentifier».endObject();
	'''
	
	def dispatch genStatement(TypedMember member) {
		genStatementForType(member, member.type)
	}

	
	def dispatch genStatement(SkipMember skipMember) '''
	
		«writerIdentifier».name("«skipMember.name»");
		
		«genWriteComplexTypeLiteralForMembers(skipMember.literal.members)»
	'''
	
	def dispatch genStatementForType(TypedMember member, IntrinsicType type) '''
		«writerIdentifier».name("«member.name»");
		«writerIdentifier».value(«member.toGetMethodName.memberize(subjectIdentifier)»());
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type) {
		genStatementForType(member, type, type.declaration)
	}
	
	def dispatch genStatementForType(TypedMember member, UserType type, ComplexTypeDeclaration decl) '''
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			«providerIdentifier».get(«type.innerSignature».class).write(«writerIdentifier», «member.toGetMethodName.memberize(subjectIdentifier)»());
		}
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type, EnumTypeDeclaration decl) '''
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			«writerIdentifier».value(«member.toGetMethodName.memberize(subjectIdentifier)»().toString());
		}
	'''
	
	def dispatch genStatementForType(TypedMember member, GenericListType type) {
		genStatementForGenericListType(member, type, type.elementType)
	}
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, IntrinsicType itemType) '''
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil")»
		«imports.addImport("java.util.List")»
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			JsonUtil.write«itemType.boxedTypeSignature»List(«writerIdentifier», «member.toGetMethodName.memberize(subjectIdentifier)»());
		}
	'''
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, UserType itemType) { 
		genStatementForUserTypeGenericList(member, type, itemType, itemType.declaration)
	}
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, ComplexTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			«providerIdentifier».get(«type.innerSignature».class).writeList(«writerIdentifier», «member.toGetMethodName.memberize(subjectIdentifier)»());
		}
	'''
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, EnumTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			
			«writerIdentifier».name("«member.name»");
			
			«writerIdentifier».beginArray();
			
			for(«member.type.innerSignature» element : «member.toGetMethodName.memberize(subjectIdentifier)»()) {
				«writerIdentifier».value(element.toString());
			}
			
			«writerIdentifier».endArray();
		}
	'''
}