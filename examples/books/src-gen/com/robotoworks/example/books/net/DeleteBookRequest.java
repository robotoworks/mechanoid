package com.robotoworks.example.books.net;


import android.net.Uri;
import com.robotoworks.mechanoid.net.ServiceRequest;

public class DeleteBookRequest extends ServiceRequest {
	
	private static final String PATH = "/books/%s";
	
	private final long idSegment;
	
	private String apiTokenParam;
	private boolean apiTokenParamSet;
		
	public DeleteBookRequest setApiTokenParam(String value) {
		this.apiTokenParam = value;
		this.apiTokenParamSet = true;
		return this;
	}
	
	public boolean isApiTokenParamSet() {
		return apiTokenParamSet;
	}
			
	public DeleteBookRequest(long idSegment){
		this.idSegment = idSegment;
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, idSegment)).buildUpon();
			
		if(apiTokenParamSet){
			uriBuilder.appendQueryParameter("api_token", apiTokenParam);
		}
		
		return uriBuilder.toString();			
	}
}
