package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.lang.Exception;
import org.json.JSONObject;

public class AOutputTransformer extends Transformer<A, JSONObject> {
	public JSONObject transform(A source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(A source, JSONObject target) throws TransformException {
		try {
			target.putOpt("name", source.getName());
			if(source.getB() != null) {
				JSONObject targetMember = provider.get(BOutputTransformer.class).transform(source.getB());
				target.put("b", targetMember);
			}
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
