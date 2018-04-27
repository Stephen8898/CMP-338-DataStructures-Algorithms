package com.steve;

public class Beer {
	

		public void countDown (int num){
			
			if (num == 0) {
				System.out.println( "No bottles of beer on the wall,");
				System.out.println("no bottles of beer," );
				System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
				System.out.println("’cause there are no more bottles of beer on the wall!");
			}
			
			else if  (num > 0) {
				System.out.println(num + " bottles of beer on the wall,");
				System.out.println(num + " bottles of beer,");
				System.out.println("ya’ take one down, ya’ pass it around,");
				num-=1;
				System.out.println(num + " bottles of beer on the wall.\n");
				countDown(num);
			} 
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Beer b = new Beer();
			b.countDown(99);
		}

	}


