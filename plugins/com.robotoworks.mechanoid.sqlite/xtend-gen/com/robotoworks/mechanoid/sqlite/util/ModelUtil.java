package com.robotoworks.mechanoid.sqlite.util;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource;
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
  
  public static ArrayList<EObject> getAllReferenceableSingleSources(final SelectCoreExpression expr) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    if ((expr instanceof SelectCore)) {
      SelectCoreExpression _left = ((SelectCore) expr).getLeft();
      ArrayList<EObject> _allReferenceableSingleSources = ModelUtil.getAllReferenceableSingleSources(_left);
      items.addAll(_allReferenceableSingleSources);
      SelectCoreExpression _right = ((SelectCore) expr).getRight();
      ArrayList<EObject> _allReferenceableSingleSources_1 = ModelUtil.getAllReferenceableSingleSources(_right);
      items.addAll(_allReferenceableSingleSources_1);
    } else {
      if ((expr instanceof SelectExpression)) {
        ArrayList<SingleSource> _findAllSingleSources = ModelUtil.findAllSingleSources(((SelectExpression) expr));
        items.addAll(_findAllSingleSources);
      }
    }
    return items;
  }
  
  public static ArrayList<SingleSource> findAllSingleSources(final SelectExpression expr) {
    final ArrayList<SingleSource> items = Lists.<SingleSource>newArrayList();
    JoinSource _source = expr.getSource();
    SingleSource _source_1 = _source.getSource();
    items.add(_source_1);
    JoinSource _source_2 = expr.getSource();
    EList<JoinStatement> _joinStatements = _source_2.getJoinStatements();
    for (final JoinStatement join : _joinStatements) {
      SingleSource _singleSource = join.getSingleSource();
      items.add(_singleSource);
    }
    return items;
  }
}
