package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;


public class AOutputTransformer extends Transformer<A, JsonWriter> {			
	public void transform(A source, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("name");
			target.value(source.getName());
			if(source.getB() != null) {
				target.name("b");
				provider.get(BOutputTransformer.class).transform(source.getB(), target);
			}
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	public void transform(List<A> source, JsonWriter target) throws TransformException {
		try {
			target.beginArray();
			
			for(A sourceItem:source) {
				transform(sourceItem, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
