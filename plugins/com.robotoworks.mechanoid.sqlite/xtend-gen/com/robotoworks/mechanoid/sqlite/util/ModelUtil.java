package com.robotoworks.mechanoid.sqlite.util;

import com.google.common.base.Objects;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelUtil {
  public static <T extends DDLStatement> ArrayList<T> findPreviousStatementsOfType(final DDLStatement stmt, final Class<T> statementType) {
    ArrayList<T> _arrayList = new ArrayList<T>();
    ArrayList<T> list = _arrayList;
    DatabaseBlock db = ModelUtil.<DatabaseBlock>getAncestorOfType(stmt, DatabaseBlock.class);
    EList<MigrationBlock> _migrations = db.getMigrations();
    for (final MigrationBlock migration : _migrations) {
      EList<DDLStatement> _statements = migration.getStatements();
      for (final DDLStatement ddl : _statements) {
        {
          boolean _equals = Objects.equal(ddl, stmt);
          if (_equals) {
            return list;
          }
          Class<? extends Object> _class = ddl.getClass();
          boolean _isAssignableFrom = statementType.isAssignableFrom(_class);
          if (_isAssignableFrom) {
            list.add(((T) ddl));
          }
        }
      }
    }
    return list;
  }
  
  public static <T extends DDLStatement> ArrayList<T> findStatementsOfTypeBetween(final Class<T> statementType, final DDLStatement from, final DDLStatement to) {
    ArrayList<T> _arrayList = new ArrayList<T>();
    ArrayList<T> list = _arrayList;
    boolean between = false;
    DatabaseBlock db = ModelUtil.<DatabaseBlock>getAncestorOfType(from, DatabaseBlock.class);
    EList<MigrationBlock> _migrations = db.getMigrations();
    for (final MigrationBlock migration : _migrations) {
      EList<DDLStatement> _statements = migration.getStatements();
      for (final DDLStatement ddl : _statements) {
        {
          boolean _equals = Objects.equal(ddl, to);
          if (_equals) {
            return list;
          }
          Class<? extends Object> _class = ddl.getClass();
          boolean _isAssignableFrom = statementType.isAssignableFrom(_class);
          if (_isAssignableFrom) {
            if (between) {
              list.add(((T) ddl));
            }
          }
          boolean _equals_1 = Objects.equal(ddl, from);
          if (_equals_1) {
            between = true;
          }
        }
      }
    }
    return list;
  }
  
  public static <T extends EObject> T getAncestorOfType(final EObject obj, final Class<T> ancestorType) {
    EObject temp = ((EObject) obj);
    EObject _eContainer = temp.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
        Class<? extends Object> _class = temp.getClass();
        boolean _isAssignableFrom = ancestorType.isAssignableFrom(_class);
        if (_isAssignableFrom) {
          return ((T) temp);
        }
      }
      EObject _eContainer_1 = temp.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer_1, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  /**
   * walks back and visits each previous statement from the given statement, returning
   * false will cancel the process
   */
  public static void forEachPreviousStatement(final DDLStatement stmt, final Function1<DDLStatement,Boolean> delegate) {
    EObject current = ((EObject) stmt);
    MigrationBlock migration = null;
    boolean _dowhile = false;
    do {
      {
        EObject _previousSibling = EcoreUtil2.getPreviousSibling(current);
        boolean _notEquals = (!Objects.equal(_previousSibling, null));
        boolean _while = _notEquals;
        while (_while) {
          {
            EObject _previousSibling_1 = EcoreUtil2.getPreviousSibling(current);
            current = _previousSibling_1;
            Boolean _apply = delegate.apply(((DDLStatement) current));
            boolean _not = (!_apply);
            if (_not) {
              return;
            }
          }
          EObject _previousSibling_1 = EcoreUtil2.getPreviousSibling(current);
          boolean _notEquals_1 = (!Objects.equal(_previousSibling_1, null));
          _while = _notEquals_1;
        }
        EObject _eContainer = current.eContainer();
        EObject previousContainer = EcoreUtil2.getPreviousSibling(_eContainer);
        boolean _and = false;
        boolean _notEquals_1 = (!Objects.equal(previousContainer, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          _and = (_notEquals_1 && (previousContainer instanceof MigrationBlock));
        }
        if (_and) {
          migration = ((MigrationBlock) previousContainer);
          EList<DDLStatement> _statements = migration.getStatements();
          DDLStatement _last = IterableExtensions.<DDLStatement>last(_statements);
          current = _last;
          boolean _equals = Objects.equal(current, null);
          if (_equals) {
            return;
          }
          Boolean _apply = delegate.apply(((DDLStatement) current));
          boolean _not = (!_apply);
          if (_not) {
            return;
          }
        } else {
          migration = null;
        }
      }
      boolean _notEquals = (!Objects.equal(migration, null));
      _dowhile = _notEquals;
    } while(_dowhile);
  }
}
