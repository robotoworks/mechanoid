package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.lang.Exception;
import org.json.JSONObject;

public class BookOutputTransformer extends Transformer<Book, JSONObject> {
	public JSONObject transform(Book source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(Book source, JSONObject target) throws TransformException {
		try {
			target.putOpt("id", source.getId());
			target.putOpt("title", source.getTitle());
			target.putOpt("author", source.getAuthor());
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
