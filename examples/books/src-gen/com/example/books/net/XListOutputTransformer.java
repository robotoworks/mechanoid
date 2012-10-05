package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class XListOutputTransformer extends Transformer<List<X>, JSONArray> {
	public JSONArray transform(List<X> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<X> source, JSONArray target) throws TransformException {
		
		XOutputTransformer itemTransformer = provider.get(XOutputTransformer.class);
		for(X sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
