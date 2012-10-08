package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonUtil;
import com.robotoworks.mechanoid.internal.util.JsonToken;

public class BookResponseBaseInputTransformer extends Transformer<JsonReader, BookResponseBase> {
	public BookResponseBase transform(JsonReader source) throws TransformException {
		BookResponseBase target = new BookResponseBase();

		transform(source, target);
		
		return target;
	}
	
	public void transform(JsonReader source, BookResponseBase target) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("success")) {
					target.setSuccess(source.nextBoolean());
				}
				else if(name.equals("status_message")) {
					target.setStatusMessage(source.nextString());
				}
			}
			
			source.endObject();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
