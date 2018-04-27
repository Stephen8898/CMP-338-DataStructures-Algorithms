package voidmethods;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrimeFunc // extends JFrame  
{

	static Scanner keyboard = new  Scanner(System.in);
	
	public static long inNum(){
		System.out.print("Enter a Number: ");
		long input = keyboard.nextInt();
		return input; 
	}
	
	public static boolean isPrime(long a){
		if (a <= 1)
			return false;
		else  for (int i = 2; i * i <= a; i++) 
			if (a % i == 0) return false;
				return true;
	}
			
	 public static boolean isComposite(long a){
		 return !isPrime(a) ? true : false;
	 }
	 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(isPrime(inNum()));
			System.out.println(isComposite(inNum()));
			//input(new JFrame());

	}
	



}
