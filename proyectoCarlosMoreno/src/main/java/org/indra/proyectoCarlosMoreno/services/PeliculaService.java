package org.indra.proyectoCarlosMoreno.services;

import java.util.List;

import org.indra.proyectoCarlosMoreno.models.Pelicula;
import org.indra.proyectoCarlosMoreno.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class PeliculaService implements IPeliculaService {

	@Autowired
	private PeliculaRepository repository;
	
	@Override
	public List<Pelicula> getAll() {
		return repository.findAll();
	}
	
	@Override
	public Pelicula getById(int id) throws Exception {
		return repository.findById(id).get();
	}

	@Override
	public Pelicula add(Pelicula pelicula) throws Exception {
		// Validaciones
		if (pelicula.getTitulo() == null || pelicula.getTitulo().length() == 0) {
			throw new Exception("Falta el título de la pelicula");
		}
		if (pelicula.getDirector() == null || pelicula.getDirector().length() == 0) {
			throw new Exception("Falta el director de la pelicula");
		}
		if (pelicula.getDuracion() < 10) {
			throw new Exception("La pelicula no puede durar menos de 10 minutos");
		}
		this.repository.save(pelicula);
		return pelicula;
	}
	
	@Override
	public void delete(int id) throws Exception {
		this.repository.deleteById(id);
		
	}
	
}
