package org.indra.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.indra.mockitodemo.models.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */


@RunWith(BlockJUnit4ClassRunner.class)
public class AppTest 
{

	@Test
	public void testWhenThenReturn() {
		List<String> lista = (List<String>)mock(List.class);
		// La lista tiene que tener 20 elementos
		
		when(lista.size()).thenReturn(20);
		
		// Test
		int size = lista.size();
		assertEquals(20, size);
	}
	
	
	@Test
	public void testVerifyMethodInvication() {
		// Configuro el mock
		List<String> lista = (List<String>)mock(List.class);
		lista.add("Hola");
		System.out.println(lista.size()); // Me va a dar cero por mas que agregue elementos
		
		// Verifico que se haya llamado al add con el parametro "Hola"
		Mockito.verify(lista).add("Hola");
	}
	
	@Test
	public void testHombreQueCalcula() {
		ICalculadora calculadora = mock(ICalculadora.class);
		
	}
	
}
