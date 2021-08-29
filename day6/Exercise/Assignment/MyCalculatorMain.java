package day6.Exercise.Assignment;

import java.util.Scanner;

public class MyCalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner to get the input
		MyCalculator myc = new MyCalculator();
		int n = sc.nextInt();
		int p = sc.nextInt();
		try {
			long result = myc.power(n, p);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
