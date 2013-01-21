/*
 * generated by Xtext
 */
package com.robotoworks.mechanoid.sqlite.generator

import com.google.inject.Inject
import com.google.inject.Provider
import com.robotoworks.mechanoid.common.xtext.generator.MechanoidOutputConfigurationProvider
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension com.robotoworks.mechanoid.common.util.Strings.*

class SqliteModelGenerator implements IGenerator {
	@Inject SqliteOpenHelperGenerator mOpenHelperGenerator
	@Inject ContentProviderContractGenerator mContentProviderContractGenerator
	@Inject Provider<SqliteDatabaseSnapshotBuilder> mDbSnapshotBuilderProvider
	@Inject ContentProviderGenerator mContentProviderGenerator
	@Inject Provider<SqliteMigrationGenerator> mMigrationGenerator
	@Inject ActiveRecordGenerator mActiveRecordGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		var model = resource.contents.head as Model;
		
		val snapshot = mDbSnapshotBuilderProvider.get().build(model).database.migrations.get(0)
		
		fsa.generateFile(
			model.packageName.resolveFileName("Abstract".concat(model.database.name.pascalize).concat("OpenHelper")), 
			mOpenHelperGenerator.generate(model, snapshot)
		);
		fsa.generateFile(
			model.packageName.resolveFileName(model.database.name.pascalize.concat("OpenHelper")), 
			MechanoidOutputConfigurationProvider::DEFAULT_STUB_OUTPUT, 
			mOpenHelperGenerator.generateStub(model, snapshot)
		);
		fsa.generateFile(
			model.packageName.resolveFileName(model.database.name.pascalize.concat("Contract")), 
			mContentProviderContractGenerator.generate(model, snapshot)
		);
		
		fsa.generateFile(
			model.packageName.resolveFileName("Abstract".concat(model.database.name.pascalize).concat("ContentProvider")), 
			mContentProviderGenerator.generate(model, snapshot)
		);
		
		fsa.generateFile(
			model.packageName.resolveFileName(model.database.name.pascalize.concat("ContentProvider")), 
			MechanoidOutputConfigurationProvider::DEFAULT_STUB_OUTPUT, 
			mContentProviderGenerator.generateStub(model, snapshot)
		);
		
		snapshot.statements.filter(typeof(CreateTableStatement)).forEach[
			statement|
			generateActiveRecordEntity(resource, fsa, statement as CreateTableStatement)
		];
		
		model.database.migrations.forEach[
			item,index|
			if(index> 0) generateMigration(resource, fsa, item, index + 1)
		];		
	}
	
	def void generateActiveRecordEntity(Resource resource, IFileSystemAccess fsa, CreateTableStatement statement) {
		
		var model = resource.contents.head as Model;
		
		var genFileName = model.packageName.resolveFileName(statement.name.pascalize.concat("Record"))
			
		fsa.generateFile(genFileName, 
			mActiveRecordGenerator.generate(model, statement)
		)		
	}

	def void generateMigration(Resource resource, IFileSystemAccess fsa, MigrationBlock migration, int version) { 
		
		var model = resource.contents.head as Model;
		
		var genFileName = model.packageName.concat(".migrations").resolveFileName("Default".concat(model.database.name.pascalize).concat("MigrationV").concat(String::valueOf(version)))
			
		var generator = mMigrationGenerator.get()
		
		fsa.generateFile(genFileName, 
			generator.generate(model, migration, version)
		)
	}

}
