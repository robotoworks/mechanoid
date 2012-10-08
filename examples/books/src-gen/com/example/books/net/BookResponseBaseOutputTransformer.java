package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.lang.Exception;
import org.json.JSONObject;

public class BookResponseBaseOutputTransformer extends Transformer<BookResponseBase, JSONObject> {
	public JSONObject transform(BookResponseBase source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(BookResponseBase source, JSONObject target) throws TransformException {
		try {
			target.putOpt("success", source.isSuccess());
			target.putOpt("status_message", source.getStatusMessage());
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
