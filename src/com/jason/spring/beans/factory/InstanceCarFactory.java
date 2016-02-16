package com.jason.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：实例工厂的方法，即先需要创建工厂本身，再调用工厂的实例方法来返回bean的实例
 */
public class InstanceCarFactory {
	private Map<String,Car> cars=null;
	
	public InstanceCarFactory() {
		// TODO Auto-generated constructor stub
		cars=new HashMap<String,Car>();
		cars.put("BaoMa", new Car("BaoMa", 500000));
		cars.put("BenChi",new Car("BenChi", 600000));
	}
	
	public Car getCar(String name)
	{
		return cars.get(name);
	}
}
