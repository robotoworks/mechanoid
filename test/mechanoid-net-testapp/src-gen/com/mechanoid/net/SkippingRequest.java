package com.mechanoid.net;


import android.net.Uri;

public class SkippingRequest {
	
	private static final String PATH="/skipping";
	
	public SkippingRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
