/*
 * generated by Xtext
 */
package org.eclipse.papyrus.uml.alf.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.papyrus.uml.alf.ui.internal.CommonActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CommonExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CommonActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CommonActivator.getInstance().getInjector(CommonActivator.ORG_ECLIPSE_PAPYRUS_UML_ALF_COMMON);
	}
	
}
