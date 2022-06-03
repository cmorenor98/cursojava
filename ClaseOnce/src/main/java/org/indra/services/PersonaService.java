package org.indra.services;

import java.util.List;

import org.indra.models.Persona;
import org.indra.persistence.IPersonaRepository;
import org.indra.persistence.PersonaJdbcRepository;

public class PersonaService implements IPersonaService {

	private IPersonaRepository repository = new PersonaJdbcRepository();
	
	
	public void add(Persona persona) {
		try {
			repository.add(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public List<Persona> getAll() {
		return null;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
