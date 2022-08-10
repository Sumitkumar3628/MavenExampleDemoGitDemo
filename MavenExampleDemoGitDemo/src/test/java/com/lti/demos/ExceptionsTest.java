package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {
	//dev writes exceptions - junit checks wheather those exceptions are handled or not
	@Test
	void testException() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
								
								()->{Integer.parseInt("one");}
				);
	}
	
	@Test
	public void testMethodExp() {
		Calculator c = new Calculator();
		
		final Exception e = assertThrows(ArithmeticException.class,
							()->{c.searchEmp(0);});
		Assertions.assertEquals("You entered zero", e.getMessage());//junit says yes developers exception is correct with 0 entry so green signal got
	}
	
	

}
