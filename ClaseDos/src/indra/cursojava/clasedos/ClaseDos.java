package indra.cursojava.clasedos;

import java.util.*;

import indra.utils.Consola;
import indra.utils.MetodosNumericos;


public class ClaseDos {
	

	


	
	public static void main(String[] args) {
//		System.out.println("Bienvenidos a la segunda clase!");
//		Scanner teclado = new Scanner(System.in);
//		
//		String nombre = Consola.leerEntrada("Ingrese su nombre");	
//		String edad = Consola.leerEntrada("Ingrese su edad");
//		
//		if (esNumero(edad)) {
//			System.out.println(String.format("Bienvenido %s de %s", nombre, edad));
//		} else {
//			System.out.println(String.format("Bienvenido %s. No entendí tu edad.", nombre));
//		}
//		
//		teclado.close();
		
		
		boolean encontrado = false;
		int numeroOportunidades = 6;
		
		int numAzar = MetodosNumericos.valorAlAzar(1, 100);
		
		while (!encontrado && numeroOportunidades > 0) {
			int num = Consola.leerNumero("Dame un numero");
			if (num > numAzar) {
				System.out.println("El numero debe ser menor");
				numeroOportunidades--;
			} else if (num < numAzar) {
				System.out.println("El numero debe ser mayor");
				numeroOportunidades--;
			} else {
				System.out.println("Felicidades, has acertado");
				encontrado = true;
			}
			if (!encontrado && numeroOportunidades == 0) {
				System.out.println("Oh no, has perdido");
			}
		}
		
	}
	
	

}
