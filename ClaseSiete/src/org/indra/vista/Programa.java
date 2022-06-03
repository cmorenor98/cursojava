package org.indra.vista;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.swing.*;

import org.indra.models.*;

public class Programa {

	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		List<String> lista = Arrays.asList("Calculadora", "Espacio", "Nota", "Garabato", "Cielo");
//		Consumer<String> metodoLambda = (n) -> {System.out.println("--" + n + "--"); };
//		lista.forEach(metodoLambda);
		
//		JButton boton = new JButton("Hazme Click");
//		boton.setBounds(1, 1, 300, 50);
//		boton.addActionListener(  (e) -> {
//			JOptionPane.showConfirmDialog(boton, "Hiciste Click a un lambda"); 
//		});
//		
//		JFrame f = new JFrame();
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setLayout(null);
//		f.setSize(640, 480);
//		f.setVisible(true);
		
//		Animal garfield = new Gato();
//		garfield.mostrar((a) -> {System.out.println("Soy un animal que hace " + a.getSonido());});
		
//		IDibujador porConsola = (Animal a) -> {System.out.println("Soy un animal que hace " + a.getSonido());};
//		Animal pluto = new Perro();
//		Animal garfield = new Gato();
//		pluto.mostrar(porConsola);
//		garfield.mostrar(porConsola);
		
//		List<String> lista = Arrays.asList("a", "b", "c", "d", "e");
//		lista.forEach(System.out::println); //lista.forEach(a -> System.out.println(a));
		
//		// Listar los metodos por reflection
//		ArrayList<String> lista = new ArrayList<String>();
//		Class claseArrayList = lista.getClass();
//		Stream<Method> metodos = Arrays.stream(claseArrayList.getMethods());
//		metodos.forEach( m -> System.out.println(m));
		
//		String string = new String("hola que tal");
//		Class claseString = string.getClass();
//		Stream<Method>  metodosString = Arrays.stream(claseString.getMethods());
//		Method metodoLength = metodosString.filter(m -> m.getName().equals("length")).findFirst().get();
//		int size = (Integer)metodoLength.invoke(string);
//		System.out.println(size);
		
//		String str = new String("Hola que tal");
//		Class claseString = str.getClass();
//		Stream<Method> metodos = Arrays.stream(claseString.getMethods());
//		Method methodContains = metodos.filter( m -> m.getName().equals("contains")).findFirst().get();
//		boolean contiene = (Boolean) methodContains.invoke(str, "que");
//		System.out.println(contiene ? "Si lo contiene" : "No lo contiene");
		
	}
}
