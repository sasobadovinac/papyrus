/**
 */
package org.eclipse.papyrus.dsml.validation.PapyrusDSMLValidationRule.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.papyrus.dsml.validation.PapyrusDSMLValidationRule.PapyrusDSMLValidationRulePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PapyrusDSMLValidationRuleXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusDSMLValidationRuleXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		PapyrusDSMLValidationRulePackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the PapyrusDSMLValidationRuleResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PapyrusDSMLValidationRuleResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PapyrusDSMLValidationRuleResourceFactoryImpl());
		}
		return registrations;
	}

} // PapyrusDSMLValidationRuleXMLProcessor
