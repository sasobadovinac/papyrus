/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Fadwa TMAR (CEA LIST) fadwa.tmar@cea.fr - Initial API and implementation
 *****************************************************************************/
package SoaML;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoaML.ServiceChannel#getBase_Connector <em>Base Connector</em>}</li>
 * </ul>
 *
 * @see SoaML.SoaMLPackage#getServiceChannel()
 * @model
 * @generated
 */
public interface ServiceChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference.
	 * @see #setBase_Connector(Connector)
	 * @see SoaML.SoaMLPackage#getServiceChannel_Base_Connector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link SoaML.ServiceChannel#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.base_Connector.end->size() = 2 \r\n--and self.base_Connector.end->forAll(e|e.oclIsTypeOf(UML::Port)) '"
	 * @generated
	 */
	boolean Onlybinaryconnectorsallowed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let portsSet: OrderedSet(UML::ConnectorEnd)= self.base_Connector.end ->select(e|e.oclIsTypeOf(UML::Port)) in\r\n  portsSet->size()>0 implies \r\n  portsSet->forAll(p|p.getAppliedStereotypes()->select(s|s.name=\'Request\' or s.name=\'Service\')->size()=1 )\r\n'"
	 * @generated
	 */
	boolean serviceChannelEndTypes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let \r\n requestTypeClassifier: UML::Classifier=self.base_Connector.end->select(p|p.oclIsTypeOf(UML::Port) and  \toclIsTypeOf(SoaML::Request))\r\n -> select(p|p.oclAsType(UML::Port).type.oclIsTypeOf(Classifier))->first().oclAsType(UML::Port).type.oclAsType(Classifier),\r\n serviceTypeClassifier: UML::Classifier=self.base_Connector.end->select(p|p.oclIsTypeOf(UML::Port) and oclIsTypeOf(SoaML::Service))\r\n ->select(p|p.oclAsType(UML::Port).type.oclIsTypeOf(Classifier))->first().oclAsType(UML::Port).type.oclAsType(Classifier)  in \r\n--The Request and Service connected by a ServiceChannel must be compatible\r\n  --1. The Request and Service have the same type, either an Interface or ServiceInterface.\r\nnot requestTypeClassifier.oclIsUndefined() and not serviceTypeClassifier.oclIsUndefined() implies requestTypeClassifier=serviceTypeClassifier or\r\n --2. The type of the Service is a specialization or realization of the type of the Request.  --2 implies 1\r\nserviceTypeClassifier.Generalization.general->closure(general)-> includes(requestTypeClassifier) or\r\n requestTypeClassifier.allUsedInterfaces()->includes(serviceTypeClassifier) or\r\n --3. The Request and Service have compatible needs and capabilities respectively. This means the Service must provide an \r\n--Operation for every Operation used through the Request, the Request must provide an Operation for every Operation used \r\n--through the Service, and the protocols for how the capabilities are compatible between the Request and Service. \r\n(requestTypeClassifier.allUsedInterfaces().getAllOperations()->includesAll(serviceTypeClassifier.allRealizedInterfaces().getAllOperations() )and \r\n\trequestTypeClassifier.allRealizedInterfaces().getAllOperations()-> includesAll(serviceTypeClassifier.allUsedInterfaces().getAllOperations()))'"
	 * @generated
	 */
	boolean Compatibility(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceChannel
