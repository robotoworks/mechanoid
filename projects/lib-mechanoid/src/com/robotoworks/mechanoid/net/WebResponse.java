package com.robotoworks.mechanoid.net;

import java.io.InputStream;

import org.apache.http.Header;

public class WebResponse<T> {

	private final InputStream mContent;
	private final int mStatusCode;
	private final Header[] mHeaders;
	private WebResponseParser<T> mParser;
	
	private T mParsedContent;

	public InputStream getContentStream() {
		return mContent;
	}
	
	public int getStatusCode() {
		return mStatusCode;
	}
	
	public Header[] getHeaders() {
		return mHeaders;
	}	
	
	public WebResponse(InputStream content, int statusCode, Header[] headers, WebResponseParser<T> parser) {
		mContent = content;
		mStatusCode = statusCode;
		mHeaders = headers;
		mParser = parser;
	}
	
	public T getContent() throws TransformException {
		if(mParsedContent == null) {
			mParsedContent = mParser.parse(this);
		}
		
		return mParsedContent;
	}
}
