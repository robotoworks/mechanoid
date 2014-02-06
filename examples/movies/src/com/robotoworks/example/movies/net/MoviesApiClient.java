package com.robotoworks.example.movies.net;

public class MoviesApiClient extends AbstractMoviesApiClient {
	public MoviesApiClient(){
		super(DEFAULT_BASE_URL, false);
	}

	public MoviesApiClient(boolean debug){
		super(DEFAULT_BASE_URL, debug);
	}
	
	public MoviesApiClient(String baseUrl){
		super(baseUrl, false);
	}
	
	public MoviesApiClient(String baseUrl, boolean debug){
		super(baseUrl, debug);
	}
}
