package day8.hashExamples;

public class Employee {

	private int sapcode;
	private String name;
	private float salary;

	public Employee() {
		super();
	}

	Employee project = new Employee();

	public Employee(int sapcode2, String name2, float sal) {
		super();
		this.sapcode = sapcode2;
		this.name = name2;
		this.salary = sal;
	}

	public int getSapcode() {
		return sapcode;
	}

	public void setSapcode(int sapcode) {
		this.sapcode = sapcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [sapcode=" + sapcode + ", name=" + name + ", salary=" + salary + "]";
	}

}
