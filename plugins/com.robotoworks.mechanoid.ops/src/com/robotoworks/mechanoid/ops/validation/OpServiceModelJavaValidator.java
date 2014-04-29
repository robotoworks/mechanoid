package com.robotoworks.mechanoid.ops.validation;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.MechanoidPlugin;
import com.robotoworks.mechanoid.ops.opServiceModel.Model;
import com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage;
import com.robotoworks.mechanoid.validation.MechanoidIssueCodes;
import com.robotoworks.mechanoid.validation.MechanoidLibClasspathValidationHelper;
 

public class OpServiceModelJavaValidator extends AbstractOpServiceModelJavaValidator {

	@Inject TypeReferences typeReferences;
	@Inject MechanoidLibClasspathValidationHelper libValidationHelper;
	
	@Check
	public void checkMechanoidLibOnClasspath(Model m) {
	    if(libValidationHelper.shouldValidateMechanoidLibOnClassPath(m)) {
    		JvmType type = typeReferences.findDeclaredType(MechanoidPlugin.MECHANOID_LIB_CLASS, m);
    
    		if(type == null) {
    			error("mechanoid.jar is required in your /libs folder or on the classpath", OpServiceModelPackage.Literals.MODEL__PACKAGE_NAME, MechanoidIssueCodes.MISSING_MECHANOID_LIBS);
    		}
	    }
	}

}
