package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class YInputTransformer extends Transformer<JSONObject, Y> {
	public Y transform(JSONObject source) throws TransformException {
		Y target = new Y();

		transform(source, target);
		
		return target;
	}
	public void transform(JSONObject source, Y target) throws TransformException {
		try {
			if(source.has("a") && !source.isNull("a")) {
				target.setA(source.getDouble("a"));
			}
			if(source.has("b") && !source.isNull("b")) {
				JSONArray sourceMember = source.getJSONArray("b");
				List<Double> targetMember = new ArrayList<Double>(sourceMember.length());
				
				for(int i=0; i < sourceMember.length(); i++) {
					targetMember.add(sourceMember.getDouble(i));
				}
				
				target.setB(targetMember);
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
		
	}
}
