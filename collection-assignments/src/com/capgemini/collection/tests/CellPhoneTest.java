package com.capgemini.collection.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.CellPhone;

public class CellPhoneTest {
	private static CellPhone onePlus;
	private static CellPhone apple;
	private static CellPhone samsung;
	private static CellPhone motorola;
	
	@BeforeClass
	public static void setUp() {
		onePlus = new CellPhone("OnePlus", "6t", "Battery extends 4800mh", "Android", 41500);
		apple = new CellPhone("Apple", "XR", "Dual Sim", "ios", 115000);
		samsung = new CellPhone("Samsung", "S8 Edge", "10GB Ram", "Andriod", 56000);
		motorola =new CellPhone("Motorola", "Note4", "13mp front Camera", "Android", 16500);
	}
	
	@Test
	public void testToCheckListIsInInsertionOrder() {
		ArrayList<CellPhone> cellPhone = new ArrayList<>();
		cellPhone.add(onePlus);
		cellPhone.add(apple);
		cellPhone.add(samsung);
		cellPhone.add(motorola);
		Iterator<CellPhone> iterator = cellPhone.iterator();
		assertEquals(onePlus, iterator.next());
		assertEquals(apple, iterator.next());
		assertEquals(samsung, iterator.next());
		assertEquals(motorola, iterator.next());
	}
	
	@Test
	public void testToCheckNoDuplicatesAreavailable() {
		HashSet<CellPhone> cellPhone = new HashSet<>();
		cellPhone.add(onePlus);
		cellPhone.add(apple);
		cellPhone.add(samsung);
		cellPhone.add(motorola);
		cellPhone.add(apple);
		cellPhone.add(samsung);
		assertEquals(4,cellPhone.size());
	}
}
