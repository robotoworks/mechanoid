package com.mechanoid.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.net.TransformerProvider;
import java.io.InputStreamReader;
import com.robotoworks.mechanoid.util.Closeables;
import java.nio.charset.Charset;

public class GetABResult  {
	private A a;
	public A getA(){
		return this.a;
	}
	
	public GetABResult(TransformerProvider provider, InputStream inStream) throws TransformException {
	JsonReader source = null;
	try {
		if(inStream != null) {
			source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
			this.a = new A();
			provider.get(ATransformer.class).transformIn(source, this.a);
		}
	} catch(Exception x) {
		throw new TransformException(x);
	} finally {
		Closeables.closeSilently(source);
	}
	}
}
