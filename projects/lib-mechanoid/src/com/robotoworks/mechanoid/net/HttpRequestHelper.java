package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;

import android.util.Log;

public class HttpRequestHelper {
	private static final String LOG_TAG = HttpRequestHelper.class.getSimpleName();
	
	public static final String MIME_TYPE_JSON = "application/json";
	
	private HttpClient httpClient;

	public HttpRequestHelper(HttpClient httpClient){
		this.httpClient = httpClient;
	}
	
	public <T> WebResponse<T> post(String action, String body, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(action);

		Log.d(LOG_TAG, "POST URL: " + action);
		Log.d(LOG_TAG, "POST BODY: " + body);
		return execute(post, body, parser);
	}

	public <T> WebResponse<T> delete(String action, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpDelete delete = new HttpDelete(action);

		Log.d(LOG_TAG, "DELETE: " + action);
		
		return execute(delete, parser);
	}

	public <T> WebResponse<T> put(String action, String body, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpPut put = new HttpPut(action);
		
		Log.d(LOG_TAG, "PUT URL: " + action);
		Log.d(LOG_TAG, "PUT BODY: " + body);
		
		return execute(put, body, parser);
	}
	
	public <T> WebResponse<T> get(String url, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(url);
		
		Log.d(LOG_TAG, "GET: " + url);
		
		return execute(get, parser);
	}
		
	//---
	
	public <T> WebResponse<T> postJson(String url, String body, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(url);

		Log.d(LOG_TAG, "POST URL: " + url);
		Log.d(LOG_TAG, "POST BODY: " + body);
		return executeJson(post, body, parser);
	}

	public <T> WebResponse<T> deleteJson(String url, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpDelete delete = new HttpDelete(url);

		Log.d(LOG_TAG, "DELETE: " + url);
		
		return executeJson(delete, parser);
	}

	public <T> WebResponse<T> putJson(String url, String body, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpPut put = new HttpPut(url);
		
		Log.d(LOG_TAG, "PUT URL: " + url);
		Log.d(LOG_TAG, "PUT BODY: " + body);
		
		return executeJson(put, body, parser);
	}
	
	public <T> WebResponse<T> getJson(String url, Parser<T> parser) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(url);
		
		Log.d(LOG_TAG, "GET: " + url);
		
		return executeJson(get, parser);
	}
	
	private <T> WebResponse<T> executeJson(HttpEntityEnclosingRequestBase request, String entity, Parser<T> parser) throws IOException{
		request.addHeader("Accept", MIME_TYPE_JSON);
		request.addHeader("Content-Type", MIME_TYPE_JSON);

		return execute(request, entity, parser);
	}
	
	private <T> WebResponse<T> executeJson(HttpUriRequest request, Parser<T> parser) throws IOException {		
		request.addHeader("Accept", MIME_TYPE_JSON);
		request.addHeader("Content-Type", MIME_TYPE_JSON);

		return execute(request, parser);
	}
	
	private <T> WebResponse<T> execute(HttpEntityEnclosingRequestBase request, String entity, Parser<T> parser) throws IOException{
		StringEntity formEntity = new StringEntity(entity, HTTP.UTF_8);
		request.setEntity(formEntity);
		
		return execute(request, parser);
	}
	
	private <T> WebResponse<T> execute(HttpUriRequest request, Parser<T> parser) throws IOException {		
		HttpResponse response = httpClient.execute(request);
		HttpEntity responseEntity = response.getEntity();

		WebResponse<T> webResponse = new WebResponse<T>(response.getStatusLine().getStatusCode(), response.getAllHeaders());
		
		InputStream responseStream = responseEntity.getContent();
		
		try {
			T content = parser.parse(responseStream);
			webResponse.setContent(content);
		} catch (TransformException e) {
			e.printStackTrace();
		}
		
		return webResponse;
	}
}
