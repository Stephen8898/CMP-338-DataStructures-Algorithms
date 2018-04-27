package com.steve;

 public class Homebuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Building default houses
		House houseOne = new House();
		House houseTwo = new House();
		House houseThree = new House();
		
		//Building uber houses
		Bedroom[] beds =new Bedroom[5];
		Bathroom[] baths = new Bathroom[5];
		int garageSize = 3;
		
		House houseUberOne = new House(beds, baths, garageSize);
		House houseUberTwo = new House(beds, baths, garageSize);
		House houseUberThree = new House(beds, baths, garageSize);
		
		System.out.println(houseUberOne.getGarage().getSize());
		System.out.println(houseUberTwo.getGarage().getSize());
	}

}
