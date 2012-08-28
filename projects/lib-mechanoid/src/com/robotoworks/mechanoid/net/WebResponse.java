package com.robotoworks.mechanoid.net;

import org.apache.http.Header;

public class WebResponse<T> {

	private final int mStatusCode;
	private final Header[] mHeaders;

	private T mContent;

	public int getStatusCode() {
		return mStatusCode;
	}

	public Header[] getHeaders() {
		return mHeaders;
	}

	public WebResponse(int statusCode, Header[] headers) {
		mStatusCode = statusCode;
		mHeaders = headers;
	}

	public T getContent() {
		return mContent;
	}

	public void setContent(T content) {
		mContent = content;
	}
}
