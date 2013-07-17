package com.robotoworks.mechanoid.standalone;

import java.util.Arrays;
import java.util.Iterator;

import com.robotoworks.mechanoid.db.SqliteModelRuntimeModule;
import com.robotoworks.mechanoid.db.SqliteModelStandaloneSetup;
import com.robotoworks.mechanoid.db.generator.SqliteModelGenerator;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.net.NetModelStandaloneSetup;
import com.robotoworks.mechanoid.net.generator.NetModelGenerator;
import com.robotoworks.mechanoid.ops.OpServiceModelStandaloneSetup;
import com.robotoworks.mechanoid.ops.generator.OpServiceModelGenerator;
import com.robotoworks.mechanoid.sharedprefs.SharedPreferencesModelStandaloneSetup;
import com.robotoworks.mechanoid.sharedprefs.generator.SharedPreferencesGenerator;
import com.robotoworks.mechanoid.sharedprefs.generator.SharedPreferencesModelGenerator;

public class CompilerMain {

	private static Compiler[] COMPILERS = {
		new Compiler(new SqliteModelStandaloneSetup(), SqliteModelGenerator.class, ".mechdb"),
		new Compiler(new OpServiceModelStandaloneSetup(), OpServiceModelGenerator.class, ".mechops"),
		new Compiler(new NetModelStandaloneSetup(), NetModelGenerator.class, ".mechnet"),
		new Compiler(new SharedPreferencesModelStandaloneSetup(), SharedPreferencesModelGenerator.class, ".mechprefs")
	};
	
	public static void main(String[] args) {
		
		if(args == null || args.length == 0) {
			printUsage();
			return;
		}
		
		Iterator<String> arguments = Arrays.asList(args).iterator();
		
		String inputSource = null;
		String sourceFolder = "./src-gen";
		String stubFolder = "./src";
		boolean recurse = false;
		
		while(arguments.hasNext()) {
			String arg = arguments.next();
			
			if(arg.equals("-output")) {
				sourceFolder = arguments.next().trim();
			} else if(arg.equals("-stubs")) {
				stubFolder = arguments.next().trim();
			} else if(arg.equals("-r")) {
				recurse = true;
			} else {
				inputSource = arg;
			}
		}
		
		for(Compiler compiler : COMPILERS) {
			compiler.compile(inputSource, sourceFolder, stubFolder, recurse);
		}
	}
	
	private static void printUsage() {
		System.out.println("Usage: <options> <input source>");
		System.out.println("Options:");
		System.out.println("-output		where to place the generated Mechanoid files");
		System.out.println("				defaults to ./src-gen");
		System.out.println("-stubs 		where to place the generated Mechanoid user editable stubs");
		System.out.println("				defaults to ./src");
		System.out.println("-r 			recurse the given input source (must be a directory)");
	}
}
