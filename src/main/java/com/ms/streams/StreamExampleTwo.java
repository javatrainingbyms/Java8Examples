package com.ms.streams;

import java.util.List;
import java.util.function.Predicate;

import com.ms.functional.Employee;
import com.ms.utils.Utility;

public class StreamExampleTwo {
	public static void main(String[] args) {

		List<Employee> employees=Utility.getEmpData();
		//employees.stream().forEach((emp)->System.out.println(emp));
		
		//employees.stream().filter((emp)->emp.getSal()>=50000).forEach((emp)->System.out.println(emp));
		//employees.stream().map
		
	}
}

