package day13.programs;

public class EmployeeConstructorMain {

	public static void main(String[] args) {
		EmployeeInterface empint = Employee::new;
		Employee employee = empint.getEmployee(20, "HCL");
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getEmpName());

	}

}
