package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import java.lang.Exception;
import org.json.JSONObject;
import org.json.JSONArray;

public class YOutputTransformer extends Transformer<Y, JSONObject> {
	public JSONObject transform(Y source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(Y source, JSONObject target) throws TransformException {
		try {
			target.putOpt("a", source.getA());
			if(source.getB() != null) {
				JSONArray targetMember = new JSONArray(source.getB());
				target.put("b", targetMember);	
			}
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
