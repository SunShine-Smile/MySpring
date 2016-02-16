package com.jason.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jason.spring.beans.annotation.controller.UserController;
import com.jason.spring.beans.annotation.respository.UserRespository;
import com.jason.spring.beans.annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestObject testObject=(TestObject) context.getBean("testObject");
//		System.out.println(testObject);
		
		UserController userController=(UserController) context.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserRespository userRespository=(UserRespository) context.getBean("userRespository");
//		System.out.println(userRespository);
//		
//		UserService userService=(UserService) context.getBean("userService");
//		System.out.println(userService);
	}
}
