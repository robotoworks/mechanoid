package com.robotoworks.mechanoid.net;

import org.apache.http.Header;

public class Response<T> {

	private T mContent;
	private ServiceResponse mResponse;
	private Parser<T> mParser;

	public int getStatus() {
		return mResponse.getStatus();
	}

	public Header[] getHeaders() {
		return mResponse.getHeaders();
	}

	public Response(ServiceResponse response, Parser<T> parser) {
		mResponse = response;
		mParser = parser;
	}

	public T parse() throws TransformException {
		if(mContent != null) {
			return mContent;
		}
		
		try {
			mContent = mParser.parse(mResponse.getContent());
		} catch (Exception e) {
			throw new TransformException(e);
		}
		
		return mContent;
	}
}
