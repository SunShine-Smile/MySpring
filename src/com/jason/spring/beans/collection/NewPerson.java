package com.jason.spring.beans.collection;

import java.util.List;
import java.util.Map;

import com.jason.spring.beans.Car;

public class NewPerson {

	private String name;
	private String age;
	private Map<String, Car> cars;

	public Map<String, Car> getCars() {
		return cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

	public NewPerson() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
}
