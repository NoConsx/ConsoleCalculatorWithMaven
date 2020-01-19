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

	@Test
	public void testSumOfTwoPositiveIsOk() {
		testCalculator = new Calculator();
		assertTrue(testCalculator.sum(10, 20) == 30);
	}

}
