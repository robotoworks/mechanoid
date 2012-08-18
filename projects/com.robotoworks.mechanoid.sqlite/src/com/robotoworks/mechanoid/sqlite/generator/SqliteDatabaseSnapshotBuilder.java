package com.robotoworks.mechanoid.sqlite.generator;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Statment;

public class SqliteDatabaseSnapshotBuilder {
	@Inject private ISerializer serializer;
	
	private DatabaseImage mImage;
	private Model mSnapshotModel;
		
	public Model build(Model model) {
		
		mImage = new DatabaseImage();
						
		buildSnapshot(model);
				
		buildSnapshotModel();
		
		return mSnapshotModel;
	}

	private void buildSnapshot(Model model) {
		DatabaseBlock database = model.getDatabase();
		
		for(MigrationBlock migration : database.getMigrations()) {
			EList<Statment> statements = migration.getStatements();
			
			for(Statment statement : statements) {
				if(statement instanceof CreateTableStatement) {
					
					CreateTableStatement createTableStmt = (CreateTableStatement) statement;
					
					CreateTableStatement copy = EcoreUtil.copy(createTableStmt);
					mImage.tables.put(createTableStmt.getName(), copy);
					
					
				} else if (statement instanceof CreateViewStatement) {
					
					CreateViewStatement createViewStmt = (CreateViewStatement) statement;
					
					mImage.views.put(createViewStmt.getName(), createViewStmt);
					
				} else if(statement instanceof AlterTableStatement) {
					
					AlterTableStatement alter = (AlterTableStatement) statement;
					
					CreateTableStatement tableToAlter = mImage.tables.get(alter.getName());
					
					if(alter.getClause() instanceof AlterTableRenameClause) {
						
						AlterTableRenameClause renameClause = (AlterTableRenameClause) alter.getClause();
						tableToAlter.setName(renameClause.getName());
						
						mImage.tables.put(renameClause.getName(), tableToAlter);
						mImage.tables.remove(alter.getName());
						
					} else if(alter.getClause() instanceof AlterTableAddColumnClause) {
						
						AlterTableAddColumnClause addColumnClause = (AlterTableAddColumnClause) alter.getClause();
						tableToAlter.getColumnDefs().add(EcoreUtil.copy(addColumnClause.getColumnDef()));				
					}
				}
			}
		}
	}

	private void buildSnapshotModel() {
		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createFileURI("temp.mechdb");
		Resource res = set.createResource(uri);
		
		mSnapshotModel = (Model) SqliteModelFactory.eINSTANCE.createModel();
		mSnapshotModel.setPackageName("hello.world");
		
		DatabaseBlock database = (DatabaseBlock) SqliteModelFactory.eINSTANCE.createDatabaseBlock();
		database.setName("MyDatabase");
		
		MigrationBlock migration = (MigrationBlock) SqliteModelFactory.eINSTANCE.createMigrationBlock();
		database.getMigrations().add(migration);
		
		mSnapshotModel.setDatabase(database);
		
		
		res.getContents().add(mSnapshotModel);
		
		for(CreateTableStatement stmt : mImage.tables.values()) {
			migration.getStatements().add(stmt);
		}
		
		for(CreateViewStatement stmt : mImage.views.values()) {
			migration.getStatements().add(stmt);
		}
		
//		String text = serializer.serialize(mSnapshotModel, SaveOptions.newBuilder().noValidation().getOptions());
//		
//		text = null;
	}
}
