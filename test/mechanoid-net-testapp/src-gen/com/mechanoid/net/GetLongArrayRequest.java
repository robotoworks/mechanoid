package com.mechanoid.net;


import android.net.Uri;

public class GetLongArrayRequest {
	
	private static final String PATH="/longArray";
	
	public GetLongArrayRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
