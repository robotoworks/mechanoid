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
import static extension com.robotoworks.mechanoid.text.Strings.*

import org.eclipse.emf.common.util.EList
import com.robotoworks.mechanoid.net.netModel.BooleanType

class JsonReaderGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	
	
	def genReadComplexType(ComplexTypeDeclaration decl) {
		genReadComplexTypeLiteral(decl.literal)
	}
	
	def genReadComplexTypeLiteral(ComplexTypeLiteral literal) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		source.beginObject();
		
		while(source.hasNext()) {
			String name = source.nextName();
			
			if(source.peek() == JsonToken.NULL) {
				source.skipValue();
				continue;
			}
			
			«var COUNTER = 0»
			«FOR member : literal.members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				source.skipValue();
			}
			«ENDIF»
		}
		
		source.endObject();
	'''
	
	def genReadComplexTypeLiteralForMembers(EList<Member> members) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		source.beginObject();
		
		while(source.hasNext()) {
			String name = source.nextName();

			if(source.peek() == JsonToken.NULL) {
				source.skipValue();
				continue;
			}
						
			«var COUNTER = 0»
			«FOR member : members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				source.skipValue();
			}
			«ENDIF»
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
		source.beginObject();
		
		while(source.hasNext()) {
			name = source.nextName();

			if(source.peek() == JsonToken.NULL) {
				source.skipValue();
				continue;
			}
			
			«var COUNTER = 0»
			«FOR member : skipMember.literal.members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				source.skipValue();
			}
			«ENDIF»
		}
		
		source.endObject();
	'''
	
	def dispatch genStatementForType(TypedMember member, IntrinsicType type) '''
		«IF type instanceof BooleanType»
		«context.registerImport("com.robotoworks.mechanoid.net.JsonReaderUtil")»
		«member.toSetMethodName.memberize("subject")»(JsonReaderUtil.coerceNextBoolean(source));
		«ELSE»
		«member.toSetMethodName.memberize("subject")»(source.next«type.signature.pascalize»());
		«ENDIF»
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type) {
		genStatementForType(member, type, type.declaration)
	}
	
	def dispatch genStatementForType(TypedMember member, UserType type, ComplexTypeDeclaration decl) '''
		«type.signature» subjectMember = new «type.signature»();
		provider.get(«type.innerSignature»Transformer.class).transformIn(source, subjectMember);
		«member.toSetMethodName.memberize("subject")»(subjectMember);
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type, EnumTypeDeclaration decl) '''
		«type.signature» subjectMember = «type.signature».fromValue(source.«decl.resolveJsonReaderMethodName»());
		«member.toSetMethodName.memberize("subject")»(subjectMember);
	'''
	
	def dispatch genStatementForType(TypedMember member, GenericListType type) {
		genStatementForGenericListType(member, type, type.elementType)
	}
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, IntrinsicType itemType) '''
		«context.registerImport("java.util.List")»
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonUtil")»
		List<«itemType.boxedTypeSignature»> subjectMember = JsonUtil.read«itemType.boxedTypeSignature»List(source);
		«member.toSetMethodName.memberize("subject")»(subjectMember);
	'''
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, UserType itemType) { 
		genStatementForUserTypeGenericList(member, type, itemType, itemType.declaration)
	}
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, ComplexTypeDeclaration decl) '''
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		«type.signature» subjectMember = new ArrayList<«type.innerSignature»>();
		provider.get(«type.innerSignature»Transformer.class).transformIn(source, subjectMember);
		«member.toSetMethodName.memberize("subject")»(subjectMember);
	'''
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, EnumTypeDeclaration decl) '''
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«type.signature» subjectMember = new ArrayList«type.signature»();
		
		source.beginArray();
		
		while(source.hasNext()) {
			«type.innerSignature» element = «type.innerSignature».fromValue(source.«decl.resolveJsonReaderMethodName»());
			targetMember.add(element);
		}
		
		source.endArray();
		
		«member.toSetMethodName.memberize("subject")»(subjectMember);
	'''
}