package org.alumnos.repository;

import org.alumnos.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlumnosRepository 
	   extends JpaRepository<Alumnos, Integer> {

}
