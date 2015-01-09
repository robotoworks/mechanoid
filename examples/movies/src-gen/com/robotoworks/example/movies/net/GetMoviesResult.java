package com.robotoworks.example.movies.net;


import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.net.ServiceResult;
import java.io.InputStream;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetMoviesResult extends ServiceResult {
	private List<Movie> movies;
	public List<Movie> getMovies(){
		return this.movies;
	}
	
	public GetMoviesResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		JsonReader reader = null;
		try {
			if(inStream != null) {
				reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
			this.movies = new ArrayList<Movie>();
			provider.get(Movie.class).readList(reader, this.movies);
		}
	} finally {
		Closeables.closeSilently(reader);
	}
	}
}
