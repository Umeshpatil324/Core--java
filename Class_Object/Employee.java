package Class_Object;

public class Employee {
	int empId;
	String empName;

	void show() {
		System.out.println(empId + " " + empName);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.empId = 1;
		e1.empName = "Amit";

		e2.empId = 2;
		e2.empName = "Ravi";

		e1.show();
		e2.show();
	}
}
