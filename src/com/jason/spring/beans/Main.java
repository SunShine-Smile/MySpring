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
		
		System.out.println(getAge(8));
		System.out.println(returnStr(1001));
	}

	public static int getAge(int num)
	{
		if(num==1)
			return 10;
		else
			return getAge(num-1)+2;
	}
	
	public static String returnStr(int num)
	{
		if(num>99999||num<0){
			return "请输入5位以内的自然数";
		}
		String [] str={"零","一","二","三","四","五","六","七","八","九"};
		String [] sss={"","十","百","千","万"};
		
		StringBuilder sb=new StringBuilder();
		String s=String.valueOf(num);
		System.out.println(s);
		String ss="";
		int counter = s.length();
		for(int i=0;i<s.length();i++)
		{
			ss=str[Integer.parseInt(String.valueOf(s.charAt(i)))];
			sb.append(ss);
			
			if("零".equals(ss)){
				counter--;
			}
			else{
				sb.append(sss[--counter]);
			}
		}
		return sb.toString();
	}
}
