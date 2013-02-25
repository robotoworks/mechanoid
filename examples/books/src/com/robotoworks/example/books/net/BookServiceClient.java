package com.robotoworks.example.books.net;

public class BookServiceClient extends AbstractBookServiceClient {
	public BookServiceClient(){
		super(DEFAULT_BASE_URL, false);
	}

	public BookServiceClient(boolean debug){
		super(DEFAULT_BASE_URL, debug);
	}
	
	public BookServiceClient(String baseUrl){
		super(baseUrl, false);
	}
	
	public BookServiceClient(String baseUrl, boolean debug){
		super(baseUrl, debug);
	}
}
