package com.uhsnarp.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uhsnarp.spring.aop.springaop.aspect.TrackTime;
import com.uhsnarp.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {
	@Autowired
	Dao1 data1;

	@TrackTime
	public String calculateSomething() {
		return data1.retrieveSomething();
	}
}
