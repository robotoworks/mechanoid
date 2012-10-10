package com.mechanoid.net;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class GetItemResponse  {
	private Item item;
	public Item getItem(){
		return this.item;
	}
	
	public GetItemResponse(TransformerProvider provider, InputStream inStream) throws TransformException {
	JsonReader source = null;
	try {
		if(inStream != null) {
			source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
			this.item = provider.get(ItemInputTransformer.class).transform(source);
		}
	} catch(Exception x) {
		throw new TransformException(x);
	} finally {
		Closeables.closeSilently(source);
	}
	}
}
