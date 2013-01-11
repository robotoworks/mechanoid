
package com.robotoworks.mechanoid.ops;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OpServiceModelStandaloneSetup extends OpServiceModelStandaloneSetupGenerated{

	public static void doSetup() {
		new OpServiceModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

