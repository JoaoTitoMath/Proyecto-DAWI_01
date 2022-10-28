package org.alumnos.repository;

import java.util.List;

import org.alumnos.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IAsignaturaRepository 
       extends JpaRepository<Asignatura, Integer> {
	
	   List<Asignatura>findByIdasi(int idasi);	
	
		

}
