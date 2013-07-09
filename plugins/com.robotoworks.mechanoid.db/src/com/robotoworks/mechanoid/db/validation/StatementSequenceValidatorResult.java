package com.robotoworks.mechanoid.db.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class StatementSequenceValidatorResult {
    public boolean valid;
    public EObject source;
    public EStructuralFeature feature;
    public String message;
}
