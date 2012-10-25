package com.robotoworks.mechanoid.net;

import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

public class Response<T> {

	private T mContent;
	private HttpURLConnection mConn;
	private Parser<T> mParser;
	private int mResponseCode;
	private Map<String, List<String>> mHeaders;

	/**
	 * @return The HTTP Response Code, i.e.:- 200
	 */
	public int getResponseCode() {
		return mResponseCode;
	}

	/**
	 * @return A Map of header fields
	 */
	public Map<String, List<String>> getHeaders() {
		return mHeaders;
	}

	public Response(HttpURLConnection conn, Parser<T> parser) throws ServiceException {
		mConn = conn;
		mParser = parser;
		try {
		mResponseCode = conn.getResponseCode();
		mHeaders = conn.getHeaderFields();
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	/**
	 * Parses the response stream into <T>
	 * @return The parsed response <T>
	 * @throws ServiceException
	 */
	public T parse() throws ServiceException {
		if(mContent != null) {
			return mContent;
		}
		
		try {
			mContent = mParser.parse(mConn.getInputStream());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		
		return mContent;
	}
}
