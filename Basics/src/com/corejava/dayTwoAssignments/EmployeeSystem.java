package com.corejava.dayTwoAssignments;

public class EmployeeSystem {
	
	int employeeId;
	String name;
	double salary;
	
	public EmployeeSystem(int employeeId, String name, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
		
}

class Manger extends EmployeeSystem{
	
	String deptName;
	double bonus;

	public Manger(int employeeId, String name, double salary,
			String deptName, double bonus) {
		super(employeeId, name, salary);
		this.deptName = deptName;
		this.bonus = bonus;
		
	}
	
	void displaySalary() {
		double totalSalary = bonus + salary;
		System.out.println("Manager's Salary : "+totalSalary);
		
	}
	
}
