package org.indra.proyectoCarlosMoreno.services;

import java.util.List;

import org.indra.proyectoCarlosMoreno.models.Pelicula;



public interface IPeliculaService {

	List<Pelicula> getAll();

	Pelicula getById(int id) throws Exception;
	
	Pelicula add(Pelicula cancion) throws Exception;

	void delete(int id) throws Exception;

}
