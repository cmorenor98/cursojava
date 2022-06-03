package org.indra.main;

import org.indra.services.HolaMundoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Programa {

	public static void main(String[] args) throws Exception {
		try(ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml")) {
			HolaMundoService service = (HolaMundoService)contexto.getBean("serviceProxy");		
//			System.out.println(service.demo());
			service.demo2(100);
		}
		

	}
	
}
