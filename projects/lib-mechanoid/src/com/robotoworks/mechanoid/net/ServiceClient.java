package com.robotoworks.mechanoid.net;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public interface ServiceClient {

	public abstract ServiceResponse post(String action, String body)
			throws ClientProtocolException, IOException;

	public abstract ServiceResponse delete(String action)
			throws ClientProtocolException, IOException;

	public abstract ServiceResponse put(String action, String body)
			throws ClientProtocolException, IOException;

	public abstract ServiceResponse get(String url)
			throws ClientProtocolException, IOException;

	public abstract ServiceResponse postJson(String url, String body)
			throws ClientProtocolException, IOException;

	public abstract ServiceResponse deleteJson(String url)
			throws ClientProtocolException, IOException;

	public abstract ServiceResponse putJson(String url, String body)
			throws ClientProtocolException, IOException;

	public abstract ServiceResponse getJson(String url)
			throws ClientProtocolException, IOException;

}