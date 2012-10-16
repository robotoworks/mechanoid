package com.mechanoid.net;


import android.net.Uri;

public class GetABRequest {
	
	private static final String PATH="/ab";
	
	public GetABRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
