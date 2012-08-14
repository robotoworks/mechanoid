package com.robotoworks.mechanoid.net;

public class TransformerProvider {
	public <S extends Transformer<?, ?>> S get(Class<S> type){
		try {
			S instance = type.newInstance();
			instance.provider = this;
			return instance;
		} catch (InstantiationException e) {
			return null;
		} catch (IllegalAccessException e) {
			return null;
		}
	}
}
