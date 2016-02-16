package com.jason.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	
	/**
	 * @Autowired 标注在成员变量上边 这样注解可以被子类继承
	 */
	@Autowired
	protected BaseRespository<T> respository;
	
	public void add() {
		System.out.println("add...");
		System.out.println(respository);
	}
}
