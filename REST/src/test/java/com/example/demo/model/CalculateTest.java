package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

class CalculateTest {

	@BeforeTestClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("before class");
	}
	
	@Before(value = "")
	public void setUp() throws Exception{
		System.out.println("before");
	}
	
	@Test
	void testFindMax() {
		System.out.println("test case find max");
		assertEquals(4, Calculate.findMax(new int[] {1,3,4,2}));
		assertEquals(-2, Calculate.findMax(new int[] {-12,-3,-4,-2}));
	}

	@Test
	void testCube() {
		System.out.println("test case cube");
		assertEquals(27, Calculate.cube(3));
	}

	@After(value = "")
	public void tearDown() throws Exception{
		System.out.println("after");
	}
	
	@AfterTestClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("after class");
	}
}
