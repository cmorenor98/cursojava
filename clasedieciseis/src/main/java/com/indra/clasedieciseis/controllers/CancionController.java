package com.indra.clasedieciseis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.indra.clasedieciseis.models.*;
import com.indra.clasedieciseis.services.*;

@RestController
public class CancionController {

	@Autowired
	private ICancionService service;
	
//	@GetMapping("/api/cancion")
//	public List<Cancion> getAll() {
//		return repository.findAll();
//	}
	
	@GetMapping("/api/cancion")
	public ResponseEntity<List<Cancion>> getAll() {
		return new ResponseEntity<List<Cancion>>(this.service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/api/cancion/{id}")
	public ResponseEntity<Object> getById(@PathVariable(name = "id") int id) {
		try {
			return new ResponseEntity<Object>(this.service.getById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/api/cancion")
	public ResponseEntity<Object> add(@RequestBody Cancion cancion) {
		try {
			return new ResponseEntity<Object>(this.service.add(cancion), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/api/cancion/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) throws Exception {
		service.delete(id);
	}
	

}
