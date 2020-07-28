package pe.edu.upeu.biblioteca.modelo.dao;

import java.util.List;


import pe.edu.upeu.biblioteca.modelo.entity.Libro;

public interface LibroDao {
	List<Libro> readAll();

}
