package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.ArrayList;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.util.List;

public class NodeInputTransformer extends Transformer<JsonReader, Node> {			
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
						List<Node> targetMember = new ArrayList<Node>();
						provider.get(NodeInputTransformer.class).transform(source, targetMember);
						target.setChildren(targetMember);
					} else {
						source.skipValue();
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
	
	public void transform(JsonReader source, List<Node> target) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				Node targetItem = new Node();
				transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}

