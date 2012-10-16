package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;

public class AListOutputTransformer extends Transformer<List<A>, JsonWriter> {			
	public void transform(List<A> source, JsonWriter target) throws TransformException {
		
		AOutputTransformer itemTransformer = provider.get(AOutputTransformer.class);
		
		try {
			target.beginArray();
			
			for(A sourceItem:source) {
				itemTransformer.transform(sourceItem, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
