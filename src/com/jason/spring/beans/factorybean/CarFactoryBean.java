package com.jason.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

//自定义的 XXFactoryBean需要实现spring提供的FactoryBean接口
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * 返回bean的对象
	 */
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand,500000);
	}

	/**
	 * 返回bean实例的类型
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	/**
	 * 是不是单实例的
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
