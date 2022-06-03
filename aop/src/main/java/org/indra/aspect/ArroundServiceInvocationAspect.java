package org.indra.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ArroundServiceInvocationAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Antes de invocar el metodo " + invocation.getMethod().getName());
		Object result = invocation.proceed();
		System.out.println("Despues de invocar el metodo " + invocation.getMethod().getName());
		result = (Object)result + " Alterado";
		return result;
	}

}
