package com.robotoworks.mechanoid.db.serializer;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.impl.Serializer;

public class SqliteSerializer extends Serializer {
    @Override
    protected void serialize(EObject obj, ITokenStream tokenStream, SaveOptions options) throws IOException {
        super.serialize(obj, tokenStream, options);
    }
}
