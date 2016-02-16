package com.jason.spring.beans;

public class Car {
	private String corp;
	private String brand;
	private double price;
	private int speed;

	public Car(String corp, String brand, int speed) {
		super();
		this.corp = corp;
		this.brand = brand;
		this.speed = speed;
	}

	public Car(String corp, String brand, double price) {
		super();
		this.corp = corp;
		this.brand = brand;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [corp=" + corp + ", brand=" + brand + ", price=" + price + ", speed=" + speed + "]";
	}

}
