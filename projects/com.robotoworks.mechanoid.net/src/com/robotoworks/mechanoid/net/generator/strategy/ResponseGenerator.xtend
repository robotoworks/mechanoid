package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
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
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*

class ResponseGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	JsonReaderGenerator jsonReaderGenerator
	
	def setJsonReaderGenerator(JsonReaderGenerator jsonReaderGenerator){
		this.jsonReaderGenerator = jsonReaderGenerator;
	}

	def registerImports(){
		context.registerImport("com.robotoworks.mechanoid.net.TransformerProvider")
		context.registerImport("com.robotoworks.mechanoid.net.TransformException")
		context.registerImport("java.io.InputStream")
		context.registerImport("com.robotoworks.mechanoid.util.Closeables")
	}
	
	def generate(HttpMethod method, Model module, Client client) '''
	package «module.packageName»;

	«var body = generateResponseClass(method, module, client)»
	«registerImports»
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''	
			
	def dispatch generateFieldForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
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
		«FOR member:type.members»
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
	
	
	def generateResponseClass(HttpMethod method, Model module, Client client) '''
	public class «method.name.pascalize»Response «IF(method.response != null && method.response.superType != null)»extends «method.response.superType.name»«ENDIF» {
		«IF (method.response?.type != null)»
			«generateFieldForType(method.response.type)»	
			«generateGetterForType(method.response.type)»	
		«ENDIF»
		
		public «method.name.pascalize»Response(TransformerProvider provider, InputStream inStream) throws TransformException {
		«IF (method.response != null)»
			«IF(method.response.type instanceof ComplexTypeLiteral || method.response.superType != null)»
				«generateDeserializationStatementHeader(true)»
				
					«method.name.pascalize»Response target = this;
					
					«var members = mergeMembers(method.response.type as ComplexTypeLiteral, method.response.superType)»
				
					«jsonReaderGenerator.genReadComplexTypeLiteralForMembers(members)»
		
				«generateDeserializationStatementFooter(true)»
			«ELSE»
				«generateDeserializationStatementForType(method.response, method.response.type as Type)»
			«ENDIF»
		«ELSE»
		Closeables.closeSilently(inStream);
		«ENDIF»
		}
	}
	'''
	
	def generateDeserializationStatementHeader(boolean withReader)'''
		«IF withReader»
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonReader")»
		«context.registerImport("java.io.InputStreamReader")»
		«context.registerImport("java.nio.charset.Charset")»
		JsonReader source = null;
		«ENDIF»
		try {
			if(inStream != null) {
				«IF withReader»
				source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
				«ENDIF»
	'''
	
	def generateDeserializationStatementFooter(boolean withReader)'''
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			«IF withReader»
			Closeables.closeSilently(source);
			«ELSE»
			Closeables.closeSilently(inStream);
			«ENDIF»
		}
	'''
	
	def EList<Member> mergeMembers(ComplexTypeLiteral type, ComplexTypeDeclaration superType) { 
		var members = new BasicEList<Member>()
		
		if(type != null) {
			members.addAll(type.members)
		}
		
		if(superType != null) {
			members.addAll(superType.literal.members)
		}

		return members;
	}
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, IntrinsicType type) '''
		«context.registerImport("com.robotoworks.mechanoid.util.Streams")»
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
				provider.get(«type.signature»InputTransformer.class).transform(source, this.«type.signature.camelize»);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForUserType(ResponseBlock response, UserType type, EnumTypeDeclaration declaration) '''
		«context.registerImport("com.robotoworks.mechanoid.util.Streams")»
		«generateDeserializationStatementHeader(false)»
				String source = Streams.readAllText(inStream);
				this.«type.signature.camelize» = «type.signature».fromValue(source);
		«generateDeserializationStatementFooter(false)»
	'''

	def dispatch generateDeserializationStatementForType(ResponseBlock response, GenericListType type) {
		generateDeserializationStatementForGenericListType(response, type, type.elementType);
	}
	
	def dispatch generateDeserializationStatementForGenericListType(ResponseBlock response, GenericListType type, IntrinsicType genericType) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonUtil")»
		«context.registerImport("java.util.List")»
		«generateDeserializationStatementHeader(true)»
				this.values = JsonUtil.read«genericType.boxedTypeSignature»List(source);
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
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		«generateDeserializationStatementHeader(true)»
				this.«type.innerSignature.camelize.pluralize» = new ArrayList<«type.innerSignature»>();
				provider.get(«type.innerSignature»ListInputTransformer.class).transform(source, this.«type.innerSignature.camelize.pluralize»);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForUserTypeGenericList(
		ResponseBlock response, 
		GenericListType type, 
		UserType genericType,
		EnumTypeDeclaration declaration
	) '''
		«context.registerImport("com.robotoworks.mechanoid.internal.util.JsonToken")»
		«context.registerImport("java.util.ArrayList")»
		«context.registerImport("java.util.List")»
		«generateDeserializationStatementHeader(true)»
				this.«type.innerSignature.camelize.pluralize» = new Array«type.signature»();
				
				if(source.peek() != JsonToken.NULL) {
					
					source.beginArray();
					
					while(source.hasNext()) {
						«type.innerSignature» element = «type.innerSignature».fromValue(source.«declaration.resolveJsonReaderMethodName»());
						this.«type.innerSignature.camelize.pluralize».add(element);
					}
					
					source.endArray();
				}
		«generateDeserializationStatementFooter(true)»
	'''
}