package com.review;

public class TestCode {

	static int [] num = {2,3,5,6,1,10,9,12,32};
	
	public static int sumEven(int[] x) {
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			
			if (x[i] % 2 == 0 ) 
				sum = sum + x[i];
		
			//System.out.println(sum);
		}
		return sum;
		
	}
	
	public static int fac (int n) {
		if (n==0) return 1;
		else return n*fac(n-1);
	}
	
	public static int fib (int n) {
		if(n==1) return 1;
		else return fib(n-1)+fib(n+1);
	}
	
	public static int expo(int a,int b) {
		if(b == 0) return 1;
		else return a * expo(a,b-1);
	}
	

	public static int sum(int x[],int  last) {
		if(last == 0) return x[0];
		else return sum(x,last-1)+x[last];
	}
	
	public static int prodArr(int x[], int last) {
		if(last == -1) return 1;
		else return prodArr(x, last-1)* x[last]  ; 
	}
	
	public static int sum(int x , int y) {
		if (x==0) return y;
		else return sum(x-1, y) + 1;
	}
	
	public static int fact(int n) {
		
		int mult = 1;
		for(int i = 1; i <= n ; i++)
			mult= i * mult;
		
		return mult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumEven(num));
		System.out.println(fac(4));
		System.out.println(sum(num,num.length-1));
		System.out.println(sum(2,5));
		System.out.println(prodArr(num,num.length-1));
		System.out.println(fact(4));
	}

}
