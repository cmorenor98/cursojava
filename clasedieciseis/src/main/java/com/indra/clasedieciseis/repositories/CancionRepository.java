package com.indra.clasedieciseis.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.indra.clasedieciseis.models.*;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, Integer> {

	public List<Cancion> findAll();
	
}
