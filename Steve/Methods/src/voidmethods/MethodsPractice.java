package voidmethods;

import java.util.Scanner; 

public class MethodsPractice {

	public static int numChar = 89;  
	private int temp = 0;
	//private int numChar = 0;
	/*public void methodNum1 (){
		System.out.println("Hello\n");
		}*/
	
	private int num = 5;
	private String name = "I'm Stephen\n";
	
	public int methodReturn (){
	    System.out.println(num);
	    System.out.println(numChar);
	    return num;
	    
	}
     /*public void methodChars (String chars ) {
    	 System.out.println(chars);
     } */
    /* public String getName () {
    	 System.out.println(name);
    	 return name;
     }*/     
     
      public void inputMethod(){
     Scanner in = new Scanner(System.in);
      	System.out.print("Enter data here: ");
      	int temp = in.nextInt();
      	System.out.print(temp +"\n");
      	numChar = temp;
    /*  Scanner in2 = new Scanner(System.in);	
      System.out.print("Enter word in here: ");
      	String wordChar =in2.nextLine();
   */
      }

      	public void conditionalMethod (int numChar ) {    
    	 System.out.println(numChar);
    	 if (numChar >= num)
      {System.out.println("You did it!\n");}
      else 
          {System.out.println("Try again!\n");}	
     }
    
     public static void main(String[] args){	
      MethodsPractice mp = new MethodsPractice();
        mp.inputMethod();
    	//String chars = "Keep writing these methods\n";
    	mp.conditionalMethod(numChar);
    	//mp.methodNum1();
		mp.methodReturn();
		//mp.methodChars(chars);
		//mp.getName();
		
     }
}

