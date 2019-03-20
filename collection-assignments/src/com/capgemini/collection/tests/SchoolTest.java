package com.capgemini.collection.tests;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.School;

public class SchoolTest {
	private static School sasi;
	private static School gms;
	private static School delhiPublic;
	private static School sriChaitnya;

	@BeforeClass
	public static void setUP() {
		sasi = new School("Sasi English Medium", "Tanuku", "WestGodavari", 8);
		gms = new School("Gowtham Model", "Rajmundary", "EastGodavari", 2);
		delhiPublic = new School("Delhi Public", "Dilshuknagar", "Hyderabad", 2);
		sriChaitnya = new School("Sri Chaitnya", "Vijayawada", "Krishna", 5);
	}

	@Test
	public void testToCheckListIsInsertedInInsertionOrder() {
		ArrayList<School> schools = new ArrayList<>();
		schools.add(sasi);
		schools.add(gms);
		schools.add(delhiPublic);
		schools.add(sriChaitnya);
		Iterator<School> it = schools.iterator();
		assertEquals(sasi, it.next());
		assertEquals(gms, it.next());
		assertEquals(delhiPublic, it.next());
		assertEquals(sriChaitnya, it.next());

	}

	@Test
	public void testToCheckNoDuplicatesAreavailable() {
		HashSet<School> schools = new HashSet<>();
		schools.add(sasi);
		schools.add(gms);
		schools.add(delhiPublic);
		schools.add(sriChaitnya);
		schools.add(sasi);
		schools.add(gms);
		assertEquals(4, schools.size());
	}
	@Test
	public void testToCheckListIsInsertedInNaturalOrder() {
		TreeSet<School> schools = new TreeSet<>();
		schools.add(sasi);
		schools.add(gms);
		schools.add(delhiPublic);
		schools.add(sriChaitnya);
		Iterator<School> it = schools.iterator();
		assertEquals(delhiPublic, it.next());
		assertEquals(gms, it.next());
		assertEquals(sasi, it.next());
		assertEquals(sriChaitnya, it.next());

	}

}
