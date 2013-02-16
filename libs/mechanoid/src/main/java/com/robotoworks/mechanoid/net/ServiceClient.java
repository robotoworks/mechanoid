package com.robotoworks.mechanoid.net;

import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

import android.util.Log;

public abstract class ServiceClient {
	private static final String DEFAULT_LOG_TAG = ServiceClient.class.getSimpleName();

	protected static final String METHOD_GET = "GET";
	protected static final String METHOD_PUT = "PUT";
	protected static final String METHOD_POST = "POST";
	protected static final String METHOD_DELETE = "DELETE";

	private LinkedHashMap<String, String> mHeaders = new LinkedHashMap<String, String>();
	private String mBaseUrl;
	private TransformerProvider mTransformerProvider;
	private boolean mDebug;

	protected String getBaseUrl() {
		return mBaseUrl;
	}

	protected boolean isDebug() {
		return mDebug;
	}
	
	protected TransformerProvider getTransformerProvider() {
		return mTransformerProvider;
	}
	
	protected LinkedHashMap<String, String> getHeaders() {
		return mHeaders;
	}

	protected String getLogTag() {
		return DEFAULT_LOG_TAG;
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
	
	public ServiceClient(String baseUrl, TransformerProvider transformerProvider, boolean debug){
		mBaseUrl = baseUrl;
		mTransformerProvider = transformerProvider;
		mDebug = debug;
	}

	protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT> get(
			REQUEST request, Parser<RESULT> resultParser)
			throws ServiceException {

		try {
			URL url = createUrl(request);

			if (isDebug()) {
				Log.d(getLogTag(), METHOD_GET + " " + url.toString());
			}

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(METHOD_GET);

			conn.setRequestProperty("Accept", "application/json, text/json");

			setRequestProperties(request, conn);

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
			conn.setRequestMethod(METHOD_DELETE);

			setRequestProperties(request, conn);

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
			conn.setDoOutput(true);
			conn.setRequestMethod(method);

			conn.setRequestProperty("Content-Type", "application/json, text/json");

			setRequestProperties(request, conn);

			if (isDebug()) {
				NetLogHelper
						.logProperties(getLogTag(), conn.getRequestProperties());
			}

			conn.connect();

			if (isDebug()) {
				ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
				request.writeBody(getTransformerProvider(), debugOutStream);

				Log.d(getLogTag(), new String(debugOutStream.toByteArray(), "UTF-8"));
			}

			request.writeBody(getTransformerProvider(), conn.getOutputStream());

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
	
	/**
	 * <p>Sets request properties using this clients headers and then
	 * headers from the given request such that request properties from the
	 * given request will override those set from this client.</p>
	 * 
	 * @param request The request to add headers from
	 * @param conn The connection to add headers to
	 */
	protected <REQUEST extends ServiceRequest> void setRequestProperties(
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
