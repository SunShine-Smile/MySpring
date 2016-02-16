package com.jason.spring.beans.autowire;

public class Car {
	private String brand;
	private double price;

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public Car() {
		super();
		System.out.println("Car's constructor...");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
