package com.mechanoid.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.net.TransformerProvider;
import java.io.InputStreamReader;
import com.robotoworks.mechanoid.util.Closeables;
import java.nio.charset.Charset;

public class SkippingPostResult  {
	private String a;
	private int b;
	private long c;
	public String getA(){
		return this.a;
	}
	public void setA(String value){
		this.a = value;
	}
	public int getB(){
		return this.b;
	}
	public void setB(int value){
		this.b = value;
	}
	public long getC(){
		return this.c;
	}
	public void setC(long value){
		this.c = value;
	}
	
	public SkippingPostResult(TransformerProvider provider, InputStream inStream) throws TransformException {
		JsonReader source = null;
		try {
			if(inStream != null) {
				source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
		
			SkippingPostResult subject = this;
			
		
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("outer")) {
					if(source.peek() != JsonToken.NULL) {
						source.beginObject();
						
						while(source.hasNext()) {
							name = source.nextName();
							
							if(name.equals("inner")) {
								if(source.peek() != JsonToken.NULL) {
									source.beginObject();
									
									while(source.hasNext()) {
										name = source.nextName();
										
										if(name.equals("a")) {
											subject.setA(source.nextString());
										}
										else if(name.equals("b")) {
											subject.setB(source.nextInt());
										}
										else if(name.equals("c")) {
											subject.setC(source.nextLong());
										}
										else {
											source.skipValue();
										}
									}
									
									source.endObject();
								}
							}
							else {
								source.skipValue();
							}
						}
						
						source.endObject();
					}
				}
				else {
					source.skipValue();
				}
			}
			
			source.endObject();

			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(source);
		}
	}
}
