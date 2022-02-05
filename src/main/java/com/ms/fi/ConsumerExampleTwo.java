package com.ms.fi;

import java.util.function.Consumer;
import java.util.stream.Stream;

import com.ms.functional.Employee;

public class ConsumerExampleTwo {

	public static void operate(Employee emp, Consumer<Employee> consumer) {
		consumer.accept(emp);
	}
	public static void main(String[] args) {
		Employee emp=new Employee(111,"abc",50000);
		System.out.println(emp);
		Consumer<Employee> consumer=(e)->{e.setSal(e.getSal()+1000);};
		operate(emp,consumer);
		System.out.println(emp);

		
	}

}
