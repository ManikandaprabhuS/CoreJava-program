package day6.Exercise.Assignment;

/**
 * 
 * class MyCalculator Day: 6 Assignment
 * 
 * @author Mani
 *
 */

public class MyCalculator extends Exception {
	public long power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception(" n or p should not be negative");
		} else if (n == 0 && p == 0) {
			throw new Exception(" n or p should not be Zero");
		} else {
			return (long) Math.pow(n, p); // convert double to long Typecaste
		}
	}

}
