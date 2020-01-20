package ch.bbw.jg.ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

	int intZero = 0;

	/**
	 * Test public method sum
	 */

	@Test
	public void testSumOfTwoPositiveIsOk() throws ArithmeticException {
		assertTrue(testCalculator.sum(int1Pos, int2Pos) == 30);
	}
	
	@Test
	public void testSumOfTwoNegativeIsOk() throws ArithmeticException {
		assertTrue(testCalculator.sum(int1Neg, int2Neg) == -30);
	}
	
	@Test
	public void testSumOfOneNegativeOnePositiveIsOk() throws ArithmeticException {
		assertTrue(testCalculator.sum(int1Neg, int1Pos) == 0);
	}

	@Test
	public void testSumOfOnePositiveOneNegativeIsOk() throws ArithmeticException {
		assertTrue(testCalculator.sum(int1Pos, int1Neg) == 0);
	}
	
	@Test
	public void testSumOfZeroAndNegativeIsOk() throws ArithmeticException {
		assertTrue(testCalculator.sum(intZero, int1Neg) == -10);
	}
	
	@Test
	public void testSumOfZeroAndPositiveIsOk() throws ArithmeticException {
		assertTrue(testCalculator.sum(intZero, int1Pos) == 10);
	}
	
	@Test
	public void testSumMaxAndMinIsOk() {
		assertTrue(testCalculator.sum(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}


	/**
	 * Test public method subtr
	 */

	@Test
	public void testSubtrOfTwoPositiveIsOk() throws ArithmeticException {
		assertTrue(testCalculator.subtr(int1Pos, int2Pos) == -10);
	}

	@Test
	public void testSubtrOfTwoNegativeIsOk() throws ArithmeticException {
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
	public void testDivOfPositiveByPositiveUnexpectArithmethicException() throws ArithmeticException {
		testCalculator.div(int1Pos, int2Pos);
	}

	/**
	 * Test protected method sqrt
	 */

	@Test
	public void testProtectedSqrtMethodWithPositive() {
		testCalculator.sqrt(int1Pos);
	}

	/**
	 * Test package protected method mult
	 */

	@Test
	public void testPackageProtectedMultMethodWithPositive() throws ArithmeticException {
		testCalculator.mult(int1Pos, int2Pos);
	}

	/**
	 * Test private method pow
	 */

	@Test
	public void testPrivatedPowMethodWithPositive() {
		/**
		 * I do not unit test private methods. A private method is an implementation
		 * detail that should be hidden to the users of the class. Testing private
		 * methods breaks encapsulation.
		 * 
		 * I could also implement a reflection to test private methods:
		 * 
		 * https://github.com/gk2go/dp4j/wiki/Testscript
		 * 
		 * If I don't want to implement this reflection and I find that the private
		 * method is complex or important enough to require its own tests, I just put it
		 * in another class and make it public there
		 * 
		 */
	}
}