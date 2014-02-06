package com.robotoworks.mechanoid.net.generator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtend2.lib.StringConcatenation;

public class ImportHelper {
	private Set<String> imports = new HashSet<String>();
	
	public void addImport(String importId){
		imports.add(importId);
	}
	
	public StringConcatenation printAndClear(){
		StringConcatenation builder = new StringConcatenation();
		for(String str:imports){
			builder.append("import ");
			builder.append(str);
			builder.append(";");
			builder.newLine();
		}
		return builder;
	}
	
	public void clearImports(){
		imports.clear();
	}
}
