/**
 *   Copyright (c) 2016 CEA LIST and others.
 *   
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *     CEA LIST - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIBox;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIMscColumnCR;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIText;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.IModelElement;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.IPropertyContainer;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UnknownType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CGI Msc Column CR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_pModelObject <em>MpModel Object</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_pParent <em>MpParent</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_transform <em>Mtransform</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_AdditionalLabel <em>MAdditional Label</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_position <em>Mposition</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_pInheritsFrom <em>MpInherits From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_nInheritanceMask <em>MnInheritance Mask</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getM_SubType <em>MSub Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.impl.CGIMscColumnCRImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CGIMscColumnCRImpl extends GraphElementsTypeImpl implements CGIMscColumnCR {
	/**
	 * The cached value of the '{@link #getM_pModelObject() <em>MpModel Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pModelObject()
	 * @generated
	 * @ordered
	 */
	protected IModelElement m_pModelObject;

	/**
	 * The cached value of the '{@link #getM_pParent() <em>MpParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pParent()
	 * @generated
	 * @ordered
	 */
	protected CGIBox m_pParent;

	/**
	 * The cached value of the '{@link #getM_transform() <em>Mtransform</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_transform()
	 * @generated
	 * @ordered
	 */
	protected EList<String> m_transform;

	/**
	 * The cached value of the '{@link #getM_AdditionalLabel() <em>MAdditional Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_AdditionalLabel()
	 * @generated
	 * @ordered
	 */
	protected CGIText m_AdditionalLabel;

	/**
	 * The cached value of the '{@link #getM_position() <em>Mposition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_position()
	 * @generated
	 * @ordered
	 */
	protected EList<String> m_position;

	/**
	 * The cached value of the '{@link #getM_pInheritsFrom() <em>MpInherits From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pInheritsFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<UnknownType> m_pInheritsFrom;

	/**
	 * The default value of the '{@link #getM_nInheritanceMask() <em>MnInheritance Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_nInheritanceMask()
	 * @generated
	 * @ordered
	 */
	protected static final String MNINHERITANCE_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_nInheritanceMask() <em>MnInheritance Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_nInheritanceMask()
	 * @generated
	 * @ordered
	 */
	protected String m_nInheritanceMask = MNINHERITANCE_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_SubType() <em>MSub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_SubType()
	 * @generated
	 * @ordered
	 */
	protected static final String MSUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_SubType() <em>MSub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_SubType()
	 * @generated
	 * @ordered
	 */
	protected String m_SubType = MSUB_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected IPropertyContainer properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CGIMscColumnCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRhapsodyPackage.eINSTANCE.getCGIMscColumnCR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IModelElement getM_pModelObject() {
		if (m_pModelObject != null && m_pModelObject.eIsProxy()) {
			InternalEObject oldM_pModelObject = (InternalEObject)m_pModelObject;
			m_pModelObject = (IModelElement)eResolveProxy(oldM_pModelObject);
			if (m_pModelObject != oldM_pModelObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPMODEL_OBJECT, oldM_pModelObject, m_pModelObject));
			}
		}
		return m_pModelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IModelElement basicGetM_pModelObject() {
		return m_pModelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pModelObject(IModelElement newM_pModelObject) {
		IModelElement oldM_pModelObject = m_pModelObject;
		m_pModelObject = newM_pModelObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPMODEL_OBJECT, oldM_pModelObject, m_pModelObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGIBox getM_pParent() {
		if (m_pParent != null && m_pParent.eIsProxy()) {
			InternalEObject oldM_pParent = (InternalEObject)m_pParent;
			m_pParent = (CGIBox)eResolveProxy(oldM_pParent);
			if (m_pParent != oldM_pParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPPARENT, oldM_pParent, m_pParent));
			}
		}
		return m_pParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGIBox basicGetM_pParent() {
		return m_pParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pParent(CGIBox newM_pParent) {
		CGIBox oldM_pParent = m_pParent;
		m_pParent = newM_pParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPPARENT, oldM_pParent, m_pParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getM_transform() {
		if (m_transform == null) {
			m_transform = new EDataTypeEList<String>(String.class, this, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MTRANSFORM);
		}
		return m_transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGIText getM_AdditionalLabel() {
		if (m_AdditionalLabel != null && m_AdditionalLabel.eIsProxy()) {
			InternalEObject oldM_AdditionalLabel = (InternalEObject)m_AdditionalLabel;
			m_AdditionalLabel = (CGIText)eResolveProxy(oldM_AdditionalLabel);
			if (m_AdditionalLabel != oldM_AdditionalLabel) {
				InternalEObject newM_AdditionalLabel = (InternalEObject)m_AdditionalLabel;
				NotificationChain msgs = oldM_AdditionalLabel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL, null, null);
				if (newM_AdditionalLabel.eInternalContainer() == null) {
					msgs = newM_AdditionalLabel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL, oldM_AdditionalLabel, m_AdditionalLabel));
			}
		}
		return m_AdditionalLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGIText basicGetM_AdditionalLabel() {
		return m_AdditionalLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_AdditionalLabel(CGIText newM_AdditionalLabel, NotificationChain msgs) {
		CGIText oldM_AdditionalLabel = m_AdditionalLabel;
		m_AdditionalLabel = newM_AdditionalLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL, oldM_AdditionalLabel, newM_AdditionalLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_AdditionalLabel(CGIText newM_AdditionalLabel) {
		if (newM_AdditionalLabel != m_AdditionalLabel) {
			NotificationChain msgs = null;
			if (m_AdditionalLabel != null)
				msgs = ((InternalEObject)m_AdditionalLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL, null, msgs);
			if (newM_AdditionalLabel != null)
				msgs = ((InternalEObject)newM_AdditionalLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL, null, msgs);
			msgs = basicSetM_AdditionalLabel(newM_AdditionalLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL, newM_AdditionalLabel, newM_AdditionalLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getM_position() {
		if (m_position == null) {
			m_position = new EDataTypeEList<String>(String.class, this, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPOSITION);
		}
		return m_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnknownType> getM_pInheritsFrom() {
		if (m_pInheritsFrom == null) {
			m_pInheritsFrom = new EObjectResolvingEList<UnknownType>(UnknownType.class, this, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPINHERITS_FROM);
		}
		return m_pInheritsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_nInheritanceMask() {
		return m_nInheritanceMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_nInheritanceMask(String newM_nInheritanceMask) {
		String oldM_nInheritanceMask = m_nInheritanceMask;
		m_nInheritanceMask = newM_nInheritanceMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MNINHERITANCE_MASK, oldM_nInheritanceMask, m_nInheritanceMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_SubType() {
		return m_SubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_SubType(String newM_SubType) {
		String oldM_SubType = m_SubType;
		m_SubType = newM_SubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MSUB_TYPE, oldM_SubType, m_SubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertyContainer getProperties() {
		if (properties != null && properties.eIsProxy()) {
			InternalEObject oldProperties = (InternalEObject)properties;
			properties = (IPropertyContainer)eResolveProxy(oldProperties);
			if (properties != oldProperties) {
				InternalEObject newProperties = (InternalEObject)properties;
				NotificationChain msgs = oldProperties.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES, null, null);
				if (newProperties.eInternalContainer() == null) {
					msgs = newProperties.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES, oldProperties, properties));
			}
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertyContainer basicGetProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(IPropertyContainer newProperties, NotificationChain msgs) {
		IPropertyContainer oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(IPropertyContainer newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL:
				return basicSetM_AdditionalLabel(null, msgs);
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPMODEL_OBJECT:
				if (resolve) return getM_pModelObject();
				return basicGetM_pModelObject();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPPARENT:
				if (resolve) return getM_pParent();
				return basicGetM_pParent();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MTRANSFORM:
				return getM_transform();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL:
				if (resolve) return getM_AdditionalLabel();
				return basicGetM_AdditionalLabel();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPOSITION:
				return getM_position();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPINHERITS_FROM:
				return getM_pInheritsFrom();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MNINHERITANCE_MASK:
				return getM_nInheritanceMask();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MSUB_TYPE:
				return getM_SubType();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES:
				if (resolve) return getProperties();
				return basicGetProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPMODEL_OBJECT:
				setM_pModelObject((IModelElement)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPPARENT:
				setM_pParent((CGIBox)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MTRANSFORM:
				getM_transform().clear();
				getM_transform().addAll((Collection<? extends String>)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL:
				setM_AdditionalLabel((CGIText)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPOSITION:
				getM_position().clear();
				getM_position().addAll((Collection<? extends String>)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPINHERITS_FROM:
				getM_pInheritsFrom().clear();
				getM_pInheritsFrom().addAll((Collection<? extends UnknownType>)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MNINHERITANCE_MASK:
				setM_nInheritanceMask((String)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MSUB_TYPE:
				setM_SubType((String)newValue);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES:
				setProperties((IPropertyContainer)newValue);
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
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPMODEL_OBJECT:
				setM_pModelObject((IModelElement)null);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPPARENT:
				setM_pParent((CGIBox)null);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MTRANSFORM:
				getM_transform().clear();
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL:
				setM_AdditionalLabel((CGIText)null);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPOSITION:
				getM_position().clear();
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPINHERITS_FROM:
				getM_pInheritsFrom().clear();
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MNINHERITANCE_MASK:
				setM_nInheritanceMask(MNINHERITANCE_MASK_EDEFAULT);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MSUB_TYPE:
				setM_SubType(MSUB_TYPE_EDEFAULT);
				return;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES:
				setProperties((IPropertyContainer)null);
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
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPMODEL_OBJECT:
				return m_pModelObject != null;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPPARENT:
				return m_pParent != null;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MTRANSFORM:
				return m_transform != null && !m_transform.isEmpty();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MADDITIONAL_LABEL:
				return m_AdditionalLabel != null;
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPOSITION:
				return m_position != null && !m_position.isEmpty();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MPINHERITS_FROM:
				return m_pInheritsFrom != null && !m_pInheritsFrom.isEmpty();
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MNINHERITANCE_MASK:
				return MNINHERITANCE_MASK_EDEFAULT == null ? m_nInheritanceMask != null : !MNINHERITANCE_MASK_EDEFAULT.equals(m_nInheritanceMask);
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__MSUB_TYPE:
				return MSUB_TYPE_EDEFAULT == null ? m_SubType != null : !MSUB_TYPE_EDEFAULT.equals(m_SubType);
			case UMLRhapsodyPackage.CGI_MSC_COLUMN_CR__PROPERTIES:
				return properties != null;
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
		result.append(" (m_transform: "); //$NON-NLS-1$
		result.append(m_transform);
		result.append(", m_position: "); //$NON-NLS-1$
		result.append(m_position);
		result.append(", m_nInheritanceMask: "); //$NON-NLS-1$
		result.append(m_nInheritanceMask);
		result.append(", m_SubType: "); //$NON-NLS-1$
		result.append(m_SubType);
		result.append(')');
		return result.toString();
	}

} //CGIMscColumnCRImpl
