package org.indra.model;

import java.util.*;

public class Carpeta extends EntidadSistemaFicheros {
	
	private List<EntidadSistemaFicheros> hijos = new ArrayList<EntidadSistemaFicheros>();
	
	
	public void Add(EntidadSistemaFicheros hijo) {
		if (!hijos.contains(hijo)) {
			if (miradoPor != null)  miradoPor.notificar("Agregando " + hijo.getNombre() + " a la carpeta " + this.getNombre());
			this.hijos.add(hijo);
		}
	}

	public Carpeta(String nombre) {
		super(nombre);
		if (miradoPor != null)  miradoPor.notificar("Creando carpeta " + nombre);
	}
	
	@Override
	public int calcularTamaño() {
		int tamaño = 0;
		for (EntidadSistemaFicheros hijo: hijos) {
			tamaño += hijo.calcularTamaño();
		}
		return tamaño;
	}

}
