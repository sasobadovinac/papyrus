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
package org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CGI Object Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pModelObject <em>MpModel Object</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pParent <em>MpParent</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pSource <em>MpSource</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_sourceType <em>Msource Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pTarget <em>MpTarget</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_targetType <em>Mtarget Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_direction <em>Mdirection</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_rpn <em>Mrpn</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_arrow <em>Marrow</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_anglePoint1 <em>Mangle Point1</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_anglePoint2 <em>Mangle Point2</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_line_style <em>Mline style</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_SourcePort <em>MSource Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_TargetPort <em>MTarget Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowSourceMultiplicity <em>MbShow Source Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowSourceRole <em>MbShow Source Role</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowTargetMultiplicity <em>MbShow Target Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowTargetRole <em>MbShow Target Role</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowLinkName <em>MbShow Link Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_sourceRole <em>Msource Role</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_targetRole <em>Mtarget Role</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_sourceMultiplicity <em>Msource Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_targetMultiplicity <em>Mtarget Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink()
 * @model
 * @generated
 */
public interface CGIObjectLink extends GraphElementsType {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(IPropertyContainer)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_Properties()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	IPropertyContainer getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(IPropertyContainer value);

	/**
	 * Returns the value of the '<em><b>MpModel Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MpModel Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MpModel Object</em>' reference.
	 * @see #setM_pModelObject(M_pModelObjectType)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_pModelObject()
	 * @model
	 * @generated
	 */
	M_pModelObjectType getM_pModelObject();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pModelObject <em>MpModel Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MpModel Object</em>' reference.
	 * @see #getM_pModelObject()
	 * @generated
	 */
	void setM_pModelObject(M_pModelObjectType value);

	/**
	 * Returns the value of the '<em><b>MpParent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MpParent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MpParent</em>' attribute.
	 * @see #setM_pParent(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_pParent()
	 * @model
	 * @generated
	 */
	String getM_pParent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pParent <em>MpParent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MpParent</em>' attribute.
	 * @see #getM_pParent()
	 * @generated
	 */
	void setM_pParent(String value);

	/**
	 * Returns the value of the '<em><b>MpSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MpSource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MpSource</em>' reference.
	 * @see #setM_pSource(M_pRootType)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_pSource()
	 * @model
	 * @generated
	 */
	M_pRootType getM_pSource();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pSource <em>MpSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MpSource</em>' reference.
	 * @see #getM_pSource()
	 * @generated
	 */
	void setM_pSource(M_pRootType value);

	/**
	 * Returns the value of the '<em><b>Msource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msource Type</em>' attribute.
	 * @see #setM_sourceType(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_sourceType()
	 * @model
	 * @generated
	 */
	String getM_sourceType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_sourceType <em>Msource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msource Type</em>' attribute.
	 * @see #getM_sourceType()
	 * @generated
	 */
	void setM_sourceType(String value);

	/**
	 * Returns the value of the '<em><b>MpTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MpTarget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MpTarget</em>' reference.
	 * @see #setM_pTarget(M_pRootType)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_pTarget()
	 * @model
	 * @generated
	 */
	M_pRootType getM_pTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_pTarget <em>MpTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MpTarget</em>' reference.
	 * @see #getM_pTarget()
	 * @generated
	 */
	void setM_pTarget(M_pRootType value);

	/**
	 * Returns the value of the '<em><b>Mtarget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtarget Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtarget Type</em>' attribute.
	 * @see #setM_targetType(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_targetType()
	 * @model
	 * @generated
	 */
	String getM_targetType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_targetType <em>Mtarget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtarget Type</em>' attribute.
	 * @see #getM_targetType()
	 * @generated
	 */
	void setM_targetType(String value);

	/**
	 * Returns the value of the '<em><b>Mdirection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mdirection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdirection</em>' attribute.
	 * @see #setM_direction(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_direction()
	 * @model
	 * @generated
	 */
	String getM_direction();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_direction <em>Mdirection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdirection</em>' attribute.
	 * @see #getM_direction()
	 * @generated
	 */
	void setM_direction(String value);

	/**
	 * Returns the value of the '<em><b>Mrpn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mrpn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mrpn</em>' containment reference.
	 * @see #setM_rpn(CGIText)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_rpn()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	CGIText getM_rpn();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_rpn <em>Mrpn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mrpn</em>' containment reference.
	 * @see #getM_rpn()
	 * @generated
	 */
	void setM_rpn(CGIText value);

	/**
	 * Returns the value of the '<em><b>Marrow</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marrow</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marrow</em>' attribute list.
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_arrow()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getM_arrow();

	/**
	 * Returns the value of the '<em><b>Mangle Point1</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mangle Point1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mangle Point1</em>' attribute list.
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_anglePoint1()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getM_anglePoint1();

	/**
	 * Returns the value of the '<em><b>Mangle Point2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mangle Point2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mangle Point2</em>' attribute list.
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_anglePoint2()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getM_anglePoint2();

	/**
	 * Returns the value of the '<em><b>Mline style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mline style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mline style</em>' attribute.
	 * @see #setM_line_style(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_line_style()
	 * @model
	 * @generated
	 */
	String getM_line_style();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_line_style <em>Mline style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mline style</em>' attribute.
	 * @see #getM_line_style()
	 * @generated
	 */
	void setM_line_style(String value);

	/**
	 * Returns the value of the '<em><b>MSource Port</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSource Port</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSource Port</em>' attribute list.
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_SourcePort()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getM_SourcePort();

	/**
	 * Returns the value of the '<em><b>MTarget Port</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTarget Port</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTarget Port</em>' attribute list.
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_TargetPort()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getM_TargetPort();

	/**
	 * Returns the value of the '<em><b>MbShow Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MbShow Source Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MbShow Source Multiplicity</em>' attribute.
	 * @see #setM_bShowSourceMultiplicity(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_bShowSourceMultiplicity()
	 * @model
	 * @generated
	 */
	String getM_bShowSourceMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowSourceMultiplicity <em>MbShow Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbShow Source Multiplicity</em>' attribute.
	 * @see #getM_bShowSourceMultiplicity()
	 * @generated
	 */
	void setM_bShowSourceMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>MbShow Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MbShow Source Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MbShow Source Role</em>' attribute.
	 * @see #setM_bShowSourceRole(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_bShowSourceRole()
	 * @model
	 * @generated
	 */
	String getM_bShowSourceRole();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowSourceRole <em>MbShow Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbShow Source Role</em>' attribute.
	 * @see #getM_bShowSourceRole()
	 * @generated
	 */
	void setM_bShowSourceRole(String value);

	/**
	 * Returns the value of the '<em><b>MbShow Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MbShow Target Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MbShow Target Multiplicity</em>' attribute.
	 * @see #setM_bShowTargetMultiplicity(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_bShowTargetMultiplicity()
	 * @model
	 * @generated
	 */
	String getM_bShowTargetMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowTargetMultiplicity <em>MbShow Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbShow Target Multiplicity</em>' attribute.
	 * @see #getM_bShowTargetMultiplicity()
	 * @generated
	 */
	void setM_bShowTargetMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>MbShow Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MbShow Target Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MbShow Target Role</em>' attribute.
	 * @see #setM_bShowTargetRole(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_bShowTargetRole()
	 * @model
	 * @generated
	 */
	String getM_bShowTargetRole();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowTargetRole <em>MbShow Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbShow Target Role</em>' attribute.
	 * @see #getM_bShowTargetRole()
	 * @generated
	 */
	void setM_bShowTargetRole(String value);

	/**
	 * Returns the value of the '<em><b>MbShow Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MbShow Link Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MbShow Link Name</em>' attribute.
	 * @see #setM_bShowLinkName(String)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_bShowLinkName()
	 * @model
	 * @generated
	 */
	String getM_bShowLinkName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_bShowLinkName <em>MbShow Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbShow Link Name</em>' attribute.
	 * @see #getM_bShowLinkName()
	 * @generated
	 */
	void setM_bShowLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Msource Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msource Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msource Role</em>' containment reference.
	 * @see #setM_sourceRole(CGIText)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_sourceRole()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	CGIText getM_sourceRole();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_sourceRole <em>Msource Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msource Role</em>' containment reference.
	 * @see #getM_sourceRole()
	 * @generated
	 */
	void setM_sourceRole(CGIText value);

	/**
	 * Returns the value of the '<em><b>Mtarget Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtarget Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtarget Role</em>' containment reference.
	 * @see #setM_targetRole(CGIText)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_targetRole()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	CGIText getM_targetRole();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_targetRole <em>Mtarget Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtarget Role</em>' containment reference.
	 * @see #getM_targetRole()
	 * @generated
	 */
	void setM_targetRole(CGIText value);

	/**
	 * Returns the value of the '<em><b>Msource Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msource Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msource Multiplicity</em>' containment reference.
	 * @see #setM_sourceMultiplicity(CGIText)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_sourceMultiplicity()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	CGIText getM_sourceMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_sourceMultiplicity <em>Msource Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msource Multiplicity</em>' containment reference.
	 * @see #getM_sourceMultiplicity()
	 * @generated
	 */
	void setM_sourceMultiplicity(CGIText value);

	/**
	 * Returns the value of the '<em><b>Mtarget Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtarget Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtarget Multiplicity</em>' containment reference.
	 * @see #setM_targetMultiplicity(CGIText)
	 * @see org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage#getCGIObjectLink_M_targetMultiplicity()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	CGIText getM_targetMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.CGIObjectLink#getM_targetMultiplicity <em>Mtarget Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtarget Multiplicity</em>' containment reference.
	 * @see #getM_targetMultiplicity()
	 * @generated
	 */
	void setM_targetMultiplicity(CGIText value);

} // CGIObjectLink
