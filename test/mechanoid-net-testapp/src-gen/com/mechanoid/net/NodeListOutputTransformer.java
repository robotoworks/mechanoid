package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;

public class NodeListOutputTransformer extends Transformer<List<Node>, JsonWriter> {			
	public void transform(List<Node> source, JsonWriter target) throws TransformException {
		
		NodeOutputTransformer itemTransformer = provider.get(NodeOutputTransformer.class);
		
		try {
			target.beginArray();
			
			for(Node sourceItem:source) {
				itemTransformer.transform(sourceItem, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
