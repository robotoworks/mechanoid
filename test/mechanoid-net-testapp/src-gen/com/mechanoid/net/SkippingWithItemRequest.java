package com.mechanoid.net;


import android.net.Uri;

public class SkippingWithItemRequest {
	
	private static final String PATH="/skipping";
	
	public SkippingWithItemRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
