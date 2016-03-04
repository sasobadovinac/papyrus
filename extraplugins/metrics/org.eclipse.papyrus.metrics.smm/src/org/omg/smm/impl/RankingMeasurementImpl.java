/**
 * Copyright (c) 2016 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   CEA LIST - Initial API and implementation
 * 
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.smm.Operation;
import org.omg.smm.RankingMeasurement;
import org.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.RankingMeasurementImpl#getBaseQuery <em>Base Query</em>}</li>
 *   <li>{@link org.omg.smm.impl.RankingMeasurementImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RankingMeasurementImpl extends DimensionalMeasurementImpl implements RankingMeasurement {
	/**
	 * The cached value of the '{@link #getBaseQuery() <em>Base Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQuery()
	 * @generated
	 * @ordered
	 */
	protected Operation baseQuery;

	/**
	 * The default value of the '{@link #isIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseSupplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BASE_SUPPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseSupplied()
	 * @generated
	 * @ordered
	 */
	protected boolean isBaseSupplied = IS_BASE_SUPPLIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RankingMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.RANKING_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBaseQuery() {
		if (baseQuery != null && baseQuery.eIsProxy()) {
			InternalEObject oldBaseQuery = (InternalEObject)baseQuery;
			baseQuery = (Operation)eResolveProxy(oldBaseQuery);
			if (baseQuery != oldBaseQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.RANKING_MEASUREMENT__BASE_QUERY, oldBaseQuery, baseQuery));
			}
		}
		return baseQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBaseQuery() {
		return baseQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseQuery(Operation newBaseQuery) {
		Operation oldBaseQuery = baseQuery;
		baseQuery = newBaseQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_MEASUREMENT__BASE_QUERY, oldBaseQuery, baseQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBaseSupplied() {
		return isBaseSupplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBaseSupplied(boolean newIsBaseSupplied) {
		boolean oldIsBaseSupplied = isBaseSupplied;
		isBaseSupplied = newIsBaseSupplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.RANKING_MEASUREMENT__BASE_QUERY:
				if (resolve) return getBaseQuery();
				return basicGetBaseQuery();
			case SmmPackage.RANKING_MEASUREMENT__IS_BASE_SUPPLIED:
				return isIsBaseSupplied();
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
			case SmmPackage.RANKING_MEASUREMENT__BASE_QUERY:
				setBaseQuery((Operation)newValue);
				return;
			case SmmPackage.RANKING_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied((Boolean)newValue);
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
			case SmmPackage.RANKING_MEASUREMENT__BASE_QUERY:
				setBaseQuery((Operation)null);
				return;
			case SmmPackage.RANKING_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied(IS_BASE_SUPPLIED_EDEFAULT);
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
			case SmmPackage.RANKING_MEASUREMENT__BASE_QUERY:
				return baseQuery != null;
			case SmmPackage.RANKING_MEASUREMENT__IS_BASE_SUPPLIED:
				return isBaseSupplied != IS_BASE_SUPPLIED_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isBaseSupplied: ");
		result.append(isBaseSupplied);
		result.append(')');
		return result.toString();
	}

} //RankingMeasurementImpl
