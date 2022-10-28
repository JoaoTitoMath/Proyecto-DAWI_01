package org.alumnos.repository;

import org.alumnos.model.Grado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGradoRepository 
       extends JpaRepository<Grado, Integer> {

}
