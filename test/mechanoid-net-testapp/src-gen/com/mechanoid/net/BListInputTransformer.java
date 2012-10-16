package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;

public class BListInputTransformer extends Transformer<JsonReader, List<B>> {
	public void transform(JsonReader source, List<B> target) throws TransformException {
		
		try {
			BInputTransformer itemTransformer = provider.get(BInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				B targetItem = new B();
				itemTransformer.transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
