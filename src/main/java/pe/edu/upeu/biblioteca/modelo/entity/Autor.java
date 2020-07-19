package pe.edu.upeu.biblioteca.modelo.entity;

public class Autor {
	private int idautor;
	private String autor;

	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autor(int idautor, String autor) {
		super();
		this.idautor = idautor;
		this.autor = autor;
	}

	public int getIdautor() {
		return idautor;
	}

	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
