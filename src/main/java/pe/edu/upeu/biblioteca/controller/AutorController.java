package pe.edu.upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.biblioteca.modelo.service.AutorService;

@RestController
public class AutorController {
	@Autowired
	private AutorService autorservice;
    @GetMapping("/autores")
    public List<Map<String, Object>> listar(){
    	return autorservice.readAll();
    }
}
