package org.indra.model;

public class Comentario extends ObjetoDeNegocio {

	private String texto;
	private Usuario autor;
	private boolean inapropiado = false;
	private IEstrategiaModeracion moderador;
	
	public Comentario(String texto, Usuario autor) {
		super();
		this.texto = texto;
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public Usuario getAutor() {
		return autor;
	}
	

	// Alguien desde fuera define el algoritmo a utilizar
	void setEstrategiaModeracion(IEstrategiaModeracion estrategia) {
		this.moderador = estrategia;
	}
	
	public void moderar() {
		if (this.moderador != null) {
			inapropiado = !this.moderador.esApropiado(this.texto);
		}
	}
	
}
