package day8.hashExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * To demonstrate collection of employees.
 *
 * Topic: Collections
 *
 * Day#: 8
 *
 * @author Mani
 *
 */
public class EmployeeMain {

	/**
	 * Main method to get user inputs for two employees and store into arraylist.
	 * Print the employee list.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
	EmployeeMain main = new EmployeeMain();
	Scanner sc = new Scanner(System.in);
	List<Employee> empList = new ArrayList<>();
	List<Project> projList = new ArrayList<>();
	for (int i = 1; i < 3; i++) {
	System.out.println("Enter the Employee " + i + " details");
	System.out.println("Enter the sapcode:");
	int sapcode = sc.nextInt();
	System.out.println("Enter the name:");
	String name = sc.next();
	System.out.println("Enter the salary:");
	float sal = sc.nextFloat();
	Employee emp = new Employee(sapcode, name, sal);

	 System.out.println("Choose the project to work:");
	projList = main.prepareProjectData();
	for (Project p : projList) {
	System.out.println(p.getName());
	}
	String projectName = sc.next();

	 for (Project p : projList) {
	if (p.getName().equals(projectName)) {
	emp.setProject(p);
	break;
	}
	}
	empList.add(emp);
	}
	System.out.println("Sap code Emp Name Project Name Salary Bonus Total Payment");
	for (Employee e : empList) {
	Project p = e.getProject();
	System.out.println(e.getSapcode() + "\t" + e.getName() + "\t" + p.getName() + "\t" + e.getSalary() + "\t"
	+ p.getBonus() + "\t" + (e.getSalary() + p.getBonus()));
	}
	sc.close();
	}

	List<Project> prepareProjectData() {
	List<Project> projList = new ArrayList<>();
	projList.add(new Project("A", 1000.0f));
	projList.add(new Project("B", 1250.0f));
	projList.add(new Project("C", 1500.0f));
	return projList;
	}

	}
}
