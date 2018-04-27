package com.steve;

import java.util.Scanner;

public class Homework2 {
	public char randomlySelectedLetter(){
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	int randomNumber = (int) (Math.random()*25);
	
	return alphabet.charAt(randomNumber);
	}
	
	public void multiple(int x, int y) {
		if ( y % x == 0) { 
			System.out.println("True, The number " + y + " is multiple of " + x);
		}else {System.out.println("False The number " + y + " is not multiple of " + x);}
		}
		public String monthText(int a){
			if (a == 1) {
				return "January";
			} else if (a == 2) {
				return "Feburary";
			}else if (a == 3) {
				return "March";
			}else if (a == 4) {
				return "April";
			}else if (a == 5) {
				return "May";
			}else if (a == 6) {
				return "June";
			}else if (a == 7) {
				return "July";
			}else if (a == 8) {
				return "August";
			}else if (a == 9) {
				return "September";
			}else if (a == 10) {
				return "Octuber";
			}else if (a == 11) {
				return "November";
			}else if (a == 12) {
				return "December";
			} else {System.err.println("Invalid input"); return "No calender";}
		}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Homework2 m = new Homework2();

        // (1)
		System.out.println("Given two numbers, check if the second is multiple of the first.");
		System.out.print("List two numbers (separated by comma): ");
		String numbers = in.nextLine();
		int num1 = Integer.parseInt(numbers.split(",")[0].trim());
		int num2 = Integer.parseInt(numbers.split(",")[1].trim());
		System.out.printf("Checking if %d is multiple of %d\n", num2, num1);
		m.multiple(num1, num2);

        //(2)
        System.out.print("Type number (1-12): ");
        int monthNum = in.nextInt();
		String month = m.monthText(monthNum);
		System.out.printf("%s is the %d month of the year.\n", month, monthNum);

		//(3)
		char letter = m.randomlySelectedLetter();
		System.out.printf("The letter %s was randomly selected.\n", letter);


	} 

	}
	




	


