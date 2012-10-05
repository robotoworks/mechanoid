package com.example.books.net;


import com.robotoworks.mechanoid.net.Parser;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.Response;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.ClientProtocolException;
import android.net.Uri;

public class DeleteBookRequest {
	
	private static final String PATH="/books/%s";
	
	private final String id;
	
	public DeleteBookRequest(	String id){
		this.id = id;
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(String.format(baseUrl + PATH, id)).buildUpon();
			
		return uriBuilder.toString();			
	}
	
	protected Response<DeleteBookResponse> execute(String baseUrl, ServiceClient client, TransformerProvider transformerProvider)
		throws ClientProtocolException, IOException {
			
		String url = createUrl(baseUrl);
		
		final TransformerProvider tp = transformerProvider;
		
		Parser<DeleteBookResponse> parser = new Parser<DeleteBookResponse>() {
			public DeleteBookResponse parse(InputStream inStream) throws TransformException {
				return new DeleteBookResponse(tp, inStream);
			}

		};
		
		return new Response<DeleteBookResponse>(client.deleteJson(url), parser);
	}
}	
