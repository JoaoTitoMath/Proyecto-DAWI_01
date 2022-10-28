package org.alumnos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "alumnos")
public class Alumnos {
	
	@Id
	private int idalumno;
	
	private String nomalu;
	
	private String apealu;
	
	private String telalu;
	
	@ManyToOne
	@JoinColumn(name = "idseccion", insertable = false, updatable = false)
	private Seccion seccion;
	private int idseccion;
	
	@ManyToOne
	@JoinColumn(name = "idgrado", insertable = false, updatable = false)
	private Grado grado;
	private int idgrado;

}
