package com.mechanoid.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import com.robotoworks.mechanoid.net.TransformerProvider;
import java.io.InputStreamReader;
import com.robotoworks.mechanoid.util.Closeables;
import java.nio.charset.Charset;

public class EchoHeadersResult  {
	private List<HeaderItem> headerItems;
	public List<HeaderItem> getHeaderItems(){
		return this.headerItems;
	}
	
	public EchoHeadersResult(TransformerProvider provider, InputStream inStream) throws TransformException {
	JsonReader source = null;
	try {
		if(inStream != null) {
			source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
			this.headerItems = new ArrayList<HeaderItem>();
			provider.get(HeaderItemTransformer.class).transformIn(source, this.headerItems);
		}
	} catch(Exception x) {
		throw new TransformException(x);
	} finally {
		Closeables.closeSilently(source);
	}
	}
}
