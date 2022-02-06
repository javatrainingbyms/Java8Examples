package com.ms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.ms.functional.Employee;

public class StreamCreation {

	public static void main(String[] args) {

		Employee e1=new Employee(5001,"Rajesh",45000);
		Employee e2=new Employee(2001,"Ashish",55000);
		Employee e3=new Employee(4001,"Priya",25000);
		Employee e4=new Employee(3001,"John",15000);
		Employee e5=new Employee(1001,"Smith",65000);
		
		List<Employee> employees=Arrays.asList(e1,e2,e3,e4,e5);
		
		Stream<Employee> empStream=employees.stream();
		
		Consumer<Employee> consumer=(emp)->{emp.setSal(emp.getSal()+100);};
		empStream.forEach(consumer);
		System.out.println(employees);
		//empStream.forEach((emp)->{emp.setSal(emp.getSal()+100);});
		
		
		
		/*
		Stream<Integer> stream1=Stream.of(10,20,30,40,50);
		
		stream1.forEach((p)->{
			int sqr=p*p;
			System.out.println(sqr);
		});
		*/
		

	}

}
