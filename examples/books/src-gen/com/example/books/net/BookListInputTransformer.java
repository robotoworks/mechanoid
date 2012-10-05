package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class BookListInputTransformer extends Transformer<JSONArray, List<Book>> {
	public List<Book> transform(JSONArray source) throws TransformException {
		List<Book> target = new ArrayList<Book>(source.length());
	
		transform(source, target);
	
		return target;
	}

	public void transform(JSONArray source, List<Book> target) throws TransformException {
		
		try {
			BookInputTransformer itemTransformer = provider.get(BookInputTransformer.class);
			for(int i=0; i < source.length(); i++) {
				Book targetItem = itemTransformer.transform(source.getJSONObject(i));
				target.add(targetItem);
				
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
		
	}
}
