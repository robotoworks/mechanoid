package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.util.ArrayList;

public class AListInputTransformer extends Transformer<JsonReader, List<A>> {
	public List<A> transform(JsonReader source) throws TransformException {
		List<A> target = new ArrayList<A>();
	
		transform(source, target);
	
		return target;
	}

	public void transform(JsonReader source, List<A> target) throws TransformException {
		
		try {
			AInputTransformer itemTransformer = provider.get(AInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				A targetItem = itemTransformer.transform(source);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
