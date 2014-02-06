package com.robotoworks.mechanoid.db.generator;


import java.util.Collection;
import java.util.LinkedHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource;
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
import com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.db.sqliteModel.Model;
import com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.db.sqliteModel.TableConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint;

public class SqliteDatabaseSnapshot {
	
	public static class Builder {
		@Inject XtextResourceSet mSnapshotResourceSet;
		
		private LinkedHashMap<String, CreateTableStatement> mTables = new LinkedHashMap<String, CreateTableStatement>();
		private LinkedHashMap<String, CreateViewStatement> mViews = new LinkedHashMap<String, CreateViewStatement>();
		private LinkedHashMap<String, CreateTriggerStatement> mTriggers = new LinkedHashMap<String, CreateTriggerStatement>();
		private LinkedHashMap<String, CreateIndexStatement> mIndexes = new LinkedHashMap<String, CreateIndexStatement>();
		private Model mSnapshotModel;
	
		private Model mSourceModel;
		
		private void buildSnapshot(Model model) {
			DatabaseBlock database = model.getDatabase();
			
			for(MigrationBlock migration : database.getMigrations()) {
				EList<DDLStatement> statements = migration.getStatements();
				
				for(DDLStatement statement : statements) {
					if(statement instanceof CreateTableStatement) {
						
						CreateTableStatement createTableStmt = (CreateTableStatement) statement;
						
						CreateTableStatement copy = EcoreUtil2.copy(createTableStmt);
						mTables.put(createTableStmt.getName(), copy);
						
					} else if (statement instanceof CreateViewStatement) {
						
						CreateViewStatement createViewStmt = (CreateViewStatement) statement;
						
						mViews.put(createViewStmt.getName(), createViewStmt);
						
					} else if(statement instanceof AlterTableRenameStatement) {
						
						AlterTableRenameStatement renameStmt = (AlterTableRenameStatement) statement;
						
						CreateTableStatement tableToAlter = mTables.get(renameStmt.getTable().getName());
						
						tableToAlter.setName(renameStmt.getName());
						
						mTables.put(renameStmt.getName(), tableToAlter);
						mTables.remove(renameStmt.getTable().getName());
					} 
					else if (statement instanceof AlterTableAddColumnStatement) {
						AlterTableAddColumnStatement addColumnStmt = (AlterTableAddColumnStatement) statement;

						CreateTableStatement tableToAlter = mTables.get(addColumnStmt.getTable().getName());
						
						tableToAlter.getColumnDefs().add(EcoreUtil.copy(addColumnStmt.getColumnDef()));	
					}
					else if (statement instanceof CreateTriggerStatement) {
						CreateTriggerStatement createTriggerStmt = (CreateTriggerStatement) statement;
						
						mTriggers.put(createTriggerStmt.getName(), createTriggerStmt);
						
					}
					else if (statement instanceof CreateIndexStatement) {
                        CreateIndexStatement createIndexStmt = (CreateIndexStatement) statement;
                        
                        mIndexes.put(createIndexStmt.getName(), createIndexStmt);
                        
                    }
					else if (statement instanceof DropTableStatement) {
						DropTableStatement dropTableStmt = (DropTableStatement) statement;
						mTables.remove(dropTableStmt.getTable().getName());
					} 
					else if (statement instanceof DropViewStatement) {
						DropViewStatement dropViewStmt = (DropViewStatement) statement;
						mViews.remove(dropViewStmt.getView().getName());
					} 
					else if (statement instanceof DropTriggerStatement) {
						DropTriggerStatement dropTriggerStmt = (DropTriggerStatement) statement;
						mTriggers.remove(dropTriggerStmt.getTrigger().getName());					
					} 
					else if(statement instanceof DropIndexStatement) {
					    DropIndexStatement dropIndexStmt = (DropIndexStatement) statement;
					    mIndexes.remove(dropIndexStmt.getIndex().getName());					
					}
				}
			}
		}

		private void buildSnapshotModel() {
			XtextResource resource = (XtextResource) mSnapshotResourceSet.createResource(URI.createURI("platform:/resource/app1/temp.mechdb"));
			
			mSnapshotModel = (Model) SqliteModelFactory.eINSTANCE.createModel();
			mSnapshotModel.setPackageName(mSourceModel.getPackageName());
			
			resource.getContents().add(mSnapshotModel);
			
			DatabaseBlock database = (DatabaseBlock) SqliteModelFactory.eINSTANCE.createDatabaseBlock();
			database.setName(mSourceModel.getDatabase().getName());
			mSnapshotModel.setDatabase(database);
			
			MigrationBlock migration = (MigrationBlock) SqliteModelFactory.eINSTANCE.createMigrationBlock();
			database.getMigrations().add(migration);
					
			for(CreateTableStatement stmt : mTables.values()) {
				migration.getStatements().add(stmt);
				resolveIndexedColumnReferences(stmt);
			}	
			
			EcoreUtil2.resolveAll(mSnapshotResourceSet);
		}
		
		private void resolveIndexedColumnReferences(CreateTableStatement stmt) {
			Iterable<IndexedColumn> columns = null;
			
			for(TableConstraint c : stmt.getConstraints()) {
				if(c instanceof UniqueTableConstraint) {
					UniqueTableConstraint uc = (UniqueTableConstraint) c;
					
					columns = uc.getColumns();
				} else if (c instanceof PrimaryConstraint) {
					PrimaryConstraint pc = (PrimaryConstraint) c;
					
					columns = pc.getColumns();
				}
				
				if(columns == null) {
					return;
				}
				
				for(final IndexedColumn col : columns) {
					ColumnSource source = IterableExtensions.findFirst(stmt.getColumnDefs(), new Function1<ColumnSource, Boolean>(){
						public Boolean apply(ColumnSource p) {
							if(p.getName().equals(col.getColumnReference().getName())) {
								return true;
							}
							
							return false;
						}
					});
					
					col.setColumnReference((ColumnDef) source);
				}
			}
		}

		public SqliteDatabaseSnapshot build(Model model) {
			mSourceModel = model;
			
			buildSnapshot(model);
					
			buildSnapshotModel();
			
			return new SqliteDatabaseSnapshot(mTables, mViews, mTriggers, mIndexes);
		}
	}
	
	private Collection<CreateTableStatement> mTables;
	private Collection<CreateViewStatement> mViews;
	private Collection<CreateTriggerStatement> mTriggers;
	private Collection<CreateIndexStatement> mIndexes;
	
	public SqliteDatabaseSnapshot(
			LinkedHashMap<String, CreateTableStatement> tables,
			LinkedHashMap<String, CreateViewStatement> views,
			LinkedHashMap<String, CreateTriggerStatement> triggers,
			LinkedHashMap<String, CreateIndexStatement> indexes) {
		
		mTables = tables.values();
		mViews = views.values();
		mTriggers = triggers.values();
		mIndexes = indexes.values();
	}

	public Collection<CreateTableStatement> getTables() {
		return mTables;
	}
	
	public Collection<CreateViewStatement> getViews() {
		return mViews;
	}
	
	public Collection<CreateTriggerStatement> getTriggers() {
		return mTriggers;
	}
	
	public Collection<CreateIndexStatement> getIndexes() {
	    return mIndexes;
	}
	
    public boolean containsDefinition(final String name) {
        CreateTableStatement tableStmt = IterableExtensions.findFirst(mTables, new Function1<CreateTableStatement, Boolean>() {
            @Override
            public Boolean apply(CreateTableStatement p) {
                return p.getName().equals(name);
            }
        });
        
        if(tableStmt != null) {
            return true;
        }
        
        CreateViewStatement viewStmt = IterableExtensions.findFirst(mViews, new Function1<CreateViewStatement, Boolean>() {
            @Override
            public Boolean apply(CreateViewStatement p) {
                return p.getName().equals(name);
            }
        });
        
        if(viewStmt != null) {
            return true;
        }
        
        return false;
    }
}
