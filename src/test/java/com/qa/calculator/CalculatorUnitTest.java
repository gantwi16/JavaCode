package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CalculatorUnitTest {
	Calculator calculator;

	@Before
	public void init() {
		this.calculator = new Calculator();
	}

	@Test
	public void addTest() {
		int num1 = 3;
		int num2 = 5;
		int expectedResult = 8;
		int actualResult = calculator.add(num1, num2);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void subtractTest() {
		int num1 = 10;
		int num2 = 7;
		int expectedResult = 3;
		int actualResult = calculator.subtract(num1, num2);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void multiplicationTest() {
		int num1 = 3;
		int num2 = 4;
		int expectedResult = 12;
		int actualResult = calculator.multiplication(num1, num2);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void divideTest() {
		int num1 = 15;
		int num2 = 3;
		int expectedResult = 5;
		int actualResult = calculator.divide(num1, num2);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void moduloTest() {
		int num1 = 10;
		int num2 = 4;
		int expectedResult = 2;
		int actualResult = calculator.modulo(num1, num2);
		assertEquals(expectedResult, actualResult);
	}
}
