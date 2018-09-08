package com.uhsnarp.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.uhsnarp.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {
	}

	@Pointcut("execution(* com.uhsnarp.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {
	}

	@Pointcut("com.uhsnarp.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.uhsnarp.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {
	}

	@Pointcut("bean(dao*)")
	public void beanStartingWithDao() {
	}

	@Pointcut("bean(*dao*)")
	public void beanContainingWithDao() {
	}

	@Pointcut("within(com.uhsnarp.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {
	}

	@Pointcut("@annotation(com.uhsnarp.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {
	}
}
