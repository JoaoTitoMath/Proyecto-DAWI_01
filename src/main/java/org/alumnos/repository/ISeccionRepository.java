package org.alumnos.repository;

import org.alumnos.model.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISeccionRepository 
       extends JpaRepository<Seccion, Integer>{

}
