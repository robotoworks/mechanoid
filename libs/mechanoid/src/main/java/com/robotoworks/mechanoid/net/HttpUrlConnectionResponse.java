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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

import com.robotoworks.mechanoid.util.Streams;

/**
 * <p>A Mechanoid Net response that captures the HTTP response code and headers of a HTTP response.</p>
 * <p>The response defers parsing from the stream until {@link #parse()} is called, this allows examination
 * of the response code before reading the stream in case of an unexpected response code.</p>
 * 
 * @param <T> A result representing that which will be parsed when {@link #parse()} is called.
 */
public class HttpUrlConnectionResponse<T> implements Response<T> {
	private T mContent;
	private HttpURLConnection mConn;
	private Parser<T> mParser;
	private int mResponseCode;
	private Map<String, List<String>> mHeaders;
	
	private byte[] mInputBytes;
	
	private boolean mParsed;

	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.Response2#getResponseCode()
	 */
	@Override
	public int getResponseCode() {
		return mResponseCode;
	}
	
	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.Response2#checkResponseCodeOk()
	 */
	@Override
	public void checkResponseCodeOk() throws UnexpectedHttpStatusException {
		if(mResponseCode != HTTP_OK) {
			throw new UnexpectedHttpStatusException(mResponseCode, HTTP_OK);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.Response2#checkResponseCode(int)
	 */
	@Override
	public void checkResponseCode(int responseCode) throws UnexpectedHttpStatusException {
		if(mResponseCode != responseCode) {
			throw new UnexpectedHttpStatusException(mResponseCode, HTTP_OK);
		}
	}

	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.Response2#getHeaders()
	 */
	@Override
	public Map<String, List<String>> getHeaders() {
		return mHeaders;
	}

	public HttpUrlConnectionResponse(HttpURLConnection conn, Parser<T> parser) throws ServiceException {
		mConn = conn;
		mParser = parser;
		try {
		mResponseCode = conn.getResponseCode();
		mHeaders = conn.getHeaderFields();
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.Response2#parse()
	 */
	@Override
	public T parse() throws ServiceException {
		if(mParsed) {
			return mContent;
		}
		
		try {
			InputStream stream = null;
			if(mInputBytes == null) {
				stream = getInputStream();
			} else {
				if(mInputBytes.length > 0) {
					stream = new ByteArrayInputStream(mInputBytes);
				}
			}
			
			if(stream != null) {
				mContent = mParser.parse(stream);
			}
			
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		
		mParsed = true;
		
		return mContent;
	}

	private InputStream getInputStream() throws IOException {
		// error stream is available only if there was a connection with the 
		// server, the server returned an error and also returned some usefull 
		// data. Example being status 404 with page to search for content.
		InputStream stream = mConn.getErrorStream();
		if (stream != null)
			return stream;
		return mConn.getInputStream();
	}
	
	/* (non-Javadoc)
	 * @see com.robotoworks.mechanoid.net.Response2#readAsText()
	 */
	@Override
	public String readAsText() throws IOException {
		if(mInputBytes == null) {
			InputStream stream = getInputStream();
			if(stream == null) {
				mInputBytes = new byte[]{};
			} else {
				mInputBytes = Streams.readAllBytes(getInputStream());
			}
		}
		
		return Streams.readAllText(new ByteArrayInputStream(mInputBytes));
	}
}
