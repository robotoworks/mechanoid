package com.robotoworks.mechanoid.sqlite.generator;


import java.util.LinkedHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelFactory;

public class SqliteDatabaseSnapshotBuilder {
	
	@Inject XtextResourceSet mSnapshotResourceSet;
	
	public LinkedHashMap<String, CreateTableStatement> mTables = new LinkedHashMap<String, CreateTableStatement>();
	public LinkedHashMap<String, CreateViewStatement> mViews = new LinkedHashMap<String, CreateViewStatement>();
	public LinkedHashMap<String, CreateTriggerStatement> mTriggers = new LinkedHashMap<String, CreateTriggerStatement>();
	private Model mSnapshotModel;

	private Model mSourceModel;
		
	public Model build(Model model) {
		mSourceModel = model;
		
		buildSnapshot(model);
				
		buildSnapshotModel();
		
		return mSnapshotModel;
	}

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
					
					mViews.put(createViewStmt.getName(), EcoreUtil.copy(createViewStmt));
					
				} else if(statement instanceof AlterTableStatement) {
					
					AlterTableStatement alter = (AlterTableStatement) statement;
					
					CreateTableStatement tableToAlter = mTables.get(alter.getName());
					
					if(alter.getClause() instanceof AlterTableRenameClause) {
						
						AlterTableRenameClause renameClause = (AlterTableRenameClause) alter.getClause();
						tableToAlter.setName(renameClause.getName());
						
						mTables.put(renameClause.getName(), tableToAlter);
						mTables.remove(alter.getName());
						
					} else if(alter.getClause() instanceof AlterTableAddColumnClause) {
						
						AlterTableAddColumnClause addColumnClause = (AlterTableAddColumnClause) alter.getClause();
						tableToAlter.getColumnDefs().add(EcoreUtil.copy(addColumnClause.getColumnDef()));				
					} 
				} else if (statement instanceof CreateTriggerStatement) {
					CreateTriggerStatement createTriggerStmt = (CreateTriggerStatement) statement;
					
					mTriggers.put(createTriggerStmt.getName(), EcoreUtil.copy(createTriggerStmt));
					
				} else if (statement instanceof DropTableStatement) {
					DropTableStatement dropTableStmt = (DropTableStatement) statement;
					mTables.remove(dropTableStmt.getName());
				} else if (statement instanceof DropViewStatement) {
					DropViewStatement dropViewStmt = (DropViewStatement) statement;
					mViews.remove(dropViewStmt.getName());
				} else if (statement instanceof DropTriggerStatement) {
					DropTriggerStatement dropTriggerStmt = (DropTriggerStatement) statement;
					mTriggers.remove(dropTriggerStmt.getName());					
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
		}
		
		for(CreateViewStatement stmt : mViews.values()) {
			migration.getStatements().add(stmt);
		}
		
		for(CreateTriggerStatement stmt : mTriggers.values()) {
			migration.getStatements().add(stmt);
		}
		
		EcoreUtil2.resolveAll(mSnapshotResourceSet);
				
//		String text = serializer.serialize(mSnapshotModel, SaveOptions.newBuilder().noValidation().getOptions());
//		
//		text = null;
	}
}
