package pe.edu.upeu.biblioteca.modelo.entity;

public class Editorial {
	private int ideditorial;
	private String editorial;
	public Editorial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Editorial(int ideditorial, String editorial) {
		super();
		this.ideditorial = ideditorial;
		this.editorial = editorial;
	}
	public int getIdeditorial() {
		return ideditorial;
	}
	public void setIdeditorial(int ideditorial) {
		this.ideditorial = ideditorial;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
}
