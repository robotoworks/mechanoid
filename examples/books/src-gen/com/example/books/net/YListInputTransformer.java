package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class YListInputTransformer extends Transformer<JSONArray, List<Y>> {
	public List<Y> transform(JSONArray source) throws TransformException {
		List<Y> target = new ArrayList<Y>(source.length());
	
		transform(source, target);
	
		return target;
	}

	public void transform(JSONArray source, List<Y> target) throws TransformException {
		
		try {
			YInputTransformer itemTransformer = provider.get(YInputTransformer.class);
			for(int i=0; i < source.length(); i++) {
				Y targetItem = itemTransformer.transform(source.getJSONObject(i));
				target.add(targetItem);
				
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
		
	}
}
