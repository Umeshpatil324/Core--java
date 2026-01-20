package com.method;

public class EmployeeInfo {
	public static void main(String[] args) {
		
	
	Employee emp=new Employee();
	emp.mySquare();
	emp.myCube();
	emp.mySquare(2);
	emp.myCube(2);
	System.out.println(emp.mysquare());
	System.out.println(emp.mycube());
	emp.mySum();
	System.out.println("Sum is"+" "+emp.mysum());
	System.out.println("sum is "+" "+emp.mysum(6,7));
	emp.greatestNo(4, 9);
	emp.evenOdd();

}
}
