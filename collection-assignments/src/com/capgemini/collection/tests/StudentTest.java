package com.capgemini.collection.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Student;

public class StudentTest {
	private static Student lahari;
	private static Student nandini;
	private static Student mukhesh;
	private static Student karthik;

	@BeforeClass
	public static void setUP() {
		lahari = new Student(1748, "Lahari Narra");
		nandini = new Student(1719, "Nandini Yalamarth");
		mukhesh = new Student(1852, "Mukhesh");
		karthik = new Student(1614, "Karthik");
	}

	@Test
	public void testToCheckListIsInsertedInInsertionOrder() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(lahari);
		students.add(nandini);
		students.add(mukhesh);
		students.add(karthik);
		Iterator<Student> iterator = students.iterator();
		assertEquals(lahari, iterator.next());
		assertEquals(nandini, iterator.next());
		assertEquals(mukhesh, iterator.next());
		assertEquals(karthik, iterator.next());
	}

	@Test
	public void testToCheckNoDuplicateValuesAreallowed() {
		HashSet<Student> students = new HashSet<>();
		students.add(lahari);
		students.add(nandini);
		students.add(mukhesh);
		students.add(karthik);
		students.add(lahari);
		students.add(karthik);
		assertEquals(4, students.size());
	}

	@Test
	public void testToCheckListIsInsertedInNaturalOrder() {
		TreeSet<Student> students = new TreeSet<>();
		students.add(lahari);
		students.add(nandini);
		students.add(mukhesh);
		students.add(karthik);
		Iterator<Student> iterator = students.iterator();
		assertEquals(karthik, iterator.next());
		assertEquals(nandini, iterator.next());
		assertEquals(lahari, iterator.next());
		assertEquals(mukhesh, iterator.next());

	}

	@Test
	public void testToCheckMapStoresTheValues() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Lahari", "Watermelon");
		map.put("Nandini", "Guava");
		map.put("Mukhesh", "Mango");
		map.put("Karthik", "Apple");
		Collection<String> keys = map.keySet();
		assertEquals(4, keys.size());

		Collection<String> values = map.values();
		assertEquals(4, values.size());

		assertEquals("Watermelon", map.get("Lahari"));
		assertEquals("Guava", map.get("Nandini"));
		assertEquals("Mango", map.get("Mukhesh"));
		assertEquals("Apple", map.get("Karthik"));

	}

}
