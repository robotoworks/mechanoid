package com.mechanoid.net;


import android.net.Uri;

public class GetIntArrayRequest {
	
	private static final String PATH="/intArray";
	
	public GetIntArrayRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
