package com.robotoworks.mechanoid.sqlite.naming;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;

public class SqliteQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

//	protected QualifiedName qualifiedName(SingleSourceTable ele){
//		String alias = ele.getName() == null ? "alias" : ele.getName();
//		return QualifiedName.create("Sandbox", "table1", "view1", alias);
//	}
}
