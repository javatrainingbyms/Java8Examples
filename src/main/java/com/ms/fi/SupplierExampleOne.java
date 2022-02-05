package com.ms.fi;

import java.util.function.Supplier;
import java.util.stream.Stream;
public class SupplierExampleOne {

	public static void main(String[] args) {
		
		
		Supplier<String> supplier=()->new java.util.Date().toString();
		System.out.println(supplier.get());
		
		Supplier<Double> supplier2=()->Math.random();
		System.out.println(supplier2.get());
		
		Supplier<Person> supplier3=()->new Person("manoj","s",40);
		System.out.println(supplier3.get());
	}

}
