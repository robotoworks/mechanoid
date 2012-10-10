package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonUtil;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.util.List;

public class NodeInputTransformer extends Transformer<JsonReader, Node> {
	public Node transform(JsonReader source) throws TransformException {
		Node target = new Node();

		transform(source, target);
		
		return target;
	}
	
	public void transform(JsonReader source, Node target) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("name")) {
					target.setName(source.nextString());
				}
				else if(name.equals("children")) {
					if(source.peek() != JsonToken.NULL) {
						List<Node> targetMember = provider.get(NodeListInputTransformer.class).transform(source);
						target.setChildren(targetMember);
					}
				}
				else {
					source.skipValue();
				}
			}
			
			source.endObject();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
