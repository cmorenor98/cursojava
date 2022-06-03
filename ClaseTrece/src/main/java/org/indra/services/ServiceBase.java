package org.indra.services;

import org.hibernate.SessionFactory;

public class ServiceBase {

	protected static SessionFactory sessionFactory;
	
	public static void configureSessionFactory(SessionFactory factory) {
		ServiceBase.sessionFactory = factory;
	}
}
