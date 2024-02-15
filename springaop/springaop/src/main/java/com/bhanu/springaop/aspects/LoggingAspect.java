package com.bhanu.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
@Before("execution(* com.bhanu.springaop.product.ProductService.multiply(..))")
public void logBefore(JoinPoint joinpoint) {
	System.out.println("Before invoking the method");
}
@After("execution(* com.bhanu.springaop.product.ProductService.multiply(..))")
public void logAfter(JoinPoint joinpoint) {
	System.out.println("After invoking the method");
}
@Around("execution(* com.bhanu.springaop.product.ProductService.multiply(..))")
public void logAround(JoinPoint joinpoint) {
	System.out.println("Around");
}
@AfterReturning("execution(* com.bhanu.springaop.product.ProductService.multiply(..))")
public void logAfterReturn(JoinPoint joinpoint) {
	System.out.println("AfterReturning");
}

@AfterThrowing("execution(* com.bhanu.springaop.product.ProductService.multiply(..))")
public void logAfterThrowing(JoinPoint joinpoint) {
	System.out.println("AfterThrowing");
}
}
