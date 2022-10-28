package org.alumnos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "profesor")
public class Profesor {
	
	@Id
	private int idprofesor;
	private String nompro;
	private String apepro;
	private String telpro;
	
	@ManyToOne
	@JoinColumn(name = "idasi", insertable = false, updatable = false)
	private Asignatura asignatura;
	private int idasi;
	
}
