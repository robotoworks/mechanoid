
package com.robotoworks.mechanoid.net;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class NetModelStandaloneSetup extends NetModelStandaloneSetupGenerated{

	public static void doSetup() {
		new NetModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

