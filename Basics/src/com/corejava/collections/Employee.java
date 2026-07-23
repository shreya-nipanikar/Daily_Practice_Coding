package com.corejava.collections;

import java.util.HashMap;

public class Employee {
	
	String name;
	String dept;
	int salary;
	
	public Employee(String name, String dept, int salary) {
		//super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		HashMap<Integer,Employee> employee = new HashMap<>();
		
		//Add values
		employee.put(1, new Employee("Meera","Fire",30000));
		employee.put(2, new Employee("Arya","Garbage",10000));
		employee.put(3, new Employee("Mayank","Medicine",60000));
		
		//Display
				for(Integer emp: employee.keySet()) {
					System.out.println("Employee: "+emp);
					System.out.println(employee.get(emp));
				}
		
		int id = 3;
		Employee emp = employee.get(3);
		System.out.println("Employee found: "+emp);
		
		emp.salary += 5000;
		System.out.println("Salary of Mayank"+emp.salary);
		
		employee.remove(2);
		
		
		//Display
				for(Integer empp: employee.keySet()) {
					System.out.println("Employee: "+empp);
					System.out.println(employee.get(empp));
				}
	}

}
