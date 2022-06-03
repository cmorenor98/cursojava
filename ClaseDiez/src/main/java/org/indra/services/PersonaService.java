package org.indra.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.indra.models.Persona;

public class PersonaService implements IPersonaService {

	private String connectionString;
	
	@Override
	public void add(Persona persona) {
		//TODO:
		try {
			Connection connection = DriverManager.getConnection(this.connectionString);
			
			// Conecto con la base.
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
