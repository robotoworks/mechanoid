package com.example.books.net;

import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.DefaultServiceClient;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import com.robotoworks.mechanoid.net.TransformException;

public class BookService {
	
	private static final String DEFAULT_BASE_URL = "http://books.example.com";
	
	protected final ServiceClient client;
	private final TransformerProvider transformerProvider;
	private final String baseUrl;
	
	

	public BookService(){
		this(new DefaultServiceClient(), new TransformerProvider(), DEFAULT_BASE_URL);
	}
	
	public BookService(ServiceClient client){
		this(client, new TransformerProvider(), DEFAULT_BASE_URL);
	}

	public BookService(ServiceClient client, TransformerProvider transformerProvider){
		this(client, transformerProvider, DEFAULT_BASE_URL);
	}
	
	public BookService(String baseUrl){
		this(new DefaultServiceClient(), new TransformerProvider(), baseUrl);
	}
	
	public BookService(ServiceClient client, String baseUrl){
		this(client, new TransformerProvider(), baseUrl);
	}

	public BookService(ServiceClient client, TransformerProvider transformerProvider, String baseUrl){
		this.client = client;
		this.baseUrl = baseUrl;
		this.transformerProvider = transformerProvider;
	}
	
	public Response<AResponse> a(ARequest request)
	  throws ClientProtocolException, IOException, TransformException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetBooksResponse> getBooks(GetBooksRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<GetBookResponse> getBook(GetBookRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<UpdateBookResponse> updateBook(UpdateBookRequest request)
	  throws ClientProtocolException, IOException, TransformException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<CreateBookResponse> createBook(CreateBookRequest request)
	  throws ClientProtocolException, IOException, TransformException {
		return request.execute(baseUrl, client, transformerProvider);
	}
	public Response<DeleteBookResponse> deleteBook(DeleteBookRequest request)
	  throws ClientProtocolException, IOException {
		return request.execute(baseUrl, client, transformerProvider);
	}
}
