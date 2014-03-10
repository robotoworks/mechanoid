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
import com.robotoworks.mechanoid.net.netModel.BooleanType

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import static extension com.robotoworks.mechanoid.text.Strings.*

class JsonReaderStatementGenerator {
	@Property ImportHelper imports
	
	/*
	 * The identifier of the JSONReader instance
	 */
	@Property String readerIdentifier = "source"
	
	/*
	 * The identifier of the reader subject (the entity the reader is
	 * setting data to)
	 */
	@Property String subjectIdentifier = "entity"
	
	@Property String providerIdentifier = "provider"
	
	def genReadComplexType(ComplexTypeDeclaration decl) {
		genReadComplexTypeLiteral(decl.literal)
	}
	
	def genReadComplexTypeLiteral(ComplexTypeLiteral literal) '''
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«readerIdentifier».beginObject();
		
		while(«readerIdentifier».hasNext()) {
			String name = «readerIdentifier».nextName();
			
			if(«readerIdentifier».peek() == JsonToken.NULL) {
				«readerIdentifier».skipValue();
				continue;
			}
			
			«var COUNTER = 0»
			«FOR member : literal.members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				«readerIdentifier».skipValue();
			}
			«ENDIF»
		}
		
		«readerIdentifier».endObject();
	'''
	
	def genReadComplexTypeLiteralForMembers(EList<Member> members) '''
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«readerIdentifier».beginObject();
		
		while(«readerIdentifier».hasNext()) {
			String name = «readerIdentifier».nextName();

			if(«readerIdentifier».peek() == JsonToken.NULL) {
				«readerIdentifier».skipValue();
				continue;
			}
						
			«var COUNTER = 0»
			«FOR member : members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				«readerIdentifier».skipValue();
			}
			«ENDIF»
		}
		
		«readerIdentifier».endObject();
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
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«readerIdentifier».beginObject();
		
		while(«readerIdentifier».hasNext()) {
			name = «readerIdentifier».nextName();

			if(«readerIdentifier».peek() == JsonToken.NULL) {
				«readerIdentifier».skipValue();
				continue;
			}
			
			«var COUNTER = 0»
			«FOR member : skipMember.literal.members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				«readerIdentifier».skipValue();
			}
			«ENDIF»
		}
		
		«readerIdentifier».endObject();
	'''
	
	def dispatch genStatementForType(TypedMember member, IntrinsicType type) '''
		«IF type instanceof BooleanType»
		«imports.addImport("com.robotoworks.mechanoid.net.JsonReaderUtil")»
		«member.toSetMethodName.memberize(subjectIdentifier)»(JsonReaderUtil.coerceNextBoolean(«readerIdentifier»));
		«ELSE»
		«member.toSetMethodName.memberize(subjectIdentifier)»(«readerIdentifier».next«type.signature.pascalize»());
		«ENDIF»
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type) {
		genStatementForType(member, type, type.declaration)
	}
	
	def dispatch genStatementForType(TypedMember member, UserType type, ComplexTypeDeclaration decl) '''
		«type.signature» entityMember = new «type.signature»();
		«providerIdentifier».get(«type.innerSignature».class).read(«readerIdentifier», entityMember);
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForType(TypedMember member, UserType type, EnumTypeDeclaration decl) '''
		«type.signature» entityMember = «type.signature».fromValue(«readerIdentifier».«decl.resolveJsonReaderMethodName»());
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForType(TypedMember member, GenericListType type) {
		genStatementForGenericListType(member, type, type.elementType)
	}
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, IntrinsicType itemType) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil")»
		List<«itemType.boxedTypeSignature»> entityMember = JsonUtil.read«itemType.boxedTypeSignature»List(«readerIdentifier»);
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForGenericListType(TypedMember member, GenericListType type, UserType itemType) { 
		genStatementForUserTypeGenericList(member, type, itemType, itemType.declaration)
	}
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, ComplexTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		«type.signature» entityMember = new ArrayList<«type.innerSignature»>();
		«providerIdentifier».get(«type.innerSignature».class).readList(«readerIdentifier», entityMember);
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForUserTypeGenericList(TypedMember member, GenericListType type, UserType itemType, EnumTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«type.signature» entityMember = new ArrayList«type.signature»();
		
		«readerIdentifier».beginArray();
		
		while(«readerIdentifier».hasNext()) {
			«type.innerSignature» element = «type.innerSignature».fromValue(«readerIdentifier».«decl.resolveJsonReaderMethodName»());
			targetMember.add(element);
		}
		
		«readerIdentifier».endArray();
		
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
}