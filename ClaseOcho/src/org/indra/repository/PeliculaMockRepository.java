package org.indra.repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

import org.indra.models.Pelicula;

public class PeliculaMockRepository implements IPeliculaRepository {
	
	private List<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	public PeliculaMockRepository() throws Exception {
		this.add(new Pelicula("La momia", 160, LocalDate.of(1996, Month.JUNE, 2) ,"Sam Reimi"));
		this.add(new Pelicula("Doctor Strange", 200, LocalDate.of(2022, Month.MAY, 2), "Sam Reimi"));
		this.add(new Pelicula("Avatar", 220, LocalDate.of(2009, Month.MAY, 2), "James Cameron"));
	}

	@Override
	public List<Pelicula> findAll() throws Exception {
		return this.peliculas;
	}

	@Override
	public Pelicula findById(int id) throws Exception {
		return peliculas.stream().filter(p -> p.getId()==id ).findFirst().get();
	}

	@Override
	public Pelicula findByName(String name) throws Exception {
		return peliculas.stream().filter(p -> p.getTitulo().equals(name)).findFirst().get();
	}

	@Override
	public void add(Pelicula pelicula) throws Exception {
		peliculas.add(pelicula);
		
		pelicula.setId(this.peliculas.stream().mapToInt(p -> p.getId()).max().getAsInt() + 1);
	}

	@Override
	public void delete(int id) throws Exception {
		int index = this.peliculas.indexOf(this.peliculas.stream().filter( p -> p.getId() == id).findFirst().get());
        this.peliculas.remove(index);
        
//		Pelicula p = this.peliculas.stream().filter(p -> p.getId() == id).findFirst().get();
//		this.peliculas.remove(p);
	}

	@Override
	public void update(Pelicula pelicula) throws Exception {
		this.delete(pelicula.getId());
		this.peliculas.add(pelicula);
	}

}
