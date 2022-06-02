package org.indra.proyectoCarlosMoreno.repositories;

import org.indra.proyectoCarlosMoreno.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}
