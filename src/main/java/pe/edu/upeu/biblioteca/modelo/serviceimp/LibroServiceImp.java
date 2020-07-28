package pe.edu.upeu.biblioteca.modelo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.biblioteca.modelo.dao.LibroDao;
import pe.edu.upeu.biblioteca.modelo.entity.Libro;
import pe.edu.upeu.biblioteca.modelo.service.LibroService;

@Service
public class LibroServiceImp implements LibroService{
	@Autowired
	private LibroDao librodao;
	@Override
	public List<Libro> readAll(){
		return librodao.readAll();
	}

}
