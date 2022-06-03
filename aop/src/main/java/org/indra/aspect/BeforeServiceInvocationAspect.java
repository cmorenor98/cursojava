package org.indra.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeServiceInvocationAspect implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(String.format("Se invoca el método %s de la clase %s", 
				method.getName(), 
				target.getClass().toString()));
	}

}
