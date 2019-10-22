package com.etisalat.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
	

	private Calculator calculator = new Calculator();
	
	private Integer number1;
	private Integer number2;
	
	public CalculatorTest(Integer number1, Integer number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				{1,2}, 
				{3,5}
			}); 
	}
	
	@BeforeClass
	public static void beforeAllTestMethod() {
		System.out.println("connecting to db");
	}

	@AfterClass
	public static void afterAllTestMethod() {
		System.out.println("closing db");
	}
	
	@Test
	public void testValidAdd(){
		Calculator calculator = new Calculator();
		System.out.println("testValidAdd : number1: " + number1 + " number2: " + number2);
		assertEquals((number1 + number2), calculator.add(number1, number2));
	}

	@Test
	public void testInvalidAdd(){
		
		System.out.println("testInvalidAdd :: number1: " + number1 + " number2: " + number2);
		assertNotSame(12, calculator.add(number1, number2));
	}
	
	@Test
	public void testSquare() {
		assertEquals(new Integer (number1*number1), calculator.square(number1));
	}
	
	@Test
	public void testDivide() {
		assertEquals(new Double(number1/number2), new Double(calculator.divide(number1, number2)));
	}
}
