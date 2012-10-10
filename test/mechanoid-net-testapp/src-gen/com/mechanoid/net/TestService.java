package com.mechanoid.net;

import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.DefaultServiceClient;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;

public class TestService {
	
	private static final String DEFAULT_BASE_URL = "http://10.0.2.2:8080/mechanoid-net-service/test";
	
	protected final ServiceClient client;
	private final TransformerProvider transformerProvider;
	private final String baseUrl;
	
	
	public TestService(){
		this(new DefaultServiceClient(), new TransformerProvider(), DEFAULT_BASE_URL);
	}
	
	public TestService(ServiceClient client){
		this(client, new TransformerProvider(), DEFAULT_BASE_URL);
	}

	public TestService(ServiceClient client, TransformerProvider transformerProvider){
		this(client, transformerProvider, DEFAULT_BASE_URL);
	}
	
	public TestService(String baseUrl){
		this(new DefaultServiceClient(), new TransformerProvider(), baseUrl);
	}
	
	public TestService(ServiceClient client, String baseUrl){
		this(client, new TransformerProvider(), baseUrl);
	}

	public TestService(ServiceClient client, TransformerProvider transformerProvider, String baseUrl){
		this.client = client;
		this.baseUrl = baseUrl;
		this.transformerProvider = transformerProvider;
	}
	
	public Response<GetStringArrayResponse> getStringArray()
	  throws ClientProtocolException, IOException {
	  	return getStringArray(new GetStringArrayRequest());
	}
	
	public Response<GetStringArrayResponse> getStringArray(GetStringArrayRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetIntArrayResponse> getIntArray()
	  throws ClientProtocolException, IOException {
	  	return getIntArray(new GetIntArrayRequest());
	}
	
	public Response<GetIntArrayResponse> getIntArray(GetIntArrayRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetLongArrayResponse> getLongArray()
	  throws ClientProtocolException, IOException {
	  	return getLongArray(new GetLongArrayRequest());
	}
	
	public Response<GetLongArrayResponse> getLongArray(GetLongArrayRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetDoubleArrayResponse> getDoubleArray()
	  throws ClientProtocolException, IOException {
	  	return getDoubleArray(new GetDoubleArrayRequest());
	}
	
	public Response<GetDoubleArrayResponse> getDoubleArray(GetDoubleArrayRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetBooleanArrayResponse> getBooleanArray()
	  throws ClientProtocolException, IOException {
	  	return getBooleanArray(new GetBooleanArrayRequest());
	}
	
	public Response<GetBooleanArrayResponse> getBooleanArray(GetBooleanArrayRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetEnumArrayResponse> getEnumArray()
	  throws ClientProtocolException, IOException {
	  	return getEnumArray(new GetEnumArrayRequest());
	}
	
	public Response<GetEnumArrayResponse> getEnumArray(GetEnumArrayRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetItemResponse> getItem()
	  throws ClientProtocolException, IOException {
	  	return getItem(new GetItemRequest());
	}
	
	public Response<GetItemResponse> getItem(GetItemRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetNodesResponse> getNodes()
	  throws ClientProtocolException, IOException {
	  	return getNodes(new GetNodesRequest());
	}
	
	public Response<GetNodesResponse> getNodes(GetNodesRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<EchoParamsResponse> echoParams()
	  throws ClientProtocolException, IOException {
	  	return echoParams(new EchoParamsRequest());
	}
	
	public Response<EchoParamsResponse> echoParams(EchoParamsRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<SkippingResponse> skipping()
	  throws ClientProtocolException, IOException {
	  	return skipping(new SkippingRequest());
	}
	
	public Response<SkippingResponse> skipping(SkippingRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<SkippingWithItemResponse> skippingWithItem()
	  throws ClientProtocolException, IOException {
	  	return skippingWithItem(new SkippingWithItemRequest());
	}
	
	public Response<SkippingWithItemResponse> skippingWithItem(SkippingWithItemRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetABResponse> getAB()
	  throws ClientProtocolException, IOException {
	  	return getAB(new GetABRequest());
	}
	
	public Response<GetABResponse> getAB(GetABRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
}
