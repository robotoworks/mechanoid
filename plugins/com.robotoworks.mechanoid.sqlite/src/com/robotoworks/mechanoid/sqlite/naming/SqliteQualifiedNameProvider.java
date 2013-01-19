package com.robotoworks.mechanoid.sqlite.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;

public class SqliteQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

//	protected QualifiedName qualifiedName(SingleSourceTable ele){
//		String alias = Strings.isEmpty(ele.getName()) ? "source" : ele.getName();
//		return QualifiedName.create(ele.getTable().getName(), alias);
//	}
}
