package org.indra.persistence;

import java.util.ArrayList;
import java.util.List;

import org.indra.model.Usuario;

public class UsuarioRepositorioMock implements IUsuarioRepositorio {

	List<Usuario> usuarios = new ArrayList<Usuario>() {{
		new Usuario("alice");
		new Usuario("bob");
		new Usuario("charles");
	}};
	
	public Usuario buscarPorNombre(String nombre) {
		Usuario result = null;
		for (Usuario actual : this.usuarios) {
			if (actual.getNombre().equals(nombre)) {
				result = actual;
			}
		}
		return result;
	}
	
	public void add(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	@Override
	public List<Usuario> buscarTodos() {
		return this.usuarios;
	}
}
