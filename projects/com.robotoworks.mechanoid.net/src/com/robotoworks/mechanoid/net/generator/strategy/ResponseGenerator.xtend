package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.ArrayType
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.HttpMethod
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.WrapWithMember
import com.robotoworks.mechanoid.net.netModel.ResponseBlock
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.UserType

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*

class ResponseGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	MemberDeserializationStatementGenerator deserializationStatementGenerator
	
	def setMemberDeserializationStatementGenerator(MemberDeserializationStatementGenerator deserializationStatementGenerator){
		this.deserializationStatementGenerator = deserializationStatementGenerator;
	}
	def getMemberDeserializationStatementGenerator (){
		return deserializationStatementGenerator;
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
	
	def generateResponseClass(HttpMethod method, Model module, Client client) '''
	public class «method.name.pascalize»Response «IF(method.response != null && method.response.superType != null)»extends «method.response.superType.name»«ENDIF» {
		«IF (method.response != null)»
			«generateFieldForType(method.response.type)»	
			«generateGetterForType(method.response.type)»	
		«ENDIF»
		
		public «method.name.pascalize»Response(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {
			«IF (method.response != null)»
				«IF(method.response.type != null)»
					«generateDeserializationStatementForType(method.response, method.response.type)»
				«ELSE»
					«IF(method.response.superType != null)»
						«generateDeserializationStatementForSuperTypeOnly(method.response, method.response.superType)»
					«ENDIF»
				«ENDIF»
			«ELSE»
			Closeables.closeSilently(inStream);
			«ENDIF»
		}
	}
	'''
		
	def dispatch generateFieldForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateFieldForMember(member)»
		«ENDFOR»	
	'''
	
	def dispatch generateFieldForType(IntrinsicType type) '''
		private «type.signature» value;	
	'''
	
	def dispatch generateFieldForType(ArrayType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			private «type.signature» values;
		«ELSE»
			private «type.signature» «type.innerSignature.camelize.pluralize»;
		«ENDIF»
	'''
	
	def dispatch generateFieldForType(GenericListType type) '''
		«IF(type.genericType instanceof IntrinsicType)»
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
	
	def dispatch generateFieldForMember(WrapWithMember member) '''
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
	
	def dispatch generateGetterForType(ArrayType type) '''
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
	
	def dispatch generateGetterForType(GenericListType type) '''
	«IF(type.genericType instanceof IntrinsicType)»
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
	'''
	
	def dispatch generateGetter(WrapWithMember member) '''
		«generateGetterForType(member.literal)»
	'''
	
	
	def generateDeserializationStatementHeader()'''
		«context.registerImport("com.robotoworks.mechanoid.util.Streams")»

		try {
			if(inStream != null){
				String content = Streams.readAllText(inStream);
	'''
	
	def generateDeserializationStatementFooter()'''
		«context.registerImport("java.io.IOException")»
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(inStream);
		}
	'''
	
	def generateDeserializationStatementForSuperTypeOnly(ResponseBlock response, ComplexTypeDeclaration superType) '''
		«context.registerImport("org.json.JSONObject")»
		«generateDeserializationStatementHeader()»
				JSONObject source = new JSONObject(content);
				transformerProvider.get(«superType.name»InputTransformer.class).transform(source, this);
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, ComplexTypeLiteral type) '''
		«context.registerImport("org.json.JSONObject")»
		«generateDeserializationStatementHeader()»
				JSONObject source = new JSONObject(content);
				«FOR member:type.members»
				«deserializationStatementGenerator.generate(member, "transformerProvider", "source", "this", true)»
				«ENDFOR»
				«IF(response.superType != null)»
							
				transformerProvider.get(«response.superType.name»InputTransformer.class).transform(source, this);
				«ENDIF»
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, IntrinsicType type) '''
		«generateDeserializationStatementHeader()»
				this.value = «type.signature».valueOf(content);
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, UserType type) {
		generateDeserializationStatementForUserType(response, type, type.declaration);
	}
	
	def dispatch generateDeserializationStatementForUserType(ResponseBlock response, UserType type, ComplexTypeDeclaration declaration) '''
		«context.registerImport("org.json.JSONObject")»
		«generateDeserializationStatementHeader()»
				JSONObject source = new JSONObject(content);
				this.«type.signature.camelize» = new «type.signature»();
				transformerProvider.get(«type.signature»InputTransformer.class).transform(source, this.«type.signature.camelize»);
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForUserType(ResponseBlock response, UserType type, EnumTypeDeclaration declaration) '''
		«generateDeserializationStatementHeader()»
				this.«type.signature.camelize» = «type.signature».fromValue(content);
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, ArrayType type) {
		generateDeserializationStatementForArrayType(response, type, type.elementType);
	}
	
	def dispatch generateDeserializationStatementForArrayType(ResponseBlock response, ArrayType type, IntrinsicType elementType) '''
		«context.registerImport("org.json.JSONArray")»
		«generateDeserializationStatementHeader()»
				JSONArray source = new JSONArray(content);
				this.values = new «type.innerSignature»[source.length()];
				for(int i=0; i < source.length(); i++) {
					this.values[i] = source.«elementType.toJSONPropertyGetMethod»(i);
				}
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForArrayType(ResponseBlock response, ArrayType type, UserType elementType) {
		generateDeserializationStatementForUserTypeArray(response, type, elementType, elementType.declaration);
	}
	
	def dispatch generateDeserializationStatementForUserTypeArray(
		ResponseBlock response, 
		ArrayType type, 
		UserType elementType, 
		ComplexTypeDeclaration declaration
	) '''
		«context.registerImport("org.json.JSONArray")»
		«generateDeserializationStatementHeader()»
				JSONArray source = new JSONArray(content);
				this.«type.innerSignature.camelize.pluralize» = new «type.innerSignature»[source.length()];
				transformerProvider.get(«type.innerSignature»ArrayInputTransformer.class).transform(source, this.«type.innerSignature.camelize.pluralize»);
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForUserTypeArray(
		ResponseBlock response, 
		ArrayType type, 
		UserType elementType, 
		EnumTypeDeclaration declaration
	) '''
		«context.registerImport("org.json.JSONArray")»
		«generateDeserializationStatementHeader()»
				JSONArray source = new JSONArray(content);
				this.«type.innerSignature.camelize.pluralize» = new «type.innerSignature»[source.length()];
				for(int i=0; i < source.length(); i++) {
					«type.innerSignature» element = «type.innerSignature».fromValue(source.«declaration.resolveGetJSONValueMethodName»(i));
					this.«type.innerSignature.camelize.pluralize»[i] = element;
				}
		«generateDeserializationStatementFooter()»
	'''

	def dispatch generateDeserializationStatementForType(ResponseBlock response, GenericListType type) {
		generateDeserializationStatementForGenericListType(response, type, type.genericType);
	}
	
	def dispatch generateDeserializationStatementForGenericListType(ResponseBlock response, GenericListType type, IntrinsicType genericType) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		«generateDeserializationStatementHeader()»
				JSONArray source = new JSONArray(content);
				this.values = new Array«type.signature»(source.length());
				for(int i=0; i < source.length(); i++) {
					this.values.add(source.«genericType.toJSONPropertyGetMethod»(i));
				}
		«generateDeserializationStatementFooter()»
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
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		«generateDeserializationStatementHeader()»
				JSONArray source = new JSONArray(content);
				this.«type.innerSignature.camelize.pluralize» = new Array«type.signature»(source.length());
				transformerProvider.get(«type.innerSignature»ListInputTransformer.class).transform(source, this.«type.innerSignature.camelize.pluralize»);
		«generateDeserializationStatementFooter()»
	'''
	
	def dispatch generateDeserializationStatementForUserTypeGenericList(
		ResponseBlock response, 
		GenericListType type, 
		UserType genericType,
		EnumTypeDeclaration declaration
	) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		«context.registerImport("java.util.ArrayList")»
		«generateDeserializationStatementHeader()»
				JSONArray source = new JSONArray(content);
				this.«type.innerSignature.camelize.pluralize» = new Array«type.signature»(source.length());
				for(int i=0; i < source.length(); i++) {
					«type.innerSignature» element = «type.innerSignature».fromValue(source.«declaration.resolveGetJSONValueMethodName»(i));
					this.«type.innerSignature.camelize.pluralize».add(element);
				}
		«generateDeserializationStatementFooter()»
	'''
}