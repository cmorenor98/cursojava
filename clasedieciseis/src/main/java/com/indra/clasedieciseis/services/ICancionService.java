package com.indra.clasedieciseis.services;

import java.util.*;

import com.indra.clasedieciseis.models.*;

public interface ICancionService {

	public List<Cancion> getAll();
	
	public Cancion getById(int id) throws Exception;
	
	public Cancion add(Cancion cancion) throws Exception;
	
	public void delete(int id) throws Exception;
	
}
