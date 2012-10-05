package com.robotoworks.mechanoid.net.generator.strategy

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.HttpMethod
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.UserType
import com.robotoworks.mechanoid.net.netModel.HttpPut
import com.robotoworks.mechanoid.net.netModel.HttpPost
import com.robotoworks.mechanoid.net.netModel.HttpGet
import com.robotoworks.mechanoid.net.netModel.HttpDelete
import com.robotoworks.mechanoid.net.netModel.BodyBlock
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.SkipMember
import java.util.ArrayList
import java.util.List
import com.robotoworks.mechanoid.net.netModel.StringType

class RequestGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	MemberSerializationStatementGenerator serializationStatementGenerator
	
	def setMemberSerializationStatementGenerator(MemberSerializationStatementGenerator serializationStatementGenerator){
		this.serializationStatementGenerator = serializationStatementGenerator;
	}
	
	def getMemberSerializationStatementGenerator(){
		this.serializationStatementGenerator;
	}
	
	def registerImports()''''''
	
	def generate(HttpMethod method, Model module, Client client) '''
	package «module.packageName»;

	«var body = generateRequestClass(method, module, client)»
	«registerImports»
	
	import com.robotoworks.mechanoid.net.Parser;
	import com.robotoworks.mechanoid.net.TransformerProvider;
	import com.robotoworks.mechanoid.net.TransformException;
	import com.robotoworks.mechanoid.net.ServiceClient;
	import com.robotoworks.mechanoid.net.Response;
	import java.io.IOException;
	import java.io.InputStream;
	import org.apache.http.client.ClientProtocolException;
	import android.net.Uri;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''	
	
	def generateRequestClass(HttpMethod method, Model module, Client client) '''
	public class «method.name.pascalize»Request {
		
		private static final String PATH="«method.pathAsFormatString»";
		
		«var pathArgs = method.getArgsFromPath»
		«IF(pathArgs.size > 0)»
		«FOR segment:pathArgs»
		private final String «segment.substring(1).camelize.escapeReserved»;
		«ENDFOR»
		
		«ENDIF»
		«IF(method.params != null)»
		«FOR param:method.params.params»
		private «param.type.signature» «param.name.camelize»Param;
		private boolean «param.name.camelize»ParamSet;
		«ENDFOR»
			
		«ENDIF»
		«IF(client.params != null)»
		«FOR param:client.params.params»
		private «param.type.signature» «param.name.camelize»Param;
		private boolean «param.name.camelize»ParamSet;
		«ENDFOR»
			
		«ENDIF»
		«IF(method.hasBody)»
			«generateFieldForType(method.body.type)»
			
		«ENDIF»
		«IF(method.params != null)»
		«FOR param:method.params.params»
		public void set«param.name.pascalize»Param(«param.type.signature» value) {
			this.«param.name.camelize»Param = value;
			this.«param.name.camelize»ParamSet = true;
		}
		
		public boolean is«param.name.pascalize»ParamSet() {
			return «param.name.camelize»ParamSet;
		}
		«ENDFOR»
			
		«ENDIF»
		«IF(client.params != null)»
		«FOR param:client.params.params»
		public void set«param.name.pascalize»Param(«param.type.signature» value) {
			this.«param.name.camelize»Param = value;
			this.«param.name.camelize»ParamSet = true;
		}
		
		public boolean is«param.name.pascalize»ParamSet() {
			return «param.name.camelize»ParamSet;
		}
		«ENDFOR»
				
		«ENDIF»
		public «method.name.pascalize»Request(«generateRequestConstructorArgs(method.path, method.body)»){
			«IF(pathArgs.size > 0)»
				«FOR segment:pathArgs»
				this.«segment.substring(1).camelize.escapeReserved» = «segment.substring(1).camelize.escapeReserved»;
				«ENDFOR»	
			«ENDIF»
			«IF(method.hasBody)»
				«generateConstructorAssignmentForType(method.body.type)»
			«ENDIF»
		}
		
		«IF(method.hasBody)»
		public String createBody(TransformerProvider transformerProvider) throws TransformException {
			try {
				«generateSerializationStatementForType(method.body, method.body.type)»
			} catch(Exception e) {
				throw new TransformException(e);
			}
		}
		
		«ENDIF»
		public String createUrl(String baseUrl){
			«IF(method.path.hasArgs)»
				Uri.Builder uriBuilder = Uri.parse(String.format(baseUrl + PATH«method.path.pathToStringFormatArgs»)).buildUpon();
			«ELSE»
				Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			«ENDIF»		
				
			«IF(method.params != null)»
				«FOR param:method.params.params»
					if(«param.name.camelize»ParamSet){
						«IF param.type instanceof StringType»
						uriBuilder.appendQueryParameter("«param.name»", «param.name.camelize»Param);
						«ELSE»
						uriBuilder.appendQueryParameter("«param.name»", String.valueOf(«param.name.camelize»Param));
						«ENDIF»
					}
				«ENDFOR»
				
			«ENDIF»
			«IF(client.params != null)»
			«FOR param:client.params.params»
				if(«param.name.camelize»ParamSet){
					«IF param.type instanceof StringType»
					uriBuilder.appendQueryParameter("«param.name»", «param.name.camelize»Param);
					«ELSE»
					uriBuilder.appendQueryParameter("«param.name»", String.valueOf(«param.name.camelize»Param));
					«ENDIF»
				}
			«ENDFOR»
			
			«ENDIF»
			return uriBuilder.toString();			
		}
		
		protected Response<«method.name.pascalize»Response> execute(String baseUrl, ServiceClient client, TransformerProvider transformerProvider)
			throws ClientProtocolException, IOException«IF method.hasBody», TransformException«ENDIF» {
				
			String url = createUrl(baseUrl);
			
			final TransformerProvider tp = transformerProvider;
			
			Parser<«method.name.pascalize»Response> parser = new Parser<«method.name.pascalize»Response>() {
				public «method.name.pascalize»Response parse(InputStream inStream) throws TransformException {
					return new «method.name.pascalize»Response(tp, inStream);
				}
	
			};
			
			«IF (method instanceof HttpPut)»
			String body = «IF(method.hasBody)»createBody(transformerProvider)«ELSE»null«ENDIF»;
			return new Response<«method.name.pascalize»Response>(client.putJson(url, body), parser);
			«ELSEIF (method instanceof HttpPost)»
			String body = «IF(method.hasBody)»createBody(transformerProvider)«ELSE»null«ENDIF»;
			return new Response<«method.name.pascalize»Response>(client.postJson(url, body), parser);
			«ELSEIF (method instanceof HttpGet)»
			return new Response<«method.name.pascalize»Response>(client.getJson(url), parser);
			«ELSEIF (method instanceof HttpDelete)»
			return new Response<«method.name.pascalize»Response>(client.deleteJson(url), parser);
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
		private final «type.signature» value;
	'''
	
	def dispatch generateFieldForType(GenericListType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			private final «type.signature» values;
		«ELSE»
			private final «type.signature» «type.innerSignature.camelize.pluralize»;
		«ENDIF»
	'''
	
	def dispatch generateFieldForType(UserType type) '''
		private final «type.signature» «type.signature.camelize»;
	'''
	
	def dispatch generateFieldForMember(TypedMember member) '''
		private final «member.type.signature» «member.toIdentifier»;
	'''
	
	def dispatch generateFieldForMember(SkipMember member) '''
		«generateFieldForType(member.literal)»
	'''
	
	def dispatch generateConstructorAssignmentForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateConstructorAssignmentForMember(member)»
		«ENDFOR»
	'''
	def dispatch generateConstructorAssignmentForType(IntrinsicType type) '''
		this.value = value;
	'''

	def dispatch generateConstructorAssignmentForType(GenericListType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			this.values = values;
		«ELSE»
			this.«type.innerSignature.camelize.pluralize» = «type.innerSignature.camelize.pluralize»;
		«ENDIF»
	'''
	def dispatch generateConstructorAssignmentForType(UserType type) '''
		this.«type.signature.camelize» = «type.signature.camelize»;
	'''
	
	def dispatch generateConstructorAssignmentForMember(TypedMember member) '''
		this.«member.toIdentifier» = «member.toIdentifier»;
	'''
	
	def dispatch generateConstructorAssignmentForMember(SkipMember member) '''
		«generateConstructorAssignmentForType(member.literal)»
	'''
	
	def dispatch generateSerializationStatementForType(BodyBlock body, IntrinsicType type) '''
		return value.toString();
	'''
	
	def dispatch generateSerializationStatementForType(BodyBlock body, ComplexTypeLiteral type) '''
		«context.registerImport("org.json.JSONObject")»
		JSONObject target = new JSONObject();
		«FOR member:type.members»
		«serializationStatementGenerator.generate(member, "transformerProvider", "this", "target", true)»
		«ENDFOR»
		return target.toString();
	'''
	
	def dispatch generateSerializationStatementForType(BodyBlock body, UserType type) {
		generateSerializationStatementForUserType(body, type, type.declaration);
	}
	
	def dispatch generateSerializationStatementForUserType(
		BodyBlock body,
		UserType type,
		ComplexTypeDeclaration declaration) '''
			«context.registerImport("org.json.JSONObject")»
			JSONObject target = transformerProvider.get(«type.signature»OutputTransformer.class).transform(«type.signature.camelize»);
			return target.toString();
		'''
	
	def dispatch generateSerializationStatementForUserType(
		BodyBlock body,
		UserType type,
		EnumTypeDeclaration declaration) '''
			return «type.signature.camelize».getValue();
		'''
	
	def dispatch generateSerializationStatementForType(BodyBlock body, GenericListType type) {
		generateSerializationStatementForGenericListType(body, type, type.elementType);
	}
	
	def dispatch generateSerializationStatementForGenericListType(
		BodyBlock body, 
		GenericListType type,
		IntrinsicType elementType
	) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		JSONArray target = new JSONArray(values);
		return target.toString();
	'''

	def dispatch generateSerializationStatementForGenericListType(
		BodyBlock body, 
		GenericListType type,
		UserType elementType
	) {
		generateSerializationStatementForUserTypeGenericList(body, type, elementType, elementType.declaration);
	}

	def dispatch generateSerializationStatementForUserTypeGenericList(
		BodyBlock body, 
		GenericListType type,
		UserType elementType,
		ComplexTypeDeclaration declaration
	) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		JSONArray target = transformerProvider.get(«type.innerSignature»ListOutputTransformer.class).transform(«type.innerSignature.camelize.pluralize»);
		return target.toString();
	'''

	def dispatch generateSerializationStatementForUserTypeGenericList(
		BodyBlock body, 
		GenericListType type,
		UserType elementType,
		EnumTypeDeclaration declaration
	) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("java.util.List")»
		JSONArray target = new JSONArray();
		for(«type.innerSignature» element:«type.innerSignature.camelize.pluralize») {
			target.put(element.getValue());
		}
		return target.toString();
	'''
			
	/*
	 * Converts a path (eg:- /qux/:fooparam/:quxparam/bar
	 * into constructor arguments
	 */
	def generateRequestConstructorArgs(String path, BodyBlock body){
		var args = new ArrayList<String>()
		for(pathArg:path.getArgsFromPath){
			args.add("	String " + pathArg.substring(1).camelize.escapeReserved)
		}
		
		if(body != null) {
			buildConstructorArgsForType(body.type, args)
		}
		
		return args.join(",\n")
	}
	
	def dispatch void buildConstructorArgsForType(ComplexTypeLiteral type, List<String> args) {
		for(member:type.members) {
			if(member instanceof TypedMember) {
				args.add((member as TypedMember).type.signature + " " + member.toIdentifier)
			} else if(member instanceof SkipMember) {
				buildConstructorArgsForType((member as SkipMember).literal, args)
			}
		}		
	}
	
	def dispatch void buildConstructorArgsForType(IntrinsicType type, List<String> args) {
		args.add(type.signature + " value");
	}
	
	def dispatch void buildConstructorArgsForType(GenericListType type, List<String> args) {
		if(type.elementType instanceof IntrinsicType){
			args.add(type.signature + " values")
		} else {
			args.add(type.signature + " " + type.innerSignature.camelize.pluralize)
		}	
	}
	
	def dispatch void buildConstructorArgsForType(UserType type, List<String> args) {
		args.add(type.signature + " " + type.signature.camelize)
	}
	
	def pathToStringFormatArgs(String path){		
		", " + path.split("/")
		.filter(seg|seg.startsWith(":"))
		.join(", ", [String arg|arg.substring(1).camelize.escapeReserved])	
	}
	
	def hasArgs(String path){
		path != null && path.contains(":")
	}
}