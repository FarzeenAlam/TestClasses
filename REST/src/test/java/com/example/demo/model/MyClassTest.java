package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyClassTest {

	@Disabled
	@Test
	public void testExceptionIsThrown() {
		MyClass tester = new MyClass();
		tester.multiply(1000, 5);
	}
	
	@DisplayName("TEST Mul")
	@Test
	void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals(50, tester.multiply(5, 10), "10 x 5 must be 50");
	}

}
