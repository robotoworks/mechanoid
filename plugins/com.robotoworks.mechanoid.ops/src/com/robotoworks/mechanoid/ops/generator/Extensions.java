package com.robotoworks.mechanoid.ops.generator;

import com.robotoworks.mechanoid.ops.opServiceModel.OpArgType;
import com.robotoworks.mechanoid.text.Strings;

public class Extensions {
	public static String toTypeLiteral(OpArgType arg) {
		switch(arg) {
		case BOOLEAN:
			return "boolean";
		case FLOAT:
			return "float";
		case DOUBLE:
		    return "double";
		case INTEGER:
			return "int";
		case LONG:
			return "long";
		case STRING:
			return "String";
		case PARCELABLE:
			return "android.os.Parcelable";
		}
		return "";
	}

	public static String toBundlePutMethodName(OpArgType type) {
		switch(type) {
		case BOOLEAN:
			return "putBoolean";
		case FLOAT:
			return "putFloat";
		case DOUBLE:
		    return "putDouble";
		case INTEGER:
			return "putInt";
		case LONG:
			return "putLong";
		case STRING:
			return "putString";
		case PARCELABLE:
			return "putParcelable";
		}
		return "";
	}
	
	public static String toBundleGetMethodName(OpArgType type) {
		switch(type) {
		case BOOLEAN:
			return "getBoolean";
		case FLOAT:
			return "getFloat";
		case DOUBLE:
		    return "getDouble";
		case INTEGER:
			return "getInt";
		case LONG:
			return "getLong";
		case STRING:
			return "getString";
		case PARCELABLE:
			return "getParcelable";
		}
		return "";
	}
	
    
    public static String formatServiceName(String name) {
        return Strings.concatOnce(Strings.pascalize(name), "Service");
    }       
    
    public static String formatServiceBridgeName(String name) {
        return Strings.concatOnce(Strings.pascalize(name), "Service").concat("Bridge");
    }       
}
