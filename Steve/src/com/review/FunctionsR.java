package com.review;

public class FunctionsR {

	public static int fact(int x){
		if (x == 1) return 1;
		else { return x * fact(x-1); }
	}
	
	public static int power(int a, int b){
		if( b == 0) return 1;
		else return a * power(a,b-1);
	}
	
	public static int fib(int x){
		if (x <= 1) return 1;
		else return fib(x-1) + fib(x-2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(power(2,2));
		   System.out.println(fact(4));
		   System.out.println(fib(1));
	}
	
}
