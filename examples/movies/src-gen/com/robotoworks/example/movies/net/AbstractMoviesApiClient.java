package com.robotoworks.example.movies.net;


import com.robotoworks.mechanoid.net.Parser;
import java.io.IOException;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.ServiceException;
import java.io.InputStream;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;

public abstract class AbstractMoviesApiClient extends ServiceClient {
	private static final String LOG_TAG = "MoviesApiClient";
	
	protected static final String DEFAULT_BASE_URL = "http://robotoworks.apiary.io/moviedb";
	
	@Override
	protected String getLogTag() {
		return LOG_TAG;
	}
	
	@Override
	protected JsonEntityWriterProvider createWriterProvider() {
		return new DefaultMoviesApiClientWriterProvider();
	}
	
	@Override
	protected JsonEntityReaderProvider createReaderProvider() {
		return new DefaultMoviesApiClientReaderProvider();
	}
	
	public AbstractMoviesApiClient(String baseUrl, boolean debug){
		super(baseUrl, debug);
		
	}
	
	public Response<GetMoviesResult> getMovies()
	  throws ServiceException {
	  	return getMovies(new GetMoviesRequest());
	}
	
	public Response<GetMoviesResult> getMovies(GetMoviesRequest request)
	  throws ServiceException {
		
		Parser<GetMoviesResult> parser = new Parser<GetMoviesResult>() {
			public GetMoviesResult parse(InputStream inStream) throws IOException {
				return new GetMoviesResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
}
