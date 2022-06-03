package org.indra.repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.indra.models.Pelicula;

public class PeliculaMemoryRepository implements IPeliculaRepository {

	private List<Pelicula> repository = new ArrayList<Pelicula>();
	
//	public PeliculaMemoryRepository() {
//		Pelicula pelicula1 = new Pelicula() {{
//			setTitulo("Titanic");
//			setFecha(LocalDate.of(1995, Month.JUNE, 1));
//		}};
//		this.repository.add(pelicula1);
//	}
	
	@Override
	public void add(Pelicula pelicula) {
		this.repository.add(pelicula);
		pelicula.setId(repository.stream().mapToInt(p -> p.getId()).max().getAsInt() + 1);
	}

	@Override
	public Pelicula findById(int id) {
		return (Pelicula) this.repository.stream().filter(p -> p.getId() == id).findFirst().get();
	}

}
