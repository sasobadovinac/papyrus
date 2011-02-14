/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.papyrus.properties.ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.properties.contexts.Property;

import org.eclipse.papyrus.properties.contexts.UnknownProperty;
import org.eclipse.papyrus.properties.environment.PropertyEditorType;

import org.eclipse.papyrus.properties.ui.PropertyEditor;
import org.eclipse.papyrus.properties.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.properties.ui.impl.PropertyEditorImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.papyrus.properties.ui.impl.PropertyEditorImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.papyrus.properties.ui.impl.PropertyEditorImpl#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.properties.ui.impl.PropertyEditorImpl#getUnresolvedProperty <em>Unresolved Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyEditorImpl extends WidgetImpl implements PropertyEditor {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgetType() <em>Widget Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected PropertyEditorType widgetType;

	/**
	 * The cached value of the '{@link #getUnresolvedProperty() <em>Unresolved Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnresolvedProperty()
	 * @generated
	 * @ordered
	 */
	protected UnknownProperty unresolvedProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.PROPERTY_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.PROPERTY_EDITOR__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.PROPERTY_EDITOR__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.PROPERTY_EDITOR__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEditorType getWidgetType() {
		if (widgetType != null && widgetType.eIsProxy()) {
			InternalEObject oldWidgetType = (InternalEObject)widgetType;
			widgetType = (PropertyEditorType)eResolveProxy(oldWidgetType);
			if (widgetType != oldWidgetType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.PROPERTY_EDITOR__WIDGET_TYPE, oldWidgetType, widgetType));
			}
		}
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEditorType basicGetWidgetType() {
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetType(PropertyEditorType newWidgetType) {
		PropertyEditorType oldWidgetType = widgetType;
		widgetType = newWidgetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.PROPERTY_EDITOR__WIDGET_TYPE, oldWidgetType, widgetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownProperty getUnresolvedProperty() {
		return unresolvedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnresolvedProperty(UnknownProperty newUnresolvedProperty, NotificationChain msgs) {
		UnknownProperty oldUnresolvedProperty = unresolvedProperty;
		unresolvedProperty = newUnresolvedProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY, oldUnresolvedProperty, newUnresolvedProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnresolvedProperty(UnknownProperty newUnresolvedProperty) {
		if (newUnresolvedProperty != unresolvedProperty) {
			NotificationChain msgs = null;
			if (unresolvedProperty != null)
				msgs = ((InternalEObject)unresolvedProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY, null, msgs);
			if (newUnresolvedProperty != null)
				msgs = ((InternalEObject)newUnresolvedProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY, null, msgs);
			msgs = basicSetUnresolvedProperty(newUnresolvedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY, newUnresolvedProperty, newUnresolvedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY:
				return basicSetUnresolvedProperty(null, msgs);
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
			case UiPackage.PROPERTY_EDITOR__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case UiPackage.PROPERTY_EDITOR__READ_ONLY:
				return isReadOnly();
			case UiPackage.PROPERTY_EDITOR__WIDGET_TYPE:
				if (resolve) return getWidgetType();
				return basicGetWidgetType();
			case UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY:
				return getUnresolvedProperty();
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
			case UiPackage.PROPERTY_EDITOR__PROPERTY:
				setProperty((Property)newValue);
				return;
			case UiPackage.PROPERTY_EDITOR__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case UiPackage.PROPERTY_EDITOR__WIDGET_TYPE:
				setWidgetType((PropertyEditorType)newValue);
				return;
			case UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY:
				setUnresolvedProperty((UnknownProperty)newValue);
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
			case UiPackage.PROPERTY_EDITOR__PROPERTY:
				setProperty((Property)null);
				return;
			case UiPackage.PROPERTY_EDITOR__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case UiPackage.PROPERTY_EDITOR__WIDGET_TYPE:
				setWidgetType((PropertyEditorType)null);
				return;
			case UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY:
				setUnresolvedProperty((UnknownProperty)null);
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
			case UiPackage.PROPERTY_EDITOR__PROPERTY:
				return property != null;
			case UiPackage.PROPERTY_EDITOR__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case UiPackage.PROPERTY_EDITOR__WIDGET_TYPE:
				return widgetType != null;
			case UiPackage.PROPERTY_EDITOR__UNRESOLVED_PROPERTY:
				return unresolvedProperty != null;
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
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //PropertyEditorImpl
