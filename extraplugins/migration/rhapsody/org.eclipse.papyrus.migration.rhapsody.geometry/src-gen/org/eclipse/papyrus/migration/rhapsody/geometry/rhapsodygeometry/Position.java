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
package org.eclipse.papyrus.migration.rhapsody.geometry.rhapsodygeometry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.migration.rhapsody.geometry.rhapsodygeometry.RhpGeometryPackage#getPosition()
 * @model
 * @generated
 */
public enum Position implements Enumerator {
	/**
	 * The '<em><b>NORTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH(0, "NORTH", "NORTH"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH(1, "SOUTH", "SOUTH"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_VALUE
	 * @generated
	 * @ordered
	 */
	EAST(2, "EAST", "EAST"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_VALUE
	 * @generated
	 * @ordered
	 */
	WEST(3, "WEST", "WEST"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_EAST(4, "NORTH_EAST", "NORTH_EAST"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_WEST(5, "NORTH_WEST", "NORTH_WEST"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_EAST(6, "SOUTH_EAST", "SOUTH_EAST"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_WEST(7, "SOUTH_WEST", "SOUTH_WEST"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NORTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_VALUE = 0;

	/**
	 * The '<em><b>SOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_VALUE = 1;

	/**
	 * The '<em><b>EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAST_VALUE = 2;

	/**
	 * The '<em><b>WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEST_VALUE = 3;

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_EAST_VALUE = 4;

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_WEST_VALUE = 5;

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_EAST_VALUE = 6;

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_WEST_VALUE = 7;

	/**
	 * An array of all the '<em><b>Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Position[] VALUES_ARRAY =
		new Position[] {
			NORTH,
			SOUTH,
			EAST,
			WEST,
			NORTH_EAST,
			NORTH_WEST,
			SOUTH_EAST,
			SOUTH_WEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Position> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Position result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Position result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position get(int value) {
		switch (value) {
			case NORTH_VALUE: return NORTH;
			case SOUTH_VALUE: return SOUTH;
			case EAST_VALUE: return EAST;
			case WEST_VALUE: return WEST;
			case NORTH_EAST_VALUE: return NORTH_EAST;
			case NORTH_WEST_VALUE: return NORTH_WEST;
			case SOUTH_EAST_VALUE: return SOUTH_EAST;
			case SOUTH_WEST_VALUE: return SOUTH_WEST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Position(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Position
