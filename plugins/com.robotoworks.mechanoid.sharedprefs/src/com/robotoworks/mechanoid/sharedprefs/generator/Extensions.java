package com.robotoworks.mechanoid.sharedprefs.generator;

import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType;

public class Extensions {
	public static String toTypeLiteral(PreferenceType type) {
		switch(type) {
		case BOOLEAN:
			return "boolean";
		case FLOAT:
			return "float";
		case INTEGER:
			return "int";
		case LONG:
			return "long";
		case STRING:
			return "String";
		}
		return "";
	}

	public static String getDefaultValue(PreferenceType type) {
		switch(type) {
		case STRING:
			return "null";
		case BOOLEAN:
			return "false";
		case FLOAT:
			return "0.0f";
		case INTEGER:
			return "0";
		case LONG:
			return "0L";
		default:
			return "";
		}
	}
	
	public static String toGetMethodName(PreferenceType type) {
		switch(type) {
		case BOOLEAN:
			return "getBoolean";
		case FLOAT:
			return "getFloat";
		case INTEGER:
			return "getInt";
		case LONG:
			return "getLong";
		case STRING:
			return "getString";
		}
		return "";
	}
	public static String toPutMethodName(PreferenceType type) {
		switch(type) {
		case BOOLEAN:
			return "putBoolean";
		case FLOAT:
			return "putFloat";
		case INTEGER:
			return "putInt";
		case LONG:
			return "putLong";
		case STRING:
			return "putString";
		}
		return "";
	}
}
