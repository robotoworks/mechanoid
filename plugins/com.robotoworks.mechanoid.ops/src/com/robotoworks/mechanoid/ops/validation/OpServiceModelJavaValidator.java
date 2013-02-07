package com.robotoworks.mechanoid.ops.validation;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.ops.opServiceModel.Model;
import com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage;
import com.robotoworks.mechanoid.validation.ValidatorConstants;
 

public class OpServiceModelJavaValidator extends AbstractOpServiceModelJavaValidator {

	@Inject TypeReferences typeReferences;
	
	@Check
	public void checkMechanoidLibOnClasspath(Model m) {
		JvmType type = typeReferences.findDeclaredType("com.robotoworks.mechanoid.content.CursorWalker", m);

		if(type == null) {
			error("mechanoid.jar is required in your /libs folder or on the classpath", OpServiceModelPackage.Literals.MODEL__PACKAGE_NAME, ValidatorConstants.VALIDATOR_MISSING_MECHANOID_LIBS);
		}
	}

}
