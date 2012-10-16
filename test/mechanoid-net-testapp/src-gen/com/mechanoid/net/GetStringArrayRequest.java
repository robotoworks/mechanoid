package com.mechanoid.net;


import android.net.Uri;

public class GetStringArrayRequest {
	
	private static final String PATH="/stringArray";
	
	public GetStringArrayRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
