package com.robotoworks.example.movies.net;


import android.net.Uri;
import com.robotoworks.mechanoid.net.ServiceRequest;

public class GetMoviesRequest extends ServiceRequest {
	
	private static final String PATH = "/v1/movies";
	
	public GetMoviesRequest(){
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
