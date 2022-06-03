package org.indra.model;

import java.util.ArrayList;
import java.util.List;

public class Posteo extends ObjetoDeNegocio{

	private String contenido;	
	private Usuario autor;
	private List<Comentario> comentario = new ArrayList<Comentario>();

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Usuario getAutor() {
		return autor;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

}
