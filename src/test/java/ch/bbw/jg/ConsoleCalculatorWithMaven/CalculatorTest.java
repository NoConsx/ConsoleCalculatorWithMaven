package ch.bbw.jg.ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 * 
 * @author Joel Galli
 * @version 19.01.2020
 *
 */

import org.junit.Test;

public class CalculatorTest {

	private Calculator testCalculator;

	@Before
	public void setup() {
		testCalculator = new Calculator();
	}

	int int1Pos = 10;
	int int2Pos = 20;

	int int1Neg = -10;
	int int2Neg = -20;

	int intZero = 0
	
	/**
	 * Test public method sum
	 */
			
	@Test
	public void testSumOfTwoPositiveIsOk() {
		assertTrue(testCalculator.sum(int1Pos, int2Pos) == 30);
	}

	@Test
	public void testSubtrOfTwoPositiveIsOk() {
		assertTrue(testCalculator.subtr(int1Pos, int2Pos) == -10);
	}
	
	/**
	 * Test public method subtr
	 */
	
	@Test
	public void testSumOfTwoNegativeIsOk() {
		assertTrue(testCalculator.sum(int1Neg, int2Neg) == -30);
	}

	@Test
	public void testSubtrOfTwoNegativeIsOk() {
		assertTrue(testCalculator.subtr(int1Neg, int2Neg) == 10);
	}

	/**
	 * Test public method div
	 */
	
	@Test(expected = ArithmeticException.class)
	public void testDivOfPositiveByZeroThrowsExpectArithmethicException() {
		testCalculator.div(int1Pos, intZero);
	}

	@Test
	public void testDivOfPositiveByPositiveUnexpectArithmethicException() throws java.lang.ArithmeticException {
		testCalculator.div(int1Pos, int2Pos);
	}

	/**
	 * Test protected method sqrt
	 */
	
	@Test
	public void testProtectedSumOfOnePositiveAndOneNegative() {
		testCalculator.sqrt(int1Pos);
	}

}
