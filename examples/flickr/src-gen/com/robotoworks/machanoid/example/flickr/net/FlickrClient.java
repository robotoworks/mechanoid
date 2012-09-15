package com.robotoworks.machanoid.example.flickr.net;

import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.HttpRequestHelper;
import com.robotoworks.mechanoid.net.WebResponse;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;

public class FlickrClient {
	
	private static final String DEFAULT_BASE_URL = "http://api.flickr.com/";
	
	protected final HttpRequestHelper requestHelper;
	private final TransformerProvider transformerProvider;
	private final String baseUrl;

	public FlickrClient(HttpRequestHelper requestHelper){
		this(requestHelper, new TransformerProvider(), DEFAULT_BASE_URL);
	}

	public FlickrClient(HttpRequestHelper requestHelper, TransformerProvider transformerProvider){
		this(requestHelper, transformerProvider, DEFAULT_BASE_URL);
	}

	public FlickrClient(HttpRequestHelper requestHelper, TransformerProvider transformerProvider, String baseUrl){
		this.requestHelper = requestHelper;
		this.baseUrl = baseUrl;
		this.transformerProvider = transformerProvider;
	}
	
	public WebResponse<GetInterestingnessListResponse> getInterestingnessList(GetInterestingnessListRequest request)
	  throws ClientProtocolException, IOException {			
		return request.execute(baseUrl, requestHelper, transformerProvider);
	}
}
