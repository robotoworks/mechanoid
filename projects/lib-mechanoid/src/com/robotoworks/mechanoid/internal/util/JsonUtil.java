package com.robotoworks.mechanoid.internal.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
	public static List<String> readStringList(JsonReader reader) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		
		reader.beginArray();
		
		while(reader.hasNext()) {
			list.add(reader.nextString());
		}
		
		reader.endArray();
		
		return list;
	}
	
	public static List<Integer> readIntegerList(JsonReader reader) throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		reader.beginArray();
		
		while(reader.hasNext()) {
			list.add(reader.nextInt());
		}
		
		reader.endArray();
		
		return list;
	}
	
	public static List<Double> readDoubleList(JsonReader reader) throws IOException {
		ArrayList<Double> list = new ArrayList<Double>();
		
		reader.beginArray();
		
		while(reader.hasNext()) {
			list.add(reader.nextDouble());
		}
		
		reader.endArray();
		
		return list;
	}
	
	public static List<Long> readLongList(JsonReader reader) throws IOException {
		ArrayList<Long> list = new ArrayList<Long>();
		
		reader.beginArray();
		
		while(reader.hasNext()) {
			list.add(reader.nextLong());
		}
		
		reader.endArray();
		
		return list;
	}
	
	public static List<Boolean> readBooleanList(JsonReader reader) throws IOException {
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		reader.beginArray();
		
		while(reader.hasNext()) {
			list.add(reader.nextBoolean());
		}
		
		reader.endArray();
		
		return list;
	}
}
