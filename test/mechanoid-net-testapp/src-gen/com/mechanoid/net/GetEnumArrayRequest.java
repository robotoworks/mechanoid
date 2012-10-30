package com.mechanoid.net;


import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;

public class GetEnumArrayRequest {
	
	private static final String PATH="/enumArray";
	
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

	public GetEnumArrayRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}