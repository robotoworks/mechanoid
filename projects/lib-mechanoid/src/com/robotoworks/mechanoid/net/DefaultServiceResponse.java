package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.Header;
import org.apache.http.HttpResponse;

public class DefaultServiceResponse implements ServiceResponse {

	private HttpResponse mResponse;

	public DefaultServiceResponse(HttpResponse response) {
		mResponse = response;
	}

	@Override
	public int getStatus() {
		return mResponse.getStatusLine().getStatusCode();
	}

	@Override
	public Header[] getHeaders() {
		return mResponse.getAllHeaders();
	}

	@Override
	public InputStream getContent() throws IllegalStateException, IOException {
		// TODO Auto-generated method stub
		return mResponse.getEntity().getContent();
	}
}
