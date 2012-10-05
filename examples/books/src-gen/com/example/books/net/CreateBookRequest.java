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

public class CreateBookRequest {
	
	private static final String PATH="/books";
	
	private final Book book;
	
	public CreateBookRequest(Book book){
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
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
	
	protected Response<CreateBookResponse> execute(String baseUrl, ServiceClient client, TransformerProvider transformerProvider)
		throws ClientProtocolException, IOException, TransformException {
			
		String url = createUrl(baseUrl);
		
		final TransformerProvider tp = transformerProvider;
		
		Parser<CreateBookResponse> parser = new Parser<CreateBookResponse>() {
			public CreateBookResponse parse(InputStream inStream) throws TransformException {
				return new CreateBookResponse(tp, inStream);
			}

		};
		
		String body = createBody(transformerProvider);
		return new Response<CreateBookResponse>(client.postJson(url, body), parser);
	}
}	
