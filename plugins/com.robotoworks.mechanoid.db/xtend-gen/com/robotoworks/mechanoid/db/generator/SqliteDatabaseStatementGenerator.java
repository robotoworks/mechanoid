package com.robotoworks.mechanoid.db.generator;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement;
import java.util.Collection;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SqliteDatabaseStatementGenerator {
  @Inject
  @Extension
  private ISerializer _iSerializer;
  
  private SaveOptions saveOptions;
  
  public SqliteDatabaseStatementGenerator() {
    Builder _newBuilder = SaveOptions.newBuilder();
    Builder _noValidation = _newBuilder.noValidation();
    SaveOptions _options = _noValidation.getOptions();
    this.saveOptions = _options;
  }
  
  public CharSequence generateStatements(final Collection<DDLStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final DDLStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateTableStatements(final Collection<CreateTableStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CreateTableStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateViewStatements(final Collection<CreateViewStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CreateViewStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateTriggerStatements(final Collection<CreateTriggerStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CreateTriggerStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateStatement(final DDLStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("db.execSQL(");
    _builder.newLine();
    {
      String _serialize = this._iSerializer.serialize(stmt, this.saveOptions);
      String _trim = _serialize.trim();
      String[] _split = _trim.split("\\r?\\n");
      boolean _hasElements = false;
      for(final String line : _split) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" +", "	");
        }
        _builder.append("\t");
        _builder.append("\"");
        String _trim_1 = line.trim();
        String _replaceAll = _trim_1.replaceAll("\\\"", "\\\\\"");
        _builder.append(_replaceAll, "	");
        _builder.append(" \"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(");\t");
    _builder.newLine();
    return _builder;
  }
}
