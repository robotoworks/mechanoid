package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import java.lang.Exception;
import org.json.JSONObject;
import org.json.JSONArray;

public class NodeOutputTransformer extends Transformer<Node, JSONObject> {
	public JSONObject transform(Node source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(Node source, JSONObject target) throws TransformException {
		try {
			target.putOpt("name", source.getName());
			if(source.getChildren() != null) {
				JSONArray targetMember = provider.get(NodeListOutputTransformer.class).transform(source.getChildren());
				target.put("children", targetMember);
			}
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
