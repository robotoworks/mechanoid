package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class AListOutputTransformer extends Transformer<List<A>, JSONArray> {
	public JSONArray transform(List<A> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<A> source, JSONArray target) throws TransformException {
		
		AOutputTransformer itemTransformer = provider.get(AOutputTransformer.class);
		for(A sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
