/*
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.idmProject.IDMProjectRuntimeModule;
import org.xtext.idmProject.IDMProjectStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class IDMProjectIdeSetup extends IDMProjectStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new IDMProjectRuntimeModule(), new IDMProjectIdeModule()));
	}
	
}
