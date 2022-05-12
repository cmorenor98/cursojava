package org.indra.view;

import org.indra.model.*;

public class Program {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la clase 4");
		System.out.println("Ejemplo del composite y polimorfismo");
		
		// Mis agregados
		FileSystemWatcher observer = new FileSystemWatcher();
		EntidadSistemaFicheros.RegistrarQuienMeMira(observer);
		
//		EntidadSistemaFicheros carpetaRaiz = new Carpeta("root");
//		System.out.println("Creando carpeta root");
		Carpeta carpetaRaiz = new Carpeta("root");
		
//		System.out.println("Creando carpeta temp");
		Carpeta temp = new Carpeta("temp");
		
//		System.out.println("Creando carpeta trash");
		Carpeta trash = new Carpeta("trash");
		
//		System.out.println("Crando el archivo autoexec.bat con 100 bytes");
		Archivo autoexec = new Archivo("autoexec.bat", 100);
		
//		System.out.println("Creando archivo imagen.jpg vacio");
		Archivo imagen = new Archivo("imagen.jpg");
		
//		System.out.println("Cambiando el tañado del archivo imagen.jpg a 350 bytes");
		imagen.setTamaño(350);
		
//		System.out.println("Agregando carpeta temp a carpeta raiz");
		carpetaRaiz.Add(temp);
		
//		System.out.println("Agregando autoexec.bat a carpeta temp");
		temp.Add(autoexec);
		
//		System.out.println("Agregando carpeta trash a carpeta temp");
		temp.Add(trash);
		
//		System.out.println("Agregando imagen.jpg a carpeta trash");
		trash.Add(imagen);
		
		/*
		 root
		   /temp
		      autoexec.bat
		      /trash
		         imagen.jpg
		 */
		EntidadSistemaFicheros root = carpetaRaiz;
		System.out.println("El tamaño total es " + root.calcularTamaño());
		
		
//		Carpeta carpeta1 = new Carpeta("carpeta1");
//		Archivo imagen1 = new Archivo("imagen1.jpg", 1);
//		carpeta1.Add(imagen1);
//		
//		Carpeta carpeta2 = new Carpeta("carpeta2");
//		Archivo imagen2 = new Archivo("imagen2.jpg", 1);
//		carpeta2.Add(imagen2);
//		
//		Carpeta raiz = new Carpeta("root");
//		raiz.Add(carpeta1);
//		raiz.Add(carpeta2);
//		carpeta1.Add(carpeta2);
//		carpeta2.Add(carpeta1);
//		
//		try {
//			System.out.println("El tamaño es " + raiz.calcularTamaño());
//		} catch (StackOverflowError e) {
//			System.out.println("Ha habido un problema. Disculpe las molestias.");
//		}

	}
	
}
