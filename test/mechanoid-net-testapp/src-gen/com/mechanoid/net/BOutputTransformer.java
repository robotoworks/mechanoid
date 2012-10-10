package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.lang.Exception;
import org.json.JSONObject;

public class BOutputTransformer extends Transformer<B, JSONObject> {
	public JSONObject transform(B source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(B source, JSONObject target) throws TransformException {
		try {
			target.putOpt("name", source.getName());
			if(source.getA() != null) {
				JSONObject targetMember = provider.get(AOutputTransformer.class).transform(source.getA());
				target.put("a", targetMember);
			}
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
