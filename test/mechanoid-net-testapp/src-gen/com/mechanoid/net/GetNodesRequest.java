package com.mechanoid.net;


import com.robotoworks.mechanoid.net.Parser;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.Response;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.ClientProtocolException;
import android.net.Uri;

public class GetNodesRequest {
	
	private static final String PATH="/nodes";
	
	public GetNodesRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
	
	protected Response<GetNodesResponse> execute(String baseUrl, ServiceClient client, TransformerProvider transformerProvider)
		throws ClientProtocolException, IOException {
			
		String url = createUrl(baseUrl);
		
		final TransformerProvider tp = transformerProvider;
		
		Parser<GetNodesResponse> parser = new Parser<GetNodesResponse>() {
			public GetNodesResponse parse(InputStream inStream) throws TransformException {
				return new GetNodesResponse(tp, inStream);
			}

		};
		
		return new Response<GetNodesResponse>(client.getJson(url), parser);
	}
}	
