package com.robotoworks.mechanoid.sqlite.validation;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.util.ModelUtil;

 

public class SqliteModelJavaValidator extends AbstractSqliteModelJavaValidator {

 
	@Inject TypeReferences typeReferences;
	
	@Check
	public void checkDatabase(Model m) {
		JvmType type = typeReferences.findDeclaredType("com.robotoworks.mechanoid.content.CursorWalker", m);

		if(type == null) {
			error("mechanoid.jar is required in your /libs folder or on the classpath", SqliteModelPackage.Literals.MODEL__PACKAGE_NAME);
		}
	}
	
	/*
	@Check
	public void checkCreateTableStatement(CreateTableStatement stmt) {
		
		final CreateTableStatement s = stmt;
		
		final NameHolder holder = new NameHolder();
		
		holder.name = s.getName();
		
		ModelUtil.forEachPreviousStatement(s, new Function1<DDLStatement, Boolean>() {
			@Override
			public Boolean apply(DDLStatement p) {
				if(p instanceof CreateTableStatement) {
					CreateTableStatement ps = (CreateTableStatement) p;
					
					if(ps.getName().equals(holder.name)) {
						holder.name = null;
					}
				}
				else if(p instanceof AlterTableRenameStatement){
					AlterTableRenameStatement rp = (AlterTableRenameStatement) p;
					if(rp.getName().equals(holder.name)) {
						holder.name = rp.getTable().getName();
					} else if(rp.getTable().getName().equals(holder.name)) {
						holder.name = rp.getName();
					}
				} 
				else if(p instanceof DropTableStatement) {
					DropTableStatement pd = (DropTableStatement) p;
					
					if(pd.getTable().getName().equals(holder.name)) {
						holder.name = pd.getTable().getName();
					}
				}
				
				return true;
			}
		});
		
		if(holder.name == null) {
			error("invalid table", SqliteModelPackage.Literals.TABLE_DEFINITION__NAME);
		}
	}
	
	static class NameHolder {
		String name = null;
	}
	*/
}
