package com.ms.fi;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {

	public static boolean isEligibleForVoting(Person person, Predicate<Person> predicate) {
			boolean b=predicate.test(person);
			return b;
	}
	
	
	public static void main(String[] args) {
	
		Person person=new Person("aa","bb",20);
		boolean res=isEligibleForVoting(person, (p)->{return p.getAge()>=28;});
		System.out.println(res);
	}

}
