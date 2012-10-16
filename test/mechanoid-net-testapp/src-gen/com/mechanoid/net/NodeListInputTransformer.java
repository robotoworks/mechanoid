package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;

public class NodeListInputTransformer extends Transformer<JsonReader, List<Node>> {
	public void transform(JsonReader source, List<Node> target) throws TransformException {
		
		try {
			NodeInputTransformer itemTransformer = provider.get(NodeInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				Node targetItem = new Node();
				itemTransformer.transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
