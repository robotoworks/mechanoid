package com.robotoworks.mechanoid.ops.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractOpServiceModelJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage.eINSTANCE);
		return result;
	}

}
