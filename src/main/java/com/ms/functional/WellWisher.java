package com.ms.functional;

public class WellWisher {
	
	static class FrenchGreeting implements Greeting {
		@Override
		public void greet() {
			System.out.println("Welcomaniao....!");
			
		}
		
	}
	
	public static void wish(Greeting greeting) {
		greeting.greet();
	}
	public static void main(String[] args) {
		wish(new EnglishGreeting());
		wish(new HindiGreeting());
		wish(new FrenchGreeting());
		
		//Greeting g=new Greeting();
		Greeting marathiGreeting=new Greeting() {
			@Override
			public void greet() {
				System.out.println("Marathi Greeting...!");
				
			}
		};
		
		wish(marathiGreeting);
		
		wish(new Greeting(){
			@Override
			public void greet() {
				System.out.println("Greeting From Anonomous....!");
				
			}
		});
		
		
		wish(()->System.out.println("hello from lambda...!"));
		wish(()->System.out.println("another wish from lambda..!"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
