package org.indra.repository;

import java.util.List;

import org.indra.models.Pelicula;

public interface IPeliculaRepository {

	List<Pelicula> findAll() throws Exception;
	
	Pelicula findById(int id) throws Exception;
	
	Pelicula findByName(String name) throws Exception;
	
	void add(Pelicula pelicula) throws Exception;
	
	void delete(int id) throws Exception;
	
	void update(Pelicula pelicula) throws Exception;
	
}
