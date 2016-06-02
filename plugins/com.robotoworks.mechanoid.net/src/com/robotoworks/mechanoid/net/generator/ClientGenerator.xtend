package com.robotoworks.mechanoid.net.generator

import com.google.inject.Inject
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.HttpMethod
import com.robotoworks.mechanoid.net.netModel.HttpMethodType
import com.robotoworks.mechanoid.net.netModel.Model

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import static extension com.robotoworks.mechanoid.text.Strings.*

class ClientGenerator {
	@Inject ImportHelper imports
	
	def generate(Client client, Model module) '''
	package «module.packageName»;

	«var classDecl = generateClientClass(client, module)»
	
	import com.robotoworks.mechanoid.net.Parser;
	import java.io.IOException;
	import com.robotoworks.mechanoid.net.Response;
	import com.robotoworks.mechanoid.net.ServiceException;
	import java.io.InputStream;
	import com.robotoworks.mechanoid.net.ServiceClient;
	import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
	import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
	«imports.printAndClear»
	
	«classDecl»
	'''
	
	def generateClientClass(Client client, Model module) '''
		public abstract class Abstract«client.name» extends ServiceClient {
			private static final String LOG_TAG = "«client.name»";
			
			«IF client.baseUrl != null»
			protected static final String DEFAULT_BASE_URL = "«client.baseUrl»";
			
			«ENDIF»
			«var params = client.paramsBlock»
			«IF(params != null)»
			«FOR param:params.params»
			private «param.member.type.signature» «param.member.name.camelize»Param«IF param.defaultValue != null» = «param.defaultValue.convertToJavaLiteral»«ENDIF»;
			private boolean «param.member.name.camelize»ParamSet«IF param.defaultValue != null» = true«ENDIF»;
			«ENDFOR»
			
			«ENDIF»
			«IF(params != null)»
			«FOR param:params.params»
			public void set«param.member.name.pascalize»Param(«param.member.type.signature» value) {
				this.«param.member.name.camelize»Param = value;
				this.«param.member.name.camelize»ParamSet = true;
			}
			«ENDFOR»
			
			«ENDIF»
			@Override
			protected String getLogTag() {
				return LOG_TAG;
			}
			
			@Override
			protected JsonEntityWriterProvider createWriterProvider() {
				return new Default«client.name»WriterProvider();
			}
			
			@Override
			protected JsonEntityReaderProvider createReaderProvider() {
				return new Default«client.name»ReaderProvider();
			}
			
			public Abstract«client.name»(String baseUrl, boolean debug){
				super(baseUrl, debug);
				
				«var headers = client.headerBlock»
				«IF headers != null»
				«FOR header : headers.headers»
				setHeader("«header.name»","«header.value»");
				«ENDFOR»
				«ENDIF»
			}
			
			«generateClientMethods(client, module)»
		}
	'''
	
	def generateClientMethods(Client client, Model model) '''
		«FOR method:client.blocks.filter(typeof(HttpMethod))»
		«IF !method.hasBody && (method.path == null || method.path.params.size == 0)»
		public Response<«method.name.pascalize»Result> «method.name.camelize»()
		  throws ServiceException {
		  	return «method.name.camelize»(new «method.name.pascalize»Request());
		}
		
		«ENDIF»
		public Response<«method.name.pascalize»Result> «method.name.camelize»(«method.name.pascalize»Request request)
		  throws ServiceException {
		  	«var params = client.paramsBlock»
			«IF(params != null)»
			«FOR param:params.params»
			if(this.«param.member.name.camelize»ParamSet && !request.is«param.member.name.pascalize»ParamSet()){
				request.set«param.member.name.pascalize»Param(this.«param.member.name.camelize»Param);
			}
			«ENDFOR»
			
			«ENDIF»	
			
			Parser<«method.name.pascalize»Result> parser = new Parser<«method.name.pascalize»Result>() {
				public «method.name.pascalize»Result parse(InputStream inStream) throws IOException {
					return new «method.name.pascalize»Result(getReaderProvider(), inStream);
				}
			};
			
			«generateServiceMethod(method)»
		}
		
		«ENDFOR»
	'''
	def generateServiceMethod(HttpMethod method) { 
		switch(method.type) {
			case HttpMethodType::GET:
				generateServiceGetMethod(method)
			case HttpMethodType::PUT:
				generateServicePutMethod(method)
			case HttpMethodType::POST:
				generateServicePostMethod(method)
			case HttpMethodType::DELETE:
				generateServiceDeleteMethod(method)
			case HttpMethodType::PATCH:
				generateServicePatchMethod(method)
				
		}
	}

	
	def generateServiceGetMethod(HttpMethod method) '''
		return get(request, parser);
	'''
	def printSetHeadersStatements() '''
		for(String key : headers.keySet()) {
			conn.setRequestProperty(key, headers.get(key));
		}
		
		for(String key : request.getHeaderKeys()) {
			conn.setRequestProperty(key, request.getHeaderValue(key));
		}
	'''

	def generateServicePutMethod(HttpMethod method) '''
		return put(request, parser);
	'''
	
	def generateServicePostMethod(HttpMethod method) '''
		return post(request, parser);
	'''
	def generateServiceDeleteMethod(HttpMethod method) '''
		return delete(request, parser);
	'''
	
	def generateServicePatchMethod(HttpMethod method) '''
		return patch(request, parser);
	'''

	def generateStub(Client client, Model module) '''
	package «module.packageName»;
	
	public class «client.name» extends Abstract«client.name» {
		«IF client.baseUrl != null»
		public «client.name»(){
			super(DEFAULT_BASE_URL, false);
		}

		public «client.name»(boolean debug){
			super(DEFAULT_BASE_URL, debug);
		}
		«ENDIF»
		
		public «client.name»(String baseUrl){
			super(baseUrl, false);
		}
		
		public «client.name»(String baseUrl, boolean debug){
			super(baseUrl, debug);
		}
	}
	'''
}