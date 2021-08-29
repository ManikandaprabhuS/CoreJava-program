package day10.Collections;

public class Student implements Comparable {
	private String name;
	private String rollno;
	private int age;

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, String rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		// return (this.name).compareTo(student.name); // Acending order
		return this.age - student.age; // Age
	}
}
