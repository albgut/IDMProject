/*
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class IDMProjectStandaloneSetup extends IDMProjectStandaloneSetupGenerated {

	public static void doSetup() {
		new IDMProjectStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
