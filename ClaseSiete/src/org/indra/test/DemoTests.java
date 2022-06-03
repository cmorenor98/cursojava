package org.indra.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.indra.ejercicios.ContadorPalabras;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class DemoTests {

	@Test
	void test() {
		ContadorPalabras contador = new ContadorPalabras("la casa de la esquina");
		assertEquals(2, contador.getOcurrencias("la"));
	}
	
	@Test
	void testFilter() {
		List<String> lista = Arrays.asList("flor", "arboles", "caracoles", "sol");
		List<String> listaFiltrada = lista.stream()
										.filter(n -> n.length() < 5)
										.toList();
		assertEquals(2, listaFiltrada.size());
	}
	
	@Test
	void testMap() {
		List<String> lista = Arrays.asList("flor", "arboles", "caracoles", "sol");
		List<String> nuevaLista = lista.stream()
										.map(n -> n.toUpperCase())
										.toList();
		nuevaLista.forEach(n -> System.out.println(n) );
		assertEquals("FLOR", nuevaLista.get(0));
	}
	
	@Test
	void testSum() {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		int sumatoria = numeros.stream().reduce(0, (acum, actual) -> acum + actual);
		assertEquals(15, sumatoria);
	}
	
	@Test
	void testContiene() {
		List<String> lista = Arrays.asList("hola", "chao", "adios", "Esteban");
		boolean contiene = lista.stream().anyMatch(n -> n.equals("Esteban"));
		assertEquals(true, contiene);
	}
	
	@Test 
	@Order(1)
	void testArchivoNombre() throws IOException {
		File archivo = new File("nombres.txt");
		archivo.createNewFile();
		FileWriter writer = new FileWriter("nombres.txt");
		writer.write("Juan\n");
		writer.write("Pepe\n");
		writer.write("Fernando\n");
		writer.write("Carlos\n");
		writer.write("Elena\n");
		writer.write("Elena2\n");
		writer.write("Elena3\n");
		writer.close();
		assertEquals(true, archivo.exists());
	}
	
	@Test
	@Order(2)
	void testReadFile() throws IOException {
		try (Stream<String> lineas = Files.lines(Path.of("nombres.txt"))) {
			long n = lineas.filter(p -> p.length() > 4).count();
			assertEquals(5,  n);
		}
	}

}
