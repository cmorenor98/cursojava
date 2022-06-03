package org.indra.services;

import org.indra.models.Pelicula;

public interface IPeliculaService {

	void add(Pelicula pelicula);
	
	Pelicula findById(int id);
	
}
