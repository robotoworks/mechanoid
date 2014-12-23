package com.robotoworks.example.books.net;


import android.net.Uri;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import com.robotoworks.mechanoid.net.EntityEnclosedServiceRequest;
import java.io.OutputStream;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.nio.charset.Charset;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class CreateBookRequest extends EntityEnclosedServiceRequest {
	
	private static final String PATH = "/books";
	
	private String apiTokenParam;
	private boolean apiTokenParamSet;
		
	private final Book book;
	
	public Book getBook() {
		return book;
	}
	public CreateBookRequest setApiTokenParam(String value) {
		this.apiTokenParam = value;
		this.apiTokenParamSet = true;
		return this;
	}
	
	public boolean isApiTokenParamSet() {
		return apiTokenParamSet;
	}
			
	public CreateBookRequest(Book book){
		this.book = book;
	}
	
	@Override
	public void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException {
		JsonWriter writer = null;
		try {
			if(stream != null) {
				writer = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				
			provider.get(Book.class).write(writer, book);
				
			}
		} finally {
			Closeables.closeSilently(writer);
		}
	}

	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		if(apiTokenParamSet){
			uriBuilder.appendQueryParameter("api_token", apiTokenParam);
		}
		
		return uriBuilder.toString();			
	}
}
