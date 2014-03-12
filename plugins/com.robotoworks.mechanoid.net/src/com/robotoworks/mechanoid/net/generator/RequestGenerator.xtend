package com.robotoworks.mechanoid.net.generator

import com.robotoworks.mechanoid.net.netModel.BodyBlock
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.robotoworks.mechanoid.net.netModel.HttpMethod
import com.robotoworks.mechanoid.net.netModel.IntrinsicType
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.Path
import com.robotoworks.mechanoid.net.netModel.SkipMember
import com.robotoworks.mechanoid.net.netModel.StringType
import com.robotoworks.mechanoid.net.netModel.TypedMember
import com.robotoworks.mechanoid.net.netModel.UserType
import java.util.ArrayList
import java.util.List
import com.google.inject.Inject
import org.eclipse.xtext.serializer.ISerializer

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import static extension com.robotoworks.mechanoid.text.Strings.*

class RequestGenerator {
	@Inject ImportHelper imports
	@Inject JsonWriterStatementGenerator jsonWriterGenerator
	@Inject ISerializer serializer

	def generate(HttpMethod method, Model module, Client client) {
		jsonWriterGenerator.imports = imports
		jsonWriterGenerator.setWriterIdentifier("writer")
		doGenerate(method, module, client)
	} 
	
	def doGenerate(HttpMethod method, Model module, Client client) '''
	package «module.packageName»;

	«var classDecl = generateRequestClass(method, module, client)»
	
	import android.net.Uri;
	«IF(method.hasBody)»
	import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
	import com.robotoworks.mechanoid.net.EntityEnclosedServiceRequest;
	«ELSE»
	import com.robotoworks.mechanoid.net.ServiceRequest;
	«ENDIF»
	«imports.printAndClear»
	
	«classDecl»
	'''	
	
	def generateRequestClass(HttpMethod method, Model module, Client client) '''
	public class «method.name.pascalize»Request extends «IF(method.hasBody)»EntityEnclosed«ENDIF»ServiceRequest {
		
		private static final String PATH = "«method.getPathAsFormatString(serializer)»";
		
		«IF(method.path?.params?.size > 0)»
		«FOR slug:method.path.params»
		private final «slug.member.type.signature» «slug.member.name.camelize»Segment;
		«ENDFOR»
		
		«ENDIF»
		«var methodParams = method.paramsBlock»
		«var clientParams = client.paramsBlock»
		«IF(methodParams != null)»
		«FOR param:methodParams.params»
		private «param.member.type.signature» «param.member.name.camelize»Param«IF param.defaultValue != null» = «param.defaultValue.convertToJavaLiteral»«ENDIF»;
		private boolean «param.member.name.camelize»ParamSet«IF param.defaultValue != null» = true«ENDIF»;
		«ENDFOR»
			
		«ENDIF»
		«IF(clientParams != null)»
		«FOR param:clientParams.params»
		private «param.member.type.signature» «param.member.name.camelize»Param«IF param.defaultValue != null» = «param.defaultValue.convertToJavaLiteral»«ENDIF»;
		private boolean «param.member.name.camelize»ParamSet«IF param.defaultValue != null» = true«ENDIF»;
		«ENDFOR»
			
		«ENDIF»
		«IF(method.hasBody)»
			«generateFieldForType(method.body.type)»
			
			«generateGetterSetterForType(method.body.type)»
		«ENDIF»
		«IF(methodParams != null)»
		«FOR param:methodParams.params»
		public «method.name.pascalize»Request set«param.member.name.pascalize»Param(«param.member.type.signature» value) {
			this.«param.member.name.camelize»Param = value;
			this.«param.member.name.camelize»ParamSet = true;
			return this;
		}
		
		public boolean is«param.member.name.pascalize»ParamSet() {
			return «param.member.name.camelize»ParamSet;
		}
		«ENDFOR»
			
		«ENDIF»
		«IF(clientParams != null)»
		«FOR param:clientParams.params»
		public «method.name.pascalize»Request set«param.member.name.pascalize»Param(«param.member.type.signature» value) {
			this.«param.member.name.camelize»Param = value;
			this.«param.member.name.camelize»ParamSet = true;
			return this;
		}
		
		public boolean is«param.member.name.pascalize»ParamSet() {
			return «param.member.name.camelize»ParamSet;
		}
		«ENDFOR»
				
		«ENDIF»
		public «method.name.pascalize»Request(«generateRequestConstructorArgs(method.path, method.body)»){
			«var methodHeaders = method.headerBlock»
			«IF methodHeaders != null»
			«FOR header : methodHeaders.headers»
			setHeader("«header.name»","«header.value»");
			«ENDFOR»
			
			«ENDIF»
			«IF(method.path?.params?.size > 0)»
				«FOR slug:method.path.params»
				this.«slug.member.name.camelize»Segment = «slug.member.name.camelize»Segment;
				«ENDFOR»	
			«ENDIF»
			«IF(method.hasBody)»
				«generateConstructorAssignmentForType(method.body.type)»
			«ENDIF»
		}
		
		«IF(method.hasBody)»
		«imports.addImport("com.robotoworks.mechanoid.util.Closeables")»
		«imports.addImport("java.io.OutputStream")»
		«imports.addImport("java.io.IOException")»
		@Override
		public void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException {
			«generateSerializationStatementForType(method, method.body, method.body.type)»
		}

		«ENDIF»
		@Override
		public String createUrl(String baseUrl){
			«IF(method.path?.params?.size > 0)»
				Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, «FOR slug:method.path.params SEPARATOR ", "»«slug.member.name.camelize»Segment«ENDFOR»)).buildUpon();
			«ELSE»
				Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			«ENDIF»		
				
			«IF(methodParams != null)»
				«FOR param:methodParams.params»
					if(«param.member.name.camelize»ParamSet){
						«IF param.member.type instanceof StringType»
						uriBuilder.appendQueryParameter("«param.member.name»", «param.member.name.camelize»Param);
						«ELSE»
						uriBuilder.appendQueryParameter("«param.member.name»", String.valueOf(«param.member.name.camelize»Param));
						«ENDIF»
					}
				«ENDFOR»
				
			«ENDIF»
			«IF(clientParams != null)»
			«FOR param:clientParams.params»
				if(«param.member.name.camelize»ParamSet){
					«IF param.member.type instanceof StringType»
					uriBuilder.appendQueryParameter("«param.member.name»", «param.member.name.camelize»Param);
					«ELSE»
					uriBuilder.appendQueryParameter("«param.member.name»", String.valueOf(«param.member.name.camelize»Param));
					«ENDIF»
				}
			«ENDFOR»
			
			«ENDIF»
			return uriBuilder.toString();			
		}
	}
	'''
	
	def generateSerializationStatementHeader(boolean withReader)'''
		«IF withReader»
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonWriter")»
		«imports.addImport("java.io.OutputStreamWriter")»
		«imports.addImport("java.nio.charset.Charset")»
		JsonWriter writer = null;
		«ENDIF»
		try {
			if(stream != null) {
				«IF withReader»
				writer = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				«ENDIF»
				
	'''
	
	def generateSerializationStatementFooter(boolean withReader)'''
				
			}
		} finally {
			«IF withReader»
			Closeables.closeSilently(writer);
			«ELSE»
			Closeables.closeSilently(stream);
			«ENDIF»
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
	
	def dispatch generateGetterSetterForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateGetterSetterForMember(member)»
		«ENDFOR»
	'''
	def dispatch generateGetterSetterForType(IntrinsicType type) '''
		public «type.signature» getValue() {
			return value;
		}
	'''
	
	def dispatch generateGetterSetterForType(GenericListType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			public «type.signature» getValues() {
				return values;
			}
		«ELSE»
			public «type.signature» get«type.innerSignature.pascalize.pluralize»() {
				return «type.innerSignature.camelize.pluralize»;
			}
		«ENDIF»
	'''
	
	def dispatch generateGetterSetterForType(UserType type) '''
		public «type.signature» get«type.signature.pascalize»() {
			return «type.signature.camelize»;
		}
	'''
	
	def dispatch generateGetterSetterForMember(TypedMember member) '''
		public «member.type.signature» «member.toGetMethodName»() {
			return «member.toIdentifier»;
		}
	'''
	
	def dispatch generateGetterSetterForMember(SkipMember member) '''
		«generateGetterSetterForType(member.literal)»
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
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, IntrinsicType type) '''
		«imports.addImport("java.io.PrintStream")»
		«generateSerializationStatementHeader(false)»
			PrintStream ps = new PrintStream(stream);
			ps.print(value);
«««			«IF type instanceof StringType»
«««			Streams.writeText(stream, value);
«««			«ELSE»
«««			Streams.writeText(stream, «type.boxedTypeSignature».toString(value));
«««			«ENDIF»
		«generateSerializationStatementFooter(false)»
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, ComplexTypeLiteral type) '''
		«generateSerializationStatementHeader(true)»
		
			«method.name.pascalize»Request subject = this;
		
			«jsonWriterGenerator.genWriteComplexTypeLiteral(type)»
		
		«generateSerializationStatementFooter(true)»
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, UserType type) {
		generateSerializationStatementForUserType(body, type, type.declaration);
	}
	
	def dispatch generateSerializationStatementForUserType(
		BodyBlock body,
		UserType type,
		ComplexTypeDeclaration declaration) '''
			«generateSerializationStatementHeader(true)»
				provider.get(«type.signature».class).write(writer, «type.signature.camelize»);
			«generateSerializationStatementFooter(true)»
		'''
	
	def dispatch generateSerializationStatementForUserType(
		BodyBlock body,
		UserType type,
		EnumTypeDeclaration declaration) '''
			«imports.addImport("java.io.PrintStream")»
			«generateSerializationStatementHeader(false)»
				PrintStream ps = new PrintStream(stream);
				ps.print(«type.signature.camelize».getValue());
«««				Streams.writeText(stream, «type.signature.camelize».getValue());
			«generateSerializationStatementFooter(false)»
		'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, GenericListType type) {
		generateSerializationStatementForGenericListType(body, type, type.elementType);
	}
	
	def dispatch generateSerializationStatementForGenericListType(
		BodyBlock body, 
		GenericListType type,
		IntrinsicType elementType
	) '''
		«imports.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil")»
		«imports.addImport("java.util.List")»
		«generateSerializationStatementHeader(true)»
			JsonUtil.write«elementType.boxedTypeSignature»List(writer, values);
		«generateSerializationStatementFooter(true)»
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
		«imports.addImport("java.util.List")»
		«generateSerializationStatementHeader(true)»
			provider.get(«type.innerSignature».class).writeList(writer, «type.innerSignature.camelize.pluralize»);
		«generateSerializationStatementFooter(true)»
	'''

	def dispatch generateSerializationStatementForUserTypeGenericList(
		BodyBlock body, 
		GenericListType type,
		UserType elementType,
		EnumTypeDeclaration declaration
	) '''
		«generateSerializationStatementHeader(true)»
		
			writer.beginArray();
			
			for(«type.innerSignature» element:«type.innerSignature.camelize.pluralize») {
				writer.put(element.getValue());
			}
			
			writer.endArray();
		
		«generateSerializationStatementFooter(true)»
	'''
			
	/*
	 * Converts a path (eg:- /qux/:fooparam/:quxparam/bar
	 * into constructor arguments
	 */
	def generateRequestConstructorArgs(Path path, BodyBlock body){
		var args = new ArrayList<String>()
		if(path?.params?.size > 0) {
			for(slug:path.params){
				args.add(slug.member.type.signature + " " + slug.member.name.camelize + "Segment")
			}
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
		", " + path.split("/|\\.")
		.filter(seg|seg.startsWith(":"))
		.join(", ", [String arg|arg.substring(1).camelize + "Segment"])	
	}
	
	def hasArgs(String path){
		path != null && path.contains(":")
	}
}
