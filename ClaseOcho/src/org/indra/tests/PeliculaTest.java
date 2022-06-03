package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.indra.models.Pelicula;
import org.indra.repository.PeliculaMockRepoFactory;
import org.indra.repository.PeliculaRepositoryFactory;
import org.indra.services.PeliculaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeliculaTest {

	@BeforeEach
	void setUp() throws Exception {
		PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
//		PeliculaRepositoryFactory.configureClass(PeliculaDbRepoFactory.class);
	}

	@Test
	void testAddPelicula() throws Exception {
		PeliculaService service = new PeliculaService();
		Pelicula p = new Pelicula();
		p.setTitulo("El señor de los anillos");
		p.setDirector("Peter Jackson");
		p.setDuracion(260);
		p.setFechaSalida(LocalDate.now());
		service.add(p);
		
		Pelicula pRecu = service.getByName("El señor de los anillos");
		assertEquals("El señor de los anillos", pRecu.getTitulo());
		assertEquals("Peter Jackson", pRecu.getDirector());
		assertEquals(260, pRecu.getDuracion());
		assertEquals(LocalDate.now(), pRecu.getFechaSalida());
	}
	
	@Test
	void testUpdatePelicula() throws Exception {
		PeliculaService service = new PeliculaService();
		
		Pelicula p= service.getById(1);
		p.setTitulo("Alicia en el pais de las maravillas");
		service.update(p);
		
		Pelicula laMisma = service.getById(1);
		assertEquals("Alicia en el pais de las maravillas", laMisma.getTitulo());
		assertEquals(160, laMisma.getDuracion());
	}
	
	@Test
	void testDeletePelicula() throws Exception {
		PeliculaService service = new PeliculaService();
		int numeroPeliculasAntes = service.getdAll().size();
		service.delete(2);
		int numeroPeliculasDespues = service.getdAll().size();
		assertEquals(numeroPeliculasAntes, numeroPeliculasDespues + 1);
	}

}
