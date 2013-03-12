/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.net;

import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

import android.util.Log;

/**
 * <p>Base for all generated Mechanoid Net service clients.</p>
 *
 */
public abstract class ServiceClient {
	private static final String DEFAULT_LOG_TAG = ServiceClient.class.getSimpleName();

	protected static final String METHOD_GET = "GET";
	protected static final String METHOD_PUT = "PUT";
	protected static final String METHOD_POST = "POST";
	protected static final String METHOD_DELETE = "DELETE";

	private LinkedHashMap<String, String> mHeaders = new LinkedHashMap<String, String>();
	private String mBaseUrl;
	private boolean mDebug;

	private JsonEntityReaderProvider mReaderProvider;
	private JsonEntityWriterProvider mWriterProvider;

	private int mConnectTimeout = 20000;
	private int mReadTimeout = 20000;

	protected String getBaseUrl() {
		return mBaseUrl;
	}

	protected boolean isDebug() {
		return mDebug;
	}
	
	protected LinkedHashMap<String, String> getHeaders() {
		return mHeaders;
	}

	protected String getLogTag() {
		return DEFAULT_LOG_TAG;
	}
	
	/**
	 * <p>The reader provider for this client, if you want to override the returned
	 * reader provider, consider using {@link #createReaderProvider()} instead.</p>
	 * @return
	 */
	public JsonEntityReaderProvider getReaderProvider() {
		return mReaderProvider;
	}

	/**
	 * <p>The writer provider for this client, if you want to override the returned
	 * writer provider, consider using {@link #createWriterProvider()} instead.</p>
	 * @return
	 */
	public JsonEntityWriterProvider getWriterProvider() {
		return mWriterProvider;
	}

	/**
	 * <p>Add a request header to all requests performed by this client</p>
	 * 
	 * @param field
	 * @param value
	 */
	public void setHeader(String field, String value) {
		getHeaders().put(field, value);
	}
	
	public ServiceClient(String baseUrl, boolean debug){
		mBaseUrl = baseUrl;
		mDebug = debug;
		
		mReaderProvider = createReaderProvider();
		mWriterProvider = createWriterProvider();
	}

	/**
	 * <p>For advanced use only, override this to provide your own writer provider</p>
	 * @return
	 */
	protected abstract JsonEntityWriterProvider createWriterProvider();
	/**
	 * <p>For advanced use only, override this to provide your own reader provider</p>
	 * @return
	 */
	protected abstract JsonEntityReaderProvider createReaderProvider();

	protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT> get(
			REQUEST request, Parser<RESULT> resultParser)
			throws ServiceException {

		try {
			URL url = createUrl(request);

			if (isDebug()) {
				Log.d(getLogTag(), METHOD_GET + " " + url.toString());
			}

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			applyRequestTimeouts(request, conn);
			
			conn.setRequestMethod(METHOD_GET);

			conn.setRequestProperty("Accept", "application/json, text/json");

			applyRequestProperties(request, conn);

			if (isDebug()) {
				NetLogHelper.logProperties(getLogTag(),
						conn.getRequestProperties());
			}

			conn.connect();

			Response<RESULT> response = new Response<RESULT>(conn, resultParser);

			if (isDebug()) {
				NetLogHelper.logProperties(getLogTag(), response.getHeaders());

				Log.d(getLogTag(), response.readAsText());
			}

			return response;
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT> delete(
			REQUEST request, Parser<RESULT> resultParser)
			throws ServiceException {
		try {
			URL url = createUrl(request);

			if (isDebug()) {
				Log.d(getLogTag(), METHOD_DELETE + " " + url.toString());
			}

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			applyRequestTimeouts(request, conn);
			
			conn.setRequestMethod(METHOD_DELETE);

			applyRequestProperties(request, conn);

			if (isDebug()) {
				NetLogHelper.logProperties(getLogTag(),
						conn.getRequestProperties());
			}

			conn.connect();

			Response<RESULT> response = new Response<RESULT>(conn, resultParser);

			if (isDebug()) {
				NetLogHelper.logProperties(getLogTag(), response.getHeaders());

				Log.d(getLogTag(), response.readAsText());
			}

			return response;

		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
	
	protected <REQUEST extends EntityEnclosedServiceRequest, RESULT extends ServiceResult> Response<RESULT> 
		postUnlessPut(REQUEST request, Parser<RESULT> resultParser, boolean doPut)
			throws ServiceException {

		String method = doPut ? METHOD_PUT : METHOD_POST;
		
		try {
			URL url = createUrl(request);

			if (isDebug()) {
				Log.d(getLogTag(), method + " " + url.toString());
			}

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			applyRequestTimeouts(request, conn);
			
			conn.setDoOutput(true);
			conn.setRequestMethod(method);

			conn.setRequestProperty("Content-Type", "application/json, text/json");

			applyRequestProperties(request, conn);

			if (isDebug()) {
				NetLogHelper
						.logProperties(getLogTag(), conn.getRequestProperties());
			}

			conn.connect();

			if (isDebug()) {
				ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
				request.writeBody(mWriterProvider, debugOutStream);

				Log.d(getLogTag(), new String(debugOutStream.toByteArray(), "UTF-8"));
			}

			request.writeBody(mWriterProvider, conn.getOutputStream());

			Response<RESULT> response = new Response<RESULT>(conn, resultParser);

			if (isDebug()) {
				NetLogHelper.logProperties(getLogTag(), response.getHeaders());

				Log.d(getLogTag(), response.readAsText());
			}

			return response;

		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
	
	protected <REQUEST extends EntityEnclosedServiceRequest, RESULT extends ServiceResult> Response<RESULT> 
		post(REQUEST request, Parser<RESULT> resultParser)
			throws ServiceException {
		return postUnlessPut(request, resultParser, false);
	}
	
	protected <REQUEST extends EntityEnclosedServiceRequest, RESULT extends ServiceResult> Response<RESULT> 
		put(REQUEST request, Parser<RESULT> resultParser)
			throws ServiceException {
		return postUnlessPut(request, resultParser, true);
	}
	

	protected <REQUEST extends ServiceRequest> void applyRequestTimeouts(
			REQUEST request, HttpURLConnection conn) {
		if(request.getReadTimeout() > -1) {
			conn.setReadTimeout(request.getReadTimeout());
		} else {
			conn.setReadTimeout(mReadTimeout);
		}
		
		if(request.getConnectTimeout() > -1) {
			conn.setConnectTimeout(request.getConnectTimeout());
		} else {
			conn.setConnectTimeout(mConnectTimeout);
		}
	}
	
	/**
	 * <p>Sets request properties using this clients headers and then
	 * headers from the given request such that request properties from the
	 * given request will override those set from this client.</p>
	 * 
	 * @param request The request to add headers from
	 * @param conn The connection to add headers to
	 */
	protected <REQUEST extends ServiceRequest> void applyRequestProperties(
			REQUEST request, HttpURLConnection conn) {
		for (String key : getHeaders().keySet()) {
			conn.setRequestProperty(key, getHeaders().get(key));
		}

		for (String key : request.getHeaderKeys()) {
			conn.setRequestProperty(key, request.getHeaderValue(key));
		}
	}

	/**
	 * <p>Creates a url from the given request</p>
	 * 
	 * @param request
	 * @return
	 * @throws MalformedURLException
	 */
	protected <REQUEST extends ServiceRequest> URL createUrl(
			REQUEST request) throws MalformedURLException {
		URL url = new URL(request.createUrl(getBaseUrl()));
		return url;
	}
}
