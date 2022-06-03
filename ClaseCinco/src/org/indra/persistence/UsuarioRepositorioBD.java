package org.indra.persistence;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import org.indra.model.Usuario;

public class UsuarioRepositorioBD implements IUsuarioRepositorio {

	@Override
	public Usuario buscarPorNombre(String nombre) {
		Connection conn = null;
		Usuario usr = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/indragram.db");
			Statement sql = conn.createStatement();
			ResultSet qry = sql.executeQuery(String.format("SELECT * FROM Usuario WHERE nombre = '%s';", nombre));
			if (qry.next()) {
				usr = new Usuario(qry.getString("Nombre"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		return usr;
	}

	@Override
	public List<Usuario> buscarTodos() {
		Connection conn = null;
		List<Usuario> result = new ArrayList<Usuario>();
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/indragram.db");
			Statement sql = conn.createStatement();
			ResultSet qry = sql.executeQuery("SELECT * FROM Usuario;");
			while (qry.next()) {
				Usuario urs = new Usuario(qry.getString("Nombre"));
				result.add(urs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		return result;
	}
	
	@Override
	public void add(Usuario usuario) {
		Connection conn = null;
		if (usuario != null) {
			try {
				conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/indragram.db");
				Statement sql = conn.createStatement();
				sql.executeUpdate(String.format("insert into usuario (nombre) values ('%s');", usuario.getNombre()));
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}	
	
}
