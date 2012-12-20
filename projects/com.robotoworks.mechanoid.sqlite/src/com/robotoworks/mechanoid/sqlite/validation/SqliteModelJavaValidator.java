package com.robotoworks.mechanoid.sqlite.validation;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

 

public class SqliteModelJavaValidator extends AbstractSqliteModelJavaValidator {

 
	@Inject TypeReferences typeReferences;
	
	@Check
	public void checkDatabase(Model m) {
		JvmType type = typeReferences.findDeclaredType("com.robotoworks.mechanoid.content.CursorWalker", m);

		if(type == null) {
			error("mechanoid.jar is required in your /libs folder or on the classpath", SqliteModelPackage.Literals.MODEL__PACKAGE_NAME);
		}
	}
	
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
}
