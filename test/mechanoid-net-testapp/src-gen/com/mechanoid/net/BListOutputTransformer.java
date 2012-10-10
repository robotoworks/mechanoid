package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class BListOutputTransformer extends Transformer<List<B>, JSONArray> {
	public JSONArray transform(List<B> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<B> source, JSONArray target) throws TransformException {
		
		BOutputTransformer itemTransformer = provider.get(BOutputTransformer.class);
		for(B sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
