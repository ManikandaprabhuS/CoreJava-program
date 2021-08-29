package day6.Exercise;

import java.util.Scanner;

public class ArithmeticExpersionDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number num");
		try {
			int num = sc.nextInt();
			System.out.println("Enter the Number den");
			int den = sc.nextInt();
			System.out.println("Divide result:" + num / den);
		} 
		catch (Exception e) {
			System.out.println("error is " + e.getMessage());
		}
		
	}

}
