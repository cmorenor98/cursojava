package org.indra.clasequince.controllers;

import org.indra.clasequince.dto.*;
import org.indra.clasequince.dto.RespuestaError;
import org.indra.clasequince.models.*;
import org.indra.clasequince.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CancionController extends BaseController {

	@Autowired
	private ICancionService service;
	
	@PostMapping("/api/cancion")
	public Object nuevaCancion(@RequestBody Cancion cancion) {
		try {
			service.add(cancion);
			return new Exito(cancion);
		} catch (Exception e) {
			return new RespuestaError(e.getMessage());
		}
	}
	
	
//	public Response respuesta() {
//		
//	}
	
}
