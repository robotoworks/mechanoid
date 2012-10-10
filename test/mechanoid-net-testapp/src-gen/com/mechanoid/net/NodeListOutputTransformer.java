package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class NodeListOutputTransformer extends Transformer<List<Node>, JSONArray> {
	public JSONArray transform(List<Node> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<Node> source, JSONArray target) throws TransformException {
		
		NodeOutputTransformer itemTransformer = provider.get(NodeOutputTransformer.class);
		for(Node sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
