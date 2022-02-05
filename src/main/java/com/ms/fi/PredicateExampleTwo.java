package com.ms.fi;

import java.util.function.Predicate;

public class PredicateExampleTwo {

	public static boolean checkNumber(int number, Predicate<Integer> predicate) {
		return predicate.test(number);
	}
	
	public static void main(String[] args) {
		
		Predicate<Integer> evenTestPredicate=(n)->n%2==0;
		Predicate<Integer> oddTestPredicate=(n)->n%2!=0;
		//Predicate<Integer> primeTestPredicate=(n)->logic for testing prime no.
		
		boolean res1=checkNumber(10,evenTestPredicate);
		System.out.println(res1);
		boolean res2=checkNumber(20, oddTestPredicate);
		System.out.println(res2);
		
	}

}
