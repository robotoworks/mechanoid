package com.mechanoid.net;


import android.net.Uri;

public class GetBooleanArrayRequest {
	
	private static final String PATH="/booleanArray";
	
	public GetBooleanArrayRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
