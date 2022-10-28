package org.alumnos.repository;

import org.alumnos.model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarreraRepository 
       extends JpaRepository<Carrera, Integer> {

}
