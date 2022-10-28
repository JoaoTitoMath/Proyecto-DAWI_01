package org.alumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortalAlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalAlumnosApplication.class, args);
		System.out.println("Terminó de cargar la aplicación...");
	}

}
