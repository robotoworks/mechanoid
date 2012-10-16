package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.lang.Exception;

public class ItemOutputTransformer extends Transformer<Item, JsonWriter> {			
	public void transform(Item source, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("a");
			target.value(source.getA());
			target.name("b");
			target.value(source.getB());
			target.name("c");
			target.value(source.getC());
			target.name("d");
			target.value(source.getD());
			target.name("e");
			target.value(source.isE());
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
