package com.jason.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jason.spring.beans.annotation.TestObject;
import com.jason.spring.beans.annotation.respository.UserRespository;

@Service
public class UserService {
	@Autowired
	/**
	 * @Qualifier("UserRespositoryImpl") 如果UserRespositoryImpl 中没有指定装配哪一个 Bean，即 ("userRespository")，则可以用 @Qualifier 来标注
	 * 在setter方法中也可以用 @Qualifier 来标注，
	 * 也可以在setter的参数前用 @Qualifier 来标注
	 * 
	 * 
	 * 如果IOC容器中有多个兼容的Bean时，①、可以声明 bean的时候，Bean的名字和属性名或者字段名相一致 ②、使用 @Qualifier 注解
	 */
	private UserRespository userRespository;
	
	/**
	 * 假设 TestObject 不在 IOC 容器中，即 TestObject.java 中没有 @Component 注解
	 * 那么如果只用 @Autowired 会导致错误，所以在 @Autowired 参数中加上 required=false
	 */
	@Autowired(required=false)
	private TestObject testObject;
	
	/**
	 * 可以把上面的 @Autowired 也可以放在setter方法中
	 */
//	@Autowired
//	public void setUserRespository(UserRespository userRespository) {
//		this.userRespository = userRespository;
//	}
	public void add(){
		System.out.println("UserService add...");
		userRespository.save();
		System.out.println(testObject);
	}
}
