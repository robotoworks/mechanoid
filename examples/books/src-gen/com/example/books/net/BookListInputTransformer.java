package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.util.ArrayList;

public class BookListInputTransformer extends Transformer<JsonReader, List<Book>> {
	public List<Book> transform(JsonReader source) throws TransformException {
		List<Book> target = new ArrayList<Book>();
	
		transform(source, target);
	
		return target;
	}

	public void transform(JsonReader source, List<Book> target) throws TransformException {
		
		try {
			BookInputTransformer itemTransformer = provider.get(BookInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				Book targetItem = itemTransformer.transform(source);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
