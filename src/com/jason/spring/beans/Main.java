package com.jason.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/**
		 * 方法一
		 */
		// 创建HelloWorld的一个对象
		// HelloWorld helloWorld=new HelloWorld();
		// 给name属性赋值
		// helloWorld.setName("Jason");
		// 调用helloWorld的hello方法
		// helloWorld.hello();

		/**
		 * 方法二
		 */
		// 创建Spring的IOC对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从IOC容器中获取bean实例
		// HelloWorld helloWorld= (HelloWorld) ctx.getBean("helloWorld");
		// 调用hello方法
		// helloWorld.hello();

		Car car = (Car) ctx.getBean("car");
		
		//第二种方法
//		Car car2=ctx.getBean(Car.class);
		System.out.println(car);
		
		Car car1=(Car) ctx.getBean("car1");
		System.out.println(car1);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
		//如果Person中既有属性注入方式又有构造器方式注入，则必须有无参数构造器
		Person person2=(Person) ctx.getBean("person2");
		System.out.println(person2);
	}

}
