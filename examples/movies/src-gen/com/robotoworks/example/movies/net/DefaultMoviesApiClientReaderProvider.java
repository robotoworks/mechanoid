package com.robotoworks.example.movies.net;

import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import com.robotoworks.mechanoid.net.JsonEntityReader;
import java.util.HashMap;

public class DefaultMoviesApiClientReaderProvider implements JsonEntityReaderProvider {

	private HashMap<Class<?>, JsonEntityReader<?>> mMap = new HashMap<Class<?>, JsonEntityReader<?>>();
	
	public DefaultMoviesApiClientReaderProvider(){
		registerReaders(mMap);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T, R extends JsonEntityReader<T>> R get(Class<T> entityType) {
		return (R) mMap.get(entityType);
	}
	
	protected void registerReaders(HashMap<Class<?>, JsonEntityReader<?>> map) {
		map.put(Movie.class, new MovieReader(this));
	}
}
