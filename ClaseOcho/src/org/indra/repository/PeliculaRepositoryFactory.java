package org.indra.repository;

public abstract class PeliculaRepositoryFactory {

	// Estamos implementando el patron abstract factory.
	
	public abstract IPeliculaRepository createRepository() throws Exception;
	
	private static Class repositoryClass = null;
	
	
	public static void configureClass(Class repositoryClass) {
		PeliculaRepositoryFactory.repositoryClass = repositoryClass;
	}
	
	
	private static PeliculaRepositoryFactory instance;
	
	// Implementacion del patron singleton
	public static PeliculaRepositoryFactory getInstance() throws Exception {
		if (PeliculaRepositoryFactory.repositoryClass == null) throw new Exception("PeliculaRepositoryFactory not configured");
		
		if(PeliculaRepositoryFactory.instance == null) {
			PeliculaRepositoryFactory.instance = (PeliculaRepositoryFactory) PeliculaRepositoryFactory.repositoryClass.newInstance();
		}
		
		return (PeliculaRepositoryFactory)PeliculaRepositoryFactory.repositoryClass.newInstance();
	}
}
