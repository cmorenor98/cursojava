package org.indra.main;

public class Programa {

	public static void main(String[] args) {
		Automovil auto = new Automovil("Seat", "Ibiza") {{
			setId(1);
			setKilometros(160000);
		}};
		System.out.println(auto);
		
		Reloj reloj = Reloj.builder().marca("Casio").modelo("XRS100").build();
		System.out.println(reloj);
		reloj.salvar();
		
		Persona persona = new Persona("Juan", "Perez");
		System.out.println(persona);
	}

}
