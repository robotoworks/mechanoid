package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;

public class AListInputTransformer extends Transformer<JsonReader, List<A>> {
	public void transform(JsonReader source, List<A> target) throws TransformException {
		
		try {
			AInputTransformer itemTransformer = provider.get(AInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				A targetItem = new A();
				itemTransformer.transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
