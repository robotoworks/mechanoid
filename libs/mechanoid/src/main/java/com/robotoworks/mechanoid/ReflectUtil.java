package com.robotoworks.mechanoid;

import java.lang.reflect.Field;

public class ReflectUtil {
	public static Class<?> loadClassSilently(ClassLoader cl, String name) {
		Class<?> clz;
		try {
			clz = cl.loadClass(name);
			return clz;
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
	
	public static Field getFieldSilently(Class<?> clz, String fieldName) {
		try {
			return clz.getField(fieldName);
		} catch (NoSuchFieldException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Object getFieldValueSilently(Field field) {
		try {
			return (T) field.get(null);
		} catch (IllegalArgumentException e) {
		} catch (IllegalAccessException e) {
		}
		
		return null;
	}
}
