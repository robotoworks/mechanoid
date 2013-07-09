package com.robotoworks.mechanoid.db.validation;

import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage.Literals;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;
import com.robotoworks.mechanoid.db.util.ModelUtil;
import com.robotoworks.mechanoid.db.validation.StatementSequenceValidatorResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class StatementSequenceValidator {
  private final HashSet<String> tables = new Function0<HashSet<String>>() {
    public HashSet<String> apply() {
      HashSet<String> _hashSet = new HashSet<String>();
      return _hashSet;
    }
  }.apply();
  
  private final HashSet<String> views = new Function0<HashSet<String>>() {
    public HashSet<String> apply() {
      HashSet<String> _hashSet = new HashSet<String>();
      return _hashSet;
    }
  }.apply();
  
  private final HashSet<String> triggers = new Function0<HashSet<String>>() {
    public HashSet<String> apply() {
      HashSet<String> _hashSet = new HashSet<String>();
      return _hashSet;
    }
  }.apply();
  
  private final HashSet<String> indexes = new Function0<HashSet<String>>() {
    public HashSet<String> apply() {
      HashSet<String> _hashSet = new HashSet<String>();
      return _hashSet;
    }
  }.apply();
  
  public StatementSequenceValidatorResult validate(final DatabaseBlock db) {
    this.tables.clear();
    this.views.clear();
    this.triggers.clear();
    this.indexes.clear();
    StatementSequenceValidatorResult _statementSequenceValidatorResult = new StatementSequenceValidatorResult();
    StatementSequenceValidatorResult result = _statementSequenceValidatorResult;
    result.valid = true;
    EList<MigrationBlock> _migrations = db.getMigrations();
    for (final MigrationBlock migration : _migrations) {
      {
        EList<DDLStatement> statements = migration.getStatements();
        for (final DDLStatement stmt : statements) {
          {
            result.source = stmt;
            this.validateStatement(result, stmt);
            if (result.valid) {
              this.sequence(stmt);
            } else {
              return result;
            }
          }
        }
      }
    }
    return result;
  }
  
  public boolean nameExists(final String name) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _contains = this.tables.contains(name);
    if (_contains) {
      _or_2 = true;
    } else {
      boolean _contains_1 = this.views.contains(name);
      _or_2 = (_contains || _contains_1);
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _contains_2 = this.triggers.contains(name);
      _or_1 = (_or_2 || _contains_2);
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _contains_3 = this.indexes.contains(name);
      _or = (_or_1 || _contains_3);
    }
    return _or;
  }
  
  public boolean sourceExists(final String name) {
    boolean _or = false;
    boolean _contains = this.tables.contains(name);
    if (_contains) {
      _or = true;
    } else {
      boolean _contains_1 = this.views.contains(name);
      _or = (_contains || _contains_1);
    }
    return _or;
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final CreateTableStatement stmt) {
    String _name = stmt.getName();
    boolean _nameExists = this.nameExists(_name);
    if (_nameExists) {
      result.valid = false;
      result.message = "Name conflict, use another name";
      result.feature = Literals.TABLE_DEFINITION__NAME;
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final AlterTableRenameStatement stmt) {
    TableDefinition _table = stmt.getTable();
    String _name = _table.getName();
    boolean _contains = this.tables.contains(_name);
    boolean _not = (!_contains);
    if (_not) {
      result.valid = false;
      result.message = "No such table";
      result.feature = Literals.ALTER_TABLE_RENAME_STATEMENT__TABLE;
    } else {
      String _name_1 = stmt.getName();
      boolean _nameExists = this.nameExists(_name_1);
      if (_nameExists) {
        result.valid = false;
        result.message = "Name conflict, use another name";
        result.feature = Literals.TABLE_DEFINITION__NAME;
      }
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final AlterTableAddColumnStatement stmt) {
    TableDefinition _table = stmt.getTable();
    String _name = _table.getName();
    boolean _contains = this.tables.contains(_name);
    boolean _not = (!_contains);
    if (_not) {
      result.valid = false;
      result.message = "No such table";
      result.feature = Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE;
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final DropTableStatement stmt) {
    TableDefinition _table = stmt.getTable();
    String _name = _table.getName();
    boolean _contains = this.tables.contains(_name);
    boolean _not = (!_contains);
    if (_not) {
      result.valid = false;
      result.message = "No such table";
      result.feature = Literals.DROP_TABLE_STATEMENT__TABLE;
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final CreateViewStatement stmt) {
    String _name = stmt.getName();
    boolean _nameExists = this.nameExists(_name);
    if (_nameExists) {
      result.valid = false;
      result.message = "Name conflict, use another name";
      result.feature = Literals.TABLE_DEFINITION__NAME;
    } else {
      SelectStatement _selectStatement = stmt.getSelectStatement();
      SelectCoreExpression _core = _selectStatement.getCore();
      this.validateTablesInExpression(result, _core);
    }
  }
  
  public void validateTablesInExpression(final StatementSequenceValidatorResult result, final SelectCoreExpression expr) {
    ArrayList<EObject> sources = ModelUtil.getAllReferenceableSingleSources(expr);
    for (final EObject source : sources) {
      if ((source instanceof SingleSourceTable)) {
        SingleSourceTable table = ((SingleSourceTable) source);
        TableDefinition _tableReference = table.getTableReference();
        String _name = _tableReference.getName();
        boolean _sourceExists = this.sourceExists(_name);
        boolean _not = (!_sourceExists);
        if (_not) {
          result.source = table;
          result.valid = false;
          result.message = "No such reference";
          result.feature = Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE;
          return;
        }
      }
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final DropViewStatement stmt) {
    CreateViewStatement _view = stmt.getView();
    String _name = _view.getName();
    boolean _contains = this.views.contains(_name);
    boolean _not = (!_contains);
    if (_not) {
      result.valid = false;
      result.message = "No such view";
      result.feature = Literals.DROP_VIEW_STATEMENT__VIEW;
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final CreateTriggerStatement stmt) {
    String _name = stmt.getName();
    boolean _nameExists = this.nameExists(_name);
    if (_nameExists) {
      result.valid = false;
      result.message = "Name conflict, use another name";
      result.feature = Literals.CREATE_TRIGGER_STATEMENT__NAME;
    } else {
      TableDefinition _table = stmt.getTable();
      String _name_1 = _table.getName();
      boolean _contains = this.tables.contains(_name_1);
      boolean _not = (!_contains);
      if (_not) {
        result.valid = false;
        result.message = "No such table";
        result.feature = Literals.CREATE_TRIGGER_STATEMENT__TABLE;
      }
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final DropTriggerStatement stmt) {
    CreateTriggerStatement _trigger = stmt.getTrigger();
    String _name = _trigger.getName();
    boolean _contains = this.triggers.contains(_name);
    boolean _not = (!_contains);
    if (_not) {
      result.valid = false;
      result.message = "No such trigger";
      result.feature = Literals.DROP_TRIGGER_STATEMENT__TRIGGER;
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final CreateIndexStatement stmt) {
    String _name = stmt.getName();
    boolean _nameExists = this.nameExists(_name);
    if (_nameExists) {
      result.valid = false;
      result.message = "Name conflict, use another name";
      result.feature = Literals.CREATE_INDEX_STATEMENT__NAME;
    } else {
      TableDefinition _table = stmt.getTable();
      String _name_1 = _table.getName();
      boolean _contains = this.tables.contains(_name_1);
      boolean _not = (!_contains);
      if (_not) {
        result.valid = false;
        result.message = "No such table";
        result.feature = Literals.CREATE_INDEX_STATEMENT__TABLE;
      }
    }
  }
  
  protected void _validateStatement(final StatementSequenceValidatorResult result, final DropIndexStatement stmt) {
    CreateIndexStatement _index = stmt.getIndex();
    String _name = _index.getName();
    boolean _contains = this.indexes.contains(_name);
    boolean _not = (!_contains);
    if (_not) {
      result.valid = false;
      result.message = "No such index";
      result.feature = Literals.DROP_INDEX_STATEMENT__INDEX;
    }
  }
  
  protected void _sequence(final CreateTableStatement stmt) {
    String _name = stmt.getName();
    this.tables.add(_name);
  }
  
  protected void _sequence(final AlterTableRenameStatement stmt) {
    TableDefinition _table = stmt.getTable();
    String _name = _table.getName();
    this.tables.remove(_name);
    String _name_1 = stmt.getName();
    this.tables.add(_name_1);
  }
  
  protected void _sequence(final AlterTableAddColumnStatement stmt) {
  }
  
  protected void _sequence(final DropTableStatement stmt) {
    TableDefinition _table = stmt.getTable();
    String _name = _table.getName();
    this.tables.remove(_name);
  }
  
  protected void _sequence(final CreateViewStatement stmt) {
    String _name = stmt.getName();
    this.views.add(_name);
  }
  
  protected void _sequence(final DropViewStatement stmt) {
    CreateViewStatement _view = stmt.getView();
    String _name = _view.getName();
    this.views.remove(_name);
  }
  
  protected void _sequence(final CreateTriggerStatement stmt) {
    String _name = stmt.getName();
    this.triggers.add(_name);
  }
  
  protected void _sequence(final DropTriggerStatement stmt) {
    CreateTriggerStatement _trigger = stmt.getTrigger();
    String _name = _trigger.getName();
    this.triggers.remove(_name);
  }
  
  protected void _sequence(final CreateIndexStatement stmt) {
    String _name = stmt.getName();
    this.indexes.add(_name);
  }
  
  protected void _sequence(final DropIndexStatement stmt) {
    CreateIndexStatement _index = stmt.getIndex();
    String _name = _index.getName();
    this.indexes.remove(_name);
  }
  
  public void validateStatement(final StatementSequenceValidatorResult result, final DDLStatement stmt) {
    if (stmt instanceof AlterTableRenameStatement) {
      _validateStatement(result, (AlterTableRenameStatement)stmt);
      return;
    } else if (stmt instanceof CreateTableStatement) {
      _validateStatement(result, (CreateTableStatement)stmt);
      return;
    } else if (stmt instanceof CreateViewStatement) {
      _validateStatement(result, (CreateViewStatement)stmt);
      return;
    } else if (stmt instanceof AlterTableAddColumnStatement) {
      _validateStatement(result, (AlterTableAddColumnStatement)stmt);
      return;
    } else if (stmt instanceof CreateIndexStatement) {
      _validateStatement(result, (CreateIndexStatement)stmt);
      return;
    } else if (stmt instanceof CreateTriggerStatement) {
      _validateStatement(result, (CreateTriggerStatement)stmt);
      return;
    } else if (stmt instanceof DropIndexStatement) {
      _validateStatement(result, (DropIndexStatement)stmt);
      return;
    } else if (stmt instanceof DropTableStatement) {
      _validateStatement(result, (DropTableStatement)stmt);
      return;
    } else if (stmt instanceof DropTriggerStatement) {
      _validateStatement(result, (DropTriggerStatement)stmt);
      return;
    } else if (stmt instanceof DropViewStatement) {
      _validateStatement(result, (DropViewStatement)stmt);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(result, stmt).toString());
    }
  }
  
  public void sequence(final DDLStatement stmt) {
    if (stmt instanceof AlterTableRenameStatement) {
      _sequence((AlterTableRenameStatement)stmt);
      return;
    } else if (stmt instanceof CreateTableStatement) {
      _sequence((CreateTableStatement)stmt);
      return;
    } else if (stmt instanceof CreateViewStatement) {
      _sequence((CreateViewStatement)stmt);
      return;
    } else if (stmt instanceof AlterTableAddColumnStatement) {
      _sequence((AlterTableAddColumnStatement)stmt);
      return;
    } else if (stmt instanceof CreateIndexStatement) {
      _sequence((CreateIndexStatement)stmt);
      return;
    } else if (stmt instanceof CreateTriggerStatement) {
      _sequence((CreateTriggerStatement)stmt);
      return;
    } else if (stmt instanceof DropIndexStatement) {
      _sequence((DropIndexStatement)stmt);
      return;
    } else if (stmt instanceof DropTableStatement) {
      _sequence((DropTableStatement)stmt);
      return;
    } else if (stmt instanceof DropTriggerStatement) {
      _sequence((DropTriggerStatement)stmt);
      return;
    } else if (stmt instanceof DropViewStatement) {
      _sequence((DropViewStatement)stmt);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt).toString());
    }
  }
}
