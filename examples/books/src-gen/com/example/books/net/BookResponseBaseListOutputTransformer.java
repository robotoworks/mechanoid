package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class BookResponseBaseListOutputTransformer extends Transformer<List<BookResponseBase>, JSONArray> {
	public JSONArray transform(List<BookResponseBase> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<BookResponseBase> source, JSONArray target) throws TransformException {
		
		BookResponseBaseOutputTransformer itemTransformer = provider.get(BookResponseBaseOutputTransformer.class);
		for(BookResponseBase sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
