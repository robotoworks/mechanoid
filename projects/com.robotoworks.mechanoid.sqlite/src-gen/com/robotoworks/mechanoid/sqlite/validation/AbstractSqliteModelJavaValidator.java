package com.robotoworks.mechanoid.sqlite.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractSqliteModelJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage.eINSTANCE);
		return result;
	}

}
