package com.ms.fi;

import java.util.function.Function;

import com.ms.functional.Employee;

public class FunctionExampleOne {

	public static void main(String[] args) {
		
		Function<String,Integer> function1=(s)->s.length();
		int result1=function1.apply("indore");
		System.out.println(result1);
		
		Function<Person,Employee> function2=(p)->{
			Employee emp=new Employee();
			emp.setCode((int)(Math.random()*1000));
			emp.setName(p.getFname()+ " "+p.getLname());
			emp.setSal(p.getAge()*1000);
			return emp;
		};
		
		Employee e=function2.apply(new Person("amit","sharma",25));
		System.out.println(e);
	}

}
