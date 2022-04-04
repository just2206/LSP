package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	
	@Test
	@DisplayName("IntegerSet.clear test cases")
	public void testclear() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		set1.clear();
		assertTrue(set1.isEmpty());
	}
	
	@Test
	@DisplayName("IntegerSet.length test cases")
	public void testlength() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		set1.add(5);
		set1.add(6);
		
		assertEquals(3, set1.length());
	}
	
	@Test
	@DisplayName("IntegerSet.largest test cases")
	public void testlargest() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		set1.add(5);
		set1.add(6);
		
		assertEquals(6, set1.largest());
		assertNotEquals(5, set1.largest());
	}
	
	@Test
	@DisplayName("IntegerSet.largest throws exception")
	public void testlargest_THROWS_Exception() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(RuntimeException.class, () -> {
			set1.largest();
		});
		
		String expectedMessage = "The set is empty.";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("IntegerSet.smallest test cases")
	public void testsmallest() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		set1.add(5);
		set1.add(6);
		
		assertEquals(3, set1.smallest());
		assertNotEquals(5, set1.smallest());
	}
	
	@Test
	@DisplayName("IntegerSet.smallest throws exception")
	public void testsmallest_THROWS_Exception() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(RuntimeException.class, () -> {
			set1.smallest();
		});
		
		String expectedMessage = "The set is empty.";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("IntegerSet.add test cases")
	public void testadd() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		
		assertTrue(set1.contains(3));
		assertFalse(set1.contains(4));
	}
	
	@Test
	@DisplayName("IntegerSet.remove test cases")
	public void testremove() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		set1.add(4);
		
		set1.remove(3);
		
		assertFalse(set1.contains(3));
		assertTrue(set1.contains(4));
	}
	
	@Test
	@DisplayName("IntegerSet.equals test cases")
	public void testequals() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		set1.add(5);
		set1.add(6);
		IntegerSet set2 = new IntegerSet();
		set1.add(3);
		set1.add(5);
		set1.add(6);
		IntegerSet set3 = new IntegerSet();
		set1.add(3);
		set1.add(5);
		set1.add(7);
		assertTrue(set1.equals(set2));
		assertFalse(set1.equals(set3));
	}
	
	@Test
	@DisplayName("IntegerSet.contains test cases")
	public void testcontains() {
		IntegerSet set1 = new IntegerSet();
		set1.add(3);
		assertTrue(set1.contains(3));
		assertFalse(set1.contains(4));
	}
	
	@Test
	@DisplayName("IntegerSet.isEmpty test cases")
	public void testisEmpty() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(2);
		
		assertTrue(set2.isEmpty());
		assertFalse(set1.isEmpty());
		
	}

	@Test
	@DisplayName("IntegerSet.union test cases")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		set1.add(2);
		set1.add(4);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(5);
		
		System.out.println(set1.toString());
		assertEquals("[2, 4, 5]", set1.toString());
		assertNotEquals("[5, 4, 2]", set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.toString test cases")
	public void testtoString() {
		IntegerSet set1 = new IntegerSet();
		set1.add(2);
		set1.add(4);
		String value = "[2, 4]";
		
		assertEquals(value, set1.toString());
	}
}
