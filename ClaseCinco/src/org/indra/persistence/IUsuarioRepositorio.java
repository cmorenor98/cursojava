package org.indra.persistence;

import java.util.List;

import org.indra.model.Usuario;

public interface IUsuarioRepositorio {

	public Usuario buscarPorNombre(String nombre);
	
	public void add(Usuario usuario);
	
	public List<Usuario> buscarTodos();
	
	// mas ...
	
}
