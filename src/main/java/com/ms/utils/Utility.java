package com.ms.utils;

import java.util.Arrays;
import java.util.List;

import com.ms.functional.Employee;

public class Utility {
	public static List<Employee> getEmpData(){
		Employee e1=new Employee(5001,"Rajesh",45000);
		Employee e2=new Employee(2001,"Ashish",55000);
		Employee e3=new Employee(4001,"Priya",25000);
		Employee e4=new Employee(3001,"John",15000);
		Employee e5=new Employee(1001,"Smith",65000);
		
		List<Employee> employees=Arrays.asList(e1,e2,e3,e4,e5);
		return employees;
	}
}
