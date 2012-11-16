package com.robotoworks.mechanoid.sqlite.validation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.xtext.validation.Check;

import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;

 

public class SqliteModelJavaValidator extends AbstractSqliteModelJavaValidator {

 
	@Check
	public void checkDatabase(DatabaseBlock db) {
	}
	
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
}
