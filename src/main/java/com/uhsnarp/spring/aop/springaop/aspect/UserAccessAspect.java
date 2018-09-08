package com.uhsnarp.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	//PointCut -> "execution(* PACKAGE.*.*(..))"
	@Before("com.uhsnarp.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// Advice
		LOGGER.info("Check for user access");

		LOGGER.info("Intecepted method call - {}", joinPoint);
	}
}
