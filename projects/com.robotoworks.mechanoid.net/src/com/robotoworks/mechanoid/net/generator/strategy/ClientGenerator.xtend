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
	import com.robotoworks.mechanoid.net.HttpRequestHelper;
	import com.robotoworks.mechanoid.net.WebResponse;

	import java.io.IOException;
	import org.apache.http.client.ClientProtocolException;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateClientClass(Client client, Model module) '''
		public class «client.name» {
			
			private static final String DEFAULT_BASE_URL = "«client.baseUrl»";
			
			protected final HttpRequestHelper requestHelper;
			private final TransformerProvider transformerProvider;
			private final String baseUrl;

			public «client.name»(HttpRequestHelper requestHelper){
				this(requestHelper, new TransformerProvider(), DEFAULT_BASE_URL);
			}

			public «client.name»(HttpRequestHelper requestHelper, TransformerProvider transformerProvider){
				this(requestHelper, transformerProvider, DEFAULT_BASE_URL);
			}

			public «client.name»(HttpRequestHelper requestHelper, TransformerProvider transformerProvider, String baseUrl){
				this.requestHelper = requestHelper;
				this.baseUrl = baseUrl;
				this.transformerProvider = transformerProvider;
			}
			
			«generateClientMethods(client, module)»
		}
	'''
	
	def generateClientMethods(Client client, Model model) '''
		«FOR method:client.methods»
		public WebResponse<«method.name.pascalize»Response> «method.name.camelize»(«method.name.pascalize»Request request)
		  throws ClientProtocolException, IOException {			
			return request.execute(baseUrl, requestHelper, transformerProvider);
		}
		«ENDFOR»
	'''
}