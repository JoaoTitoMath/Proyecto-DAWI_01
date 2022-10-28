package org.alumnos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "asignatura")
public class Asignatura {
	
	@Id
	private int idasi;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idcarr", insertable = false, updatable = false)
	private Carrera carrera;
	private int idcarr;
	

}
