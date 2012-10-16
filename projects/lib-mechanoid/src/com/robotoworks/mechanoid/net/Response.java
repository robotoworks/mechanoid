package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

public class Response<T> {

	private T mContent;
	private HttpURLConnection mConn;
	private Parser<T> mParser;
	private int mResponseCode;
	private Map<String, List<String>> mHeaders;

	public int getResponseCode() {
		return mResponseCode;
	}

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
