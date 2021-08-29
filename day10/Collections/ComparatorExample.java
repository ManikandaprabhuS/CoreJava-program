package day10.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Studentcomparator> al = new ArrayList<Studentcomparator>();
		al.add(new Studentcomparator("vijay", "101", 23));
		al.add(new Studentcomparator("Ajay", "102", 23));
		al.add(new Studentcomparator("Jai", "103", 23));
		System.out.println("Sorting by Name..");
		Collections.sort(al, new NameComparator());
		for (Studentcomparator st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		for (Studentcomparator st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
