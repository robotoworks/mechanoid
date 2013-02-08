package com.robotoworks.mechanoid.sqlite.naming;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

public class SqliteQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	protected QualifiedName qualifiedName(ColumnDef ele){
		return QualifiedName.create(ele.getName());
	}
	
	protected QualifiedName qualifiedName(SingleSourceTable ele){
	
		if(ele.getName() != null) {
			return null;
		}
		
		List<INode> nodes = NodeModelUtils.findNodesForFeature(ele, SqliteModelPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE);
		String tableName = NodeModelUtils.getTokenText(nodes.get(0));
		
		QualifiedName name = null;
		EObject temp = ele;
		while (temp.eContainer() != null) {
			temp = temp.eContainer();
			QualifiedName parentsQualifiedName = getFullyQualifiedName(temp);
			if (parentsQualifiedName != null) {
				name = parentsQualifiedName;
				break;
			}
		}
		
		return name.append(tableName);
	}
}
