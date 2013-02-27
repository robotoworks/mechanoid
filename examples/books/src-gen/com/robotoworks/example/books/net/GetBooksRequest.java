package com.robotoworks.example.books.net;


import android.net.Uri;
import com.robotoworks.mechanoid.net.ServiceRequest;

public class GetBooksRequest extends ServiceRequest {
	
	private static final String PATH = "/books";
	
	private int offsetParam;
	private boolean offsetParamSet;
	private int limitParam = 100;
	private boolean limitParamSet = true;
		
	private String apiTokenParam;
	private boolean apiTokenParamSet;
		
	public GetBooksRequest setOffsetParam(int value) {
		this.offsetParam = value;
		this.offsetParamSet = true;
		return this;
	}
	
	public boolean isOffsetParamSet() {
		return offsetParamSet;
	}
	public GetBooksRequest setLimitParam(int value) {
		this.limitParam = value;
		this.limitParamSet = true;
		return this;
	}
	
	public boolean isLimitParamSet() {
		return limitParamSet;
	}
		
	public GetBooksRequest setApiTokenParam(String value) {
		this.apiTokenParam = value;
		this.apiTokenParamSet = true;
		return this;
	}
	
	public boolean isApiTokenParamSet() {
		return apiTokenParamSet;
	}
			
	public GetBooksRequest(){
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		if(offsetParamSet){
			uriBuilder.appendQueryParameter("offset", String.valueOf(offsetParam));
		}
		if(limitParamSet){
			uriBuilder.appendQueryParameter("limit", String.valueOf(limitParam));
		}
		
		if(apiTokenParamSet){
			uriBuilder.appendQueryParameter("api_token", apiTokenParam);
		}
		
		return uriBuilder.toString();			
	}
}
