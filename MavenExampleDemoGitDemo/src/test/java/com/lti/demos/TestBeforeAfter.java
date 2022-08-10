package com.lti.demos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c = new Calculator();
	int sum=0;
	
	@BeforeAll //Before all test case only once
	public static void testStartDbConn() {
		System.out.println("DB connection is up - only once");
	} 
	
	@BeforeEach //before each test case it executed
	public void testStartup() {
		sum=0;
		System.out.println("Sum is zero "+sum);
	}
	
	@Test
	public void testAddTwoNos() {
		System.out.println("Test case 1");
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result);
	}
	
	@Test
	public void testSubTwoNos() {
		System.out.println("Test case 2");
		int result = c.subNos(300, 100);
		Assertions.assertEquals(200, result);
	}
	
	@AfterAll //only once
	public static void testShutDownConn() {
		System.out.println("Shutting down db connecton");
	}

}
