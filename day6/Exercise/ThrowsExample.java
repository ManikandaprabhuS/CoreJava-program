package day6.Exercise;

/**
* To demonstrate the throws and re-throw
*
* Topic: Exception Handling
*
* Day#: 6
*
* @author Mani
*
*/
public class ThrowsExample {

 /**
* Main method to call the division method and catch the exception.
*
* @param args
*/
public static void main(String[] args) {
ArithmeticTest test = new ArithmeticTest();
try {
test.publicDivision(10, 0);
} catch (ArithmeticException e) {
System.out.println("Sorry, we cannot divide the numbers, due to / by zero.");
}
System.out.println("End of program");
}

}

class ArithmeticTest {
private void internalDivision(int num1, int num2) throws ArithmeticException {
System.out.println(num1 / num2);
}

 /**
* Public method to call the internal private method
*
* @param num1
* @param num2
* @throws ArithmeticException
*/
public void publicDivision(int num1, int num2) throws ArithmeticException {
internalDivision(num1, num2);
}

}