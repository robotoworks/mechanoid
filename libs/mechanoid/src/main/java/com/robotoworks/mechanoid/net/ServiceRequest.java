package com.robotoworks.mechanoid.net;

import java.util.LinkedHashMap;
import java.util.Set;

public abstract class ServiceRequest {
	
	private LinkedHashMap<String, String> mHeaders = new LinkedHashMap<String, String>();
	
	public void setHeader(String field, String value) {
		mHeaders.put(field, value);
	}
	
	public Set<String> getHeaderKeys() {
		return mHeaders.keySet();
	}
	
	public String getHeaderValue(String key) {
		return mHeaders.get(key);
	}
	
	public abstract String createUrl(String baseUrl);
}
