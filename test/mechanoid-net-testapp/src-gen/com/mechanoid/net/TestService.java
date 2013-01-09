package com.mechanoid.net;

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
import java.io.ByteArrayOutputStream;

public class TestService {
	private static final String LOG_TAG = "TestService";
	
	private static final String DEFAULT_BASE_URL = "http://10.0.2.2:8080/mechanoid-net-service/test";
	
	private final TransformerProvider transformerProvider;
	private final String baseUrl;
	private final boolean debug;
	
	private LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
	
	public void setHeader(String field, String value) {
		headers.put(field, value);
	}
	
	
	public TestService(){
		this(DEFAULT_BASE_URL, new TransformerProvider(), false);
	}

	public TestService(TransformerProvider transformerProvider){
		this(DEFAULT_BASE_URL, transformerProvider, false);
	}
	
	
	public TestService(String baseUrl){
		this(baseUrl, new TransformerProvider(), false);
	}
	
	public TestService(boolean debug){
		this(DEFAULT_BASE_URL, new TransformerProvider(), debug);
	}
	public TestService(String baseUrl, boolean debug){
		this(baseUrl, new TransformerProvider(), debug);
	}
	
	public TestService(String baseUrl, TransformerProvider transformerProvider, boolean debug){
		this.baseUrl = baseUrl;
		this.transformerProvider = transformerProvider;
		this.debug = debug;
		
		headers.put("X-A","A");
		headers.put("X-B","B");
	}
	
	public Response<GetStringArrayResult> getStringArray()
	  throws ServiceException {
	  	return getStringArray(new GetStringArrayRequest());
	}
	
	public Response<GetStringArrayResult> getStringArray(GetStringArrayRequest request)
	  throws ServiceException {
		
		Parser<GetStringArrayResult> parser = new Parser<GetStringArrayResult>() {
			public GetStringArrayResult parse(InputStream inStream) throws TransformException {
				return new GetStringArrayResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetStringArrayResult> response = new Response<GetStringArrayResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetIntArrayResult> getIntArray()
	  throws ServiceException {
	  	return getIntArray(new GetIntArrayRequest());
	}
	
	public Response<GetIntArrayResult> getIntArray(GetIntArrayRequest request)
	  throws ServiceException {
		
		Parser<GetIntArrayResult> parser = new Parser<GetIntArrayResult>() {
			public GetIntArrayResult parse(InputStream inStream) throws TransformException {
				return new GetIntArrayResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetIntArrayResult> response = new Response<GetIntArrayResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetLongArrayResult> getLongArray()
	  throws ServiceException {
	  	return getLongArray(new GetLongArrayRequest());
	}
	
	public Response<GetLongArrayResult> getLongArray(GetLongArrayRequest request)
	  throws ServiceException {
		
		Parser<GetLongArrayResult> parser = new Parser<GetLongArrayResult>() {
			public GetLongArrayResult parse(InputStream inStream) throws TransformException {
				return new GetLongArrayResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetLongArrayResult> response = new Response<GetLongArrayResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetDoubleArrayResult> getDoubleArray()
	  throws ServiceException {
	  	return getDoubleArray(new GetDoubleArrayRequest());
	}
	
	public Response<GetDoubleArrayResult> getDoubleArray(GetDoubleArrayRequest request)
	  throws ServiceException {
		
		Parser<GetDoubleArrayResult> parser = new Parser<GetDoubleArrayResult>() {
			public GetDoubleArrayResult parse(InputStream inStream) throws TransformException {
				return new GetDoubleArrayResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetDoubleArrayResult> response = new Response<GetDoubleArrayResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetBooleanArrayResult> getBooleanArray()
	  throws ServiceException {
	  	return getBooleanArray(new GetBooleanArrayRequest());
	}
	
	public Response<GetBooleanArrayResult> getBooleanArray(GetBooleanArrayRequest request)
	  throws ServiceException {
		
		Parser<GetBooleanArrayResult> parser = new Parser<GetBooleanArrayResult>() {
			public GetBooleanArrayResult parse(InputStream inStream) throws TransformException {
				return new GetBooleanArrayResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetBooleanArrayResult> response = new Response<GetBooleanArrayResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetEnumArrayResult> getEnumArray()
	  throws ServiceException {
	  	return getEnumArray(new GetEnumArrayRequest());
	}
	
	public Response<GetEnumArrayResult> getEnumArray(GetEnumArrayRequest request)
	  throws ServiceException {
		
		Parser<GetEnumArrayResult> parser = new Parser<GetEnumArrayResult>() {
			public GetEnumArrayResult parse(InputStream inStream) throws TransformException {
				return new GetEnumArrayResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetEnumArrayResult> response = new Response<GetEnumArrayResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetItemResult> getItem()
	  throws ServiceException {
	  	return getItem(new GetItemRequest());
	}
	
	public Response<GetItemResult> getItem(GetItemRequest request)
	  throws ServiceException {
		
		Parser<GetItemResult> parser = new Parser<GetItemResult>() {
			public GetItemResult parse(InputStream inStream) throws TransformException {
				return new GetItemResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetItemResult> response = new Response<GetItemResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetNodesResult> getNodes()
	  throws ServiceException {
	  	return getNodes(new GetNodesRequest());
	}
	
	public Response<GetNodesResult> getNodes(GetNodesRequest request)
	  throws ServiceException {
		
		Parser<GetNodesResult> parser = new Parser<GetNodesResult>() {
			public GetNodesResult parse(InputStream inStream) throws TransformException {
				return new GetNodesResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetNodesResult> response = new Response<GetNodesResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<EchoParamsResult> echoParams()
	  throws ServiceException {
	  	return echoParams(new EchoParamsRequest());
	}
	
	public Response<EchoParamsResult> echoParams(EchoParamsRequest request)
	  throws ServiceException {
		
		Parser<EchoParamsResult> parser = new Parser<EchoParamsResult>() {
			public EchoParamsResult parse(InputStream inStream) throws TransformException {
				return new EchoParamsResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<EchoParamsResult> response = new Response<EchoParamsResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<SkippingResult> skipping()
	  throws ServiceException {
	  	return skipping(new SkippingRequest());
	}
	
	public Response<SkippingResult> skipping(SkippingRequest request)
	  throws ServiceException {
		
		Parser<SkippingResult> parser = new Parser<SkippingResult>() {
			public SkippingResult parse(InputStream inStream) throws TransformException {
				return new SkippingResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<SkippingResult> response = new Response<SkippingResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<SkippingWithItemResult> skippingWithItem()
	  throws ServiceException {
	  	return skippingWithItem(new SkippingWithItemRequest());
	}
	
	public Response<SkippingWithItemResult> skippingWithItem(SkippingWithItemRequest request)
	  throws ServiceException {
		
		Parser<SkippingWithItemResult> parser = new Parser<SkippingWithItemResult>() {
			public SkippingWithItemResult parse(InputStream inStream) throws TransformException {
				return new SkippingWithItemResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<SkippingWithItemResult> response = new Response<SkippingWithItemResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetABResult> getAB()
	  throws ServiceException {
	  	return getAB(new GetABRequest());
	}
	
	public Response<GetABResult> getAB(GetABRequest request)
	  throws ServiceException {
		
		Parser<GetABResult> parser = new Parser<GetABResult>() {
			public GetABResult parse(InputStream inStream) throws TransformException {
				return new GetABResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<GetABResult> response = new Response<GetABResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<SkippingPostResult> skippingPost(SkippingPostRequest request)
	  throws ServiceException {
		
		Parser<SkippingPostResult> parser = new Parser<SkippingPostResult>() {
			public SkippingPostResult parse(InputStream inStream) throws TransformException {
				return new SkippingPostResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "POST " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			
			conn.setRequestProperty("Content-Type", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
						
			conn.connect();
			
			if(debug) {
			    ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
			    request.writeBody(transformerProvider, debugOutStream);
			    
			    Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), "UTF-8"));
			}
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			Response<SkippingPostResult> response = new Response<SkippingPostResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}	
	}
	
	public Response<PostIntResult> postInt(PostIntRequest request)
	  throws ServiceException {
		
		Parser<PostIntResult> parser = new Parser<PostIntResult>() {
			public PostIntResult parse(InputStream inStream) throws TransformException {
				return new PostIntResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "POST " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			
			conn.setRequestProperty("Content-Type", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
						
			conn.connect();
			
			if(debug) {
			    ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
			    request.writeBody(transformerProvider, debugOutStream);
			    
			    Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), "UTF-8"));
			}
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			Response<PostIntResult> response = new Response<PostIntResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}	
	}
	
	public Response<PostStringResult> postString(PostStringRequest request)
	  throws ServiceException {
		
		Parser<PostStringResult> parser = new Parser<PostStringResult>() {
			public PostStringResult parse(InputStream inStream) throws TransformException {
				return new PostStringResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "POST " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			
			conn.setRequestProperty("Content-Type", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
						
			conn.connect();
			
			if(debug) {
			    ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
			    request.writeBody(transformerProvider, debugOutStream);
			    
			    Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), "UTF-8"));
			}
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			Response<PostStringResult> response = new Response<PostStringResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}	
	}
	
	public Response<PostStringArrayResult> postStringArray(PostStringArrayRequest request)
	  throws ServiceException {
		
		Parser<PostStringArrayResult> parser = new Parser<PostStringArrayResult>() {
			public PostStringArrayResult parse(InputStream inStream) throws TransformException {
				return new PostStringArrayResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "POST " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			
			conn.setRequestProperty("Content-Type", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
						
			conn.connect();
			
			if(debug) {
			    ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
			    request.writeBody(transformerProvider, debugOutStream);
			    
			    Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), "UTF-8"));
			}
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			Response<PostStringArrayResult> response = new Response<PostStringArrayResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}	
	}
	
	public Response<EchoSegmentsResult> echoSegments(EchoSegmentsRequest request)
	  throws ServiceException {
		
		Parser<EchoSegmentsResult> parser = new Parser<EchoSegmentsResult>() {
			public EchoSegmentsResult parse(InputStream inStream) throws TransformException {
				return new EchoSegmentsResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<EchoSegmentsResult> response = new Response<EchoSegmentsResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<EchoHeadersResult> echoHeaders()
	  throws ServiceException {
	  	return echoHeaders(new EchoHeadersRequest());
	}
	
	public Response<EchoHeadersResult> echoHeaders(EchoHeadersRequest request)
	  throws ServiceException {
		
		Parser<EchoHeadersResult> parser = new Parser<EchoHeadersResult>() {
			public EchoHeadersResult parse(InputStream inStream) throws TransformException {
				return new EchoHeadersResult(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			if(debug) {
				Log.d(LOG_TAG, "GET " + url.toString());
			}
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			conn.setRequestProperty("Accept", "application/json, text/json");
			
			for(String key : headers.keySet()) {
				conn.setRequestProperty(key, headers.get(key));
			}
			
			for(String key : request.getHeaderKeys()) {
				conn.setRequestProperty(key, request.getHeaderValue(key));
			}
			
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());
			}
			
			conn.connect();
			
			Response<EchoHeadersResult> response = new Response<EchoHeadersResult>(conn, parser);
		
			if(debug) {
				NetLogHelper.logProperties(LOG_TAG, response.getHeaders());
				
				Log.d(LOG_TAG, response.readAsText());
			}
		
			return response;
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
}
