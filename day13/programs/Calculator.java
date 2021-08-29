package day13.programs;

import java.util.function.BiFunction;

public class Calculator {

	public Integer calc(BiFunction<Integer, Integer, Integer> bi, int num1, int num2) {
		return bi.apply(num1, num2);
	}
}
