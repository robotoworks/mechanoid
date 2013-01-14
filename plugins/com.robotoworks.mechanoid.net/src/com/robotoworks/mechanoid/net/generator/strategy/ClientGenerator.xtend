package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.HttpMethod
import com.robotoworks.mechanoid.net.netModel.HttpMethodType
import com.robotoworks.mechanoid.net.netModel.Model

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment
import com.robotoworks.mechanoid.net.netModel.StringLiteral
import com.robotoworks.mechanoid.net.netModel.BooleanLiteral
import com.robotoworks.mechanoid.net.netModel.NumericLiteral

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
	import android.util.Log;
	import com.robotoworks.mechanoid.net.Parser;
	import com.robotoworks.mechanoid.net.TransformException;
	import com.robotoworks.mechanoid.net.TransformerProvider;
	import com.robotoworks.mechanoid.net.Response;
	import com.robotoworks.mechanoid.net.ServiceException;
	import java.io.InputStream;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.LinkedHashMap;
	import com.robotoworks.mechanoid.net.NetLogHelper;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateClientClass(Client client, Model module) '''
		public class «client.name» {
			private static final String LOG_TAG = "«client.name»";
			
			«IF client.baseUrl != null»
			private static final String DEFAULT_BASE_URL = "«client.baseUrl»";
			
			«ENDIF»
			private final TransformerProvider transformerProvider;
			private final String baseUrl;
			private final boolean debug;
			
			private LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
			
			public void setHeader(String field, String value) {
				headers.put(field, value);
			}
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
			«IF client.baseUrl != null»
			public «client.name»(){
				this(DEFAULT_BASE_URL, new TransformerProvider(), false);
			}

			public «client.name»(TransformerProvider transformerProvider){
				this(DEFAULT_BASE_URL, transformerProvider, false);
			}
			
			«ENDIF»
			
			public «client.name»(String baseUrl){
				this(baseUrl, new TransformerProvider(), false);
			}
			
			public «client.name»(boolean debug){
				this(DEFAULT_BASE_URL, new TransformerProvider(), debug);
			}
			public «client.name»(String baseUrl, boolean debug){
				this(baseUrl, new TransformerProvider(), debug);
			}
			
			public «client.name»(String baseUrl, TransformerProvider transformerProvider, boolean debug){
				this.baseUrl = baseUrl;
				this.transformerProvider = transformerProvider;
				this.debug = debug;
				«var headers = client.headerBlock»
				«IF headers != null»
				«FOR header : headers.headers»
				headers.put("«header.name»","«header.value»");
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
				public «method.name.pascalize»Result parse(InputStream inStream) throws TransformException {
					return new «method.name.pascalize»Result(transformerProvider, inStream);
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
				
		}
	}

	
	def generateServiceGetMethod(HttpMethod method) '''
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			«printSetHeadersStatements()»
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<«method.name.pascalize»Result> response = new Response<«method.name.pascalize»Result>(conn, parser);

			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}

			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
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
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "PUT " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("PUT");
			
			conn.setRequestProperty("Content-Type", "application/json, text/json");
			
			«printSetHeadersStatements()»
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect()
			«IF method.body != null»
			
			«context.registerImport("java.io.ByteArrayOutputStream")»
			if(debug) {
			    ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
			    request.writeBody(transformerProvider, debugOutStream);
			    
			    Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), "UTF-8"));
			}
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			«ENDIF»
			Response<«method.name.pascalize»Result> response = new Response<«method.name.pascalize»Result>(conn, parser);

			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}

			return response;

		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	'''
	def generateServicePostMethod(HttpMethod method) '''
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "POST " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			
			conn.setRequestProperty("Content-Type", "application/json, text/json");
			
			«printSetHeadersStatements()»

			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
						
			conn.connect();
			«IF method.body != null»
			
			«context.registerImport("java.io.ByteArrayOutputStream")»
			if(debug) {
			    ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
			    request.writeBody(transformerProvider, debugOutStream);
			    
			    Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), "UTF-8"));
			}
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			«ENDIF»
			Response<«method.name.pascalize»Result> response = new Response<«method.name.pascalize»Result>(conn, parser);

			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}

			return response;

		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}	
	'''
	def generateServiceDeleteMethod(HttpMethod method) '''
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "DELETE " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("DELETE");
			
			«printSetHeadersStatements()»

			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
	
			conn.connect();
			
			Response<«method.name.pascalize»Result> response = new Response<«method.name.pascalize»Result>(conn, parser);

			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}

			return response;

		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	'''

}