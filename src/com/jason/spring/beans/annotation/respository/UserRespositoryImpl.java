package com.jason.spring.beans.annotation.respository;

import org.springframework.stereotype.Repository;

@Repository("userRespository")
public class UserRespositoryImpl implements UserRespository {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRespository Save...");
	}

}
