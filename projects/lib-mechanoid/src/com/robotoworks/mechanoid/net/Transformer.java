package com.robotoworks.mechanoid.net;

import java.util.List;

/**
 * <p>Transforms the subject from and to the source and target respectively.</p>
 *
 * @param <SUBJECT> The thing to transform
 * @param <SOURCE> The source to transform the subject from
 * @param <TARGET> The target to transform the subject to
 */
public abstract class Transformer<SUBJECT, SOURCE, TARGET> {
	protected TransformerProvider provider;

	/**
	 * <p>Transform the subject to the target</p>
	 * @param subject
	 * @param target
	 * @throws TransformException
	 */
	public abstract void transformOut(SUBJECT subject, TARGET target) throws TransformException;

	/**
	 * <pTransform a list of subjects to the target></p>
	 * @param subject
	 * @param target
	 * @throws TransformException
	 */
	public abstract void transformOut(List<SUBJECT> subject, TARGET target) throws TransformException;

	/**
	 * <p>Transform the source to the subject</p>
	 * @param source
	 * @param subject
	 * @throws TransformException
	 */
	public abstract void transformIn(SOURCE source, SUBJECT subject) throws TransformException;

	/**
	 * <p>Transform the source to a list of subjects</p>
	 * @param source
	 * @param subject
	 * @throws TransformException
	 */
	public abstract void transformIn(SOURCE source, List<SUBJECT> subject) throws TransformException;
}