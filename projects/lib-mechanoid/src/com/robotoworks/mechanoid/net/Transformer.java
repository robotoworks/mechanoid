package com.robotoworks.mechanoid.net;

public abstract class Transformer<SOURCE, TARGET> {
	protected TransformerProvider provider;
	public abstract void transform(SOURCE source, TARGET target) throws TransformException;
}