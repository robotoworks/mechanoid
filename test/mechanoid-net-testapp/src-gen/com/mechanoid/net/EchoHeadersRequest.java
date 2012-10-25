package com.mechanoid.net;


import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;

public class EchoHeadersRequest {
	
	private static final String PATH="/echoHeaders";
	
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

	public EchoHeadersRequest(){
		headers.put("X-C","C");
		
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
