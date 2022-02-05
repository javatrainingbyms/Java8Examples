package com.ms.functional;

public class ThreadingUsingLambda {
	public static void main(String[] args) {

		//task-1,task-2,task-3
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					System.out.println("2 x "+i+" = "+(2*i));
				}
			}
		});
		t1.start();
		
		Runnable r1=()->{
			for(int i=1; i<=5; i++) {
				System.out.println("3 x "+i+" = "+(3*i));
			}
		};
		Runnable r2=()->{
			for(int i=1; i<=5; i++) {
				System.out.println("4 x "+i+" = "+(4*i));
			}
		};
		
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r2);
		t2.start();
		t3.start();
		
		/*
		Thread t2=new Thread(()->{
			for(int i=1; i<=5; i++) {
				System.out.println("3 x "+i+" = "+(3*i));
			}
		});
		t2.start();
		Thread t3=new Thread(()->{
			for(int i=1; i<=5; i++) {
				System.out.println("4 x "+i+" = "+(4*i));
			}
		});
		t3.start();
		*/
	}
}
