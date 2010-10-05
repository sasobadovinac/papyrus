/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.papyrus.property.editor.xtext.umlProperty;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.property.editor.xtext.umlProperty.UmlPropertyPackage
 * @generated
 */
public interface UmlPropertyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmlPropertyFactory eINSTANCE = org.eclipse.papyrus.property.editor.xtext.umlProperty.impl.UmlPropertyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Property Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Rule</em>'.
   * @generated
   */
  PropertyRule createPropertyRule();

  /**
   * Returns a new object of class '<em>Type Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Rule</em>'.
   * @generated
   */
  TypeRule createTypeRule();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns a new object of class '<em>Multiplicity Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicity Rule</em>'.
   * @generated
   */
  MultiplicityRule createMultiplicityRule();

  /**
   * Returns a new object of class '<em>Bound Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bound Specification</em>'.
   * @generated
   */
  BoundSpecification createBoundSpecification();

  /**
   * Returns a new object of class '<em>Modifiers Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifiers Rule</em>'.
   * @generated
   */
  ModifiersRule createModifiersRule();

  /**
   * Returns a new object of class '<em>Modifier Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier Specification</em>'.
   * @generated
   */
  ModifierSpecification createModifierSpecification();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UmlPropertyPackage getUmlPropertyPackage();

} //UmlPropertyFactory
