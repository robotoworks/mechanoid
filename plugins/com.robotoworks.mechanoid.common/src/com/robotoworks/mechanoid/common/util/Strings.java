package com.robotoworks.mechanoid.common.util;

import com.robotoworks.mechanoid.common.internal.util.Inflector;

public class Strings {
	public static String resolveFileName(String packageName, String name) {
		return packageName.replace(".", "/") + "/" + pascalize(name) + ".java";
	}  
	
	public static String pascalize(String value){
		return Inflector.getInstance().camelize(value, false);
	}
	
	public static String camelize(String value){
		return Inflector.getInstance().camelize(value, true);
	}
	
	public static String pluralize(String value){
		return Inflector.getInstance().pluralize(value);
	}
	
	public static String underscore(String value){
		// already underscored
		if(value.matches("[A-Z_]+")){
			return value;
		}
		return Inflector.getInstance().underscore(value);
	}
}
