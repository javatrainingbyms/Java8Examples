package com.ms.fi;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionExample {

	public static void main(String[] args) {
	
		BiFunction<String, Integer, String> function=(s,n)->s.substring(n);
		String res=function.apply("INDORE", 2);
		System.out.println(res);
		
		
		BinaryOperator<Integer> operator=(n1,n2)->(int)(Math.pow(n1, n2));
		int result=operator.apply(5,2);
		System.out.println(result);
	}

}
