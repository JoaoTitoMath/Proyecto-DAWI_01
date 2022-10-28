package org.alumnos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "carrera")
public class Carrera {
	
	@Id
	private int idcarr;
	private String descripcion;
}
