package org.alumnos.repository;

import org.alumnos.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorRepository 
       extends JpaRepository<Profesor, Integer>{

}
