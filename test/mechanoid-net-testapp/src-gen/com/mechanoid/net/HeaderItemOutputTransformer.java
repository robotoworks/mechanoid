package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.lang.Exception;

public class HeaderItemOutputTransformer extends Transformer<HeaderItem, JsonWriter> {			
	public void transform(HeaderItem source, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("key");
			target.value(source.getKey());
			target.name("value");
			target.value(source.getValue());
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
