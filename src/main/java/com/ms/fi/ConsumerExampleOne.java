package com.ms.fi;

import java.util.function.Consumer;

public class ConsumerExampleOne {

	public static void operateString(String s, Consumer<String> consumer) {
		consumer.accept(s);
	}

	public static void main(String[] args) {

		
		operateString("indore", (s)->{System.out.println(s.toUpperCase());});
		operateString("functionalinterface",(s)->{System.out.println(s.subSequence(5, 12));});
	}

}
