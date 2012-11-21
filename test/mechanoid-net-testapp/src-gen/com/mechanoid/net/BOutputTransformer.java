package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;


public class BOutputTransformer extends Transformer<B, JsonWriter> {			
	public void transform(B source, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("name");
			target.value(source.getName());
			if(source.getA() != null) {
				target.name("a");
				provider.get(AOutputTransformer.class).transform(source.getA(), target);
			}
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	public void transform(List<B> source, JsonWriter target) throws TransformException {
		try {
			target.beginArray();
			
			for(B sourceItem:source) {
				transform(sourceItem, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
