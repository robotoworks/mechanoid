package com.robotoworks.mechanoid.net.generator.strategy

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.Member
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.ArrayType
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.UserType
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.WrapWithMember

class MemberDeserializationStatementGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	def generate(Member member, String serializerMemberName, String fromPrefix, String toPrefix, boolean membersAreInternal) {
		generateStatementForType(member, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
	}
	
	def dispatch generateStatementForType(
		TypedMember member, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal) {
			generateStatementForType(member, member.type, serializerMemberName, fromPrefix, toPrefix, membersAreInternal)
		}

	def dispatch generateStatementForType(
		WrapWithMember member, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal) '''
			if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
				JSONObject «member.name.camelize» = «fromPrefix».getJSONObject("«member.name»");
				«FOR litMember:member.literal.members»
				«generateStatementForType(litMember, serializerMemberName, member.name.camelize, toPrefix, membersAreInternal)»
				«ENDFOR»
			}
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
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = «fromPrefix».«type.toJSONPropertyGetMethod»("«member.name»");
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(«fromPrefix».«type.toJSONPropertyGetMethod»("«member.name»"));
			«ENDIF»
		}
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
		ArrayType type, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) {
		generateStatementForArrayType(
			member, 
			type, 
			type.elementType, 
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
			type.genericType,
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
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			«type.signature» targetMember = new «type.signature»();
			«serializerMemberName».get(«type.innerSignature»InputTransformer.class).transform(«fromPrefix».getJSONObject("«member.name»"), targetMember);
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»	
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
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			«type.signature» targetMember = «type.signature».fromValue(«fromPrefix».«declaration.resolveGetJSONValueMethodName»("«member.name»"));
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»	
		}
	'''
		
	def dispatch generateStatementForArrayType(
		TypedMember member, 
		ArrayType type, 
		IntrinsicType element, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
		«context.registerImport("org.json.JSONObject")»
		«context.registerImport("org.json.JSONArray")»
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			JSONArray sourceMember = «fromPrefix».getJSONArray("«member.name»");
			«type.signature» targetMember = new «type.innerSignature»[sourceMember.length()];
			
			for(int i=0; i < sourceMember.length(); i++) {
				targetMember[i] = sourceMember.«element.toJSONPropertyGetMethod»(i);
			}
			
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»
		}
	'''
	
	def dispatch generateStatementForArrayType(
		TypedMember member, 
		ArrayType type, 
		UserType element, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) {
		generateStatementForUserTypeArray(
			member,
			type, 
			element, 
			element.declaration, 
			serializerMemberName,
			fromPrefix,
			toPrefix,
			membersAreInternal
		)
	}
	
	def dispatch generateStatementForUserTypeArray(
		TypedMember member, 
		ArrayType type, 
		UserType element, 
		ComplexTypeDeclaration elementDeclaration, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
		«context.registerImport("org.json.JSONObject")»
		«context.registerImport("org.json.JSONArray")»
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			JSONArray sourceMember = «fromPrefix».getJSONArray("«member.name»");
			«type.signature» targetMember = new «type.innerSignature»[sourceMember.length()];
			
			«serializerMemberName».get(«type.innerSignature»ArrayInputTransformer.class).transform(sourceMember, targetMember);
			
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»	
		}
	'''

	def dispatch generateStatementForUserTypeArray(
		TypedMember member, 
		ArrayType type, 
		UserType element, 
		EnumTypeDeclaration elementDeclaration, 
		String serializerMemberName, 
		String fromPrefix, 
		String toPrefix, 
		boolean membersAreInternal
	) '''
		«context.registerImport("org.json.JSONObject")»
		«context.registerImport("org.json.JSONArray")»
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			JSONArray sourceMember = «fromPrefix».getJSONArray("«member.name»");
			«type.signature» targetMember = new «type.innerSignature»[sourceMember.length()];
			
			for(int i=0; i < sourceMember.length(); i++) {
				«type.innerSignature» element = «type.innerSignature».fromValue(sourceMember.«elementDeclaration.resolveGetJSONValueMethodName»(i));
				targetMember[i] = element;
			}
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»	
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
		«context.registerImport("org.json.JSONObject")»
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			JSONArray sourceMember = «fromPrefix».getJSONArray("«member.name»");
			«member.type.signature» targetMember = new Array«member.type.signature»(sourceMember.length());
			
			for(int i=0; i < sourceMember.length(); i++) {
				targetMember.add(sourceMember.«genericType.toJSONPropertyGetMethod»(i));
			}
			
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»
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
		«context.registerImport("org.json.JSONObject")»
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			JSONArray sourceMember = «fromPrefix».getJSONArray("«member.name»");
			«type.signature» targetMember = new Array«type.signature»(sourceMember.length());
			
			«serializerMemberName».get(«type.innerSignature»ListInputTransformer.class).transform(sourceMember, targetMember);
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»
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
		«context.registerImport("org.json.JSONObject")»
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		if(«fromPrefix».has("«member.name»") && !«fromPrefix».isNull("«member.name»")) {
			JSONArray sourceMember = «fromPrefix».getJSONArray("«member.name»");
			«type.signature» targetMember = new Array«type.signature»(sourceMember.length());
			
			for(int i=0; i < sourceMember.length(); i++) {
				«type.innerSignature» element = «type.innerSignature».fromValue(sourceMember.«genericTypeDeclartion.resolveGetJSONValueMethodName»(i));
				targetMember.add(element);
			}
			«IF(membersAreInternal)»
			«member.toIdentifier.memberize(toPrefix)» = targetMember;
			«ELSE»
			«member.toSetMethodName.memberize(toPrefix)»(targetMember);
			«ENDIF»
		}
	'''	
}