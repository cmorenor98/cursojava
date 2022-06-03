package org.indra.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterServiceInvocationAspect implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(String.format("El método %s de la clase %s retorna %s", 
				method.getName(), 
				target.getClass().toString(),
				returnValue.toString()));
	}

}
