/**
 * Copyright (c) 2017 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.EObjectBooleanExpressionsPackage;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.IBooleanEObjectExpression;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.NotExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.impl.NotExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.impl.NotExpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.impl.NotExpressionImpl#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link org.eclipse.papyrus.infra.emf.expressions.booleanexpressionspackage.impl.NotExpressionImpl#getReferencedExpression <em>Referenced Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotExpressionImpl extends MinimalEObjectImpl.Container implements NotExpression {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedExpression() <em>Owned Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExpression()
	 * @generated
	 * @ordered
	 */
	protected IBooleanEObjectExpression ownedExpression;

	/**
	 * The cached value of the '{@link #getReferencedExpression() <em>Referenced Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedExpression()
	 * @generated
	 * @ordered
	 */
	protected IBooleanEObjectExpression referencedExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EObjectBooleanExpressionsPackage.Literals.NOT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EObjectBooleanExpressionsPackage.NOT_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EObjectBooleanExpressionsPackage.NOT_EXPRESSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooleanEObjectExpression getOwnedExpression() {
		return ownedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExpression(IBooleanEObjectExpression newOwnedExpression, NotificationChain msgs) {
		IBooleanEObjectExpression oldOwnedExpression = ownedExpression;
		ownedExpression = newOwnedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION, oldOwnedExpression, newOwnedExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedExpression(IBooleanEObjectExpression newOwnedExpression) {
		if (newOwnedExpression != ownedExpression) {
			NotificationChain msgs = null;
			if (ownedExpression != null)
				msgs = ((InternalEObject)ownedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION, null, msgs);
			if (newOwnedExpression != null)
				msgs = ((InternalEObject)newOwnedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION, null, msgs);
			msgs = basicSetOwnedExpression(newOwnedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION, newOwnedExpression, newOwnedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooleanEObjectExpression getReferencedExpression() {
		if (referencedExpression != null && referencedExpression.eIsProxy()) {
			InternalEObject oldReferencedExpression = (InternalEObject)referencedExpression;
			referencedExpression = (IBooleanEObjectExpression)eResolveProxy(oldReferencedExpression);
			if (referencedExpression != oldReferencedExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EObjectBooleanExpressionsPackage.NOT_EXPRESSION__REFERENCED_EXPRESSION, oldReferencedExpression, referencedExpression));
			}
		}
		return referencedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooleanEObjectExpression basicGetReferencedExpression() {
		return referencedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedExpression(IBooleanEObjectExpression newReferencedExpression) {
		IBooleanEObjectExpression oldReferencedExpression = referencedExpression;
		referencedExpression = newReferencedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EObjectBooleanExpressionsPackage.NOT_EXPRESSION__REFERENCED_EXPRESSION, oldReferencedExpression, referencedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean evaluate(EObject context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION:
				return basicSetOwnedExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__NAME:
				return getName();
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__DESCRIPTION:
				return getDescription();
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION:
				return getOwnedExpression();
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__REFERENCED_EXPRESSION:
				if (resolve) return getReferencedExpression();
				return basicGetReferencedExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION:
				setOwnedExpression((IBooleanEObjectExpression)newValue);
				return;
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__REFERENCED_EXPRESSION:
				setReferencedExpression((IBooleanEObjectExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION:
				setOwnedExpression((IBooleanEObjectExpression)null);
				return;
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__REFERENCED_EXPRESSION:
				setReferencedExpression((IBooleanEObjectExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__OWNED_EXPRESSION:
				return ownedExpression != null;
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION__REFERENCED_EXPRESSION:
				return referencedExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EObjectBooleanExpressionsPackage.NOT_EXPRESSION___EVALUATE__OBJECT:
				return evaluate((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NotExpressionImpl
