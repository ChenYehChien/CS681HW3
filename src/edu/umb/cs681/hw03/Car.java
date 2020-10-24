package edu.umb.cs681.hw03;

public class Car {
	private String make, model;
	private int mileage, year;
	private float price;
	
	private int dominationCount;
	
	public Car(String make, String model, int mileage, int year, float price) {
		this.make = make;
		this.model = model;
		this.mileage = mileage;
		this.year = year;
		this.price = price;
	}
	
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getMileage() {
		return this.mileage;
	}
	public int getYear() {
		return this.year;
	}
	public float getPrice() {
		return this.price;
	}
	
	public int getDominationCount() {
		return this.dominationCount;
	}
	public void setDominationCount(int dominationCount) {
		this.dominationCount = dominationCount;
	}
	
}