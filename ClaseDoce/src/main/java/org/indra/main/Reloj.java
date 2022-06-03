package org.indra.main;

import java.io.FileWriter;

import lombok.*;

@Builder
@ToString
public class Reloj {

	private @NonNull String marca;
	private @NonNull String modelo;
	
	@SneakyThrows
	public void salvar() {
		var nombreArchivo = "reloj.txt";
		@Cleanup FileWriter writer = new FileWriter("reloj.txt");
		writer.write(this.toString());
	}
}
