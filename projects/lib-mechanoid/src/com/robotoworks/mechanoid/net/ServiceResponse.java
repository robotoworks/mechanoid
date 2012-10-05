package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.Header;

public interface ServiceResponse {
	int getStatus();
	Header[] getHeaders();
	InputStream getContent() throws IllegalStateException, IOException;
}
