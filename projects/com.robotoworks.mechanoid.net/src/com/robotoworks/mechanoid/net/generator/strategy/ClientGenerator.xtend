package com.robotoworks.mechanoid.net.generator.strategy

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext

class ClientGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	
	
	def registerImports()''''''
	
	def generate(Client client, Model module) '''
	package «module.packageName»;

	«var body = generateClientClass(client, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.TransformerProvider;
	import com.robotoworks.mechanoid.net.ServiceClient;
	import com.robotoworks.mechanoid.net.Response;
	import com.robotoworks.mechanoid.net.DefaultServiceClient;

	import java.io.IOException;
	import org.apache.http.client.ClientProtocolException;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateClientClass(Client client, Model module) '''
		public class «client.name» {
			
			private static final String DEFAULT_BASE_URL = "«client.baseUrl»";
			
			protected final ServiceClient client;
			private final TransformerProvider transformerProvider;
			private final String baseUrl;
			
			«IF(client.params != null)»
			«FOR param:client.params.params»
			private «param.type.signature» «param.name.camelize»Param;
			private boolean «param.name.camelize»ParamSet;
			«ENDFOR»
				
			«ENDIF»
			
			«IF(client.params != null)»
			«FOR param:client.params.params»
			public void set«param.name.pascalize»Param(«param.type.signature» value) {
				this.«param.name.camelize»Param = value;
				this.«param.name.camelize»ParamSet = true;
			}
			«ENDFOR»
				
			«ENDIF»
		
			public «client.name»(){
				this(new DefaultServiceClient(), new TransformerProvider(), DEFAULT_BASE_URL);
			}
			
			public «client.name»(ServiceClient client){
				this(client, new TransformerProvider(), DEFAULT_BASE_URL);
			}

			public «client.name»(ServiceClient client, TransformerProvider transformerProvider){
				this(client, transformerProvider, DEFAULT_BASE_URL);
			}
			
			public «client.name»(String baseUrl){
				this(new DefaultServiceClient(), new TransformerProvider(), baseUrl);
			}
			
			public «client.name»(ServiceClient client, String baseUrl){
				this(client, new TransformerProvider(), baseUrl);
			}

			public «client.name»(ServiceClient client, TransformerProvider transformerProvider, String baseUrl){
				this.client = client;
				this.baseUrl = baseUrl;
				this.transformerProvider = transformerProvider;
			}
			
			«generateClientMethods(client, module)»
		}
	'''
	
	def generateClientMethods(Client client, Model model) '''
		«FOR method:client.methods»
		public Response<«method.name.pascalize»Response> «method.name.camelize»(«method.name.pascalize»Request request)
		  throws ClientProtocolException, IOException«IF method.hasBody», TransformException«ENDIF» {
		  	«if(method.hasBody) context.registerImport("com.robotoworks.mechanoid.net.TransformException")»
			«IF(client.params != null)»
			«FOR param:client.params.params»
			if(this.«param.name.camelize»ParamSet && !request.is«param.name.pascalize»ParamSet()){
				request.set«param.name.pascalize»Param(this.«param.name.camelize»Param);
			}
			«ENDFOR»
			
			«ENDIF»		  	
			return request.execute(baseUrl, client, transformerProvider);
		}
		«ENDFOR»
	'''
}