package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.ArrayList;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.util.List;


public class NodeTransformer extends Transformer<Node, JsonReader, JsonWriter> {			
	public void transformOut(Node subject, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("name");
			target.value(subject.getName());
			if(subject.getChildren() != null) {
				target.name("children");
				provider.get(NodeTransformer.class).transformOut(subject.getChildren(), target);
			}
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	public void transformOut(List<Node> subject, JsonWriter target) throws TransformException {
		try {
			target.beginArray();
			
			for(Node item:subject) {
				transformOut(item, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	
	public void transformIn(JsonReader source, Node subject) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(source.peek() == JsonToken.NULL) {
					source.skipValue();
					continue;
				}
				
				if(name.equals("name")) {
					subject.setName(source.nextString());
				}
				else if(name.equals("children")) {
					List<Node> subjectMember = new ArrayList<Node>();
					provider.get(NodeTransformer.class).transformIn(source, subjectMember);
					subject.setChildren(subjectMember);
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
	
	public void transformIn(JsonReader source, List<Node> subject) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				Node item = new Node();
				transformIn(source, item);
				subject.add(item);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
