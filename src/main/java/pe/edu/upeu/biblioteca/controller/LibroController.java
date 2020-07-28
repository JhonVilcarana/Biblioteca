package pe.edu.upeu.biblioteca.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.biblioteca.modelo.entity.Libro;
import pe.edu.upeu.biblioteca.modelo.service.LibroService;

@RestController
public class LibroController {
	@Autowired
	private LibroService libroservice;
	@GetMapping("/libro")
	public List<Libro> mensaje(){
		return libroservice.readAll();
	}

}
