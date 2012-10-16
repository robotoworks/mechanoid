package com.mechanoid.net;


import android.net.Uri;

public class GetItemRequest {
	
	private static final String PATH="/item";
	
	public GetItemRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
