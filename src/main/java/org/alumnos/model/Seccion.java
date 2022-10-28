package org.alumnos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "seccion")
public class Seccion {
	
	@Id
	private int idseccion;
	private String descripcionseccion;

}
