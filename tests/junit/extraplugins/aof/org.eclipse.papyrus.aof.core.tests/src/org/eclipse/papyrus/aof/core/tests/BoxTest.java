/*******************************************************************************
 *  Copyright (c) 2015 ESEO, Christian W. Damus, and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     Olivier Beaudoux - initial API and implementation
 *     Christian W. Damus - bug 476683
 *******************************************************************************/
package org.eclipse.papyrus.aof.core.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.eclipse.papyrus.aof.core.IBox;
import org.eclipse.papyrus.aof.core.IConstraints;
import org.eclipse.papyrus.aof.core.IOne;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoxTest extends BaseTest {

	// Equality by reference testing (Object.equals)

	@Test
	public void testEqualityByReferenceForSeq() {
		testEqualityByReference(IConstraints.SEQUENCE);
	}

	@Test
	public void testEqualityByReferenceForBag() {
		testEqualityByReference(IConstraints.BAG);
	}

	@Test
	public void testEqualityByReferenceForSet() {
		testEqualityByReference(IConstraints.SET);
	}

	@Test
	public void testEqualityByReferenceForOSet() {
		testEqualityByReference(IConstraints.ORDERED_SET);
	}

	@Test
	public void testEqualityByReferenceForOpt() {
		testEqualityByReference(IConstraints.OPTION);
	}

	@Test
	public void testEqualityByReferenceForOne() {
		testEqualityByReference(IConstraints.ONE);
	}

	public void testEqualityByReference(IConstraints constraints) {
		IBox<Integer> a = factory.createBox(constraints, 1, 2, 3);
		assertTrue(a.equals(a));
	}

	@Test
	public void testInequalityByReferenceForSeq() {
		testInequalityByReference(IConstraints.SEQUENCE);
	}

	@Test
	public void testInequalityByReferenceForBag() {
		testInequalityByReference(IConstraints.BAG);
	}

	@Test
	public void testInequalityByReferenceForSet() {
		testInequalityByReference(IConstraints.SET);
	}

	@Test
	public void testInequalityByReferenceForOSet() {
		testInequalityByReference(IConstraints.ORDERED_SET);
	}

	@Test
	public void testInequalityByReferenceForOpt() {
		testInequalityByReference(IConstraints.OPTION);
	}

	@Test
	public void testInequalityByReferenceForOne() {
		testInequalityByReference(IConstraints.ONE);
	}

	public void testInequalityByReference(IConstraints constraints) {
		IBox<Integer> a = factory.createBox(constraints, 1, 2, 3);
		IBox<Integer> b = factory.createBox(constraints, 1, 2, 3);
		assertFalse(a.equals(b));
	}

	// Equality by value testing (IBox.sameAs)

	@Test
	public void testEqualityByValueForSeq() {
		testEqualityByValue(IConstraints.SEQUENCE);
	}

	@Test
	public void testEqualityByValueForBag() {
		testEqualityByValue(IConstraints.BAG);
	}

	@Test
	public void testEqualityByValueForSet() {
		testEqualityByValue(IConstraints.SET);
	}

	@Test
	public void testEqualityByValueForOSet() {
		testEqualityByValue(IConstraints.ORDERED_SET);
	}

	@Test
	public void testEqualityByValueForOpt() {
		testEqualityByValue(IConstraints.OPTION);
	}

	@Test
	public void testEqualityByValueForOne() {
		testEqualityByValue(IConstraints.ONE);
	}

	public void testEqualityByValue(IConstraints constraints) {
		IBox<Integer> a = factory.createBox(constraints, 1, 2, 3);
		IBox<Integer> b;
		if (constraints.isOrdered()) {
			b = factory.createBox(constraints, 1, 2, 3);
		} else {
			b = factory.createBox(constraints, 3, 2, 1);
		}
		assertTrue(a.sameAs(b));
	}

	@Test
	public void testInequalityByValueForSeq() {
		testInequalityByValue(IConstraints.SEQUENCE);
	}

	@Test
	public void testInequalityByValueForBag() {
		testInequalityByValue(IConstraints.BAG);
	}

	@Test
	public void testInequalityByValueForSet() {
		testInequalityByValue(IConstraints.SET);
	}

	@Test
	public void testInequalityByValueForOSet() {
		testInequalityByValue(IConstraints.ORDERED_SET);
	}

	@Test
	public void testInequalityByValueForOpt() {
		testInequalityByValue(IConstraints.OPTION);
	}

	@Test
	public void testInequalityByValueForOne() {
		testInequalityByValue(IConstraints.ONE);
	}

	public void testInequalityByValue(IConstraints constraints) {
		IBox<Integer> a = factory.createBox(constraints, 1, 2, 3);
		IBox<Integer> b;
		if (constraints.isOrdered()) {
			b = factory.createBox(constraints, 3, 2, 1);
		} else {
			b = factory.createBox(constraints, 3, 2, 1, 4);
		}
		assertFalse(a.sameAs(b));
	}

	// Equality on box type (IBox.sameAs)

	@Test
	public void testEqualityOnBoxTypeForSeqSeq() {
		testEqualityOnBoxType(IConstraints.SEQUENCE, IConstraints.SEQUENCE);
	}

	@Test
	public void testEqualityOnBoxTypeForOneOne() {
		testEqualityOnBoxType(IConstraints.ONE, IConstraints.ONE);
	}

	@Test
	public void testEqualityOnBoxTypeForSeqSet() {
		testEqualityOnBoxType(IConstraints.SEQUENCE, IConstraints.SET);
	}

	@Test
	public void testEqualityOnBoxTypeForOSetBag() {
		testEqualityOnBoxType(IConstraints.ORDERED_SET, IConstraints.BAG);
	}

	@Test
	public void testEqualityOnBoxTypeForOptOne() {
		testEqualityOnBoxType(IConstraints.OPTION, IConstraints.ONE);
	}

	public void testEqualityOnBoxType(IConstraints leftType, IConstraints rightType) {
		IBox<Integer> leftBox = factory.createBox(leftType, 1, 2, 3);
		IBox<Integer> rightBox = factory.createBox(rightType, 1, 2, 3);
		assertEquals(leftType.matches(rightType), leftBox.sameAs(rightBox));
	}

	// Assignment (iterable and var args)

	@Test
	public void testAssignFromSeqToSeq() {
		testAssignFromBoxToBox(IConstraints.SEQUENCE, IConstraints.SEQUENCE);
	}

	@Test
	public void testAssignFromOneToOne() {
		testAssignFromBoxToBox(IConstraints.ONE, IConstraints.ONE);
	}

	@Test
	public void testAssignFromSeqToSet() {
		testAssignFromBoxToBox(IConstraints.SET, IConstraints.SEQUENCE);
	}

	@Test
	public void testAssignFromOSetToBag() {
		testAssignFromBoxToBox(IConstraints.BAG, IConstraints.ORDERED_SET);
	}

	@Test
	public void testAssignFromOptToOne() {
		testAssignFromBoxToBox(IConstraints.ONE, IConstraints.OPTION);
	}

	public void testAssignFromBoxToBox(IConstraints leftType, IConstraints rightType) {
		IBox<Integer> rightBox = factory.createBox(rightType, 1, 2, 2, 3, 3, 3, 4);
		IBox<Integer> leftBox = factory.createBox(leftType, 1, 1, 2, 3);
		leftBox.assign(rightBox);
		if (leftBox.isUnique() || rightBox.isUnique()) {
			if (leftBox.isSingleton() || rightBox.isSingleton()) {
				assertEquals(Arrays.asList(4), leftBox);
			} else {
				assertEquals(Arrays.asList(1, 2, 3, 4), leftBox);
			}
		} else {
			assertEquals(Arrays.asList(1, 2, 2, 3, 3, 3, 4), leftBox);
		}
	}

	@Test
	public void testAssignFromArrayToSeq() {
		testAssignFromArrayToBox(IConstraints.SEQUENCE);
	}

	@Test
	public void testAssignFromArrayToBag() {
		testAssignFromArrayToBox(IConstraints.BAG);
	}

	@Test
	public void testAssignFromArrayToOSet() {
		testAssignFromArrayToBox(IConstraints.ORDERED_SET);
	}

	@Test
	public void testAssignFromArrayToSet() {
		testAssignFromArrayToBox(IConstraints.SET);
	}

	@Test
	public void testAssignFromArrayToOpt() {
		testAssignFromArrayToBox(IConstraints.OPTION);
	}

	@Test
	public void testAssignFromArrayToOne() {
		testAssignFromArrayToBox(IConstraints.ONE);
	}

	public void testAssignFromArrayToBox(IConstraints boxType) {
		IBox<Integer> box = factory.createBox(boxType, 1, 1, 2, 3);
		box.assign(1, 2, 2, 3, 3, 3, 4);
		if (boxType.isUnique()) {
			if (boxType.isSingleton()) {
				assertEquals(Arrays.asList(4), box);
			} else {
				assertEquals(Arrays.asList(1, 2, 3, 4), box);
			}
		} else {
			assertEquals(Arrays.asList(1, 2, 2, 3, 3, 3, 4), box);
		}
	}

	// Assign from empty box + empty array

	@Test
	public void testAssignFromEmptyToSeq() {
		testAssignFromEmptyBoxToBox(IConstraints.SEQUENCE);
		testAssignFromEmptyArrayToBox(IConstraints.SEQUENCE);
	}

	@Test
	public void testAssignFromEmptyToBag() {
		testAssignFromEmptyBoxToBox(IConstraints.BAG);
		testAssignFromEmptyArrayToBox(IConstraints.BAG);
	}

	@Test
	public void testAssignFromEmptyToOSet() {
		testAssignFromEmptyBoxToBox(IConstraints.ORDERED_SET);
		testAssignFromEmptyArrayToBox(IConstraints.ORDERED_SET);
	}

	@Test
	public void testAssignFromEmptyToSet() {
		testAssignFromEmptyBoxToBox(IConstraints.SET);
		testAssignFromEmptyArrayToBox(IConstraints.SET);
	}

	@Test
	public void testAssignFromEmptyToOpt() {
		testAssignFromEmptyBoxToBox(IConstraints.OPTION);
		testAssignFromEmptyArrayToBox(IConstraints.OPTION);
	}

	@Test
	public void testAssignFromEmptyToOne() {
		testAssignFromEmptyBoxToBox(IConstraints.ONE);
		testAssignFromEmptyArrayToBox(IConstraints.ONE);
	}

	public void testAssignFromEmptyArrayToBox(IConstraints boxType) {
		IBox<Integer> box = factory.createBox(boxType, 1, 1, 2, 3);
		box.assign();
		assertEquals(box.isOptional() ? 0 : 1, box.length());
	}

	public void testAssignFromEmptyBoxToBox(IConstraints boxType) {
		IBox<Integer> box = factory.createBox(boxType, 1, 1, 2, 3);
		IBox<Integer> emptyBox = factory.createSet();
		box.assign(emptyBox);
		assertEquals(box.isOptional() ? 0 : 1, box.length());
	}

	// Assign null iterable

	@Test
	public void testAssignFromNullIterableToSeq() {
		testAssignFromNullIterableToBox(IConstraints.SEQUENCE);
	}

	@Test
	public void testAssignFromNullIterableToBag() {
		testAssignFromNullIterableToBox(IConstraints.BAG);
	}

	@Test
	public void testAssignFromNullIterableToOSet() {
		testAssignFromNullIterableToBox(IConstraints.ORDERED_SET);
	}

	@Test
	public void testAssignFromNullIterableToSet() {
		testAssignFromNullIterableToBox(IConstraints.SET);
	}

	@Test
	public void testAssignFromNullIterableToOpt() {
		testAssignFromNullIterableToBox(IConstraints.OPTION);
	}

	@Test
	public void testAssignFromNullIterableToOne() {
		testAssignFromNullIterableToBox(IConstraints.ONE);
	}

	public void testAssignFromNullIterableToBox(IConstraints boxType) {
		thrown.expect(IllegalArgumentException.class);
		IBox<Integer> box = factory.createBox(boxType, 1, 1, 2, 3);
		box.assign((Iterable<Integer>) null);
	}

	// Assign null element

	@Test
	public void testAssignNullElementToSeq() {
		testAssignNullElementToBox(IConstraints.SEQUENCE);
	}

	@Test
	public void testAssignNullElementToBag() {
		testAssignNullElementToBox(IConstraints.BAG);
	}

	@Test
	public void testAssignNullElementToOSet() {
		testAssignNullElementToBox(IConstraints.ORDERED_SET);
	}

	@Test
	public void testAssignNullElementToSet() {
		testAssignNullElementToBox(IConstraints.SET);
	}

	@Test
	public void testAssignNullElementToOpt() {
		testAssignNullElementToBox(IConstraints.OPTION);
	}

	@Test
	public void testAssignNullElementToOne() {
		testAssignNullElementToBox(IConstraints.ONE);
	}

	public void testAssignNullElementToBox(IConstraints boxType) {
		IBox<Integer> box = factory.createBox(boxType, 1, 1, 2, 3);
		box.assign((Integer) null);
		assertEquals(Arrays.asList((Integer) null), box);
	}

	// Snapshot

	@Test
	public void testCreateForSnapshotOnSeq() {
		testCreateForSnapshot(IConstraints.SEQUENCE);
	}

	@Test
	public void testCreateForSnapshotOnBag() {
		testCreateForSnapshot(IConstraints.BAG);
	}

	@Test
	public void testCreateForSnapshotOnOSet() {
		testCreateForSnapshot(IConstraints.ORDERED_SET);
	}

	@Test
	public void testCreateForSnapshotOnSet() {
		testCreateForSnapshot(IConstraints.SET);
	}

	@Test
	public void testCreateForSnapshotOnOpt() {
		testCreateForSnapshot(IConstraints.OPTION);
	}

	@Test
	public void testCreateForSnapshotOnOne() {
		testCreateForSnapshot(IConstraints.ONE);
	}

	public void testCreateForSnapshot(IConstraints boxType) {
		IBox<Integer> a = factory.createBox(boxType, 1, 2, 2, 3, 3, 3, 4);
		IBox<Integer> b = a.snapshot();
		assertEquals(a, b);
	}

	@Test
	public void testChangeForSnapshotOnSeq() {
		testCreateForSnapshot(IConstraints.SEQUENCE);
	}

	@Test
	public void testChangeForSnapshotOnBag() {
		testChangeForSnapshot(IConstraints.BAG);
	}

	@Test
	public void testChangeForSnapshotOnOSet() {
		testChangeForSnapshot(IConstraints.ORDERED_SET);
	}

	@Test
	public void testChangeForSnapshotOnSet() {
		testChangeForSnapshot(IConstraints.SET);
	}

	@Test
	public void testChangeForSnapshotOnOpt() {
		testChangeForSnapshot(IConstraints.OPTION);
	}

	@Test
	public void testChangeForSnapshotOnOne() {
		testChangeForSnapshot(IConstraints.ONE);
	}

	public void testChangeForSnapshot(IConstraints boxType) {
		IBox<Integer> a = factory.createBox(boxType, 1, 2, 2, 3, 3, 3, 4);
		IBox<Integer> b = a.snapshot();
		a.add(5);
		assertNotEquals(a, b);
	}

	//
	// Select-type tests
	//


	@Test
	public void testSelectTypeFromSeq() {
		testSelectTypeFromBox(IConstraints.SEQUENCE);
	}

	@Test
	public void testSelectTypeFromBag() {
		testSelectTypeFromBox(IConstraints.BAG);
	}

	@Test
	public void testSelectTypeFromOSet() {
		testSelectTypeFromBox(IConstraints.ORDERED_SET);
	}

	@Test
	public void testSelectTypeFromSet() {
		testSelectTypeFromBox(IConstraints.SET);
	}

	@Test
	public void testSelectTypeFromOpt() {
		testSelectTypeFromBox(IConstraints.OPTION);
	}

	@Test
	public void testSelectTypeFromOne() {
		testSelectTypeFromBox(IConstraints.ONE);
	}

	void testSelectTypeFromBox(IConstraints boxType) {
		// An absolutely non-comparable number, because its value fluctuates
		// randomly
		class RandomNumber extends Number {
			private static final long serialVersionUID = 1L;

			private Random random = new Random(42L);

			@Override
			public int intValue() {
				return random.nextInt();
			}

			@Override
			public long longValue() {
				return random.nextLong();
			}

			@Override
			public float floatValue() {
				return random.nextFloat();
			}

			@Override
			public double doubleValue() {
				return random.nextDouble();
			}
		}

		IBox<Number> box = factory.createBox(boxType, 1, new RandomNumber(), 1, 2, new RandomNumber(), 3, 3);

		// The Comparable type is unrelated to Number
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Iterable<IBox<Comparable<?>>> boxesOfComparables = (Iterable) Arrays.asList( //
				box.select(Comparable.class), //
				box.select(factory.getMetaClass(Comparable.class)));

		for (IBox<Comparable<?>> nextBox : boxesOfComparables) {
			if (boxType.isUnique()) {
				if (boxType.isSingleton()) {
					assertEquals(Arrays.asList(3), nextBox);
				} else {
					assertEquals(Arrays.asList(1, 2, 3), nextBox);
				}
			} else {
				assertEquals(Arrays.asList(1, 1, 2, 3, 3), nextBox);
			}
		}
	}

	//
	// Additional tests
	//

	@Test
	public void testDefaultOne() {
		IOne<Integer> a = factory.createOne(42);

		assertThat(a.get(), is(42));
		assertThat(a.isDefault(), is(true));

		a.set(17);
		assertThat(a.get(), is(17));
		assertThat(a.isDefault(), is(false));

		a.set(42);
		assertThat(a.get(), is(a.getDefaultElement()));
		assertThat(a.isDefault(), is(false)); // Coincidental set

		a.clear();
		assertThat(a.get(), is(a.getDefaultElement()));
		assertThat(a.isDefault(), is(true));
	}

	@Test
	public void testAssignDefaultOneToDifferentDefault() {
		IOne<Integer> a = factory.createOne(42);
		IOne<Integer> b = factory.createOne(17);

		assertThat(a.isDefault(), is(true));
		assertThat(b.isDefault(), is(true));

		b.set(3);
		assertThat(b.isDefault(), is(false));
		assertThat(b.get(), is(3));

		b.assign(a);
		assertThat(b.get(), is(42)); // Assignment must set the requested value
		assertThat(b.isDefault(), is(false));
	}

	@Test
	public void testAssignDefaultOneToSameDefault() {
		IOne<Integer> a = factory.createOne(42);
		IOne<Integer> b = factory.createOne(42);

		assertThat(a.isDefault(), is(true));
		assertThat(b.isDefault(), is(true));

		b.set(3);
		assertThat(b.isDefault(), is(false));
		assertThat(b.get(), is(3));

		b.assign(a);
		assertThat(b.get(), is(42));
		assertThat(b.isDefault(), is(false)); // Unset state does not propagate
	}

}