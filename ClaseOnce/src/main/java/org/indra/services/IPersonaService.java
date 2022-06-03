package org.indra.services;

import java.util.List;

import org.indra.models.*;

public interface IPersonaService {

	public void add(Persona persona);
	
	public List<Persona> getAll();
	
	public void delete(int id);
}
