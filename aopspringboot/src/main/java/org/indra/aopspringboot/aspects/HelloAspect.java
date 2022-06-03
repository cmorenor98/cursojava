package org.indra.aopspringboot.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

	@Pointcut("execution(* org.indra.aopspringboot.services.HelloAspectService.*())")
	public void beforeServiceExecutes() {
	}
	
	@Before("beforeServiceExecutes()")
	public void myadvice(JoinPoint jp) {
		System.out.println("Antes de ejecutar el servicio " + jp.getSignature());
	}
	
}
