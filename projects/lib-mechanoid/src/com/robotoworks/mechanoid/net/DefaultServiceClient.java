package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.Header;
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
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;

import android.util.Log;

public class DefaultServiceClient implements ServiceClient {
	private static final String LOG_TAG = DefaultServiceClient.class.getSimpleName();
	
	public static final String MIME_TYPE_JSON = "application/json";
	
	private HttpClient httpClient;

	public DefaultServiceClient(){
		this(new DefaultHttpClient());
	}
	
	public DefaultServiceClient(HttpClient httpClient){
		this.httpClient = httpClient;
	}
	
	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#post(java.lang.String, java.lang.String)
	 */
	@Override
	public ServiceResponse post(String action, String body) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(action);

		Log.d(LOG_TAG, "POST URL: " + action);
		Log.d(LOG_TAG, "POST BODY: " + body);
		return execute(post, body);
	}

	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#delete(java.lang.String)
	 */
	@Override
	public ServiceResponse delete(String action) throws ClientProtocolException, IOException {
		HttpDelete delete = new HttpDelete(action);

		Log.d(LOG_TAG, "DELETE: " + action);
		
		return execute(delete);
	}

	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#put(java.lang.String, java.lang.String)
	 */
	@Override
	public ServiceResponse put(String action, String body) throws ClientProtocolException, IOException {
		HttpPut put = new HttpPut(action);
		
		Log.d(LOG_TAG, "PUT URL: " + action);
		Log.d(LOG_TAG, "PUT BODY: " + body);
		
		return execute(put, body);
	}
	
	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#get(java.lang.String)
	 */
	@Override
	public ServiceResponse get(String url) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(url);
		
		Log.d(LOG_TAG, "GET: " + url);
		
		return execute(get);
	}
		
	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#postJson(java.lang.String, java.lang.String)
	 */
	@Override
	public ServiceResponse postJson(String url, String body) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(url);

		Log.d(LOG_TAG, "POST URL: " + url);
		Log.d(LOG_TAG, "POST BODY: " + body);
		return executeJson(post, body);
	}

	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#deleteJson(java.lang.String)
	 */
	@Override
	public ServiceResponse deleteJson(String url) throws ClientProtocolException, IOException {
		HttpDelete delete = new HttpDelete(url);

		Log.d(LOG_TAG, "DELETE: " + url);
		
		return executeJson(delete);
	}

	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#putJson(java.lang.String, java.lang.String)
	 */
	@Override
	public ServiceResponse putJson(String url, String body) throws ClientProtocolException, IOException {
		HttpPut put = new HttpPut(url);
		
		Log.d(LOG_TAG, "PUT URL: " + url);
		Log.d(LOG_TAG, "PUT BODY: " + body);
		
		return executeJson(put, body);
	}
	
	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.XServiceClient#getJson(java.lang.String)
	 */
	@Override
	public ServiceResponse getJson(String url) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(url);
		
		Log.d(LOG_TAG, "GET: " + url);
		
		return executeJson(get);
	}
	
	private ServiceResponse executeJson(HttpEntityEnclosingRequestBase request, String entity) throws IOException{
		request.addHeader("Accept", MIME_TYPE_JSON);
		request.addHeader("Content-Type", MIME_TYPE_JSON);

		return execute(request, entity);
	}
	
	private ServiceResponse executeJson(HttpUriRequest request) throws IOException {		
		request.addHeader("Accept", MIME_TYPE_JSON);
		request.addHeader("Content-Type", MIME_TYPE_JSON);

		return execute(request);
	}
	
	private ServiceResponse execute(HttpEntityEnclosingRequestBase request, String entity) throws IOException{
		StringEntity formEntity = new StringEntity(entity, HTTP.UTF_8);
		request.setEntity(formEntity);
		
		return execute(request);
	}
	
	private ServiceResponse execute(HttpUriRequest request) throws IOException {		
		HttpResponse response = httpClient.execute(request);
		
		return new DefaultServiceResponse(response);
	}
}
