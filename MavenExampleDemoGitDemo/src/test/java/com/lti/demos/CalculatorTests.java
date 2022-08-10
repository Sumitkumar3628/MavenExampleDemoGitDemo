package com.lti.demos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c = new Calculator();
	
	@Disabled
	@Test //required for getting run as junit test cases
	public void testSayHello() {
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	
	@Disabled
	@Test
	public void testAddTwoNos() {
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result);
	}
	
	@Disabled
	@Test
	public void testSubTwoNos() {
		int result = c.subNos(300, 100);
		Assertions.assertEquals(200, result);
	}
	
	@Disabled
	@Test //message is optional //if test case fails - msg desplayed
	public void testSubTwoNoss() {
		int result = c.subNos(300,100);
		Assertions.assertEquals(200,result,"plz check subtraction method code");
	}
	
	@Disabled
	@Test
	public void testAssertNulls() {
		String s1 = null;
		String s2 = "Nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Disabled
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10); //False assertions req. and actually false so message will be true
		Assertions.assertFalse(10>20," 10 is smaller");
		Assertions.assertNotEquals("Hello","hello");
	}
	
	
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		
		Assertions.assertEquals(2, myList.size());
		
	}
	

}
