package com.uhsnarp.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	// PointCut -> "execution(* PACKAGE.*.*(..))"
	@AfterReturning(value = "execution(* com.uhsnarp.spring.aop.springaop.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		// Advice
		LOGGER.info("{} Returned with value {}", joinPoint, result);
	}

	@AfterThrowing(value = "execution(* com.uhsnarp.spring.aop.springaop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		// Advice
		LOGGER.info("{} Returned with value {}", joinPoint, exception);
	}

	@After("execution(* com.uhsnarp.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		// Advice
		LOGGER.info("after execution of {}", joinPoint);
	}
}
