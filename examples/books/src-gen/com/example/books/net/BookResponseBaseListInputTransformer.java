package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.util.ArrayList;

public class BookResponseBaseListInputTransformer extends Transformer<JsonReader, List<BookResponseBase>> {
	public List<BookResponseBase> transform(JsonReader source) throws TransformException {
		List<BookResponseBase> target = new ArrayList<BookResponseBase>();
	
		transform(source, target);
	
		return target;
	}

	public void transform(JsonReader source, List<BookResponseBase> target) throws TransformException {
		
		try {
			BookResponseBaseInputTransformer itemTransformer = provider.get(BookResponseBaseInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				BookResponseBase targetItem = itemTransformer.transform(source);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
