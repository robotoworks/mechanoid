/*
 * Copyright 2013 Robotoworks Limited
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.robotoworks.mechanoid.net;

import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

/**
 * <p>
 * Base for all generated Mechanoid Net service clients.
 * </p>
 */
public abstract class ServiceClient {
    private static final String DEFAULT_LOG_TAG = ServiceClient.class.getSimpleName();

    protected static final String METHOD_GET = "GET";
    protected static final String METHOD_PUT = "PUT";
    protected static final String METHOD_POST = "POST";
    protected static final String METHOD_DELETE = "DELETE";
    protected static final String METHOD_PATCH = "PATCH";

    
    private final LinkedHashMap<String, String> mHeaders = new LinkedHashMap<String, String>();
    private final String mBaseUrl;
    private final boolean mDebug;

    private final JsonEntityReaderProvider mReaderProvider;
    private final JsonEntityWriterProvider mWriterProvider;

    private final int mConnectTimeout = 20000;
    private final int mReadTimeout = 20000;

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
     * <p>
     * The reader provider for this client, if you want to override the returned reader provider, consider using
     * {@link #createReaderProvider()} instead.
     * </p>
     * 
     * @return
     */
    public JsonEntityReaderProvider getReaderProvider() {
        return mReaderProvider;
    }

    /**
     * <p>
     * The writer provider for this client, if you want to override the returned writer provider, consider using
     * {@link #createWriterProvider()} instead.
     * </p>
     * 
     * @return
     */
    public JsonEntityWriterProvider getWriterProvider() {
        return mWriterProvider;
    }

    /**
     * <p>
     * Add a request header to all requests performed by this client
     * </p>
     * 
     * @param field
     * @param value
     */
    public void setHeader(String field, String value) {
        getHeaders().put(field, value);
    }

    public ServiceClient(String baseUrl, boolean debug) {
        mBaseUrl = baseUrl;
        mDebug = debug;

        mReaderProvider = createReaderProvider();
        mWriterProvider = createWriterProvider();
    }

    /**
     * <p>
     * For advanced use only, override this to provide your own writer provider
     * </p>
     * 
     * @return
     */
    protected abstract JsonEntityWriterProvider createWriterProvider();

    /**
     * <p>
     * For advanced use only, override this to provide your own reader provider
     * </p>
     * 
     * @return
     */
    protected abstract JsonEntityReaderProvider createReaderProvider();

    protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT> get(
            REQUEST request, Parser<RESULT> resultParser)
            throws ServiceException {

        try {
            URL url = createUrl(request);

            Response<RESULT> mockedResponse = createMockedResponse(url, request, resultParser);
            if (mockedResponse != null) {

                if (isDebug()) {
                    Log.d(getLogTag(), METHOD_GET + " Mocked Response");
                }

                return mockedResponse;
            }

            if (isDebug()) {
                Log.d(getLogTag(), METHOD_GET + " " + url.toString());
            }

            HttpURLConnection conn = openConnection(url);

            applyRequestTimeouts(request, conn);

            conn.setRequestMethod(METHOD_GET);

            conn.setRequestProperty("Accept", "application/json, text/json");

            applyRequestProperties(request, conn);

            if (isDebug()) {
                NetLogHelper.logProperties(getLogTag(), conn.getRequestProperties());
            }

            conn.connect();

            Response<RESULT> response = new HttpUrlConnectionResponse<RESULT>(conn, resultParser);

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

            Response<RESULT> mockedResponse = createMockedResponse(url, request, resultParser);
            if (mockedResponse != null) {

                if (isDebug()) {
                    Log.d(getLogTag(), METHOD_DELETE + " Mocked Response");
                }

                return mockedResponse;
            }

            if (isDebug()) {
                Log.d(getLogTag(), METHOD_DELETE + " " + url.toString());
            }

            HttpURLConnection conn = openConnection(url);

            applyRequestTimeouts(request, conn);

            conn.setRequestMethod(METHOD_DELETE);

            applyRequestProperties(request, conn);

            if (isDebug()) {
                NetLogHelper.logProperties(getLogTag(),
                        conn.getRequestProperties());
            }

            conn.connect();

            Response<RESULT> response = new HttpUrlConnectionResponse<RESULT>(conn, resultParser);

            if (isDebug()) {
                NetLogHelper.logProperties(getLogTag(), response.getHeaders());

                Log.d(getLogTag(), response.readAsText());
            }

            return response;

        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT>
    		genericMethod(REQUEST request, Parser<RESULT> resultParser, String method)
            throws ServiceException {

        try {
            boolean xWwwFormUrlencoded = getHeaders().get("Content-Type") != null
                    && getHeaders().get("Content-Type").startsWith("application/x-www-form-urlencoded");
            URL url = createUrl(request, xWwwFormUrlencoded);

            Response<RESULT> mockedResponse = createMockedResponse(url, request, resultParser);
            if (mockedResponse != null) {

                if (isDebug()) {
                    Log.d(getLogTag(), method + " Mocked Response");
                }

                return mockedResponse;
            }

            if (isDebug()) {
                Log.d(getLogTag(), method + " " + url.toString());
            }

            HttpURLConnection conn = openConnection(url);

            applyRequestTimeouts(request, conn);

            conn.setDoOutput(true);
            conn.setRequestMethod(method);

            if (!xWwwFormUrlencoded) {
                conn.setRequestProperty("Content-Type", "application/json, text/json");
            }

            applyRequestProperties(request, conn);

            if (isDebug()) {
                NetLogHelper.logProperties(getLogTag(), conn.getRequestProperties());
            }

            conn.connect();

            if (request instanceof EntityEnclosedServiceRequest) {
                EntityEnclosedServiceRequest entityEnclosedRequest = (EntityEnclosedServiceRequest) request;

                if (isDebug()) {
                    ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();
                    entityEnclosedRequest.writeBody(mWriterProvider, debugOutStream);

                    Log.d(getLogTag(), new String(debugOutStream.toByteArray(), "UTF-8"));
                }
                entityEnclosedRequest.writeBody(mWriterProvider, conn.getOutputStream());
            }

            // for x-www-form-urlencoded params send with OutputStream
            if (xWwwFormUrlencoded) {
                String payload = getParamPayload(request);
                if (isDebug()) {
                    Log.d(getLogTag(), "x-www-form-urlencoded params:" + payload);
                }
                // send the POST out
                PrintWriter out = new PrintWriter(conn.getOutputStream());
                out.print(payload);
                out.close();
            }

            Response<RESULT> response = new HttpUrlConnectionResponse<RESULT>(conn, resultParser);

            if (isDebug()) {
                NetLogHelper.logProperties(getLogTag(), response.getHeaders());
                Log.d(getLogTag(), response.readAsText());
            }

            return response;

        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    protected HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT>
            post(REQUEST request, Parser<RESULT> resultParser)
                    throws ServiceException {
        return genericMethod(request, resultParser, METHOD_POST);
    }

    protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT>
            put(REQUEST request, Parser<RESULT> resultParser)
                    throws ServiceException {
        return genericMethod(request, resultParser, METHOD_PUT);
    }
    
    protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT>
    		patch(REQUEST request, Parser<RESULT> resultParser)
            throws ServiceException {
    	return genericMethod(request, resultParser, METHOD_PATCH);

    }

    protected <REQUEST extends ServiceRequest> void applyRequestTimeouts(
            REQUEST request, HttpURLConnection conn) {
        if (request.getReadTimeout() > -1) {
            conn.setReadTimeout(request.getReadTimeout());
        } else {
            conn.setReadTimeout(mReadTimeout);
        }

        if (request.getConnectTimeout() > -1) {
            conn.setConnectTimeout(request.getConnectTimeout());
        } else {
            conn.setConnectTimeout(mConnectTimeout);
        }
    }

    /**
     * <p>
     * Sets request properties using this clients headers and then headers from the given request such that request properties
     * from the given request will override those set from this client.
     * </p>
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
     * <p>
     * get param payload from request, necessary in case of xWwwFormUrlencoded
     * </p>
     * 
     * @param request
     * @return
     * @throws MalformedURLException
     */
    protected <REQUEST extends ServiceRequest> String getParamPayload(REQUEST request)
            throws MalformedURLException {
        String urlStr = request.createUrl(getBaseUrl());
        if (urlStr.indexOf("?") > 0) {
            urlStr = urlStr.substring(urlStr.indexOf("?") + 1);
        }
        return urlStr;
    }

    /**
     * <p>
     * Creates a url from the given request, in case of xWwwFormUrlencoded without params
     * </p>
     * 
     * @param request
     * @return
     * @throws MalformedURLException
     */
    protected <REQUEST extends ServiceRequest> URL createUrl(REQUEST request, boolean xWwwFormUrlencoded)
            throws MalformedURLException {
        String urlStr = request.createUrl(getBaseUrl());
        if (xWwwFormUrlencoded && urlStr.indexOf("?") > 0) {
            urlStr = urlStr.substring(0, urlStr.indexOf("?"));
        }
        URL url = new URL(urlStr);
        return url;
    }

    protected <REQUEST extends ServiceRequest> URL createUrl(REQUEST request)
            throws MalformedURLException {
        return createUrl(request, false);
    }

    protected <REQUEST extends ServiceRequest, RESULT extends ServiceResult> Response<RESULT> createMockedResponse(URL url,
            REQUEST request, Parser<RESULT> resultParser) {
        return null;
    }
}
