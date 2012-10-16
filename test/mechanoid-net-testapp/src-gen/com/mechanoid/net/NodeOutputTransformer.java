package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.lang.Exception;

public class NodeOutputTransformer extends Transformer<Node, JsonWriter> {			
	public void transform(Node source, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("name");
			target.value(source.getName());
			if(source.getChildren() != null) {
				target.name("children");
				provider.get(NodeListOutputTransformer.class).transform(source.getChildren(), target);
			}
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
