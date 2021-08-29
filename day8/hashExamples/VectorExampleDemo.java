package day8.hashExamples;

import java.util.Vector;

public class VectorExampleDemo {

	public static void main(String[] args) {
		Vector<Object> vector = new Vector<Object>();
		String str = "Mani";
		vector.add(10);
		vector.add(20);
		vector.add(str);
		vector.add(2, 30);
		System.out.println("The element of vector :" + vector);
		System.out.println("The size of vector :" + vector.size());
		System.out.println("The element at positions 2 is :" + vector.elementAt(2));
		System.out.println("The  First element of vector :" + vector.firstElement());
		System.out.println("The  Second  element of vector :" + vector.lastElement());
		vector.removeElementAt(2);
		java.util.Enumeration<Object> e = vector.elements(); //
		System.out.println("The elements of vector :" + vector);
		while (e.hasMoreElements()) {
			System.out.println("The elments are:" + e.nextElement());
		}
	}

}
