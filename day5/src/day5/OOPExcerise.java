package day5;
/*
 * Findings error in prgm
 * 
 * day:5
 * 
 * @author: mani
 */

public class OOPExcerise {

	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		objA.setA(222);
		System.out.println("objA.a = " + objA.getA());
		}
}
class A {
	private int a = 100;

	public void setA(int value) {
		a = value;
	}

	public int getA() {
		return a;
	}
} // class A

