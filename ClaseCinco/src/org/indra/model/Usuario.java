package org.indra.model;

public class Usuario extends ObjetoDeNegocio {

	private String nombre;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void validar() throws Exception {
		super.validar();
		if ((nombre == null) || (nombre.length() < 3)) {
			throw new Exception("El nombre esta vacio o es demasiado corto");
		}
	}

	@Override
	public String toString() {
		return "[" + this.getId() + ", " + this.getNombre() + "]";
	}

	
}
