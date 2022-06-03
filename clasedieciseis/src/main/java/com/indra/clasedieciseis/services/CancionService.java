package com.indra.clasedieciseis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.indra.clasedieciseis.models.*;
import com.indra.clasedieciseis.repositories.*;

@Service
public class CancionService implements ICancionService {

	@Autowired
	private CancionRepository repository;
	
	@Override
	public List<Cancion> getAll() {
		return repository.findAll();
	}

	@Override
	public Cancion getById(int id) throws Exception {
		return repository.findById(id).get();
	}

	@Override
	public Cancion add(Cancion cancion) throws Exception {
		if (cancion.getTitulo() == null || cancion.getTitulo().length() == 0) {
			throw new Exception("Falta el título de la cancion");
		}
		if (cancion.getAutor() == null || cancion.getAutor().length() == 0) {
			throw new Exception("Falta el autor de la cancion");
		}
		if (cancion.getDisco() == null || cancion.getDisco().length() == 0) {
			throw new Exception("Falta el disco de la cancion");
		}
		if (cancion.getSegundos() < 15) {
			throw new Exception("La cancion no puede ocupar menos de 15 segundos");
		}
		this.repository.save(cancion);
		
		return cancion;
	}

	@Override
	public void delete(int id) throws Exception {
		this.repository.deleteById(id);
		
	}
	
	

}
