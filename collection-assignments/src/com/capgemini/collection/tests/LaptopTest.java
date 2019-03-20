package com.capgemini.collection.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Laptop;

public class LaptopTest {
	private static Laptop dellLaptop;
	private static Laptop hpLapotop;
	private static Laptop appleLaptop;

	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("Dell", "Insipiron i5589", "Windows 10", "i5");
		hpLapotop = new Laptop("Hp", "Notebook", "Windows7", "i7");
		appleLaptop = new Laptop("Apple", "MacBook", "MAC", "i6");

	}

	@Test
	public void testToCheckListIsPrintedInInsertionOrder() {
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLapotop);
		laptops.add(appleLaptop);
		Iterator<Laptop> it = laptops.iterator();
		assertEquals(dellLaptop, it.next());
		assertEquals(hpLapotop, it.next());
		assertEquals(appleLaptop, it.next());

	}

	@Test
	public void testToCheckNoDuplictesAreAvailable() {
		HashSet<Laptop> laptops = new HashSet<Laptop>();
		laptops.add(dellLaptop);
		laptops.add(hpLapotop);
		laptops.add(appleLaptop);
		laptops.add(dellLaptop);
		assertEquals(3, laptops.size());

	}
}
