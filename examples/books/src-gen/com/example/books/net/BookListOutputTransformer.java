package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class BookListOutputTransformer extends Transformer<List<Book>, JSONArray> {
	public JSONArray transform(List<Book> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<Book> source, JSONArray target) throws TransformException {
		
		BookOutputTransformer itemTransformer = provider.get(BookOutputTransformer.class);
		for(Book sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
