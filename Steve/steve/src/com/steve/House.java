package com.steve;

public class House {

	// Member variables
	Bedroom[] bedrooms;
	Kitchen kitchen;
	Bathroom[] bathrooms;
	Garage garage;
	
	//default (no parameters) constructor
	public House(){
		//1 bedroom, 1 bath, 1 kitchen and no garage
		bedrooms = new Bedroom[1];
		Bedroom br = new Bedroom();
		bedrooms[0] = br;
		
		bathrooms = new Bathroom[1];
		Bathroom bath = new Bathroom();
		bathrooms[0] = bath;
		
		kitchen = new Kitchen();
		
		garage = null;
	}
	
	//The uber constructor
	public House(Bedroom[] beds, Bathroom[] baths, int garageSize){
		this.bedrooms = beds;
		this.bathrooms = baths;
		this.kitchen =new Kitchen("Deluxe");
		this.garage = new Garage();
		this.garage.setSize(garageSize);
		
		}
	

	public Garage getGarage() {
		return garage;
	}
	public void setGarage(Garage garage){
		this.garage = garage;
	}
}
