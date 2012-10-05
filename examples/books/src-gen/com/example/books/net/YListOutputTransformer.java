package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class YListOutputTransformer extends Transformer<List<Y>, JSONArray> {
	public JSONArray transform(List<Y> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<Y> source, JSONArray target) throws TransformException {
		
		YOutputTransformer itemTransformer = provider.get(YOutputTransformer.class);
		for(Y sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
