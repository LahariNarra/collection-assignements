package com.capgemini.collection.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Telivision;

public class TelivisionTest {
	private static Telivision samsungTelivision;
	private static Telivision sonyTelivision;
	private static Telivision lgTelivision;

	@BeforeClass
	public static void setUp() {
		samsungTelivision = new Telivision("SamSung", "Lcd", "Yes", 24000);
		sonyTelivision = new Telivision("Sony", "Led", "Yes", 18000);
		lgTelivision = new Telivision("LG", "LED", "No", 12000);
	}

	@Test
	public void testToCheckListIsInsertedInInsertionOrder() {
		ArrayList<Telivision> telivision = new ArrayList<>();
		telivision.add(samsungTelivision);
		telivision.add(sonyTelivision);
		telivision.add(lgTelivision);
		Iterator<Telivision> iterator = telivision.iterator();
		assertEquals(samsungTelivision, iterator.next());
		assertEquals(sonyTelivision, iterator.next());
		assertEquals(lgTelivision, iterator.next());

	}

	@Test
	public void testToCheckDuplicatesAreNotAlloed() {
		HashSet<Telivision> telivision = new HashSet<>();
		telivision.add(samsungTelivision);
		telivision.add(sonyTelivision);
		telivision.add(lgTelivision);
		telivision.add(sonyTelivision);
		telivision.add(lgTelivision);
		assertEquals(3, telivision.size());
	}
}
