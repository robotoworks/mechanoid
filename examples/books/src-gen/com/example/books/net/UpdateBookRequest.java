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
import org.json.JSONObject;

public class UpdateBookRequest {
	
	private static final String PATH="/books/%s";
	
	private final String id;
	
	private final Book book;
	
	public UpdateBookRequest(	String id,
	Book book){
		this.id = id;
		this.book = book;
	}
	
	public String createBody(TransformerProvider transformerProvider) throws TransformException {
		try {
			JSONObject target = transformerProvider.get(BookOutputTransformer.class).transform(book);
			return target.toString();
		} catch(Exception e) {
			throw new TransformException(e);
		}
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(String.format(baseUrl + PATH, id)).buildUpon();
			
		return uriBuilder.toString();			
	}
	
	protected Response<UpdateBookResponse> execute(String baseUrl, ServiceClient client, TransformerProvider transformerProvider)
		throws ClientProtocolException, IOException, TransformException {
			
		String url = createUrl(baseUrl);
		
		final TransformerProvider tp = transformerProvider;
		
		Parser<UpdateBookResponse> parser = new Parser<UpdateBookResponse>() {
			public UpdateBookResponse parse(InputStream inStream) throws TransformException {
				return new UpdateBookResponse(tp, inStream);
			}

		};
		
		String body = createBody(transformerProvider);
		return new Response<UpdateBookResponse>(client.putJson(url, body), parser);
	}
}	
