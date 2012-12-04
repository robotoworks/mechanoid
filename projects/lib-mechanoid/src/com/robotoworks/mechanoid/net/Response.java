package com.robotoworks.mechanoid.net;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

import com.robotoworks.mechanoid.util.Streams;

public class Response<T> {

	private T mContent;
	private HttpURLConnection mConn;
	private Parser<T> mParser;
	private int mResponseCode;
	private Map<String, List<String>> mHeaders;
	
	private byte[] mInputBytes;

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
			mContent = mParser.parse(resolveInputStream());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		
		return mContent;
	}
	
	/**
	 * Reads the stream as text, the underlying stream will first be copied
	 * into a byte buffer before being returned as a string. this will make sure
	 * that calls to parse() will still succeed, this is useful for debugging
	 * purposes but should be avoided if the intention is just to parse
	 * 
	 * @return
	 * @throws IOException
	 */
	public String readAsText() throws IOException {
		if(mInputBytes == null) {
			mInputBytes = Streams.readAllBytes(mConn.getInputStream());
		}
		
		return Streams.readAllText(new ByteArrayInputStream(mInputBytes));
	}
	
	private InputStream resolveInputStream() throws IOException {
		if(mInputBytes != null) {
			return mConn.getInputStream();
		} else {
			return new ByteArrayInputStream(mInputBytes);
		}
	}
}
