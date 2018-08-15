package com.robotoworks.mechanoid.db.naming;

import com.robotoworks.mechanoid.db.sqliteModel.SelectSource;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import java.util.List;

public class NameHelper {
    public static QualifiedName getName(SelectSource ele) {
        if (ele.getName() != null) {
            return QualifiedName.create(ele.getName());
        }

        if (ele instanceof SingleSourceTable) {
            List<INode> nodes = NodeModelUtils.findNodesForFeature(ele, SqliteModelPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE);
            String tableName = NodeModelUtils.getTokenText(nodes.get(0));

            return QualifiedName.create(tableName);
        }

        return null;
    }

    public static QualifiedName getName(TableDefinition ele) {
        return QualifiedName.create(ele.getName());
    }
}
