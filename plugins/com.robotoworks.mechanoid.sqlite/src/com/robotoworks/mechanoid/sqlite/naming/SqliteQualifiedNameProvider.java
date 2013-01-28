package com.robotoworks.mechanoid.sqlite.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;

public class SqliteQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	protected QualifiedName qualifiedName(ColumnDef ele){
		return QualifiedName.create(ele.getName());
	}
}
