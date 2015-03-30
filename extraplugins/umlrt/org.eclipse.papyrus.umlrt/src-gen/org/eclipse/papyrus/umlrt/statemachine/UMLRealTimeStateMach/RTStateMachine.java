/**
 * Copyright (c) 2014 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * base_StateMachine.region->size() = 1
 * not base_StateMachine.isReentrant
 * (base_StateMachine.ownedParameter->size()=0) and
 * (base_StateMachine.ownedParameterSet->size() = 0)
 * (base_StateMachine.behavioredClassifier->size()=1)
 * and (base_StateMachine.behavioredClassifier.oclIsKindOf(Class))
 * isPassive = not (base_StateMachine.behavioredClassifier.oclAsType(Class).isActive)
 * isPassive implies not (base_StateMachine.isReentrant)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#isPassive <em>Is Passive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#getRTStateMachine()
 * @model
 * @generated
 */
public interface RTStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base State Machine</em>' reference.
	 * @see #setBase_StateMachine(StateMachine)
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#getRTStateMachine_Base_StateMachine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateMachine getBase_StateMachine();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#getBase_StateMachine <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State Machine</em>' reference.
	 * @see #getBase_StateMachine()
	 * @generated
	 */
	void setBase_StateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Is Passive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Passive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Passive</em>' attribute.
	 * @see #setIsPassive(boolean)
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#getRTStateMachine_IsPassive()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPassive();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#isPassive <em>Is Passive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Passive</em>' attribute.
	 * @see #isPassive()
	 * @generated
	 */
	void setIsPassive(boolean value);

} // RTStateMachine
