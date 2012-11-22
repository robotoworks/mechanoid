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
import com.robotoworks.mechanoid.net.netModel.StringType

class RequestGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	JsonWriterGenerator jsonWriterGenerator
	
	def setJsonWriterGenerator(JsonWriterGenerator jsonWriterGenerator){
		this.jsonWriterGenerator = jsonWriterGenerator;
	}
	
	def registerImports()''''''
	
	def generate(HttpMethod method, Model module, Client client) '''
	package �module.packageName�;

	�var body = generateRequestClass(method, module, client)�
	�registerImports�
	
	import android.net.Uri;
	import java.util.LinkedHashMap;
	import java.util.Set;
	�context.printImports�
	�context.clearImports�
	
	�body�
	'''	
	
	def generateRequestClass(HttpMethod method, Model module, Client client) '''
	public class �method.name.pascalize�Request {
		
		private static final String PATH="�method.pathAsFormatString�";
		
		private LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
		
		public void setHeader(String field, String value) {
			headers.put(field, value);
		}
		
		public Set<String> getHeaderKeys() {
			return headers.keySet();
		}
		
		public String getHeaderValue(String key) {
			return headers.get(key);
		}
	
		�var pathArgs = method.getArgsFromPath�
		�IF(pathArgs.size > 0)�
		�FOR segment:pathArgs�
		private final String �segment.substring(1).camelize�Segment;
		�ENDFOR�
		
		�ENDIF�
		�IF(method.params != null)�
		�FOR param:method.params.params�
		private �param.type.signature� �param.name.camelize�Param;
		private boolean �param.name.camelize�ParamSet;
		�ENDFOR�
			
		�ENDIF�
		�IF(client.params != null)�
		�FOR param:client.params.params�
		private �param.type.signature� �param.name.camelize�Param;
		private boolean �param.name.camelize�ParamSet;
		�ENDFOR�
			
		�ENDIF�
		�IF(method.hasBody)�
			�generateFieldForType(method.body.type)�
			�generateGetterSetterForType(method.body.type)�
		�ENDIF�
		�IF(method.params != null)�
		�FOR param:method.params.params�
		public �method.name.pascalize�Request set�param.name.pascalize�Param(�param.type.signature� value) {
			this.�param.name.camelize�Param = value;
			this.�param.name.camelize�ParamSet = true;
			return this;
		}
		
		public boolean is�param.name.pascalize�ParamSet() {
			return �param.name.camelize�ParamSet;
		}
		�ENDFOR�
			
		�ENDIF�
		�IF(client.params != null)�
		�FOR param:client.params.params�
		public �method.name.pascalize�Request set�param.name.pascalize�Param(�param.type.signature� value) {
			this.�param.name.camelize�Param = value;
			this.�param.name.camelize�ParamSet = true;
			return this;
		}
		
		public boolean is�param.name.pascalize�ParamSet() {
			return �param.name.camelize�ParamSet;
		}
		�ENDFOR�
				
		�ENDIF�
		public �method.name.pascalize�Request(�generateRequestConstructorArgs(method.path, method.body)�){
			�IF method.headers != null�
			�FOR header : method.headers.headers�
			headers.put("�header.name�","�header.value�");
			�ENDFOR�
			
			�ENDIF�
			�IF(pathArgs.size > 0)�
				�FOR segment:pathArgs�
				this.�segment.substring(1).camelize�Segment = �segment.substring(1).camelize�Segment;
				�ENDFOR�	
			�ENDIF�
			�IF(method.hasBody)�
				�generateConstructorAssignmentForType(method.body.type)�
			�ENDIF�
		}
		
		�IF(method.hasBody)�
		�context.registerImport("com.robotoworks.mechanoid.net.TransformerProvider")�
		�context.registerImport("com.robotoworks.mechanoid.net.TransformException")�
		�context.registerImport("com.robotoworks.mechanoid.util.Closeables")�
		�context.registerImport("java.io.OutputStream")�
		void writeBody(TransformerProvider transformerProvider, OutputStream stream) throws TransformException {
			�generateSerializationStatementForType(method, method.body, method.body.type)�
		}

		�ENDIF�
		public String createUrl(String baseUrl){
			�IF(method.path.hasArgs)�
				Uri.Builder uriBuilder = Uri.parse(String.format(baseUrl + PATH�method.path.pathToStringFormatArgs�)).buildUpon();
			�ELSE�
				Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			�ENDIF�		
				
			�IF(method.params != null)�
				�FOR param:method.params.params�
					if(�param.name.camelize�ParamSet){
						�IF param.type instanceof StringType�
						uriBuilder.appendQueryParameter("�param.name�", �param.name.camelize�Param);
						�ELSE�
						uriBuilder.appendQueryParameter("�param.name�", String.valueOf(�param.name.camelize�Param));
						�ENDIF�
					}
				�ENDFOR�
				
			�ENDIF�
			�IF(client.params != null)�
			�FOR param:client.params.params�
				if(�param.name.camelize�ParamSet){
					�IF param.type instanceof StringType�
					uriBuilder.appendQueryParameter("�param.name�", �param.name.camelize�Param);
					�ELSE�
					uriBuilder.appendQueryParameter("�param.name�", String.valueOf(�param.name.camelize�Param));
					�ENDIF�
				}
			�ENDFOR�
			
			�ENDIF�
			return uriBuilder.toString();			
		}
	}
	'''
	
	def generateSerializationStatementHeader(boolean withReader)'''
		�IF withReader�
		�context.registerImport("com.robotoworks.mechanoid.internal.util.JsonWriter")�
		�context.registerImport("java.io.OutputStreamWriter")�
		�context.registerImport("java.nio.charset.Charset")�
		JsonWriter target = null;
		�ENDIF�
		try {
			if(stream != null) {
				�IF withReader�
				target = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				�ENDIF�
				
	'''
	
	def generateSerializationStatementFooter(boolean withReader)'''
				
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			�IF withReader�
			Closeables.closeSilently(target);
			�ELSE�
			Closeables.closeSilently(stream);
			�ENDIF�
		}
	'''
	
	def dispatch generateFieldForType(ComplexTypeLiteral type) '''
		�FOR member:type.members�
		�generateFieldForMember(member)�
		�ENDFOR�
	'''
	def dispatch generateFieldForType(IntrinsicType type) '''
		private final �type.signature� value;
	'''
	
	def dispatch generateFieldForType(GenericListType type) '''
		�IF(type.elementType instanceof IntrinsicType)�
			private final �type.signature� values;
		�ELSE�
			private final �type.signature� �type.innerSignature.camelize.pluralize�;
		�ENDIF�
	'''
	
	def dispatch generateFieldForType(UserType type) '''
		private final �type.signature� �type.signature.camelize�;
	'''
	
	def dispatch generateFieldForMember(TypedMember member) '''
		private final �member.type.signature� �member.toIdentifier�;
	'''
	
	def dispatch generateFieldForMember(SkipMember member) '''
		�generateFieldForType(member.literal)�
	'''
	
	def dispatch generateGetterSetterForType(ComplexTypeLiteral type) '''
		�FOR member:type.members�
		�generateGetterSetterForMember(member)�
		�ENDFOR�
	'''
	def dispatch generateGetterSetterForType(IntrinsicType type) '''
		public �type.signature� getValue() {
			return value;
		}
	'''
	
	def dispatch generateGetterSetterForType(GenericListType type) '''
		�IF(type.elementType instanceof IntrinsicType)�
			public �type.signature� getValues() {
				return values;
			}
		�ELSE�
			public �type.signature� get�type.innerSignature.pascalize.pluralize�() {
				return �type.innerSignature.camelize.pluralize�;
			}
		�ENDIF�
	'''
	
	def dispatch generateGetterSetterForType(UserType type) '''
		public �type.signature� get�type.signature.pascalize�() {
			return �type.signature.camelize�;
		}
	'''
	
	def dispatch generateGetterSetterForMember(TypedMember member) '''
		public �member.type.signature� �member.toGetMethodName�() {
			return �member.toIdentifier�;
		}
	'''
	
	def dispatch generateGetterSetterForMember(SkipMember member) '''
		�generateGetterSetterForType(member.literal)�
	'''
	
	def dispatch generateConstructorAssignmentForType(ComplexTypeLiteral type) '''
		�FOR member:type.members�
		�generateConstructorAssignmentForMember(member)�
		�ENDFOR�
	'''
	def dispatch generateConstructorAssignmentForType(IntrinsicType type) '''
		this.value = value;
	'''

	def dispatch generateConstructorAssignmentForType(GenericListType type) '''
		�IF(type.elementType instanceof IntrinsicType)�
			this.values = values;
		�ELSE�
			this.�type.innerSignature.camelize.pluralize� = �type.innerSignature.camelize.pluralize�;
		�ENDIF�
	'''
	def dispatch generateConstructorAssignmentForType(UserType type) '''
		this.�type.signature.camelize� = �type.signature.camelize�;
	'''
	
	def dispatch generateConstructorAssignmentForMember(TypedMember member) '''
		this.�member.toIdentifier� = �member.toIdentifier�;
	'''
	
	def dispatch generateConstructorAssignmentForMember(SkipMember member) '''
		�generateConstructorAssignmentForType(member.literal)�
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, IntrinsicType type) '''
		�context.registerImport("java.io.PrintStream")�
		�generateSerializationStatementHeader(false)�
			PrintStream ps = new PrintStream(stream);
			ps.print(value);
���			�IF type instanceof StringType�
���			Streams.writeText(stream, value);
���			�ELSE�
���			Streams.writeText(stream, �type.boxedTypeSignature�.toString(value));
���			�ENDIF�
		�generateSerializationStatementFooter(false)�
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, ComplexTypeLiteral type) '''
		�generateSerializationStatementHeader(true)�
		
			�method.name.pascalize�Request subject = this;
		
			�jsonWriterGenerator.genWriteComplexTypeLiteral(type)�
		
		�generateSerializationStatementFooter(true)�
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, UserType type) {
		generateSerializationStatementForUserType(body, type, type.declaration);
	}
	
	def dispatch generateSerializationStatementForUserType(
		BodyBlock body,
		UserType type,
		ComplexTypeDeclaration declaration) '''
			�generateSerializationStatementHeader(true)�
				transformerProvider.get(�type.signature�Transformer.class).transformOut(�type.signature.camelize�, target);
			�generateSerializationStatementFooter(true)�
		'''
	
	def dispatch generateSerializationStatementForUserType(
		BodyBlock body,
		UserType type,
		EnumTypeDeclaration declaration) '''
			�context.registerImport("java.io.PrintStream")�
			�generateSerializationStatementHeader(false)�
				PrintStream ps = new PrintStream(stream);
				ps.print(�type.signature.camelize�.getValue());
���				Streams.writeText(stream, �type.signature.camelize�.getValue());
			�generateSerializationStatementFooter(false)�
		'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, BodyBlock body, GenericListType type) {
		generateSerializationStatementForGenericListType(body, type, type.elementType);
	}
	
	def dispatch generateSerializationStatementForGenericListType(
		BodyBlock body, 
		GenericListType type,
		IntrinsicType elementType
	) '''
		�context.registerImport("com.robotoworks.mechanoid.internal.util.JsonUtil")�
		�context.registerImport("java.util.List")�
		�generateSerializationStatementHeader(true)�
			JsonUtil.write�elementType.boxedTypeSignature�List(target, values);
		�generateSerializationStatementFooter(true)�
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
		�generateSerializationStatementHeader(true)�
			transformerProvider.get(�type.innerSignature�Transformer.class).transformOut(�type.innerSignature.camelize.pluralize�, target);
		�generateSerializationStatementFooter(true)�
	'''

	def dispatch generateSerializationStatementForUserTypeGenericList(
		BodyBlock body, 
		GenericListType type,
		UserType elementType,
		EnumTypeDeclaration declaration
	) '''
		�generateSerializationStatementHeader(true)�
		
			target.beginArray();
			
			for(�type.innerSignature� element:�type.innerSignature.camelize.pluralize�) {
				target.put(element.getValue());
			}
			
			target.endArray();
		
		�generateSerializationStatementFooter(true)�
	'''
			
	/*
	 * Converts a path (eg:- /qux/:fooparam/:quxparam/bar
	 * into constructor arguments
	 */
	def generateRequestConstructorArgs(String path, BodyBlock body){
		var args = new ArrayList<String>()
		for(pathArg:path.getArgsFromPath){
			args.add("	String " + pathArg.substring(1).camelize + "Segment")
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