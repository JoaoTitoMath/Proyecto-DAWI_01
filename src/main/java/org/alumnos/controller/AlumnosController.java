package org.alumnos.controller;

import org.alumnos.model.Alumnos;
import org.alumnos.repository.IAlumnosRepository;
import org.alumnos.repository.IGradoRepository;
import org.alumnos.repository.ISeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlumnosController {
	
	@Autowired
	private IAlumnosRepository repoa;
	
	@Autowired
	private ISeccionRepository repos;
	
	@Autowired
	private IGradoRepository repog;
	
	@GetMapping("/alumnos/cargar")
	public String abrirPagAlumnos(Model model) {
		model.addAttribute("alumnos", new Alumnos());
		model.addAttribute("lstSeccion", repos.findAll());
		model.addAttribute("lstGrados", repog.findAll());
		System.out.println(repoa.findAll());
		return "portal_alumnos";
	}
	
	
	@GetMapping("/alumnos/listar")
	public String listadoAlumnos(Model model) {
		model.addAttribute("lstAlumnos", repoa.findAll());
		return "listado";
	}

	
	@PostMapping("/alumnos/registar")
	public String regPagAlumnos(@ModelAttribute Alumnos alumnos, Model model) {
		System.out.println(alumnos);
		
		try {
			
			repoa.save(alumnos);
			model.addAttribute("mensaje","Alumno registrado");
			model.addAttribute("clasemensaje", "alert alert-success");	
			
		}
		catch(Exception e) {
			
			model.addAttribute("mensaje","Error al intentar registar al alumno");
			model.addAttribute("clasemensaje", "alert alert-danger");		
		}
		
		model.addAttribute("lstSeccion", repos.findAll());
		model.addAttribute("lstGrados", repog.findAll());
		return "portal_alumnos";
	}
	
	
	@PostMapping("/alumnos/editar")
	public String cargarAlumnos(@ModelAttribute Alumnos a, Model model) {
		model.addAttribute("alumnos", repoa.findById(a.getIdalumno()));
		
		model.addAttribute("lstSeccion", repos.findAll());
		model.addAttribute("lstGrados", repog.findAll());
		return "portal_alumnos";
	}
}
