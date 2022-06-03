package org.indra.main;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.indra.models.*;
import org.indra.services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Cleanup;

public class Program {

	public static void main(String[] args) {
		System.out.println("Bienvenidos");
		
		// Configuracion de Hibernate
		// MApeo con archivos xml
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		// Mapeos con anotaciones
//		SessionFactory sessionFactory = new AnnotationConfiguration()
//				.configure()
//				.addPackage("org.indra.model")
//				.addAnnotatedClass(Libro.class)
//				.buildSessionFactory();
		
		ServiceBase.configureSessionFactory(sessionFactory);
		
		
		// Configuracion Spring
		@Cleanup ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		ILibroService service = (ILibroService)context.getBean("libroService");
//		ILibroService service = new LibroService();
		
//		Libro pilares = new Libro();
//		pilares.setTitulo("Los pilares de la tierra");
//		pilares.setEscritor("Ken Follet");
		
//		Libro libro = new Libro();
//		libro.setTitulo("Juego de tronos");
//		libro.setEscritor("George RR Martin");

		
		Libro libro = new Libro();
		libro.setTitulo("El Hobbit");
		libro.setEscritor("J.R. Tolkien");
		service.add(libro);
		
		System.out.println("Libro salvado en la base");
	}
}
