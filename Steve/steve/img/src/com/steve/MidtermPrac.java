package com.steve;
import java.util.*;
public class MidtermPrac {

 /*This program prompts for a letter then takes a number 
and gives the corresponding letter to the number.

	*/
	
	public void instruct(){
		System.out.println("Instructions: ");
		System.out.print(" This codes purpose is to show character length and to\n ");
		System.out.print("prompt a user (you) to pick a number within a range and it\n");
		System.out.println(" will give you a corresponding letter value within the word.\n");
	}
	//This method find the corresponding number to the letter
	public char charChoice(String x, int y){
		 String charAlph = x;
		 return charAlph.charAt(y);
	}
	  
	/*
	public void errorBound(String a, int b){
		int count = a.length();
		if (count != b){
			//instruct();
			System.err.println("Read the instructions and try again!!!");
	}else{}
}
*/
	//This method measures word length 
	public int wordLength(String m){
		String wordT = m.trim();
		int num = wordT.length();
		return num -1;
		
	}
	
/*	
	public void arrayTable(){
		System.out.println("Index\tTable");
	int x[]={2,4,6,8,10,12,14};
		for(int y=0; y < x.length; y++){
			System.out.println(y + "\t" + x[y]);
		}
	}
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		MidtermPrac mp = new MidtermPrac();
		mp.instruct();
		System.out.print("Enter your word here: ");
		String word = in.nextLine();
		int wordL = mp.wordLength(word);
		System.out.printf("Your word length is 0-%d characters long\n",wordL);
		System.out.print("Enter your number here: ");
		int num = in.nextInt();
		int x = 1;
		while (x <= 1){
		if (num == wordL){
		System.out.println("Error number out of range, please try again.\n");
		mp.instruct();
		
		}else {
			char letter = mp.charChoice(word,num);
			System.out.printf("You corresponding letter is: %s", letter);
			x=2;
		}
//		mp.errorBound(word, num);} 
		
		
		
		
		//mp.errorBound(word, num);
		//mp.arrayTable();
		
		
	}

 }
}