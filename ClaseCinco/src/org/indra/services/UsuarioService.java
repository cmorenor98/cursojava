package org.indra.services;

import org.indra.dto.RegistroUsuarioDTO;
import org.indra.model.*;
import org.indra.persistence.IUsuarioRepositorio;
import org.indra.persistence.UsuarioRepositorioMock;

public class UsuarioService {

	private IUsuarioRepositorio repo;
	
	public UsuarioService(IUsuarioRepositorio repo) {
		this.repo = repo;
	}
	
	public Usuario registrarUsuarioNuevo(RegistroUsuarioDTO registro) throws Exception {
		// TODO:

		// - Validar que no existe un Usuario con ese nombre.
		if (this.repo.buscarPorNombre(registro.getNombreDeseado()) != null) {
			throw new Exception("Usuario ya existe.");
		}
				
		Usuario nuevo = new Usuario(registro.getNombreDeseado());
		// - Validar que el nombre de Usuario es no vacio
		nuevo.validar();
				
		// - Añadir el nuevo Usuario a la BD.
		this.repo.add(nuevo);
		return nuevo;
	}
}
