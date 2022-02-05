package com.ms.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpSortUsingLambda {
	public static void main(String[] args) {
		Employee e1 = new Employee(5001, "Rajesh", 45000);
		Employee e2 = new Employee(2001, "Ashish", 55000);
		Employee e3 = new Employee(4001, "Priya", 25000);
		Employee e4 = new Employee(3001, "John", 15000);
		Employee e5 = new Employee(1001, "Smith", 65000);

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

		Collections.sort(employees, (emp1, emp2) -> {return emp1.getCode() - emp2.getCode();});


		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}
}
