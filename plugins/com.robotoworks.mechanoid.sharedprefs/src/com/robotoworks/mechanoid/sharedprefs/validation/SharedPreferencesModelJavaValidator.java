package com.robotoworks.mechanoid.sharedprefs.validation;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.MechanoidPlugin;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Literal;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.NumericLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.StringLiteral;
import com.robotoworks.mechanoid.validation.MechanoidIssueCodes;
import com.robotoworks.mechanoid.validation.MechanoidLibClasspathValidationHelper;

public class SharedPreferencesModelJavaValidator extends AbstractSharedPreferencesModelJavaValidator {

	@Inject TypeReferences typeReferences;
	@Inject MechanoidLibClasspathValidationHelper libValidationHelper;
	
	@Check
	public void checkMechanoidLibOnClasspath(Model m) {
	    if(libValidationHelper.shouldValidateMechanoidLibOnClassPath(m)) {
    		JvmType type = typeReferences.findDeclaredType(MechanoidPlugin.MECHANOID_LIB_CLASS, m);
    
    		if(type == null) {
    			error("mechanoid.jar is required in your /libs folder or on the classpath", SharedPreferencesModelPackage.Literals.MODEL__PACKAGE_NAME, MechanoidIssueCodes.MISSING_MECHANOID_LIBS);
    		}
	    }
	}
	
	@Check
	public void checkDefaultValue(Preference preference){
		PreferenceType type = preference.getType();
		Literal defaultValue = preference.getDefaultValue();
		
		if(defaultValue == null) {
			return;
		}
		
		switch(type) {
			case STRING:
				if(!(defaultValue instanceof StringLiteral)) {
					error("Type mismatch", 
							SharedPreferencesModelPackage.Literals.PREFERENCE__DEFAULT_VALUE
							);
				}
				break;
			case BOOLEAN:
				if(!(defaultValue instanceof BooleanLiteral)) {
					error("Type mismatch", 
							SharedPreferencesModelPackage.Literals.PREFERENCE__DEFAULT_VALUE
							);
				}
				break;
			case FLOAT:
			case INTEGER:
			case LONG:
				if(!(defaultValue instanceof NumericLiteral)) {
					error("Type mismatch", 
							SharedPreferencesModelPackage.Literals.PREFERENCE__DEFAULT_VALUE
							);
				}
				break;
		}
	}

}
