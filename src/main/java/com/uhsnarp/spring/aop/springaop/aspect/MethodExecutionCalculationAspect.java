package com.uhsnarp.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	// PointCut -> "execution(* PACKAGE.*.*(..))"
	// @Around(value = "execution(*
	// com.uhsnarp.spring.aop.springaop.business.*.*(..))")
	@Around("com.uhsnarp.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		// Advice
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		//
		LOGGER.info("Time taken by {} is {}", joinPoint, timeTaken);
	}
}
