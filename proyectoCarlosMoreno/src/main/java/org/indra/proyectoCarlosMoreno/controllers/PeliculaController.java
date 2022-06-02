package org.indra.proyectoCarlosMoreno.controllers;

import java.util.List;

import org.indra.proyectoCarlosMoreno.models.Pelicula;
import org.indra.proyectoCarlosMoreno.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PeliculaController {

	@Autowired
	private IPeliculaService service;
	
	@GetMapping("/pelicula")
	public ResponseEntity<List<Pelicula>> getAll() {
		return new ResponseEntity<List<Pelicula>>(this.service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/pelicula/{id}")
	public ResponseEntity<Object> getById(@PathVariable(name = "id") int id) {
		try {
			return new ResponseEntity<Object>(this.service.getById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/pelicula")
	public ResponseEntity<Object> add(@RequestBody Pelicula pelicula) {
		try {
			return new ResponseEntity<Object>(this.service.add(pelicula), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/pelicula/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) throws Exception {
		service.delete(id);
	}
	
}
