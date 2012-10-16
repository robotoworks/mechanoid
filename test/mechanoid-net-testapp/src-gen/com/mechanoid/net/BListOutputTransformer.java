package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;

public class BListOutputTransformer extends Transformer<List<B>, JsonWriter> {			
	public void transform(List<B> source, JsonWriter target) throws TransformException {
		
		BOutputTransformer itemTransformer = provider.get(BOutputTransformer.class);
		
		try {
			target.beginArray();
			
			for(B sourceItem:source) {
				itemTransformer.transform(sourceItem, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
