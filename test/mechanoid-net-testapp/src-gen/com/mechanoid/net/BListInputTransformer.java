package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.util.ArrayList;

public class BListInputTransformer extends Transformer<JsonReader, List<B>> {
	public List<B> transform(JsonReader source) throws TransformException {
		List<B> target = new ArrayList<B>();
	
		transform(source, target);
	
		return target;
	}

	public void transform(JsonReader source, List<B> target) throws TransformException {
		
		try {
			BInputTransformer itemTransformer = provider.get(BInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				B targetItem = itemTransformer.transform(source);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
