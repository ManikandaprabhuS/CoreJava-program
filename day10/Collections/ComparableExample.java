package day10.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("sandy", "MCA07/12", 29));
		studentList.add(new Student("Roxy", "MCA07/14", 22));
		studentList.add(new Student("sunny", "MCA07/22", 129));
		studentList.add(new Student("Sunil", "MCA07/01", 209));
		Collections.sort(studentList);
		for (Student s : studentList) {
			System.out.println("Students Name:" + s.getName());
			System.out.println("Students Roll no:" + s.getRollno());
			System.out.println("Students Age:" + s.getAge());
			System.out.println();
		}
	}

}
