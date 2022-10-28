package org.alumnos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "grado")
public class Grado {
	
	@Id
	private int idgrado;
	private String descripciongrado;

}
