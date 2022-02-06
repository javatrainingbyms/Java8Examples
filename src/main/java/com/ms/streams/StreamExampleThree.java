package com.ms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import com.ms.fi.Person;
import com.ms.functional.Employee;

public class StreamExampleThree {

	public static void main(String[] args) {
		Person p1 = new Person("aaa", "bbb", 50);
		Person p2 = new Person("xxx", "yyy", 60);
		Person p3 = new Person("ppp", "qqq", 35);
		Person p4 = new Person("mmm", "nnn", 45);
		Person p5 = new Person("sss", "ttt", 55);
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

		//obtaining Stream<Person> from List<Person>
		Stream<Person> personStream = persons.stream();
		
		//mapping each person object to employee object (transforming each person to emp)
		Stream<Employee> empStream = personStream.map((person) -> {
			Employee e = new Employee();
			e.setCode(new Random().nextInt(1000));
			e.setName(person.getFname() + "," + person.getLname());
			e.setSal(person.getAge() * 1000);
			return e;
		});

		
		//filtering emp stream and getting emp earning more than 50000 in new stream
		Stream<Employee> empStreamTwo=empStream.filter((emp)->emp.getSal()>=50000);
		
		//mapping (transforming) each emp to string in new string
		Stream<String> stringStream=empStreamTwo.map((emp)->emp.getName());
		
		//printing each string from stream of string objects
		stringStream.forEach((s)->System.out.println(s));
		
		
		
		
		
		
		
		
		
		/*
		 * persons.stream().map((p)->{ Employee e=new Employee(); e.setCode(new
		 * Random().nextInt(1000)); e.setName(p.getFname() + "," + p.getLname());
		 * e.setSal(p.getAge() * 1000); return e; }).filter((emp) -> emp.getSal() >=
		 * 50000).map((emp) -> emp.getName()).forEach((s) -> System.out.println(s));
		 */

	}

}
