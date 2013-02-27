package com.robotoworks.example.movies.net;


import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.net.ServiceResult;
import java.io.InputStream;
import com.robotoworks.mechanoid.util.Closeables;
import java.util.ArrayList;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class GetMoviesResult extends ServiceResult {
	private List<Movie> movies;
	public List<Movie> getMovies(){
		return this.movies;
	}
	
	public GetMoviesResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		JsonReader reader = null;
		try {
			if(inStream != null) {
				reader = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
			this.movies = new ArrayList<Movie>();
			provider.get(Movie.class).read(reader, this.movies);
		}
	} finally {
		Closeables.closeSilently(reader);
	}
	}
}
