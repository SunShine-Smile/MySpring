package com.jason.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jason.spring.beans.autowire.Address;
import com.jason.spring.beans.autowire.Car;
import com.jason.spring.beans.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-relation.xml");
		
		Car car=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		System.out.println(car==car2);
	}
}
