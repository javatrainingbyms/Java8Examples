package com.ms.functional;

public class FactorialUser {

	public static void main(String[] args) {
		
		Factorial f=(n)->{
			int res=1;
			for(int i=1; i<=n;i++) {
				res=res*n;
			}
			return res;
		};

		int result=f.getValue(5);
		System.out.println(result);
	}

}
