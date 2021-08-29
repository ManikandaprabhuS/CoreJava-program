package day13.programs;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Integer addResult = calculator.calc((x, y) -> x + y, 10, 5);
		Integer subResult = calculator.calc((x, y) -> x - y, 10, 5);
		Integer divideResult = calculator.calc((x, y) -> x / y, 10, 5);
		Integer mulitpyResult = calculator.calc((x, y) -> x * y, 10, 5);
		System.out.println(
				"Add:" + addResult + "Sub:" + subResult + "Didvide:" + divideResult + "Mulitpy:" + mulitpyResult);
	}

}
