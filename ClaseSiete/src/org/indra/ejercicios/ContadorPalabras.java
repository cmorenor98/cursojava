package org.indra.ejercicios;

import java.util.Dictionary;
import java.util.Hashtable;

public class ContadorPalabras {

	private String[] palabras;
	private Dictionary<String, Integer> diccionario = new Hashtable<String, Integer>();
	
	
	public ContadorPalabras(String cadena) {
		palabras = cadena.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			if (diccionario.get(palabras[i]) != null) {
				diccionario.put(palabras[i], diccionario.get(palabras[i]) + 1);
			} else {
				diccionario.put(palabras[i], 1);
			}
		}	
	}
	
	public int getOcurrencias(String palabra) {
		return (diccionario.get(palabra) == null ? 0 : diccionario.get(palabra));	
	}
	
	
	
}
