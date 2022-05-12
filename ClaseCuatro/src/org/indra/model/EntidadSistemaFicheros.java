package org.indra.model;

public abstract class EntidadSistemaFicheros {

	protected static IObserver miradoPor = null;
	
	public static void RegistrarQuienMeMira(IObserver obs) {
//		EntidadSistemaFicheros.miradoPor = obs;  <<Tambi�n se puede poner as�>>
		miradoPor = obs;
	}
	
	
	private String nombre = null;
	
	
	public EntidadSistemaFicheros(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int calcularTama�o();
	
}
