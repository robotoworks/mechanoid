package com.robotoworks.mechanoid.text;

public class Strings {
	public static String resolveFileName(String packageName, String name) {
		return packageName.replace(".", "/") + "/" + name + ".java";
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
	
	/**
	 * <p>Like {@link String#concat(String)} but will only concatonate
	 * if the given value does not match the end of the string</p>
	 * 
	 * <p>Concatonation is determined by a case-insensitive check.</p>
	 * 
	 * @param str The string to concatonate to
	 * @param value The value to concatonate
	 * @return The concatonated string if the value does not already
	 * exist at the end of the string using a case-insensitive check
	 */
	public static String concatOnce(String str, String value) {
        if (str == null) {
            throw new NullPointerException();
        }
        
	    if(str.regionMatches(true, str.length() - value.length(), value, 0, value.length())) {
	        return str;
	    }
	    
	    return str.concat(value);
	}
}
