package day3.passingparameters;

public class CalculatorMain {

	public static void main(String[] args) {
		int a = 30; // primitive data type.. pass by value
		int b = 40; // primitive data type.. pass by value
		String str1 = "Mani "; // is object because String is a class but immutable
		String str2 = "HCL"; // is object because String is a class but immutable
		Calculator calc = new Calculator();
		System.out.println("Old value of a:" + a); // 30
		System.out.println("Old value of b:" + b); // 40
		calc.add(a, b); // integer add
		System.out.println("New value of a:" + a); // 30 - 20
		System.out.println("New value of b:" + b); // 30 - 10
		System.out.println("");
		System.out.println("Old value of str1:" + str1); // mani
		System.out.println("Old value of str2:" + str2); // HCL
		calc.add(str1, str2); // String add
		System.out.println("New value of str1:" + str1); // Anbu
		System.out.println("New value of str2:" + str2); // HCL
		System.out.println("");
		Message msg1 = new Message(); // Hello in msg variable in object msg1
		Message msg2 = new Message(); // Hello in msg variable in object msg2
		System.out.println("Old value of msg1.msg:" + msg1.msg); // Hello
		System.out.println("Old value of msg1.msg:" + msg2.msg); // Hello
		calc.add(msg1, msg2); // String inside the object - addition
		System.out.println("New value of msg1.msg:" + msg1.msg); // HelloHello
		System.out.println("New value of msg1.msg:" + msg2.msg); // Sorry i am modifying your string.
		System.out.println("");
		System.out.println("Old value of msg1.code:" + msg1.code); // 0
		System.out.println("Old value of msg1.code:" + msg2.code); // 0
		calc.add(msg1, msg2, 20); // int inside the object - addition
		System.out.println("New value of msg1.code:" + msg1.code); // 20
		System.out.println("New value of msg1.msg:" + msg2.code); // 100
		System.out.println("");
	}

}
