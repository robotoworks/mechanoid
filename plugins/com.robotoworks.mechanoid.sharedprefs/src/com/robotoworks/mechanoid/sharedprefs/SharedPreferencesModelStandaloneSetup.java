
package com.robotoworks.mechanoid.sharedprefs;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SharedPreferencesModelStandaloneSetup extends SharedPreferencesModelStandaloneSetupGenerated{

	public static void doSetup() {
		new SharedPreferencesModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

