package com.robotoworks.mechanoid.net;

import java.util.List;

public abstract class Transformer<SUBJECT, SOURCE, TARGET> {
	protected TransformerProvider provider;
	public abstract void transformOut(SUBJECT subject, TARGET target) throws TransformException;
	public abstract void transformOut(List<SUBJECT> subject, TARGET target) throws TransformException;
	public abstract void transformIn(SOURCE source, SUBJECT subject) throws TransformException;
	public abstract void transformIn(SOURCE source, List<SUBJECT> subject) throws TransformException;
}