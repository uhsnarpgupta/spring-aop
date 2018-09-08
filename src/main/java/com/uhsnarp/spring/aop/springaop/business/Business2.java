package com.uhsnarp.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uhsnarp.spring.aop.springaop.data.Dao2;

@Service
public class Business2 {
	@Autowired
	Dao2 data2;

	public String calculateSomething() {
		return data2.retrieveSomething();
	}
}
