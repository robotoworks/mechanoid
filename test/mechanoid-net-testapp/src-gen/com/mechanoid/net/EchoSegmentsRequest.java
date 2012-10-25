package com.mechanoid.net;


import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;

public class EchoSegmentsRequest {
	
	private static final String PATH="/echoUrl/%s/%s/%s";
	
	private LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
	
	public void setHeader(String field, String value) {
		headers.put(field, value);
	}
	
	public Set<String> getHeaderKeys() {
		return headers.keySet();
	}
	
	public String getHeaderValue(String key) {
		return headers.get(key);
	}

	private final String aSegment;
	private final String bSegment;
	private final String cSegment;
	
	public EchoSegmentsRequest(	String aSegment,
		String bSegment,
		String cSegment){
		this.aSegment = aSegment;
		this.bSegment = bSegment;
		this.cSegment = cSegment;
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(String.format(baseUrl + PATH, aSegment, bSegment, cSegment)).buildUpon();
			
		return uriBuilder.toString();			
	}
}
