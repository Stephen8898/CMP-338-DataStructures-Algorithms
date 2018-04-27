package com.steve;
import java.util.*;
public class Example1 {

	public static void main(String []args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Add two numbers together that equals to 20 \n");
	 System.out.print("but should be no greater then 20 and no less: ");
	 
	int num = in.nextInt();
	int num1 = in.nextInt();
	int x = num + num1;
	int sum = num + num1; 
	System.out.printf("This equals %d.\n",sum);
while (x != 0 ){
	//System.out.print("Add two numbers together that equals to 20 but should be no greater then 20 and no less: ");
	
 if(x != 20){
	 System.out.println("Read instructions and try again!!!\n");
	 System.out.print("Add two numbers together that equals to 20 \n");
	System.out.print("but should be no greater then 20 and no less: ");
	 num = in.nextInt();
	 num1 = in.nextInt();
	 x = num + num1;
	 sum = num + num1; 
	System.out.printf("This equals %d.\n",sum);
}
 else if (x == 20){
	  x = 0; 
	  System.out.println("Nice Job!!!");
	 
 }
	}
	
	
}
}



