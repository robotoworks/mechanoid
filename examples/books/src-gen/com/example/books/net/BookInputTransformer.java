package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import org.json.JSONObject;
import org.json.JSONException;

public class BookInputTransformer extends Transformer<JSONObject, Book> {
	public Book transform(JSONObject source) throws TransformException {
		Book target = new Book();

		transform(source, target);
		
		return target;
	}
	public void transform(JSONObject source, Book target) throws TransformException {
		try {
			if(source.has("id") && !source.isNull("id")) {
				target.setId(source.getInt("id"));
			}
			if(source.has("title") && !source.isNull("title")) {
				target.setTitle(source.getString("title"));
			}
			if(source.has("author") && !source.isNull("author")) {
				target.setAuthor(source.getString("author"));
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
		
	}
}
