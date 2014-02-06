package com.robotoworks.example.books.net;

import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import com.robotoworks.mechanoid.net.JsonEntityWriter;
import java.util.HashMap;

public class DefaultBookServiceClientWriterProvider implements JsonEntityWriterProvider {

	private HashMap<Class<?>, JsonEntityWriter<?>> mMap = new HashMap<Class<?>, JsonEntityWriter<?>>();
	
	public DefaultBookServiceClientWriterProvider(){
		registerWriters(mMap);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T, R extends JsonEntityWriter<T>> R get(Class<T> entityType) {
		return (R) mMap.get(entityType);
	}
	
	protected void registerWriters(HashMap<Class<?>, JsonEntityWriter<?>> map) {
		map.put(Book.class, new BookWriter(this));
	}
}
