package com.robotoworks.mechanoid.sharedprefs.validation;

import org.eclipse.xtext.validation.Check;

import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Literal;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.NumericLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.StringLiteral;

public class SharedPreferencesModelJavaValidator extends AbstractSharedPreferencesModelJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
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
