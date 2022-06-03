package org.indra.services;

import java.util.List;

import org.indra.models.Pelicula;
import org.indra.repository.*;

public class PeliculaService {
	
	IPeliculaRepository repo;

	public PeliculaService() throws Exception {
		this.repo = PeliculaRepositoryFactory.getInstance().createRepository();
	}

	public void add(Pelicula pelicula) throws Exception {
		// Faltaria las reglas de negocio.
		// Faltaria la validacion de la pelicula por ejemplo.
		repo.add(pelicula);
	}
	public Pelicula getById(int id) throws Exception {
		// Podríamos poner un manejo de errores.
		return this.repo.findById(id);
	}
	
	public Pelicula getByName(String name) throws Exception {
		return this.repo.findByName(name);
	}
	
	public void update(Pelicula pelicula) throws Exception {
		this.repo.update(pelicula);
	}
	
	public void delete(int id) throws Exception {
		this.repo.delete(id);
	}
	
	public List<Pelicula> getdAll() throws Exception {
		return this.repo.findAll();
	}
}
