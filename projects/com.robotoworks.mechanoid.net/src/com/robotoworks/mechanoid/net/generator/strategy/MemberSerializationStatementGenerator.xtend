package com.robotoworks.mechanoid.net.generator.strategy

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.Member
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.UserType
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.SkipMember
import com.robotoworks.mechanoid.net.netModel.TypedMember

class MemberSerializationStatementGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
		
	def formatFromMemberIdentifier(Member member, String serializerMemberName, String fromPrefix, boolean membersAreInternal){
		fromPrefix + "." + member.toIdentifierOrGetMethodName(!membersAreInternal).maybeMethodize(!membersAreInternal)
	}
	
	def generate(Member member, String serializerMemberName, String fromPrefix, String toPrefix, boolean membersAreInternal) {
		generateStatementForType(
			member, 
			serializerMemberName, 
			fromPrefix, 
			toPrefix, 
			membersAreInternal
		);
	}
	
	def dispatch generateStatementForType(
		TypedMember member, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal) {
			generateStatementForType(
				member, 
				member.type, 
				serializerMemberName, 
				fromPrefix, 
				toPrefix, 
				membersAreInternal
			);			
		}
		
	def dispatch generateStatementForType(
		SkipMember member, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal) '''
		«context.registerImport("org.json.JSONObject")»
		JSONObject «member.name.camelize» = new JSONObject();
		«toPrefix».putOpt("«member.name»", «member.name.camelize»);
		«FOR litMember:member.literal.members»
			«generateStatementForType(litMember, serializerMemberName, fromPrefix, member.name.camelize, membersAreInternal)»
		«ENDFOR»
	'''
	
	def dispatch generateStatementForType(
		TypedMember member, 
		IntrinsicType type, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
	«context.registerImport("org.json.JSONObject")»
	«toPrefix».putOpt("«member.name»", «formatFromMemberIdentifier(member, serializerMemberName, fromPrefix, membersAreInternal)»);
	'''

	def dispatch generateStatementForType(
		TypedMember member, 
		UserType type, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) {
		generateStatementForUserType(
			member, 
			type, 
			type.declaration, 
			serializerMemberName, 
			fromPrefix, 
			toPrefix, 
			membersAreInternal
		)
	}
	
	def dispatch generateStatementForType(
		TypedMember member, 
		GenericListType type, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) {
		generateStatementForGenericListType(
			member,
			type,
			type.elementType,
			serializerMemberName,
			fromPrefix,
			toPrefix,
			membersAreInternal	
		)
	}
	
	def dispatch generateStatementForUserType(
		TypedMember member, 
		UserType type, 
		ComplexTypeDeclaration declaration, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
		«context.registerImport("org.json.JSONObject")»
		«var memberRef = formatFromMemberIdentifier(member, serializerMemberName, fromPrefix, membersAreInternal)»
		if(«memberRef» != null) {
			JSONObject targetMember = «serializerMemberName».get(«type.innerSignature»OutputTransformer.class).transform(«memberRef»);
			«toPrefix».put("«member.name»", targetMember);
		}
	'''
	
	def dispatch generateStatementForUserType(
		TypedMember member, 
		UserType type, 
		EnumTypeDeclaration declaration, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
		«context.registerImport("org.json.JSONObject")»
		«var memberRef = formatFromMemberIdentifier(member, serializerMemberName, fromPrefix, membersAreInternal)»
		if(«memberRef» != null) {
			«toPrefix».put("«member.name»", «memberRef».getValue());
		}
	'''
					
	def dispatch generateStatementForGenericListType(
		TypedMember member, 
		GenericListType type, 
		IntrinsicType genericType,
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	)'''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«var memberRef = formatFromMemberIdentifier(member, serializerMemberName, fromPrefix, membersAreInternal)»
		if(«memberRef» != null) {
			JSONArray targetMember = new JSONArray(«memberRef»);
			«toPrefix».put("«member.name»", targetMember);	
		}
	'''
				
	def dispatch generateStatementForGenericListType(
		TypedMember member, 
		GenericListType type, 
		UserType genericType,
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) {
		generateStatementForUserTypeGenericList(
			member,
			type,
			genericType,
			genericType.declaration,
			serializerMemberName,
			fromPrefix,
			toPrefix,
			membersAreInternal
		)
	}
		
	def dispatch generateStatementForUserTypeGenericList(
		TypedMember member, 
		GenericListType type, 
		UserType genericType,
		ComplexTypeDeclaration genericTypeDeclartion,
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«var memberRef = formatFromMemberIdentifier(member, serializerMemberName, fromPrefix, membersAreInternal)»
		if(«memberRef» != null) {
			JSONArray targetMember = «serializerMemberName».get(«type.innerSignature»ListOutputTransformer.class).transform(«memberRef»);
			«toPrefix».put("«member.name»", targetMember);
		}
	'''

	def dispatch generateStatementForUserTypeGenericList(
		TypedMember member, 
		GenericListType type, 
		UserType genericType,
		EnumTypeDeclaration genericTypeDeclartion,
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«var memberRef = formatFromMemberIdentifier(member, serializerMemberName, fromPrefix, membersAreInternal)»
		if(«memberRef» != null) {
			JSONArray targetMember = new JSONArray();
			for(«member.type.innerSignature» element:«memberRef») {
				targetMember.put(element.getValue());
			}
			«toPrefix».put("«member.name»", targetMember);
		}
	'''
}