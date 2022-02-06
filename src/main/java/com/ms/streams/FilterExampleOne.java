package com.ms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterExampleOne {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,12,15,22,26,30,38);
		
		numbers.stream().filter((n)->n%2==0).filter((n)->n%6==0).forEach((n)->System.out.println(n));
		
		
		
		/*
		//obtaining a stream from collection
		Stream<Integer> streamAll=numbers.stream();
		//filtering even numbers and getting stream of even numbers
		Stream<Integer> streamEven=streamAll.filter((num)->num%2==0);
		//counting number of items in streamEven
		//long result=streamEven.count();
		streamEven.forEach((number)->System.out.println(number));
		
		//System.out.println(result);
		*/
	}

}
