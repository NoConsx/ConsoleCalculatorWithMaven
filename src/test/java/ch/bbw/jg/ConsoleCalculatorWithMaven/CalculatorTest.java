package ch.bbw.jg.ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

/**
 * 
 * @author Joel Galli
 * @version 19.01.2020
 *
 */

import org.junit.Test;

public class CalculatorTest {

	Calculator testCalculator;
	
	int int1 = 10;
	int int2 = 20;

	@Test
	public void testSumOfTwoPositiveIsOk() {
		testCalculator = new Calculator();
		assertTrue(testCalculator.sum(int1, int2) == 30);
	}
	
	@Test
	public void testSubstrOfTwoPositiveIsOk() {
		testCalculator = new Calculator();
		assertTrue(testCalculator.subtr(int1, int2) == -10);
	}

}
