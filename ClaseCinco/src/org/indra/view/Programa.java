package org.indra.view;

import org.indra.dto.RegistroUsuarioDTO;
import org.indra.model.Usuario;
import org.indra.persistence.IUsuarioRepositorio;
import org.indra.persistence.UsuarioRepositorioBD;
import org.indra.persistence.UsuarioRepositorioMock;
import org.indra.services.UsuarioService;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Binevenido a Indragram.");
		
//		UsuarioRepositorioMock repo = new UsuarioRepositorioMock();
//		UsuarioService usuarioService = new UsuarioService(repo);
//		
//		System.out.println("Voy a probar a registrar un usuario nuevo");
//		RegistroUsuarioDTO registro = new RegistroUsuarioDTO();
//		registro.setNombreDeseado("juan");
//		
//		try {
//			usuarioService.registrarUsuarioNuevo(registro);
//		} catch (Exception e) {
//			System.err.println("Esto no deberia pasar");
//		}
//		
//		System.out.println("Usuario registrado satisfactoriamente");
//		
//		//-----------------------------------------------------------
//		
//		System.out.println("\nVoy a probar a registrar un usuario duplicado");
//		RegistroUsuarioDTO duplicado = new RegistroUsuarioDTO();
//		duplicado.setNombreDeseado("juan");
//		
//		try {
//			usuarioService.registrarUsuarioNuevo(duplicado);
//		} catch (Exception e) {
//			System.out.println("Deberia dar un error de duplicado");
//			System.out.println(e.getMessage());
//		}
//		
//		//-------------------------------------------------------------
//		
//		System.out.println("\nVoy a probar a registar un usuario vacio");
//		RegistroUsuarioDTO vacio = new RegistroUsuarioDTO();
//		duplicado.setNombreDeseado("");
//		
//		try {
//			usuarioService.registrarUsuarioNuevo(vacio);
//		} catch (Exception e) {
//			System.out.println("Deberia dar un error de usuario vacio");
//			System.out.println(e.getMessage());
//		}
		
		IUsuarioRepositorio repo = new UsuarioRepositorioBD();
//		repo.buscarTodos().forEach(n -> System.out.println(n));
		
//		Usuario nuevo = new Usuario("Pedro");
//		repo.add(nuevo);     
		Usuario usr = repo.buscarPorNombre("Carlos");
		System.out.println(usr.getNombre());
	}
}
