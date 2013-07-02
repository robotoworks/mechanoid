package com.robotoworks.example.ghissues.net;


import android.net.Uri;
import com.robotoworks.mechanoid.net.ServiceRequest;

public class GetIssuesForRepositoryRequest extends ServiceRequest {
	
	private static final String PATH = "/repos/%s/%s/issues";
	
	private final String ownerSegment;
	private final String repoSegment;
	
	public GetIssuesForRepositoryRequest(String ownerSegment,
	String repoSegment){
		this.ownerSegment = ownerSegment;
		this.repoSegment = repoSegment;
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, ownerSegment, repoSegment)).buildUpon();
			
		return uriBuilder.toString();			
	}
}
