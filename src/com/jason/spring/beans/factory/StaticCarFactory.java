package com.jason.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回bean实例
 */
public class StaticCarFactory {

	private static Map<String, Car> cars=new HashMap<String,Car>();
	
	static{
		cars.put("BaoMa", new Car("BaoMa", 1000000));
		cars.put("BenChi",new Car("BenChi", 1500000));
	}
	//静态工厂方法
	public static Car getCar(String name)
	{
		return cars.get(name);
	}
}
