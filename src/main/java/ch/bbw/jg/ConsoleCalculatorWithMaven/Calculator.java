package ch.bbw.jg.ConsoleCalculatorWithMaven;

/**
 * 
 * @author Joel Galli
 * @version 19.01.2020
 *
 */

public class Calculator {

	public int sum(int sum1, int sum2) {
		return sum1 + sum2;
	}

	public int subtr(int val1, int val2) {
		return val1 - val2;
	}

	public int div(int val1, int val2) {
		return val1 / val2;
	}

	protected double sqrt(int val1) {
		return Math.sqrt(val1);
	}

	int mult(int val1, int val2) {
		return Math.multiplyExact(val1, val2);
	}
}
