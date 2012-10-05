package com.example.books.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import com.robotoworks.mechanoid.util.Streams;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class AResponse  {
	private X a;
	private List<Y> b;
	public X getA(){
		return this.a;
	}
	public List<Y> getB(){
		return this.b;
	}
	
	public AResponse(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {
		
		try {
			if(inStream != null){
				String content = Streams.readAllText(inStream);
				JSONObject source = new JSONObject(content);
				if(source.has("foo") && !source.isNull("foo")) {
					JSONObject foo = source.getJSONObject("foo");
					if(foo.has("bar") && !foo.isNull("bar")) {
						JSONObject bar = foo.getJSONObject("bar");
						if(bar.has("a") && !bar.isNull("a")) {
							X targetMember = transformerProvider.get(XInputTransformer.class).transform(bar.getJSONObject("a"));
							this.a = targetMember;
						}
					}
				}
				if(source.has("b") && !source.isNull("b")) {
					JSONArray sourceMember = source.getJSONArray("b");
					List<Y> targetMember = transformerProvider.get(YListInputTransformer.class).transform(sourceMember);
					this.b = targetMember;
				}
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(inStream);
		}
	}
}
