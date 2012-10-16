package com.mechanoid.net;


import android.net.Uri;

public class GetEnumArrayRequest {
	
	private static final String PATH="/enumArray";
	
	public GetEnumArrayRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
