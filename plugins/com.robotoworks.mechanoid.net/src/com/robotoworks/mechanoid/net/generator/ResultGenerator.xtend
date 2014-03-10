package com.robotoworks.mechanoid.net.generator

import com.google.inject.Inject
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.HttpMethod
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.Member
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.ResponseBlock
import com.robotoworks.mechanoid.net.netModel.SkipMember
import com.robotoworks.mechanoid.net.netModel.Type
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.UserType
import java.util.HashMap
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import static extension com.robotoworks.mechanoid.text.Strings.*

class ResultGenerator {
	@Inject ImportHelper imports
	@Inject JsonReaderStatementGenerator jsonReaderGenerator
	
	def generate(HttpMethod method, Model model, Client client) {
		jsonReaderGenerator.imports = imports
		jsonReaderGenerator.setReaderIdentifier("reader")
		jsonReaderGenerator.setSubjectIdentifier("subject")
				
		doGenerate(method, model, client)
	}
	
	def doGenerate(HttpMethod method, Model model, Client client) '''
	package «model.packageName»;

	«var classDecl = generateResponseClass(method, model, client)»
	
	import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
	import java.io.IOException;
	import com.robotoworks.mechanoid.net.ServiceResult;
	import java.io.InputStream;
	import com.robotoworks.mechanoid.util.Closeables;
	«imports.printAndClear»
	
	«classDecl»
	'''	
			
	def dispatch generateFieldForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateFieldForMember(member)»
		«ENDFOR»	
	'''
	
	def generateFieldsForMemberList(EList<Member> members) '''
		«FOR member:members»
		«generateFieldForMember(member)»
		«ENDFOR»			
	'''
	
	def dispatch generateFieldForType(IntrinsicType type) '''
		private «type.signature» value;	
	'''
	
	def dispatch generateFieldForType(GenericListType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			private «type.signature» values;
		«ELSE»
			private «type.signature» «type.innerSignature.camelize.pluralize»;
		«ENDIF»
	'''
	
	def dispatch generateFieldForType(UserType type) '''
		private «type.signature» «type.signature.camelize.escapeReserved»;
	'''
	
	def dispatch generateFieldForMember(TypedMember member) '''
	private «member.type.signature» «member.toIdentifier»;
	'''
	
	def dispatch generateFieldForMember(SkipMember member) '''
		«generateFieldForType(member.literal)»
	'''
		
	def dispatch generateGetterForType(ComplexTypeLiteral type) '''
		«generateGettersForMemberList(type.members)»
	'''
	
	def generateGettersForMemberList(EList<Member> members) '''
		«FOR member:members»
		«generateGetter(member)»
		«ENDFOR»	
	'''
	
	def dispatch generateGetterForType(IntrinsicType type) '''
		public «type.signature» getValue(){
			return this.value;
		}
	'''
	
	def dispatch generateGetterForType(GenericListType type) '''
	«IF(type.elementType instanceof IntrinsicType)»
		public «type.signature» getValues(){
			return this.values;
		}
	«ELSE»
		public «type.signature» get«type.innerSignature.pascalize.pluralize»(){
			return this.«type.innerSignature.camelize.pluralize»;
		}
	«ENDIF»
	'''
	
	def dispatch generateGetterForType(UserType type) '''
	public «type.signature» get«type.signature.pascalize»(){
		return this.«type.signature.camelize.escapeReserved»;
	}
	'''
	
	def dispatch generateGetter(TypedMember member) '''
	public «member.type.signature» «member.toGetMethodName»(){
		return this.«member.toIdentifier»;
	}
	public void «member.toSetMethodName»(«member.type.signature» value){
		this.«member.toIdentifier» = value;
	}
	'''
	
	def dispatch generateGetter(SkipMember member) '''
		«generateGetterForType(member.literal)»
	'''
	
	def generateBaseAccessors(Iterable<Member> members) '''
		«FOR member:members»
		«generateBaseAccessor(member)»
		«ENDFOR»	
	'''
	
	def dispatch generateBaseAccessor(SkipMember member) '''
		«generateBaseAccessors(member.literal.members)»
	'''
	
	def dispatch generateBaseAccessor(TypedMember member) '''
		«IF member.type instanceof GenericListType»«imports.addImport("java.util.List")»«ENDIF»
		public «member.type.signature» «member.toGetMethodName»(){
			return base.«member.toGetMethodName»();
		}
		public void «member.toSetMethodName»(«member.type.signature» value){
			base.«member.toSetMethodName»(value);
		}
	'''
		
	def generateResponseClass(HttpMethod method, Model module, Client client) '''
	«val responseBlock = method.responseBlock»
	public class «method.name.pascalize»Result extends ServiceResult {
		«IF (responseBlock?.type != null)»
			«generateFieldForType(responseBlock.type)»	
			«generateGetterForType(responseBlock.type)»	
		«ENDIF»
		«IF responseBlock?.superType != null»
			private «responseBlock.superType.name.pascalize» base;
			«generateBaseAccessors(responseBlock.superType.literal.members.filter[superMember|
				if(responseBlock?.type instanceof ComplexTypeLiteral) {
					return (responseBlock.type as ComplexTypeLiteral).members.findFirst[member|
						superMember.name.equals(member.name)
					] == null
				}
				return true
			])»
		«ENDIF»
		
		public «method.name.pascalize»Result(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		«IF (responseBlock != null)»
			«IF(responseBlock.type instanceof ComplexTypeLiteral || responseBlock.superType != null)»
				«generateDeserializationStatementHeader(true)»
					«IF responseBlock.superType != null»
					this.base = new «responseBlock.superType.name.pascalize»();
					«ENDIF»
					«IF responseBlock.type instanceof ComplexTypeLiteral»
					«method.name.pascalize»Result subject = this;
					«jsonReaderGenerator.genReadComplexTypeLiteralForMembers(
						(responseBlock.type as ComplexTypeLiteral).mergeMembers(responseBlock?.superType?.literal)
					)»
					«ENDIF»
				«generateDeserializationStatementFooter(true)»
			«ELSE»
				«generateDeserializationStatementForType(responseBlock, responseBlock.type as Type)»
			«ENDIF»
		«ELSE»
		Closeables.closeSilently(inStream);
		«ENDIF»
		}
	}
	'''
	
	def generateDeserializationStatementHeader(boolean withReader)'''
		«IF withReader»
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonReader")»
		«imports.addImport("java.io.InputStreamReader")»
		«imports.addImport("java.io.BufferedReader")»
		«imports.addImport("java.nio.charset.Charset")»
			JsonReader reader = null;
			«ENDIF»
			try {
				if(inStream != null) {
					«IF withReader»
					reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
					«ENDIF»
	'''
	
	def generateDeserializationStatementFooter(boolean withReader)'''
				}
			} finally {
				«IF withReader»
				Closeables.closeSilently(reader);
				«ELSE»
				Closeables.closeSilently(inStream);
				«ENDIF»
			}
	'''
	
	def EList<Member> mergeMembers(ComplexTypeLiteral a, ComplexTypeLiteral b) { 
		var members = new HashMap<String, Member>()
		
		if(a != null) {
			for(m : a.members) {
				members.put(m.name, m)
			}
		}
		
		if(b != null) {
			for(m : b.members) {
				if(!members.containsKey(m.name)) {
					members.put(m.name, m)
				}
			}
		}

		return new BasicEList<Member>(members.values);
	}
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, IntrinsicType type) '''
		«imports.addImport("com.robotoworks.mechanoid.util.Streams")»
		«generateDeserializationStatementHeader(false)»
				String source = Streams.readAllText(inStream);
				
				this.value = «type.boxedTypeSignature».valueOf(source);
		«generateDeserializationStatementFooter(false)»
	'''
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, UserType type) {
		generateDeserializationStatementForUserType(response, type, type.declaration);
	}
	
	def dispatch generateDeserializationStatementForUserType(ResponseBlock response, UserType type, ComplexTypeDeclaration declaration) '''
		«generateDeserializationStatementHeader(true)»
				this.«type.signature.camelize» = new «type.signature»();
				provider.get(«type.signature».class).read(reader, this.«type.signature.camelize»);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForUserType(ResponseBlock response, UserType type, EnumTypeDeclaration declaration) '''
		«imports.addImport("com.robotoworks.mechanoid.util.Streams")»
		«generateDeserializationStatementHeader(false)»
				String source = Streams.readAllText(inStream);
				this.«type.signature.camelize» = «type.signature».fromValue(source);
		«generateDeserializationStatementFooter(false)»
	'''

	def dispatch generateDeserializationStatementForType(ResponseBlock response, GenericListType type) {
		generateDeserializationStatementForGenericListType(response, type, type.elementType);
	}
	
	def dispatch generateDeserializationStatementForGenericListType(ResponseBlock response, GenericListType type, IntrinsicType genericType) '''
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil")»
		«imports.addImport("java.util.List")»
		«generateDeserializationStatementHeader(true)»
				this.values = JsonUtil.read«genericType.boxedTypeSignature»List(reader);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForGenericListType(ResponseBlock response, GenericListType type, UserType genericType) {
		generateDeserializationStatementForUserTypeGenericList(response, type, genericType, genericType.declaration);
	}
	
	def dispatch generateDeserializationStatementForUserTypeGenericList(
		ResponseBlock response, 
		GenericListType type, 
		UserType genericType,
		ComplexTypeDeclaration declaration
	) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		«generateDeserializationStatementHeader(true)»
				this.«type.innerSignature.camelize.pluralize» = new ArrayList<«type.innerSignature»>();
				provider.get(«type.innerSignature».class).readList(reader, this.«type.innerSignature.camelize.pluralize»);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForUserTypeGenericList(
		ResponseBlock response, 
		GenericListType type, 
		UserType genericType,
		EnumTypeDeclaration declaration
	) '''
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«imports.addImport("java.util.ArrayList")»
		«imports.addImport("java.util.List")»
		«generateDeserializationStatementHeader(true)»
				this.«type.innerSignature.camelize.pluralize» = new Array«type.signature»();
				
				if(reader.peek() != JsonToken.NULL) {
					
					reader.beginArray();
					
					while(reader.hasNext()) {
						«type.innerSignature» element = «type.innerSignature».fromValue(reader.«declaration.resolveJsonReaderMethodName»());
						this.«type.innerSignature.camelize.pluralize».add(element);
					}
					
					reader.endArray();
				}
		«generateDeserializationStatementFooter(true)»
	'''
}