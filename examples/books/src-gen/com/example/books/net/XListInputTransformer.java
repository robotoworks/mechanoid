package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class XListInputTransformer extends Transformer<JSONArray, List<X>> {
	public List<X> transform(JSONArray source) throws TransformException {
		List<X> target = new ArrayList<X>(source.length());
	
		transform(source, target);
	
		return target;
	}

	public void transform(JSONArray source, List<X> target) throws TransformException {
		
		try {
			XInputTransformer itemTransformer = provider.get(XInputTransformer.class);
			for(int i=0; i < source.length(); i++) {
				X targetItem = itemTransformer.transform(source.getJSONObject(i));
				target.add(targetItem);
				
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
		
	}
}
