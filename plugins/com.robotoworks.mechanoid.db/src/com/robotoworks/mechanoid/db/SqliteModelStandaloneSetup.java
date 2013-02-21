
package com.robotoworks.mechanoid.db;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SqliteModelStandaloneSetup extends SqliteModelStandaloneSetupGenerated{

	public static void doSetup() {
		new SqliteModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

