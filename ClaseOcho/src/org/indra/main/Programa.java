package org.indra.main;

import java.time.LocalDate;

import org.indra.models.Pelicula;
import org.indra.repository.*;
import org.indra.services.PeliculaService;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		//------- CONFIGURACIÓN -----------------------------------------------
		// Aqui se configura nuestra aplicacion y sus dependencias
		// Aqui definimos quin depende de quien
		PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
//		PeliculaRepositoryFactory.configureClass(PeliculaDbRepoFactory.class);
		
		//-------- EJECUCION --------------------------------------------------
		// Un avez que tengo todo configurado, ejecuto mi aplicacion normalmente.
		PeliculaService service = new PeliculaService();
		Pelicula p = new Pelicula();
		p.setTitulo("El señor de los anillos");
		p.setDirector("Peter Jackson");
		p.setDuracion(260);
		p.setFechaSalida(LocalDate.now());
		service.add(p);
	}
}
