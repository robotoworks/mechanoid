package com.robotoworks.mechanoid.sqlite.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.common.util.Strings;
import com.robotoworks.mechanoid.common.xtext.generator.MechanoidOutputConfigurationProvider;
import com.robotoworks.mechanoid.sqlite.generator.ActiveRecordGenerator;
import com.robotoworks.mechanoid.sqlite.generator.ContentProviderActionGenerator;
import com.robotoworks.mechanoid.sqlite.generator.ContentProviderContractGenerator;
import com.robotoworks.mechanoid.sqlite.generator.ContentProviderGenerator;
import com.robotoworks.mechanoid.sqlite.generator.Extensions;
import com.robotoworks.mechanoid.sqlite.generator.SqliteDatabaseSnapshotBuilder;
import com.robotoworks.mechanoid.sqlite.generator.SqliteMigrationGenerator;
import com.robotoworks.mechanoid.sqlite.generator.SqliteOpenHelperGenerator;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConfigBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConfigurationStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class SqliteModelGenerator implements IGenerator {
  @Inject
  private SqliteOpenHelperGenerator mOpenHelperGenerator;
  
  @Inject
  private ContentProviderContractGenerator mContentProviderContractGenerator;
  
  @Inject
  private Provider<SqliteDatabaseSnapshotBuilder> mDbSnapshotBuilderProvider;
  
  @Inject
  private ContentProviderGenerator mContentProviderGenerator;
  
  @Inject
  private SqliteMigrationGenerator mMigrationGenerator;
  
  @Inject
  private ContentProviderActionGenerator mActionGenerator;
  
  @Inject
  private ActiveRecordGenerator mActiveRecordGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    SqliteDatabaseSnapshotBuilder _get = this.mDbSnapshotBuilderProvider.get();
    Model _build = _get.build(model);
    DatabaseBlock _database = _build.getDatabase();
    EList<MigrationBlock> _migrations = _database.getMigrations();
    final MigrationBlock snapshot = _migrations.get(0);
    String _packageName = model.getPackageName();
    DatabaseBlock _database_1 = model.getDatabase();
    String _name = _database_1.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = "Abstract".concat(_pascalize);
    String _concat_1 = _concat.concat("OpenHelper");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat_1);
    CharSequence _generate = this.mOpenHelperGenerator.generate(model, snapshot);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    DatabaseBlock _database_2 = model.getDatabase();
    String _name_1 = _database_2.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_2 = _pascalize_1.concat("OpenHelper");
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_2);
    CharSequence _generateStub = this.mOpenHelperGenerator.generateStub(model, snapshot);
    fsa.generateFile(_resolveFileName_1, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
    String _packageName_2 = model.getPackageName();
    DatabaseBlock _database_3 = model.getDatabase();
    String _name_2 = _database_3.getName();
    String _pascalize_2 = Strings.pascalize(_name_2);
    String _concat_3 = _pascalize_2.concat("Contract");
    String _resolveFileName_2 = Strings.resolveFileName(_packageName_2, _concat_3);
    CharSequence _generate_1 = this.mContentProviderContractGenerator.generate(model, snapshot);
    fsa.generateFile(_resolveFileName_2, _generate_1);
    String _packageName_3 = model.getPackageName();
    DatabaseBlock _database_4 = model.getDatabase();
    String _name_3 = _database_4.getName();
    String _pascalize_3 = Strings.pascalize(_name_3);
    String _concat_4 = "Abstract".concat(_pascalize_3);
    String _concat_5 = _concat_4.concat("ContentProvider");
    String _resolveFileName_3 = Strings.resolveFileName(_packageName_3, _concat_5);
    CharSequence _generate_2 = this.mContentProviderGenerator.generate(model, snapshot);
    fsa.generateFile(_resolveFileName_3, _generate_2);
    String _packageName_4 = model.getPackageName();
    DatabaseBlock _database_5 = model.getDatabase();
    String _name_4 = _database_5.getName();
    String _pascalize_4 = Strings.pascalize(_name_4);
    String _concat_6 = _pascalize_4.concat("ContentProvider");
    String _resolveFileName_4 = Strings.resolveFileName(_packageName_4, _concat_6);
    CharSequence _generateStub_1 = this.mContentProviderGenerator.generateStub(model, snapshot);
    fsa.generateFile(_resolveFileName_4, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub_1);
    EList<DDLStatement> _statements = snapshot.getStatements();
    Iterable<CreateTableStatement> _filter = Iterables.<CreateTableStatement>filter(_statements, CreateTableStatement.class);
    final Procedure1<CreateTableStatement> _function = new Procedure1<CreateTableStatement>() {
        public void apply(final CreateTableStatement item) {
          SqliteModelGenerator.this.generateAction(resource, fsa, item, false);
          boolean _hasAndroidPrimaryKey = Extensions.hasAndroidPrimaryKey(item);
          if (_hasAndroidPrimaryKey) {
            SqliteModelGenerator.this.generateAction(resource, fsa, item, true);
          }
        }
      };
    IterableExtensions.<CreateTableStatement>forEach(_filter, _function);
    EList<DDLStatement> _statements_1 = snapshot.getStatements();
    Iterable<CreateViewStatement> _filter_1 = Iterables.<CreateViewStatement>filter(_statements_1, CreateViewStatement.class);
    final Procedure1<CreateViewStatement> _function_1 = new Procedure1<CreateViewStatement>() {
        public void apply(final CreateViewStatement item) {
          SqliteModelGenerator.this.generateAction(resource, fsa, item, false);
          boolean _hasAndroidPrimaryKey = Extensions.hasAndroidPrimaryKey(item);
          if (_hasAndroidPrimaryKey) {
            SqliteModelGenerator.this.generateAction(resource, fsa, item, true);
          }
        }
      };
    IterableExtensions.<CreateViewStatement>forEach(_filter_1, _function_1);
    DatabaseBlock _database_6 = model.getDatabase();
    ConfigBlock _config = _database_6.getConfig();
    boolean _notEquals = (!Objects.equal(_config, null));
    if (_notEquals) {
      DatabaseBlock _database_7 = model.getDatabase();
      ConfigBlock _config_1 = _database_7.getConfig();
      EList<ConfigurationStatement> _statements_2 = _config_1.getStatements();
      final Function1<ConfigurationStatement,Boolean> _function_2 = new Function1<ConfigurationStatement,Boolean>() {
          public Boolean apply(final ConfigurationStatement it) {
            return Boolean.valueOf((it instanceof ActionStatement));
          }
        };
      Iterable<ConfigurationStatement> _filter_2 = IterableExtensions.<ConfigurationStatement>filter(_statements_2, _function_2);
      final Procedure1<ConfigurationStatement> _function_3 = new Procedure1<ConfigurationStatement>() {
          public void apply(final ConfigurationStatement item) {
            SqliteModelGenerator.this.generateAction(resource, fsa, ((ActionStatement) item));
          }
        };
      IterableExtensions.<ConfigurationStatement>forEach(_filter_2, _function_3);
    }
    EList<DDLStatement> _statements_3 = snapshot.getStatements();
    Iterable<CreateTableStatement> _filter_3 = Iterables.<CreateTableStatement>filter(_statements_3, CreateTableStatement.class);
    final Procedure1<CreateTableStatement> _function_4 = new Procedure1<CreateTableStatement>() {
        public void apply(final CreateTableStatement statement) {
          SqliteModelGenerator.this.generateActiveRecordEntity(resource, fsa, ((CreateTableStatement) statement));
        }
      };
    IterableExtensions.<CreateTableStatement>forEach(_filter_3, _function_4);
    DatabaseBlock _database_8 = model.getDatabase();
    EList<MigrationBlock> _migrations_1 = _database_8.getMigrations();
    final Procedure2<MigrationBlock,Integer> _function_5 = new Procedure2<MigrationBlock,Integer>() {
        public void apply(final MigrationBlock item, final Integer index) {
          boolean _greaterThan = ((index).intValue() > 0);
          if (_greaterThan) {
            int _plus = ((index).intValue() + 1);
            SqliteModelGenerator.this.generateMigration(resource, fsa, item, _plus);
          }
        }
      };
    IterableExtensions.<MigrationBlock>forEach(_migrations_1, _function_5);
  }
  
  public void generateActiveRecordEntity(final Resource resource, final IFileSystemAccess fsa, final CreateTableStatement statement) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    String _name = statement.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = _pascalize.concat("Record");
    String genFileName = Strings.resolveFileName(_packageName, _concat);
    CharSequence _generate = this.mActiveRecordGenerator.generate(model, statement);
    fsa.generateFile(genFileName, _generate);
  }
  
  public void generateAction(final Resource resource, final IFileSystemAccess fsa, final ActionStatement action) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    String _concat = _packageName.concat(".actions");
    String _name = action.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat_1 = "Abstract".concat(_pascalize);
    String _concat_2 = _concat_1.concat("Actions");
    String genFileName = Strings.resolveFileName(_concat, _concat_2);
    String _packageName_1 = model.getPackageName();
    String _concat_3 = _packageName_1.concat(".actions");
    String _name_1 = action.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_4 = _pascalize_1.concat("Actions");
    String genStubFileName = Strings.resolveFileName(_concat_3, _concat_4);
    CharSequence _generate = this.mActionGenerator.generate(model, action);
    fsa.generateFile(genFileName, _generate);
    CharSequence _generateStub = this.mActionGenerator.generateStub(model, action);
    fsa.generateFile(genStubFileName, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  protected void _generateAction(final Resource resource, final IFileSystemAccess fsa, final CreateTableStatement stmt, final boolean forId) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model model = ((Model) _head);
    String genFileName = "";
    String genStubFileName = "";
    if (forId) {
      String _packageName = model.getPackageName();
      String _concat = _packageName.concat(".actions");
      String _name = stmt.getName();
      String _pascalize = Strings.pascalize(_name);
      String _concat_1 = "Abstract".concat(_pascalize);
      String _concat_2 = _concat_1.concat("ByIdActions");
      String _resolveFileName = Strings.resolveFileName(_concat, _concat_2);
      genFileName = _resolveFileName;
      String _packageName_1 = model.getPackageName();
      String _concat_3 = _packageName_1.concat(".actions");
      String _name_1 = stmt.getName();
      String _pascalize_1 = Strings.pascalize(_name_1);
      String _concat_4 = _pascalize_1.concat("ByIdActions");
      String _resolveFileName_1 = Strings.resolveFileName(_concat_3, _concat_4);
      genStubFileName = _resolveFileName_1;
    } else {
      String _packageName_2 = model.getPackageName();
      String _concat_5 = _packageName_2.concat(".actions");
      String _name_2 = stmt.getName();
      String _pascalize_2 = Strings.pascalize(_name_2);
      String _concat_6 = "Abstract".concat(_pascalize_2);
      String _concat_7 = _concat_6.concat("Actions");
      String _resolveFileName_2 = Strings.resolveFileName(_concat_5, _concat_7);
      genFileName = _resolveFileName_2;
      String _packageName_3 = model.getPackageName();
      String _concat_8 = _packageName_3.concat(".actions");
      String _name_3 = stmt.getName();
      String _pascalize_3 = Strings.pascalize(_name_3);
      String _concat_9 = _pascalize_3.concat("Actions");
      String _resolveFileName_3 = Strings.resolveFileName(_concat_8, _concat_9);
      genStubFileName = _resolveFileName_3;
    }
    CharSequence _generate = this.mActionGenerator.generate(model, stmt, forId);
    fsa.generateFile(genFileName, _generate);
    CharSequence _generateStub = this.mActionGenerator.generateStub(model, stmt, forId);
    fsa.generateFile(genStubFileName, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  protected void _generateAction(final Resource resource, final IFileSystemAccess fsa, final CreateViewStatement stmt, final boolean forId) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String genFileName = "";
    String genStubFileName = "";
    if (forId) {
      String _packageName = model.getPackageName();
      String _concat = _packageName.concat(".actions");
      String _name = stmt.getName();
      String _pascalize = Strings.pascalize(_name);
      String _concat_1 = "Abstract".concat(_pascalize);
      String _concat_2 = _concat_1.concat("ByIdActions");
      String _resolveFileName = Strings.resolveFileName(_concat, _concat_2);
      genFileName = _resolveFileName;
      String _packageName_1 = model.getPackageName();
      String _concat_3 = _packageName_1.concat(".actions");
      String _name_1 = stmt.getName();
      String _pascalize_1 = Strings.pascalize(_name_1);
      String _concat_4 = _pascalize_1.concat("ByIdActions");
      String _resolveFileName_1 = Strings.resolveFileName(_concat_3, _concat_4);
      genStubFileName = _resolveFileName_1;
    } else {
      String _packageName_2 = model.getPackageName();
      String _concat_5 = _packageName_2.concat(".actions");
      String _name_2 = stmt.getName();
      String _pascalize_2 = Strings.pascalize(_name_2);
      String _concat_6 = "Abstract".concat(_pascalize_2);
      String _concat_7 = _concat_6.concat("Actions");
      String _resolveFileName_2 = Strings.resolveFileName(_concat_5, _concat_7);
      genFileName = _resolveFileName_2;
      String _packageName_3 = model.getPackageName();
      String _concat_8 = _packageName_3.concat(".actions");
      String _name_3 = stmt.getName();
      String _pascalize_3 = Strings.pascalize(_name_3);
      String _concat_9 = _pascalize_3.concat("Actions");
      String _resolveFileName_3 = Strings.resolveFileName(_concat_8, _concat_9);
      genStubFileName = _resolveFileName_3;
    }
    CharSequence _generate = this.mActionGenerator.generate(model, stmt, forId);
    fsa.generateFile(genFileName, _generate);
    CharSequence _generateStub = this.mActionGenerator.generateStub(model, stmt, forId);
    fsa.generateFile(genStubFileName, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  public void generateMigration(final Resource resource, final IFileSystemAccess fsa, final MigrationBlock migration, final int version) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    String _concat = _packageName.concat(".migrations");
    DatabaseBlock _database = model.getDatabase();
    String _name = _database.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat_1 = "Abstract".concat(_pascalize);
    String _concat_2 = _concat_1.concat("MigrationV");
    String _valueOf = String.valueOf(version);
    String _concat_3 = _concat_2.concat(_valueOf);
    String genFileName = Strings.resolveFileName(_concat, _concat_3);
    String _packageName_1 = model.getPackageName();
    String _concat_4 = _packageName_1.concat(".migrations");
    DatabaseBlock _database_1 = model.getDatabase();
    String _name_1 = _database_1.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_5 = _pascalize_1.concat("MigrationV");
    String _valueOf_1 = String.valueOf(version);
    String _concat_6 = _concat_5.concat(_valueOf_1);
    String genStubFileName = Strings.resolveFileName(_concat_4, _concat_6);
    CharSequence _generate = this.mMigrationGenerator.generate(model, migration, version);
    fsa.generateFile(genFileName, _generate);
    CharSequence _generateStub = this.mMigrationGenerator.generateStub(model, migration, version);
    fsa.generateFile(genStubFileName, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  public void generateAction(final Resource resource, final IFileSystemAccess fsa, final DDLStatement stmt, final boolean forId) {
    if (stmt instanceof CreateTableStatement) {
      _generateAction(resource, fsa, (CreateTableStatement)stmt, forId);
      return;
    } else if (stmt instanceof CreateViewStatement) {
      _generateAction(resource, fsa, (CreateViewStatement)stmt, forId);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(resource, fsa, stmt, forId).toString());
    }
  }
}
