package com.capgemini.collection.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Car;

public class CarTest {
	private static Car maruti;
	private static Car tata;
	private static Car hyundai;

	@BeforeClass
	public static void setUp() {
		maruti = new Car("India", "maruti 800", 2004, 325000);
		tata = new Car("China", "Alto 800", 2002, 240000);
		hyundai = new Car("England", "Grand i10", 2016, 658000);
	}

	@Test
	public void testToCheckListIsPrintedInInsertionOrder() {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(maruti);
		cars.add(tata);
		cars.add(hyundai);
		Iterator<Car> iterator = cars.iterator();
		assertEquals(maruti, iterator.next());
		assertEquals(tata, iterator.next());
		assertEquals(hyundai, iterator.next());

	}

	@Test
	public void testToCheckListHasNoDuplicates() {
		HashSet<Car> cars = new HashSet<>();
		cars.add(maruti);
		cars.add(tata);
		cars.add(hyundai);
		cars.add(tata);
		assertEquals(3, cars.size());

	}

	@Test
	public void testToCheckCompareMethod() {
		TreeSet<Car> cars = new TreeSet<>();
		cars.add(maruti);
		cars.add(tata);
		cars.add(hyundai);
		Iterator<Car> iterator = cars.iterator();
		assertEquals(tata, iterator.next());
		assertEquals(hyundai, iterator.next());
		assertEquals(maruti, iterator.next());
		
	}

}
