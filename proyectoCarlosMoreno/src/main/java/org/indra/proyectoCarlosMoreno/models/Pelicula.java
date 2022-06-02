package org.indra.proyectoCarlosMoreno.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "Pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Titulo")
	private String titulo;
	
	@Column(name = "Director")
	private String director;
	
	@Column(name = "Duracion")
	private int duracion;  // Duracion en minutos.
	
}
