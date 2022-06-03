package org.indra.aspect;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionServiceInvocationAspect implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		System.out.println("Se lanz� una excepci�n");
	}
	
}
