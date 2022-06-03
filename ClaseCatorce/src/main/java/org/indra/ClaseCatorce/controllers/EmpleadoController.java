package org.indra.ClaseCatorce.controllers;

import java.util.*;
import org.indra.ClaseCatorce.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpleadoController {

	List<Empleado> empleados = new ArrayList<Empleado>();
	
	public EmpleadoController() {
		empleados.add(new Empleado(1, "Carlos", "Moreno"));
		empleados.add(new Empleado(2, "Esteban", "Calabria"));
		empleados.add(new Empleado(3, "Ernesto", "Martinez"));
	}
	
	@GetMapping("/api/empleado")
	public List<Empleado> getAll() {
		return empleados;
	}
	
	@GetMapping("/api/empleado/{id}")
	public Empleado getById(@PathVariable(name = "id") int id) {
		return empleados.stream().filter(e -> e.getId() == id).findFirst().get();
	}
	
	@GetMapping("/api/empleado/echo")
	public Empleado echoEmpleado(Empleado empleado) {
		return empleado;
	}
	
	@PostMapping("/api/empleado/add")
	public Empleado addEmpleado(@RequestBody Empleado empleado) {
		empleado.setId(empleados.size() + 1);
		empleados.add(empleado);
		return empleado;
	}
	
	@GetMapping("/api/empleado/remove")
	public Empleado deleteEmpleado(@RequestParam int id) {
		Empleado aux = empleados.stream().filter(e -> e.getId() == id).findFirst().get();
		empleados.remove(aux);
		return aux;
	}
	
}
