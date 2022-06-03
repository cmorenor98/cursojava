package org.indra.main;

import java.util.ArrayList;
import java.util.HashMap;

import org.indra.services.GeografiaService;
import org.indra.services.IGeografiaService;
import org.indra.services.IPersonaService;
import org.indra.services.PersonaService;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {

	@SuppressWarnings("serial")
	@Bean
	public IGeografiaService geografiaService() {
		GeografiaService service = new GeografiaService();
		service.setComunidadesAutonomas(
				new ArrayList<String>() {{
					add("Madrid");
					add("Andalucia");
					add("Asturias");
					add("Galicia");
					add("Cantabria");
				}}
		);
		
		service.setProvincias(new HashMap<String, String>() {{
				put("Madrid", "Madrid");
				put("Andalucia", "Sevilla, Huelva, Cadiz, Malaga");
				put("Asturias", "Asturias");
			}}			
		);
		
		
		return service;
	}
	
	@Bean
	public IPersonaService personaService() {
		
		return new PersonaService() {{
			setConnectionString("jdbc:sqlite:C:/sqlite/indragram.db");
		}};
	}
}
