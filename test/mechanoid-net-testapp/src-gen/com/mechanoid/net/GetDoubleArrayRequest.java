package com.mechanoid.net;


import android.net.Uri;

public class GetDoubleArrayRequest {
	
	private static final String PATH="/doubleArray";
	
	public GetDoubleArrayRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
