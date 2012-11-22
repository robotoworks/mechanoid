package com.robotoworks.mechanoid.net;

public class TransformerProvider {
	public <T extends Transformer<?, ?, ?>> T get(Class<T> type){
		try {
			T instance = type.newInstance();
			instance.provider = this;
			return instance;
		} catch (InstantiationException e) {
			return null;
		} catch (IllegalAccessException e) {
			return null;
		}
	}
}
